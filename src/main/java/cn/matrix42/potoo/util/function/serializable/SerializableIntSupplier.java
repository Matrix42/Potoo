package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntSupplier;

@FunctionalInterface
public interface SerializableIntSupplier extends IntSupplier, Serializable {

}
