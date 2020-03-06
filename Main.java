package epam.task5;

public class Main {
	public static void main(String[] args) 
    {
        CustomArraylist<Integer> list = new CustomArraylist<Integer>();
 
        System.out.println("Adding elements");
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
         
        System.out.println("Remove elements from index");
        list.remove(2);
        System.out.println(list);
         
        System.out.println("Get element with index");
        System.out.println( list.get(1) );
        System.out.println( list.get(2) );
 
        System.out.println("List Size");
        System.out.println(list.size());
    }

}
