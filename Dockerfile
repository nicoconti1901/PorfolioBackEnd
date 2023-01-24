
FROM amazoncorretto:11-alpine-jdk // de que imagen de java partimos

MAINTAINER NicoConti // quien es el dueño

COPY target/PorfolioBackEnd-0.0.1-SNAPSHOT.jar nicoporfolio.jar  //va a copiar el empaquetado github

ENTRYPOINT ["java","jar","nicoporfolio.jar"]      //que se va a ejecutar primero

