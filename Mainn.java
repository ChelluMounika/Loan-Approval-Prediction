
import java.util.Scanner;
public class Mainn {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    studentDAO dao=new studentDAO();
    while(true){
        System.out.println("\n=======STUDENT MANAGEMENT SYSTEM======");
        System.out.println("1.Add student");
        System.out.println("2.View all student");
        System.out.println("3.Search student");
        System.out.println("4.Update student");
        System.out.println("5.Delete student");
        System.out.println("6.Exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println("enter id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter name:");
                    String name=sc.nextLine();
                    System.out.println("enter  age:");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter branch:");
                    String branch=sc.nextLine();
                    System.out.println("enter phone:");
                    String phone=sc.nextLine();
                    Student student=new Student(id,name,age,branch,phone);
                    dao.addstudent(student);
                    break;
            case 2: dao.viewstudent();
                    break;
            case 3: System.out.println("enter student id:");
                    int searchid=sc.nextInt();
                    dao.searchstudent(searchid);
                    break;
            case 4: System.out.println("enter student id to update:");
                    int updateid=sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("enter new name:");
                    String updatename=sc.nextLine();
                    System.out.println("enter new age:");
                    int updateage=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter new branch:");
                    String updatebranch=sc.nextLine();
                    System.out.println("enter  new phone:");
                    String updatephone=sc.nextLine();
                    Student updatestudent=new Student(updateid,updatename,updateage,updatebranch,updatephone);
                    dao.updatestudent(updatestudent);
                    break;
            case 5: System.out.println("enter student id to delete:");
                    int deleteid=sc.nextInt();
                    dao.deletestudent(deleteid);
                    break;
            case 6: System.out.println("Thank you for using student management system");
                    sc.close();
                    System.exit(0);
                    break;
            default:
                    System.out.println("invalid choice");                             
        }
    }
}    
}
