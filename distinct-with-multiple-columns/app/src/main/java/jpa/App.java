/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jpa;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("tuple example.");
        Entity1Repository.getMultipleDistinct1().stream().forEach(System.out::println);
        System.out.println("construct example.");
        Entity1Repository.getMultipleDistinct2().stream().forEach(System.out::println);
    }
}