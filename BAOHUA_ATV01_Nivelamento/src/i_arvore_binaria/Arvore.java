package i_arvore_binaria;

public class Arvore<TIPO extends Comparable> {
    
    private Elemento<TIPO> raiz;
    private int tamanho ;

    public int getTamanho() {
        return tamanho;
    }
    
    public Arvore(){
        this.raiz = null;
    }
    
    public void adicionar(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        this.tamanho++;
        System.out.println("Valor get elemento:"+novoElemento.getValor());
        if (raiz == null){
            this.raiz = novoElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{ //se for maior ou igual
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public Elemento<TIPO> getRaiz() {
        return raiz;
    }
    
    public void emOrdem(Elemento<TIPO> atual){
        if (atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }        
    }
    
    public int buscar(Elemento<TIPO> atual,String valor){
        if (atual != null){
            if(atual.getValor().toString().toLowerCase().contains(valor.toLowerCase())){
                System.out.println("Achei:"+ atual.getValor());
                return 1;
            }
         
          buscar(atual.getEsquerda(),valor);
          buscar(atual.getDireita(),valor);
      
        }
        return 0;
    }
    public void preOrdem(Elemento<TIPO> atual){
        if (atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());            
            preOrdem(atual.getDireita());
        }        
    }
    
    public void posOrdem(Elemento<TIPO> atual){
        if (atual != null){            
            posOrdem(atual.getEsquerda());            
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }        
    }
    
    public boolean remover(TIPO valor){
        //buscar o elemento na ??rvore
        Elemento<TIPO> atual = this.raiz;
        this.tamanho--;
        Elemento<TIPO> paiAtual = null;
        while(atual != null){
            if (atual.getValor().equals(valor)){
                break;                
            }else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado ?? menor que o atual 
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else{
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        //verifica se existe o elemento
        if (atual != null){
            
            //elemento tem 2 filhos ou elemento tem somente filho ?? direita
            if (atual.getDireita() != null){
                
                Elemento<TIPO> substituto = atual.getDireita();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se n??o tem paiAtual, ent??o ?? a raiz
                    this.raiz = substituto;
                    paiSubstituto.setEsquerda(null);
                    this.raiz.setDireita(paiSubstituto);
                    this.raiz.setEsquerda(atual.getEsquerda());
                }
                
                //removeu o elemento da ??rvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
                
            }else if (atual.getEsquerda() != null){ //tem filho s?? ?? esquerda
                Elemento<TIPO> substituto = atual.getEsquerda();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se for a raiz
                    this.raiz = substituto;
                }
                
                //removeu o elemento da ??rvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
            }else{ //n??o tem filho
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(null);
                    }else{
                        paiAtual.setDireita(null);
                    }
                }else{ //?? a raiz
                    this.raiz = null;
                }
            }
            
            return true;
        }else{
            return false;
        }        
    }
}

