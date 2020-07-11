package br.com.review.category.dto;

import br.com.review.entities.Product;
import lombok.Data;
import java.util.List;

@Data
public class CategoryProductOut {
    private Long id;
    private String name;
    private List<Product> products;
}
