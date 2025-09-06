package K0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nFpsCompressorInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,113:1\n1279#2,2:114\n1293#2,4:116\n216#3,2:120\n*S KotlinDebug\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n*L\n44#1:114,2\n44#1:116,4\n67#1:120,2\n*E\n"})
public final class c {
    public static final class a {
        @l
        private final Map a;
        @l
        private final Map b;
        @l
        private final List c;

        public a(@l Map map0, @l Map map1, @l List list0) {
            L.p(map0, "compressedAnim");
            L.p(map1, "realToReducedIndex");
            L.p(list0, "removedFrames");
            super();
            this.a = map0;
            this.b = map1;
            this.c = list0;
        }

        @l
        public final Map a() {
            return this.a;
        }

        @l
        public final Map b() {
            return this.b;
        }

        @l
        public final List c() {
            return this.c;
        }
    }

    private final int a;

    public c(int v) {
        this.a = v;
    }

    @l
    public final Map a(int v, int v1, int v2) {
        float f = s.A(s.t(((float)s.B(s.u(v2, 1), this.a)) * (((float)v) / 1000.0f), 0.0f), v1);
        int v3 = 0;
        kotlin.ranges.l l0 = s.W1(0, v1);
        Map map0 = new LinkedHashMap(s.u(Y.j(u.b0(l0, 10)), 16));
        for(Object object0: l0) {
            int v4 = ((Number)object0).intValue();
            if(((int)(((float)v4) % (((float)v1) / f))) == 0) {
                v3 = v4;
            }
            map0.put(object0, v3);
        }
        return map0;
    }

    @l
    public final a b(int v, @l Map map0, int v1) {
        L.p(map0, "frameBitmaps");
        return this.c(map0, this.a(v, map0.size(), v1));
    }

    private final a c(Map map0, Map map1) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            int v = ((Number)((Map.Entry)object0).getKey()).intValue();
            com.facebook.common.references.a a0 = (com.facebook.common.references.a)((Map.Entry)object0).getValue();
            Integer integer0 = (Integer)map1.get(v);
            if(integer0 == null) {
            }
            else if(linkedHashMap0.containsKey(integer0)) {
                arrayList0.add(a0);
            }
            else {
                linkedHashMap0.put(integer0, a0);
            }
        }
        return new a(linkedHashMap0, map1, arrayList0);
    }

    public final float d(int v) [...] // Inlined contents
}

