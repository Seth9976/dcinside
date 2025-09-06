package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o0;
import s3.a;
import s3.b;
import s3.c;
import s3.d;
import s3.e;
import s3.f;

@Documented
@Repeatable(Container.class)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@c
@d
@e(a.b)
@f(allowedTargets = {b.b, b.a, b.i, b.j, b.k, b.h, b.e, b.n})
public @interface RequiresExtension {
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @o0
    @e(a.b)
    @f(allowedTargets = {b.b, b.a, b.i, b.j, b.k, b.h, b.e, b.n})
    public @interface Container {
        RequiresExtension[] value();
    }

    int extension();

    int version();
}

