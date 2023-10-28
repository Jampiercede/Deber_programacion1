package com.mycompany.deber_programacion1;

import java.security.SecureRandom;

public class QuestionGenerator {
    
    SecureRandom random = new SecureRandom();
    
    // Genera dos operandos basados en el nivel de dificultad
    public int[] generateOperands(int difficulty) {
        int lowerBound = (int) Math.pow(10, difficulty - 1);
        int upperBound = (int) Math.pow(10, difficulty) - 1;
        
        int operand1 = lowerBound + random.nextInt(upperBound - lowerBound + 1);
        int operand2 = lowerBound + random.nextInt(upperBound - lowerBound + 1);
        
        return new int[]{operand1, operand2};
    }
    
    // Genera una pregunta en forma de cadena de texto
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
                question = "¿Cuánto es " + operand1 + " x " + operand2 + "?";
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
}
