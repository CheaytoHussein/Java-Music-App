public class Song{
    Artist artist;
    Album album;
    private int plays = 0;
    private String genre;
    private int duration;
    void setAlbum(Album album){
        this.album = album;
    }
    void setArtist(Artist artist){
        this.artist = artist;
    }
    void setGenre(String genre){
        this.genre = genre;
    }
    void setGenre(){
        this.genre = "Unspecified";
    }
    void setDurationInSeconds(int duration){
        if(duration <= 0)
            throw new IllegalArgumentException("Song duration can't be negative or 0");
        this.duration = duration;
    }
    void playSong(){
        this.plays++;
        this.album.incrementPlays();
        this.artist.incrementPlays();
    }
    int getPlays(){
        return plays;
    }
}
