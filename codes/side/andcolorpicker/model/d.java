package codes.side.andcolorpicker.model;

import android.util.Log;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public abstract class d implements a {
    public static final class codes.side.andcolorpicker.model.d.a {
        private codes.side.andcolorpicker.model.d.a() {
        }

        public codes.side.andcolorpicker.model.d.a(w w0) {
        }
    }

    @l
    private final int[] a;
    private static final String b = "IntegerColor";
    @l
    public static final codes.side.andcolorpicker.model.d.a c;

    static {
        d.c = new codes.side.andcolorpicker.model.d.a(null);
    }

    public d(int v, @m int[] arr_v) {
        int[] arr_v1 = new int[v];
        this.a = arr_v1;
        if(arr_v != null) {
            kotlin.collections.l.I0(arr_v, arr_v1, 0, 0, 0, 14, null);
        }
    }

    public d(int v, int[] arr_v, int v1, w w0) {
        if((v1 & 2) != 0) {
            arr_v = null;
        }
        this(v, arr_v);
    }

    public final void a(@l int[] arr_v) {
        L.p(arr_v, "array");
        if(arr_v.length != this.a.length) {
            Log.d("IntegerColor", "Copying values from array with different size");
        }
        kotlin.collections.l.I0(arr_v, this.a, 0, 0, 0, 14, null);
    }

    public final void b(@l int[] arr_v) {
        L.p(arr_v, "array");
        kotlin.collections.l.I0(this.a, arr_v, 0, 0, 0, 14, null);
    }

    @l
    protected final int[] c() {
        return this.a;
    }

    @Override  // codes.side.andcolorpicker.model.a
    @l
    public Object clone() {
        return codes.side.andcolorpicker.model.a.a.a(this);
    }

    public final void d(@l d d0) {
        L.p(d0, "color");
        d0.b(this.a);
    }

    protected final void e(int v, int v1, int v2, int v3) {
        this.a[v] = s.I(v1, v2, v3);
        String s = Arrays.toString(this.a);
        L.o(s, "java.util.Arrays.toString(this)");
        Log.d("IntegerColor", "Set " + this + " from " + s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!L.g(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type codes.side.andcolorpicker.model.IntegerColor");
        }
        return Arrays.equals(this.a, ((d)object0).a);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}

