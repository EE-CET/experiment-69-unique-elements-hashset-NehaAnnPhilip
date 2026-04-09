
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // TODO: Create a HashSet to store the integers
            // Using LinkedHashSet to maintain the order of appearance
            Set<Integer> uniqueNumbers = new LinkedHashSet<>();
            
            // TODO: Loop N times to read the integers and add them to the HashSet
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    uniqueNumbers.add(scanner.nextInt());
                }
            }
            
            // TODO: Iterate through the HashSet and print the unique numbers (space-separated)
            int count = 0;
            for (Integer num : uniqueNumbers) {
                System.out.print(num);
                // Add a space only between numbers, not after the last one
                if (count < uniqueNumbers.size() - 1) {
                    System.out.print(" ");
                }
                count++;
            }
        }
        
        scanner.close();
    }
}
