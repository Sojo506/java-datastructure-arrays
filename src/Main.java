import models.Student;
import models.Vector;

/* This project is about a University,
 *  where we are going to storage, and get
 *  data of students */

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Moe");
        Student s2 = new Student("Miller");
        Student s3 = new Student("Cassandra");

        Vector list = new Vector();

        list.add(s1);
        list.add(s2);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.exists(s3));

        Student x = list.get(0);
        System.out.println(x);

        list.insert(1, s3);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < 300; i++) {
            Student z = new Student("Xavier" + i);
            list.add(z);
        }

        System.out.println(list);
    }
}
