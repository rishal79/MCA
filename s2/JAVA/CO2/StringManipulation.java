public class StringManipulation {
    public static void main(String[] args) {
        String original = "   Hello, good morning   ";

        System.out.println("=== 1. Changing Case ===");
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());
        System.out.println();

        System.out.println("=== 2. Substring ===");
        String sub = original.substring(10, 17);
        System.out.println("Substring (10 to 17): " + sub);
        System.out.println();

        System.out.println("=== 3. Search (contains and indexOf) ===");
        System.out.println("Contains 'good': " + original.contains("good"));
        System.out.println("Index of 'Hello': " + original.indexOf("Hello"));
        System.out.println();

        System.out.println("=== 4. Replace ===");
        String replaced = original.replace("good", "cool");
        System.out.println("Replaced text: " + replaced);
        System.out.println();

        System.out.println("=== 5. Split ===");
        String[] words = original.trim().split(" ");
        System.out.println("Split into words:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        System.out.println();

        System.out.println("=== 6. Concatenation ===");
        String greeting = "Hi";
        String name = "there!";
        String fullGreeting = greeting + " " + name;
        System.out.println("Concatenation: " + fullGreeting);
        System.out.println();

        System.out.println("=== 7. Trim ===");
        String trimmed = original.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println();

        System.out.println("=== 8. Length ===");
        System.out.println("Length of original string: " + original.length());
        System.out.println("Length after trimming: " + trimmed.length());
    }
}
