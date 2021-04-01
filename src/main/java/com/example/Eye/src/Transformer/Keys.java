package com.example.Eye.src.Transformer;

import lombok.*;
import org.springframework.lang.Nullable;







@SuppressWarnings("all")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Keys



{
    @Nullable
private String pan;
@Nullable
    private String token;
@Nullable
    private String uuid;
@Nullable
    private String tur;
@Nullable
    private String replacemntPan;


@Override
public String toString(){
    return "com.example.Eye.src.Transformer.Keys{"+"pan="+this.pan+",token="+this.token+",token="+",uuid="+this.uuid+",tur="+this.tur+"replacemntPan"+this.replacemntPan+"}";
}



}