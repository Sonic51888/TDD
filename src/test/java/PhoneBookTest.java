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

    @Test
    public void findByNumberTest() {
        Assertions.assertTrue("Саша".equals(phoneBook.findByNumber(80_000_000_000L)));
        Assertions.assertTrue("Аня".equals(phoneBook.findByNumber(81_111_111_111L)));
        Assertions.assertTrue("Тоня".equals(phoneBook.findByNumber(82_222_222_222L)));
    }
}
