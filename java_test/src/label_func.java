public class label_func {
    public static void main(String[] args){
        String strSearch = "This is the string in which you have to search for a substring.";
        String substring = "substring";
        boolean found = false;
        int max = strSearch.length() - substring.length();
//        Java 中的标签是为循环设计的，是为了在多重循环中方便的使用 break 和coutinue 。
        testlbl:
        for (int i = 0;i <= max; i++){
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0){
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    continue testlbl;//直接结束for的一次循环，到下一次for
            }
        }
            found = true;
            break testlbl;
        }
        if (found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}
