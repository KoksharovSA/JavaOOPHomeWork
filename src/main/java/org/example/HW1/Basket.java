package org.example.HW1;

import lombok.*;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Basket {
    private ArrayList<Commodity> basketCommodities;
}
