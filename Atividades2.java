//Exercicio1

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a;
        int b;
        int c;
        int soma;

        System.out.print("Digite o primeiro número: ");
        a = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        b = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = ler.nextInt();

        soma = a + b;

        if (soma > c){
            System.out.println("A soma de " + a + " + " + b +" é maior que " + c);
        }else if (soma == c){
            System.out.println("A soma de " + a + " + " + b +" é igual a " + c);
        }else {
            System.out.println("A soma de " + a + " + " + b +" é menor que " + c);
        }
    }
}


//Exercicio2

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = ler.nextInt();

        if (numero % 2 == 0 && numero >= 0){
            System.out.println("Número par positivo.");
        }else if (numero % 2 == 0 && numero < 0){
            System.out.println("Número par negativo.");
        }else if ((numero % 2 != 0) && (numero >= 0)){
            System.out.println("Número ímpar positivo.");
        }else {
            System.out.println("Número ímpar negativo.");
        }
    }
}


//Exercicio3

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero, quantidade;
        double preco, total;

        System.out.println("===  Escolha uma opção ===\n" +
                "1 - Cachorro-quente - R$ 10.00\n" +
                "2 - X-Salada R$ 15.00\n" +
                "3 - X-Bacon R$ 18.00\n" +
                "4 - Bauru R$ 12.00\n" +
                "5 - Refrigerante R$ 8.00\n" +
                "6 - Suco de laranja R$ 13.00\n" +
                "\nDigite sua escolha:");
        numero = ler.nextInt();
        System.out.println("Qual a quantidade do produto selecionado?");
        quantidade = ler.nextInt();

        switch (numero){
            case 1:
                preco = 10.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " Cachorro-quente\nO total do seu pedido é de R$ %.2f", total);
                break;
            case 2:
                preco = 15.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " X-Salada\nO total do seu pedido é de R$ %.2f", total);
                break;
            case 3:
                preco = 18.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " X-Bacon\nO total do seu pedido é de R$ %.2f", total);
                break;
            case 4:
                preco = 12.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " Bauru\nO total do seu pedido é de R$ %.2f", total);
                break;
            case 5:
                preco = 8.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " Refrigerante\nO total do seu pedido é de R$ %.2f", total);
                break;
            case 6:
                preco = 13.00;
                total = quantidade * preco;
                System.out.printf(quantidade + " Suco de Laranja\nO total do seu pedido é de R$ %.2f", total);
                break;
            default:
                System.out.println("Produto não encontrado.");

        }

    }
}


//Exercicio4

package Atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade;
        int opcao;

        System.out.print("Digite a idade para saber se está apto ou não para votar: ");
        idade = leia.nextInt();

        if (idade >= 16 && idade < 18){
            opcao = 1;
        }else if (idade >= 18 && idade < 65){
            opcao = 2;
        }else if (idade >= 65){
            opcao = 3;
        }else {
            opcao = 4;
        }

        switch (opcao) {
            case 1:
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
                break;
            case 2:
                System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
                break;
            case 3:
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
                break;
            case  4:
                System.out.println("A pessoa não está apta a votar.");
                break;
            default:
                System.out.println("Idade inválida.");
        }

    }
}

