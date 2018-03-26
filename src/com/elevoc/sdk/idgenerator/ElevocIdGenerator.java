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



}
