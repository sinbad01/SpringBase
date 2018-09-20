package com.simba.springbase.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

// 使用了Spring的SpringJUnit4ClassRunner， 以便在测试开始的时候自动创建Spring的应用上下文

// @ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置。
// 因为CDPlayerConfig类中包含了@ComponentScan，因此最终的应用上下文中应该包含CompactDiscbean。
// 类似于 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    // @Autowired注解， 以便于将CompactDiscbean注入到测试代码之中
    @Autowired
    private CompactDisc cd;

    // 如果它不为null的话， 就意味着Spring能够发现CompactDisc类， 自动在Spring上下文中将其创建为bean并将其注入到测试代码之中。
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
}
