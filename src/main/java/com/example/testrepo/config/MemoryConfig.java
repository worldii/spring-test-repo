package com.example.testrepo.config;

import com.example.memory.MemoryController;
import com.example.memory.MemoryFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 public class MemoryConfig {
     @Bean
     public MemoryController memoryController() {
         return new MemoryController(memoryFinder());
     }
     @Bean
     public MemoryFinder memoryFinder() {
         return new MemoryFinder();
     }
}
