public class BaseStart {	
	public static void testBase()  
	{ 
		Base b = new Base("DS1001", "EntryCourse"); 
		System.out.println(b.getCode() == "DS1001"); 
		System.out.println(b.getTitle() == "EntryCourse"); 
		System.out.println(b.getPreRequisite() == b); 
	} 
  
	public static void main(String[] args)  
	{ 
		testBase(); 
	} 
  

  
} 
