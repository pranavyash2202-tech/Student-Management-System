# 🎓 Student Management System

A simple **console-based Student Management System developed in Java** to manage student records efficiently.

The application allows users to **add, view, search, update, delete, and sort student records**. Student data can also be saved to and loaded from a text file, allowing records to persist between program executions.

## 🚀 Features

* ➕ Add a new student
* 👀 View all students
* 🔍 Search student by ID
* ✏️ Update student details
* 🗑️ Delete student records
* 📊 Sort students by marks
* 💾 Save student data to a file
* 📂 Load previously saved student data
* ✅ Input validation
* 🎓 Automatic grade calculation
* ⚠️ Handles invalid input and file-related exceptions

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **File Handling**
* **BufferedReader**
* **BufferedWriter**
* **Exception Handling**
* **OOP Concepts**
* **Comparator**

## 📋 Student Details

Each student record contains:

* Student ID
* Name
* Age
* Course
* Marks
* Grade

The `Student` class uses these attributes and provides getters/setters for managing the data.

## 🎯 Grade System

|    Marks | Grade |
| -------: | :---- |
|   90–100 | A+    |
|    80–89 | A     |
|    70–79 | B     |
|    60–69 | C     |
|    50–59 | D     |
| Below 50 | F     |

The grade is calculated automatically based on the student's marks.

## 💻 Application Menu

```text
================================
     STUDENT MANAGEMENT SYSTEM
================================
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Sort by Marks
7. Save Data
8. Exit
================================
Enter your choice:
```

## 📂 Project Structure

```text
StudentManagementSystem/
│
├── Main.java
├── Student.java
├── StudentManager.java
├── FileHandler.java
├── students.txt
└── README.md
```

### 📄 Main.java

Handles the main program and provides the menu-driven user interface. It connects user input with the `StudentManager` and `FileHandler` classes.

### 📄 Student.java

Represents a student object and stores:

```text
ID
Name
Age
Course
Marks
```

It also calculates the student's grade and formats the student information for display.

### 📄 StudentManager.java

Handles student management operations including:

* Add
* View
* Search
* Update
* Delete
* Sort by marks

It uses an `ArrayList<Student>` to maintain the student records.

### 📄 FileHandler.java

Handles persistent storage of student records using the file:

```text
students.txt
```

Student details are written to the file as comma-separated values and loaded when the application starts.

## 🔄 Working Flow

```text
              ┌──────────────┐
              │    Start     │
              └──────┬───────┘
                     ↓
          ┌─────────────────────┐
          │ Load Saved Students │
          └──────────┬──────────┘
                     ↓
             ┌──────────────┐
             │  Main Menu   │
             └──────┬───────┘
                    ↓
       ┌────────────┴────────────┐
       ↓                         ↓
 Add / View / Search      Update / Delete
       ↓                         ↓
       └────────────┬────────────┘
                    ↓
              Sort by Marks
                    ↓
                Save Data
                    ↓
                  Exit
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/StudentManagementSystem.git
```

### 2. Open the Project

Open the project in:

* VS Code
* IntelliJ IDEA
* Eclipse
* Any Java-supported IDE

### 3. Compile the Program

Open the terminal inside the project folder and run:

```bash
javac *.java
```

### 4. Run the Program

```bash
java Main
```

## 💾 Data Storage

The application stores student information in:

```text
students.txt
```

When the program starts, it loads existing student records from the file. When the user selects **Save Data** or exits the application, the current records are written back to the file.

## 🔐 Input Validation

The program validates numerical inputs such as:

* Student ID
* Age
* Marks
* Menu choice

Marks are specifically restricted to the range **0–100**.

Duplicate student IDs are also prevented when adding a student.

## 📊 Sorting

Students can be sorted according to their marks.

The system sorts students in **descending order**, showing students with higher marks first.

## 🧠 Concepts Demonstrated

This project demonstrates important Java programming concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* ArrayList
* Searching
* Sorting
* File Handling
* Exception Handling
* Method Calling
* Conditional Statements
* Loops
* Switch Case
* Java Comparator

## 🎯 Project Objectives

* To understand Java Object-Oriented Programming.
* To implement CRUD-like student record operations.
* To practice Java collections using `ArrayList`.
* To implement file-based data persistence.
* To understand exception handling.
* To build a practical menu-driven Java application.

## 🔮 Future Enhancements

Possible improvements for future versions:

* 🔐 Admin login system
* 🗄️ MySQL database integration
* 📊 Attendance management
* 📝 Subject-wise marks
* 📈 Performance reports
* 🌐 Web-based interface
* 📱 Mobile application
* 📤 Export records to CSV/PDF

## 👨‍💻 Author

**Pranav Ranjan**
B.Tech CSE – AI & ML
VIT Bhopal University

## 📄 License

This project is created for **educational purposes**.
