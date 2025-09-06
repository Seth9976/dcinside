package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

public class ChangeBounds extends Transition {
    static class ClipListener extends AnimatorListenerAdapter implements TransitionListener {
        private final View a;
        private final Rect b;
        private final boolean c;
        private final Rect d;
        private final boolean e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private boolean n;

        ClipListener(View view0, Rect rect0, boolean z, Rect rect1, boolean z1, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            this.a = view0;
            this.b = rect0;
            this.c = z;
            this.d = rect1;
            this.e = z1;
            this.f = v;
            this.g = v1;
            this.h = v2;
            this.i = v3;
            this.j = v4;
            this.k = v5;
            this.l = v6;
            this.m = v7;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            Rect rect0 = (Rect)this.a.getTag(id.transition_clip);
            this.a.setTag(id.transition_clip, null);
            this.a.setClipBounds(rect0);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            Rect rect0 = this.a.getClipBounds();
            this.a.setTag(id.transition_clip, rect0);
            this.a.setClipBounds((this.e ? null : this.d));
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(Animator animator0, boolean z) {
            Rect rect0 = null;
            if(this.n) {
                return;
            }
            if(!z) {
                if(!this.e) {
                    rect0 = this.d;
                }
            }
            else if(!this.c) {
                rect0 = this.b;
            }
            this.a.setClipBounds(rect0);
            if(z) {
                ViewUtils.e(this.a, this.f, this.g, this.h, this.i);
                return;
            }
            ViewUtils.e(this.a, this.j, this.k, this.l, this.m);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            this.onAnimationStart(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(Animator animator0, boolean z) {
            int v = z ? this.j : this.f;
            int v1 = z ? this.k : this.g;
            ViewUtils.e(this.a, v, v1, Math.max(this.h - this.f, this.l - this.j) + v, Math.max(this.i - this.g, this.m - this.k) + v1);
            this.a.setClipBounds((z ? this.d : this.b));
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
            this.n = true;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(Transition transition0, boolean z) {
            e.b(this, transition0, z);
        }
    }

    static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean a;
        final ViewGroup b;

        SuppressLayoutListener(@NonNull ViewGroup viewGroup0) {
            this.a = false;
            this.b = viewGroup0;
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void a(@NonNull Transition transition0) {
            ViewGroupUtils.c(this.b, true);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void l(@NonNull Transition transition0) {
            ViewGroupUtils.c(this.b, false);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void p(@NonNull Transition transition0) {
            if(!this.a) {
                ViewGroupUtils.c(this.b, false);
            }
            transition0.s0(this);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void r(@NonNull Transition transition0) {
            ViewGroupUtils.c(this.b, false);
            this.a = true;
        }
    }

    static class ViewBounds {
        private int a;
        private int b;
        private int c;
        private int d;
        private final View e;
        private int f;
        private int g;

        ViewBounds(View view0) {
            this.e = view0;
        }

        void a(PointF pointF0) {
            this.c = Math.round(pointF0.x);
            this.d = Math.round(pointF0.y);
            int v = this.g + 1;
            this.g = v;
            if(this.f == v) {
                this.b();
            }
        }

        private void b() {
            ViewUtils.e(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void c(PointF pointF0) {
            this.a = Math.round(pointF0.x);
            this.b = Math.round(pointF0.y);
            int v = this.f + 1;
            this.f = v;
            if(v == this.g) {
                this.b();
            }
        }
    }

    private boolean U8;
    private static final String V8 = "android:changeBounds:bounds";
    private static final String W8 = "android:changeBounds:clip";
    private static final String X8 = "android:changeBounds:parent";
    private static final String Y8 = "android:changeBounds:windowX";
    private static final String Z8 = "android:changeBounds:windowY";
    private static final String[] a9;
    private static final Property b9;
    private static final Property c9;
    private static final Property d9;
    private static final Property e9;
    private static final Property f9;
    private static final RectEvaluator g9;

    static {
        ChangeBounds.a9 = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
        ChangeBounds.b9 = new Property(PointF.class, "topLeft") {
            public PointF a(ViewBounds changeBounds$ViewBounds0) {
                return null;
            }

            public void b(ViewBounds changeBounds$ViewBounds0, PointF pointF0) {
                changeBounds$ViewBounds0.c(pointF0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((ViewBounds)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((ViewBounds)object0), ((PointF)object1));
            }
        };
        ChangeBounds.c9 = new Property(PointF.class, "bottomRight") {
            public PointF a(ViewBounds changeBounds$ViewBounds0) {
                return null;
            }

            public void b(ViewBounds changeBounds$ViewBounds0, PointF pointF0) {
                changeBounds$ViewBounds0.a(pointF0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((ViewBounds)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((ViewBounds)object0), ((PointF)object1));
            }
        };
        ChangeBounds.d9 = new Property(PointF.class, "bottomRight") {
            public PointF a(View view0) {
                return null;
            }

            public void b(View view0, PointF pointF0) {
                ViewUtils.e(view0, view0.getLeft(), view0.getTop(), Math.round(pointF0.x), Math.round(pointF0.y));
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((View)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((View)object0), ((PointF)object1));
            }
        };
        ChangeBounds.e9 = new Property(PointF.class, "topLeft") {
            public PointF a(View view0) {
                return null;
            }

            public void b(View view0, PointF pointF0) {
                ViewUtils.e(view0, Math.round(pointF0.x), Math.round(pointF0.y), view0.getRight(), view0.getBottom());
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((View)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((View)object0), ((PointF)object1));
            }
        };
        ChangeBounds.f9 = new Property(PointF.class, "position") {
            public PointF a(View view0) {
                return null;
            }

            public void b(View view0, PointF pointF0) {
                int v = Math.round(pointF0.x);
                int v1 = Math.round(pointF0.y);
                ViewUtils.e(view0, v, v1, view0.getWidth() + v, view0.getHeight() + v1);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((View)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((View)object0), ((PointF)object1));
            }
        };
        ChangeBounds.g9 = new RectEvaluator();
    }

    public ChangeBounds() {
        this.U8 = false;
    }

    public ChangeBounds(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.U8 = false;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.d);
        boolean z = TypedArrayUtils.e(typedArray0, ((XmlResourceParser)attributeSet0), "resizeClip", 0, false);
        typedArray0.recycle();
        this.N0(z);
    }

    private void L0(TransitionValues transitionValues0) {
        View view0 = transitionValues0.b;
        if(view0.isLaidOut() || view0.getWidth() != 0 || view0.getHeight() != 0) {
            Rect rect0 = new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            transitionValues0.a.put("android:changeBounds:bounds", rect0);
            ViewParent viewParent0 = transitionValues0.b.getParent();
            transitionValues0.a.put("android:changeBounds:parent", viewParent0);
            if(this.U8) {
                Rect rect1 = view0.getClipBounds();
                transitionValues0.a.put("android:changeBounds:clip", rect1);
            }
        }
    }

    public boolean M0() {
        return this.U8;
    }

    public void N0(boolean z) {
        this.U8 = z;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] Z() {
        return ChangeBounds.a9;
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
        if(this.U8) {
            Rect rect0 = (Rect)transitionValues0.b.getTag(id.transition_clip);
            if(rect0 != null) {
                transitionValues0.a.put("android:changeBounds:clip", rect0);
            }
        }
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Animator animator0;
        View view1;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator2;
        int v15;
        int v14;
        int v13;
        int v12;
        if(transitionValues0 != null && transitionValues1 != null && (((ViewGroup)transitionValues0.a.get("android:changeBounds:parent")) != null && ((ViewGroup)transitionValues1.a.get("android:changeBounds:parent")) != null)) {
            View view0 = transitionValues1.b;
            Rect rect0 = (Rect)transitionValues0.a.get("android:changeBounds:bounds");
            Rect rect1 = (Rect)transitionValues1.a.get("android:changeBounds:bounds");
            int v = rect0.left;
            int v1 = rect1.left;
            int v2 = rect0.top;
            int v3 = rect1.top;
            int v4 = rect0.right;
            int v5 = rect1.right;
            int v6 = rect0.bottom;
            int v7 = rect1.bottom;
            int v8 = v4 - v;
            int v9 = v6 - v2;
            int v10 = v5 - v1;
            int v11 = v7 - v3;
            Rect rect2 = (Rect)transitionValues0.a.get("android:changeBounds:clip");
            Rect rect3 = (Rect)transitionValues1.a.get("android:changeBounds:clip");
            if((v8 == 0 || v9 == 0) && (v10 == 0 || v11 == 0)) {
                v12 = 0;
            }
            else {
                v12 = v != v1 || v2 != v3 ? 1 : 0;
                if(v4 != v5 || v6 != v7) {
                    ++v12;
                }
            }
            if(rect2 != null && !rect2.equals(rect3) || rect2 == null && rect3 != null) {
                ++v12;
            }
            if(v12 > 0) {
                if(this.U8) {
                    view1 = view0;
                    ViewUtils.e(view1, v, v2, Math.max(v8, v10) + v, v2 + Math.max(v9, v11));
                    if(v != v1 || v2 != v3) {
                        v13 = v5;
                        v14 = v4;
                        v15 = v2;
                        Path path5 = this.P().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        objectAnimator2 = ObjectAnimatorUtils.a(view1, ChangeBounds.f9, path5);
                    }
                    else {
                        v13 = v5;
                        v14 = v4;
                        v15 = v2;
                        objectAnimator2 = null;
                    }
                    boolean z = rect2 == null;
                    if(z) {
                        rect2 = new Rect(0, 0, v8, v9);
                    }
                    Rect rect4 = rect3 == null ? rect3 : new Rect(0, 0, v10, v11);
                    if(rect2.equals(rect4)) {
                        objectAnimator3 = null;
                    }
                    else {
                        view1.setClipBounds(rect2);
                        objectAnimator3 = ObjectAnimator.ofObject(view1, "clipBounds", ChangeBounds.g9, new Object[]{rect2, rect4});
                        ClipListener changeBounds$ClipListener0 = new ClipListener(view1, rect2, z, rect4, rect3 == null, v, v15, v14, v6, v1, v3, v13, v7);
                        objectAnimator3.addListener(changeBounds$ClipListener0);
                        this.c(changeBounds$ClipListener0);
                    }
                    animator0 = TransitionUtils.c(objectAnimator2, objectAnimator3);
                }
                else {
                    view1 = view0;
                    ViewUtils.e(view1, v, v2, v4, v6);
                    if(v12 != 2) {
                        if(v != v1 || v2 != v3) {
                            Path path4 = this.P().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                            animator0 = ObjectAnimatorUtils.a(view1, ChangeBounds.e9, path4);
                        }
                        else {
                            Path path3 = this.P().a(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                            animator0 = ObjectAnimatorUtils.a(view1, ChangeBounds.d9, path3);
                        }
                    }
                    else if(v8 == v10 && v9 == v11) {
                        Path path0 = this.P().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        animator0 = ObjectAnimatorUtils.a(view1, ChangeBounds.f9, path0);
                    }
                    else {
                        ViewBounds changeBounds$ViewBounds0 = new ViewBounds(view1);
                        Path path1 = this.P().a(((float)v), ((float)v2), ((float)v1), ((float)v3));
                        ObjectAnimator objectAnimator0 = ObjectAnimatorUtils.a(changeBounds$ViewBounds0, ChangeBounds.b9, path1);
                        Path path2 = this.P().a(((float)v4), ((float)v6), ((float)v5), ((float)v7));
                        ObjectAnimator objectAnimator1 = ObjectAnimatorUtils.a(changeBounds$ViewBounds0, ChangeBounds.c9, path2);
                        AnimatorSet animatorSet0 = new AnimatorSet();
                        animatorSet0.playTogether(new Animator[]{objectAnimator0, objectAnimator1});
                        animatorSet0.addListener(new AnimatorListenerAdapter() {
                            final ChangeBounds b;
                            private final ViewBounds mViewBounds;

                            {
                                ViewBounds changeBounds$ViewBounds0 = changeBounds$ViewBounds0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                                this.mViewBounds = changeBounds$ViewBounds0;
                            }
                        });
                        animator0 = animatorSet0;
                    }
                }
                if(view1.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup1 = (ViewGroup)view1.getParent();
                    ViewGroupUtils.c(viewGroup1, true);
                    this.R().c(new SuppressLayoutListener(viewGroup1));
                }
                return animator0;
            }
        }
        return null;
    }
}

