package com.example.Eye.src.Transformer;

import com.google.common.collect.Maps;
import java.util.Arrays;import java.util.Map;
public enum RequestType {DELETE(0), UPDATE(1), LIFECYCLE(2);
 private final int action;
 private static final Map<Integer, RequestType> requestTypeMap;
 RequestType(int action) { this.action = action; }
static { requestTypeMap = Maps.uniqueIndex(Arrays.asList(RequestType.values()), RequestType::getAction);}
private int getAction() { return action; }
 public static RequestType getRequestType(int action) {return requestTypeMap.get(action);}}