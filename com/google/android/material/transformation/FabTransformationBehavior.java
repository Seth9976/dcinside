package com.google.android.material.transformation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.animation.b;
import com.google.android.material.animation.c;
import com.google.android.material.animation.f;
import com.google.android.material.animation.i;
import com.google.android.material.animation.j;
import com.google.android.material.animation.k;
import com.google.android.material.circularreveal.c.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public static class e {
        @Nullable
        public i a;
        public k b;

    }

    private final Rect f;
    private final RectF g;
    private final RectF h;
    private final int[] i;
    private float j;
    private float k;

    public FabTransformationBehavior() {
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    public FabTransformationBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    @Override  // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet T(@NonNull View view0, @NonNull View view1, boolean z, boolean z1) {
        class a extends AnimatorListenerAdapter {
            final boolean a;
            final View b;
            final View c;
            final FabTransformationBehavior d;

            a(boolean z, View view0, View view1) {
                this.a = z;
                this.b = view0;
                this.c = view1;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(!this.a) {
                    this.b.setVisibility(4);
                    this.c.setAlpha(1.0f);
                    this.c.setVisibility(0);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                if(this.a) {
                    this.b.setVisibility(0);
                    this.c.setAlpha(0.0f);
                    this.c.setVisibility(4);
                }
            }
        }

        e fabTransformationBehavior$e0 = this.o0(view1.getContext(), z);
        if(z) {
            this.j = view0.getTranslationX();
            this.k = view0.getTranslationY();
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        this.h0(view0, view1, z, z1, fabTransformationBehavior$e0, arrayList0, arrayList1);
        this.m0(view0, view1, z, z1, fabTransformationBehavior$e0, arrayList0, arrayList1, this.g);
        float f = this.g.width();
        float f1 = this.g.height();
        this.g0(view0, view1, z, fabTransformationBehavior$e0, arrayList0);
        this.j0(view0, view1, z, z1, fabTransformationBehavior$e0, arrayList0, arrayList1);
        this.i0(view0, view1, z, z1, fabTransformationBehavior$e0, f, f1, arrayList0, arrayList1);
        this.f0(view0, view1, z, z1, fabTransformationBehavior$e0, arrayList0, arrayList1);
        this.e0(view0, view1, z, z1, fabTransformationBehavior$e0, arrayList0, arrayList1);
        AnimatorSet animatorSet0 = new AnimatorSet();
        c.a(animatorSet0, arrayList0);
        animatorSet0.addListener(new a(this, z, view1, view0));
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            animatorSet0.addListener(((Animator.AnimatorListener)arrayList1.get(v1)));
        }
        return animatorSet0;
    }

    @Nullable
    private ViewGroup U(@NonNull View view0) {
        View view1 = view0.findViewById(id.mtrl_child_content_container);
        if(view1 != null) {
            return this.p0(view1);
        }
        return view0 instanceof TransformationChildLayout || view0 instanceof TransformationChildCard ? this.p0(((ViewGroup)view0).getChildAt(0)) : this.p0(view0);
    }

    private void V(@NonNull View view0, @NonNull e fabTransformationBehavior$e0, @NonNull j j0, @NonNull j j1, float f, float f1, float f2, float f3, @NonNull RectF rectF0) {
        float f4 = this.c0(fabTransformationBehavior$e0, j0, f, f2);
        float f5 = this.c0(fabTransformationBehavior$e0, j1, f1, f3);
        view0.getWindowVisibleDisplayFrame(this.f);
        this.g.set(this.f);
        this.d0(view0, this.h);
        this.h.offset(f4, f5);
        this.h.intersect(this.g);
        rectF0.set(this.h);
    }

    private void W(@NonNull View view0, @NonNull RectF rectF0) {
        this.d0(view0, rectF0);
        rectF0.offset(this.j, this.k);
    }

    @NonNull
    private Pair X(float f, float f1, boolean z, @NonNull e fabTransformationBehavior$e0) {
        if(f != 0.0f) {
            int v = Float.compare(f1, 0.0f);
            if(v != 0) {
                return (!z || f1 >= 0.0f) && (z || v <= 0) ? new Pair(fabTransformationBehavior$e0.a.h("translationXCurveDownwards"), fabTransformationBehavior$e0.a.h("translationYCurveDownwards")) : new Pair(fabTransformationBehavior$e0.a.h("translationXCurveUpwards"), fabTransformationBehavior$e0.a.h("translationYCurveUpwards"));
            }
        }
        return new Pair(fabTransformationBehavior$e0.a.h("translationXLinear"), fabTransformationBehavior$e0.a.h("translationYLinear"));
    }

    private float Y(@NonNull View view0, @NonNull View view1, @NonNull k k0) {
        this.W(view0, this.g);
        this.d0(view1, this.h);
        float f = this.a0(view0, view1, k0);
        this.h.offset(-f, 0.0f);
        return this.g.centerX() - this.h.left;
    }

    private float Z(@NonNull View view0, @NonNull View view1, @NonNull k k0) {
        this.W(view0, this.g);
        this.d0(view1, this.h);
        float f = this.b0(view0, view1, k0);
        this.h.offset(0.0f, -f);
        return this.g.centerY() - this.h.top;
    }

    private float a0(@NonNull View view0, @NonNull View view1, @NonNull k k0) {
        RectF rectF0 = this.g;
        RectF rectF1 = this.h;
        this.W(view0, rectF0);
        this.d0(view1, rectF1);
        switch(k0.a & 7) {
            case 1: {
                return rectF1.centerX() - rectF0.centerX() + k0.b;
            }
            case 3: {
                return rectF1.left - rectF0.left + k0.b;
            }
            case 5: {
                return rectF1.right - rectF0.right + k0.b;
            }
            default: {
                return k0.b + 0.0f;
            }
        }
    }

    private float b0(@NonNull View view0, @NonNull View view1, @NonNull k k0) {
        RectF rectF0 = this.g;
        RectF rectF1 = this.h;
        this.W(view0, rectF0);
        this.d0(view1, rectF1);
        switch(k0.a & 0x70) {
            case 16: {
                return rectF1.centerY() - rectF0.centerY() + k0.c;
            }
            case 0x30: {
                return rectF1.top - rectF0.top + k0.c;
            }
            case 80: {
                return rectF1.bottom - rectF0.bottom + k0.c;
            }
            default: {
                return k0.c + 0.0f;
            }
        }
    }

    private float c0(@NonNull e fabTransformationBehavior$e0, @NonNull j j0, float f, float f1) {
        j j1 = fabTransformationBehavior$e0.a.h("expansion");
        return b.a(f, f1, j0.e().getInterpolation(((float)(j1.c() + j1.d() + 17L - j0.c())) / ((float)j0.d())));
    }

    private void d0(@NonNull View view0, RectF rectF0) {
        rectF0.set(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
        view0.getLocationInWindow(this.i);
        rectF0.offsetTo(((float)this.i[0]), ((float)this.i[1]));
        rectF0.offset(((float)(((int)(-view0.getTranslationX())))), ((float)(((int)(-view0.getTranslationY())))));
    }

    private void e0(View view0, View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, @NonNull List list0, List list1) {
        ObjectAnimator objectAnimator0;
        if(!(view1 instanceof ViewGroup)) {
            return;
        }
        if(view1 instanceof com.google.android.material.circularreveal.c && com.google.android.material.circularreveal.b.o == 0) {
            return;
        }
        ViewGroup viewGroup0 = this.U(view1);
        if(viewGroup0 == null) {
            return;
        }
        if(z) {
            if(!z1) {
                com.google.android.material.animation.e.a.set(viewGroup0, 0.0f);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(viewGroup0, com.google.android.material.animation.e.a, new float[]{1.0f});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(viewGroup0, com.google.android.material.animation.e.a, new float[]{0.0f});
        }
        fabTransformationBehavior$e0.a.h("contentFade").a(objectAnimator0);
        list0.add(objectAnimator0);
    }

    private void f0(@NonNull View view0, View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, @NonNull List list0, List list1) {
        ObjectAnimator objectAnimator0;
        if(!(view1 instanceof com.google.android.material.circularreveal.c)) {
            return;
        }
        int v = this.n0(view0);
        if(z) {
            if(!z1) {
                ((com.google.android.material.circularreveal.c)view1).setCircularRevealScrimColor(v);
            }
            objectAnimator0 = ObjectAnimator.ofInt(((com.google.android.material.circularreveal.c)view1), d.a, new int[]{0xFFFFFF & v});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofInt(((com.google.android.material.circularreveal.c)view1), d.a, new int[]{v});
        }
        objectAnimator0.setEvaluator(com.google.android.material.animation.d.b());
        fabTransformationBehavior$e0.a.h("color").a(objectAnimator0);
        list0.add(objectAnimator0);
    }

    private void g0(@NonNull View view0, @NonNull View view1, boolean z, @NonNull e fabTransformationBehavior$e0, @NonNull List list0) {
        float f = this.a0(view0, view1, fabTransformationBehavior$e0.b);
        float f1 = this.b0(view0, view1, fabTransformationBehavior$e0.b);
        Pair pair0 = this.X(f, f1, z, fabTransformationBehavior$e0);
        j j0 = (j)pair0.first;
        j j1 = (j)pair0.second;
        Property property0 = View.TRANSLATION_X;
        if(!z) {
            f = this.j;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, property0, new float[]{f});
        Property property1 = View.TRANSLATION_Y;
        if(!z) {
            f1 = this.k;
        }
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(view0, property1, new float[]{f1});
        j0.a(objectAnimator0);
        j1.a(objectAnimator1);
        list0.add(objectAnimator0);
        list0.add(objectAnimator1);
    }

    @TargetApi(21)
    private void h0(View view0, @NonNull View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, @NonNull List list0, List list1) {
        ObjectAnimator objectAnimator0;
        float f = ViewCompat.V(view1) - ViewCompat.V(view0);
        if(z) {
            if(!z1) {
                view1.setTranslationZ(-f);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Z, new float[]{0.0f});
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Z, new float[]{-f});
        }
        fabTransformationBehavior$e0.a.h("elevation").a(objectAnimator0);
        list0.add(objectAnimator0);
    }

    private void i0(@NonNull View view0, View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, float f, float f1, @NonNull List list0, @NonNull List list1) {
        class com.google.android.material.transformation.FabTransformationBehavior.d extends AnimatorListenerAdapter {
            final com.google.android.material.circularreveal.c a;
            final FabTransformationBehavior b;

            com.google.android.material.transformation.FabTransformationBehavior.d(com.google.android.material.circularreveal.c c0) {
                this.a = c0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                com.google.android.material.circularreveal.c.e c$e0 = this.a.getRevealInfo();
                c$e0.c = 3.402823E+38f;
                this.a.setRevealInfo(c$e0);
            }
        }

        Animator animator0;
        if(!(view1 instanceof com.google.android.material.circularreveal.c)) {
            return;
        }
        float f2 = this.Y(view0, view1, fabTransformationBehavior$e0.b);
        float f3 = this.Z(view0, view1, fabTransformationBehavior$e0.b);
        ((FloatingActionButton)view0).k(this.f);
        float f4 = ((float)this.f.width()) / 2.0f;
        j j0 = fabTransformationBehavior$e0.a.h("expansion");
        if(z) {
            if(!z1) {
                ((com.google.android.material.circularreveal.c)view1).setRevealInfo(new com.google.android.material.circularreveal.c.e(f2, f3, f4));
            }
            if(z1) {
                f4 = ((com.google.android.material.circularreveal.c)view1).getRevealInfo().c;
            }
            animator0 = com.google.android.material.circularreveal.a.a(((com.google.android.material.circularreveal.c)view1), f2, f3, H1.a.b(f2, f3, 0.0f, 0.0f, f, f1));
            animator0.addListener(new com.google.android.material.transformation.FabTransformationBehavior.d(this, ((com.google.android.material.circularreveal.c)view1)));
            this.l0(view1, j0.c(), ((int)f2), ((int)f3), f4, list0);
        }
        else {
            float f5 = ((com.google.android.material.circularreveal.c)view1).getRevealInfo().c;
            Animator animator1 = com.google.android.material.circularreveal.a.a(((com.google.android.material.circularreveal.c)view1), f2, f3, f4);
            this.l0(view1, j0.c(), ((int)f2), ((int)f3), f5, list0);
            this.k0(view1, j0.c(), j0.d(), fabTransformationBehavior$e0.a.i(), ((int)f2), ((int)f3), f4, list0);
            animator0 = animator1;
        }
        j0.a(animator0);
        list0.add(animator0);
        list1.add(com.google.android.material.circularreveal.a.c(((com.google.android.material.circularreveal.c)view1)));
    }

    private void j0(View view0, View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, @NonNull List list0, @NonNull List list1) {
        class com.google.android.material.transformation.FabTransformationBehavior.b implements ValueAnimator.AnimatorUpdateListener {
            final View a;
            final FabTransformationBehavior b;

            com.google.android.material.transformation.FabTransformationBehavior.b(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                this.a.invalidate();
            }
        }


        class com.google.android.material.transformation.FabTransformationBehavior.c extends AnimatorListenerAdapter {
            final com.google.android.material.circularreveal.c a;
            final Drawable b;
            final FabTransformationBehavior c;

            com.google.android.material.transformation.FabTransformationBehavior.c(com.google.android.material.circularreveal.c c0, Drawable drawable0) {
                this.a = c0;
                this.b = drawable0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setCircularRevealOverlayDrawable(null);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.a.setCircularRevealOverlayDrawable(this.b);
            }
        }

        ObjectAnimator objectAnimator0;
        if(view1 instanceof com.google.android.material.circularreveal.c && view0 instanceof ImageView) {
            Drawable drawable0 = ((ImageView)view0).getDrawable();
            if(drawable0 == null) {
                return;
            }
            drawable0.mutate();
            if(z) {
                if(!z1) {
                    drawable0.setAlpha(0xFF);
                }
                objectAnimator0 = ObjectAnimator.ofInt(drawable0, f.b, new int[]{0});
            }
            else {
                objectAnimator0 = ObjectAnimator.ofInt(drawable0, f.b, new int[]{0xFF});
            }
            objectAnimator0.addUpdateListener(new com.google.android.material.transformation.FabTransformationBehavior.b(this, view1));
            fabTransformationBehavior$e0.a.h("iconFade").a(objectAnimator0);
            list0.add(objectAnimator0);
            list1.add(new com.google.android.material.transformation.FabTransformationBehavior.c(this, ((com.google.android.material.circularreveal.c)view1), drawable0));
        }
    }

    private void k0(View view0, long v, long v1, long v2, int v3, int v4, float f, @NonNull List list0) {
        long v5 = v + v1;
        if(v5 < v2) {
            Animator animator0 = ViewAnimationUtils.createCircularReveal(view0, v3, v4, f, f);
            animator0.setStartDelay(v5);
            animator0.setDuration(v2 - v5);
            list0.add(animator0);
        }
    }

    private void l0(View view0, long v, int v1, int v2, float f, @NonNull List list0) {
        if(v > 0L) {
            Animator animator0 = ViewAnimationUtils.createCircularReveal(view0, v1, v2, f, f);
            animator0.setStartDelay(0L);
            animator0.setDuration(v);
            list0.add(animator0);
        }
    }

    @Override  // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean m(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1) {
        if(view0.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if(view1 instanceof FloatingActionButton) {
            int v = ((FloatingActionButton)view1).getExpandedComponentIdHint();
            return v == 0 || v == view0.getId();
        }
        return false;
    }

    private void m0(@NonNull View view0, @NonNull View view1, boolean z, boolean z1, @NonNull e fabTransformationBehavior$e0, @NonNull List list0, List list1, @NonNull RectF rectF0) {
        ObjectAnimator objectAnimator1;
        ObjectAnimator objectAnimator0;
        float f = this.a0(view0, view1, fabTransformationBehavior$e0.b);
        float f1 = this.b0(view0, view1, fabTransformationBehavior$e0.b);
        Pair pair0 = this.X(f, f1, z, fabTransformationBehavior$e0);
        j j0 = (j)pair0.first;
        j j1 = (j)pair0.second;
        if(z) {
            if(!z1) {
                view1.setTranslationX(-f);
                view1.setTranslationY(-f1);
            }
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, new float[]{0.0f});
            this.V(view1, fabTransformationBehavior$e0, j0, j1, -f, -f1, 0.0f, 0.0f, rectF0);
        }
        else {
            objectAnimator0 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_X, new float[]{-f});
            objectAnimator1 = ObjectAnimator.ofFloat(view1, View.TRANSLATION_Y, new float[]{-f1});
        }
        j0.a(objectAnimator0);
        j1.a(objectAnimator1);
        list0.add(objectAnimator0);
        list0.add(objectAnimator1);
    }

    private int n0(@NonNull View view0) {
        ColorStateList colorStateList0 = ViewCompat.Q(view0);
        return colorStateList0 == null ? 0 : colorStateList0.getColorForState(view0.getDrawableState(), colorStateList0.getDefaultColor());
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
        if(coordinatorLayout$LayoutParams0.h == 0) {
            coordinatorLayout$LayoutParams0.h = 80;
        }
    }

    protected abstract e o0(Context arg1, boolean arg2);

    // 去混淆评级： 低(20)
    @Nullable
    private ViewGroup p0(View view0) {
        return view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
    }
}

