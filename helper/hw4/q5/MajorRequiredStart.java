public class MajorRequiredStart {	
	public static void testMajorRequired()  
	{   
		//create a Base object 
		Base b = new Base("DS1001","EntryCourse"); 
		//create a first MajorRequired object with the base course as pre-requisite 
		MajorRequired mr1 = new MajorRequired("DS200X","OOP",b); 
		//create a second MajorRequired object with the first major required course as pre-requisite 
		MajorRequired mr2 = new MajorRequired("DS300X","Data Mining",mr1); 
		 
		//test mr1 
		System.out.println(mr1.getCode()=="DS200X"); 
		System.out.println(mr1.getTitle()=="OOP"); 
		System.out.println(mr1.getPreRequisite() == b); 
		 
		//test mr2 
		System.out.println(mr2.getCode()=="DS300X"); 
		System.out.println(mr2.getTitle()=="Data Mining"); 
		System.out.println(mr2.getPreRequisite() == mr1); 
    }
	
	public static void main(String[] args)  
	{     
		testMajorRequired(); 
	} 
}