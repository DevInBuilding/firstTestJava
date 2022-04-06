package i_arvore_binaria;

import java.util.Scanner;

public class TestaArvore {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Arvore<String> arvore = new Arvore<String>();
        String Caminho = "src/entrada/Entrada.txt";
        Arquivo.Start(Caminho, arvore);
        String op;
    
do{
    System.out.printf("\n\n");
    System.out.printf("    *=======================  Arvore binaria   =========================*\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         A - INSERIR                   B - REMOVER              |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         C - BUSCAR                    D - IMPRIMIR             |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                                                                |\n");
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
                    System.out.printf("C - CONTINUARR");
                    System.out.printf("\n");                    
                    System.out.printf("D - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opção: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("C")){
                System.out.println("Digite um nome:");
                String dados = ler.next();
                arvore.adicionar("Name:"+dados);
                Arquivo.inserirDado(Caminho, dados);
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
                 System.out.println("Digite um nome que deseja excluir da lista abaixo:");
                 arvore.emOrdem(arvore.getRaiz());
                 String remove = ler.next();
                 arvore.remover("Name:"+remove);
                 Arquivo.removerOrdenado(Caminho, remove);
              }
       
              }while(op.contains("D")==false);
             break;    
             
        case "C":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- BUSCAR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - BUSCAR Arvore");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                System.out.println("Digite o nome da pessoa:");
                String busca = ler.next();
                if(arvore.buscar(arvore.getRaiz(),busca)==0)System.out.println("Pessoa não encontrada");
               // fila.buscarFila(busca);   
              }

              }while(op.contains("B")==false);
             break;  
             
        case "D":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- IMPRIMIR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - IMPRIMIR ARVORE");
                    System.out.printf("\n");
                    System.out.printf("D - QUANTIDADE DE NÓS");
                    System.out.printf("\n");                    
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
               arvore.emOrdem(arvore.getRaiz());
              }
              if(op.contains("D")){
               System.out.println("Quantidade de nós: "+arvore.getTamanho());
              }
              }while(op.contains("B")==false);
            break;    
              }
        
    }while(op.contains("S")==false);
        System.out.printf("fim\n");
    }
}
