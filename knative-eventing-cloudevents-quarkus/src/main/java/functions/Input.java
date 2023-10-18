package functions;

/*
 * Java 11
 */
//import lombok.Value;

//@Value
//public class Input {
//    String type;
//    User user;
//}
//

/*
 * Java 17
 */
public record Input(String type, User user) {
}