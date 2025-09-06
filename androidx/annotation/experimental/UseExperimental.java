package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.c0;
import kotlin.k;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@k(message = "This annotation has been replaced by `@OptIn`", replaceWith = @c0(expression = "OptIn", imports = {"androidx.annotation.OptIn"}))
@e(a.b)
@f(allowedTargets = {b.a, b.d, b.f, b.g, b.h, b.i, b.j, b.k, b.n, b.o})
public @interface UseExperimental {
    Class[] markerClass();
}

