package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class SelectionHandleInfo {
    @l
    private final Handle a;
    private final long b;

    private SelectionHandleInfo(Handle handle0, long v) {
        this.a = handle0;
        this.b = v;
    }

    public SelectionHandleInfo(Handle handle0, long v, w w0) {
        this(handle0, v);
    }

    @l
    public final Handle a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @l
    public final SelectionHandleInfo c(@l Handle handle0, long v) {
        L.p(handle0, "handle");
        return new SelectionHandleInfo(handle0, v, null);
    }

    public static SelectionHandleInfo d(SelectionHandleInfo selectionHandleInfo0, Handle handle0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            handle0 = selectionHandleInfo0.a;
        }
        if((v1 & 2) != 0) {
            v = selectionHandleInfo0.b;
        }
        return selectionHandleInfo0.c(handle0, v);
    }

    @l
    public final Handle e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SelectionHandleInfo)) {
            return false;
        }
        return this.a == ((SelectionHandleInfo)object0).a ? Offset.l(this.b, ((SelectionHandleInfo)object0).b) : false;
    }

    public final long f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + Offset.s(this.b);
    }

    @Override
    @l
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + Offset.y(this.b) + ')';
    }
}

