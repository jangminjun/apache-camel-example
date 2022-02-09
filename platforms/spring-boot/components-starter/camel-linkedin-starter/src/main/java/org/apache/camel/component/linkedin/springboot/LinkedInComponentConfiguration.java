/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.linkedin.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.component.linkedin.api.OAuthScope;
import org.apache.camel.component.linkedin.api.OAuthSecureStorage;
import org.apache.camel.component.linkedin.internal.LinkedInApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The linkedin component is uses for retrieving LinkedIn user profiles
 * connections companies groups posts etc.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.linkedin")
public class LinkedInComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use the shared configuration
     */
    private LinkedInConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public LinkedInConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            LinkedInConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class LinkedInConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.linkedin.LinkedInConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private LinkedInApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * LinkedIn user account name, MUST be provided
         */
        private String userName;
        /**
         * LinkedIn account password
         */
        private String userPassword;
        /**
         * Callback interface for providing an OAuth token or to store the token
         * generated by the component. The callback should return null on the
         * first call and then save the created token in the saveToken()
         * callback. If the callback returns null the first time, a userPassword
         * MUST be provided
         */
        private OAuthSecureStorage secureStorage;
        /**
         * LinkedIn application client ID
         */
        private String clientId;
        /**
         * LinkedIn application client secret
         */
        private String clientSecret;
        /**
         * List of LinkedIn scopes as specified at
         * https://developer.linkedin.com/documents/authentication#granting
         */
        private OAuthScope[] scopes;
        /**
         * Application redirect URI, although the component never redirects to
         * this page to avoid having to have a functioning redirect server. So
         * for testing one could use https://localhost
         */
        private String redirectUri;
        /**
         * Custom HTTP params, for example proxy host and port, use constants
         * from AllClientPNames
         */
        private Map httpParams;
        /**
         * Flag to enable/disable lazy OAuth, default is true. when enabled,
         * OAuth token retrieval or generation is not done until the first REST
         * call
         */
        private Boolean lazyAuth = true;

        public LinkedInApiName getApiName() {
            return apiName;
        }

        public void setApiName(LinkedInApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }

        public OAuthSecureStorage getSecureStorage() {
            return secureStorage;
        }

        public void setSecureStorage(OAuthSecureStorage secureStorage) {
            this.secureStorage = secureStorage;
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

        public OAuthScope[] getScopes() {
            return scopes;
        }

        public void setScopes(OAuthScope[] scopes) {
            this.scopes = scopes;
        }

        public String getRedirectUri() {
            return redirectUri;
        }

        public void setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
        }

        public Map getHttpParams() {
            return httpParams;
        }

        public void setHttpParams(Map httpParams) {
            this.httpParams = httpParams;
        }

        public Boolean getLazyAuth() {
            return lazyAuth;
        }

        public void setLazyAuth(Boolean lazyAuth) {
            this.lazyAuth = lazyAuth;
        }
    }
}