package Classes;

import java.util.*;
import static Classes.App.*;

public class MetodosPesquisar {
    public static String[] nomesPesquisa = {"Lisbon", "NASA", "Kyunghee",
            "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations",
            "government", "Authorities"};

    public static void pesquisar(AbstractList<Elemento> lista) {
        long inicio = System.nanoTime();
        for(String s : nomesPesquisa) {
            for(Elemento e: lista){
                if(e.getNome() == s) break;
            }
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void pesquisar(Set<Elemento> set) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            for(Elemento e: set){
                if(e.getNome() == s) break;
            }
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void pesquisar(Map<String,Integer> map) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            map.get(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }
}