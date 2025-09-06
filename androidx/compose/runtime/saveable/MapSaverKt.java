package androidx.compose.runtime.saveable;

import A3.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MapSaverKt {
    @l
    public static final Saver a(@l o o0, @l Function1 function10) {
        L.p(o0, "save");
        L.p(function10, "restore");
        return ListSaverKt.a(new o(o0) {
            final o e;

            {
                this.e = o0;
                super(2);
            }

            @l
            public final List a(@l SaverScope saverScope0, Object object0) {
                L.p(saverScope0, "$this$listSaver");
                List list0 = new ArrayList();
                for(Object object1: ((Map)this.e.invoke(saverScope0, object0)).entrySet()) {
                    list0.add(((Map.Entry)object1).getKey());
                    list0.add(((Map.Entry)object1).getValue());
                }
                return list0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((SaverScope)object0), object1);
            }
        }, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            @m
            public final Object a(@l List list0) {
                L.p(list0, "list");
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                if(list0.size() % 2 != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                for(int v = 0; v < list0.size(); v += 2) {
                    Object object0 = list0.get(v);
                    L.n(object0, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap0.put(((String)object0), list0.get(v + 1));
                }
                return this.e.invoke(linkedHashMap0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        });
    }
}

