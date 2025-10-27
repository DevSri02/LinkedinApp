💼 LinkedIn Clone Backend — Spring Boot Microservices Architecture
🧠 Overview

A LinkedIn-like backend built using Spring Boot microservices, supporting:

User authentication and management

Connections (send and accept requests)

Notifications

Post sharing

All services communicate asynchronously via Apache Kafka and are registered dynamically using Eureka Server for service discovery.
The entire system is containerized with Docker and deployed on Google Kubernetes Engine (GKE) for scalability and fault tolerance.

🧩 Microservice Architecture
Service	Port	Description
api-gateway	9090	Routes client requests to respective services
user-service	9020	Handles user registration, login, and profile data
connections-service	9030	Manages user connections (send/accept requests)
notification-service	9040	Consumes Kafka events and notifies users
eureka-server	8761	Service registry for microservices
🔁 Kafka Topics
Topic Name	Producer	Consumer	Purpose
send-connection-request-topic	Connections Service	Notification Service	Notify user when someone sends a connection request
accept-connection-request-topic	Connections Service	Notification Service	Notify sender when their request is accepted
🧱 System Architecture (Conceptual)
                  ┌────────────────────────┐
                  │       API Gateway      │
                  │  (Spring Cloud Gateway)│
                  └────────────┬───────────┘
                               │
                               ▼
              ┌────────────────────────────────────┐
              │          Eureka Server (8761)       │
              │ Service Registry for all services   │
              └────────────────────────────────────┘
          ┌────────────┬─────────────┬──────────────┐
          │            │             │              │
          ▼            ▼             ▼              ▼
  ┌────────────┐ ┌──────────────┐ ┌────────────┐ ┌────────────┐
  │ User       │ │ Connections  │ │ Notification│ │ Kafka Broker│
  │ Service    │ │ Service      │ │ Service     │ │ (Topics)   │
  └────────────┘ └──────────────┘ └────────────┘ └────────────┘
          │            │             │
          ▼            ▼             ▼
    PostgreSQL     Neo4j Graph   PostgreSQL 



    💡 Key Features

✅ Microservice-based architecture
✅ Service Discovery using Eureka
✅ Event-driven communication using Kafka
✅ Graph-based connections via Neo4j
✅ REST APIs for user, connection & notification services
✅ Dockerized and deployed using GKE Kubernetes
✅ Scalable, fault-tolerant, and cloud-ready
