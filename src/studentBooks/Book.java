package studentBooks;

import java.util.List;
import java.util.Objects;

public class Book {
        String name;
        int pages;
        int yearRelease;

        public Book(String name, int pages, int yearRelease) {
            this.name = name;
            this.pages = pages;
            this.yearRelease = yearRelease;

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name); // Сравниваем книги по имени
    }

    @Override
    public int hashCode() {
            return name.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", yearRelease=" + yearRelease +
                '}';
    }
}

