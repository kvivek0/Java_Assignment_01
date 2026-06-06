// Q08.Why main method is static in Java?

// main() is static because Java can run it without
//                 creating an object of the class.

public class Question08{
    static void main(String[] args) {
        System.out.println("Hello World");
    }
}
      //When the program starts, the JVM directly calls:
           //Question08.main(args);
           // No object is needed.

//       public class Demo{
//             void main(String[] args) {
//               System.out.println("Hello");
//         }
//    }
      //Then Java would need:
      //Demo obj = new Demo();
      //obj.main(args);

//But the JVM cannot create this object before the program starts.