//Write a program of your choice to implement multiple inheritance using interface.

interface ParentInterface {
    void name();
    void address();
        
    }
    public interface InterfacingForMultipleInheritance {
        void contact();
        void email();
    }
    
    class NewClass implements ParentInterface , InterfacingForMultipleInheritance {
        public void name() {
            System.out.println("My name is Rajan Dotel.");
        }
        public void address(){
            System.out.println("I live in Goldhunga, Kathmandu.");
        }
        public void contact(){
            System.out.println("My contact number is 9860939695.");
        }
        public void email(){
            System.out.println("My electronic mailing address is rajan.dotel11@gmail.com");
        }
    }
    class Main {
        public static void main(String[] args) {
            NewClass obj = new NewClass();
            obj.name();
            obj.address();
            obj.contact();
            obj.email();
        }
    }