package Project7;
import javax.lang.model.type.PrimitiveType;
import java.io.*;


public class Test {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("Employees.txt");
        File file2 = new File("EmployeesText.txt");
        PrintWriter PW = new PrintWriter("EmployeesText.txt");
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        Employee Emp = new Employee(output,PW);



    }
}
