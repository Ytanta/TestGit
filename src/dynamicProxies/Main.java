package dynamicProxies;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {


        Man vasia = new Man("Игорь", 26, "Ростов", "Россия");


        ClassLoader vasiaClassLoader = vasia.getClass().getClassLoader();


        Class[] interfaces = vasia.getClass().getInterfaces();


        Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassLoader, interfaces, new PersonInvocationHandler(vasia));


        proxyVasia.introduce(vasia.getName());

    }
}

