package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Integer>{

	List<Product> findByProdCode(String prodCode);

	List<Product> findByProdCostLessThan(Double prodCost);

	List<Product> findByProdCostLessThanEqual(Double prodCost);

	List<Product> findByProdCodeOrProdCostLessThan(String prodCode,Double prodCost);

	List<Product> findByProdCodeNotNull();

	List<Product> findByProdCodeLike(String prodCode);

	List<Product> findByProdCodeContaining(String prodCode);

	List<Product> findByProdCodeIn(List<String> prodCode);

	List<Product> findByProdCostOrderByProdCode(Double prodCost);

	List<Product> findByProdIdOrProdCodeIsNotNullOrProdCostLessThanOrderByProdCode(Integer prodId,Double prodCost);
}
