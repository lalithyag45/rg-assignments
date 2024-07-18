import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToUpper {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("lalithya","ravi");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the original and uppercase lists
        System.out.println("Original List: " + words);
        System.out.println("Uppercase List: " + upperCaseWords);
    }
}

