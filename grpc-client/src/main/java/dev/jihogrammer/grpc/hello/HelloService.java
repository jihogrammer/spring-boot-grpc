package dev.jihogrammer.grpc.hello;

import io.grpc.StatusRuntimeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class HelloService {

    private final HelloRepository helloRepository;

    public HelloResponse hello(final String name) {
        try {
            return this.helloRepository.hello(HelloRequest.newBuilder().setName(name).build());
        } catch (StatusRuntimeException e) {
            log.error("failed to request: {}", e.getMessage(), e);
            throw e;
        }
    }

}
