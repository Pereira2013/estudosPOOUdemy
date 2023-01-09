package exerciciosOO.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcus"); // adicionar com indice.

        System.out.println(list.size());// saber o tamanho da list

        //list.remove("Anna");
        //list.remove(1);
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');// remover com método predicate (Lambda)
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));// se não existir o elemento o retorno é -1
        System.out.println("-------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

            System.out.println(name);


    }
}
