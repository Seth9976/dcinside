package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.material.motion.j;
import com.google.android.material.shape.e;
import com.google.android.material.shape.n;
import com.google.android.material.shape.p;

class v {
    interface b {
        @NonNull
        e a(@NonNull e arg1, @NonNull e arg2);
    }

    static final int a = -1;
    @AttrRes
    static final int b = 0;
    private static final int c = 0;
    private static final int d = 1;
    private static final RectF e;

    static {
        v.e = new RectF();
    }

    static float b(@NonNull RectF rectF0) {
        return rectF0.width() * rectF0.height();
    }

    static p c(p p0, RectF rectF0) {
        return p0.y((e e0) -> n.b(rectF0, e0));
    }

    static Shader d(@ColorInt int v) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, v, v, Shader.TileMode.CLAMP);
    }

    @NonNull
    static Object e(@Nullable Object object0, @NonNull Object object1) {
        return object0 == null ? object1 : object0;
    }

    static View f(View view0, @IdRes int v) {
        String s = view0.getResources().getResourceName(v);
        while(view0 != null) {
            if(view0.getId() == v) {
                return view0;
            }
            ViewParent viewParent0 = view0.getParent();
            if(!(viewParent0 instanceof View)) {
                break;
            }
            view0 = (View)viewParent0;
        }
        throw new IllegalArgumentException(s + " is not a valid ancestor");
    }

    static View g(View view0, @IdRes int v) {
        View view1 = view0.findViewById(v);
        return view1 == null ? v.f(view0, v) : view1;
    }

    static RectF h(View view0) {
        int[] arr_v = new int[2];
        view0.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        int v1 = arr_v[1];
        return new RectF(((float)v), ((float)v1), ((float)(view0.getWidth() + v)), ((float)(view0.getHeight() + v1)));
    }

    static RectF i(View view0) {
        return new RectF(((float)view0.getLeft()), ((float)view0.getTop()), ((float)view0.getRight()), ((float)view0.getBottom()));
    }

    static Rect j(View view0) {
        return new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
    }

    private static boolean k(p p0, RectF rectF0) {
        return p0.r().a(rectF0) != 0.0f || p0.t().a(rectF0) != 0.0f || p0.l().a(rectF0) != 0.0f || p0.j().a(rectF0) != 0.0f;
    }

    static float m(float f, float f1, float f2) [...] // Inlined contents

    static float n(float f, float f1, @FloatRange(from = 0.0, to = 1.0) float f2, @FloatRange(from = 0.0, to = 1.0) float f3, @FloatRange(from = 0.0, to = 1.0) float f4) {
        return v.o(f, f1, f2, f3, f4, false);
    }

    static float o(float f, float f1, @FloatRange(from = 0.0, to = 1.0) float f2, @FloatRange(from = 0.0, to = 1.0) float f3, @FloatRange(from = 0.0) float f4, boolean z) {
        if(z && (f4 < 0.0f || f4 > 1.0f)) {
            return f + f4 * (f1 - f);
        }
        if(f4 < f2) {
            return f;
        }
        return f4 > f3 ? f1 : v.m(f, f1, (f4 - f2) / (f3 - f2));
    }

    static int p(int v, int v1, @FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1, @FloatRange(from = 0.0, to = 1.0) float f2) {
        if(f2 < f) {
            return v;
        }
        return f2 > f1 ? v1 : ((int)v.m(v, v1, (f2 - f) / (f1 - f)));
    }

    static p q(p p0, p p1, RectF rectF0, RectF rectF1, @FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1, @FloatRange(from = 0.0, to = 1.0) float f2) {
        class a implements b {
            final RectF a;
            final RectF b;
            final float c;
            final float d;
            final float e;

            a(RectF rectF0, RectF rectF1, float f, float f1, float f2) {
                this.b = rectF1;
                this.c = f;
                this.d = f1;
                this.e = f2;
                super();
            }

            @Override  // com.google.android.material.transition.v$b
            @NonNull
            public e a(@NonNull e e0, @NonNull e e1) {
                return new com.google.android.material.shape.a(v.n(e0.a(this.a), e1.a(this.b), this.c, this.d, this.e));
            }
        }

        if(f2 < f) {
            return p0;
        }
        return f2 > f1 ? p1 : v.z(p0, p1, rectF0, new a(rectF0, rectF1, f, f1, f2));
    }

    static void r(TransitionSet transitionSet0, @Nullable Transition transition0) {
        if(transition0 != null) {
            transitionSet0.Q0(transition0);
        }
    }

    static boolean s(Transition transition0, Context context0, @AttrRes int v) {
        if(v != 0 && transition0.J() == -1L) {
            int v1 = j.f(context0, v, -1);
            if(v1 != -1) {
                transition0.C0(((long)v1));
                return true;
            }
        }
        return false;
    }

    static boolean t(Transition transition0, Context context0, @AttrRes int v, TimeInterpolator timeInterpolator0) {
        if(v != 0 && transition0.M() == null) {
            transition0.E0(j.g(context0, v, timeInterpolator0));
            return true;
        }
        return false;
    }

    static boolean u(Transition transition0, Context context0, @AttrRes int v) {
        if(v != 0) {
            PathMotion pathMotion0 = v.w(context0, v);
            if(pathMotion0 != null) {
                transition0.G0(pathMotion0);
                return true;
            }
        }
        return false;
    }

    static void v(TransitionSet transitionSet0, @Nullable Transition transition0) {
        if(transition0 != null) {
            transitionSet0.b1(transition0);
        }
    }

    @Nullable
    static PathMotion w(Context context0, @AttrRes int v) {
        TypedValue typedValue0 = new TypedValue();
        if(context0.getTheme().resolveAttribute(v, typedValue0, true)) {
            int v1 = typedValue0.type;
            if(v1 == 16) {
                int v2 = typedValue0.data;
                if(v2 == 0) {
                    return null;
                }
                if(v2 != 1) {
                    throw new IllegalArgumentException("Invalid motion path type: " + v2);
                }
                return new k();
            }
            if(v1 != 3) {
                throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
            }
            return new PatternPathMotion(PathParser.e(String.valueOf(typedValue0.string)));
        }
        return null;
    }

    private static int x(Canvas canvas0, Rect rect0, int v) {
        v.e.set(rect0);
        return canvas0.saveLayerAlpha(v.e, v);
    }

    static void y(Canvas canvas0, Rect rect0, float f, float f1, float f2, int v, D1.a.a a$a0) {
        if(v <= 0) {
            return;
        }
        int v1 = canvas0.save();
        canvas0.translate(f, f1);
        canvas0.scale(f2, f2);
        if(v < 0xFF) {
            v.x(canvas0, rect0, v);
        }
        a$a0.a(canvas0);
        canvas0.restoreToCount(v1);
    }

    // 去混淆评级： 低(20)
    static p z(p p0, p p1, RectF rectF0, b v$b0) {
        return v.k(p0, rectF0) ? p0.v().L(v$b0.a(p0.r(), p1.r())).Q(v$b0.a(p0.t(), p1.t())).y(v$b0.a(p0.j(), p1.j())).D(v$b0.a(p0.l(), p1.l())).m() : p1.v().L(v$b0.a(p0.r(), p1.r())).Q(v$b0.a(p0.t(), p1.t())).y(v$b0.a(p0.j(), p1.j())).D(v$b0.a(p0.l(), p1.l())).m();
    }
}

