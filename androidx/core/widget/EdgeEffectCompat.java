package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;

public final class EdgeEffectCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static void a(EdgeEffect edgeEffect0, float f, float f1) {
            edgeEffect0.onPull(f, f1);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        public static EdgeEffect a(Context context0, AttributeSet attributeSet0) {
            try {
                return new EdgeEffect(context0, attributeSet0);
            }
            catch(Throwable unused_ex) {
                return new EdgeEffect(context0);
            }
        }

        public static float b(EdgeEffect edgeEffect0) {
            try {
                return edgeEffect0.getDistance();
            }
            catch(Throwable unused_ex) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect0, float f, float f1) {
            try {
                return edgeEffect0.onPullDistance(f, f1);
            }
            catch(Throwable unused_ex) {
                edgeEffect0.onPull(f, f1);
                return 0.0f;
            }
        }
    }

    private final EdgeEffect a;

    @Deprecated
    public EdgeEffectCompat(Context context0) {
        this.a = new EdgeEffect(context0);
    }

    public static EdgeEffect a(Context context0, AttributeSet attributeSet0) {
        return Build.VERSION.SDK_INT < 0x1F ? new EdgeEffect(context0) : Api31Impl.a(context0, attributeSet0);
    }

    @Deprecated
    public boolean b(Canvas canvas0) {
        return this.a.draw(canvas0);
    }

    @Deprecated
    public void c() {
        this.a.finish();
    }

    public static float d(EdgeEffect edgeEffect0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0.0f : Api31Impl.b(edgeEffect0);
    }

    @Deprecated
    public boolean e() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean f(int v) {
        this.a.onAbsorb(v);
        return true;
    }

    public static void g(EdgeEffect edgeEffect0, float f, float f1) {
        Api21Impl.a(edgeEffect0, f, f1);
    }

    @Deprecated
    public boolean h(float f) {
        this.a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean i(float f, float f1) {
        EdgeEffectCompat.g(this.a, f, f1);
        return true;
    }

    public static float j(EdgeEffect edgeEffect0, float f, float f1) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return Api31Impl.c(edgeEffect0, f, f1);
        }
        EdgeEffectCompat.g(edgeEffect0, f, f1);
        return f;
    }

    @Deprecated
    public boolean k() {
        this.a.onRelease();
        return this.a.isFinished();
    }

    @Deprecated
    public void l(int v, int v1) {
        this.a.setSize(v, v1);
    }
}

