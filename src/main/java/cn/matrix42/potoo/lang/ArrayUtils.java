package cn.matrix42.potoo.lang;

import java.lang.reflect.Array;
import java.util.Arrays;

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
