
package i_lista_encadeada_dupla;
import java.util.Scanner;

public class TestaLista {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ListaDupla lista = new ListaDupla();
        String Caminho = "src/entrada/Entrada.txt";
        Arquivo.Start(Caminho, lista);
        String op;
    
do{
    System.out.printf("\n\n");
    System.out.printf("    *=======================  Lista Dupla   =========================*\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         A - INSERIR                   B - REMOVER              |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         C - BUSCAR                    D - IMPRIMIR             |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         E - VOLTAR                                             |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                        S - SAIR                                |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    ==================================================================\n");
    System.out.printf("\n    Digite...: ");
    op = ler.next().toUpperCase();
        switch(op){
            
            case "A":
                do{
                    System.out.printf("\n");
                    System.out.printf("----- INSERIR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - INSERIR INICIO");
                    System.out.printf("\n");
                    System.out.printf("B - INSERIR FINAL");
                    System.out.printf("\n");
                    System.out.printf("C - (em manutenção)INSERIR ORDENADO");
                    System.out.printf("\n");
                    System.out.printf("D - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                System.out.println("Digite um nome:");
                String dados = ler.next();
                lista.inserir_dado_inicio(dados, Caminho);
                System.out.println("Inserido com sucesso!");
              }
              if(op.contains("B")){
                System.out.println("Digite um nome:");
                String dados = ler.next();
                lista.inserir_dado_final(dados, Caminho);
                System.out.println("Inserido com sucesso!");
              }
              if(op.contains("C")) {
                lista.inserir_lista_ordenada(3,"");
              }
       
              }while(op.contains("D")==false);
           break;     
           
            case "B":
                do{
                    System.out.printf("\n");
                    System.out.printf("----- REMOVER DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - REMOVER INICIO");
                    System.out.printf("\n");
                    System.out.printf("B - REMOVER FINAL");
                    System.out.printf("\n");
                    System.out.printf("C - REMOVER ORDENADO");
                    System.out.printf("\n");
                    System.out.printf("D - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                 //lista.remover_lista_final(); 
                 Arquivo.removerInicio(Caminho, lista); 
              }
              if(op.contains("B")){
                 Arquivo.removerFinal(Caminho, lista);
              }
              if(op.contains("C")) {
                 System.out.println("Digite um nome da lista que deseja excluir:");
                 lista.imprimir_lista();
                 String nome = ler.next();
                 Arquivo.removerOrdenado(Caminho, lista, nome);
              }
       
              }while(op.contains("D")==false);
             break;    
             
        case "C":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- BUSCAR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - BUSCAR LISTA");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                System.out.println("Digite o nome da pessoa:");
                String busca = ler.next();
                lista.busca_lista_id(busca);   
              }

              }while(op.contains("B")==false);
             break;  
             
        case "D":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- IMPRIMIR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - IMPRIMIR LISTA");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                lista.imprimir_lista();    
              }

              }while(op.contains("B")==false);
            break;    
              }
        
    }while(op.contains("S")==false);
        System.out.printf("fim\n");
    }
}
