package com.luv2code.springboot.demo.mycoolapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MycoolappApplicationTests {

	@Test
	public void contextLoads() {
		boolean flag = 5 > 3;
		assertEquals(flag , true);
	}

}
