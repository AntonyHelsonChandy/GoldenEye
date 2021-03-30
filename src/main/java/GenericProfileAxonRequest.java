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




}
