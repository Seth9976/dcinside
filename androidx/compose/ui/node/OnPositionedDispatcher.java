package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,73:1\n1182#2:74\n1161#2,2:75\n728#3,2:77\n728#3,2:79\n492#3,11:81\n460#3,11:93\n163#4:92\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:74\n26#1:75,2\n29#1:77,2\n35#1:79,2\n42#1:81,11\n56#1:93,11\n56#1:92\n*E\n"})
public final class OnPositionedDispatcher {
    public static final class Companion {
        static final class DepthComparator implements Comparator {
            @l
            public static final DepthComparator a;

            static {
                DepthComparator.a = new DepthComparator();
            }

            public int b(@l LayoutNode layoutNode0, @l LayoutNode layoutNode1) {
                L.p(layoutNode0, "a");
                L.p(layoutNode1, "b");
                int v = L.t(layoutNode1.b0(), layoutNode0.b0());
                return v == 0 ? L.t(layoutNode0.hashCode(), layoutNode1.hashCode()) : v;
            }

            // 检测为 Lambda 实现
            @Override
            public int compare(Object object0, Object object1) [...]
        }

        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final MutableVector a;
    @l
    public static final Companion b;

    static {
        OnPositionedDispatcher.b = new Companion(null);
    }

    public OnPositionedDispatcher() {
        this.a = new MutableVector(new LayoutNode[16], 0);
    }

    public final void a() {
        this.a.k0((Object object0, Object object1) -> this.b(((LayoutNode)object0), ((LayoutNode)object1)));
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.F();
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.w0()) {
                    this.b(layoutNode0);
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        this.a.l();
    }

    private final void b(LayoutNode layoutNode0) {
        layoutNode0.P();
        int v = 0;
        layoutNode0.P1(false);
        MutableVector mutableVector0 = layoutNode0.I0();
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            while(true) {
                this.b(((LayoutNode)arr_object[v]));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    public final void c(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "node");
        this.a.b(layoutNode0);
        layoutNode0.P1(true);
    }

    public final void d(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "rootNode");
        this.a.l();
        this.a.b(layoutNode0);
        layoutNode0.P1(true);
    }
}

