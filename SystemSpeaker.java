package com.example.singleton;

public class SystemSpeaker {
    static private SystemSpeaker instance; // getInstance() 메소드를 통해서만 인스턴스를 얻을 수 있게 함. instance는 하나(static변수)
    private int volume;

    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){   //instance를 생성한 적이 없으면 생성.
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
