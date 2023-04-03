package client;

import machine.*;
import automaticTester.TestAvatar;

public class Client{
    public static void main(String[] args) {
        System.out.println("Hello, world !");
        TestAvatar.check(MachineImpl.getInstance());
    }
}