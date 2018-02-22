package service.impl;


import client.grpc.HelloClientServiceData.HelloRequest;
import client.grpc.HelloClientServiceData.HelloResponse;
import client.grpc.HelloClientServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class HelloClientImpl extends HelloClientServiceGrpc.AbstractHelloClientService {

    @Override
    public void helloClient(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        responseObserver.onNext(helloClient(request));
        responseObserver.onCompleted();
    }

    public HelloResponse helloClient(HelloRequest request) {
        HelloResponse response = HelloResponse.newBuilder().setResult(request.getName()+"rrr").build();

        return response;

    }

}
