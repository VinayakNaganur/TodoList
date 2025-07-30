# To-Do List Application 

A simple, yet powerful, To-Do List web application built using the Spring Boot framework for the backend and Thymeleaf for server-side rendering of the user interface.

This project allows users to manage their daily tasks through a clean and intuitive web interface. You can add, view, update, and delete tasks seamlessly.

---
Master is the main Branch
---


## Features

* **Create Task:** Add new tasks with a title and description.
* **View All Tasks:** See a list of all pending and completed tasks.
* **Update Task:** Mark tasks as complete or incomplete.
* **Delete Task:** Remove tasks from the list permanently.
* **Persistent Storage:** Uses an in-memory database (like H2) or a relational database (like MySQL/PostgreSQL) to store tasks.
* **Responsive UI:** A clean user interface built with Thymeleaf and a CSS framework like Bootstrap.

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Frontend:** Thymeleaf, HTML, CSS (Bootstrap)
* **Database:** H2 (In-Memory) / MySQL
* **Build Tool:** Maven 
* **Dependencies:**
    * `Spring Web`: For building the web application and RESTful services.
    * `Spring Data JPA`: For database interaction and persistence.
    * `Thymeleaf`: For server-side Java template engine for the view layer.
    * `Spring Boot DevTools`: For automatic restarts and live reloads during development.

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed on your system:

* **Java Development Kit (JDK):** Version 17 or later.
* **Apache Maven** or **Gradle:** To build the project and manage dependencies.
* **An IDE:** IntelliJ IDEA, Eclipse, or VS Code with Java extensions.

---

## 🚀 Getting Started

Follow these steps to get a local copy up and running.

### 1. Clone the Repository

Clone this project to your local machine using Git.

```bash
git clone [https://github.com/your-username/your-repo-name.git](https://github.com/VinayakNaganur/TodoList.git)
cd your-repo-name

```

Certainly. Here is the complete Markdown for the README file in a single code block. You can copy this and save it as a README.md file.

Markdown

# To-Do List Application 📝

A simple, yet powerful, To-Do List web application built using the Spring Boot framework for the backend and Thymeleaf for server-side rendering of the user interface.

This project allows users to manage their daily tasks through a clean and intuitive web interface. You can add, view, update, and delete tasks seamlessly.

---

## ✨ Features

* **Create Task:** Add new tasks with a title and description.
* **View All Tasks:** See a list of all pending and completed tasks.
* **Update Task:** Mark tasks as complete or incomplete.
* **Delete Task:** Remove tasks from the list permanently.
* **Persistent Storage:** Uses an in-memory database (like H2) or a relational database (like MySQL/PostgreSQL) to store tasks.
* **Responsive UI:** A clean user interface built with Thymeleaf and a CSS framework like Bootstrap.

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot
* **Frontend:** Thymeleaf, HTML, CSS (Bootstrap)
* **Database:** H2 (In-Memory) / MySQL / PostgreSQL (configurable)
* **Build Tool:** Maven / Gradle
* **Dependencies:**
    * `Spring Web`: For building the web application and RESTful services.
    * `Spring Data JPA`: For database interaction and persistence.
    * `Thymeleaf`: For server-side Java template engine for the view layer.
    * `H2 Database`: For an in-memory database (development profile).
    * `Spring Boot DevTools`: For automatic restarts and live reloads during development.

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed on your system:

* **Java Development Kit (JDK):** Version 17 or later.
* **Apache Maven** or **Gradle:** To build the project and manage dependencies.
* **An IDE:** IntelliJ IDEA, Eclipse, or VS Code with Java extensions.

---

## 🚀 Getting Started

Follow these steps to get a local copy up and running.

### 1. Clone the Repository

Clone this project to your local machine using Git.

```bash
git clone [https://github.com/your-username/your-repo-name.git](https://github.com/your-username/your-repo-name.git)
cd your-repo-name
```
---
# 2. Configure the Database (Optional)
 By default, the application is configured to use the H2 in-memory database. No setup is required for this.

If you want to use a different database like MySQL or PostgreSQL, you need to:

Update the src/main/resources/application.properties file with your database credentials.

Properties
```bash

spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

```

 # 3. Build and Run the Application
 ---
You can run the application using your IDE or the command line.

Using Maven:

```Bash

mvn spring-boot:run
```
---
The application will start on http://localhost:8080.
---

🕹️ Usage
*Once the application is running, open your web browser and navigate to http://localhost:8080.

*Homepage (/ or /todos): Displays the list of all to-do items.

*Add Task: Use the form on the homepage to add a new task.

*Update Status: Click the checkbox next to a task to mark it as complete or incomplete.

*Delete Task: Click the delete button to remove a task.

*The application follows a standard Model-View-Controller (MVC) architecture.

# HTTP Method	Path	Description
```bash
GET	/todos	Fetches and displays all tasks.
POST	/todos	Creates a new task.
POST	/todos/{id}/toggle	Toggles the completion status of a task.
POST	/todos/{id}/delete	Deletes a task.
```
