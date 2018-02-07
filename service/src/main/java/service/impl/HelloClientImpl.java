package service.impl;


import client.grpc.HelloClientServiceData;
import client.grpc.HelloClientServiceData.HelloRequest;
import client.grpc.HelloClientServiceData.HelloResponse;
import client.grpc.HelloClientServiceGrpc;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import io.grpc.stub.StreamObserver;

public class HelloClientImpl extends HelloClientServiceGrpc.AbstractHelloClientService {

    @Override
    public void helloClient(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        responseObserver.onNext(helloClient(request));
        responseObserver.onCompleted();
    }

    public HelloResponse helloClient(HelloRequest request) {
        HelloResponse response = HelloResponse.newBuilder().build();

        return response;

    }

}
