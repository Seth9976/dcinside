package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.k;
import s3.a;
import s3.b;
import s3.c;
import s3.e;
import s3.f;
import y4.l;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@c
@e(a.b)
@f(allowedTargets = {b.b, b.a, b.i, b.j, b.k, b.h, b.e, b.n})
public @interface RestrictTo {
    public static enum Scope {
        LIBRARY,
        LIBRARY_GROUP,
        LIBRARY_GROUP_PREFIX,
        @k(message = "Use LIBRARY_GROUP_PREFIX instead.")
        GROUP_ID,
        TESTS,
        SUBCLASSES;

        private static final Scope[] g;
        private static final kotlin.enums.a h;

        static {
            Scope.g = arr_restrictTo$Scope;
            L.p(arr_restrictTo$Scope, "entries");
            Scope.h = new d(arr_restrictTo$Scope);
        }

        private static final Scope[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return Scope.h;
        }
    }

    Scope[] value();
}

