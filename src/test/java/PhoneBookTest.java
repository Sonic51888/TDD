import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();

    @BeforeAll
    public static void beforeAll() {
        Assertions.assertEquals(1, phoneBook.add("Алексей", 200L));
    }

    @Test
    public void addTest() {
        Assertions.assertEquals(2, phoneBook.add("Саша", 80_000_000_000L));
        Assertions.assertEquals(3, phoneBook.add("Аня", 81_111_111_111L));
        Assertions.assertEquals(4, phoneBook.add("Тоня", 82_222_222_222L));
    }

    @Test
    public void findByNumberTest() {
        Assertions.assertTrue("Алексей".equals(phoneBook.findByNumber(200L)));
        Assertions.assertFalse("Михаил".equals(phoneBook.findByNumber(300L)));
    }

    @Test
    public void findByNameTest() {
        Assertions.assertTrue(200L == phoneBook.findByName("Алексей"));
        Assertions.assertFalse(300L == phoneBook.findByName("Михаил"));
    }
    @Test
    public void printAllNamesTest(){
        phoneBook.printAllNames().stream().forEach(System.out::println);
    }
}

