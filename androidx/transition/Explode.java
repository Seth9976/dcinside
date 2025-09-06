package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Explode extends Visibility {
    private int[] b9;
    private static final TimeInterpolator c9 = null;
    private static final TimeInterpolator d9 = null;
    private static final String e9 = "android:explode:screenBounds";

    static {
        Explode.c9 = new DecelerateInterpolator();
        Explode.d9 = new AccelerateInterpolator();
    }

    public Explode() {
        this.b9 = new int[2];
        this.H0(new CircularPropagation());
    }

    public Explode(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b9 = new int[2];
        this.H0(new CircularPropagation());
    }

    private void L0(TransitionValues transitionValues0) {
        View view0 = transitionValues0.b;
        view0.getLocationOnScreen(this.b9);
        int[] arr_v = this.b9;
        int v = arr_v[0];
        int v1 = arr_v[1];
        Rect rect0 = new Rect(v, v1, view0.getWidth() + v, view0.getHeight() + v1);
        transitionValues0.a.put("android:explode:screenBounds", rect0);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator P0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues1 == null) {
            return null;
        }
        Rect rect0 = (Rect)transitionValues1.a.get("android:explode:screenBounds");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        this.W0(viewGroup0, rect0, this.b9);
        return TranslationAnimationCreator.a(view0, transitionValues1, rect0.left, rect0.top, f + ((float)this.b9[0]), f1 + ((float)this.b9[1]), f, f1, Explode.c9, this);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator R0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        float f3;
        float f2;
        if(transitionValues0 == null) {
            return null;
        }
        Rect rect0 = (Rect)transitionValues0.a.get("android:explode:screenBounds");
        int v = rect0.left;
        int v1 = rect0.top;
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        int[] arr_v = (int[])transitionValues0.b.getTag(id.transition_position);
        if(arr_v == null) {
            f2 = f;
            f3 = f1;
        }
        else {
            int v2 = arr_v[0];
            f2 = ((float)(v2 - rect0.left)) + f;
            f3 = ((float)(arr_v[1] - rect0.top)) + f1;
            rect0.offsetTo(v2, arr_v[1]);
        }
        this.W0(viewGroup0, rect0, this.b9);
        return TranslationAnimationCreator.a(view0, transitionValues0, v, v1, f, f1, f2 + ((float)this.b9[0]), f3 + ((float)this.b9[1]), Explode.d9, this);
    }

    private static float U0(float f, float f1) {
        return (float)Math.sqrt(f * f + f1 * f1);
    }

    private static float V0(View view0, int v, int v1) {
        return Explode.U0(Math.max(v, view0.getWidth() - v), Math.max(v1, view0.getHeight() - v1));
    }

    private void W0(View view0, Rect rect0, int[] arr_v) {
        int v3;
        int v2;
        view0.getLocationOnScreen(this.b9);
        int[] arr_v1 = this.b9;
        int v = arr_v1[0];
        int v1 = arr_v1[1];
        Rect rect1 = this.K();
        if(rect1 == null) {
            v2 = view0.getWidth() / 2 + v + Math.round(view0.getTranslationX());
            v3 = view0.getHeight() / 2 + v1 + Math.round(view0.getTranslationY());
        }
        else {
            int v4 = rect1.centerX();
            v3 = rect1.centerY();
            v2 = v4;
        }
        float f = (float)(rect0.centerX() - v2);
        float f1 = (float)(rect0.centerY() - v3);
        if(f == 0.0f && f1 == 0.0f) {
            f = ((float)(Math.random() * 2.0)) - 1.0f;
            f1 = ((float)(Math.random() * 2.0)) - 1.0f;
        }
        float f2 = Explode.U0(f, f1);
        float f3 = Explode.V0(view0, v2 - v, v3 - v1);
        arr_v[0] = Math.round(f / f2 * f3);
        arr_v[1] = Math.round(f3 * (f1 / f2));
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Visibility
    public void m(@NonNull TransitionValues transitionValues0) {
        super.m(transitionValues0);
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Visibility
    public void p(@NonNull TransitionValues transitionValues0) {
        super.p(transitionValues0);
        this.L0(transitionValues0);
    }
}

