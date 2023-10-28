package com.mycompany.deber_programacion1;
import java.security.SecureRandom;

public class QuestionGenerator {
    
    private SecureRandom random = new SecureRandom();
    
    public String generateQuestion(int difficulty, int operationType) {
        int operand1 = getRandomNumber(difficulty);
        int operand2 = getRandomNumber(difficulty);
        switch (operationType) {
            case 1:
                return "¿Cuánto es " + operand1 + " más " + operand2 + "?";
            case 2:
                return "¿Cuánto es " + operand1 + " menos " + operand2 + "?";
            case 3:
                return "¿Cuánto es " + operand1 + " por " + operand2 + "?";
            case 4:
                return "¿Cuánto es " + operand1 + " dividido " + operand2 + "?";
            default:
                return "Operación no soportada";
        }
    }
    
    private int getRandomNumber(int difficulty) {
        int bound = (int) Math.pow(10, difficulty) - 1;
        return random.nextInt(bound) + 1;
    }
}

