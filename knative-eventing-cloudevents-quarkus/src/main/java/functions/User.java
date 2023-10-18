package functions;

/*
 * Java 11
 */
//import lombok.Value;

//@Value
//public class User {
//    int age;
//    String name;
//}

/*
 * Java 17
 */

public record User(int age, String name) {
}
