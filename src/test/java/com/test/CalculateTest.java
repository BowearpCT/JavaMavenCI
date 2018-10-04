package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {
	public int score ;
	public Calculate cal;
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	@Test
	public void getScoreFromSetScoreByScore() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getScoreAFromSetScoreAndCalculateByScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreAFromSetScoreAndCalculateByScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreAFromSetScoreAndCalculateByScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBPlusFromSetScoreAndCalculateByScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBPlusFromSetScoreAndCalculateByScore77() {
		this.score = 77;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBPlusFromSetScoreAndCalculateByScore79() {
		this.score = 79;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBFromSetScoreAndCalculateByScore70() {
		this.score = 70;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBFromSetScoreAndCalculateByScore72() {
		this.score = 72;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreBFromSetScoreAndCalculateByScore74() {
		this.score = 74;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCPlusFromSetScoreAndCalculateByScore69() {
		this.score = 69;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCPlusFromSetScoreAndCalculateByScore65() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCPlusFromSetScoreAndCalculateByScore67() {
		this.score = 67;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCFromSetScoreAndCalculateByScore64() {
		this.score = 64;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCFromSetScoreAndCalculateByScore62() {
		this.score = 62;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreCFromSetScoreAndCalculateByScore60() {
		this.score = 64;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreDPlusFromSetScoreAndCalculateByScore59() {
		this.score = 59;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreDPlusFromSetScoreAndCalculateByScore57() {
		this.score = 57;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreDPlusFromSetScoreAndCalculateByScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreDFromSetScoreAndCalculateByScore54() {
		this.score = 54;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreDFromSetScoreAndCalculateByScore52() {
		this.score = 52;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void getScoreDFromSetScoreAndCalculateByScore50() {
		this.score = 54;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreFFromSetScoreAndCalculateByScore49() {
		this.score = 49;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreFFromSetScoreAndCalculateByScore0() {
		this.score = 0;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	public void getScoreFFromSetScoreAndCalculateByScore25() {
		this.score = 25;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	
}
