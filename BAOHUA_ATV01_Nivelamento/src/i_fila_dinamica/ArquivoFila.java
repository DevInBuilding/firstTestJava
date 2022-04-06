package i_fila_dinamica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArquivoFila extends FilaDinamica{
    
    public static String Read(String caminho){
        String conteudo = "";
        try{
            FileReader fr = new FileReader(caminho);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            
            try{
                linha = br.readLine();
                while(linha != null){
                    conteudo += linha + "\r\n";
                    linha = br.readLine();
                }
                fr.close();
                return conteudo;
                
            } catch(IOException ioException) {
                System.err.println("\nErro: Não foi possível ler o arquivo");
                return "";
            }
            
        } catch(FileNotFoundException fnfException) {
            System.err.println("\nErro: Arquivo não encontrado");
            return "";
        }
        
    }
    
    public static boolean Write(String caminho, String conteudo){
        try{
            FileWriter fw = new FileWriter(caminho);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(conteudo);
            pw.close();
            return true;
            
        } catch(IOException ioException) {
            System.err.println(ioException.getMessage());
            return false;
        }
        
    }
    
    public static boolean InserirFinal(String caminho,FilaDinamica fila){
        
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            ArrayList<String> arrayValores = new ArrayList();
            linha = lerArq.readLine();

            //Irá passar por todo arquivo.txt e arrayValores cada linha em um arraylist 
            while(linha!=null){                                     
                arrayValores.add(linha);
                linha = lerArq.readLine();                       
            }

            // irá roda todo o ArrayList e arrayValores cada elemento na lista
            for(int i=0; i<arrayValores.size();i++){
                fila.inserirFila(arrayValores.get(i));
                //System.out.println(arrayValores.get(i));
            }
            arq.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Erro: Não foi possível ler o arquivo!");
            return false;
        }
    }
    
    
    //REMOVER ELEMENTO DA FILA A PARTIR DO ARQUIVO
    public static boolean removerInicio(String caminho, FilaDinamica fila){
        //File file = new File("src/entrada/EntradaFila.txt");
        try{
            FileReader fr = new FileReader(caminho);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            ArrayList<String> save = new ArrayList();
            
            while(line != null){
                
                save.add(line);
                
                line = br.readLine();
            }
            
            br.close();
            fr.close();
            
            FileWriter fw2 = new FileWriter(caminho, true);
            fw2.close();
            fila.removerElemento();
            
            FileWriter fw = new FileWriter(caminho);
            BufferedWriter bw = new BufferedWriter(fw);
            
            return true;
            
        }catch(IOException exc){
            System.err.println("\nERRO: " + exc);
            return false;
        
        }
    }
    
}
