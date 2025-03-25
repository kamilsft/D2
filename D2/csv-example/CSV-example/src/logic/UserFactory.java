package logic;

public class UserFactory {
	public static User createUser(String type, String name, int id, String email, String password, int uniqueID, String extraInfo) {
		if(type == null) {
			return null;
		}else if(type.equalsIgnoreCase("STUDENT")) {
			return new Student(name, id, email, password, uniqueID, extraInfo);
		}else if(type.equalsIgnoreCase("FACULTY")) {
			return new FacultyMember(name, id, email, password, uniqueID, extraInfo);
		}else if(type.equalsIgnoreCase("NONFACULTY")) {
			return new NonFacultyStaff(name, id, email, password, uniqueID, extraInfo);
		}else if(type.equalsIgnoreCase("VISITOR")) {
			return new Visitor(name, id, email, password, uniqueID, extraInfo);
		}else {
			return null;
		}
	}
}
  