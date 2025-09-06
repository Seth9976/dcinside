package androidx.core.graphics;

import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class x {
    public static List a(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            Objects.requireNonNull(object0);
            arrayList0.add(object0);
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }
}

