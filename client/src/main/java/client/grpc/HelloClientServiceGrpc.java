package client.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: helloClient.proto")
public class HelloClientServiceGrpc {

  private HelloClientServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloClientService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<client.grpc.HelloClientServiceData.HelloRequest,
      client.grpc.HelloClientServiceData.HelloResponse> METHOD_HELLO_CLIENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "HelloClientService", "helloClient"),
          io.grpc.protobuf.ProtoUtils.marshaller(client.grpc.HelloClientServiceData.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(client.grpc.HelloClientServiceData.HelloResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloClientServiceStub newStub(io.grpc.Channel channel) {
    return new HelloClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static HelloClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloClientServiceFutureStub(channel);
  }

  /**
   */
  public static interface HelloClientService {

    /**
     */
    public void helloClient(client.grpc.HelloClientServiceData.HelloRequest request,
        io.grpc.stub.StreamObserver<client.grpc.HelloClientServiceData.HelloResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractHelloClientService implements HelloClientService, io.grpc.BindableService {

    @java.lang.Override
    public void helloClient(client.grpc.HelloClientServiceData.HelloRequest request,
        io.grpc.stub.StreamObserver<client.grpc.HelloClientServiceData.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO_CLIENT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return HelloClientServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface HelloClientServiceBlockingClient {

    /**
     */
    public client.grpc.HelloClientServiceData.HelloResponse helloClient(client.grpc.HelloClientServiceData.HelloRequest request);
  }

  /**
   */
  public static interface HelloClientServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<client.grpc.HelloClientServiceData.HelloResponse> helloClient(
        client.grpc.HelloClientServiceData.HelloRequest request);
  }

  public static class HelloClientServiceStub extends io.grpc.stub.AbstractStub<HelloClientServiceStub>
      implements HelloClientService {
    private HelloClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloClientServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void helloClient(client.grpc.HelloClientServiceData.HelloRequest request,
        io.grpc.stub.StreamObserver<client.grpc.HelloClientServiceData.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HELLO_CLIENT, getCallOptions()), request, responseObserver);
    }
  }

  public static class HelloClientServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloClientServiceBlockingStub>
      implements HelloClientServiceBlockingClient {
    private HelloClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloClientServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public client.grpc.HelloClientServiceData.HelloResponse helloClient(client.grpc.HelloClientServiceData.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HELLO_CLIENT, getCallOptions(), request);
    }
  }

  public static class HelloClientServiceFutureStub extends io.grpc.stub.AbstractStub<HelloClientServiceFutureStub>
      implements HelloClientServiceFutureClient {
    private HelloClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloClientServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<client.grpc.HelloClientServiceData.HelloResponse> helloClient(
        client.grpc.HelloClientServiceData.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HELLO_CLIENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_CLIENT = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloClientService serviceImpl;
    private final int methodId;

    public MethodHandlers(HelloClientService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_CLIENT:
          serviceImpl.helloClient((client.grpc.HelloClientServiceData.HelloRequest) request,
              (io.grpc.stub.StreamObserver<client.grpc.HelloClientServiceData.HelloResponse>) responseObserver);
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

  public static io.grpc.ServerServiceDefinition bindService(
      final HelloClientService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_HELLO_CLIENT,
          asyncUnaryCall(
            new MethodHandlers<
              client.grpc.HelloClientServiceData.HelloRequest,
              client.grpc.HelloClientServiceData.HelloResponse>(
                serviceImpl, METHODID_HELLO_CLIENT)))
        .build();
  }
}
