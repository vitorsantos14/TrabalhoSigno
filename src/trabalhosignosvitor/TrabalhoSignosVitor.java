/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhosignosvitor;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class TrabalhoSignosVitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //declaração
        Scanner ler = new Scanner(System.in);
        String nome, nomeFinal, sexoTexto = null, signo = "", cor = "";
        int sexo, dia, mes, ano, anoAtual = 2025, idade;
        int numeroSorte, numCor;
        boolean dataValida = true;

        //entrada de dados
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        if (nome.length() < 8) {
            nomeFinal = "Seu nome não foi informado corretamente";
        } else {
            nomeFinal = nome;
        }

        System.out.print("Digite seu sexo (1 para Feminino, 2 para Masculino): ");
        sexo = ler.nextInt();
        if (sexo != 1 && sexo != 2) {
            sexo = 2;
        }

        System.out.print("Digite o dia de nascimento: ");
        dia = ler.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        mes = ler.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        ano = ler.nextInt();


        //processamento

        // validações de data
        if (ano < 1900 || ano > anoAtual) {
            dataValida = false;
        }

        if (mes < 1 || mes > 12) {
            dataValida = false;
        }

        if (dia < 1 || dia > 31) {
            dataValida = false;
        }

        // meses com 30 dias
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dataValida = false;
        }

        // fevereiro
        if (mes == 2 && dia > 28) {
            dataValida = false;
        }

        if (!dataValida) {  //se a variavel for falsa...
            System.out.println(sexoTexto + nomeFinal + " data inserida inválida. " + "Encerrando o programa.");
            return;
        }

        // cálculo da idade (simplificado)
        idade = anoAtual - ano;

        // descobrir signo
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricórnio";
        }

        // número da sorte
        numeroSorte = 1 + (int) (Math.random() * 99);

        // cor da sorte
        numCor = 1 + (int) (Math.random() * 5);
        switch (numCor) {
            case 1:
                cor = "Vermelho";
                break;
            case 2:
                cor = "Verde";
                break;
            case 3:
                cor = "Azul";
                break;
            case 4:
                cor = "Branco";
                break;
            default:
                cor = "Roxo";
                break;
        }

        // saída
        if (sexo == 1) {
            sexoTexto = "Sra.";
        } else {
            sexoTexto = "Sr.";
        }

        System.out.println(sexoTexto + " " + nomeFinal + ", nascido(a) em " + dia + "/" + mes + "/" + ano +
                ", é do signo de " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " +
                numeroSorte + " e sua cor é " + cor + ".");
    }
}