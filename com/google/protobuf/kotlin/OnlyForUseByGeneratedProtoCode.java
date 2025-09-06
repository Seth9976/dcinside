package com.google.protobuf.kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.d0.a;
import kotlin.d0;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@d0(level = a.b, message = "\n    This API is only intended for use by generated protobuf code, the code generator, and their own\n    tests.  If this does not describe your code, you should not be using this API.\n  ")
@e(s3.a.b)
@f(allowedTargets = {b.h, b.b})
public @interface OnlyForUseByGeneratedProtoCode {
}

