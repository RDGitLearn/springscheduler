package com.rishudixit.sce.sleuthzipkinclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin2.ZipkinProperties;
import org.springframework.context.annotation.Bean;

import zipkin2.Span;

@SpringBootApplication
public class SleuthzipkinclientApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(SleuthzipkinclientApplication.class, args);
	}
}
