
package i_pilha_dinamica;

import i_fila_dinamica.FilaDinamica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArquivoPilha extends PilhaDinamica  {
      public static String Read(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
      
      //Esta função irá ler o arquivo txt e cada linha irá virar uma info para a lista .
      public static boolean Start(String Caminho,PilhaDinamica pilha){
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            ArrayList<String> salvar = new ArrayList();
            try {
                linha = lerArq.readLine();
                
                //Irá passar por todo arquivo.txt e salvar cada linha em um arraylist 
                while(linha!=null){                                     
                    salvar.add(linha);
                    linha = lerArq.readLine();                       
                }
                
                // irá roda todo o ArrayList e salvar cada elemento na lista
                for(int i=0; i<salvar.size();i++){    
                    pilha.inserir_pilha(salvar.get(i));

                    //System.out.println(salvar.get(i));
                }
                arq.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return false;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return false;
        }
    }
    
      //Escreve no arquivo.txt
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    //Remove um elemnto do arquivo.txt
    
    
     public static boolean remover(String Caminho,PilhaDinamica pilha){
        
          try {
            //Reseto a posição para usar como parametro
            
            FileReader fr = new FileReader(Caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            
            //Roda todo arquivo.txt
            while(linha != null){
                salvar.add(linha);
                linha = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(Caminho, true);
            fw2.close();
            
            FileWriter fw = new FileWriter(Caminho);
            BufferedWriter bw= new BufferedWriter(fw);
            
            //escreve no arquivo.txt sem o dado que deseja remover
            for(int i =0; i<(salvar.size()-1);i++){
                bw.write("Name:"+salvar.get(i).split(":")[1]);
                bw.newLine();
            }
            bw.close();
            fw.close();
            pilha.remover_pilha();
            return true;
       }catch(IOException ex){
       
       }             
     return true;
    }
         

         public static boolean inserirDadoInicio(String Caminho,String dado){
        
        try {
            FileReader fr = new FileReader(Caminho);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            
            while(linha != null){
                 salvar.add(linha);  
                 linha = br.readLine();
            }
            br.close();
            fr.close();
            
            //Limpa o arquivo txt
            FileWriter fw2 = new FileWriter(Caminho, true);
            fw2.close();
            
            //inicia o buffer
            FileWriter fw = new FileWriter(Caminho);
            BufferedWriter bw= new BufferedWriter(fw);
            
            //adiciona o novo dado
            bw.write("Name:"+dado);
            bw.newLine();
            
            //faz a copia do arquivo original
            for(int i =0; i<(salvar.size());i++){
                bw.write("Name:"+salvar.get(i).split(":")[1]);
                bw.newLine();
            }
            
            
      
            bw.close();
            fw.close();
            return true;
       }catch(IOException ex){
       
       }             
     return true;
    
    }

}
