package pro.nanosystems;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5/2;
        float myFloatValue = 5.4f /2 ;
        double myDoubleValue = 5.2 / 2;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double numPounds = 200d;
        double convertedKiloGram = numPounds * 0.453_592_37d;
        System.out.println("KG = " + convertedKiloGram);

    }
}
