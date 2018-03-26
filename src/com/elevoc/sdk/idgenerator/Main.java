package com.elevoc.sdk.idgenerator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String id = ElevocIdGenerator.uuid64();
        System.out.println(id);
        System.out.println(id.length());
    }
}
