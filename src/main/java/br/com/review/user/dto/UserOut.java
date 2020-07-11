package br.com.review.user.dto;

import lombok.Data;

@Data
public class UserOut {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
