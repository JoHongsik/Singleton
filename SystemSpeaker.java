package com.example.singleton;

public class SystemSpeaker {
    static private SystemSpeaker instance; // 외부에 접근 안되고, 하나만 만들어지게 하기 위해서 static
    private int volume;

    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

}
