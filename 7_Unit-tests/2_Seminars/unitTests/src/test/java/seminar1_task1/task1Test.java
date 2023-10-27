package seminar1_task1;

//import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class task1Test {
    /*
    * @Test - нотация содержащая метаинформацию которую можно добавить в код для
    * отображения информации но не для пользователя, а для компилятора
    * используется для того чтобы указать на метод который является тестовым сценарием
    * ограничения: метод д.б. публичным,ничего не возвращать и не принимать аргуметнов
    */
    @Test
    public void testMethod() {
        //assertEquals(5, 2 + 3);
    }
    /*
    * @BeforeEach - выполняется перед каждым тестом
     */
    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }
    /*
    * @AfterEach - выполняется после каждого теста
     */
    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }
    /*
    * @BeforeAll - выполняется перед всеми тестами и являются статичными
     */
    @BeforeAll
    public static void globalSetup() {
        // Инициализация
    }
    /*
    * @AfterAll - выполняется после всех тестов и являются статичными
     */
    @AfterAll
    public static void globalTeardown() {
        // Очистка
    }
    /*
    * @DisplayedName - нотация позволяет присвоить имена тестам
     */
    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        //assertEquals(5, 2 + 3);
    }

    /*
    * @Disabled - тест будет отключен
     */
//    @Test
//    @Disabled
//    public void testMethod() {
//        // этот тест не будет запущен
//    }
    /*
    * @ParameterizedTest - тест с параметрами
     */
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3})
//    public void testMethod(int argument) {
//        assertTrue(argument > 0);
//    }
}