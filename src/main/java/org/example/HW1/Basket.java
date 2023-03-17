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
    public void Buy(ArrayList<Category> categories) {
        for (Category cat: categories) {
            for (Commodity com: cat.getCommodities()) {
                if (basketCommodities.contains(com)) {
                    Commodity temp = basketCommodities.stream().filter(x->x.getName() == com.getName()).findFirst().orElse(null);
                    if(temp != null) {
                        com.setCount(com.getCount() - temp.getCount());
                    }
                }
            }
        }
    }
}
