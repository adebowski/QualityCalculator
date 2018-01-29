package pl.edu.agh.qualitycalculator;

public class CalculationsVerbalizer {

    public String verbalize(Operation operation, float operand1, float operand2,float operand3, float result) {

        String verbalizedOperation;
        if (operation == Operation.AVERAGE)
        {
            verbalizedOperation = operation.toString()+" ";
            verbalizedOperation += String.valueOf(operand1) + " and ";
            verbalizedOperation += String.valueOf(operand2) + " and ";
            verbalizedOperation += String.valueOf(operand3);
            verbalizedOperation += " gives value ";
            verbalizedOperation += String.valueOf(result);
        }
        else
        {
            verbalizedOperation = String.valueOf(operand1);
            verbalizedOperation += " " + operation.toString() + " ";
            verbalizedOperation += String.valueOf(operand2);
            verbalizedOperation += " " + operation.toString() + " ";
            verbalizedOperation += String.valueOf(operand3);
            verbalizedOperation += " gives value ";
            verbalizedOperation += String.valueOf(result);
        }
        return verbalizedOperation;
    }
}
