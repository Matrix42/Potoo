package cn.matrix42.potoo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Matrix42
 * @since 1.0.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Public
public @interface Internal {

}
