# DemoGraphQL
In this tutorial, you're going to learn how to build a GraphQL server that will expose an API to create, update and delete entities of type `Book` with the following attributes:

* ID
* Title
* ISBN
* Page count
* Author

`Author` will be a complex type with the following attributes:

* ID
* First name
* Last name
You'll define these types in a GraphQL schema using a special Graphql DSL called IDL. You'll also create resolvers, queries, mutations, error handlers and the rest of the infrastructure for the server.

This tutorial will use:

* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Spring Boot 2.2.1](https://spring.io/projects/spring-boot) with an embedded [H2 database](http://www.h2database.com/html/main.html)
* [graphql-java](https://github.com/graphql-java/graphql-java), a GraphQL Java implementation
* [GraphiQL](https://github.com/skevy/graphiql-app), an app for editing and testing GraphQL queries/mutations (you'll learn how to use its web version)
* [Gradle](https://gradle.org/) (but you can use [Maven](https://maven.apache.org/) if you prefer it)

At the end of the tutorial, you'll have a strong foundation to build APIs with GraphQL using Spring Boot.
