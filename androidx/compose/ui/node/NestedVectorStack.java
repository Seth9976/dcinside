package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
public final class NestedVectorStack {
    private int a;
    private int b;
    @l
    private int[] c;
    @l
    private final MutableVector d;

    public NestedVectorStack() {
        this.a = -1;
        this.c = new int[16];
        this.d = new MutableVector(new MutableVector[16], 0);
    }

    public final boolean a() {
        return this.a >= 0 && this.c[this.a] >= 0;
    }

    public final Object b() {
        int v = this.a;
        int v1 = this.c[v];
        MutableVector mutableVector0 = (MutableVector)this.d.F()[v];
        if(v1 > 0) {
            --this.c[v];
            return mutableVector0.F()[v1];
        }
        if(v1 == 0) {
            this.d.e0(v);
            --this.a;
        }
        return mutableVector0.F()[v1];
    }

    public final void c(@l MutableVector mutableVector0) {
        L.p(mutableVector0, "vector");
        if(mutableVector0.O()) {
            this.d.b(mutableVector0);
            this.d(mutableVector0.J() - 1);
            ++this.a;
        }
    }

    private final void d(int v) {
        int[] arr_v = this.c;
        if(this.b >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            L.o(arr_v1, "copyOf(this, newSize)");
            this.c = arr_v1;
        }
        int v1 = this.b;
        this.b = v1 + 1;
        this.c[v1] = v;
    }
}

