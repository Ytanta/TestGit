package studentBooks;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
List<Book> books1 = new ArrayList<>();
books1.add(new Book("Лопухин",239,1976));
        books1.add(new Book("Лопухин",739,1912));
        books1.add(new Book("Сироткин",669,1643));
        books1.add(new Book("Тима",2129,1643));
        books1.add(new Book("Сироткин",16,1005));
        books1.add(new Book("Лапшин",286,1943));
        List<Book> books2 = new ArrayList<>();
        books2.add(new Book("Ногов",634,1019));
        books2.add(new Book("Рукин",2129,1265));
        books2.add(new Book("Пупков",26549,1958));
        books2.add(new Book("Стопопв",1239,1257));
        books2.add(new Book("Ноздрев",215,1021));
        books2.add(new Book("Ушин",111,999));
        List<Book> books3 = new ArrayList<>();
        books3.add(new Book("Рогов",200,2013));
        books3.add(new Book("Рукин",859,1632));
        books3.add(new Book("Пупков",754,1342));
        books3.add(new Book("Тима",297,1356));
        books3.add(new Book("Титькин",228,1002));
        books3.add(new Book("Ресницеин",719,1013));


      List<Student> students = List.of(new Student("Гугарев", books1),
              new Student("Бубич", books2),
              new Student("Волосенко", books3));
//            Optional<Book> firstBookAfter2000 = students.stream()
//
//                    .peek(student -> System.out.println("Before: " + student.getNameStudent())) // выводим имя студента
//                    .map(Student::getBooks) // берем книги студентов
//                    .peek(bookList -> System.out.println("Book before sorting: " + bookList)) // выводим книги до сортировки
//                    .flatMap(Collection::stream) // разворачиваем список книг в поток
//                    .sorted(Comparator.comparingInt(Book::getPages)) // сортируем по количеству страниц
//                    .peek(book -> System.out.println("Book after sorting: " + book)) // выводим книги после сортировки
//                    .filter(book -> book.getYearRelease() > 2000) // фильтруем книги, выпущенные после 2000 года
//                    .peek(book -> System.out.println("Books published after 2000: " + book)) // выводим книги после фильтрации
//                    .distinct() // удаляем дубликаты
//                    .peek(book -> System.out.println("Distinct Book: " + book)) // выводим уникальные книги
//                    .limit(3) // ограничиваем результат тремя первыми элементами
//                    .map(Book::getYearRelease) // преобразуем к году выпуска книги
//                    .forEach(year -> System.out.println("Year of Release: " + year)); // выводим год выпуск
//            .findFirst();


        Optional<Book> firstBookAfter2000 = students.stream()
                .peek(student -> System.out.println("Before: " + student.getNameStudent()))
                .flatMap(student -> student.getBooks().stream()) // Собираем все книги
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортируем по количеству страниц
                .distinct() // Убираем дубликаты
                .filter(book -> book.getYearRelease() > 2000) // Отбираем книги после 2000 года
                .limit(3) // Ограничиваем до 3 книг
                .peek(book -> System.out.println("Book (after all operations): " + book)) // Для отладки, выводим книги
                .findFirst(); // Получаем первую книгу

        firstBookAfter2000.ifPresentOrElse(
                book -> System.out.println("Found book year of release: " + book.getYearRelease()), // Если книга найдена
                () -> System.out.println("No book found after 2000") // Если книги нет
        );
    }
}
