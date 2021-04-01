package com.example.Eye.src.Transformer;
import java.util.HashMap;import java.util.Map;
public enum KeyConstants { PAN_INDEX((byte) 1, true), PAR_INDEX((byte) -1, false), UUID_INDEX((byte) -2, false);
 private byte index; private boolean sensitive;
 private static Map<Byte, KeyConstants> indices = new HashMap<>();
 static { for (KeyConstants constant : KeyConstants.values()) { indices.put(constant.index, constant); } }
 KeyConstants(byte index, boolean sensitive) { this.index = index; this.sensitive = sensitive; }
 public int getIndex() { return index; }
public boolean isSensitive() { return sensitive; }
 public static KeyConstants getKeyConstant(int code) { return indices.get((byte) code); }}
