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

package cn.matrix42.potoo.lang;

import java.util.Collection;
import java.util.Iterator;

import static cn.matrix42.potoo.lang.Preconditions.checkNotNull;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class Iterators {

    private Iterators() {

    }

    /**
     * Adds all elements in iterator to collection.
     * @return {@code true} if {@code collection} was modified as a result of this operation
     * @since 1.0.0
     */
    public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
        checkNotNull(addTo);
        checkNotNull(iterator);
        boolean wasModified = false;
        while (iterator.hasNext()) {
            wasModified |= addTo.add(iterator.next());
        }
        return wasModified;
    }

}
