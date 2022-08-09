public class MajorElectiveStart {	
	public static void testMajorElective()  
	{   
		//create a Base object 
		Base b = new Base("DS1001","EntryCourse"); 
		//create a first MajorRequired object with the base course as pre-requisite 
		MajorRequired mr1 = new MajorRequired("DS200X","OOP",b); 
		//create a MajorElective object with the major required course as pre-requisite 
		MajorElective me1 = new MajorElective("DS300X","Data Mining",mr1); 
		 
		//test mr1 
		System.out.println(mr1.getCode()=="DS200X"); 
		System.out.println(mr1.getTitle()=="OOP"); 
		System.out.println(mr1.getPreRequisite() == b); 
		 
		//test mr2 
		System.out.println(me1.getCode()=="DS300X"); 
		System.out.println(me1.getTitle()=="Data Mining"); 
		System.out.println(me1.getPreRequisite() == mr1); 
	} 

	public static void main(String[] args)  
	{ 
		testMajorElective(); 
	} 
}
