🚀 Tri-Pillars – Day 3

Welcome to Day 3 of my Tri-Pillars learning journey.

This repository contains my Java practice for understanding Object-Oriented Programming (OOP) concepts through simple, practical examples.

📌 Day 3 – Java OOP Practice

The main concept covered in this repository is:

🔹 Aggregation

Aggregation is a "has-a" relationship between two classes where one class contains a reference to another class, but both objects can exist independently.

Example Used

The project demonstrates the relationship between:

College
Department

A College has a Department.

College
   |
   └── Department

The AggregationDemo program creates a Department object and passes it to a College object.

🛠️ Technologies Used
☕ Java
💻 IntelliJ IDEA
📦 Object-Oriented Programming
🔗 Aggregation
📂 Project Structure
Tri-pillars-Day3/
│
├── .idea/
│
├── src/
│   ├── Main.java
│   │
│   └── Dayy3/
│       └── AggregationDemo.java
│
├── .gitignore
└── tp03.iml
🧠 Concept Demonstrated
Aggregation in Java

The project contains two classes:

class Department {
    String deptName;
}

and

class College {
    String collName;
    Department department;
}

The College class contains a reference to the Department object.

Department d = new Department("csd");

College c = new College("biet", d);

c.display();
Output
biet has dept csd
🎯 Learning Objectives

Through this practice, I learned:

Understanding Aggregation in Java
Creating relationships between classes
Passing objects as constructor arguments
Using object references
Implementing the has-a relationship
Practicing Java class and object concepts
▶️ How to Run
1. Clone the repository
git clone https://github.com/syedaakifzain/Tri-pillars-Day3.git
2. Open the project

Open the project using IntelliJ IDEA or any Java-compatible IDE.

