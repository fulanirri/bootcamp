package AudioPlayer;

public class WmaFile implements AudioFile {
    
    private String fileName;
    private String duration;
    
    public WmaFile(String fileName, String duration){
       this.fileName = fileName;
       this.duration = duration;
    }
    
   
    @Override
    public String play() {
        
        return "playing Wma File "+fileName+"\t"+duration;
    }

    @Override
    public String stop() {
        
        return "Stopping Wma File "+fileName;
    }

    @Override
    public String pause() {
        
        return "Pause Wma File "+fileName;
    }
    
    
    

}
