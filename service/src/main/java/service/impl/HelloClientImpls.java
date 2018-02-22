package service.impl;

import client.grpc.HelloClientServiceData;
import client.grpc.HelloClientServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

//@Service
//public class HelloClientImpls implements HelloClientServiceGrpc.HelloClientService {
//
//    public void helloClient(HelloClientServiceData.HelloRequest request, StreamObserver<HelloClientServiceData.HelloResponse> responseObserver) {
//        responseObserver.onNext(helloClient(request));
//        responseObserver.onCompleted();
//    }
//
//    public HelloClientServiceData.HelloResponse helloClient(HelloClientServiceData.HelloRequest request) {
//
//        HelloClientServiceData.HelloResponse response = HelloClientServiceData.HelloResponse.newBuilder().build();
//
//        return response;
//
//    }
//
//}
