package AudioPlayer;

public class TestPlayer {
    
    public static void main(String[] args) { 
    AudioFile song1Wma = new WmaFile("Fight for your right to Party","3:30");
    AudioFile song2Wma = new WmaFile("Another brick in the wall","2:30");
    AudioFile song3Wma = new WmaFile("Californication","1:30");
    AudioFile song4Wma = new WmaFile("La mal peinada","5:30");
    AudioFile song3Mp3 = new Mp3File("Rock my Way","1:30");
    AudioFile song4Mp3 = new Mp3File("Highway to Hell","5:30");
    
    
    
    MusicPlayer winAmp = new MusicPlayer();
    
    winAmp.addSong(song1Wma);
    winAmp.addSong(song2Wma);
    winAmp.addSong(song3Wma);
    winAmp.addSong(song4Wma);
    winAmp.addSong(song3Mp3);
    winAmp.addSong(song4Mp3);
    
    
    winAmp.playList();
    
    
    
    
    }
}
