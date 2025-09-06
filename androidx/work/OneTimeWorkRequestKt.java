package androidx.work;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import y4.l;
import z3.b;

public final class OneTimeWorkRequestKt {
    public static final Builder a() {
        L.y(4, "W");
        return new Builder(ListenableWorker.class);
    }

    @l
    public static final Builder b(@l Builder oneTimeWorkRequest$Builder0, @NonNull @l d d0) {
        L.p(oneTimeWorkRequest$Builder0, "<this>");
        L.p(d0, "inputMerger");
        return oneTimeWorkRequest$Builder0.D(b.e(d0));
    }
}

