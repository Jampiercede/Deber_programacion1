package com.mycompany.deber_programacion1;

public class AnswerEvaluator {
    
    public boolean evaluateAnswer(int operand1, int operand2, int userAnswer, int operationType) {
        int correctAnswer = 0;
        switch (operationType) {
            case 1:
                correctAnswer = operand1 + operand2;
                break;
            case 2:
                correctAnswer = operand1 - operand2;
                break;
            case 3:
                correctAnswer = operand1 * operand2;
                break;
            case 4:
                if(operand2 != 0) {
                    correctAnswer = operand1 / operand2;
                }
                break;
        }
        return userAnswer == correctAnswer;
    }
}

