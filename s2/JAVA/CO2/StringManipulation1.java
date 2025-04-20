class StringManipulation {
    public static void main(String[] args) {
        String original = "   Hello, good morning   ";

        System.out.println("Original String: '" + original + "'");
        System.out.println("=== String Methods ===");

        System.out.println("1. Changing Case");
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());
        System.out.println();

        System.out.println("2. Substring");
        String sub = original.substring(10, 17);
        System.out.println("Substring (10 to 17): " + sub);
        System.out.println();

        System.out.println("3. Search (contains and indexOf)");
        System.out.println("Contains 'good': " + original.contains("good"));
        System.out.println("Index of 'Hello': " + original.indexOf("Hello"));
        System.out.println();

        System.out.println("4. Replace");
        String replaced = original.replace("good", "cool");
        System.out.println("Replaced text: " + replaced);
        System.out.println();

        
        System.out.println("5. Length");
        System.out.println("Length of original string: " + original.length());
        System.out.println();

        System.out.println("Original String for StringBuffer: 'Hello'");
        System.out.println("=== StringBuffer Methods ===");

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", good morning");
        System.out.println("After append: " + sb);

        sb.insert(5, " everyone");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        sb.delete(3, 12);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
