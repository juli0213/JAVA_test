import java.io.File;
public class dir_findFile {
    public static void main(String[] args) throws Exception{
        File dir = new File("./src");
        String [] children = dir.list();
        if(children == null){
            System.out.println("文件不存在");
        }
        else{
            for(int i = 0; i< children.length;i++){
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
}
