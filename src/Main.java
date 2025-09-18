//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));
        int intOperandA = 5;
        int intOperandB = 10;
        int intSum = intOperandA + intOperandB;
        System.out.println("The sum of" + intOperandA + " and " + intOperandB + " is " + intSum);

        double doubleOperandA = 5.5;
        double doubleOperandB = 10.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        // rest of the int expressions here
    }

}