package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class ClicksCounter {
    @l
    private final ViewConfiguration a;
    private int b;
    @m
    private PointerInputChange c;

    public ClicksCounter(@l ViewConfiguration viewConfiguration0) {
        L.p(viewConfiguration0, "viewConfiguration");
        super();
        this.a = viewConfiguration0;
    }

    public final int a() {
        return this.b;
    }

    @m
    public final PointerInputChange b() {
        return this.c;
    }

    public final boolean c(@l PointerInputChange pointerInputChange0, @l PointerInputChange pointerInputChange1) {
        L.p(pointerInputChange0, "prevClick");
        L.p(pointerInputChange1, "newClick");
        return ((double)Offset.m(Offset.u(pointerInputChange1.q(), pointerInputChange0.q()))) < 100.0;
    }

    public final void d(int v) {
        this.b = v;
    }

    public final void e(@m PointerInputChange pointerInputChange0) {
        this.c = pointerInputChange0;
    }

    public final boolean f(@l PointerInputChange pointerInputChange0, @l PointerInputChange pointerInputChange1) {
        L.p(pointerInputChange0, "prevClick");
        L.p(pointerInputChange1, "newClick");
        return pointerInputChange1.z() - pointerInputChange0.z() < this.a.c();
    }

    public final void g(@l PointerEvent pointerEvent0) {
        L.p(pointerEvent0, "event");
        PointerInputChange pointerInputChange0 = this.c;
        PointerInputChange pointerInputChange1 = (PointerInputChange)pointerEvent0.e().get(0);
        if(pointerInputChange0 == null || !this.f(pointerInputChange0, pointerInputChange1) || !this.c(pointerInputChange0, pointerInputChange1)) {
            this.b = 1;
        }
        else {
            ++this.b;
        }
        this.c = pointerInputChange1;
    }
}

