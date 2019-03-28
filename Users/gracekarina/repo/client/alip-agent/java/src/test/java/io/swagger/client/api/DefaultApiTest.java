/*
 * alip-agent
 * ALIP Agent Summary
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ERRORUNKNOWN;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Get Agent Summary from ALIP
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void agentsIdSummaryGetTest() throws ApiException {
        String clientId = null;
        String clientSecret = null;
        String id = null;
        Map<String, ERRORUNKNOWN> response = api.agentsIdSummaryGet(clientId, clientSecret, id);

        // TODO: test validations
    }
    
}
