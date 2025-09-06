package s3;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

public enum b {
    CLASS,
    ANNOTATION_CLASS,
    TYPE_PARAMETER,
    PROPERTY,
    FIELD,
    LOCAL_VARIABLE,
    VALUE_PARAMETER,
    CONSTRUCTOR,
    FUNCTION,
    PROPERTY_GETTER,
    PROPERTY_SETTER,
    TYPE,
    EXPRESSION,
    FILE,
    @h0(version = "1.1")
    TYPEALIAS;

    private static final b[] p;
    private static final a q;

    static {
        b.p = arr_b;
        L.p(arr_b, "entries");
        b.q = new d(arr_b);
    }

    private static final b[] a() [...] // Inlined contents

    @l
    public static a b() {
        return b.q;
    }
}

