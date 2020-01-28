package levi.yoon.argo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ArgoHandler {

    public Mono<ServerResponse> index(ServerRequest serverRequest) {
        return ServerResponse.ok().body(Mono.just("Hello Argo World !"), String.class);
    }
}
