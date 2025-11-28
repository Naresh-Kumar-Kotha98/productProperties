package com.productprops.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productprops")
public class ProductPropsController {
  
  @GetMapping("/")
  public ResponseEntity<String> getProdcutProps(){
    return new ResponseEntity<String>("get prod props", HttpStatus.OK);
  }

}
