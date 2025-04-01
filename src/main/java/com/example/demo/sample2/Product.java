package com.example.demo.sample2;

import lombok.*;
import org.springframework.context.annotation.*;

@Getter
@AllArgsConstructor
public class Product {
  private int pno;
  private String vendor;
  private String name;
  private int price;
  private int stock;

}
