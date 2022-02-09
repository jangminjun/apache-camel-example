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
package org.apache.camel.component.jetty.jettyproducer;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jetty.BaseJettyTest;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.Test;

/**
 *
 */
public class JettyHttpProducerSendEmptyHeaderTest extends BaseJettyTest {

    @Test
    public void testHttpProducerSendEmptyHeader() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);
        String expectedValue = isJetty8() ? "" : null; 
        mock.expectedHeaderReceived("foo", expectedValue);

        template.sendBodyAndHeader("jetty:http://localhost:{{port}}/myapp/mytest", "Hello World", "foo", "");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                allowNullHeaders();
                from("jetty:http://localhost:{{port}}/myapp/mytest")
                    .convertBodyTo(String.class)
                    .to("mock:result");
            }
        };
    }
}
