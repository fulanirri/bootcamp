
public class Singleton {

    private static Singleton instance = null;
    
    private int index = 0 ;
    
    
    private Singleton(){
        
       
        
     
    }
    
    
    public static Singleton getInstance(){
        if(instance == null){
            
  
            Singleton.instance = new Singleton(); 
            
        }
 
         return instance;   
    }


    public int getIndex() {
        return index;
    }


    public void setIndex(int index) {
        this.index = index;
    }
    
    
    
    public int newIndex(){
        
        this.setIndex(this.getIndex()+1);
        
        return this.getIndex();
    }
    
    
    
    
}
