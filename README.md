# Korte SaaS 💈

[![Java Version](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-latest-blue?style=for-the-badge&logo=postgresql)](https://www.postgresql.org/)

**Korte SaaS** is a high-performance ERP solution designed specifically for barbershops and beauty salons. Built with a focus on the "Offline-First" philosophy, it ensures that your business never stops, even without an internet connection. 

The system is fully compliant with the new 2026 Brazilian tax regulations for Service Invoices (NFS-e) and the "Salão Parceiro" (Partner Salon) law.

---

## 🚀 Key Features

- **Multi-tenant Architecture:** Securely host multiple shops on a single platform.
- **Offline-First Management:** Sales and appointments are saved locally and synced automatically when back online.
- **Automated Commission Split:** Real-time calculation for "Partner Salons," deducting service shares and taxes automatically.
- **Tax Compliance (NFS-e):** One-click service invoice emission following the 2026 national standards.
- **Mobile Optimized:** A Progressive Web App (PWA) interface designed for mobile and tablet use.
- **Financial Dashboard:** Real-time cash flow monitoring and professional performance reports.

---

## 🛠 Tech Stack

- **Backend:** Java 21 & Spring Boot 3
- **Database:** PostgreSQL (Cloud) & SQLite/IndexedDB (Local storage for offline mode)
- **Security:** Spring Security & JWT (JSON Web Tokens)
- **API Documentation:** Swagger UI (OpenAPI)
- **Build Tool:** Maven

---

## 🏗 Database Schema (Core)

The system uses **UUIDs** (Universally Unique Identifiers) for all primary keys to prevent data collision during offline synchronization.

- `tenants`: Shop information and tax configuration.
- `professionals`: Staff data and commission rates.
- `services`: Catalog of services and prices.
- `appointments`: Booking and scheduling records.
- `sales`: Transaction history and commission split details.

---

## 🚦 Getting Started

### Prerequisites

- JDK 21
- Maven 3.8+
- PostgreSQL instance

### Installation

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/weldyson/Korte_SaaS.git](https://github.com/weldyson/Korte_SaaS.git)
   ```
2. Configure the database:
3.  Edit src/main/resources/application.properties with your database credentials.

4. Run the application:
```Bash
mvn spring-boot:run
```

4. API Documentation: Once the server is running, access the Swagger UI at: http://localhost:8080/swagger-ui/index.html

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

Developed by Weldyson

   
