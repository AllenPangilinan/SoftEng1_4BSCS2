package commandPattern;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        Light light = new Light();
        TurnOnLight turnOnLight = new TurnOnLight(light);
        rc.setCommand(turnOnLight);
        System.out.println(turnOnLight.execute());
    }
}
