package androidx.compose.foundation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class EdgeEffectCompat {
    @l
    public static final EdgeEffectCompat a;

    static {
        EdgeEffectCompat.a = new EdgeEffectCompat();
    }

    @l
    public final EdgeEffect a(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        return Build.VERSION.SDK_INT >= 0x1F ? Api31Impl.a.a(context0, attributeSet0) : new GlowEdgeEffectCompat(context0);
    }

    public final float b(@l EdgeEffect edgeEffect0) {
        L.p(edgeEffect0, "<this>");
        return Build.VERSION.SDK_INT < 0x1F ? 0.0f : Api31Impl.a.b(edgeEffect0);
    }

    public final void c(@l EdgeEffect edgeEffect0, int v) {
        L.p(edgeEffect0, "<this>");
        if(Build.VERSION.SDK_INT >= 0x1F) {
            edgeEffect0.onAbsorb(v);
            return;
        }
        if(edgeEffect0.isFinished()) {
            edgeEffect0.onAbsorb(v);
        }
    }

    public final float d(@l EdgeEffect edgeEffect0, float f, float f1) {
        L.p(edgeEffect0, "<this>");
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return Api31Impl.a.c(edgeEffect0, f, f1);
        }
        edgeEffect0.onPull(f, f1);
        return f;
    }

    public final void e(@l EdgeEffect edgeEffect0, float f) {
        L.p(edgeEffect0, "<this>");
        if(edgeEffect0 instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat)edgeEffect0).a(f);
            return;
        }
        edgeEffect0.onRelease();
    }
}

