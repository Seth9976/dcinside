package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.k;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
@k(message = "Replaced by the androidx.resourceinpsection package.")
@e(a.a)
@f(allowedTargets = {b.i, b.j, b.k})
public @interface InspectableProperty {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(a.a)
    @f(allowedTargets = {b.b, b.a})
    public @interface EnumEntry {
        String name();

        int value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @e(a.a)
    @f(allowedTargets = {b.b, b.a})
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    public static enum ValueType {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID;

        private static final ValueType[] h;
        private static final kotlin.enums.a i;

        static {
            ValueType.h = arr_inspectableProperty$ValueType;
            L.p(arr_inspectableProperty$ValueType, "entries");
            ValueType.i = new d(arr_inspectableProperty$ValueType);
        }

        private static final ValueType[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return ValueType.i;
        }
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.b;
}

