package com.testproject.grpc.echo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: HelloWorld.proto")
public final class EchoTestServiceGrpc {

  private EchoTestServiceGrpc() {}

  public static final String SERVICE_NAME = "com.testproject.grpc.echo.EchoTestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person,
      com.testproject.grpc.echo.Greeting> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = com.testproject.grpc.echo.Person.class,
      responseType = com.testproject.grpc.echo.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person,
      com.testproject.grpc.echo.Greeting> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person, com.testproject.grpc.echo.Greeting> getSayHelloMethod;
    if ((getSayHelloMethod = EchoTestServiceGrpc.getSayHelloMethod) == null) {
      synchronized (EchoTestServiceGrpc.class) {
        if ((getSayHelloMethod = EchoTestServiceGrpc.getSayHelloMethod) == null) {
          EchoTestServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.testproject.grpc.echo.Person, com.testproject.grpc.echo.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.testproject.grpc.echo.EchoTestService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new EchoTestServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.testproject.grpc.echo.Persons,
      com.testproject.grpc.echo.Greeting> getSayHelloToAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloToAll",
      requestType = com.testproject.grpc.echo.Persons.class,
      responseType = com.testproject.grpc.echo.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.testproject.grpc.echo.Persons,
      com.testproject.grpc.echo.Greeting> getSayHelloToAllMethod() {
    io.grpc.MethodDescriptor<com.testproject.grpc.echo.Persons, com.testproject.grpc.echo.Greeting> getSayHelloToAllMethod;
    if ((getSayHelloToAllMethod = EchoTestServiceGrpc.getSayHelloToAllMethod) == null) {
      synchronized (EchoTestServiceGrpc.class) {
        if ((getSayHelloToAllMethod = EchoTestServiceGrpc.getSayHelloToAllMethod) == null) {
          EchoTestServiceGrpc.getSayHelloToAllMethod = getSayHelloToAllMethod = 
              io.grpc.MethodDescriptor.<com.testproject.grpc.echo.Persons, com.testproject.grpc.echo.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.testproject.grpc.echo.EchoTestService", "sayHelloToAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Persons.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new EchoTestServiceMethodDescriptorSupplier("sayHelloToAll"))
                  .build();
          }
        }
     }
     return getSayHelloToAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address,
      com.testproject.grpc.echo.Response> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "echo",
      requestType = com.testproject.grpc.echo.Address.class,
      responseType = com.testproject.grpc.echo.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address,
      com.testproject.grpc.echo.Response> getEchoMethod() {
    io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address, com.testproject.grpc.echo.Response> getEchoMethod;
    if ((getEchoMethod = EchoTestServiceGrpc.getEchoMethod) == null) {
      synchronized (EchoTestServiceGrpc.class) {
        if ((getEchoMethod = EchoTestServiceGrpc.getEchoMethod) == null) {
          EchoTestServiceGrpc.getEchoMethod = getEchoMethod = 
              io.grpc.MethodDescriptor.<com.testproject.grpc.echo.Address, com.testproject.grpc.echo.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.testproject.grpc.echo.EchoTestService", "echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EchoTestServiceMethodDescriptorSupplier("echo"))
                  .build();
          }
        }
     }
     return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoTestServiceStub newStub(io.grpc.Channel channel) {
    return new EchoTestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoTestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EchoTestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoTestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EchoTestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EchoTestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.testproject.grpc.echo.Person request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloToAll(com.testproject.grpc.echo.Persons request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloToAllMethod(), responseObserver);
    }

    /**
     */
    public void echo(com.testproject.grpc.echo.Address request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.testproject.grpc.echo.Person,
                com.testproject.grpc.echo.Greeting>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloToAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.testproject.grpc.echo.Persons,
                com.testproject.grpc.echo.Greeting>(
                  this, METHODID_SAY_HELLO_TO_ALL)))
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.testproject.grpc.echo.Address,
                com.testproject.grpc.echo.Response>(
                  this, METHODID_ECHO)))
          .build();
    }
  }

  /**
   */
  public static final class EchoTestServiceStub extends io.grpc.stub.AbstractStub<EchoTestServiceStub> {
    private EchoTestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.testproject.grpc.echo.Person request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloToAll(com.testproject.grpc.echo.Persons request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloToAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void echo(com.testproject.grpc.echo.Address request,
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EchoTestServiceBlockingStub extends io.grpc.stub.AbstractStub<EchoTestServiceBlockingStub> {
    private EchoTestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.testproject.grpc.echo.Greeting sayHello(com.testproject.grpc.echo.Person request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.testproject.grpc.echo.Greeting sayHelloToAll(com.testproject.grpc.echo.Persons request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloToAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.testproject.grpc.echo.Response echo(com.testproject.grpc.echo.Address request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EchoTestServiceFutureStub extends io.grpc.stub.AbstractStub<EchoTestServiceFutureStub> {
    private EchoTestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.testproject.grpc.echo.Greeting> sayHello(
        com.testproject.grpc.echo.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.testproject.grpc.echo.Greeting> sayHelloToAll(
        com.testproject.grpc.echo.Persons request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloToAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.testproject.grpc.echo.Response> echo(
        com.testproject.grpc.echo.Address request) {
      return futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_TO_ALL = 1;
  private static final int METHODID_ECHO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoTestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoTestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.testproject.grpc.echo.Person) request,
              (io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting>) responseObserver);
          break;
        case METHODID_SAY_HELLO_TO_ALL:
          serviceImpl.sayHelloToAll((com.testproject.grpc.echo.Persons) request,
              (io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting>) responseObserver);
          break;
        case METHODID_ECHO:
          serviceImpl.echo((com.testproject.grpc.echo.Address) request,
              (io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EchoTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoTestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.testproject.grpc.echo.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EchoTestService");
    }
  }

  private static final class EchoTestServiceFileDescriptorSupplier
      extends EchoTestServiceBaseDescriptorSupplier {
    EchoTestServiceFileDescriptorSupplier() {}
  }

  private static final class EchoTestServiceMethodDescriptorSupplier
      extends EchoTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoTestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EchoTestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoTestServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloToAllMethod())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
