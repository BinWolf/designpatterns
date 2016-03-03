package com.wolf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by wolf on 15/12/16.
 */
@Target(ElementType.ANNOTATION_TYPE)
public @interface ClassAndType {

    public String tableName() default "className";

}
