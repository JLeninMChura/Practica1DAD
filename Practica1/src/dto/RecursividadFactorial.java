package dto;

public class RecursividadFactorial {

    int factorial;

    public RecursividadFactorial() {
        factorial = 1;
    }

    public int Factorial(int numero) {
        int numero2 = numero - 1;
        if (numero > 1) {
            factorial = factorial * numero * numero2;
            numero = numero - 2;
            Factorial(numero);

       }

       return factorial;

    }
}