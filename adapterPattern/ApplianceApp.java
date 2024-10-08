package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());

        System.out.println();

        System.out.println(tvRc.pressPlusButton());
        System.out.println(airConRc.pressPlusButton());
        System.out.println(speakerRc.pressPlusButton());

    }
}