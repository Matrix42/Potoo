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

import cn.matrix42.potoo.annotation.NotNull;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class Preconditions {

    private Preconditions() {

    }

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     * @param reference object reference
     * @param <T> object type
     * @return none null object
     * @since 1.0.0
     */
    public static <T extends @NotNull Object> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    /**
     * Checks the given boolean condition, and throws an {@code IllegalArgumentException} if
     * the condition is not met (evaluates to {@code false}).
     *
     * @param condition The condition to check
     *
     * @throws IllegalArgumentException Thrown, if the condition is violated.
     *
     * @since 1.0.0
     */
    public static void checkArgument(boolean condition) {
        if (!condition) {
            throw new IllegalArgumentException();
        }
    }

}
