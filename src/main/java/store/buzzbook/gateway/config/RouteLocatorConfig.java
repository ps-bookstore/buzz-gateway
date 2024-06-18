package store.buzzbook.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class RouteLocatorConfig {

	@Bean
	public RouteLocator myRoute(RouteLocatorBuilder builder) {

		RouteLocator routeLocator = builder.routes().build();

		return builder.routes()
			.route("coupon-api",
				p -> p.path("/api/coupons/**")
					.uri("http://localhost:8091/"))
			.build();
	}
}
