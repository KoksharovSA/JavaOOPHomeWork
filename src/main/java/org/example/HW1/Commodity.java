package org.example.HW1;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Commodity {
    private String name;
    private Integer price;
    private Integer rating;
    private Integer count;
    public Commodity Take(int number){
        this.count = this.count - number;
        if(this.count < 0){
            this.count = 0;
        }
        return new Commodity(this.name, this.price, this.rating, number);
    }
}
