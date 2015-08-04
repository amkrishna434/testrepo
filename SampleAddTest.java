package com.home.junit; 

import org.junit.After; 
import org.junit.Assert; 
import org.junit.Before; 
import org.junit.Test;
import org.junit.SampleAdd;


public class SampleAddTest { 

                 private SampleAdd sampleClass; 
				 
                 @Before 
				 public void setUp() { 
                              sampleClass = new SampleAdd(); 
				}
				
				@Test
				public void testAdd() {
				              Assert.assertEquals(6, sampleClass.add(4, 3));
				}
				
				@After
				public void settleDown() {
				             sampleClass = null;
		        }
				
}