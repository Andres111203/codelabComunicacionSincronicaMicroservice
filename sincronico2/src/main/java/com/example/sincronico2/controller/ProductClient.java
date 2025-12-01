package com.example.sincronico2.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.sincronico2.dto.ProductoDTO;

@FeignClient(name = "producto-service")
public interface ProductClient {

    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}
