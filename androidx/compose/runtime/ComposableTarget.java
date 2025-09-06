package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@e(a.b)
@f(allowedTargets = {b.n, b.a, b.i, b.j, b.l, b.c})
public @interface ComposableTarget {
    String applier();
}

