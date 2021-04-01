package com.example.Eye.src.Transformer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.Objects;
@Service
public class JsonTransformer {
private final ObjectMapper objectMapper;
@Autowired
public JsonTransformer(final ObjectMapper objectMapper) { this.objectMapper = Objects.requireNonNull(objectMapper, "objectMapper must not be null");}
  public Map<String, Object> jsonToMap(String json) { if (StringUtils.isNotBlank(json)) { try { return this.objectMapper.readValue(json, Map.class); } catch (JsonProcessingException e) { throw new IllegalArgumentException("Invalid json in request body"); } }   return Maps.newHashMap();  }}
