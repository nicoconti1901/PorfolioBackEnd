FROM amazoncorretto:11

MAINTAINER NicoConti 

COPY target/PorfolioBackEnd-0.0.1-SNAPSHOT.jar nicoporfolio.jar  

ENTRYPOINT ["java","-jar","/nicoporfolio.jar"]     

