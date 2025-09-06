package androidx.compose.ui.node;

import A3.a;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,106:1\n100#1:107\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:107\n*E\n"})
public final class DepthSortedSet {
    private final boolean a;
    @l
    private final D b;
    @l
    private final Comparator c;
    @l
    private final TreeSet d;

    public DepthSortedSet() {
        this(false, 1, null);
    }

    public DepthSortedSet(boolean z) {
        this.a = z;
        this.b = E.c(H.c, androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2.e);
        androidx.compose.ui.node.DepthSortedSet.DepthComparator.1 depthSortedSet$DepthComparator$10 = new androidx.compose.ui.node.DepthSortedSet.DepthComparator.1();
        this.c = depthSortedSet$DepthComparator$10;
        this.d = new TreeSet(depthSortedSet$DepthComparator$10);

        public final class androidx.compose.ui.node.DepthSortedSet.DepthComparator.1 implements Comparator {
            public int b(@l LayoutNode layoutNode0, @l LayoutNode layoutNode1) {
                L.p(layoutNode0, "l1");
                L.p(layoutNode1, "l2");
                int v = L.t(layoutNode0.b0(), layoutNode1.b0());
                return v == 0 ? L.t(layoutNode0.hashCode(), layoutNode1.hashCode()) : v;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((LayoutNode)object0), ((LayoutNode)object1));
            }
        }


        final class androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2 extends N implements a {
            public static final androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2 e;

            static {
                androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2.e = new androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2();
            }

            androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2() {
                super(0);
            }

            @l
            public final Map b() {
                return new LinkedHashMap();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    public DepthSortedSet(boolean z, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    public final void a(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        if(!layoutNode0.o()) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.a) {
            Integer integer0 = (Integer)this.c().get(layoutNode0);
            if(integer0 == null) {
                this.c().put(layoutNode0, layoutNode0.b0());
            }
            else if(((int)integer0) != layoutNode0.b0()) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.d.add(layoutNode0);
    }

    public final boolean b(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        boolean z = this.d.contains(layoutNode0);
        if(this.a && z != this.c().containsKey(layoutNode0)) {
            throw new IllegalStateException("Check failed.");
        }
        return z;
    }

    private final Map c() {
        return (Map)this.b.getValue();
    }

    public final boolean d() {
        return this.d.isEmpty();
    }

    public final boolean e() {
        return !this.d();
    }

    @l
    public final LayoutNode f() {
        LayoutNode layoutNode0 = (LayoutNode)this.d.first();
        L.o(layoutNode0, "node");
        this.h(layoutNode0);
        return layoutNode0;
    }

    public final void g(@l Function1 function10) {
        L.p(function10, "block");
        while(!this.d()) {
            function10.invoke(this.f());
        }
    }

    public final boolean h(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        if(!layoutNode0.o()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = this.d.remove(layoutNode0);
        if(this.a) {
            Integer integer0 = (Integer)this.c().remove(layoutNode0);
            if(z) {
                if(integer0 == null || ((int)integer0) != layoutNode0.b0()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            else if(integer0 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return z;
    }

    @Override
    @l
    public String toString() {
        String s = this.d.toString();
        L.o(s, "set.toString()");
        return s;
    }
}

