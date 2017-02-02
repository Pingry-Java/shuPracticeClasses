public class PCRunner
{
	public static void main (String[] args)
	{
		Student Billy = new Student();
		Student Dillon = new Student("Dillon",16);
		Student Fatt = new Student("Fatt Mallon");
		Student NoName = new Student(16);
		
		System.out.println(Billy);
		System.out.println(Dillon);
		System.out.println(Fatt);
		System.out.println(NoName);
		
		System.out.println(NoName.getOldestStudent());
		Dillon.haveBirthday();
		System.out.println(NoName.getOldestStudent()); 	
		NoName.haveBirthday();
		System.out.println(Fatt.getAge());
		NoName.haveBirthday();
		System.out.println(NoName.getOldestStudent());
		
		Course Bio = new Course("Biology II", "Mr. Burns");
		Bio.enrollStudent(Billy);
		Bio.enrollStudent(Dillon);
		Bio.enrollStudent(Fatt);
		Bio.enrollStudent(NoName);
		System.out.println(Bio.getEnrollment());
		System.out.println(Bio);
		
		Course Free = new Course();
		Free.enrollStudent(Billy);
		Free.enrollStudent(Dillon);
		Free.enrollStudent(Fatt);
		Free.enrollStudent(NoName);
		System.out.println(Free.getEnrollment());
		System.out.println(Free);
		
		Bio.addGrade(97);
		Bio.addGrade(78);
		Bio.addGrade(83);
		Bio.addGrade(101);
		
		System.out.println(Bio.averageGrade());
		System.out.println(Bio.highestGrade());
		System.out.println(Bio.lowestGrade());
		
	}
	
}