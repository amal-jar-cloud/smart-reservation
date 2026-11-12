# Smart Resource Reservation System

Distributed Java application: **Java RMI + JMS (ActiveMQ Artemis) + JNDI**, Spring Boot gateway, PostgreSQL, Angular frontend.

> Work in progress. Full architecture, setup and demo instructions will be added here.

## Modules

| Module | Role |
|---|---|
| `common` | Shared DTOs, exceptions, RMI interfaces, events |
| `messaging` | JNDI + JMS producer/consumer library |
| `rmi-server` | Core domain service (RMI + JPA + PostgreSQL) |
| `rmi-client` | RMI client library |
| `backend-api` | REST gateway (Spring Boot) |
| `notification-service` | Durable JMS consumer |
| `frontend` | Angular UI (added in Phase 12) |