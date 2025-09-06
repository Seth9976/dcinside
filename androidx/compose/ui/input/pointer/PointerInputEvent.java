package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class PointerInputEvent {
    private final long a;
    @l
    private final List b;
    @l
    private final MotionEvent c;

    public PointerInputEvent(long v, @l List list0, @l MotionEvent motionEvent0) {
        L.p(list0, "pointers");
        L.p(motionEvent0, "motionEvent");
        super();
        this.a = v;
        this.b = list0;
        this.c = motionEvent0;
    }

    @l
    public final MotionEvent a() {
        return this.c;
    }

    @l
    public final List b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }
}

