package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.h0;
import s3.b;
import s3.f;
import z3.i;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@h0(version = "1.3")
@f(allowedTargets = {b.a})
public @interface kotlin.coroutines.jvm.internal.f {
    @i(name = "c")
    String c() default "";

    @i(name = "f")
    String f() default "";

    @i(name = "i")
    int[] i() default {};

    @i(name = "l")
    int[] l() default {};

    @i(name = "m")
    String m() default "";

    @i(name = "n")
    String[] n() default {};

    @i(name = "s")
    String[] s() default {};

    @i(name = "v")
    int v() default 1;
}

