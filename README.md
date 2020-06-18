# minimal_spring_boot_docker
Minimal Spring Boot with Docker

To package the project:
./mvnw package

To build an image and tags it as: regisalbuquerque/minimal-spring-boot-docker:
docker build -t regisalbuquerque/minimal-spring-boot-docker .

To run a container:
docker run -p 8080:8080 regisalbuquerque/minimal-spring-boot-docker
