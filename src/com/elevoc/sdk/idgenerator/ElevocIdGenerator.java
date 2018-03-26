package com.elevoc.sdk.idgenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ElevocIdGenerator {
    public static String uuid32(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            return simpleDateFormat.format(new Date(System.currentTimeMillis())) + _IdWorker.getFlowIdWorkerInstance().nextId();
        }catch (Exception e){
            Random random = new Random(System.currentTimeMillis());
            String tmp = "";
            for (int i=0; i<18; i++){
                tmp += random.nextInt(10);
            }
            return simpleDateFormat.format(new Date(System.currentTimeMillis())) + tmp;
        }
    }


    public static String uuid8(){
        try {
            return String.valueOf(_IdWorker.getFlowIdWorkerInstance().nextId()).substring(0,8);
        }catch (Exception e){
            Random random = new Random(System.currentTimeMillis());
            String tmp = "";
            for (int i=0; i<8; i++){
                tmp += random.nextInt(10);
            }
            return tmp;
        }
    }


    public static String uuid16(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return simpleDateFormat.format(new Date(System.currentTimeMillis())).substring(2,8) + String.valueOf(_IdWorker.getFlowIdWorkerInstance().nextId()).substring(0,10);
        }catch (Exception e){
            Random random = new Random(System.currentTimeMillis());
            String tmp = "";
            for (int i=0; i<16; i++){
                tmp += random.nextInt(10);
            }
            return simpleDateFormat.format(new Date(System.currentTimeMillis())).substring(2,8)  + tmp.substring(0,10);
        }
    }


    public static String uuid64(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        try {
            String tmp =  simpleDateFormat.format(new Date(System.currentTimeMillis())) + _IdWorker.getFlowIdWorkerInstance().nextId() + _IdWorker.getFlowIdWorkerInstance().nextId() + _IdWorker.getFlowIdWorkerInstance().nextId();
            return tmp.substring(0,100);
        }catch (Exception e){
            Random random = new Random(System.currentTimeMillis());
            String tmp = "";
            for (int i=0; i<47; i++){
                tmp += random.nextInt(10);
            }
            return simpleDateFormat.format(new Date(System.currentTimeMillis())) + tmp;
        }
    }
}
