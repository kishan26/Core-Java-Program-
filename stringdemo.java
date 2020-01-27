
public class stringdemo {
public static void main(String[] args) 
{
	
	String n="vihicle name";
	
	System.out.println("string length="+n.length());
	System.out.println("character 3rd position="+n.charAt(3));
	System.out.println("substring="+n.substring(3));
	System.out.println("substring="+n.substring(2,5));
	
	//1
	String s1="Geeks";
	String s2="forGeeks";
	System.out.println("concating string="+s1.concat(s2));

	//2
	String s3="Lern share Lern";
	System.out.println("Index of share:"+s3.indexOf("share"));
	
	//3
	System.out.println("Index of a  = " + s3.indexOf('a',3)); 
    
    //4
	
	Boolean out = "vihicle".equals("vihicle"); 
    System.out.println("Checking Equality  " + out); 
    out = "vihicle".equals("vihicle"); 
    System.out.println("Checking Equality  " + out);
    
    //5
    
    out = "vihicle".equalsIgnoreCase("viHicle"); 
    System.out.println("Checking Equality " + out); 
    
    //6
    int out1 = s1.compareTo(s2); 
    System.out.println("If s1 = s2 " + out);
    
    //7
    String word1 = "kishan"; 
    System.out.println("Changing to lower Case " + word1.toLowerCase());
    
    //8 
    String word2 = "abm"; 
    System.out.println("Changing to UPPER Case " +word2.toUpperCase());
    
	//9
    String word4 = " Learn Share Learn "; 
    System.out.println("Trim the word " + word4.trim());
    
    //10
    String str1 = "vihiiclename"; 
    System.out.println("Original String " + str1); 
    String str2 = "vihclenames".replace('e' ,'b') ; 
    System.out.println("Replaced f with e -> " + str2);
    
}
}