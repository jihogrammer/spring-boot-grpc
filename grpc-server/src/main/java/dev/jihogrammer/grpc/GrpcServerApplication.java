package dev.jihogrammer.grpc;

import dev.jihogrammer.grpc.hello.HelloRequest;
import dev.jihogrammer.grpc.hello.HelloResponse;
import dev.jihogrammer.grpc.hello.HelloServiceGrpc;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.time.ZonedDateTime;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

public class GrpcServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder.forPort(3000)
                .addService(new HelloService())
                .build()
                .start()
                .awaitTermination();
    }

    @Slf4j
    public static class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

        @Override
        public void hello(
                final HelloRequest request,
                final StreamObserver<HelloResponse> responseObserver
        ) {
            log.info("Hello Request in: {}", request);

            responseObserver.onNext(doResponse(request));
            responseObserver.onCompleted();
        }

        private HelloResponse doResponse(final HelloRequest request) {
            return HelloResponse.newBuilder().setMessage(message(request)).build();
        }

        private String message(final HelloRequest request) {
            return "[" + ZonedDateTime.now().format(ISO_OFFSET_DATE_TIME) + "] Hello, " + request.getName();
        }

    }

}
