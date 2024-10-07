/**
 * Students
 */
class Student{

    //data:data member: instance variable
    int studentId;
    String studentName;
    String studentCity;

    //Behaviour : member methods: methods: (function)

    public void study(){
        System.out.println(studentName + " is studing");
    }

    public void showFullInfo(){
        System.out.println("my name is " + studentName);
        System.out.println("my id is " + studentId);
        System.out.println("my city is " + studentCity);
    }

}
