FROM openjdk:11
VOLUME /tmp
ADD ./target/service-products-1.0.0-SNAPSHOT.jar service-products.jar
ENTRYPOINT ["java", "-jar", "/service-products.jar"]