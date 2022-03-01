import creational.StreamCreator;

import java.io.IOException;

public class PatternTester {

    public static void main(String[] args) {
        StreamCreator myCreator = StreamCreator.getInstance();

        try {
            myCreator.createInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
