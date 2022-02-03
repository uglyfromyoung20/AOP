package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Победа")
private String name;
    @Value("СССР")
    private String author;
    @Value("1945")
    private int yearOfPublication;

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
