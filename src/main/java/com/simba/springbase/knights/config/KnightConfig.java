package com.simba.springbase.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simba.springbase.knights.BraveKnight;
import com.simba.springbase.knights.Knight;
import com.simba.springbase.knights.Quest;
import com.simba.springbase.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
