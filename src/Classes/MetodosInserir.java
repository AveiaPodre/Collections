package Classes;

import java.util.*;
import static Classes.MetodosRemover.*;
import static Classes.MetodosPesquisar.*;
import static Classes.App.*;

public class MetodosInserir {

    static void inserirVector(String[] nomes) {
        Vector<Elemento> lista = new Vector<>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            lista.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(lista);
        remover(lista);
    }

    static void inserirLinkedList(String[] nomes) {
        LinkedList<Elemento> lista = new LinkedList<Elemento>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            lista.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(lista);
        remover(lista);
    }

    static void inserirArrayList(String[] nomes) {
        ArrayList<Elemento> lista = new ArrayList<Elemento>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            lista.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(lista);
        remover(lista);

    }

    static void inserirHashSet(String[] nomes) {
        HashSet<Elemento> set = new HashSet<Elemento>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            set.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(set);
        remover(set);
    }

    static void inserirLinkedHashSet(String[] nomes) {
        LinkedHashSet<Elemento> set = new LinkedHashSet<Elemento>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            set.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(set);
        remover(set);
    }

    static void inserirTreeSet(String[] nomes) {
        TreeSet<Elemento> set = new TreeSet<Elemento>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for(String nome: nomes) {
            Elemento e = new Elemento(nome, i);
            set.add(e);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(set);
        remover(set);
    }

    static void inserirHashMap(String[] nomes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for (String nome: nomes) {
            map.put(nome, i);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(map);
        remover(map);
    }

    static void inserirLinkedHashMap(String[] nomes) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for (String nome: nomes) {
            map.put(nome, i);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(map);
        remover(map);
    }

    static void inserirTreeMap(String[] nomes) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        long inicio = System.currentTimeMillis();
        int i = 0;
        for (String nome: nomes) {
            map.put(nome, i);
            i++;
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println(tempoDeExecucao);
        //escreverEstatisticas(tempoDeExecucao);
        //pesquisar(map);
        remover(map);
    }
}
