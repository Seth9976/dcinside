package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n59#2,3:1098\n62#2,2:1105\n64#2:1108\n99#2,8:1109\n33#3,4:1101\n38#3:1107\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1020#1:1098,3\n1020#1:1105,2\n1020#1:1108\n1026#1:1109,8\n1020#1:1101,4\n1020#1:1107\n*E\n"})
final class LazyStaggeredGridMeasuredItem {
    private final int a;
    @l
    private final Object b;
    @l
    private final List c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private boolean h;
    private final int i;
    private final int j;
    private final int k;

    public LazyStaggeredGridMeasuredItem(int v, @l Object object0, @l List list0, boolean z, int v1, int v2, int v3) {
        L.p(object0, "key");
        Integer integer1;
        L.p(list0, "placeables");
        super();
        this.a = v;
        this.b = object0;
        this.c = list0;
        this.d = z;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = true;
        int v5 = 0;
        Integer integer0 = 0;
        int v6 = list0.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Placeable placeable0 = (Placeable)list0.get(v7);
            integer0 = (int)(integer0.intValue() + (this.d ? placeable0.K1() : placeable0.N1()));
        }
        int v8 = integer0.intValue();
        this.i = v8;
        this.j = s.u(v8 + this.e, 0);
        List list1 = this.c;
        if(list1.isEmpty()) {
            integer1 = null;
        }
        else {
            Placeable placeable1 = (Placeable)list1.get(0);
            Integer integer2 = (int)(this.d ? placeable1.N1() : placeable1.K1());
            int v9 = u.J(list1);
            if(1 <= v9) {
                for(int v4 = 1; true; ++v4) {
                    Placeable placeable2 = (Placeable)list1.get(v4);
                    Integer integer3 = (int)(this.d ? placeable2.N1() : placeable2.K1());
                    if(integer3.compareTo(integer2) > 0) {
                        integer2 = integer3;
                    }
                    if(v4 == v9) {
                        break;
                    }
                }
            }
            integer1 = integer2;
        }
        if(integer1 != null) {
            v5 = (int)integer1;
        }
        this.k = v5;
    }

    public final int a() {
        return this.k;
    }

    public final int b() {
        return this.a;
    }

    @l
    public final Object c() {
        return this.b;
    }

    public final int d() {
        return this.f;
    }

    public final int e() {
        return this.i;
    }

    @l
    public final List f() {
        return this.c;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.e;
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.h;
    }

    // 去混淆评级： 低(20)
    @l
    public final LazyStaggeredGridPositionedItem l(int v, int v1, int v2, int v3) {
        long v4 = this.d ? IntOffsetKt.a(v2, v1) : IntOffsetKt.a(v1, v2);
        return this.d ? new LazyStaggeredGridPositionedItem(v4, this.a, v, this.b, IntSizeKt.a(this.k, this.j), this.c, this.d, v3, null) : new LazyStaggeredGridPositionedItem(v4, this.a, v, this.b, IntSizeKt.a(this.j, this.k), this.c, this.d, v3, null);
    }

    public final void m(boolean z) {
        this.h = z;
    }
}

