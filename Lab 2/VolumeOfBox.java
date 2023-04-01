/* Write a program to define a class named Box which has data length, breadth and 
height and public functions ReadData() for reading data members and Volume() to 
calculate volume of box.*/

import java.util.Scanner;

class Box{
    int length,breadth,height,volume;
    void ReadData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length, breadth and height: ");
        length = input.nextInt();
        breadth = input.nextInt();
        height = input.nextInt();
        input.close();        
    }
    void Volume(){
        volume = length*breadth*height;
        System.out.println("The volume of the box is " + volume);
    }
}

public class VolumeOfBox{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.ReadData();
        b1.Volume();
    }
}