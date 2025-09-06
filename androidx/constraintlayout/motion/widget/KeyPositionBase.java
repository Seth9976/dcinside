package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

abstract class KeyPositionBase extends Key {
    int D;
    protected static final float E = 20.0f;

    KeyPositionBase() {
        this.D = Key.f;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    void d(HashSet hashSet0) {
    }

    abstract void o(int arg1, int arg2, float arg3, float arg4, float arg5, float arg6);

    abstract float p();

    abstract float q();

    public abstract boolean r(int arg1, int arg2, RectF arg3, RectF arg4, float arg5, float arg6);

    abstract void s(View arg1, RectF arg2, RectF arg3, float arg4, float arg5, String[] arg6, float[] arg7);
}

