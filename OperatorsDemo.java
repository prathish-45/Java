public class OperatorsDemo {
  public static void main(String[] args) {
      // Arithmetic Operators
      int a = 10, b = 5;
      System.out.println("Arithmetic Operators:");
      System.out.println("Addition: " + (a + b));
      System.out.println("Subtraction: " + (a - b));
      System.out.println("Multiplication: " + (a * b));
      System.out.println("Division: " + (a / b));
      System.out.println("Modulus: " + (a % b));

      // Relational Operators
      System.out.println("\nRelational Operators:");
      System.out.println("a > b: " + (a > b));
      System.out.println("a < b: " + (a < b));
      System.out.println("a >= b: " + (a >= b));
      System.out.println("a <= b: " + (a <= b));
      System.out.println("a == b: " + (a == b));
      System.out.println("a != b: " + (a != b));

      // Logical Operators
      boolean x = true, y = false;
      System.out.println("\nLogical Operators:");
      System.out.println("x && y: " + (x && y));
      System.out.println("x || y: " + (x || y));
      System.out.println("!x: " + (!x));

      // Assignment Operators
      int c = 10;
      System.out.println("\nAssignment Operators:");
      c += 5;  // c = c + 5
      System.out.println("c += 5: " + c);
      c -= 3;  // c = c - 3
      System.out.println("c -= 3: " + c);
      c *= 2;  // c = c * 2
      System.out.println("c *= 2: " + c);
      c /= 4;  // c = c / 4
      System.out.println("c /= 4: " + c);
      c %= 3;  // c = c % 3
      System.out.println("c %= 3: " + c);

      // Bitwise Operators
      int p = 5, q = 3;
      System.out.println("\nBitwise Operators:");
      System.out.println("p & q: " + (p & q));  // AND
      System.out.println("p | q: " + (p | q));  // OR
      System.out.println("p ^ q: " + (p ^ q));  // XOR
      System.out.println("~p: " + (~p));        // NOT
      System.out.println("p << 1: " + (p << 1)); // Left Shift
      System.out.println("p >> 1: " + (p >> 1)); // Right Shift
      System.out.println("p >>> 1: " + (p >>> 1)); // Zero-fill Right Shift

      // Conditional (Ternary) Operator
      int num1 = 10, num2 = 20;
      int min = (num1 < num2) ? num1 : num2;
      System.out.println("\nConditional (Ternary) Operator:");
      System.out.println("Minimum of " + num1 + " and " + num2 + " is " + min);
  }
}

/* 
Arithmetic Operators:
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Modulus: 0

Relational Operators:
a > b: true
a < b: false
a >= b: true
a <= b: false
a == b: false
a != b: true

Logical Operators:
x && y: false
x || y: true
!x: false

Assignment Operators:
c += 5: 15
c -= 3: 12
c *= 2: 24
c /= 4: 6
c %= 3: 0

Bitwise Operators:
p & q: 1
p | q: 7
p ^ q: 6
~p: -6
p << 1: 10
p >> 1: 2
p >>> 1: 2

Conditional (Ternary) Operator:
Minimum of 10 and 20 is 10

 */