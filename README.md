# Modular Spring Boot Application

A demonstration of a modular Spring Boot application using Java Platform Module System (JPMS) and event-driven architecture.

## Overview

This application showcases modern Java development practices by implementing:
- Java Platform Module System (JPMS) for strong encapsulation and explicit dependencies
- Event-driven architecture using Spring's event system
- Microservices-style separation of concerns

## Project Structure

The application consists of three main modules:

```
modular-spring-app/
├── app/                 # Main application module
├── order/              # Order management module
└── inventory/          # Inventory management module
```

### Modules

- **App Module**: Entry point of the application, contains REST controllers and orchestrates the other modules
- **Order Module**: Handles order-related business logic and events
- **Inventory Module**: Manages inventory updates in response to order events

## Features

- **Modular Architecture**: Uses Java Platform Module System (JPMS) for explicit module dependencies and strong encapsulation
- **Event-Driven Design**: Implements loose coupling between modules using Spring's event system
- **RESTful API**: Exposes endpoints for order management
- **Automated Testing**: Includes unit tests for each module

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

### Building the Application

```bash
mvn clean install
```

### Running the Application

```bash
java -jar app/target/app-0.0.1-SNAPSHOT.jar
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Complete Order
```
POST /api/orders/complete
Content-Type: application/json

{
    "orderId": "123"
}
```

## Architecture

### Event Flow
1. Order completion request received by `OrderController`
2. `OrderCompleted` event published
3. `InventoryManagement` service automatically processes the event and updates inventory

### Module Dependencies
- `app` module depends on both `order` and `inventory` modules
- `inventory` module listens for events from the `order` module
- Each module maintains its own internal state and business logic

## Development

### Adding New Features
1. Determine which module should own the feature
2. Update the module's `module-info.java` if new dependencies are required
3. Implement the feature
4. Add appropriate tests
5. Update documentation

### Best Practices
- Keep modules focused and cohesive
- Use events for cross-module communication
- Maintain explicit module dependencies
- Write comprehensive tests

## Testing

Run the test suite with:

```bash
mvn test
```

## Built With

- Spring Boot 3.4.1
- Java 21
- Maven
