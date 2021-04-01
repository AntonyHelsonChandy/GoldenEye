package com.example.Eye.src.Transformer;

import lombok.*;

import java.util.Map;





@SuppressWarnings("all")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class GenericProfileAxonRequest {

    private Keys keys;
    private Map<String,String> payload;
    private Metadata metadata;

    @Override
    public String toString(){
        return "com.example.Eye.src.Transformer.GenericProfileAxonRequest{"+"keys="+this.keys+",payload="+this.payload+",metadata="+this.metadata+"}";
    }



}
