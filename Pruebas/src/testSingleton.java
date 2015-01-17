
public class testSingleton {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
           Singleton index = Singleton.getInstance();
           
           Singleton index2 = Singleton.getInstance();
           
           System.out.println(index.getIndex());
           for(int i = 0; i<10;i++){
           
           System.out.println(index.newIndex());
           }
           
           for(int i = 0; i<10;i++){
           
           System.out.println(index2.newIndex());
           }
    }

}
