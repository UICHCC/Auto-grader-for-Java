public class StartGrading {	
	public static void testCourse() 
	{ 
		//  Since we cannot create any Course object, 
		//the testCourse method of the Course class must be empty. 
	}
	
	public static void testMajorRequired()  
	{ 
		//Since we cannot create any MajorRequired object,  
		//the testMajorRequired method of the Course class must be empty. 
    } 

	public static void testMajorElective()  
	{ 
		//Since we cannot create any MajorElective object, 
		//the testMajorElective method of the Course class must be empty. 
	} 

	public static void testBase()  
	{ 
		Base b = new Base("DS1001", "EntryCourse"); 
		System.out.println(b.getCode() == "DS1001"); 
		System.out.println(b.getTitle() == "EntryCourse"); 
		System.out.println(b.getPreRequisite() == b); 
	} 
  
	public static void main(String[] args)  
	{ 
		testCourse(); 
		testMajorElective(); 
		testMajorRequired(); 
		testBase(); 
	} 
  

  
} 
