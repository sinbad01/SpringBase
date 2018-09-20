package com.simba.springbase.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan注解， 这个注解能够在Spring中启用 组件扫描。
//@ComponentScan默认会扫描与配置类相同的包, 这样就能发现CompactDisc， 并且会在Spring中自动为其创建一个bean。

@Configuration
@ComponentScan
public class CDPlayerConfig {
}
