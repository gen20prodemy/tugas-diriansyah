import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String[]> itemList = new ArrayList<>();
        while (true) {
            String input = bufferedReader.readLine();
            // System.out.println(input);
            if(input == null){
                break;
            }

            String[] inpuStrings = input.split(",");
            itemList.add(inpuStrings);
        }
        bufferedReader.close();

        // ArrayList
        System.out.println("Output dari ArrayList:");
        for (String[] item : itemList) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println();

        // LinkedList
        System.out.println("Output dari LinkedList:");
        List<String[]> linkk = convertLinkedlist(itemList);
        for (String[] strings : linkk) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println();

        // HashSet
        System.out.println("Output dari HashSet:");
        Collection<String[]> hashset = convertHashSet(itemList);
        for (String[] strings : hashset) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println();

        // TreeMap
        System.out.println("Output dari TreeMap:");
        Map<String, List<String>> mapp = convertTreeMap(itemList);
        for (Map.Entry<String, List<String>> entry : mapp.entrySet()) {
            String a = entry.getKey();
            List<String> b = entry.getValue();
            System.out.println(a + " = " + b);
        }
        System.out.println();

        // HashMap
        System.out.println("Output dari HashMap:");
        Map<String, List<String>> sett = convertHashMap(itemList);
        for (Map.Entry<String, List<String>> entry : sett.entrySet()) {
            String c = entry.getKey();
            List<String> d = entry.getValue();
            System.out.println(c + " = " + d);
        }
        System.out.println();
    }

    public static List<String[]> convertLinkedlist(List<String[]> daftar){
        List<String[]> linkList = new LinkedList<>();
        for (String[] str : daftar) {
            linkList.add(str);
        }

        return linkList;
    }

    public static Collection<String[]> convertHashSet(List<String[]> daftar){
        Collection<String[]> hashSet = new HashSet<>(daftar);
        return hashSet;
    }

    public static Map<String, List<String>> convertTreeMap(List<String[]> daftar) {
        Map<String, List<String>> map = new TreeMap<>();
        for (int i = 1; i < daftar.size(); i++) {
            for (int j = 0; j < daftar.get(i).length; j++) {
                if(i == 1){
                    List<String> l = new ArrayList<>();
                    l.add(daftar.get(i)[j]);
                    map.put(daftar.get(0)[j], l);
                } else {
                    map.get(daftar.get(0)[j]).add(daftar.get(i)[j]);
                }
            }
        }

        return map;
    }

    public static Map<String, List<String>> convertHashMap(List<String[]> daftar){
        Map<String, List<String>> map = convertTreeMap(daftar);
        Map<String, List<String>> set = new HashMap<>(map);
        return set;
    }
}
