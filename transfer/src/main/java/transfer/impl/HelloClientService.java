package transfer.impl;

import client.grpc.HelloClientServiceData;
import client.grpc.HelloClientServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class HelloClientService {

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 50051).usePlaintext(true).build();

    public void helloClient() {

        HelloClientServiceData.HelloRequest request = HelloClientServiceData.HelloRequest.newBuilder().setName("zzz").build();

        try {
            HelloClientServiceGrpc.HelloClientServiceFutureClient stub = HelloClientServiceGrpc.newFutureStub(channel);

            HelloClientServiceData.HelloResponse re = stub.helloClient(request).get();

            System.out.println(re.toString());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
