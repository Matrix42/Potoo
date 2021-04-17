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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import static cn.matrix42.potoo.lang.Preconditions.checkNotNull;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class Lists {

    private Lists() {

    }

    /**
     *
     * @param <E> element type.
     * @return new empty ArrayList
     * @since 1.0.0
     */
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    /**
     *
     * @param <E> element type.
     * @return new empty LinkedList
     * @since 1.0.0
     */
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    /**
     *
     * @param <E> element type.
     * @return Creates a ArrayList containing the given elements
     * @since 1.0.0
     */
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> elements) {
        checkNotNull(elements);
        if (elements instanceof Collection) {
            return new ArrayList<>((Collection<E>) elements);
        } else {
            return newArrayList(elements.iterator());
        }
    }

    /**
     *
     * @param <E> element type.
     * @return Creates a ArrayList containing the given elements
     * @since 1.0.0
     */
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> elements) {
        ArrayList<E> list = newArrayList();
        Iterators.addAll(list, elements);
        return list;
    }

}
