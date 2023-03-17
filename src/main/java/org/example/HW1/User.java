package org.example.HW1;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private String login;
    private String password;
    private Basket basket;
}
