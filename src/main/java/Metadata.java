import lombok.*;
import org.apache.avro.reflect.AvroDefault;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Metadata {
    @AvroDefault(value="\"PP\"")
    private String profile;
    private int action;


    @Override
    public String toString(){
        return "Metadata{"+"profile="+this.profile+",action="+this.action+"}";
    }




}
