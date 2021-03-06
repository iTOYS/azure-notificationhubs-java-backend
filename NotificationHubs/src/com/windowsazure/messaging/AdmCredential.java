//----------------------------------------------------------------
// Copyright (c) Microsoft Corporation. All rights reserved.
//----------------------------------------------------------------

package com.windowsazure.messaging;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

public final class AdmCredential extends PnsCredential {
    private String clientId;
    private String clientSecret;

    public AdmCredential() {
        this(null, null);
    }

    public AdmCredential(String clientId, String clientSecret) {
        super();
        this.setClientId(clientId);
        this.setClientSecret(clientSecret);
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Override
    public List<SimpleEntry<String, String>> getProperties() {
        ArrayList<SimpleEntry<String, String>> result = new ArrayList<>();
        result.add(new SimpleEntry<>("ClientId", getClientId()));
        result.add(new SimpleEntry<>("ClientSecret", getClientSecret()));
        return result;
    }

    @Override
    public String getRootTagName() {
        return "AdmCredential";
    }
}
