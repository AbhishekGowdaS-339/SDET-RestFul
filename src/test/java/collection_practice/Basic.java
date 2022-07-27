package collection_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Basic {
	public static void main(String[] args) {
	String str="This is my abhi";
	System.out.println(str);
	String rev="";
	int size=str.length();
	for(int i=size-1; i>=0;i--) {
		rev=rev+str.charAt(i);
		
	}
	
	String[] out =rev.split(" ");
	String ft=out[0];
System.out.println(ft);
	String frev="";
	for(int j=ft.length()-1;j>=0;j--) {
		if(j==ft.length()-(ft.length()-1)) {
			frev=frev+" ";
		}
		frev=frev+ft.charAt(j);
	}

	String fopt="";
	for(int j=0;j<=out.length-1;j++) {
		if(j==0) {
			fopt=fopt+frev+" ";
		}
		else
			fopt=fopt+out[j]+" ";
	}
	System.out.println(fopt);
	
		
	}
	
}
