import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
   String eng="";
   String eng10 = "";
   if(n>=90) eng10 = "ninty";
   else    if(n>=80) eng10 = "eighty";
   else    if(n>=70) eng10 = "seventy"; 
   else    if(n>=60) eng10 = "sixty"; 
   else    if(n>=50) eng10 = "fifty";
   else    if(n>=40) eng10 = "fory";
   else    if(n>=30) eng10 = "thrity";
   else    if(n>=20) eng10 = "twenty";
  n<<=n;
    	if(n==0) eng="zero";
    	else if(n==1) eng="one";	
    	else if(n==2) eng="two";
    	else if(n==3) eng="three";
    	else if(n==4) eng="four";
    	else if(n==5) eng="five";
    	else if(n==6) eng="six";
    	else if(n==7) eng="seven";
    	else if(n==8) eng="eight";
    	else if(n==9) eng="nine";
    	String str = Integer.toString(n)+" "+eng10+eng;
        return str;
    }
}