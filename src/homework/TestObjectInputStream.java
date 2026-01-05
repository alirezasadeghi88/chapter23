//package homework;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class TestObjectInputStream {
//    public static void main(String[] args)
//        throws ClassNotFoundException, IOException {
//        try (
//                ObjectInputStream inputStream =
//                        new ObjectInputStream(new FileInputStream("object.dat"));
//                ){
//            String name = inputStream.readUTF();
//            double score = inputStream.readDouble();
//            java.util.Date date = (java.util.Date)(inputStream.readDouble());
//            System.out.println(name + "  " + score + "  " + date);
//        }
//    }
//}
