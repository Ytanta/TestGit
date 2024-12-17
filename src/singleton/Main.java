package singleton;

public class Main {
    public static void main(String[] args) {
        One singleton = One.getInstance("первый");
        One anotherSingleton = One.getInstance("второй");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
}}
