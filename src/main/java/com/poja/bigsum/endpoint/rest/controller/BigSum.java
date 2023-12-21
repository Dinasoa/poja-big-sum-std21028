package com.poja.bigsum.endpoint.rest.controller;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSum {
  @GetMapping(value = "/big-sum")
  public BigInteger bigIntCalcul(@RequestParam(name = "a") String a,
                                 @RequestParam(name = "b") String b) {
    BigInteger sum;
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);
    sum = numA.add(numB);
    return sum;
  }
}
