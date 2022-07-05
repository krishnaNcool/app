package com.krishna.app.dto;
import lombok.Data;

@Data
public class ProductDTO
{
    private long id;
    private String name;
    private int categoryId;
    private Double price;
    private Double weight;
    private String description;
    private String imageName;
}
