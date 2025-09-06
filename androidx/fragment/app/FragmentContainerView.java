package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R.styleable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

public final class FragmentContainerView extends FrameLayout {
    @RequiresApi(20)
    public static final class Api20Impl {
        @l
        public static final Api20Impl a;

        static {
            Api20Impl.a = new Api20Impl();
        }

        @l
        public final WindowInsets a(@l View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0, @l View view0, @l WindowInsets windowInsets0) {
            L.p(view$OnApplyWindowInsetsListener0, "onApplyWindowInsetsListener");
            L.p(view0, "v");
            L.p(windowInsets0, "insets");
            WindowInsets windowInsets1 = view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
            L.o(windowInsets1, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsets1;
        }
    }

    @l
    private final List a;
    @l
    private final List b;
    @m
    private View.OnApplyWindowInsetsListener c;
    private boolean d;

    public FragmentContainerView(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
    }

    @j
    public FragmentContainerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public FragmentContainerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        String s1;
        super(context0, attributeSet0, v);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        if(attributeSet0 != null) {
            String s = attributeSet0.getClassAttribute();
            L.o(styleable.FragmentContainerView, "FragmentContainerView");
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FragmentContainerView, 0, 0);
            if(s == null) {
                s = typedArray0.getString(styleable.FragmentContainerView_android_name);
                s1 = "android:name";
            }
            else {
                s1 = "class";
            }
            typedArray0.recycle();
            if(s != null && !this.isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + s1 + "=\"" + s + '\"');
            }
        }
    }

    public FragmentContainerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public FragmentContainerView(@l Context context0, @l AttributeSet attributeSet0, @l FragmentManager fragmentManager0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        L.p(fragmentManager0, "fm");
        super(context0, attributeSet0);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String s = attributeSet0.getClassAttribute();
        L.o(styleable.FragmentContainerView, "FragmentContainerView");
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FragmentContainerView, 0, 0);
        if(s == null) {
            s = typedArray0.getString(styleable.FragmentContainerView_android_name);
        }
        String s1 = typedArray0.getString(styleable.FragmentContainerView_android_tag);
        typedArray0.recycle();
        int v = this.getId();
        if(s != null && fragmentManager0.r0(v) == null) {
            if(v == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + s + (s1 == null ? "" : " with tag " + s1));
            }
            Fragment fragment0 = fragmentManager0.G0().a(context0.getClassLoader(), s);
            L.o(fragment0, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragment0.onInflate(context0, attributeSet0, null);
            fragmentManager0.u().Q(true).j(this, fragment0, s1).t();
        }
        fragmentManager0.o1(this);
    }

    private final void a(View view0) {
        if(this.b.contains(view0)) {
            this.a.add(view0);
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(@l View view0, int v, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        L.p(view0, "child");
        if(FragmentManager.Q0(view0) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view0 + " is not associated with a Fragment.").toString());
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    @RequiresApi(20)
    @l
    public WindowInsets dispatchApplyWindowInsets(@l WindowInsets windowInsets0) {
        WindowInsetsCompat windowInsetsCompat1;
        L.p(windowInsets0, "insets");
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(windowInsets0);
        L.o(windowInsetsCompat0, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = this.c;
        if(view$OnApplyWindowInsetsListener0 == null) {
            windowInsetsCompat1 = ViewCompat.m1(this, windowInsetsCompat0);
        }
        else {
            L.m(view$OnApplyWindowInsetsListener0);
            windowInsetsCompat1 = WindowInsetsCompat.L(Api20Impl.a.a(view$OnApplyWindowInsetsListener0, this, windowInsets0));
        }
        L.o(windowInsetsCompat1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if(!windowInsetsCompat1.A()) {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                ViewCompat.q(this.getChildAt(v1), windowInsetsCompat1);
            }
        }
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(this.d) {
            for(Object object0: this.a) {
                super.drawChild(canvas0, ((View)object0), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas0);
    }

    @Override  // android.view.ViewGroup
    protected boolean drawChild(@l Canvas canvas0, @l View view0, long v) {
        L.p(canvas0, "canvas");
        L.p(view0, "child");
        return !this.d || this.a.isEmpty() || !this.a.contains(view0) ? super.drawChild(canvas0, view0, v) : false;
    }

    @Override  // android.view.ViewGroup
    public void endViewTransition(@l View view0) {
        L.p(view0, "view");
        this.b.remove(view0);
        if(this.a.remove(view0)) {
            this.d = true;
        }
        super.endViewTransition(view0);
    }

    public final Fragment getFragment() {
        return FragmentManager.u0(this).r0(this.getId());
    }

    @Override  // android.view.View
    @RequiresApi(20)
    @l
    public WindowInsets onApplyWindowInsets(@l WindowInsets windowInsets0) {
        L.p(windowInsets0, "insets");
        return windowInsets0;
    }

    @Override  // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for(int v = this.getChildCount() - 1; -1 < v; --v) {
            View view0 = this.getChildAt(v);
            L.o(view0, "view");
            this.a(view0);
        }
        super.removeAllViewsInLayout();
    }

    @Override  // android.view.ViewGroup
    public void removeView(@l View view0) {
        L.p(view0, "view");
        this.a(view0);
        super.removeView(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViewAt(int v) {
        View view0 = this.getChildAt(v);
        L.o(view0, "view");
        this.a(view0);
        super.removeViewAt(v);
    }

    @Override  // android.view.ViewGroup
    public void removeViewInLayout(@l View view0) {
        L.p(view0, "view");
        this.a(view0);
        super.removeViewInLayout(view0);
    }

    @Override  // android.view.ViewGroup
    public void removeViews(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            L.o(view0, "view");
            this.a(view0);
        }
        super.removeViews(v, v1);
    }

    @Override  // android.view.ViewGroup
    public void removeViewsInLayout(int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            View view0 = this.getChildAt(v2);
            L.o(view0, "view");
            this.a(view0);
        }
        super.removeViewsInLayout(v, v1);
    }

    @i(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override  // android.view.ViewGroup
    public void setLayoutTransition(@m LayoutTransition layoutTransition0) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override  // android.view.View
    public void setOnApplyWindowInsetsListener(@l View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0) {
        L.p(view$OnApplyWindowInsetsListener0, "listener");
        this.c = view$OnApplyWindowInsetsListener0;
    }

    @Override  // android.view.ViewGroup
    public void startViewTransition(@l View view0) {
        L.p(view0, "view");
        if(view0.getParent() == this) {
            this.b.add(view0);
        }
        super.startViewTransition(view0);
    }
}

