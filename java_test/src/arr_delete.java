import java.util.Arrays;
public class arr_delete {
    public static void main(String[] args) {
        int[] oldarray = new int[]{3, 4, 5, 6, 7};// 原始数组
        int num = 2; //删除的index=2，第三个元素
        int[] newArray = new int[oldarray.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (num < 0 || num >= oldarray.length){
                throw new RuntimeException("元素越界、、");
            }
            if(i<num){
                newArray[i] = oldarray[i];
            }
            else{
                newArray[i] = oldarray[i+1];
            }
        }
        System.out.println(Arrays.toString(oldarray));
        oldarray = newArray;
        System.out.println(Arrays.toString(oldarray));
    }
}
