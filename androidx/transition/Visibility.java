package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class Visibility extends Transition {
    static class DisappearListener extends AnimatorListenerAdapter implements TransitionListener {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f;

        DisappearListener(View view0, int v, boolean z) {
            this.f = false;
            this.a = view0;
            this.b = v;
            this.c = (ViewGroup)view0.getParent();
            this.d = z;
            this.c(true);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            this.c(true);
            if(!this.f) {
                ViewUtils.g(this.a, 0);
            }
        }

        private void b() {
            if(!this.f) {
                ViewUtils.g(this.a, this.b);
                ViewGroup viewGroup0 = this.c;
                if(viewGroup0 != null) {
                    viewGroup0.invalidate();
                }
            }
            this.c(false);
        }

        private void c(boolean z) {
            if(this.d && this.e != z) {
                ViewGroup viewGroup0 = this.c;
                if(viewGroup0 != null) {
                    this.e = z;
                    ViewGroupUtils.c(viewGroup0, z);
                }
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            this.c(false);
            if(!this.f) {
                ViewUtils.g(this.a, this.b);
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.f = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.b();
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator0, boolean z) {
            if(!z) {
                this.b();
            }
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationRepeat(Animator animator0) {
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(@NonNull Animator animator0, boolean z) {
            if(z) {
                ViewUtils.g(this.a, 0);
                ViewGroup viewGroup0 = this.c;
                if(viewGroup0 != null) {
                    viewGroup0.invalidate();
                }
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
            transition0.s0(this);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(Transition transition0, boolean z) {
            e.b(this, transition0, z);
        }
    }

    @SuppressLint({"UniqueConstants"})
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    class OverlayListener extends AnimatorListenerAdapter implements TransitionListener {
        private final ViewGroup a;
        private final View b;
        private final View c;
        private boolean d;
        final Visibility e;

        OverlayListener(ViewGroup viewGroup0, View view0, View view1) {
            this.d = true;
            this.a = viewGroup0;
            this.b = view0;
            this.c = view1;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
        }

        private void b() {
            this.c.setTag(id.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.b();
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator0, boolean z) {
            if(!z) {
                this.b();
            }
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationPause(Animator animator0) {
            this.a.getOverlay().remove(this.b);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationResume(Animator animator0) {
            if(this.b.getParent() == null) {
                this.a.getOverlay().add(this.b);
                return;
            }
            Visibility.this.cancel();
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(@NonNull Animator animator0, boolean z) {
            if(z) {
                this.c.setTag(id.save_overlay_view, this.b);
                this.a.getOverlay().add(this.b);
                this.d = true;
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
            transition0.s0(this);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
            if(this.d) {
                this.b();
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(Transition transition0, boolean z) {
            e.b(this, transition0, z);
        }
    }

    static class VisibilityInfo {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

    }

    private int U8;
    static final String V8 = "android:visibility:visibility";
    private static final String W8 = "android:visibility:parent";
    private static final String X8 = "android:visibility:screenLocation";
    public static final int Y8 = 1;
    public static final int Z8 = 2;
    private static final String[] a9;

    static {
        Visibility.a9 = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    }

    public Visibility() {
        this.U8 = 3;
    }

    public Visibility(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.U8 = 3;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.e);
        int v = TypedArrayUtils.k(typedArray0, ((XmlResourceParser)attributeSet0), "transitionVisibilityMode", 0, 0);
        typedArray0.recycle();
        if(v != 0) {
            this.T0(v);
        }
    }

    private void L0(TransitionValues transitionValues0) {
        Integer integer0 = transitionValues0.b.getVisibility();
        transitionValues0.a.put("android:visibility:visibility", integer0);
        ViewParent viewParent0 = transitionValues0.b.getParent();
        transitionValues0.a.put("android:visibility:parent", viewParent0);
        int[] arr_v = new int[2];
        transitionValues0.b.getLocationOnScreen(arr_v);
        transitionValues0.a.put("android:visibility:screenLocation", arr_v);
    }

    public int M0() {
        return this.U8;
    }

    private VisibilityInfo N0(TransitionValues transitionValues0, TransitionValues transitionValues1) {
        VisibilityInfo visibility$VisibilityInfo0 = new VisibilityInfo();
        visibility$VisibilityInfo0.a = false;
        visibility$VisibilityInfo0.b = false;
        if(transitionValues0 == null || !transitionValues0.a.containsKey("android:visibility:visibility")) {
            visibility$VisibilityInfo0.c = -1;
            visibility$VisibilityInfo0.e = null;
        }
        else {
            visibility$VisibilityInfo0.c = (int)(((Integer)transitionValues0.a.get("android:visibility:visibility")));
            visibility$VisibilityInfo0.e = (ViewGroup)transitionValues0.a.get("android:visibility:parent");
        }
        if(transitionValues1 == null || !transitionValues1.a.containsKey("android:visibility:visibility")) {
            visibility$VisibilityInfo0.d = -1;
            visibility$VisibilityInfo0.f = null;
        }
        else {
            visibility$VisibilityInfo0.d = (int)(((Integer)transitionValues1.a.get("android:visibility:visibility")));
            visibility$VisibilityInfo0.f = (ViewGroup)transitionValues1.a.get("android:visibility:parent");
        }
        if(transitionValues0 == null || transitionValues1 == null) {
            if(transitionValues0 == null && visibility$VisibilityInfo0.d == 0) {
                visibility$VisibilityInfo0.b = true;
                visibility$VisibilityInfo0.a = true;
                return visibility$VisibilityInfo0;
            }
            if(transitionValues1 == null && visibility$VisibilityInfo0.c == 0) {
                visibility$VisibilityInfo0.b = false;
                visibility$VisibilityInfo0.a = true;
            }
        }
        else {
            int v = visibility$VisibilityInfo0.c;
            int v1 = visibility$VisibilityInfo0.d;
            if(v == v1 && visibility$VisibilityInfo0.e == visibility$VisibilityInfo0.f) {
                return visibility$VisibilityInfo0;
            }
            if(v == v1) {
                if(visibility$VisibilityInfo0.f == null) {
                    visibility$VisibilityInfo0.b = false;
                    visibility$VisibilityInfo0.a = true;
                    return visibility$VisibilityInfo0;
                }
                if(visibility$VisibilityInfo0.e == null) {
                    visibility$VisibilityInfo0.b = true;
                    visibility$VisibilityInfo0.a = true;
                    return visibility$VisibilityInfo0;
                }
            }
            else {
                if(v == 0) {
                    visibility$VisibilityInfo0.b = false;
                    visibility$VisibilityInfo0.a = true;
                    return visibility$VisibilityInfo0;
                }
                if(v1 == 0) {
                    visibility$VisibilityInfo0.b = true;
                    visibility$VisibilityInfo0.a = true;
                    return visibility$VisibilityInfo0;
                }
            }
        }
        return visibility$VisibilityInfo0;
    }

    public boolean O0(@Nullable TransitionValues transitionValues0) {
        return transitionValues0 == null ? false : ((int)(((Integer)transitionValues0.a.get("android:visibility:visibility")))) == 0 && ((View)transitionValues0.a.get("android:visibility:parent")) != null;
    }

    @Nullable
    public Animator P0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return null;
    }

    @Nullable
    public Animator Q0(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, int v, @Nullable TransitionValues transitionValues1, int v1) {
        if((this.U8 & 1) == 1 && transitionValues1 != null) {
            if(transitionValues0 == null) {
                View view0 = (View)transitionValues1.b.getParent();
                return this.N0(this.N(view0, false), this.a0(view0, false)).a ? null : this.P0(viewGroup0, transitionValues1.b, null, transitionValues1);
            }
            return this.P0(viewGroup0, transitionValues1.b, transitionValues0, transitionValues1);
        }
        return null;
    }

    @Nullable
    public Animator R0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return null;
    }

    @Nullable
    public Animator S0(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, int v, @Nullable TransitionValues transitionValues1, int v1) {
        boolean z;
        View view3;
        boolean z1;
        View view4;
        if((this.U8 & 2) != 2) {
            return null;
        }
        if(transitionValues0 == null) {
            return null;
        }
        View view0 = transitionValues0.b;
        View view1 = transitionValues1 == null ? null : transitionValues1.b;
        View view2 = (View)view0.getTag(id.save_overlay_view);
        if(view2 == null) {
            if(view1 == null || view1.getParent() == null) {
                if(view1 == null) {
                    view1 = null;
                    view4 = null;
                    z1 = true;
                }
                else {
                    view4 = null;
                    z1 = false;
                }
            }
            else if(v1 == 4 || view0 == view1) {
                view4 = view1;
                z1 = false;
                view1 = null;
            }
            else {
                view1 = null;
                view4 = null;
                z1 = true;
            }
            if(!z1) {
                z = false;
                view2 = view1;
                view3 = view4;
            }
            else if(view0.getParent() == null) {
                view3 = view4;
                z = false;
                view2 = view0;
            }
            else if(view0.getParent() instanceof View) {
                View view5 = (View)view0.getParent();
                if(this.N0(this.a0(view5, true), this.N(view5, true)).a) {
                    int v2 = view5.getId();
                    if(view5.getParent() != null || v2 == -1 || viewGroup0.findViewById(v2) == null || !this.w) {
                        z = false;
                        view2 = view1;
                        view3 = view4;
                    }
                    else {
                        view3 = view4;
                        z = false;
                        view2 = view0;
                    }
                }
                else {
                    view1 = TransitionUtils.a(viewGroup0, view0, view5);
                    z = false;
                    view2 = view1;
                    view3 = view4;
                }
            }
            else {
                z = false;
                view2 = view1;
                view3 = view4;
            }
        }
        else {
            view3 = null;
            z = true;
        }
        if(view2 != null) {
            if(!z) {
                int[] arr_v = (int[])transitionValues0.a.get("android:visibility:screenLocation");
                int v3 = arr_v[0];
                int v4 = arr_v[1];
                int[] arr_v1 = new int[2];
                viewGroup0.getLocationOnScreen(arr_v1);
                view2.offsetLeftAndRight(v3 - arr_v1[0] - view2.getLeft());
                view2.offsetTopAndBottom(v4 - arr_v1[1] - view2.getTop());
                viewGroup0.getOverlay().add(view2);
            }
            Animator animator0 = this.R0(viewGroup0, view2, transitionValues0, transitionValues1);
            if(!z) {
                if(animator0 == null) {
                    viewGroup0.getOverlay().remove(view2);
                    return null;
                }
                view0.setTag(0x7F0B0D9D, view2);  // id:save_overlay_view
                OverlayListener visibility$OverlayListener0 = new OverlayListener(this, viewGroup0, view2, view0);
                animator0.addListener(visibility$OverlayListener0);
                animator0.addPauseListener(visibility$OverlayListener0);
                this.R().c(visibility$OverlayListener0);
            }
            return animator0;
        }
        if(view3 != null) {
            int v5 = view3.getVisibility();
            ViewUtils.g(view3, 0);
            Animator animator1 = this.R0(viewGroup0, view3, transitionValues0, transitionValues1);
            if(animator1 != null) {
                DisappearListener visibility$DisappearListener0 = new DisappearListener(view3, v1, true);
                animator1.addListener(visibility$DisappearListener0);
                this.R().c(visibility$DisappearListener0);
                return animator1;
            }
            ViewUtils.g(view3, v5);
            return null;
        }
        return null;
    }

    public void T0(int v) {
        if((v & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.U8 = v;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] Z() {
        return Visibility.a9;
    }

    @Override  // androidx.transition.Transition
    public boolean d0(@Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 == null && transitionValues1 == null) {
            return false;
        }
        if(transitionValues0 != null && transitionValues1 != null && transitionValues1.a.containsKey("android:visibility:visibility") != transitionValues0.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo visibility$VisibilityInfo0 = this.N0(transitionValues0, transitionValues1);
        return visibility$VisibilityInfo0.a && (visibility$VisibilityInfo0.c == 0 || visibility$VisibilityInfo0.d == 0);
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        VisibilityInfo visibility$VisibilityInfo0 = this.N0(transitionValues0, transitionValues1);
        if(visibility$VisibilityInfo0.a && (visibility$VisibilityInfo0.e != null || visibility$VisibilityInfo0.f != null)) {
            return visibility$VisibilityInfo0.b ? this.Q0(viewGroup0, transitionValues0, visibility$VisibilityInfo0.c, transitionValues1, visibility$VisibilityInfo0.d) : this.S0(viewGroup0, transitionValues0, visibility$VisibilityInfo0.c, transitionValues1, visibility$VisibilityInfo0.d);
        }
        return null;
    }
}

