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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class PredefinedPortProvider implements PortProvider {

    private final Iterator<Integer> current;

    public PredefinedPortProvider(Collection<Integer> ports) {
        List<Integer> allPorts = new LinkedList<>(ports);
        this.current = allPorts.iterator();
    }

    public PredefinedPortProvider(Integer ... ports) {
        List<Integer> allPorts = new LinkedList<>();
        Collections.addAll(allPorts, ports);
        this.current = allPorts.iterator();
    }

    @Override
    public int next() {
        if (!current.hasNext()) {
            throw new RuntimeException("Run out of ports!");
        }
        return current.next();
    }

    @Override
    public String providerType() {
        return "predefined";
    }
}
