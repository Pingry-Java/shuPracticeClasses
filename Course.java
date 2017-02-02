import java.util.ArrayList;
public class Course 
{
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Integer> grades = new ArrayList<Integer>();
	String title;
	String teacher;
	/**
	 * Constructor for Course Class
	 */
	public Course()
	{
		title = "Free Period";
		teacher = "No Teacher";
	}
	/**
	 * Constructor for Course Class with two inputs
	 *@input String Title course name
	 *@input String Teacher Teacher's name
	 */
	public Course(String Title, String Teacher)
	{
		this.title = Title;
		this.teacher = Teacher;
	}
	/**
	 * Finds the average grade of the course 
	 * @return double sum average grade
	 */
	public double averageGrade()
	{
		double sum = 0;
		double counter = 0;
		for (int i = 0; i < grades.size(); i++)
		{
			sum = sum + grades.get(i);
			counter++;
		}
		sum = sum/counter;
		return sum;
	}
	/**
	 * Returns ArrayList of Students
	 * return ArrayList<Student> ArrayList of Students
	 */
	public ArrayList<Student> getEnrollment()
	{
		return students;
	}
	/**
	 * Enrolls a student in the course
	 * @input Student newStudent a new student to be enrolled in the course
	 */
	public void enrollStudent(Student newStudent)
	{
		students.add(newStudent);
	}
	/**
	 * Overriding
	 * @return String returns a nice looking string with information about the course
	 */
	public String toString()
	{
		return "Course Name - " + title + ", Number of Enrolled Students - " + students.size() + ", Teacher - " + teacher + ", Average Grade - " + averageGrade();
	}
	/**
	 * Adds a grade to the ArrayList of grades
	 * @input int grade a grade to be added
	 */
	public void addGrade(int grade)
	{
		grades.add(grade);
	}
	/**
	 * Finds the highest grade in the class
	 * @return double highest the highest single grade in the course so far
	 */
	public double highestGrade()
	{
		double highest = 0;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) > highest)
				highest = grades.get(i);
		}
		return highest;
	}
	/**
	 * Finds the lowest grade in the class so far 
	 * @return double lowest the lowest single grade in the course so far
	 */
	public double lowestGrade()
	{
		double lowest = grades.get(0) + 1;
		for (int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) < lowest)
				lowest = grades.get(i);
		}
		return lowest;
	}
	/**
	 * Accessor Method 
	 * @return String title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * Accessor Method 
	 * @return String teacher
	 */
	public String getTeacher()
	{
		return teacher;
	}
	/**
	 * Accessor Method
	 * @return ArrayList<Student> students
	 */
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	/**
	 * Accessor Method 
	 * @return ArrayList<Integer> grades
	 */
	public ArrayList<Integer> getGrades()
	{
		return grades;
	}
}