package utilityClass;

public class Flag {
    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty(); // Ловушка для пустых строк!
    }
}

