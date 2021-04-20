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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import cn.matrix42.potoo.annotation.NotNull;
import cn.matrix42.potoo.annotation.Nullable;

/**
 * @author Matrix42
 * @since 1.0.0
 */
public class ArrayUtils {

    /**
     * @param array to be projected array.
     * @param indexes to be reserved element index array.
     * @param <T> array element type.
     * @return projected array.
     * @since 1.0.0
     */
    public static <T> T[] project(@NotNull T[] array, @NotNull int[] indexes) {
        Preconditions.checkNotNull(array);
        Preconditions.checkNotNull(indexes);
        for (int index : indexes) {
            Preconditions.checkArgument(index < array.length);
        }
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), indexes.length);
        for (int i = 0; i < indexes.length; i++) {
            newArray[i] = array[indexes[i]];
        }
        return newArray;
    }

    public static <T> void knuthShuffle(@NotNull T[] array) {
        Preconditions.checkNotNull(array);
        Random random = new Random();
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            int t = i + random.nextInt() % (n - i);
            //每次随机出i~n-1之间的下标
            swap(array, i, t);
        }
    }

    public static <T> void swap(@NotNull T[] array, int index1, int index2) {
        Preconditions.checkNotNull(array);
        Preconditions.checkArgument(index1 < array.length);
        Preconditions.checkArgument(index2 < array.length);
        T tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * If the array contains other arrays as elements, they are converted to strings
     * by the Object.toString method inherited from Object,
     * which describes their identities rather than their contents.
     * @param array the array whose string representation to return.
     * @return a string representation of array.
     * @since 1.0.0
     */
    public static String toString(@Nullable Object[] array) {
        return Arrays.toString(array);
    }

}
