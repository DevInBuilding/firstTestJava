package i_pilha_dinamica;

public class PilhaDinamica {
    No topo;
    int tamanho;
    //Inicializando a pilha.
    public PilhaDinamica(){
        tamanho = 0;
        topo = null;
    }
    //Função para dizer se a piljha está cheia.
    public boolean pilha_cheia(){
        return topo != null;
    }
    //Função para dizer se a pilha está vazia.
    public boolean pilha_vazia(){
        return topo == null;
    }
    //Inserindo elementos na pilha.
    public String inserir_pilha(String dados){
        No no = new No();
        no.dados = dados;
        no.proximo = topo;
        topo = no;
        tamanho++;
        return dados;
    }
    //Removendo elementos da pilha.
    public String remover_pilha(){
        if(pilha_vazia()){
            return null;
        }
        String dados = topo.dados;
        topo = topo.proximo;
        tamanho--;
        return dados;
    }
    //Acessando o elemento que está no topo da pilha.
    public String acessar_topo_pilha(){
        if(pilha_vazia()){
            return null;
        }
        String dados = topo.dados;
        return dados;
    }
    //Exibindo os elementos da pilha.
    public void exibir_pilha(){
        System.out.printf("Pilha: ");
        No no = new No();
        no=topo;
        while(no != null){
            System.out.printf("\nO elemento é: " + no.dados);
            no = no.proximo;
        }
        System.out.printf("\n");
    }
       public void inserir_dado_final(String dados,String caminho){
        //Instanciando o no.
        i_lista_encadeada_dupla.Arquivo.inserirDadoFinal(caminho, dados);
        inserir_pilha("Name:"+dados);
   }
    
}
