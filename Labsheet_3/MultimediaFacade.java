package Labsheet 3;

public class MultimediaFacade {
    private final VideoPlayer videoPlayer= new VideoPlayer();
    private final AudioPlayer audioPlayer=new AudioPlayer();
    private final Display=new Display();
    private final SubtitleServer=new SubtitleServer();
    private final StreamingService treamingService=new StreamingService();

    public void watchMovie(String movie, String audioTrack, String subtitle){
        videoPlayer.playVideo(movie);
        audioPlayer.playAudio(audioTrack);
        subtitleService.displaySubtitle(subtitle);
        streamingService.StreamingService(movie);
        display.Show("Enjoy the movie");
    
    
    }

    public void listenSong(String songTrack){
        audioPlayer.playAudio(songTrack);
        streamingService.StreamingService(songTrack);
        display.show("Enjoy the song");
    }
}
