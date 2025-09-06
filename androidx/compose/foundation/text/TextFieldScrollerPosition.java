package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@Stable
@s0({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n102#2,2:371\n76#2:373\n102#2,2:374\n76#2:376\n102#2,2:377\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n253#1:370\n253#1:371,2\n259#1:373\n259#1:374,2\n274#1:376\n274#1:377,2\n*E\n"})
public final class TextFieldScrollerPosition {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return TextFieldScrollerPosition.g;
        }
    }

    @l
    private final MutableState a;
    @l
    private final MutableState b;
    @l
    private Rect c;
    private long d;
    @l
    private final MutableState e;
    @l
    public static final Companion f;
    @l
    private static final Saver g;

    static {
        TextFieldScrollerPosition.f = new Companion(null);
        TextFieldScrollerPosition.g = ListSaverKt.a(TextFieldScrollerPosition.Companion.Saver.1.e, TextFieldScrollerPosition.Companion.Saver.2.e);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.a, 0.0f, 2, null);
    }

    public TextFieldScrollerPosition(@l Orientation orientation0, float f) {
        L.p(orientation0, "initialOrientation");
        super();
        this.a = SnapshotStateKt__SnapshotStateKt.g(f, null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.g(0.0f, null, 2, null);
        this.c = Rect.e.a();
        this.d = 0L;
        this.e = SnapshotStateKt.j(orientation0, SnapshotStateKt.w());
    }

    public TextFieldScrollerPosition(Orientation orientation0, float f, int v, w w0) {
        if((v & 2) != 0) {
            f = 0.0f;
        }
        this(orientation0, f);
    }

    public final void b(float f, float f1, int v) {
        float f4;
        float f2 = this.d();
        float f3 = f2 + ((float)v);
        if(f1 <= f3) {
            int v1 = Float.compare(f, f2);
            if(v1 < 0 && f1 - f > ((float)v)) {
                f4 = f1 - f3;
            }
            else {
                f4 = v1 >= 0 || f1 - f > ((float)v) ? 0.0f : f - f2;
            }
        }
        else {
            f4 = f1 - f3;
        }
        this.i(this.d() + f4);
    }

    public final float c() {
        return ((Number)this.b.getValue()).floatValue();
    }

    public final float d() {
        return ((Number)this.a.getValue()).floatValue();
    }

    public final int e(long v) {
        if(((int)(v >> 0x20)) != ((int)(this.d >> 0x20))) {
            return (int)(v >> 0x20);
        }
        return ((int)(v & 0xFFFFFFFFL)) == ((int)(this.d & 0xFFFFFFFFL)) ? TextRange.l(v) : ((int)(v & 0xFFFFFFFFL));
    }

    @l
    public final Orientation f() {
        return (Orientation)this.e.getValue();
    }

    public final long g() {
        return this.d;
    }

    private final void h(float f) {
        this.b.setValue(f);
    }

    public final void i(float f) {
        this.a.setValue(f);
    }

    public final void j(@l Orientation orientation0) {
        L.p(orientation0, "<set-?>");
        this.e.setValue(orientation0);
    }

    public final void k(long v) {
        this.d = v;
    }

    public final void l(@l Orientation orientation0, @l Rect rect0, int v, int v1) {
        L.p(orientation0, "orientation");
        L.p(rect0, "cursorRect");
        float f = (float)(v1 - v);
        this.h(f);
        if(rect0.t() != this.c.t() || rect0.B() != this.c.B()) {
            boolean z = orientation0 == Orientation.a;
            this.b((z ? rect0.B() : rect0.t()), (z ? rect0.j() : rect0.x()), v);
            this.c = rect0;
        }
        this.i(s.H(this.d(), 0.0f, f));
    }
}

