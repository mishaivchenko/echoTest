package com;

import com.testproject.aggregator.Bootstrap;
import com.testproject.domain.ResponseDTO;
import com.testproject.grpc.client.ConcurrentEchoTestClient;
import com.testproject.grpc.client.EchoTestClient;
import com.testproject.grpc.client.EchoTestClientAsync;
import com.testproject.grpc.echo.Address;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Bootstrap.class)
public class SpringGrpcApplicationTest {

    List<Address> addressList;

    @BeforeEach
    public void init(){
        addressList = new ArrayList<>();

        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.gitlab.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.github.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://www.google.com/").build());
        addressList.add(Address.newBuilder().setHostname("https://allo.ua/ua/televizory-a-mediapleery/").build());

    }

    @Autowired
    private EchoTestClient echoTestClient;

    @Autowired
    private EchoTestClientAsync echoTestClientAsync;

    @Autowired
    private ConcurrentEchoTestClient concurrentEchoTestClient;


   @Test
    public void testEcho(){
        String url = "https://www.google.com/";
        ResponseDTO dto = echoTestClient.echo(url);
        assertEquals("200",dto.getResponseCode());

    }

    public void testEchoBadRequest(){
        String wrongHostName = "https://www.YaMiha.com/";
        ResponseDTO dto = echoTestClient.echo(wrongHostName);
        assertEquals("-1",dto.getResponseTime());
    }

    @Test
    public void TestEchoAsync() throws InterruptedException {
       ResponseDTO dto = echoTestClientAsync.echoAsync(addressList).stream()
               .findFirst()
               .get();

        assertEquals("200",dto.getResponseCode());
    }

    @Test
    public void TestEchoAsyncBadRequest() throws InterruptedException {
        List<Address> addressesWithBadHost = new ArrayList<>();
        String wrongHostName = "https://www.YaMiha.com/";
        addressesWithBadHost.add(Address.newBuilder().setHostname(wrongHostName).build());

        ResponseDTO dto = echoTestClientAsync.echoAsync(addressesWithBadHost).stream()
                .findFirst()
                .orElse(null);

        assertEquals("-1",dto.getResponseTime());

    }

    @Test
    public void callTest() throws Exception {
       ResponseDTO dto = concurrentEchoTestClient.echoWithThreads("https://www.google.com/");
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

   // @Test




}
