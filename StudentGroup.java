
import java.util.Date;

public class StudentGroup implements StudentArrayOpertion , Comparable {


        ArrayList<String> students1 = new ArrayList<String>();


	private int id;

	private String fullName;


	private Date birthDate;


	private double avgMark;
	private int aa=0;

	public StudentGroup(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
		int aa=0;
	}
	private Student[] students;
	StudentGroup s1=new StudentGroup();
students1 = Arrays.asList(students);
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {


	return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
		throw new IllegalArgumentException("object is null");
else
this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		throw new IllegalArgumentException("index out of range");
		else
		{
		return Student[index];
		}


	}


	@Override
	public void setStudent(Student student, int index) {
	if(student==null || index<0 || index>=students.length)
	throw new IllegalArgumentException("index out of range");
	else
	students[index]=student;
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
	students1 = Arrays.asList(students);
	if(student==null)
	throw new IllegalArgumentException("illegal argument");
	else
		students1[0].add(student);
		students=students1.toArray(new String[students1.size()]);
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
	students1 = Arrays.asList(students);
		// Add your implementation here
		if(student==null)
	throw new IllegalArgumentException("illegal argument");
	else
	students1[students1.length-1].add(student);
	students=students1.toArray(new String[students1.size()]);
	}


	@Override
	public void add(Student student, int index) {
		students1 = Arrays.asList(students);

	if(student==null || index<0 || index>=students1.length)
	throw new IllegalArgumentException("index out of range");
		// Add your implementation here
		else
		students1[index-1].add(student);
		students=students1.toArray(new String[students1.size()]);
	}

	@Override
	public void remove(int index) {
	students1 = Arrays.asList(students);
	if(student==null || index<0 || index>=students.length)
	throw new IllegalArgumentException("index out of range");
	else
	students1.remove(student[index-1]);
	students=students1.toArray(new String[students1.size()]);
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		//if(student==null)
		students1 = Arrays.asList(students);
		if(student==null)

	throw new IllegalArgumentException("index out of range");
	for(int i=0;i<students.length-1;i++)
	if(students[i]==student)

	students1.remove(student);

	else
	throw new IllegalArgumentException("Student not exist");
		students=students1.toArray(new String[list.size()]);
	}

	@Override
	public void removeFromIndex(int index) {
	students1 = Arrays.asList(students);
		// Add your implementation here

		if(index<0 || index>=students1.length-1)
    throw new IllegalArgumentException("index out of range");
    for(int i=index;i<students1.length;i++)
    students1.remove(students[index-1]);
		students=students1.toArray(new String[list.size()]);
	}


	@Override
	public void removeFromElement(Student student) {
	students1 = Arrays.asList(students);
	if(student==null)
	throw new IllegalArgumentException("index out of range");
	for(int i=0;i<students1.length-1;i++)
		if(students1[i]==student)
		{
		for(int j=i+1;j<students1.length-1;j++)
		students1.remove(students1[j]);
		}
		// Add your implementation here

	students=students1.toArray(new String[list.size()]);}

	@Override
	public void removeToIndex(int index) {
	students1 = Arrays.asList(students);
		// Add your implementation here
		if(index<0 || index>=students1.length-1)
    throw new IllegalArgumentException("index out of range");
    for(int i=0;i<students1.index-2;i++)
    students1.remove(students1[i]);
	students=students1.toArray(new String[list.size()]);
	}

	@Override
	public void removeToElement(Student student) {
	students1 = Arrays.asList(students);
		// Add your implementation here
	if(student==null)
	throw new IllegalArgumentException("index out of range");
	for(int i=0;i<students1.length-1;i++){
		if(students1[i]==student)
		break;}
		for(int j=0;j<i;j++)
		students1.remove(students1[j]);

	students=students1.toArray(new String[list.size()]);}


	@Override
	public void bubbleSort() {
		 for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j] > students[j + 1]) {
                     s1 = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = s1;
                }
            }
// Add your implementation here
	}}
}
