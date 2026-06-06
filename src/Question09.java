//What is the difference between print() and printIn() method of PrintStream class?

      //   "CASE : 1 (print)

public class Question09 {
    static void main(String[] args) {
        System.out.print("hello");
        System.out.print("Vivek");

        System.out.print("\n");
        // "Here line not change and print in the same line".
        //                :-  "hello vivek"

        // CASE   : 2  (println)

       System.out.println("hello");
       System.out.println("Vivek");

       // " Here line changes and print in two lines like ":- hello
        //                                                   Vivek
    }
}