package com.mycompany.deber_programacion1;
import java.util.Random;

public class QuestionGenerator {
    
    private Random random;

    public QuestionGenerator() {
        this.random = new Random();
    }
    
    public int[] generateOperands(int difficulty) {
        int[] operands = new int[2];
        operands[0] = random.nextInt(difficulty * 10) + 1;
        operands[1] = random.nextInt(difficulty * 10) + 1;
        return operands;
    }
    
    public String generateQuestion(int operand1, int operand2, int operationType) {
        String question = "";
        switch(operationType) {
            case 1:
                question = "¿Cuánto es " + operand1 + " + " + operand2 + "?";
                break;
            case 2:
                question = "¿Cuánto es " + operand1 + " - " + operand2 + "?";
                break;
            case 3:
                question = "¿Cuánto es " + operand1 + " * " + operand2 + "?";
                break;
            case 4:
                question = "¿Cuánto es " + operand1 + " / " + operand2 + "?";
                break;
            default:
                question = "Operación no válida";
                break;
        }
        return question;
    }
    
    public int calculateAnswer(int operand1, int operand2, int operationType) {
        int answer = 0;
        switch(operationType) {
            case 1:
                answer = operand1 + operand2;
                break;
            case 2:
                answer = operand1 - operand2;
                break;
            case 3:
                answer = operand1 * operand2;
                break;
            case 4:
                if(operand2 != 0) {
                    answer = operand1 / operand2;
                }
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
        return answer;
    }
}

