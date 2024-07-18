import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodvsLambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("lalithya", "ravi");

        List<String> upperCaseWordsmethod = words.stream()
                .map(String::toUpperCase) // method reference
                .collect(Collectors.toList());

        List<String> upperCaseWordslambda = words.stream()
                .map(word -> word.toUpperCase()) // method reference
                .collect(Collectors.toList());

        // Print the original and uppercase lists

        System.out.println("Uppercase List using Method reference: " + upperCaseWordsmethod);
        System.out.println("Uppercase List using Lambda Function: " + upperCaseWordslambda);
    }

}
