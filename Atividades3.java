//Exercicio1

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Digite um número: ");
        numero1 = ler.nextInt();

        System.out.print("Digite um número maior que o primeiro: ");
        numero2 = ler.nextInt();

        if (numero1 < numero2){
            for (; numero1 < numero2; numero1++) {
                if (numero1 % 3 == 0 && numero1 % 5 == 0) {
                    System.out.println("O número " + numero1 + " é múltiplo de 3 e 5. \n" + numero1);
                }
            }
        }else System.out.println("Intervalo inválido.");
    }
}


//Exercicio3

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner ler = new  Scanner(System.in);

        int idade = 0, menorQue21 = 0, maiorQue50 = 0;

        while (idade >= 0){
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            if (idade < 21) {
                menorQue21++;
            }else if (idade > 50){
                maiorQue50++;
            }else
                System.out.println("Digite outra idade ou se quiser sair digite uma idade negativa.");

            System.out.println(idade);
        }
        System.out.println("Foram digitadas " + menorQue21 + " idades menores que 21 anos.");
        System.out.println("Foram digitadas " + maiorQue50 + " idades maiores que 51 anos.");

    }

}

//Exercicio5

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, somaDosNumeros = 0;

        do {
            System.out.print("Digite um número: ");
            numero = ler.nextInt();

            if (numero > 0){
                System.out.println("Número digitado: " + numero);
                somaDosNumeros += numero;
            }else {
                System.out.println("Número inválido.");
            }

        }while (numero != 0);
        System.out.println("A soma dos números digitados é " + somaDosNumeros);
    }
}