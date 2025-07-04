# Assessment6
## System Architecture
### Backend Components:

Spring Boot application with REST API endpoints

PostgreSQL database integration

WebSocket support for real-time updates

MVC pattern with Controller-Service-Repository layers
---
### Frontend:

Simple HTML page with JavaScript

Uses SockJS and STOMP for WebSocket communication

Displays inventory items and allows adding new items

Key Features Implemented
### Real-time Inventory Tracking:
---
WebSocket configuration broadcasts new inventory items to all connected clients

Clients receive updates immediately when items are added
---
### CRUD Operations:

Currently supports:

GET all inventory items (/api/inventory)

POST new inventory item (/api/inventory)
---
### Database Integration:

Uses Spring Data JPA with PostgreSQL

Automatic schema updates via Hibernate
