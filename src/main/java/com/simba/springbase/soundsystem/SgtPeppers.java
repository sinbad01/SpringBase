package com.simba.springbase.soundsystem;

import org.springframework.stereotype.Component;

// @Component 注解表明该类会作为组件类， 并告知Spring要为这个类创建bean
// 为 bean 命名
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

