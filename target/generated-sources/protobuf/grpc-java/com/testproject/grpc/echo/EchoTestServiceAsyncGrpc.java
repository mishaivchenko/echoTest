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
public final class EchoTestServiceAsyncGrpc {

  private EchoTestServiceAsyncGrpc() {}

  public static final String SERVICE_NAME = "com.testproject.grpc.echo.EchoTestServiceAsync";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person,
      com.testproject.grpc.echo.Greeting> getSayHelloAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHelloAsync",
      requestType = com.testproject.grpc.echo.Person.class,
      responseType = com.testproject.grpc.echo.Greeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person,
      com.testproject.grpc.echo.Greeting> getSayHelloAsyncMethod() {
    io.grpc.MethodDescriptor<com.testproject.grpc.echo.Person, com.testproject.grpc.echo.Greeting> getSayHelloAsyncMethod;
    if ((getSayHelloAsyncMethod = EchoTestServiceAsyncGrpc.getSayHelloAsyncMethod) == null) {
      synchronized (EchoTestServiceAsyncGrpc.class) {
        if ((getSayHelloAsyncMethod = EchoTestServiceAsyncGrpc.getSayHelloAsyncMethod) == null) {
          EchoTestServiceAsyncGrpc.getSayHelloAsyncMethod = getSayHelloAsyncMethod = 
              io.grpc.MethodDescriptor.<com.testproject.grpc.echo.Person, com.testproject.grpc.echo.Greeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.testproject.grpc.echo.EchoTestServiceAsync", "sayHelloAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Greeting.getDefaultInstance()))
                  .setSchemaDescriptor(new EchoTestServiceAsyncMethodDescriptorSupplier("sayHelloAsync"))
                  .build();
          }
        }
     }
     return getSayHelloAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address,
      com.testproject.grpc.echo.Responses> getEchoAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "echoAsync",
      requestType = com.testproject.grpc.echo.Address.class,
      responseType = com.testproject.grpc.echo.Responses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address,
      com.testproject.grpc.echo.Responses> getEchoAsyncMethod() {
    io.grpc.MethodDescriptor<com.testproject.grpc.echo.Address, com.testproject.grpc.echo.Responses> getEchoAsyncMethod;
    if ((getEchoAsyncMethod = EchoTestServiceAsyncGrpc.getEchoAsyncMethod) == null) {
      synchronized (EchoTestServiceAsyncGrpc.class) {
        if ((getEchoAsyncMethod = EchoTestServiceAsyncGrpc.getEchoAsyncMethod) == null) {
          EchoTestServiceAsyncGrpc.getEchoAsyncMethod = getEchoAsyncMethod = 
              io.grpc.MethodDescriptor.<com.testproject.grpc.echo.Address, com.testproject.grpc.echo.Responses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.testproject.grpc.echo.EchoTestServiceAsync", "echoAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Address.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.testproject.grpc.echo.Responses.getDefaultInstance()))
                  .setSchemaDescriptor(new EchoTestServiceAsyncMethodDescriptorSupplier("echoAsync"))
                  .build();
          }
        }
     }
     return getEchoAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EchoTestServiceAsyncStub newStub(io.grpc.Channel channel) {
    return new EchoTestServiceAsyncStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EchoTestServiceAsyncBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EchoTestServiceAsyncBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EchoTestServiceAsyncFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EchoTestServiceAsyncFutureStub(channel);
  }

  /**
   */
  public static abstract class EchoTestServiceAsyncImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Person> sayHelloAsync(
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      return asyncUnimplementedStreamingCall(getSayHelloAsyncMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Address> echoAsync(
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Responses> responseObserver) {
      return asyncUnimplementedStreamingCall(getEchoAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloAsyncMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.testproject.grpc.echo.Person,
                com.testproject.grpc.echo.Greeting>(
                  this, METHODID_SAY_HELLO_ASYNC)))
          .addMethod(
            getEchoAsyncMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.testproject.grpc.echo.Address,
                com.testproject.grpc.echo.Responses>(
                  this, METHODID_ECHO_ASYNC)))
          .build();
    }
  }

  /**
   */
  public static final class EchoTestServiceAsyncStub extends io.grpc.stub.AbstractStub<EchoTestServiceAsyncStub> {
    private EchoTestServiceAsyncStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceAsyncStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceAsyncStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceAsyncStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Person> sayHelloAsync(
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSayHelloAsyncMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Address> echoAsync(
        io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Responses> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getEchoAsyncMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EchoTestServiceAsyncBlockingStub extends io.grpc.stub.AbstractStub<EchoTestServiceAsyncBlockingStub> {
    private EchoTestServiceAsyncBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceAsyncBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceAsyncBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceAsyncBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class EchoTestServiceAsyncFutureStub extends io.grpc.stub.AbstractStub<EchoTestServiceAsyncFutureStub> {
    private EchoTestServiceAsyncFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EchoTestServiceAsyncFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EchoTestServiceAsyncFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EchoTestServiceAsyncFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO_ASYNC = 0;
  private static final int METHODID_ECHO_ASYNC = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EchoTestServiceAsyncImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EchoTestServiceAsyncImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_ASYNC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHelloAsync(
              (io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Greeting>) responseObserver);
        case METHODID_ECHO_ASYNC:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echoAsync(
              (io.grpc.stub.StreamObserver<com.testproject.grpc.echo.Responses>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EchoTestServiceAsyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EchoTestServiceAsyncBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.testproject.grpc.echo.HelloWorld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EchoTestServiceAsync");
    }
  }

  private static final class EchoTestServiceAsyncFileDescriptorSupplier
      extends EchoTestServiceAsyncBaseDescriptorSupplier {
    EchoTestServiceAsyncFileDescriptorSupplier() {}
  }

  private static final class EchoTestServiceAsyncMethodDescriptorSupplier
      extends EchoTestServiceAsyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EchoTestServiceAsyncMethodDescriptorSupplier(String methodName) {
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
      synchronized (EchoTestServiceAsyncGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EchoTestServiceAsyncFileDescriptorSupplier())
              .addMethod(getSayHelloAsyncMethod())
              .addMethod(getEchoAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
