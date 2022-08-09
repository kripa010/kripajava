package org.ictkerala.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class simpleinterestmainTest {
simpleinterest testobj=new simpleinterest();
	@Test
		public void test() {
			double testout1=testobj.sicalc(100000,1,12);
			assertEquals(12000,testout1);
		}
		@Test
		public void test1() {
				double testout2=testobj.pericalc(5,6);
				assertEquals(22,testout2);
		}
		
	
		
	}


