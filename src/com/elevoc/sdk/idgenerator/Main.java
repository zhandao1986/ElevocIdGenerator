package com.elevoc.sdk.idgenerator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String id = ElevocIdGenerator.uuid32();
        System.out.println(id);
    }
}
