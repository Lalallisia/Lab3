public class AdditionalClass {

    private final int finalVariable1 = 10;
    private final String finalVariable2 = "Hello";
    private final double finalVariable3 = 3.14;

    // Статична змінна ініціалізується під час оголошення
    public static int staticVariable1 = 10;

    // Статичний блок ініціалізації для другої змінної
    public static int staticVariable2;

    static {
        // Цей блок коду виконується під час завантаження класу і дозволяє ініціалізувати staticVariable2
        staticVariable2 = 20;
    }

    public static void useStaticVariables() {
        // В цьому статичному методі використовуються всі статичні змінні класу
        System.out.println("Змінна staticVariable1: " + staticVariable1);
        System.out.println("Змінна staticVariable2: " + staticVariable2);
    }
    public static void useResultsOfFirstMethod() {
        // Викликаємо перший статичний метод
        useStaticVariables();

        // Тут можна використовувати результати роботи першого методу або робити інші операції з ними
        System.out.println("Використання результатів першого методу у другому методі.");
    }
    public void useFinalVariables() {
        System.out.println("Завершена (final) змінна finalVariable1: " + finalVariable1);
        System.out.println("Завершена (final) змінна finalVariable2: " + finalVariable2);
        System.out.println("Завершена (final) змінна finalVariable3: " + finalVariable3);
    }// Перший метод, який використовує усі завершені (final) змінні екземплярів

    public void useLocalFinalVariables() {
        final int localVar1 = 20;
        final String localVar2 = "World";
        final double localVar3 = 1.23;

        System.out.println("Локальна завершена (final) змінна localVar1: " + localVar1);
        System.out.println("Локальна завершена (final) змінна localVar2: " + localVar2);
        System.out.println("Локальна завершена (final) змінна localVar3: " + localVar3);
    }// Другий метод, який створює та використовує локальні завершені (final) змінні

}
