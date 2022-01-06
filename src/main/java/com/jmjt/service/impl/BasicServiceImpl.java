package com.jmjt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmjt.dao.BasicRepository;
import com.jmjt.model.Basic;
import com.jmjt.service.BasicService;

@Service
public class BasicServiceImpl implements BasicService {
	@Autowired
	private BasicRepository basicRepository;

	public List<Basic> findAll() {
		return basicRepository.findAll();
	}

	public Basic findById(int id) {
		Optional<Basic> basic = basicRepository.findById(id);
		if (!basic.isPresent()) {
			return null;
		}
		return basic.get();
	}

	public Basic save(Basic basic) {
		if (basic.getId() != 0) {
			return null;
		}
		return basicRepository.save(basic);
	}

	public Basic deleteById(int id) {
		Basic basic = findById(id);
		if (basic == null) {
			return null;
		}
		basicRepository.deleteById(id);
		return basic;
	}

	public Basic update(Basic basic) {
		basic = findById(basic.getId());
		if (basic == null) {
			return null;
		}
		return basicRepository.save(basic);
	}
}
