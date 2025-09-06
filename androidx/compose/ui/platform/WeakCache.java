package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
public final class WeakCache {
    @l
    private final MutableVector a;
    @l
    private final ReferenceQueue b;

    public WeakCache() {
        this.a = new MutableVector(new Reference[16], 0);
        this.b = new ReferenceQueue();
    }

    private final void a() {
        do {
            Reference reference0 = this.b.poll();
            if(reference0 != null) {
                this.a.a0(reference0);
            }
        }
        while(reference0 != null);
    }

    public final int b() {
        this.a();
        return this.a.J();
    }

    @m
    public final Object c() {
        this.a();
        while(this.a.O()) {
            Object object0 = ((Reference)this.a.e0(this.a.J() - 1)).get();
            if(object0 != null) {
                return object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void d(Object object0) {
        this.a();
        WeakReference weakReference0 = new WeakReference(object0, this.b);
        this.a.b(weakReference0);
    }
}

