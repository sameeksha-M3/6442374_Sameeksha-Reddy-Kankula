interface playable{
    void play();
}

public class Guitar_interface implements playable{
    public void play(){
        System.out.println("Guitar is playing at the background.....");
    }
}
