/* Create a class Vehicle with data members: VNo, no_of_wheel and max_speed.
 Derive another class Passenger with data member: no_of_passengers. Derive two
 other classes Bus(with route, fare_per_person and helper_name) and Taxi (with
  fare_per_km as data member). Write a program to use these classes (multilevel).*/

import java.util.Scanner;
class Vehicle {
    int VNo;
    int no_of_wheel;
    int max_speed;
    void readVechile(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter VNo , no of wheel and max speed of the vechile.");
        VNo=sc.nextInt();
        no_of_wheel=sc.nextInt();
        max_speed=sc.nextInt();
    }
}
class Passenger extends Vehicle{
    int no_of_passengers;
    void readPassenger(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of passenger.");
        no_of_passengers=sc.nextInt();
    }
}
class Bus extends Passenger{
    String route;
    int fare_per_person;
    String helper_name;
    void readBus(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter route ,fare per person and name of the helper of the bus.");
        route=sc.nextLine();
        fare_per_person=sc.nextInt();
        sc.nextLine();
        helper_name=sc.nextLine();
    }
}
class Taxi extends Passenger{
    int fare_per_km;
    void readTaxi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fare per km of taxi:");  
        fare_per_km=sc.nextInt();
    }
}
public class VehicleBusAndTaxi{
    public static void main(String[] args) {
        Bus obj=new Bus();
        obj.readVechile();
        obj.readPassenger(); 
        obj.readBus();
        System.out.println("Bus number "+obj.VNo + " is travelling in route "+obj.route +", it has "+obj.no_of_wheel +" wheels" + " with a max speed of " +obj.max_speed);
        System.out.print("It has "+obj.no_of_passengers +" passengers" +" and the fare per person is "+obj.fare_per_person + " " +obj.helper_name + " is the name of the helper of the bus.");
    }
}