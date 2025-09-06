package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface b {
    public static final String I0 = "##irrelevant";

    String id() default "";

    @Deprecated
    String schemaItemDefinition() default "##irrelevant";

    @Deprecated
    String schemaObjectPropertiesDefinition() default "##irrelevant";

    String schemaType() default "any";
}

