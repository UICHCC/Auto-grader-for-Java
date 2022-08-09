public class ManyCoursesStart {
	public static void testManyCourses() 
	{ 
		Base b = new Base("DS1001","EntryCourse"); 
		MajorRequired mr1 = new MajorRequired("DS200X","OOP",b); 
		MajorElective me1 = new MajorElective("DS300X","Data Mining",mr1); 
		ManyCourses mc = new ManyCourses(); 
		mc.addCourse(b); 
		mc.addCourse(mr1); 
		mc.addCourse(me1); 
		mc.listCourses(); 
	} 
	
	public static void main(String[] args)  
	{ 
		testManyCourses(); 
	} 
} 
