## 📄 Description - Exercise Statement

### Level 1: File Management

#### Exercise 1: Listing Directory Contents Alphabetically
Create a Java class that lists the contents of a directory in alphabetical order. The directory path should be received as a parameter.

📌 **Functionalities:**
- Accept a directory path as an input parameter.
- Retrieve and list all files and subdirectories in the specified directory.
- Sort the listing alphabetically before displaying it.
- Handle exceptions when the provided path is invalid or not a directory.

✅ **JUnit Verification:**
- Ensure the method correctly sorts the directory contents alphabetically.
- Verify that an exception is thrown when the path is invalid or does not point to a directory.
- Check that the method returns an empty list when the directory is empty.

## 💻 Technologies Used
- Java
- JUnit
- Java File I/O
- Exception Handling

## 📋 Requirements
To run this project, you need:
- JDK 8 or higher
- A development environment such as IntelliJ IDEA, Eclipse, or VS Code with Java support
- Basic knowledge of Java and JUnit

### To compile and run the project from the terminal:
```sh
javac DirectoryLister.java
java DirectoryLister <directory_path>
```

