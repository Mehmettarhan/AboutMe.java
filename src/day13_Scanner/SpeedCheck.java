package day13_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 35;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed:");
        int currentSpeed = new Scanner(System.in).nextInt();
        // if we are using scanner object for one input only, then we don't need to create a variable for scanner

        int overSpeedLimit = currentSpeed-speedLimit;

        if (overSpeedLimit>0){
            System.out.println("You are driving "+overSpeedLimit+" miles over speed limit. Slow down!");
        }
    }
}
/*
3. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter
the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105
            output:
            You're driving 50 mph over the limit. Slow down!
            Enter current speed:
            45
            output:
 */