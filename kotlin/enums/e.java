package kotlin.enums;

import java.io.Serializable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class e implements Serializable {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final Class a;
    @l
    private static final a b;
    private static final long c;

    static {
        e.b = new a(null);
    }

    public e(@l Enum[] arr_enum) {
        L.p(arr_enum, "entries");
        super();
        Class class0 = arr_enum.getClass().getComponentType();
        L.m(class0);
        this.a = class0;
    }

    private final Object a() {
        Object[] arr_object = this.a.getEnumConstants();
        L.o(arr_object, "getEnumConstants(...)");
        return c.c(((Enum[])arr_object));
    }
}

