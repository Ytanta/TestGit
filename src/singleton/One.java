package singleton;

public class One {
    private static One instance;
    public String value;

    private One(String value) {
        // Этот код эмулирует медленную инициализацию.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static One getInstance(String value) {
        if (instance == null) {
            instance = new One(value);
        }
        return instance;
    }
}

