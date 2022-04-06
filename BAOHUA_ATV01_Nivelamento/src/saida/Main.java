package saida;

import i_arvore_binaria.Arquivo;
import i_arvore_binaria.Arvore;
import i_fila_dinamica.FilaDinamica;
import i_lista_encadeada_dupla.ListaDupla;
import i_pilha_dinamica.PilhaDinamica;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){  
    Scanner ler = new Scanner(System.in);
    String Caminho = "src/entrada/Entrada.txt";
      String op;
      String op2;
do{
    System.out.printf("\n\n");
    System.out.printf("    *=======================  Implementaﾃｧoes  =========================*\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         A - Arvore Binaria                 B - Pilha           |\n");
    System.out.printf("    |                                                                |\n");
    System.out.printf("    |         C - Fila                    D - Lista Encadeada        |\n");
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
                  Arvore<String> arvore = new Arvore<String>();
                    Arquivo.Start(Caminho, arvore);
                        do{
                            System.out.printf("\n\n");
                            System.out.printf("    *=======================  Arvore binaria   =========================*\n");
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
                                            System.out.printf("C - CONTINUARR");
                                            System.out.printf("\n");                    
                                            System.out.printf("D - VOLTAR");
                                            System.out.printf("\n");
                                            System.out.printf("\n");
                                            System.out.printf("Digite a opﾃｧﾃ｣o: ");
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
                                        if(arvore.buscar(arvore.getRaiz(),busca)==0)System.out.println("Pessoa nﾃ｣o encontrada"); 
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
                                            System.out.printf("D - QUANTIDADE DE Nﾃ鉄");
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
                                       System.out.println("Quantidade de nﾃｳs: "+arvore.getTamanho());
                                      }
                                      }while(op.contains("B")==false);
                                    break;    
                                      }

                            }while(op.contains("S")==false);
                                System.out.printf("fim\n");
                            }while(op.contains("S")==false);
           break;     
           
            case "B":
                do{
                    PilhaDinamica pilha = new PilhaDinamica();
                    i_pilha_dinamica.ArquivoPilha.Start(Caminho, pilha);

    
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
                                            System.out.printf("\n"); 
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
                                         i_pilha_dinamica.ArquivoPilha.remover(Caminho, pilha); 
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
                                            op2 = ler.next().toUpperCase();

                                      if(op2.contains("A")){
                                        System.out.println(pilha.acessar_topo_pilha());
                                      }

                                      }while(op2.contains("B")==false);
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
                            }while(op.contains("S")==false);
                                     break;    
             
        case "C":
            do{
                

        FilaDinamica fila = new FilaDinamica();
        i_fila_dinamica.ArquivoFila.InserirFinal(Caminho, fila);

    
do{
    System.out.printf("\n\n");
    System.out.printf("    *=======================  Fila   =========================*\n");
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
                fila.inserirElementoUsandoArquivo(Caminho, fila);
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
                 i_fila_dinamica.ArquivoFila.removerInicio(Caminho, fila); 
              }
       
              }while(op.contains("D")==false);
             break;    
             
        case "C":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- BUSCAR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - BUSCAR FILA");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                System.out.println("Digite o nome da pessoa:");
                String busca = ler.next();
                fila.buscarFila(busca);   
              }

              }while(op.contains("B")==false);
             break;  
             
        case "D":
            do{
                    System.out.printf("\n");
                    System.out.printf("----- IMPRIMIR DADOS -----");
                    System.out.printf("\n");
                    System.out.printf("A - IMPRIMIR FILA");
                    System.out.printf("\n");
                    System.out.printf("B - VOLTAR");
                    System.out.printf("\n");
                    System.out.printf("\n");
                    System.out.printf("Digite a opcao: ");
                    op = ler.next().toUpperCase();
                    
              if(op.contains("A")){
                fila.imprimirFila();
              }

              }while(op.contains("B")==false);
            break;    
              }
        
    }while(op.contains("S")==false);
        System.out.printf("fim\n");
    }while(op.contains("S")==false);
             break;  
        case "D":
            do{
        ListaDupla lista = new ListaDupla();
        i_lista_encadeada_dupla.Arquivo.Start(Caminho, lista);
    
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
                    System.out.printf("C - (em manutenﾃｧﾃ｣o)INSERIR ORDENADO");
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
                 i_lista_encadeada_dupla.Arquivo.removerInicio(Caminho, lista); 
              }
              if(op.contains("B")){
                 i_lista_encadeada_dupla.Arquivo.removerFinal(Caminho, lista);
              }
              if(op.contains("C")) {
                 System.out.println("Digite um nome da lista que deseja excluir:");
                 lista.imprimir_lista();
                 String nome = ler.next();
                 i_lista_encadeada_dupla.Arquivo.removerOrdenado(Caminho, lista, nome);
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
    }while(op.contains("S")==false);
            break;    
              }
        
    }while(op.contains("S")==false);
        System.out.printf("fim\n");
    }
}