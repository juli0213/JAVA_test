import  java.util.*;
public class listToArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("θ");
        list.add("ιΈ");
        list.add("ζ");
        list.add("η¨");
        list.add("www.runoob.com");
        String[] s1 = list.toArray(new String[0]);
        for(int i = 0;i<s1.length;i++){
            String contnets = s1[i];
            System.out.print(contnets);
        }
    }
}
