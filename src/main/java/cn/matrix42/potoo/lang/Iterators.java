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
