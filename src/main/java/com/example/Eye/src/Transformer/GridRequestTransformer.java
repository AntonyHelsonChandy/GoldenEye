package com.example.Eye.src.Transformer;

import com.example.Eye.Model.GenericGridProfileRequest;
import com.example.Eye.Model.GridProfileRequestMap;
import com.example.Eye.Model.PPRequest;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.util.stream.Collectors;

public class GridRequestTransformer {

    private static final Logger LOGGER = LogManager.getLogger(GridRequestTransformer.class);


    private JsonTransformer jsonTransformer;
    public GridProfileRequestMap transform(final List<GenericProfileAxonRequest> genericProfileAxonRequests){
        GenericProfileAxonRequest genericProfileAxonRequest = genericProfileAxonRequests.get(0);

        final Set<PPRequest> ppCategoryRequestSet = Sets.newLinkedHashSet();
        final Set<List<PPRequest>> ppMultiStepRequestSet = Sets.newLinkedHashSet();
        final List<PPRequest> ppMultiStepRequests = Lists.newArrayList();
        final Map<Integer, GenericProfileAxonRequest> originalRequestMap = Maps.newHashMap();

        try {
            final GenericGridProfileRequest genericGridProfileRequest = this.buildGenericGridProfileRequest(genericProfileAxonRequest);
           // final RequestType requestType = genericGridProfileRequest.getRequestType();
            final RequestType requestType = null;
            final Map<String, Object> categoryMap = genericGridProfileRequest.getCategoryMap();
            if (RequestType.UPDATE.equals(requestType) || RequestType.DELETE.equals(requestType))
            {
                
            }





        } catch (Exception e) {
            e.printStackTrace();
        }


        return new GridProfileRequestMap();










    }


    private GenericGridProfileRequest buildGenericGridProfileRequest(GenericProfileAxonRequest genericProfileAxonRequest){
String replacementIdentifier = null;
final String identifier;
final KeyConstants keyConstants;
final Keys genericKeys = genericProfileAxonRequest.getKeys();

 if (StringUtils.isNotBlank(genericKeys.getPan())) {
 identifier = genericKeys.getPan();
replacementIdentifier = genericKeys.getReplacemntPan();
keyConstants = GridRequestKeys.getKeyConstant(GridRequestKeys.PAN);
} else if (StringUtils.isNotBlank(genericKeys.getToken())) {
 identifier = genericKeys.getToken();
 keyConstants = GridRequestKeys.getKeyConstant(GridRequestKeys.TOKEN); }
 else if (StringUtils.isNotBlank(genericKeys.getUuid())) {
identifier = genericKeys.getUuid();
 keyConstants = GridRequestKeys.getKeyConstant(GridRequestKeys.UUID);
} else if (StringUtils.isNotBlank(genericKeys.getTur())) {
identifier = genericKeys.getTur();
keyConstants = GridRequestKeys.getKeyConstant(GridRequestKeys.TUR);
} else {
 throw new IllegalArgumentException("Valid key not provided");
}

 final Metadata genericMetadata = genericProfileAxonRequest.getMetadata();
 final RequestType requestType = RequestType.getRequestType(genericMetadata.getAction());

 final Map<String, String> genericPayload = genericProfileAxonRequest.getPayload();
final Map<String, Object> categoryMap = genericPayload.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> this.jsonTransformer.jsonToMap(entry.getValue()), (existing, replacement) -> replacement, LinkedHashMap::new));


return new GenericGridProfileRequest(identifier, replacementIdentifier, keyConstants, requestType, categoryMap);


    }


}
