package androidx.compose.runtime.saveable;

import A3.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public final class ListSaverKt {
    @l
    public static final Saver a(@l o o0, @l Function1 function10) {
        L.p(o0, "save");
        L.p(function10, "restore");
        return SaverKt.a(new o(o0) {
            final o e;

            {
                this.e = o0;
                super(2);
            }

            @m
            public final Object a(@l SaverScope saverScope0, Object object0) {
                L.p(saverScope0, "$this$Saver");
                List list0 = (List)this.e.invoke(saverScope0, object0);
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = list0.get(v1);
                    if(object1 != null && !saverScope0.a(object1)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                return !list0.isEmpty() ? new ArrayList(list0) : null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((SaverScope)object0), object1);
            }
        }, ((Function1)v0.q(function10, 1)));
    }
}

