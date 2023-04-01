//Write a program of your choice to show the implementation of this keyword.


class MyDetails {
    String name;
    long contact;

    MyDetails(String name, long contact) {
        this.name = name;
        this.contact = contact;
    }
}
    public class ThisKeyword {
    public static void main(String[] args) {
        MyDetails data = new MyDetails("Rajan Dotel", 9860939695L);
        System.out.println(data.name);
        System.out.println(data.contact);
    }
}