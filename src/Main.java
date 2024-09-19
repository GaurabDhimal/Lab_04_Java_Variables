public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 13;
        int intOperandB = 10;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 9.99;
        double doubleOperandB = 6.66;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using two ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using two ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using two ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using two ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The Modulo using two ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using two doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using two doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = intOperandA - intOperandB;
        System.out.println("The difference using two doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using two doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The Modulo using two doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);


        double lunchCost = 15.50;


    }
}