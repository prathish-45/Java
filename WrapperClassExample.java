public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive Data Types
        int num = 10;
        double decimal = 25.75;
        char letter = 'A';
        boolean flag = true;

        // *** Boxing: Converting primitive to Wrapper Object ***
        Integer numObj = Integer.valueOf(num);  // Explicit Boxing
        Double decimalObj = decimal;  // Autoboxing (implicit conversion)
        Character letterObj = letter;
        Boolean flagObj = flag;

        // Printing Wrapper Objects
        System.out.println("Wrapper Objects:");
        System.out.println("Integer Object: " + numObj);
        System.out.println("Double Object: " + decimalObj);
        System.out.println("Character Object: " + letterObj);
        System.out.println("Boolean Object: " + flagObj);

        // *** Unboxing: Converting Wrapper Object to Primitive ***
        int newNum = numObj.intValue();  // Explicit Unboxing
        double newDecimal = decimalObj;  // Auto-unboxing
        char newLetter = letterObj;
        boolean newFlag = flagObj;

        // Printing Unboxed Values
        System.out.println("\nUnboxed Values:");
        System.out.println("Integer: " + newNum);
        System.out.println("Double: " + newDecimal);
        System.out.println("Character: " + newLetter);
        System.out.println("Boolean: " + newFlag);

        // *** Using Wrapper Class Methods ***
        String strNum = "100";
        int parsedNum = Integer.parseInt(strNum);  // Convert String to int
        System.out.println("\nParsed Integer from String: " + parsedNum);
    }
}

/* Wrapper Objects:
Integer Object: 10
Double Object: 25.75
Character Object: A
Boolean Object: true

Unboxed Values:
Integer: 10
Double: 25.75
Character: A
Boolean: true

Parsed Integer from String: 100
 */