package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
  public void teatWithPositive()
  {
	  Arithmetic ar=new Arithmetic();
	  int actual=30;
	  int expected=ar.sum(10,20);
	  assertEquals(actual,expected);
	  
  }
	@Test
	  public void teatWithNegative()
	  {
		  Arithmetic ar=new Arithmetic();
		  int actual=-30;
		  int expected=ar.sum(-10,-20);
		  assertEquals(actual,expected);
		  
	  }
  
}
