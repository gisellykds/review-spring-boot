package br.com.review.product.dto;

import br.com.review.category.dto.CategoryOut;
import lombok.Data;

@Data
public class ProductCategoryOut {

    private Long id;

    private String name;

    private String description;

    private Double price;

    private CategoryOut category;
}
