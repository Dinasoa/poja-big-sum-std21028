package com.poja.bigsum.endpoint.rest.controller.health;

import static com.poja.bigsum.file.FileHashAlgorithm.NONE;
import static java.io.File.createTempFile;
import static java.nio.file.Files.createTempDirectory;
import static java.util.UUID.randomUUID;

import com.poja.bigsum.PojaGenerated;
import com.poja.bigsum.file.BucketComponent;
import com.poja.bigsum.file.FileHash;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSum {
  @GetMapping(value = "/big-sum")
  public BigInteger bigIntCalcul(@RequestParam(name = "a") String a,
                                 @RequestParam(name = "b") String b) {
    BigInteger sum;
    BigInteger numA = new BigInteger(a);
    BigInteger numB = new BigInteger(b);
    sum = a.add(b);
    return sum;
  }
}
