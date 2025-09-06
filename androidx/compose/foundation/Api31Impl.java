package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(0x1F)
final class Api31Impl {
    @l
    public static final Api31Impl a;

    static {
        Api31Impl.a = new Api31Impl();
    }

    @DoNotInline
    @l
    public final EdgeEffect a(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        try {
            return new EdgeEffect(context0, attributeSet0);
        }
        catch(Throwable unused_ex) {
            return new EdgeEffect(context0);
        }
    }

    @DoNotInline
    public final float b(@l EdgeEffect edgeEffect0) {
        L.p(edgeEffect0, "edgeEffect");
        try {
            return edgeEffect0.getDistance();
        }
        catch(Throwable unused_ex) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float c(@l EdgeEffect edgeEffect0, float f, float f1) {
        L.p(edgeEffect0, "edgeEffect");
        try {
            return edgeEffect0.onPullDistance(f, f1);
        }
        catch(Throwable unused_ex) {
            edgeEffect0.onPull(f, f1);
            return 0.0f;
        }
    }
}

