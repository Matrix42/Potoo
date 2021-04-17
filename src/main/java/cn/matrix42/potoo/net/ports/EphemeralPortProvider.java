/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.matrix42.potoo.net.ports;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class EphemeralPortProvider implements PortProvider {

    @Override
    public int next() {
        try {
            final ServerSocket socket = new ServerSocket(0);
            socket.setReuseAddress(false);
            int port = socket.getLocalPort();
            socket.close();
            return port;
        } catch (IOException e) {
            //should not ever happen
            throw new RuntimeException("Could not provide ephemeral port.", e);
        }
    }

    @Override
    public String providerType() {
        return "ephemeral";
    }
}
