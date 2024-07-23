# Boiler Plate for Practice of JWT + Hexagonal

+ Multi-modules + Excluding Spring Security

This project is a boiler plate for members to study JWT with hexagonal architecture.  

Included:

- [X] JJWT
- [X] Multi Modules
- [X] Hexagonal Architecture
- [X] FeignClient

Excluded(comparing to another versions):

- [ ] BFF
- [ ] WebFlux
- [ ] Spring Security
- [ ] gRPC
- [ ] WebClient

# Prerequisites

## Installation

- OpenJDK 21+ (ex: Amazon Corretto, ...)
- Docker Desktop(or just docker compose)

# Run The Applications

## 1. Docker Compose

```shell
docker-compose up -d
```

## 2. Active Profiles

If your IDE supports "Active Profile",
insert this to each application Run/Debug configuration:

```text
local
```

Or add VM argument:

```shell
-Dspring.profiles.active=local
```

## 3. Run or Debug

You can run the applications now.
