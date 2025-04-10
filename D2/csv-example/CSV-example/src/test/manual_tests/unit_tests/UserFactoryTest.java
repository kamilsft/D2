package test.manual_tests.unit_tests;

import logic.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryTest {

    @Test
    public void testCreateStudentValid() {
        User user = UserFactory.createUser("STUDENT", "student", 3000, "student@my.yorku.ca", "pass");
        assertTrue(user instanceof Student);
    }

    @Test
    public void testCreateFacultyValid() {
        User user = UserFactory.createUser("FACULTY", "faculty", 1000, "prof@yorku.ca", "word");
        assertTrue(user instanceof FacultyMember);
    }

    @Test
    public void testCreateNonFacultyValid() {
        User user = UserFactory.createUser("NONFACULTY", "nonfaculty", 2000, "nonfaculty@my.yorku.ca", "word");
        assertTrue(user instanceof NonFacultyStaff);
    }

    @Test
    public void testCreateVisitorValid() {
        User user = UserFactory.createUser("VISITOR", "visitor", 4000, "visitor@my.yorku.ca", "word");
        assertTrue(user instanceof Visitor);
    }

    @Test
    public void testCreateManagerValid() {
        User user = UserFactory.createUser("MANAGER", "manager", 5000, "manager@yorku.ca", "word");
        assertTrue(user instanceof GeneralManager);
    }

    @Test
    public void testInvalidIDForStudent() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("STUDENT", "Fail", 2000, "fail@my.yorku.ca", "123");
        });
    }

    @Test
    public void testInvalidIDForFaculty() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("FACULTY", "Fail", 3000, "fail@my.yorku.ca", "123");
        });
    }

    @Test
    public void testInvalidIDForVisitor() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("VISITOR", "Fail", 1000, "fail@my.yorku.ca", "123");
        });
    }

    @Test
    public void testCreateWithNullType() {
        assertNull(UserFactory.createUser(null, "X", 1, "x@my.yorku.ca", "1"));
    }

    @Test
    public void testUnknownTypeReturnsNull() {
        assertNull(UserFactory.createUser("ALIEN", "X", 1, "x@my.yorku.ca", "1"));
    }
    
    @Test
    public void testUserFactoryConstructor() {
        UserFactory factory = new UserFactory(); // reference it
        assertNotNull(factory);
    }
    
    @Test
    public void testInvalidNonFacultyIdThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("NONFACULTY", "Bob", 9, "b@y.ca", "pass");
        });
    }

    @Test
    public void testInvalidVisitorIdThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("VISITOR", "visitor", 1, "visitor@my.yorku.ca", "pass");
        });
    }

    @Test
    public void testInvalidManagerIdThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("MANAGER", "manager", 3, "manager@yorku.ca", "pass");
        });
    }
}

