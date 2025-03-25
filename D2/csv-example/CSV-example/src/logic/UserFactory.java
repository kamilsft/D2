package logic;

public class UserFactory {
	public static User createUser(String type, String name, int id, String email, String password) {
		if(type == null) {
			return null;	
		}
		// converting the ID to a string 
		String idString = Integer.toString(id);
		// taking the first character
		char firstChar = idString.charAt(0);
		// converting the char back to a number
		int firstDigit = Character.getNumericValue(firstChar);
		
		if(type.equalsIgnoreCase("STUDENT")){
			if(firstDigit != 3) {
				throw new IllegalArgumentException("Student ID must start with 3");
			}
			return new Student(name, id, email, password);
			
		}else if(type.equalsIgnoreCase("FACULTY")) {
			if(firstDigit != 1) {
				throw new IllegalArgumentException("Faculty ID must start with 1");
			}
			return new FacultyMember(name, id, email, password);
			
		}else if(type.equalsIgnoreCase("NONFACULTY")) {
			if(firstDigit != 2) {
				throw new IllegalArgumentException("Non Faculty ID must start with 2");
			}
			return new NonFacultyStaff(name, id, email, password);
			
		}else if(type.equalsIgnoreCase("VISITOR")) {
			if(firstDigit != 4) {
				throw new IllegalArgumentException("Visitor ID must start with 4");
			}
			return new Visitor(name, id, email, password);
			
		}else if(type.equalsIgnoreCase("MANAGER")){
			if(firstDigit != 5) {
				throw new IllegalArgumentException("Manager ID must start with 5");
			}
			return new GeneralManager(name, id, email, password);
		}else {
			return null;
		}
	}
}
  