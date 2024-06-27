package com.Xworkz.classroom.coll;

import java.util.ArrayList;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {
        SensorDTO sensor=new SensorDTO("Sensor1","Infrared",5000,1);
        SensorDTO sensor1=new SensorDTO("Sensor2","Temperature",5000,1);
        SensorDTO sensor2=new SensorDTO("Sensor3","dgdge",5000,1);
        SensorDTO sensor3=new SensorDTO("Sensor4","mobile",5000,1);
        SensorDTO sensor4=new SensorDTO("Sensor5","radio",5000,1);

        List<SensorDTO> list=new ArrayList<>();
        list.add(sensor);
        list.add(sensor1);
        list.add(sensor2);
        list.add(sensor3);
        list.add(sensor4);

        for (SensorDTO a:list
             ) {
            System.out.println(a);
        }
    }
}
