package school_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akshat on 23/05/2022.
 */
public class Main {
    public static void main(String[] args) {
        Teacher uma = new Teacher(1,"Uma",500);
        Teacher ahana = new Teacher(2,"Ahana",700);
        Teacher rudra = new Teacher(3,"Rudra",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(uma);
        teacherList.add(ahana);
        teacherList.add(rudra);


        Student akash = new Student(1,"Akash",4);
        Student akshat = new Student(2,"Akshat Kumar Rai",12);
        Student shreya = new Student(3,"Shreya",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(akash);
        studentList.add(akshat);
        studentList.add(shreya);




        School dbit = new School(teacherList,studentList);

        Teacher awani = new Teacher(6,"Awani", 900);

        dbit.addTeacher(awani);


        akash.payFees(5000);
        akshat.payFees(6000);
        System.out.println("DBIT has earned RS."+ dbit.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        uma.receiveSalary(uma.getSalary());
        System.out.println("DBIT has spent for salary to " + uma.getName()
        +" and now has Rs." + dbit.getTotalMoneyEarned());

        rudra.receiveSalary(rudra.getSalary());
        System.out.println("DBIT has spent for salary to " + rudra.getName()
                +" and now has Rs." + dbit.getTotalMoneyEarned());


        System.out.println(akshat);

        ahana.receiveSalary(ahana.getSalary());

        System.out.println(ahana);


    }
}
