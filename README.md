# Task:

Implement gRPC server that receives object with adress
of web resource(example: google.com) in the request and
returns the response code of the web resource and 
the time during which the resource responded.

Create tests using at least 20 web resources:

a) Single threaded blocking call;

b) Single threaded non blocking call;

c) Multithreaded blocking call;

d) Multi-thread non-blocking call;

Requirements(gRPC server, gRPC client, protobuf, http client, junit 5)

## What has been implemented:

1) EchoTestClient + EchoTestService:

EchoTestClient accepts the string "address" as input and sends it to the EchoTestService, which polls the address and receives a response code. Measurements are done using System.nanotime ().

The return value from the client is a ResponseDTO object containing hostname, status, response time

input argument - String
response - ResponseDTO
throw - IllegalArgumentException if input argument is an empty string

2) EchoTestClientAsync + EchoTestServiceAsyncImpl:

The client receives a list of strings as input, sends each one in turn to the server and waits for the server to make a callback. The return value is a list of ResponseDTO objects.

To send a single request - use a list of one item.

input argument - List<String>
response - List<ResponseDTO>
throw - NoSuchElementException if input argument is an empty list

3) ConcurrentEchoTestClient + EchoTestServiceImpl (blocking stub)
The client receives a list of strings as input, creates a new stream with a task for the server for each address from the incoming collection

input argument - List<String>
response - List<ResponseDTO>
throw - NoSuchElementException if input argument is an empty list

4) Multi-thread non-blocking call Simulation of the client's access to the server simultaneously from 4 threads was carried out. Which implements simulated multi-threaded server load.


## How to start

the application uses the spring boot framework.
Springboot-test is used to demonstrate how it works.
grpc services go up when tests are running and stop when finished.

## commands

mvn compile - to generate java classes from .proto file

mvn clean install - to generate java classes from .proto file

# Attention!

1. do not compile the project if the full path to the project contains Cyrillic characters
2. ManagedChannel uses address 6565 for communication. Make sure the given address is not busy or change it.