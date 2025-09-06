package f4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.F;
import x4.H;
import x4.I;
import x4.K;
import x4.e;
import x4.h;
import x4.r;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@F({f.class})
@K(typeKinds = {H.a, H.b, H.f, H.h, H.g, H.d, H.e, H.c}, types = {String.class})
@e(typeKinds = {H.a, H.b, H.f, H.h, H.g, H.d, H.e, H.c}, types = {String.class, Void.class}, value = {I.d, I.l})
@h
public @interface d {
    @r
    String[] value() default {};
}

