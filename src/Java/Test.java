package Java;

import java.util.*;

/*{
"k1" : "v1",
"k2" : ["v2", "v3", "", {"k21": "v21", "k22": ""}],
"k3" : {"k4" : "v4", "k5" : ["v5", "v6", null], "k6": {"k7" : "v7", "k8" : ""}},
"k9" : [],
"k10" : null,
"k11" : [23, true, false, "hello"]
}*/
public class Test {
    public static void main(String[] args) {
        Map<String, Object> m = new HashMap<>();
        ArrayList<String> str = new ArrayList<String>(Arrays.asList("Mohan", "Rohan", "", null,"Shyam","",null));
        ArrayList<String> newArr= new ArrayList<>();
        m.put("k1", str);
        m.put("k2", 43);
        m.put("k3", null);
        m.put("k4", "");
        System.out.println(m);
        Set<Map.Entry<String, Object>> entrySet = m.entrySet();
        Iterator<Map.Entry<String, Object>> itr = entrySet.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Object> entry = itr.next();
            if (entry.getValue() == null || entry.getValue().toString().equals("")) {
                itr.remove();
            } else if (entry.getValue().getClass() == ArrayList.class) {
                ArrayList<String> arr = (ArrayList<String>) entry.getValue();
                for (int i = arr.size() - 1; i >= 0; i--) {
                    if (arr.get(i) == null || arr.get(i).trim() == "") {
                        System.out.println("removing the value at index at " + i  );
                        arr.remove(i);
                        if(arr.stream().findAny().equals(ArrayList.class)){
                            System.out.println("got it");
                        }
                    }
                }
            }
        }
        for (Map.Entry<String, Object> entry : m.entrySet()) {
            System.out.print("key : " + entry.getKey() + " -> ");
            if (entry.getValue().getClass().isArray()) {
                String[] arr = (String[]) entry.getValue();
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " , ");
                }
            } else {
                System.out.print(entry.getValue());
            }
            System.out.println();
        }
    }
}
