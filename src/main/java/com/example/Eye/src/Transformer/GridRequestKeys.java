package com.example.Eye.src.Transformer;

import com.google.common.collect.ImmutableMap;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
public class GridRequestKeys {  private static final String REPLACEMENT = "replacement";
 public static final String PAN = "pan"; public static final String UUID = "uuid";


public static final String TOKEN = "token"; public static final String TUR = "tur"; public static final String REPLACEMENT_PAN = "replacementPan";
private static final Map<String, KeyConstants> KEY_NAME_TO_KEY_CONSTANT_MAP = ImmutableMap.of( PAN, KeyConstants.PAN_INDEX, TOKEN, KeyConstants.PAN_INDEX, UUID, KeyConstants.UUID_INDEX, TUR, KeyConstants.UUID_INDEX );
 private GridRequestKeys() {}
 public static KeyConstants getKeyConstant(String keyType) { return KEY_NAME_TO_KEY_CONSTANT_MAP.get(keyType);}
public static boolean isReplacementKey(String keyName) {return StringUtils.containsIgnoreCase(keyName, REPLACEMENT); }}