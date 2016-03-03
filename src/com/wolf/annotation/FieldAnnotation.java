package com.wolf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wolf on 15/12/16.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldAnnotation {

    public String name() default "fieldName";

    public String setFuncName() default "setField";

    public String getFuncName() default "getField";

    public boolean defaultDBValue() default false;

}
