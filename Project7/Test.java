package Project7;
import javax.lang.model.type.PrimitiveType;
import java.io.*;


public class Test {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        File file = new File("Employees.txt");
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        FileInputStream Fi = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(Fi);
        Employee Emp = new Employee(output,input);
        try {
            while (true) {
                Employee eemps = (Employee) input.readObject();
            System.out.println(eemps);
            }
        }catch(EOFException e1)
        {

        }


        fo.close();
        input.close();
        output.close();
        Fi.close();
    }
}
