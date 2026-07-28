package com.klef.soa.service;

import java.util.List;

import com.klef.soa.dto.ProductDTO;

public interface APIService
{
List<ProductDTO>displayAllProcucts();
ProductDTO displayProductById(int id);
List<ProductDTO> displayAllProducts();
}
