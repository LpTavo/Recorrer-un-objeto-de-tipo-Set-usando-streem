import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        
        
        System.out.println("Recorrer el conjunto usando stream:");
        numbers.stream().forEach(System.out::println);
    }
}
