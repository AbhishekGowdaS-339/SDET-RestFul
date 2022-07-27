package Array_Practice;

import java.time.LocalDateTime;
import java.util.Date;

import String_Practice.SysPrintlnDetails;

public class practice {
	public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d.toString());
	d.toString().replace(":","-");
	System.out.println(d);
	
	String lc = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(lc);
	}
}
