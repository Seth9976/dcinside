package androidx.work;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class OverwritingInputMerger extends InputMerger {
    @Override  // androidx.work.InputMerger
    @l
    public Data a(@l List list0) {
        L.p(list0, "inputs");
        Builder data$Builder0 = new Builder();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: list0) {
            linkedHashMap0.putAll(((Data)object0).m());
        }
        data$Builder0.d(linkedHashMap0);
        return data$Builder0.a();
    }
}

