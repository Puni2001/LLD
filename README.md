# Java OOP to LLD: Mastering Design for Interviews 🚀

This repository is your complete practice companion for mastering Java Object-Oriented Programming (OOP) and Low-Level Design (LLD). From the very basics to advanced system modeling, this guide includes **concepts**, **tasks**, and **project challenges** to help you **ace interviews** and **become design-proficient**.

---

## 📌 Why This Repo?

- Structured topic-wise from **OOP basics** to **LLD mastery**
- Includes **real-world tasks** for hands-on coding
- Focused on **interview readiness** (System Design & LLD rounds)
- Covers **minute to important** topics interviewers expect

---

## 📚 Topics Roadmap

Each section contains:
✅ Concepts  
✅ Implementation Hints  
✅ Coding Tasks  
✅ Bonus Challenges  

---

## 🧱 1. Java OOP Foundations

### ✅ Topics:
- Classes & Objects
- Access Modifiers
- Constructors
- `this` & `super` keywords
- Static vs Instance
- Encapsulation
- Inheritance
- Polymorphism (Compile-time & Runtime)
- Abstraction
- Composition vs Inheritance
- Final, Abstract, Interface
- Inner Classes

### 💻 Tasks:
- Model a basic `BankAccount` system
- Create a `Student`-`Course` registration system (Composition)
- Implement a shape hierarchy (Abstraction + Polymorphism)
- Interface for `PaymentGateway` with multiple implementations

---

## 📦 2. SOLID Principles

### ✅ Topics:
- S: Single Responsibility Principle
- O: Open-Closed Principle
- L: Liskov Substitution Principle
- I: Interface Segregation Principle
- D: Dependency Inversion Principle

### 💻 Tasks:
- Refactor a `UserService` class to follow SRP
- Design a notification system following OCP
- Implement a Bird hierarchy (LSP violation + fix)
- Segregate an overloaded `Printer` interface
- Invert a tightly coupled `OrderProcessor`

---

## 🧰 3. Design Patterns (Creational, Structural, Behavioral)

### ✅ Topics:
- **Creational**: Singleton, Factory, Abstract Factory, Builder, Prototype
- **Structural**: Adapter, Decorator, Composite, Proxy, Facade
- **Behavioral**: Strategy, Observer, Command, Template, State, Chain of Responsibility, Mediator

### 💻 Tasks:
- Singleton for Logger
- Factory for Shape objects
- Builder for building complex `Pizza` object
- Decorator for adding features to `Car`
- Strategy for dynamic sorting algorithm
- Observer for stock price updates

---

## ⚙️ 4. Core LLD Principles

### ✅ Topics:
- Object Modeling
- Responsibilities & Interactions
- Class Diagrams
- Use-case & Sequence Diagrams
- Services vs Managers
- Exception Handling Strategy
- Enum-based design
- DTOs, DAOs

### 💻 Tasks:
- Design elevator system (class diagram + interactions)
- Model a parking lot (extendable levels, slots)
- Create a hotel booking manager with services & DAOs
- Library Management System

---

## 🎯 5. Real-World System Design (LLD Practice)

### ✅ Systems to Design:
- Tic-Tac-Toe (OOP)
- Snake & Ladder
- Splitwise
- Amazon Locker
- Vending Machine
- Cab Booking (Uber LLD)
- Rate Limiter
- Movie Ticket Booking
- ATM Machine
- Chess Game (Advanced OOP)
- Logging Framework
- Notification Service
- File System

### 💻 Tasks:
- Implement core logic (data + behavior)
- Class diagrams + write interfaces
- Mock test cases to validate flows
- Focus on separation of concerns, SOLID

---

## 🧪 6. Testing and Clean Code

### ✅ Topics:
- Writing Unit Tests (JUnit)
- Mocking (Mockito)
- Test Driven Design (TDD)
- Naming Conventions
- Refactoring Techniques

### 💻 Tasks:
- Add tests for Splitwise logic
- Refactor old implementations to use cleaner abstractions
- Introduce interfaces & test dependency injection

---

## 🧠 7. Advanced Topics (Optional but Interview Gold)

### ✅ Topics:
- Thread Safety in Singleton
- Immutability in Design
- Interface vs Abstract (real-world debates)
- Dependency Injection (Manual & Spring-style)
- Custom Exceptions
- Object Cloning
- Builder Pattern with Inheritance
- Anti-Patterns in LLD

### 💻 Tasks:
- Thread-safe lazy Singleton
- Immutable `UserProfile` object
- Design DI-based notification service
- Cloneable object example

---

## 🛠️ Project Structure

```bash
.
├── basics/
│   ├── oop/
│   └── solid/
├── design-patterns/
├── systems/
│   ├── splitwise/
│   ├── parking-lot/
│   └── vending-machine/
├── testing/
│   └── junit-mockito/
├── advanced/
└── README.md
