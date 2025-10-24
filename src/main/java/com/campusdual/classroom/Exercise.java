package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        System.out.println("Sumar los 10 primeros números positivos.");
        sumFirstNaturalNumbers(10);
        System.out.println("Mostrar los 20 primeros números naturales positivos.");
        showFirstNaturalNumbers(20);
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "");
        }
        System.out.println();


    }

}
