# Product Name
> A simple tutorial hotel manager application that uses Java 9, Kubernetes, Microservices, Redis, Kafka, Ambassador

![](header.png)

## Installation

OS X & Linux:

Run Dockerfile.yaml to install hotel service -> docker build -t hotel:v1

Jenkins Set-up

Add Following to build application in Jenkins:-

#---- BUILDHOTEL -----
#!/bin/bash
echo "******* Starting CI/CD Pipeline task ******"
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin 
mvn -version
mvn -U clean install
cp kubernetes-module/src/main/resources/docker/Dockerfile target/
cp hotel-module/target/hotel-module-1.0-SNAPSHOT.jar target/

#---- BUILDHOTELDOCKERIMAGE ----
cd ../BuildHotel/target
sudo docker build --progress plain ./ -t hotel:v1

## Usage example

A few motivating and useful examples of how your product can be used. Spice this up with code blocks and potentially more screenshots.

_For more examples and usage, please refer to the [Wiki][wiki]._

## Development setup

Describe how to install all development dependencies and how to run an automated test-suite of some kind. Potentially do this for multiple platforms.

```sh
make install
npm test
```

## Release History

* 1.0.0
    * Initial commit of application

## Meta

Your Name – [@YourTwitter](https://twitter.com/dbader_org) – YourEmail@example.com

Distributed under the XYZ license. See ``LICENSE`` for more information.

[https://github.com/yourname/github-link](https://github.com/dbader/)

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
