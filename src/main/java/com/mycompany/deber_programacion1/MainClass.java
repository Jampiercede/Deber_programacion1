package com.mycompany.deber_programacion1;

public class MainClass {
    
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        QuestionGenerator qg = new QuestionGenerator();
        AnswerEvaluator ae = new AnswerEvaluator();
        
        int correctAnswers = 0;
        int totalQuestions = 0;
        
        int difficulty = ui.askDifficulty();
        int operationType = ui.askOperationType();
        
        while (correctAnswers < 10) {
            int[] operands = qg.generateOperands(difficulty);
            String question = qg.generateQuestion(operands[0], operands[1], operationType);
            
            ui.showQuestion(question);
            int userAnswer = ui.getUserAnswer();
            
            boolean isCorrect = ae.evaluateAnswer(operands[0], operands[1], userAnswer, operationType);
            
            if (isCorrect) {
                ui.showFeedback("¡Excelente!");
                correctAnswers++;
            } else {
                ui.showFeedback("Inténtalo de nuevo.");
            }
            
            totalQuestions++;
        }
        
        double successRate = (double) correctAnswers / totalQuestions * 100;
        if (successRate < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor");
        } else {
            System.out.println("¡Felicidades, estás listo para pasar al siguiente nivel!");
        }
    }
}

