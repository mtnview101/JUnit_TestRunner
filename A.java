public class A{
	public static String s="Testing Junit 4.12";
	public static void main (String[] args){
		System.out.println(s);
	}
}
/* 
C:\Runner>javac -cp c:\Runner;junit-4.12.jar;hamcrest-core-1.3.jar;A.java ATest.java TestRunner.java

C:\Runner>java -cp c:\Runner;junit-4.12.jar;hamcrest-core-1.3.jar; TestRunner
Expected String: Testing Junit 4.12; Actual String: Testing Junit 4.12
All tests finished successful...

C:\Runner>
*/