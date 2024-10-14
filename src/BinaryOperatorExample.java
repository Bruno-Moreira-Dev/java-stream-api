import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado1 = numeros.stream().reduce(0, somar);
        int resultado2 = numeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma dos números do resultado 1 é: " + resultado1);
        System.out.println("A soma dos números do resultado 2 é: " + resultado2);
    }
}
