public public class Student {
 private int id;
 private String name;
 private int age;
 private String branch;
 private  String phone;
 public  Student(int id,String name,int age,String branch,String phone){
    this.id=id;
    this.name=name;
    this.age=age;
    this.branch=branch;
    this.phone=phone;
 }    
 public int getId(){
    return id;
 }
 public String getName(){
    return name;
 }
 public int getAge(){
    return age;
 }
 public String getBranch(){
    return branch;
 }
 public String getPhone(){
    return  phone;
 }
} 