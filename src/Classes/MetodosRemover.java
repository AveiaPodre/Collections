package Classes;

import java.util.*;
import static Classes.MetodosPesquisar.*;
import static Classes.App.*;


public class MetodosRemover {
    public static String[] nomesRemover = {"Lisbon", "NASA", "Kyunghee",
            "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations",
            "government", "Authorities"};

    public static void remover(AbstractList<Elemento> lista) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            for(Elemento e: lista){
                if(e.getNome() == s){
                    lista.remove(e);
                }
            }
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void remover(Set<Elemento> set) {
        long inicio = System.nanoTime();
        for (String s : nomesPesquisa) {
            for(Elemento e: set){
                if(e.getNome() == s){
                    set.remove(e);
                    break;
                }
            }
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

    public static void remover(Map<String,Integer> map) {
        long inicio = System.nanoTime();
        for (String s : nomesRemover) {
            map.remove(s);
        }
        long fim = System.nanoTime();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        escreverEstatisticas(tempoDeExecucao);
    }

}
