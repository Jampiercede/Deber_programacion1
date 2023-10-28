package com.mycompany.deber_programacion1;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner = new Scanner(System.in);
    
    public int askDifficulty() {
        System.out.println("Elige el nivel de dificultad (1: fácil, 2: medio, etc.): ");
        return scanner.nextInt();
    }
    
    public int askOperationType() {
        System.out.println("Elige el tipo de operación (1: suma, 2: resta, 3: multiplicación, 4: división): ");
        return scanner.nextInt();
    }
    
    public int getUserAnswer() {
        System.out.println("Ingresa tu respuesta: ");
        return scanner.nextInt();
    }
    
    public void showQuestion(String question) {
        System.out.println(question);
    }
    
    public void showFeedback(String feedback) {
        System.out.println(feedback);
    }
}

