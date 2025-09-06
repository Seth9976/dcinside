package l;

import java.util.Arrays;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class b {
    public static final void a(@l a a0, @l Iterable iterable0) {
        L.p(a0, "$this$registerPickers");
        L.p(iterable0, "pickers");
        for(Object object0: iterable0) {
            a0.k(((codes.side.andcolorpicker.view.picker.b)object0));
        }
    }

    public static final void b(@l a a0, @l codes.side.andcolorpicker.view.picker.b[] arr_b) {
        L.p(a0, "$this$registerPickers");
        L.p(arr_b, "pickers");
        b.a(a0, u.O(((codes.side.andcolorpicker.view.picker.b[])Arrays.copyOf(arr_b, arr_b.length))));
    }
}

