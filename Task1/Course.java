package Task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Course {
	private String id;
	private String titile;
	private String type;
	private ArrayList<Student> students;
	private String lecturer;
	public Course(String id, String titile, String type, ArrayList<Student> students, String lecturer) {
		this.id = id;
		this.titile = titile;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public boolean isGreaterStudents(Course otherCourse) {
		return this.students.size() > otherCourse.students.size();
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", titile=" + titile + ", type=" + type + ", students=" + students + "]";
	}
	
	public boolean isType(String type) {
		return this.type.equalsIgnoreCase(type);
	}
	
	
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> map = new TreeMap<>();
		for (Student student : students) {
			List<Student> students = new ArrayList<>();
			int year = student.getYear();
			if (map.containsKey(year)) {
				students = map.get(year);
			}
			students.add(student);
			map.put(year, students);
		}
		
		return map;
	}
	
	
	
	
	
	
	
	
	
}
