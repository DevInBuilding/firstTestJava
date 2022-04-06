package i_fila_dinamica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestaFila {
    public static void main(String[] args) {
        
        try{
        FilaDinamica fila = new FilaDinamica();
        
        //CAMINHO PARA O ARQUIVO
        String entradaFila = "src/entrada/EntradaFila.txt";
        
        //Ler Arquivo
        String conteudo = ArquivoFila.Read(entradaFila);
        if(conteudo.isEmpty()){
            System.err.println("Erro ao ler arquivo");
        } else {
            System.out.println(conteudo);
        }    
        
        //System.out.println(fila);
        
        
        //Menu
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            fila.imprimirFila();
            System.out.println("Escolha uma das opções para manipular pilhas:\n"
                    + "1. Inserir elemento \n"
                    + "2. Buscar elemento \n"
                    + "3. Remover elemento \n"
                    + "4. Imprimir fila\n"
                    + "5. Ver tamanho da fila\n"
                    + "0. Sair\n"
                    + "Digite o número da opção: ");
            opcao = sc.nextInt();
            if(opcao >= 0 && opcao <= 5){
                switch(opcao){
                    case 1 -> {
                        System.out.println("Digite o elemento que deseja inserir: ");
                        String novoElemento = sc.nextLine();
                        ArquivoFila.InserirFinal(entradaFila, fila);
                        //fila.inserirFila(novoElemento);
                        fila.imprimirFila();
                        break;
                    }
                    case 2 -> {
                        System.out.println("Digite o elemento que está procurando: ");
                        String busca = sc.nextLine();
                        fila.buscarFila(busca);
                        break;
                    }
                    case 3 -> {
                        fila.removerElemento();
                        break;
                    }
                    case 4 -> {
                        fila.imprimirFila();
                        break;
                    }
                    case 5 -> {
                        fila.tamanhoFila();
                        break;
                    }
                    default -> {
                            System.exit(0);
                    }
                }
            } else {
                System.out.println("\n\tOpção inválida\n");
            }
        }while(opcao != 0);
        sc.close();
        
        }catch(Exception exc){
            System.err.println("ERRO: " + exc + "\nDica: Não insira caracteres no lugar de números.");
        }
    }
}
