package i_fila_dinamica;

import java.io.File;
import java.io.IOException;

public class FilaDinamica {
    No inicio;
    No fim;
    int tamanho;
    
    public FilaDinamica(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }
    
    public boolean filaVazia(){
        return inicio == null;
    }
    
    public void inserirFila(String elemento){
        No novoNo = new No();
        novoNo.elemento = elemento;
        novoNo.proximo = null;
        if(fim == null){
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
        }
        fim = novoNo;
        tamanho++;
    }
    
    public void removerElemento(){
        if(filaVazia()){
            System.out.println("\nFila Vazia\n");
        } else {
            if(inicio == fim){
                inicio = null;
                fim = null;
            } else {
                No atual = inicio;
                inicio = inicio.proximo;
                atual = null;
            }
            tamanho--;
            System.out.println("\nElemento removido\n");
            imprimirFila();
        }
    }
    
    
    public void buscarFila(String elemento){
        if(filaVazia()){
            System.out.println("\nFila vazia\n");
        } else {
            No noBusca = inicio;
            while(noBusca != null && !(noBusca.elemento.equals(elemento))){
                noBusca = noBusca.proximo;
            }
            if(noBusca == null){
                System.out.println("\nElemento " + elemento + " não encontrado\n");
            } else {
                elemento = noBusca.elemento;
                System.out.println("\nElemento " + elemento + " encontrado\n");
            }
        }
    }
    
    public void tamanhoFila(){
        if(filaVazia()){
            tamanho = 0;
        }
        System.out.println("\nTamanho da fila: " + tamanho);
    }
    
    public void imprimirFila(){
        if(filaVazia()){
            System.out.println("\nFila vazia\n");
        } else {
            String printaFila = "Fila:\n";
            No lerNo = inicio;
            while(lerNo != null){
                printaFila += lerNo.elemento + "\n";
                lerNo = lerNo.proximo;
            }
            System.out.println(printaFila);
        }
    }
    
    //INSERIR DADO A PARTIR DO ARQUIVO
    public void inserirElementoUsandoArquivo(String caminho, FilaDinamica fila){
        i_fila_dinamica.ArquivoFila.InserirFinal(caminho, fila);
        imprimirFila();
    }
    
    //REMOVER DADO A PARTIR DO ARQUIVO
    public void removerElementoUsandoArquivo(String caminho, FilaDinamica fila){
        i_fila_dinamica.ArquivoFila.removerInicio(caminho, fila);
        imprimirFila();
    }
}
