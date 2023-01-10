//Atividade 1

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double salario;
        double abono;
        double novoSalario;

        System.out.println("Digite o salário");
        salario = ler.nextDouble();

        System.out.println("Digite o abono");
        abono = ler.nextDouble();

        novoSalario = salario + abono;

        System.out.printf("\nO novo salário é %.2f", novoSalario);

        ler.close();

    }
}


//Atividade 2

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        System.out.println("Informe a primeira nota");
        nota1 = ler.nextFloat();

        System.out.println("Informe a segunda nota");
        nota2 = ler.nextFloat();

        System.out.println("Informe a terceira nota");
        nota3 = ler.nextFloat();

        System.out.println("Informe a quarta nota");
        nota4 = ler.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("\nA média é %.1f", media);
    }
}


//Atividade 3

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salarioBruto;
        float adicionalNoturno;
        float horasExtras;
        float descontos;
        float salarioLiquido;

        System.out.println("Informe o salário bruto:");
        salarioBruto = ler.nextFloat();

        System.out.println("Informe o adicional noturno:");
        adicionalNoturno = ler.nextFloat();

        System.out.println("Informe as horas extras:");
        horasExtras = ler.nextFloat();

        System.out.println("Informe o desconto:");
        descontos = ler.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("\nO salário líquido é %.2f", salarioLiquido);

    }
}


//Atividade 4

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float numero1;
        float numero2;
        float numero3;
        float numero4;
        float diferenca;

        System.out.print("Digite o primeiro número: ");
        numero1 = ler.nextFloat();

        System.out.print("Digite o segundo número: ");
        numero2 = ler.nextFloat();

        System.out.print("Digite o terceiro número: ");
        numero3 = ler.nextFloat();

        System.out.print("Digite o quarto número: ");
        numero4 = ler.nextFloat();

        diferenca = (numero1 * numero2) - (numero3 * numero4);

        System.out.printf("A diferença do produto entre o número 1 e 2 e do produto do número 3 e 4 é igual %.1f", diferenca);

        ler.close();
    }
}
