// File: SampleProject.java
// Piccolo esempio di progetto Java per Clickworker Work Sample

public class SampleProject {
    public static void main(String[] args) {
        // Messaggio di benvenuto
        System.out.println("Hello Clickworker!");

        // Esempio semplice di array e ciclo
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array values:");
        for(int num : numbers) {
            System.out.println(num);
        }

        // Esempio di funzione semplice
        int sum = sumArray(numbers);
        System.out.println("Sum of array: " + sum);
    }

    // Funzione per sommare i valori di un array
    public static int sumArray(int[] arr) {
        int total = 0;
        for(int n : arr) {
            total += n;
        }
        return total;
    }
}
