public class Student
{
	private String name;
	private int age;
	private static int oldestStudent;
	//Constructors
	public Student()
	{
		this("Billy", 10);
		if (10 > oldestStudent)
			oldestStudent = 10;
	}
	public Student(String name)
	{
		this.name = name;
		age = 10;
	}
	public Student(int age)
	{
		this.age = age;
		if (age > oldestStudent)
			oldestStudent = age;
		name = "NoName";
	}
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
		if (age > oldestStudent)
			oldestStudent = age;
	}
	//Overrides toString 
	public String toString()
	{
		return "Student Name - " + name + ", Aged - " + age;
	}
	//Accessors
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getOldestStudent()
	{
		return oldestStudent;
	}
	//Makes the student have a birthday and gets one year older. 
	public void haveBirthday()
	{
		age++;
		if (this.age > oldestStudent)
			oldestStudent = this.age;
	}
	
	
}