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
}
