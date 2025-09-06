package kotlin.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.h0;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import z3.i;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@h0(version = "1.6")
@e(a.b)
@f(allowedTargets = {b.a})
public @interface p0 {
    @i(name = "b")
    String[] b() default {};
}

