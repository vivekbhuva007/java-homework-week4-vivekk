package encapsulation26;

public class TestEncapsulation {
    public static void main (String args[]){
        Encapstulate obj = new Encapstulate();
        obj.setName("Vivek");
        obj.setAge(21);
        obj.setRollNo(111);
        System.out.println("Prime's name:   " + obj.getName());
        System.out.println("Prime's Age :  " + obj.getAge()) ;
        System.out.println("Prime's Roll NO :  " + obj.getRollNo());


    }



}


