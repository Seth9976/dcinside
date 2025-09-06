package androidx.compose.ui.node;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,53:1\n460#2,11:54\n523#2:65\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:54,11\n52#1:65\n*E\n"})
public final class MutableVectorWithMutationTracking {
    @l
    private final MutableVector a;
    @l
    private final a b;

    public MutableVectorWithMutationTracking(@l MutableVector mutableVector0, @l a a0) {
        L.p(mutableVector0, "vector");
        L.p(a0, "onVectorMutated");
        super();
        this.a = mutableVector0;
        this.b = a0;
    }

    public final void a(int v, Object object0) {
        this.a.a(v, object0);
        this.b.invoke();
    }

    @l
    public final List b() {
        return this.a.k();
    }

    public final void c() {
        this.a.l();
        this.b.invoke();
    }

    public final void d(@l Function1 function10) {
        L.p(function10, "block");
        MutableVector mutableVector0 = this.h();
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final Object e(int v) {
        return this.a.F()[v];
    }

    @l
    public final a f() {
        return this.b;
    }

    public final int g() {
        return this.a.J();
    }

    @l
    public final MutableVector h() {
        return this.a;
    }

    public final Object i(int v) {
        Object object0 = this.a.e0(v);
        this.b.invoke();
        return object0;
    }
}

