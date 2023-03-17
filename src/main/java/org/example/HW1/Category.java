package org.example.HW1;
import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Category {
    private String name;
    private ArrayList<Commodity> Commodities;
}
