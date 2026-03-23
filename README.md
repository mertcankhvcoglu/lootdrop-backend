# LootDrop - Cyberpunk Inspired E-Commerce Backend
---
LootDrop, modern bir e-ticaret platformunun ihtiyaç duyduğu temel operasyonları yürüten, Java ve Spring Boot tabanlı bir RESTful API projesidir. Proje, ölçeklenebilir bir mimari ile geliştirilmiş olup bulut tabanlı bir veritabanı (Neon PostgreSQL) ve konteynerizasyon teknolojileri (Docker) kullanılarak canlıya alınmıştır.

### 📡 Canlı Sunucu Durumu (Render)
[![Build Status](https://img.shields.io/badge/Render-Live-00FFFF?style=for-the-badge&logo=render&logoColor=white)](https://lootdrop-backend.onrender.com/api/products)
> *Not: Ücretsiz Render sunucusu uyku modunda olabilir, ilk istek 30-50 saniye sürebilir.*

## 🛠 Kullanılan Teknolojiler ve Araçlar

| Kategori | Teknoloji / Araç |
| :--- | :--- |
| **Dil** | Java 21 |
| **Framework** | Spring Boot 3.x / 4.x |
| **Veri Erişimi** | Spring Data JPA (Hibernate) |
| **Veritabanı** | PostgreSQL (Neon DB) |
| **DevOps** | Docker, Render |
| **API Test** | Swagger UI / Postman |

---

## 🏗 Proje Mimarisi

Proje, **Katmanlı Mimari (Layered Architecture)** prensiplerine uygun olarak dört ana katmanda yapılandırılmıştır:

* **Controller:** API uç noktalarının (endpoints) yönetildiği, isteklerin karşılandığı katman.
* **Service:** İş mantığının (business logic) yürütüldüğü ve veri manipülasyonunun yapıldığı katman.
* **Repository:** Veritabanı ile doğrudan iletişimin kurulduğu (JPA/Hibernate) katman.
* **Entity:** Veritabanı tablolarını temsil eden nesne modelleri.

### Klasör Yapısı
```text
src/main/java/com/mertcan/lootdrop/
├── controller/     # API Endpoints
├── entity/         # Database Entities & Base Models
├── repository/     # Data Access Objects
├── service/        # Business Logic Layers
├── DataSeeder.java # Initial Data Population
└── LootdropApplication.java
