package com.mjpb;

public class ABCDE {

    public static void isABCDE(char letter) {
        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("FOUND");
                break;

            default:
                System.out.println("NOT FOUND");
                break;
        }
    }


}
