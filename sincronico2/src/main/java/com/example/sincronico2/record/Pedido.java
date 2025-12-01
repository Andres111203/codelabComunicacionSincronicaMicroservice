package com.example.sincronico2.record;

import com.example.sincronico2.dto.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}