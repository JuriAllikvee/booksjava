import java.util.Arrays;

class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя автора не может быть пустым.");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Фамилия автора не может быть пустой.");
        }
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

class Book {
    private String title;
    private Author[] authors;

    public Book(String title, Author[] authors) {
        setTitle(title);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Название книги не может быть пустым.");
        }
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors != null && authors.length > 0) {
            this.authors = authors;
        } else {
            throw new IllegalArgumentException("У книги должен быть хотя бы один автор.");
        }
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", Авторы: " + Arrays.toString(authors);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Автор", "1");
        Author author2 = new Author("Автор", "2");
        Author author3 = new Author("Автор", "3");
        Author author4 = new Author("Автор", "4");
        Author author5 = new Author("Автор", "5");

        Book[] books = new Book[5];

        books[0] = new Book("Книга 1", new Author[]{author1});
        books[1] = new Book("Книга 2", new Author[]{author2});
        books[2] = new Book("Книга 3", new Author[]{author3});
        books[3] = new Book("Книга 4", new Author[]{author4});
        books[4] = new Book("Книга 5", new Author[]{author5});

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
