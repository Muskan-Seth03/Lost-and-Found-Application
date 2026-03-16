# Lost & Found Portal API (Spring Boot)

A simple **Lost & Found REST API** built using **Spring Boot**.
This API allows users to report **lost items**, report **found items**, browse all items, and search for items.

The project uses **in-memory storage (Java List)** instead of a database, making it lightweight and easy to run for demos or learning purposes.

---

# 🚀 Features

* Report a **lost item**
* Report a **found item**
* View **all items**
* View **lost items**
* View **found items**
* **Search items** by keyword
* Simple **REST API architecture**
* No database required (in-memory storage)

---

# 🛠 Tech Stack

* Java
* Spring Boot
* Maven
* REST API

---

# 📁 Project Structure

```
lost-found-api
│
├── controller
│      ItemController.java
│
├── service
│      ItemService.java
│
├── model
│      Item.java
│
└── LostFoundApplication.java
```

---

# ⚙️ Installation & Setup

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/lost-found-api.git
cd lost-found-api
```

---

## 2️⃣ Build the Project

```bash
mvn clean install
```

---

## 3️⃣ Run the Application

```bash
mvn spring-boot:run
```

Or run:

```
LostFoundApplication.java
```

---

# 🌐 API Base URL

```
http://localhost:8080/api/items
```

---

# 📌 API Endpoints

## 1️⃣ Report Lost Item

**POST**

```
/api/items/lost
```

Request Body

```json
{
"title": "Black Wallet",
"description": "Leather wallet with ID cards",
"category": "Accessories",
"location": "Library"
}
```

Response

```json
{
"id": 1,
"title": "Black Wallet",
"description": "Leather wallet with ID cards",
"category": "Accessories",
"location": "Library",
"status": "LOST"
}
```

---

## 2️⃣ Report Found Item

**POST**

```
/api/items/found
```

Request Body

```json
{
"title": "Black Wallet",
"description": "Found near library entrance",
"category": "Accessories",
"location": "Library"
}
```

---

## 3️⃣ Get All Items

**GET**

```
/api/items
```

---

## 4️⃣ Get Lost Items

**GET**

```
/api/items/lost
```

---

## 5️⃣ Get Found Items

**GET**

```
/api/items/found
```

---

## 6️⃣ Search Items

**GET**

```
/api/items/search?keyword=wallet
```

---

# 📊 Example Response

```json
[
  {
    "id": 1,
    "title": "Black Wallet",
    "description": "Leather wallet",
    "category": "Accessories",
    "location": "Library",
    "status": "LOST"
  }
]
```

---

# 🧪 Testing the API

You can test the API using:

* Postman
* cURL
* Thunder Client (VS Code)
* Insomnia

Example:

```
POST http://localhost:8080/api/items/lost
```

---

# ⚠️ Note

This project uses **in-memory storage**, meaning:

* Data will be **lost when the server restarts**
* No database is used

---

# 🔮 Future Improvements

Possible enhancements:

* Add **database support (MySQL / PostgreSQL)**
* Implement **user authentication**
* Add **image upload for items**
* Implement **automatic item matching**
* Add **pagination and filtering**
* Build a **frontend interface**

---

# 👨‍💻 Author

Developed by **Muskan Seth**

---
