package assignment1;

import java.util.*;

public class Main {
    static Map<Integer, Long> map = new HashMap<>();
    public static void main(String[] args) {
        map.put(0,new Long(0));
        map.put(1, new Long(1));
        generate(50);
    }

    public static void generate(int n){
        for(int i = 2; i<=n; i++){
            map.put(i,map.get(i-1) + map.get(i-2));
        }
        System.out.println(map.get(n));
    }
}