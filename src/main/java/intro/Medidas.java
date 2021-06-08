// 1 - Pacote
package intro;

// 2 - Referência bibliotecas

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        // Condicional = verificar uma condicao - fazer uma pergunta para uma pessoa, um hardware ou software

        // utilizar a classe Scanner do JAVA para ler a escolha do usuario no console

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software.

        //String opcao = "melancia";

        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU DE OPCOES");
        System.out.println("C - Calcular Area Modo Curto");
        System.out.println("E - Calcular Area modo Extenso");
        System.out.println("I - If simples");
        System.out.println("Digite a opcao desejada: ");
        String opcao = scanner.next();

        switch (opcao){
            case "I":
            case "i":
                System.out.println("Voce escolheu executar o metodo ifSimples");
                ifSimples();
                break;

            case "C":
            case "c":
                System.out.println("Voce escolheu executar o metodo calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;

            case "E":
            case "e":
                System.out.println("Voce escolheu executar o metodo calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;

            default:
                System.out.println("Voce escolheu outro valor que nao tem uma acao associada");
                break;
        }

    }

    public  static void ifSimples(){
        // Condicional = verificar uma condicao - fazer uma pergunta para uma pessoa, um hardware ou software
        // if = se
        // else = senão

        String modo = "curto";
        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de Areas Modo Curto");

        // calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area e de " + largura*comprimento + "m²");
    }
    
    public static void calcularAreaModoExtenso(){
        System.out.println("Calculo de Areas Modo Extenso");

        // Calculo da area - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6; // comprimento recebe 3
        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " +
                comprimento + "m a area e de " + resultado + "m²");
    }

}
