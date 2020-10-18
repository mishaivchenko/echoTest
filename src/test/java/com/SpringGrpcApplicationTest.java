package com;

import com.testproject.aggregator.Bootstrap;
import com.testproject.domain.ResponseDTO;
import com.testproject.grpc.client.ConcurrentEchoTestClient;
import com.testproject.grpc.client.EchoTestClient;
import com.testproject.grpc.client.EchoTestClientAsync;
import com.testproject.grpc.echo.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Bootstrap.class)
public class SpringGrpcApplicationTest {

    List<String> addressList;

    @BeforeEach
    public void init(){
        addressList = new ArrayList<>();

        addressList.add("https://www.google.com/");
        addressList.add("https://www.gitlab.com/");
        addressList.add("https://www.github.com/");
        addressList.add("https://aws.amazon.com/");
        addressList.add("https://www.amazon.com/");
        addressList.add("https://www.apple.com/");
        addressList.add("https://www.microsoft.com/");
        addressList.add("https://blog.maddevs.io/");
        addressList.add("https://grpc.io/");
        addressList.add("https://ru.wikipedia.org/");
        addressList.add("https://habr.com/ru/");
        addressList.add("http://dojki.com/"); //Whooooopps  how did it get here?????
        addressList.add("https://stackoverflow.com/");
        addressList.add("https://www.youtube.com/");
        addressList.add("https://allo.ua/ua/televizory-a-mediapleery/");
        addressList.add("https://javarush.ru/");
        addressList.add("https://junit.org//");
        addressList.add("https://shneider-host.ru/");
        addressList.add("https://spring.io");
        addressList.add("https://www.oracle.com/");
    }

    @Autowired
    private EchoTestClient echoTestClient;

    @Autowired
    private EchoTestClientAsync echoTestClientAsync;

    @Autowired
    private ConcurrentEchoTestClient concurrentEchoTestClient;


   @Test
    public void testEchoWithCorrectHostname(){
       //Given
        String url = "https://www.google.com/";
        //When
        ResponseDTO dto = echoTestClient.echo(url);
        //Then
        assertEquals("200",dto.getResponseCode());

    }
    @Test
    public void testEchoBadRequestReturnedResultMustBeEqualsMinusOne(){
        //Given
        String wrongHostName = "https://www.YaMiha.com/";
        //When
        ResponseDTO dto = echoTestClient.echo(wrongHostName);
        //Then
        assertEquals("-1",dto.getResponseTime());
    }

    @Test
    public void EchoAsyncTestWithCorrectHostname() throws InterruptedException {
       //When
       ResponseDTO dto = echoTestClientAsync.echoAsync(addressList).stream()
               .findFirst()
               .get();
        //Then
        assertEquals("200",dto.getResponseCode());
    }

    @Test
    public void testEchoAsyncBadRequestReturnedResultMustBeEqualsMinusOne() throws InterruptedException {
       //Given
        List<String> addressesWithBadHost = new ArrayList<>();
        String wrongHostName = "https://www.YaMiha.com/";
        addressesWithBadHost.add(wrongHostName);
        ResponseDTO dto = echoTestClientAsync.echoAsync(addressesWithBadHost).stream()
                .findFirst()
                .orElse(null);
        //Then
        assertEquals("-1",dto.getResponseTime());

    }

    @Test
    public void concurrentEchoTestBlockStubSingleMessageGoodResponseCheck() throws Exception {
       //Given
       List<String> hostList = new ArrayList<>();
       hostList.add("https://www.google.com/");
       //When
       ResponseDTO dto = concurrentEchoTestClient.echoWithThreads(hostList).stream()
               .findFirst()
               .get();
       //Then
       assertEquals("200",dto.getResponseCode());
    }

    @Test
    public void testBlockStubConcurrentHostnameMustBeLinkedToCorrectResponseDTO() throws Exception {
       //Given
       String address404 = "https://allo.ua/ua/televizory-a-mediapleery/";
       //When
        List<ResponseDTO> responseDTOList = concurrentEchoTestClient.echoWithThreads(addressList);
        //Then
        ResponseDTO dto = responseDTOList.stream()
                .filter(i -> i.getHostname().equals(address404))
                .findFirst()
                .get();

        assertEquals("404",dto.getResponseCode());
    }

    @Test
    public void testCallAsyncStubForFourTimesHostnameMustBeLinkedToCorrectResponseDTO() throws Exception {
       //Given
       String address404 = "https://allo.ua/ua/televizory-a-mediapleery/";
        List<List<ResponseDTO>> listListResponseDto = new ArrayList<>();
        Callable<List<ResponseDTO>> callable = () -> echoTestClientAsync.echoAsync(addressList);
        //When
        for(int i = 0; i<4; i++){
            List<ResponseDTO> responseDTOList = callable.call();
            listListResponseDto.add(responseDTOList);
        }
        //Then
        ResponseDTO dto = listListResponseDto.get(1).stream()
                .filter(i -> i.getHostname().equals(address404))
                .findFirst()
                .get();

        assertEquals("404",dto.getResponseCode());
    }






}
