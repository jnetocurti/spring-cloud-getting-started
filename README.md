# spring-cloud-getting-started

Simples aplicações de microserviços com Spring-Cloud e Docker Compose

## Pré-requisitos

- [Git](https://git-scm.com/)
- [JDK 8](http://www.oracle.com)
- [Apache Maven](https://maven.apache.org/) 3.5.2
- [Docker and Docker Compose](https://www.docker.com/) Docker Engine 17.06.0+, Compose 1.16.0+

### Building Docker Compose

Para construir e executar o projeto com docker compose basta executar o comando `docker-compose up` no diretório raíz do projeto. Isto irá iniciar em ordem pré-definida uma série de containers, incluindo um servidor Nexus para otimização do download de dependências dos projetos.

Agora ao acessar http://localhost:8083/ é possível visualizar o Eureka Discovery Server e os microservices registrados.
