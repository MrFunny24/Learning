import java.util.*;
public class Collections {

    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList<Integer>();
        Map<Integer , String> M = Map.of(1,"One",2,"Two");
        L.add(5);
        L.add(6);
        System.out.println(L);
        L.forEach(System.out::println);
        M.forEach((Key,value)->System.out.println(Key+"="+value));
    }
}
