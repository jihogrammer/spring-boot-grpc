package dev.jihogrammer.grpc.hello;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class HelloConfig {

    @Bean
    public HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub(
            @Value("${grpc.hello.host}") final String host,
            @Value("${grpc.hello.port}") final int port
    ) {
        log.info("[HelloServiceGrpc] connecting to {}:{}", host, port);

        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress(host, port)
                // https://stackoverflow.com/questions/45571314/connection-error-io-netty-handler-codec-http2-http2exception-http-2-client-pref
                .usePlaintext()
                .build();
        return HelloServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public HelloRepository helloRepository(final HelloServiceGrpc.HelloServiceBlockingStub stub) {
        return new HelloRepository(stub);
    }

    @Bean
    public HelloService helloService(final HelloRepository repository) {
        return new HelloService(repository);
    }

}
