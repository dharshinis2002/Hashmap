package HashMapExcer;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {

        HashMapEx hm1=new HashMapEx("dharsh",87);
        HashMapEx hm2=new HashMapEx("mabi",67);
        HashMapEx hm3=new HashMapEx("sakthi",67);

        HashMap <Integer,HashMapEx> student=new HashMap<Integer, HashMapEx>();
        student.put(99,hm1);
        student.put(8,hm3);
       student.put(78,hm2);
        System.out.println(student.get(99));
        System.out.println(hm1.getId());
    }
}
