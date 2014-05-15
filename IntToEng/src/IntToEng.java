import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
   String eng="";
   String eng10 = "";
   String eng100 ="";
   String eng1000 ="";
   int m = n;
   if(n>=1000){
	   int l = n/1000;
	   eng1000 = countnumber(l);
	   eng1000= eng1000+ " thousand";
	   n = n%100;
   }
   if(n>=100){
	   int l = n/100;
	   eng100 = countnumber(l);
	   eng100= eng100+ " hundred";
	   n = n%100;
   }
  
   if(n==0) eng="zero";
   else if(n==10) eng="ten";
	else if(n==11) eng="eleven";
	else if(n==12) eng="twelve";
	else if(n==13) eng="thirteen";
	else if(n==14) eng="fourteen";
	else if(n==15) eng="fifteen";
	else if(n==16) eng="sixteen";
	else if(n==17) eng="seventeen";
	else if(n==18) eng="egihteen";
	else if(n==19) eng="ninteen";
   if(n<10 || 20<=n) {
	   if(100>n && n>=90) eng10 = "ninety";
   else    if(n>=80) eng10 = "eighty";
   else    if(n>=70) eng10 = "seventy"; 
   else    if(n>=60) eng10 = "sixty"; 
   else    if(n>=50) eng10 = "fifty";
   else    if(n>=40) eng10 = "forty";
   else    if(n>=30) eng10 = "thrity";
   else    if(n>=20) eng10 = "twenty";
  n=n%10;
     eng = countnumber(n);
   }
    	
    	String str = Integer.toString(m)+" "+eng1000+" "+eng100+" "+eng10+" "+eng;
        return str;
    }

	public static String countnumber(int n) {
		String eng="";
		if(n==1) eng="one";	
			else if(n==2) eng="two";
			else if(n==3) eng="three";
			else if(n==4) eng="four";
			else if(n==5) eng="five";
			else if(n==6) eng="six";
			else if(n==7) eng="seven";
			else if(n==8) eng="eight";
			else if(n==9) eng="nine";
		return eng;
	}
}

