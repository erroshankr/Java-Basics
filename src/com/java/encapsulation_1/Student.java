package com.java.encapsulation_1;

// It is achieved with help of Access specifiers: private, default, protected,  public
 public class Student {  // public & default : only can be used with class

    private String name;// private: can be accessed within a class only  : A1-> name= "Rakesh"
    int age; // default: same package.
    protected String gender; // protected: default + class that extends any class from teh package where it is defined.
    public int id; // public: can be accessed anywhere

    // copyByValue & copyByReference : Important
    // Can we implement copyByReference in Java ?  reference : memory location

  /*  public String readName(){  // read operation : Getter
        return this.name;
    }*/

   /* public void changeName(String nm){ // write operation : Setter
        this.name = nm;
    }*/

   public String getName() {  // read operation : Getter
        return name;
    }

   public void setName(String name) { // write operation : Setter
        this.name = name;
    }

    public Student(){    // If zero argument constructor is private for a class, we can never extend that class.

    }

    public Student(String name, int ID, int age, String gender) { // If parameterized constructor are defined private,then we can extend that class only if
                                                                   // that parameterized constructor is not used in that class.
        this.name = name;
        this.id = ID;
        this.age = age;
        this.gender = gender;
      //  System.out.println("within constructor : name = " + this.name);
    }

     public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
