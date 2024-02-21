package com.ecommerce.product.service.imp;

import com.ecommerce.product.model.City;
import com.ecommerce.product.repository.CityRepository;
import com.ecommerce.product.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;
    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
