//Write a program to demonstrate various methods of String Buffer class.
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer str_buff = new StringBuffer();
        StringBuffer str_buff1 = new StringBuffer("Nepal");
        StringBuffer str_buff2 = new StringBuffer(50);
        StringBuffer str_buff3 = new StringBuffer("najaR");
        System.out.println(str_buff);
        System.out.println(str_buff1);
        System.out.println(str_buff2);
       
        //length()
        System.out.println("Length");
        System.out.println(str_buff.length());
        System.out.println(str_buff1.length());
        System.out.println(str_buff2.length());
        
        //capacity()
        System.out.println("Capacity");
        System.out.println(str_buff.capacity());
        System.out.println(str_buff1.capacity());
        System.out.println(str_buff2.capacity());
        
        //inserting string
        str_buff1.insert(2,"ra");
        System.out.println(str_buff1);

        //append(string)
        str_buff1.append("Java");
        System.out.println(str_buff1);

        //reverse()
        str_buff3.reverse();
        System.out.println(str_buff3);

        //delete(start_index,end_index)
        str_buff1.delete(0,2);
        System.out.println(str_buff1);

        //deleteCharAt(index)
        str_buff1.deleteCharAt(0);
        System.out.println(str_buff1);

        //replace(start_index,end_index,string)
        str_buff1.replace(2,4,"rras");
        System.out.println(str_buff1);
    }
}
