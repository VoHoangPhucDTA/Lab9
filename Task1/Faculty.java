package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private ArrayList<Course> courses;
	
	public Faculty(String name, String address, ArrayList<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	
	public Course getMaxPracticalCourse() {
		if (courses.size() == 0) throw new NoSuchElementException("Không có course");
		Course res = null;
		for (int i = 1; i < courses.size(); i++) {
			Course c = courses.get(i);
			Course cPrev = courses.get(i-1);
			if (c.isGreaterStudents(cPrev)) {
				res = c;
			}
		
		}
		return res;
	}
	
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> map = new TreeMap<>();
		for (Course course : courses) {
			Map<Integer, List<Student>> map1 = course.groupStudentsByYear();
			Set<Map.Entry<Integer, List<Student>>> entries = map1.entrySet();
			for (Map.Entry<Integer, List<Student>> entry : entries) {
				List<Student> value = entry.getValue();
				if (map.containsKey(entry.getKey())) {
					value.addAll(map.get(entry.getKey()));
				}
				map.put(entry.getKey(), value);
			}
		}
		return map;
	}
	
	public Set<Course> filterCourses(String type) {
		Set<Course> set = new HashSet<>();
		for (Course course : courses) {
			if (course.isType(type)) {
				set.add(course);
			}
		}
		return set;
	}
	
	public Set<Course> filterCourses1(String type) {
		Set<Course> set = new TreeSet<>(new SortCourseGiamDanTheoSVDangKy());
		for (Course course : courses) {
			if (course.isType(type)) {
				set.add(course);
			}
		}
		return set;
	}
	
	
	public static void test() {
		Student s1 = new Student("1", "Zu1", 2001);
		Student s2 = new Student("2", "Zu2", 2002);
		Student s3 = new Student("3", "Zu3", 2003);
		Student s4 = new Student("4", "Zu4", 2004);
		Student s5 = new Student("5", "Zu5", 2005);
		ArrayList<Student> students1 = new ArrayList<>();
		students1.add(s1);
		students1.add(s2);
		students1.add(s3);
		students1.add(s4);
		students1.add(s5);
		
		
		Student s6 = new Student("6", "Zu6", 2001);
		Student s7 = new Student("7", "Zu7", 2002);
		Student s8 = new Student("8", "Zu8", 2003);
		Student s9 = new Student("9", "Zu9", 2004);
		Student s10 = new Student("10", "Zu10", 2005);
		Student s11 = new Student("10", "Zu10", 2004);
		Student s12 = new Student("11", "Zu11", 2005);
		ArrayList<Student> students2 = new ArrayList<>();
		students2.add(s6);
		students2.add(s7);
		students2.add(s8);
		students2.add(s9);
		students2.add(s10);
		students2.add(s11);
		students2.add(s12);
		
		
		
		Course c1 = new Course("1", "DSA", "TH", students1, "MrBlack Nguyen");
		Course c2 = new Course("2", "Toan RR", "TH", students2, "Miss Nga");
		Course c3 = new Course("3", "XSTK", "LT", students1, "Mr Nghia");

		ArrayList<Course> courses = new ArrayList<>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);

		
		// khoa
		Faculty fc1 = new Faculty("CNTT", "Nha Xe", courses);
		System.out.println("Course sinh vien dang ky hoc nhieu nhat");
		System.out.println(fc1.getMaxPracticalCourse() + "\n\n");
		
		System.out.println("Thong ke danh sach sinh vien theo nam hoc: ");
		System.out.println(fc1.groupStudentsByYear() + "\n\n");
		
		System.out.println("Cac course theo loai cho truoc: ");
		System.out.println(fc1.filterCourses1("TH"));
		
		

	}
	
	
	public static void main(String[] args) {
		test();

	}
	
	
}
