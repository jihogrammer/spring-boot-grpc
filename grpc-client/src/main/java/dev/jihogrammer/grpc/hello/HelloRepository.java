package dev.jihogrammer.grpc.hello;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class HelloRepository {

    private final HelloServiceGrpc.HelloServiceBlockingStub stub;

    public HelloResponse hello(final HelloRequest request) {
        log.debug("request: {}", request);
        return this.stub.hello(request);
    }

}
