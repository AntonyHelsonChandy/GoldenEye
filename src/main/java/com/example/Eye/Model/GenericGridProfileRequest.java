package com.example.Eye.Model;

import com.example.Eye.src.Transformer.KeyConstants;
import com.example.Eye.src.Transformer.RequestType;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;


@Getter
public class GenericGridProfileRequest { private String identifier; private String replacementIdentifier; private KeyConstants keyConstant; private RequestType requestType; private Map<String, Object> categoryMap;
 public GenericGridProfileRequest(final String identifier, final String replacementIdentifier, final KeyConstants keyConstant,final RequestType requestType, final Map<String, Object> categoryMap) { this.identifier = identifier; this.replacementIdentifier = replacementIdentifier; this.keyConstant = keyConstant; this.requestType = requestType; this.categoryMap = categoryMap; }
 public boolean isReplacementRequest() { return StringUtils.isNotBlank(this.replacementIdentifier);}}