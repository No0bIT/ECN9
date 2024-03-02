package com.example.Ecommerce_BE.model.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce_BE.model.entity.EStatusProduct;
import com.example.Ecommerce_BE.model.entity.Product;
import com.example.Ecommerce_BE.model.service.ProductService;
import com.example.Ecommerce_BE.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> findByCensorship(EStatusProduct censorship) {
		// TODO Auto-generated method stub
		return productRepository.findByCensorship(censorship);
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productRepository.getById(id);
	}

}