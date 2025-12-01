package com.example.sincronico2.dto;

@Getter  
@Setter  
public class ProductoDTO {  
    private Long id;  
    private String nombre;  
    private Double precio;  
    
    @Override  
    public String toString() {  
        return "ProductoDTO{" +  
                "id=" + id +  
                ", nombre='" + nombre + '\'' +  
                ", precio=" + precio +  
                '}';  
    }  
}