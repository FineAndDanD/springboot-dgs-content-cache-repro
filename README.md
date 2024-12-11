# Getting Started

## Building and Running the Project

NOTE: This project uses version 21 of Java

In order to build:
```bash
gradlew clean build
```

In order to run:

```bash
gradlew clean bootRun
```

## Description

For this reproduction, I've created a very basic DGS subgraph that just returns some Show data.
The important part of this reproduction is in the `com.exemplars.contentcache.utils.ContextInterceptor` class.
We are injecting a `cache-control` header with a custom value, which is feeding through the router and getting back to the client.

This is only possible when using the Entity Caching feature of the router, so a graph ref and api key are necessary to run this end to end.
