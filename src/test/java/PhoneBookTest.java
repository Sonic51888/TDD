import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();

    @Test
    public void addTest() {
        Assertions.assertEquals(1, phoneBook.add("Саша", 80_000_000_000L));
        Assertions.assertEquals(2, phoneBook.add("Аня", 81_111_111_111L));
        Assertions.assertEquals(3, phoneBook.add("Тоня", 82_222_222_222L));
    }

}
