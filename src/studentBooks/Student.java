package studentBooks;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String nameStudent;
     List<Book> books = new ArrayList<>();

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", books=" + books +
                '}';
    }

    public Student(String name, List<Book> bookList) {
        this.nameStudent = name;
        this.books = bookList;

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
}

