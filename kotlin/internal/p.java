package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.h0;
import kotlin.jvm.internal.o0;
import kotlin.m;
import s3.b;
import s3.d;
import s3.e;
import s3.f;

@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@h0(version = "1.2")
@d
@e(s3.a.a)
@f(allowedTargets = {b.a, b.i, b.d, b.h, b.o})
public @interface p {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @o0
    @e(s3.a.a)
    @f(allowedTargets = {b.a, b.i, b.d, b.h, b.o})
    public @interface a {
        p[] value();
    }

    int errorCode() default -1;

    m level() default m.b;

    String message() default "";

    String version();

    q versionKind() default q.a;
}

