package service.run;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import service.impl.HelloClientImpl;

import java.io.IOException;

@Service
public class GrpcServiceRunner implements CommandLineRunner {

    public void run(String... strings) throws Exception {
        final GrpcServiceRunner server = new GrpcServiceRunner();
        server.start();
        server.blockUntilShutdown();
    }

    private int port = 50051;
    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new HelloClientImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                GrpcServiceRunner.this.stop();
            }
        });
    }

    private void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    // block 一直到退出程序
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }

}
