package com.example.springboottodo.dto;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseHeadDTO {
    private String error;
    private List<T> data;
}
