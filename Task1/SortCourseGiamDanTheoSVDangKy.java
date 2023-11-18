package Task1;

import java.util.Comparator;

public class SortCourseGiamDanTheoSVDangKy implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return o2.getStudents().size() - o1.getStudents().size();
	}

}
