# Mini-sistema de Pedidos com RabbitMQ

Este projeto é uma implementação acadêmica de uma arquitetura de microserviços utilizando **Java 21**, **Spring Boot** e **RabbitMQ**..

## 📋 Sobre o Projeto

O sistema é composto por dois serviços principais:

1.  **order-service (Producer):** Recebe pedidos via API REST, gera um ID sequencial simples, e publica os dados na fila de mensagens.
2.  **notification-service (Consumer):** Escuta a fila de pedidos e simula o envio de uma notificação (log no console).

### Fluxo da Aplicação
1. O cliente envia um `POST` para o **order-service**.
2. O serviço gera um ID (ex: 1, 2, 3...) e envia o objeto para o **RabbitMQ**.
3. O **notification-service** captura a mensagem da fila e imprime os detalhes no console.

---

## 🛠️ Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.x** (Web, AMQP)
* **RabbitMQ** (Message Broker)
* **Docker** (Infraestrutura)

## Outra Metade do Projeto

https://github.com/Parllon/projetoWebCarlosParllon
