package cn.matrix42.potoo.util.function.serializable;

import java.io.Serializable;
import java.util.function.IntToDoubleFunction;

@FunctionalInterface
public interface SerializableIntToDoubleFunction extends IntToDoubleFunction, Serializable {

}
