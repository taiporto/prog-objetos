package org.taiporto.lista1;

import java.util.Scanner;

// Calcule o retorno de um investimento financeiro fazendo as contas mês a mês, sem usar a
// fórmula de juros compostos. O usuário deve informar quanto será investido por mês e
// qual será a taxa de juros mensal. O programa deve informar o saldo do investimento após
// um ano (soma das aplicações mês a mês considerando os juros compostos), e perguntar ao
// usuário se ele deseja que seja calculado o ano seguinte, sucessivamente. Por exemplo,
// caso o usuário deseje investir R$ 100,00 por mês, e tenha uma taxa de juros de 1% ao mês,
// o programa forneceria a seguinte saída:
// Saldo do investimento após 1 ano: 1280.9328043328942
// Deseja processar mais um ano? (S/N)
public class ex10 {

    public static void main(String[] args) {
        String processarMais;

        Scanner teclado = new Scanner(System.in);

        do {
            float somaTotal = 0f;

            System.out.print("Insira o investimento mensal: ");
            float investimentoMensal = teclado.nextFloat();
            teclado.nextLine();
            System.out.print("Insira a taxa de juros mensal: ");
            float taxaDeJurosMensal = Float.parseFloat(teclado.nextLine().trim());

            for (int i = 0; i <= 11; i++) {
                float somaMes = somaTotal + investimentoMensal;
                float jurosMes = somaMes * taxaDeJurosMensal;
                somaTotal += investimentoMensal + jurosMes;
            }

            System.out.println("Saldo do investimento após 1 ano: " + somaTotal);
            System.out.print("Deseja processar mais um ano? (S/N) ");
            processarMais = teclado.nextLine();
        } while (processarMais.equalsIgnoreCase("S"));

        teclado.close();
    }

}
