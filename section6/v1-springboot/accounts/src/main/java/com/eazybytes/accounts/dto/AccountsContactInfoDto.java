package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//record: ensure data can not be change (immutable)
// automatically generate properties like (name, email, phone),getter and setter, toString, equals, hashcode
@ConfigurationProperties(prefix = "accounts") // reference at application.yml define properties, and to use this annotation use need to @EnableConfigurationProperties at Springboot application
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}
