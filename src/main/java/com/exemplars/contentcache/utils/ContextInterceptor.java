package com.exemplars.contentcache.utils;

import org.springframework.graphql.server.WebGraphQlInterceptor;
import org.springframework.graphql.server.WebGraphQlRequest;
import org.springframework.graphql.server.WebGraphQlResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;


@Component
public class ContextInterceptor implements WebGraphQlInterceptor {
    @Override
    public Mono<WebGraphQlResponse> intercept(WebGraphQlRequest request, Chain chain) {
        return chain.next(request).doOnNext((response) -> {
            String myValue = "max-age=10, no-cache, no-store, max-age=0, must-revalidate";
            response.getResponseHeaders().add("cache-control", myValue);
        });
    }
}