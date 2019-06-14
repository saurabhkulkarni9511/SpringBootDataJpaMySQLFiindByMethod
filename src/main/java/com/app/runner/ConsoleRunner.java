package com.app.runner;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepsitory;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepsitory repo;


	@Override
	public void run(String... args) throws Exception {

		repo.findByProdCode("A").forEach(System.out::println);;

		repo.findByProdCostLessThan(6.6).forEach(System.out::println);

		repo.findByProdCostLessThanEqual(5.5).forEach(System.out::println);

		repo.findByProdCodeOrProdCostLessThan("A", 4.4).forEach(System.out::println);

		repo.findByProdCodeNotNull().forEach(System.out::println);

		repo.findByProdCodeLike("B").forEach(System.out::println);

		repo. findByProdCodeContaining("C").forEach(System.out::println);

		repo.findByProdCodeIn(Arrays.asList("A","B")).forEach(System.out::println);

		repo.findByProdCostOrderByProdCode(5.5).forEach(System.out::println);

		repo.findByProdIdOrProdCodeIsNotNullOrProdCostLessThanOrderByProdCode(1,6.6).forEach(System.out::println);

	}
}
