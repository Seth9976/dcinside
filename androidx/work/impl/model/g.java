package androidx.work.impl.model;

import java.util.Set;
import kotlin.jvm.internal.L;
import y4.l;

public final class g {
    public static void a(WorkTagDao workTagDao0, @l String s, @l Set set0) {
        L.p(s, "id");
        L.p(set0, "tags");
        for(Object object0: set0) {
            workTagDao0.d(new WorkTag(((String)object0), s));
        }
    }
}

