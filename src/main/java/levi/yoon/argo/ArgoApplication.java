package levi.yoon.argo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class ArgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArgoApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> index(ArgoHandler argoHandler) {
		return route()
				.GET("/index", accept(MediaType.APPLICATION_JSON), argoHandler::index)
				.build();
	}
}
