package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class TypefaceDirtyTrackerLinkedList {
    @l
    private final State a;
    @m
    private final TypefaceDirtyTrackerLinkedList b;
    @l
    private final Object c;

    public TypefaceDirtyTrackerLinkedList(@l State state0, @m TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList0) {
        L.p(state0, "resolveResult");
        super();
        this.a = state0;
        this.b = typefaceDirtyTrackerLinkedList0;
        this.c = state0.getValue();
    }

    public TypefaceDirtyTrackerLinkedList(State state0, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList0, int v, w w0) {
        if((v & 2) != 0) {
            typefaceDirtyTrackerLinkedList0 = null;
        }
        this(state0, typefaceDirtyTrackerLinkedList0);
    }

    @l
    public final Object a() {
        return this.c;
    }

    @l
    public final Typeface b() {
        L.n(this.c, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface)this.c;
    }

    // 去混淆评级： 低(20)
    public final boolean c() {
        return this.a.getValue() != this.c || this.b != null && this.b.c();
    }
}

