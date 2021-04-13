package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.BooleanSupplier;

@FunctionalInterface
public interface SerializableBooleanSupplier extends BooleanSupplier, Serializable {

}
