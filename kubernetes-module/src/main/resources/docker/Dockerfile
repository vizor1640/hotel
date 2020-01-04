FROM ubuntu:16.04
MAINTAINER Chris

LABEL Description="Java + Ubuntu (OpenJDK)"

ENV DEBIAN_FRONTEND noninteractive

ARG JAVA_VERSION=9
ARG JAVA_RELEASE=JDK

ENV JAVA_HOME=/usr
ENV REDIS_SERVICE_HOST=192.168.99.101

RUN bash -c ' \
    set -euxo pipefail && \
    apt-get update && \
    pkg="openjdk-$JAVA_VERSION"; \
    if [ "$JAVA_RELEASE" = "JDK" ]; then \
        pkg="$pkg-jdk-headless"; \
    else \
        pkg="$pkg-jre-headless"; \
    fi; \
    apt-get install -y --no-install-recommends wget unzip curl iputils-ping redis-tools "$pkg" && \
    apt-get clean'

EXPOSE 4567/tcp
RUN mkdir -p /target
WORKDIR /target

COPY classes/lib lib/
COPY hotel-module-1.0-SNAPSHOT.jar .

ENTRYPOINT ["java","-cp", "hotel-module-1.0-SNAPSHOT.jar:lib/*", "com.vizor.hotel.HotelController" ]
#CMD ["nginx", "-g", "daemon off;"]