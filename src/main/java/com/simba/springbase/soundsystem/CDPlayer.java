package com.simba.springbase.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc cd;

    // @Autowired注解不仅能够用在构造器上， 还能用在属性的Setter方法上。
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
