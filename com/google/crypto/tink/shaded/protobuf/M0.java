package com.google.crypto.tink.shaded.protobuf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface m0 {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}

