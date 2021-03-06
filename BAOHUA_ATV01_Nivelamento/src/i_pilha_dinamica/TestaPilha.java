package i_pilha_dinamica;
import i_arvore_binaria.Arvore;
import i_fila_dinamica.FilaDinamica;
import i_lista_encadeada_dupla.ListaDupla;
import java.util.Scanner;


public class TestaPilha {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        PilhaDinamica pilha = new PilhaDinamica();
        String Caminho = "src/entrada/Entrada.txt";
        ArquivoPilha.Start(Caminho, pilha);
        String op;
    
do{
    System.out.printf("\n\n");
    System.out.printf("    *=======================  Pilha   =========================*\n");
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
                    System.out.printf("C - Continuar");
                    System.out.printf("\n");                    
                    System.out.printf("D - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("C")){
                System.out.println("Digite um nome:");
                String dados = ler.next();
                pilha.inserir_dado_final(dados, Caminho);
                System.out.println("Inserido com sucesso!");
              }
       
              }while(op.contains("D")==false);
           break;     
           
            case "B":
                do{
                    System.out.printf("\n");
                    System.out.printf("----- REMOVER DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("C - CONTINUAR");
                    System.out.printf("\n");                    
                    System.out.printf("D - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("C")){
                 //lista.remover_lista_final(); 
                 ArquivoPilha.remover(Caminho, pilha); 
              }
       
              }while(op.contains("D")==false);
             break;    
             
        case "C":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- BUSCAR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - ACESSAR O TOPO");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                System.out.println(pilha.acessar_topo_pilha());
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
                pilha.exibir_pilha();
              }

              }while(op.contains("B")==false);
            break;    
              }
        
    }while(op.contains("S")==false);
        System.out.printf("fim\n");
    }
}
