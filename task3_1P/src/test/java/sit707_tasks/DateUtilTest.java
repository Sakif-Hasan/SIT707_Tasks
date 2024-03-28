package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222355053";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Sakif-Hasan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {

		DateUtil date = new DateUtil(1,1,2024);
		System.out.println("January1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {

		DateUtil date = new DateUtil(1,1,2024);
		System.out.println("January1ShouldDecrementToDecember31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023,date.getYear());
	}
	
	// test cases from the table
	// test case - 1B
	@Test
	public void testCase1B(){

		DateUtil date = new DateUtil(1,6,1994);
		System.out.println( " Date " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2,date.getDay());
		Assert.assertEquals(6,date.getMonth());
	}
	// test case - 2B
	@Test
	public void testCase2B(){
		DateUtil date = new DateUtil(2,6,1994);
		System.out.println( " Date " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(3,date.getDay());
		Assert.assertEquals(6,date.getMonth());
	}
	// test case - 3B
	@Test
	public void testCase3B(){
		DateUtil date = new DateUtil(29,2,2004);
		System.out.println( " Date (Leap Year) -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1,date.getDay());
		Assert.assertEquals(3,date.getMonth());

	}
	// test case - 4B
	@Test
	public void testCase4B(){
		DateUtil date = new DateUtil(29,2,2008);
		System.out.println( " Date (Leap Year) -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1,date.getDay());
		Assert.assertEquals(3,date.getMonth());

	}
	// test case - 5B
	@Test
	public void testCase5B(){
		DateUtil date = new DateUtil(29,2,2012);
		System.out.println( " Date (Leap Year) -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1,date.getDay());
		Assert.assertEquals(3,date.getMonth());

	}
	// test case - 6B
	@Test
	public void testCase6B(){
		DateUtil date = new DateUtil(29,2,2016);
		System.out.println( " Date (Leap Year) -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1,date.getDay());
		Assert.assertEquals(3,date.getMonth());

	}
	// test case - 7B
	@Test
	public void testCase7B(){
		DateUtil date = new DateUtil(28,2,2020);
		System.out.println( " Date (Leap Year) -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(29,date.getDay());
		Assert.assertEquals(2,date.getMonth());

	}
	// test case - 8B
	@Test
	public void testCase8B(){
		DateUtil date = new DateUtil(31,12,2022);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1,date.getDay());
		Assert.assertEquals(1,date.getMonth());
		Assert.assertEquals(2023,date.getYear());

	}
	// test case - 9B
	@Test
	public void testCase9B(){
		DateUtil date = new DateUtil(30,8,2023);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(31,date.getDay());
		Assert.assertEquals(8,date.getMonth());

	}
	// test case - 10B
	@Test
	public void testCase10B(){
		DateUtil date = new DateUtil(12,9,2024);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(13,date.getDay());
		Assert.assertEquals(9,date.getMonth());

	}
	// test case - 11B
	@Test
	public void testCase11B(){
		DateUtil date = new DateUtil(4,4,2024);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(5,date.getDay());
		Assert.assertEquals(4,date.getMonth());

	}
	// test case - 12B
	@Test
	public void testCase12B(){
		DateUtil date = new DateUtil(5,5,2024);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(6,date.getDay());
		Assert.assertEquals(5,date.getMonth());

	}
	// test case - 13B
	@Test
	public void testCase13B(){
		DateUtil date = new DateUtil(15,6,2024);
		System.out.println( " Date -> " + date );
		date.increment();
		System.out.println(date);
		Assert.assertEquals(16,date.getDay());
		Assert.assertEquals(6,date.getMonth());

	}
}
