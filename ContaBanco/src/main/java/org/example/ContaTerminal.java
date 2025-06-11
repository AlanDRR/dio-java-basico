package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgenciaBancaria = scanner.nextInt();

        System.out.println("Por favor, agora digite o número da sua conta bancária !");
        int numeroContaBancaria = scanner.nextInt();

        System.out.println("Por favor, agora nos diga como se chama !");
        String nomeCliente = scanner.next();

        System.out.println("Agora por último, por favor nos diga quanto de saldo possui em sua conta bancária !");
        int saldoContaBancaria = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é a %s, conta %s e seu saldo de R$%s já está disponível para saque.", nomeCliente, numeroAgenciaBancaria, numeroContaBancaria, saldoContaBancaria);

    }
}