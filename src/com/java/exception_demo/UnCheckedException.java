package com.java.exception_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// which could have been avoided by programmer.
// These Exceptions are subclasses of RuntimeException
// NullPointerException, Arithmetic Ex, ArrayIndexOutofBound, ClassCast Ex,Illegal argument Ex, NumberFormat Exception
public class UnCheckedException {  // SQL Exception
    public static void main(String[] args) {
        String subject = "English";
    //    System.out.println(subject.length());

        subject = null; // null

        // try : catch(1 or more) --> but exception handling control will enter into ONLY ONE catch block.

        File file ;
        try {
           // System.out.println(subject.length());  // Null pointer exception
           // System.out.println(5/0);

           String path = "/Users/sneha/Desktop";
           String fileName = "demo.xlsx";
           String filePath = path + File.separator + fileName;

           /*try {
               file = new File(filePath);
           }catch (Exception e){
               System.out.println("Directory doesnot exist");
           }catch ()*/
            file = new File(filePath);
           if(file.createNewFile()){
               System.out.println("File created successfully");
           }else{
               System.out.println("File already exists");
           }
            String data = "This is a new file";
            FileOutputStream outputStream = new FileOutputStream(file);
            outputStream.write(data.getBytes());

           // FileInputStream inputStream = new FileInputStream(file);


        }
        catch (ArithmeticException r){ // Exception e = new NullPointerException();
            System.out.println("ArithmeticException occurred"+ r.getMessage());
        }
        catch (NullPointerException n){
            System.out.println("NullPointerException occurred"+ n.getMessage());
        }
        catch (RuntimeException r){
            System.out.println("RuntimeException occurred"+ r.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception occurred "+ e.getStackTrace());
        }
        finally {
            System.out.println("Inside finally block, out of vulnerable code");
         //   inputStream.close();
        }


        System.out.println("Normal execution starts from here");
    }
}
