package m4;

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

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@F({f.class})
@K(typeKinds = {H.g, H.h}, types = {Float.class, Double.class})
@e(typeKinds = {H.b, H.d, H.e, H.c, H.g, H.h}, types = {Byte.class, Integer.class, Long.class, Short.class, Float.class, Double.class}, value = {I.d})
@h
public @interface b {
}

