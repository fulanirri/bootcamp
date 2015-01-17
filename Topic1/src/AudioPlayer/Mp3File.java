package AudioPlayer;

public class Mp3File implements AudioFile {
    
    private String fileName;
    private String duration;
    
    public Mp3File(String fileName, String duration){
       this.fileName = fileName;
       this.duration = duration;
    }
    
   
    @Override
    public String play() {
        
        return "playing Mp3 File "+fileName+"\t"+duration;
    }

    @Override
    public String stop() {
        
        return "Stopping Mp3 File "+fileName;
    }

    @Override
    public String pause() {
        
        return "Pause Mp3 File "+fileName;
    }
    
    

}
