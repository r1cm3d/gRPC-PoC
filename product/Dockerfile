FROM openjdk:11

RUN mkdir /product

COPY target/product*.jar /product/app.jar
COPY scripts/entrypoint.sh /product

ENTRYPOINT /product/entrypoint.sh
