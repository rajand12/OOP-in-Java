// Write a program to implement encapsulation using getter and setter methods.

public class GetterSetter {
        String name;
        String getName() {
        name = "Random";
        return name;
    }

        void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String name = "Rajan";
        GetterSetter obj = new GetterSetter();
        obj.setName(name);
        System.out.println("This name is Setted :" +name  + "\nThis name is Getted :" + obj.getName());
    }
}