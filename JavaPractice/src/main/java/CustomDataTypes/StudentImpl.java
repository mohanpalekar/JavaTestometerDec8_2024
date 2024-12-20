package CustomDataTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentImpl {

	public static void main(String[] args) {

		Student st = new Student("St1", "10B-123", "10B", new String[]{"English", "Math", "Science"});

		//		st.name = "St1";
		//		st.className= "10B";
		//		st.rollNo="10B-123";
		//		st.subjects= new String[]{"English", "Math", "Science"};
		//		
		//      st.name = "St2";

		
		
		st.setName("NewName");
		
		System.out.println(st);
		
		System.out.println(st.getName());
		
		System.out.println(st.getRollNo());
		
		System.out.println(st.getClassName());
		
		for(String s:st.getSubjects()) {
			System.out.print(s+ " , ");
		}
		
		System.out.println();
		
		Student st2 = new Student("St2", "10B-124", "10B", new String[]{"English", "Math", "Science"});
		Student st3 = new Student("St3", "10B-125", "10B", new String[]{"English", "Math", "Science"});
		Student st4 = new Student("St4", "10B-126", "10B", new String[]{"English", "Math", "Science"});
		
		Student [] arr = new Student[4];
		
		arr[0] = st;
		
		List<Student> stList = new ArrayList<>();
		
		stList.add(st);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		
		Iterator itr = stList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("=============================================");
			
			Student s = (Student) itr.next();
			
			System.out.println(s);
			
			System.out.println(s.getName());
			
			System.out.println(s.getRollNo());
			
			System.out.println(s.getClassName());
			
			for(String s1:st.getSubjects()) {
				System.out.print(s1+ " , ");
			}
			
			System.out.println();
			
			System.out.println("=============================================");
			
		}
		
	}

}
