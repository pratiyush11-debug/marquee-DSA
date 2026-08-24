package DSA;

public class Function {
    public  static void Age(int age){
        if(age<18){
            System.out.println("childern");
        }
        else if(age>18&&age<60){
            System.out.println("adult");
        }
        else if(age>=60 && age<=99){
            System.out.println("senior citizen");
        }
        else{
            System.out.println("Dead!!");
        }

    }
    public static void main(String[] args) {
        int age=100;
        Age(age);

    }
}
