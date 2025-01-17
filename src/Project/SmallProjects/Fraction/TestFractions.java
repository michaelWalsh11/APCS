package Project.SmallProjects.Fraction;

/**
 * This is a test class for the Fraction class
 * Author: Blair
 */

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  1/17/25
 * <p>
 * Assignment:   	Fraction classes
 * <p>
 * Attribution: I worked with Miller
 * <p>
 * General Description:   I added some test cases and a test method
 * <p>
 * Advanced:  	Self Documenting Code
 *
 */

public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);

    Fraction subtract = f1.subtract(f2);
    System.out.println(f1 + " - " + f2 + " = " + subtract);

    Fraction divide = f1.divide(f2);
    System.out.println(f1 + " / " + f2 + " = " + divide);

    System.out.println();
  }

  public static void testArithmeticWholeNumbers()
  {
    Fraction f1 = new Fraction(1, 2);
    int m = 3;

    Fraction sum = f1.add(m);
    System.out.println(f1 + " + " + m + " = " + sum);

    Fraction product = f1.multiply(m);
    System.out.println(f1 + " * " + m + " = " + product);

    Fraction subtract = f1.subtract(m);
    System.out.println(f1 + " - " + m + " = " + subtract);

    Fraction divide = f1.divide(m);
    System.out.println(f1 + " / " + m + " = " + divide);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmeticWholeNumbers();
    testArithmetic();
    testValues();
  }
}
