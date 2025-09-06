package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.c;
import com.google.android.material.animation.i;
import java.util.ArrayList;
import java.util.List;

abstract class b implements f {
    private final Context a;
    @NonNull
    private final ExtendedFloatingActionButton b;
    private final ArrayList c;
    private final a d;
    @Nullable
    private i e;
    @Nullable
    private i f;

    b(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton0, a a0) {
        this.c = new ArrayList();
        this.b = extendedFloatingActionButton0;
        this.a = extendedFloatingActionButton0.getContext();
        this.d = a0;
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    @CallSuper
    public void a() {
        this.d.b();
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    public final i b() {
        i i0 = this.f;
        if(i0 != null) {
            return i0;
        }
        if(this.e == null) {
            int v = this.f();
            this.e = i.d(this.a, v);
        }
        return (i)Preconditions.l(this.e);
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    @Nullable
    public i c() {
        return this.f;
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    public final void e(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.c.remove(animator$AnimatorListener0);
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    public AnimatorSet g() {
        return this.n(this.b());
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    @NonNull
    public final List getListeners() {
        return this.c;
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    @CallSuper
    public void j() {
        this.d.b();
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    public final void k(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        this.c.add(animator$AnimatorListener0);
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    public final void l(@Nullable i i0) {
        this.f = i0;
    }

    @NonNull
    AnimatorSet n(@NonNull i i0) {
        class com.google.android.material.floatingactionbutton.b.a extends Property {
            final b a;

            com.google.android.material.floatingactionbutton.b.a(Class class0, String s) {
                super(class0, s);
            }

            public Float a(ExtendedFloatingActionButton extendedFloatingActionButton0) {
                int v = Color.alpha(extendedFloatingActionButton0.O.getColorForState(extendedFloatingActionButton0.getDrawableState(), b.this.b.O.getDefaultColor()));
                return com.google.android.material.animation.b.a(0.0f, 1.0f, ((float)Color.alpha(extendedFloatingActionButton0.getCurrentTextColor())) / 255.0f / ((float)v));
            }

            public void b(ExtendedFloatingActionButton extendedFloatingActionButton0, Float float0) {
                int v = extendedFloatingActionButton0.O.getColorForState(extendedFloatingActionButton0.getDrawableState(), b.this.b.O.getDefaultColor());
                ColorStateList colorStateList0 = ColorStateList.valueOf(Color.argb(((int)(com.google.android.material.animation.b.a(0.0f, ((float)Color.alpha(v)) / 255.0f, ((float)float0)) * 255.0f)), Color.red(v), Color.green(v), Color.blue(v)));
                if(((float)float0) == 1.0f) {
                    extendedFloatingActionButton0.Y(extendedFloatingActionButton0.O);
                    return;
                }
                extendedFloatingActionButton0.Y(colorStateList0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((ExtendedFloatingActionButton)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((ExtendedFloatingActionButton)object0), ((Float)object1));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        if(i0.j("opacity")) {
            arrayList0.add(i0.f("opacity", this.b, View.ALPHA));
        }
        if(i0.j("scale")) {
            arrayList0.add(i0.f("scale", this.b, View.SCALE_Y));
            arrayList0.add(i0.f("scale", this.b, View.SCALE_X));
        }
        if(i0.j("width")) {
            arrayList0.add(i0.f("width", this.b, ExtendedFloatingActionButton.Y8));
        }
        if(i0.j("height")) {
            arrayList0.add(i0.f("height", this.b, ExtendedFloatingActionButton.Z8));
        }
        if(i0.j("paddingStart")) {
            arrayList0.add(i0.f("paddingStart", this.b, ExtendedFloatingActionButton.a9));
        }
        if(i0.j("paddingEnd")) {
            arrayList0.add(i0.f("paddingEnd", this.b, ExtendedFloatingActionButton.b9));
        }
        if(i0.j("labelOpacity")) {
            com.google.android.material.floatingactionbutton.b.a b$a0 = new com.google.android.material.floatingactionbutton.b.a(this, Float.class, "LABEL_OPACITY_PROPERTY");
            arrayList0.add(i0.f("labelOpacity", this.b, b$a0));
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        c.a(animatorSet0, arrayList0);
        return animatorSet0;
    }

    @Override  // com.google.android.material.floatingactionbutton.f
    @CallSuper
    public void onAnimationStart(Animator animator0) {
        this.d.c(animator0);
    }
}

