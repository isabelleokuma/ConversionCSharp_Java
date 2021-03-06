package Program;

import java.io.Console;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        String opcao = "", valor;
        int posicao;
        List minhaLista = new List();
        Scanner scan = new Scanner(System.in);
        System.out.println("Sistema em Java para testar execução de lista estática\n");

        do {
            try {
                System.out.println("Digite: \n 1-> Inserir no início \n " +
                        "2-> Inserir no fim \n " +
                        "3-> Inserir em uma posição (lembre-se que inicia do do zero!)\n " +
                        "4-> Tamanho \n 5-> Listar \n " +
                        "6-> Remover elemento de uma posição \n 9-> Sair");
                opcao = scan.nextLine();

                switch (opcao)
                {
                    case "1":
                        System.out.println("Digite um valor para inserir no início");
                        valor= scan.nextLine();
                        minhaLista.InsereNoInicio(valor);
                        break;
                    case "2":
                        System.out.println("Digite um valor para inserir no fim");
                        valor= scan.nextLine();
                        minhaLista.InsereNoFim(valor);
                        break;
                    case "3":
                        System.out.println("Digite um valor para inserir:");
                        valor = scan.nextLine();
                        System.out.println("Digite a posição:");
                        posicao = Integer.parseInt(scan.nextLine());
                        minhaLista.InsereNaPosicao(posicao, valor);
                        break;
                    case "4":
                        System.out.println("Tamanho da lista: " + minhaLista.Tamanho());
                        break;
                    case "5":
                        minhaLista.ImprimeLista();
                        break;
                    case "6":
                        System.out.println("Digite a posição que deseja remover:");
                        posicao = Integer.parseInt(scan.nextLine());
                        System.out.println("Removido: "+ minhaLista.RemoveDaPosicao(posicao));
                        break;
                    case "9":
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!!!");
                        break;
                }
            }
            catch(Exception erro) {
                System.out.println(erro.getMessage());
            }

        } while(opcao!="9");
    }
}

