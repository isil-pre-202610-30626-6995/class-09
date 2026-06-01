
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        List<String> students = new ArrayList<>();
        students.add("Luis");
        students.add("Pedro");
        students.add("Camila");
        students.add("Luis");
        System.out.println(students);
        System.out.println(students.size());
        for (String student : students) {
            System.out.println(student);
        }
        students.remove(students.size()-1);
        System.out.println(students);


        Set<String> teachers = new HashSet<>();
        teachers.add("Jorge");
        teachers.add("Andrea");
        teachers.add("Jorge");
        System.out.println(teachers);
        System.out.println(teachers.size());

        Map<Integer, String> parents = new HashMap<>();
        parents.put(1, "Carlos");
        parents.put(2, "Martha");
        System.out.println(parents);
        System.out.println(parents.size());

    }
}
