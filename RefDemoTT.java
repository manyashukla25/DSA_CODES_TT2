public class RefDemoTT {
    public static void main(String[] args) {
        /*
         * name is a variable of String type
         * String is a predefine java class
         * String is a collection of characters
         * name is a reference variable
         */
        String name = "Amit";
        String name2 = name; 
        System.out.println(name == name2); // ;true
        String name3 = new String("Amit");
             // new - allocate a new memory
        System.out.println(name == name3); // false
   


        /*
         * id is a variable of int type
         * int is a data type (Keyword)
         */
        int id = 1001;
        System.out.println(id);
    }
}
