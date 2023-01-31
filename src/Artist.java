public class Artist {
    private int startYear;
    private String artistName;
    private int membersNumber;
    private int allPlays = 0;
    private int albumCount = 0;
    void setArtistName(String artistName){
        this.artistName = artistName;
    }
    void setStartYear(int startYear){
        if(startYear <= 1000)
            throw new IllegalArgumentException("Start year can't be less than 1000");
        this.startYear = startYear;
    }

    void setMembersNumber(int membersNumber){
        if(membersNumber < 1)
            throw new IllegalArgumentException("members can't be zero or negative");
        this.membersNumber = membersNumber;
    }
    void incrementPlays(){
        this.allPlays++;
    }
    @Override
    public String toString(){
        System.out.println("{");
            System.out.println("\tartistName : " + this.artistName + ",");
            System.out.println("\tstartYear : " + this.startYear + ",");
            if (membersNumber > 1)
                System.out.println("\tmembersNumber : " + this.membersNumber + ",");
            System.out.println("\tallPlays : " + this.allPlays + ",");
            System.out.println("\talbumCount : " + this.albumCount);
        System.out.println("}");
        return "";
    }
}
