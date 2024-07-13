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
	@Test
	  public void teatWithZero()
	  {
		  Arithmetic ar=new Arithmetic();
		  int actual=0;
		  int expected=ar.sum(-10,10);
		  assertEquals(actual,expected);
		  
	  }
	@Test
	  public void teatWithEqual()
	  {
		  Arithmetic ar=new Arithmetic();
		  int actual=10;
		  int expected=ar.sum(5,5);
		  assertEquals(actual,expected);
		  
	  }
  
}
