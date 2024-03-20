package com.konfigthis.client;

import com.konfigthis.client.api.AuthenticationApi;

public class VisierAuthentication {
    private ApiClient apiClient;
    public final AuthenticationApi authentication;

    public VisierAuthentication() {
        this(null);
    }

    public VisierAuthentication(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authentication = new AuthenticationApi(this.apiClient);
    }

}
