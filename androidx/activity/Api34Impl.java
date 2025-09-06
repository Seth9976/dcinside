package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(34)
public final class Api34Impl {
    @l
    public static final Api34Impl a;

    static {
        Api34Impl.a = new Api34Impl();
    }

    @DoNotInline
    @l
    public final BackEvent a(float f, float f1, float f2, int v) {
        return new BackEvent(f, f1, f2, v);
    }

    @DoNotInline
    public final float b(@l BackEvent backEvent0) {
        L.p(backEvent0, "backEvent");
        return backEvent0.getProgress();
    }

    @DoNotInline
    public final int c(@l BackEvent backEvent0) {
        L.p(backEvent0, "backEvent");
        return backEvent0.getSwipeEdge();
    }

    @DoNotInline
    public final float d(@l BackEvent backEvent0) {
        L.p(backEvent0, "backEvent");
        return backEvent0.getTouchX();
    }

    @DoNotInline
    public final float e(@l BackEvent backEvent0) {
        L.p(backEvent0, "backEvent");
        return backEvent0.getTouchY();
    }
}

