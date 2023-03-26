package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import static Classes.MetodosInserir.*;

public class App {
    public static String[] leituraArquivo(){
        try {
            FileReader fileReader = new FileReader("src/Files/palavras.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> nomes = new ArrayList<String>();
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                nomes.add(linha);
            }
            System.out.println(nomes.size());
            String[] vetorDeNomes = nomes.toArray(new String[0]);
            bufferedReader.close();
            return vetorDeNomes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void escreverEstatisticas(Long tempo) {
        try (FileWriter writer = new FileWriter("src/Files/tempo.txt",true)) {
            writer.write(tempo + " ");
            writer.close();
        }
        catch(IOException e) {
            System.out.println("Erro");
        }
    }

    public static void main(String[] args) {
        String[] nomes = leituraArquivo();
        //inserirVector(nomes);
        //inserirArrayList(nomes);
        //inserirLinkedList(nomes);
        //inserirHashSet(nomes);
        //inserirLinkedHashSet(nomes);
        //inserirTreeSet(nomes);
        //inserirHashMap(nomes);
        //inserirLinkedHashMap(nomes);
        inserirTreeMap(nomes);
    }
}
