package com.Xworkz.serialization;


import lombok.*;

import java.io.Serializable;
import java.rmi.Remote;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fan implements Serializable,Cloneable, Remote {
    private int price;
    private String brand;
}
