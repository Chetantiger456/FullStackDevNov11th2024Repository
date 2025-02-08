public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows for the upper part of the pattern

        // Upper part of the pattern
        for (int i = 0; i < rows; i++) {
            // Print increasing numbers from 1 to (rows - i)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in between
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("  ");
            }
			
            // Print decreasing numbers from (rows - i) down to 1
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
			
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 1; i <= rows; i++) {
            // Print increasing numbers from 1 to (i + 1)
			
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in between
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
			
            // Print decreasing numbers from (i + 1) down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
