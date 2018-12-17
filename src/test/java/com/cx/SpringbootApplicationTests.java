package com.cx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void test1() {
        long t1=System.nanoTime();
        System.out.println(17<<1);
        long t2=System.nanoTime();
        System.out.println((t2-t1));
        long t3=System.nanoTime();
        System.out.println(((2<<3)+1)<<1);
        long t4=System.nanoTime();
        System.out.println((t4-t3));

    }

}

