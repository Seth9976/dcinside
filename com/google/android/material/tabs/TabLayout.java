package com.google.android.material.tabs;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.DecorView;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@DecorView
public class TabLayout extends HorizontalScrollView {
    class b implements OnAdapterChangeListener {
        private boolean a;
        final TabLayout b;

        void a(boolean z) {
            this.a = z;
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnAdapterChangeListener
        public void c(@NonNull ViewPager viewPager0, @Nullable PagerAdapter pagerAdapter0, @Nullable PagerAdapter pagerAdapter1) {
            TabLayout tabLayout0 = TabLayout.this;
            if(tabLayout0.P == viewPager0) {
                tabLayout0.T(pagerAdapter1, this.a);
            }
        }
    }

    @Deprecated
    public interface c {
        void N(i arg1);

        void R(i arg1);

        void j(i arg1);
    }

    public @interface d {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public interface f extends c {
    }

    class g extends DataSetObserver {
        final TabLayout a;

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.J();
        }

        @Override  // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.J();
        }
    }

    class h extends LinearLayout {
        ValueAnimator a;
        private int b;
        final TabLayout c;

        h(Context context0) {
            super(context0);
            this.b = -1;
            this.setWillNotDraw(false);
        }

        void c(int v, int v1) {
            if(this.a != null && this.a.isRunning() && TabLayout.this.a != v) {
                this.a.cancel();
            }
            this.k(true, v, v1);
        }

        boolean d() {
            int v = this.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                if(this.getChildAt(v1).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override  // android.view.View
        public void draw(@NonNull Canvas canvas0) {
            int v = TabLayout.this.o.getBounds().height();
            if(v < 0) {
                v = TabLayout.this.o.getIntrinsicHeight();
            }
            int v1 = 0;
            int v2 = TabLayout.this.C;
            if(v2 == 0) {
                v1 = this.getHeight() - v;
                v = this.getHeight();
            }
            else {
                switch(v2) {
                    case 1: {
                        v1 = (this.getHeight() - v) / 2;
                        v = (this.getHeight() + v) / 2;
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        v = this.getHeight();
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
            }
            if(TabLayout.this.o.getBounds().width() > 0) {
                Rect rect0 = TabLayout.this.o.getBounds();
                TabLayout.this.o.setBounds(rect0.left, v1, rect0.right, v);
                TabLayout.this.o.draw(canvas0);
            }
            super.draw(canvas0);
        }

        private void e() {
            TabLayout tabLayout0 = TabLayout.this;
            if(tabLayout0.a == -1) {
                tabLayout0.a = tabLayout0.getSelectedTabPosition();
            }
            this.f(TabLayout.this.a);
        }

        private void f(int v) {
            if(TabLayout.this.Q8 != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View view0 = this.getChildAt(v);
            TabLayout.this.J.c(TabLayout.this, view0, TabLayout.this.o);
            TabLayout.this.a = v;
        }

        private void g() {
            this.f(TabLayout.this.getSelectedTabPosition());
        }

        void h(int v, float f) {
            TabLayout.this.a = Math.round(((float)v) + f);
            if(this.a != null && this.a.isRunning()) {
                this.a.cancel();
            }
            this.j(this.getChildAt(v), this.getChildAt(v + 1), f);
        }

        void i(int v) {
            Rect rect0 = TabLayout.this.o.getBounds();
            TabLayout.this.o.setBounds(rect0.left, 0, rect0.right, v);
            this.requestLayout();
        }

        private void j(View view0, View view1, float f) {
            if(view0 == null || view0.getWidth() <= 0) {
                Drawable drawable0 = TabLayout.this.o;
                drawable0.setBounds(-1, drawable0.getBounds().top, -1, TabLayout.this.o.getBounds().bottom);
            }
            else {
                TabLayout.this.J.d(TabLayout.this, view0, view1, f, TabLayout.this.o);
            }
            ViewCompat.v1(this);
        }

        private void k(boolean z, int v, int v1) {
            class a implements ValueAnimator.AnimatorUpdateListener {
                final View a;
                final View b;
                final h c;

                a(View view0, View view1) {
                    this.a = view0;
                    this.b = view1;
                    super();
                }

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                    float f = valueAnimator0.getAnimatedFraction();
                    h.this.j(this.a, this.b, f);
                }
            }

            TabLayout tabLayout0 = TabLayout.this;
            if(tabLayout0.a == v) {
                return;
            }
            View view0 = this.getChildAt(tabLayout0.getSelectedTabPosition());
            View view1 = this.getChildAt(v);
            if(view1 == null) {
                this.g();
                return;
            }
            TabLayout.this.a = v;
            a tabLayout$h$a0 = new a(this, view0, view1);
            if(z) {
                ValueAnimator valueAnimator0 = new ValueAnimator();
                this.a = valueAnimator0;
                valueAnimator0.setInterpolator(TabLayout.this.K);
                valueAnimator0.setDuration(((long)v1));
                valueAnimator0.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator0.addUpdateListener(tabLayout$h$a0);
                valueAnimator0.start();
                return;
            }
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(tabLayout$h$a0);
        }

        @Override  // android.widget.LinearLayout
        protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
            super.onLayout(z, v, v1, v2, v3);
            if(this.a != null && this.a.isRunning()) {
                this.k(false, TabLayout.this.getSelectedTabPosition(), -1);
                return;
            }
            this.e();
        }

        @Override  // android.widget.LinearLayout
        protected void onMeasure(int v, int v1) {
            int v2 = 1;
            super.onMeasure(v, v1);
            if(View.MeasureSpec.getMode(v) != 0x40000000) {
                return;
            }
            if(TabLayout.this.A == 1 || TabLayout.this.D == 2) {
                int v3 = this.getChildCount();
                int v6 = 0;
                for(int v5 = 0; v5 < v3; ++v5) {
                    View view0 = this.getChildAt(v5);
                    if(view0.getVisibility() == 0) {
                        v6 = Math.max(v6, view0.getMeasuredWidth());
                    }
                }
                if(v6 <= 0) {
                    return;
                }
                int v7 = (int)M.i(this.getContext(), 16);
                if(v6 * v3 <= this.getMeasuredWidth() - v7 * 2) {
                    int v8 = 0;
                    for(int v4 = 0; v4 < v3; ++v4) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.getChildAt(v4).getLayoutParams();
                        if(linearLayout$LayoutParams0.width != v6 || linearLayout$LayoutParams0.weight != 0.0f) {
                            linearLayout$LayoutParams0.width = v6;
                            linearLayout$LayoutParams0.weight = 0.0f;
                            v8 = 1;
                        }
                    }
                    v2 = v8;
                }
                else {
                    TabLayout.this.A = 0;
                    TabLayout.this.c0(false);
                }
                if(v2 != 0) {
                    super.onMeasure(v, v1);
                }
            }
        }

        @Override  // android.widget.LinearLayout
        public void onRtlPropertiesChanged(int v) {
            super.onRtlPropertiesChanged(v);
            if(Build.VERSION.SDK_INT < 23 && this.b != v) {
                this.requestLayout();
                this.b = v;
            }
        }
    }

    public static class i {
        @Nullable
        private Object a;
        @Nullable
        private Drawable b;
        @Nullable
        private CharSequence c;
        @Nullable
        private CharSequence d;
        private int e;
        @Nullable
        private View f;
        @d
        private int g;
        @Nullable
        public TabLayout h;
        @NonNull
        public n i;
        private int j;
        public static final int k = -1;

        public i() {
            this.e = -1;
            this.g = 1;
            this.j = -1;
        }

        @O1.a
        @NonNull
        public i A(@d int v) {
            this.g = v;
            TabLayout tabLayout0 = this.h;
            if(tabLayout0.A == 1 || tabLayout0.D == 2) {
                tabLayout0.c0(true);
            }
            this.E();
            if(com.google.android.material.badge.d.a && this.i.o() && this.i.e.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        @O1.a
        @NonNull
        public i B(@Nullable Object object0) {
            this.a = object0;
            return this;
        }

        @O1.a
        @NonNull
        public i C(@StringRes int v) {
            TabLayout tabLayout0 = this.h;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.D(tabLayout0.getResources().getText(v));
        }

        @O1.a
        @NonNull
        public i D(@Nullable CharSequence charSequence0) {
            if(TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence0)) {
                this.i.setContentDescription(charSequence0);
            }
            this.c = charSequence0;
            this.E();
            return this;
        }

        void E() {
            n tabLayout$n0 = this.i;
            if(tabLayout$n0 != null) {
                tabLayout$n0.x();
            }
        }

        @Nullable
        public com.google.android.material.badge.a e() {
            return this.i.getBadge();
        }

        @Nullable
        public CharSequence f() {
            return this.i == null ? null : this.i.getContentDescription();
        }

        @Nullable
        public View g() {
            return this.f;
        }

        @Nullable
        public Drawable h() {
            return this.b;
        }

        public int i() {
            return this.j;
        }

        @NonNull
        public com.google.android.material.badge.a j() {
            return this.i.getOrCreateBadge();
        }

        public int k() {
            return this.e;
        }

        @d
        public int l() {
            return this.g;
        }

        @Nullable
        public Object m() {
            return this.a;
        }

        @Nullable
        public CharSequence n() {
            return this.c;
        }

        public boolean o() {
            TabLayout tabLayout0 = this.h;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int v = tabLayout0.getSelectedTabPosition();
            return v != -1 && v == this.e;
        }

        public void p() {
            this.i.r();
        }

        void q() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void r() {
            TabLayout tabLayout0 = this.h;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout0.R(this);
        }

        @O1.a
        @NonNull
        public i s(@StringRes int v) {
            TabLayout tabLayout0 = this.h;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.t(tabLayout0.getResources().getText(v));
        }

        @O1.a
        @NonNull
        public i t(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            this.E();
            return this;
        }

        @O1.a
        @NonNull
        public i u(@LayoutRes int v) {
            return this.v(LayoutInflater.from(this.i.getContext()).inflate(v, this.i, false));
        }

        @O1.a
        @NonNull
        public i v(@Nullable View view0) {
            this.f = view0;
            this.E();
            return this;
        }

        @O1.a
        @NonNull
        public i w(@DrawableRes int v) {
            TabLayout tabLayout0 = this.h;
            if(tabLayout0 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return this.x(AppCompatResources.b(tabLayout0.getContext(), v));
        }

        @O1.a
        @NonNull
        public i x(@Nullable Drawable drawable0) {
            this.b = drawable0;
            TabLayout tabLayout0 = this.h;
            if(tabLayout0.A == 1 || tabLayout0.D == 2) {
                tabLayout0.c0(true);
            }
            this.E();
            if(com.google.android.material.badge.d.a && this.i.o() && this.i.e.isVisible()) {
                this.i.invalidate();
            }
            return this;
        }

        @O1.a
        @NonNull
        public i y(int v) {
            this.j = v;
            n tabLayout$n0 = this.i;
            if(tabLayout$n0 != null) {
                tabLayout$n0.setId(v);
            }
            return this;
        }

        void z(int v) {
            this.e = v;
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public static class m implements OnPageChangeListener {
        @NonNull
        private final WeakReference a;
        private int b;
        private int c;

        public m(TabLayout tabLayout0) {
            this.a = new WeakReference(tabLayout0);
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void a(int v, float f, int v1) {
            Object object0 = this.a.get();
            if(((TabLayout)object0) != null) {
                ((TabLayout)object0).W(v, f, this.c != 2 || this.b == 1, this.c != 2 || this.b != 0, false);
            }
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void b(int v) {
            this.b = this.c;
            this.c = v;
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null) {
                tabLayout0.d0(this.c);
            }
        }

        void c() {
            this.c = 0;
            this.b = 0;
        }

        @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
        public void d(int v) {
            TabLayout tabLayout0 = (TabLayout)this.a.get();
            if(tabLayout0 != null && tabLayout0.getSelectedTabPosition() != v && v < tabLayout0.getTabCount()) {
                boolean z = this.c == 0 || this.c == 2 && this.b == 0;
                tabLayout0.S(tabLayout0.D(v), z);
            }
        }
    }

    public final class n extends LinearLayout {
        private i a;
        private TextView b;
        private ImageView c;
        @Nullable
        private View d;
        @Nullable
        private com.google.android.material.badge.a e;
        @Nullable
        private View f;
        @Nullable
        private TextView g;
        @Nullable
        private ImageView h;
        @Nullable
        private Drawable i;
        private int j;
        final TabLayout k;

        public n(@NonNull Context context0) {
            super(context0);
            this.j = 2;
            this.y(context0);
            ViewCompat.p2(this, tabLayout0.e, tabLayout0.f, tabLayout0.g, tabLayout0.h);
            this.setGravity(17);
            this.setOrientation(!tabLayout0.E);
            this.setClickable(true);
            ViewCompat.s2(this, PointerIconCompat.c(this.getContext(), 1002));
        }

        final void A() {
            i tabLayout$i0 = this.a;
            View view0 = tabLayout$i0 == null ? null : tabLayout$i0.g();
            if(view0 == null) {
                View view2 = this.f;
                if(view2 != null) {
                    this.removeView(view2);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            else {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 != this) {
                    if(viewParent0 != null) {
                        ((ViewGroup)viewParent0).removeView(view0);
                    }
                    View view1 = this.f;
                    if(view1 != null) {
                        ViewParent viewParent1 = view1.getParent();
                        if(viewParent1 != null) {
                            ((ViewGroup)viewParent1).removeView(this.f);
                        }
                    }
                    this.addView(view0);
                }
                this.f = view0;
                TextView textView0 = this.b;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
                ImageView imageView0 = this.c;
                if(imageView0 != null) {
                    imageView0.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView1 = (TextView)view0.findViewById(0x1020014);
                this.g = textView1;
                if(textView1 != null) {
                    this.j = TextViewCompat.k(textView1);
                }
                this.h = (ImageView)view0.findViewById(0x1020006);
            }
            if(this.f == null) {
                if(this.c == null) {
                    this.p();
                }
                if(this.b == null) {
                    this.q();
                    this.j = TextViewCompat.k(this.b);
                }
                TextViewCompat.D(this.b, TabLayout.this.i);
                if(!this.isSelected() || TabLayout.this.k == -1) {
                    TextViewCompat.D(this.b, TabLayout.this.j);
                }
                else {
                    TextViewCompat.D(this.b, TabLayout.this.k);
                }
                ColorStateList colorStateList0 = TabLayout.this.l;
                if(colorStateList0 != null) {
                    this.b.setTextColor(colorStateList0);
                }
                this.B(this.b, this.c, true);
                this.v();
                this.i(this.c);
                this.i(this.b);
            }
            else {
                TextView textView2 = this.g;
                if(textView2 != null || this.h != null) {
                    this.B(textView2, this.h, false);
                }
            }
            if(tabLayout$i0 != null && !TextUtils.isEmpty(tabLayout$i0.d)) {
                this.setContentDescription(tabLayout$i0.d);
            }
        }

        private void B(@Nullable TextView textView0, @Nullable ImageView imageView0, boolean z) {
            CharSequence charSequence0 = null;
            Drawable drawable0 = this.a == null || this.a.h() == null ? null : DrawableCompat.r(this.a.h()).mutate();
            if(drawable0 != null) {
                DrawableCompat.o(drawable0, TabLayout.this.m);
                PorterDuff.Mode porterDuff$Mode0 = TabLayout.this.q;
                if(porterDuff$Mode0 != null) {
                    DrawableCompat.p(drawable0, porterDuff$Mode0);
                }
            }
            CharSequence charSequence1 = this.a == null ? null : this.a.n();
            if(imageView0 != null) {
                if(drawable0 == null) {
                    imageView0.setVisibility(8);
                    imageView0.setImageDrawable(null);
                }
                else {
                    imageView0.setImageDrawable(drawable0);
                    imageView0.setVisibility(0);
                    this.setVisibility(0);
                }
            }
            boolean z1 = true;
            boolean z2 = TextUtils.isEmpty(charSequence1);
            if(textView0 == null) {
                z1 = false;
            }
            else {
                if(z2 || this.a.g != 1) {
                    z1 = false;
                }
                textView0.setText((z2 ? null : charSequence1));
                textView0.setVisibility((z1 ? 0 : 8));
                if(!z2) {
                    this.setVisibility(0);
                }
            }
            if(z && imageView0 != null) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)imageView0.getLayoutParams();
                int v = !z1 || imageView0.getVisibility() != 0 ? 0 : ((int)M.i(this.getContext(), 8));
                if(!TabLayout.this.E) {
                    if(v != viewGroup$MarginLayoutParams0.bottomMargin) {
                        viewGroup$MarginLayoutParams0.bottomMargin = v;
                        MarginLayoutParamsCompat.g(viewGroup$MarginLayoutParams0, 0);
                        imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                        imageView0.requestLayout();
                    }
                }
                else if(v != MarginLayoutParamsCompat.b(viewGroup$MarginLayoutParams0)) {
                    MarginLayoutParamsCompat.g(viewGroup$MarginLayoutParams0, v);
                    viewGroup$MarginLayoutParams0.bottomMargin = 0;
                    imageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                    imageView0.requestLayout();
                }
            }
            i tabLayout$i0 = this.a;
            if(tabLayout$i0 != null) {
                charSequence0 = tabLayout$i0.d;
            }
            if(Build.VERSION.SDK_INT > 23) {
                if(z2) {
                    charSequence1 = charSequence0;
                }
                TooltipCompat.a(this, charSequence1);
            }
        }

        @Override  // android.view.ViewGroup
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] arr_v = this.getDrawableState();
            if((this.i == null || !this.i.isStateful() ? false : this.i.setState(arr_v))) {
                this.invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Nullable
        private com.google.android.material.badge.a getBadge() {
            return this.e;
        }

        int getContentHeight() {
            View[] arr_view = {this.b, this.c, this.f};
            int v = 0;
            int v1 = 0;
            boolean z = false;
            for(int v2 = 0; v2 < 3; ++v2) {
                View view0 = arr_view[v2];
                if(view0 != null && view0.getVisibility() == 0) {
                    v1 = z ? Math.min(v1, view0.getTop()) : view0.getTop();
                    v = z ? Math.max(v, view0.getBottom()) : view0.getBottom();
                    z = true;
                }
            }
            return v - v1;
        }

        int getContentWidth() {
            View[] arr_view = {this.b, this.c, this.f};
            int v = 0;
            int v1 = 0;
            boolean z = false;
            for(int v2 = 0; v2 < 3; ++v2) {
                View view0 = arr_view[v2];
                if(view0 != null && view0.getVisibility() == 0) {
                    v1 = z ? Math.min(v1, view0.getLeft()) : view0.getLeft();
                    v = z ? Math.max(v, view0.getRight()) : view0.getRight();
                    z = true;
                }
            }
            return v - v1;
        }

        @NonNull
        private com.google.android.material.badge.a getOrCreateBadge() {
            if(this.e == null) {
                this.e = com.google.android.material.badge.a.f(this.getContext());
            }
            this.v();
            com.google.android.material.badge.a a0 = this.e;
            if(a0 == null) {
                throw new IllegalStateException("Unable to create badge");
            }
            return a0;
        }

        @Nullable
        public i getTab() {
            return this.a;
        }

        private void i(@Nullable View view0) {
            class com.google.android.material.tabs.TabLayout.n.a implements View.OnLayoutChangeListener {
                final View a;
                final n b;

                com.google.android.material.tabs.TabLayout.n.a(View view0) {
                    this.a = view0;
                    super();
                }

                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    if(this.a.getVisibility() == 0) {
                        n.this.w(this.a);
                    }
                }
            }

            if(view0 == null) {
                return;
            }
            view0.addOnLayoutChangeListener(new com.google.android.material.tabs.TabLayout.n.a(this, view0));
        }

        private float j(@NonNull Layout layout0, int v, float f) {
            return layout0.getLineWidth(v) * (f / layout0.getPaint().getTextSize());
        }

        private void k(boolean z) {
            this.setClipChildren(z);
            this.setClipToPadding(z);
            ViewGroup viewGroup0 = (ViewGroup)this.getParent();
            if(viewGroup0 != null) {
                viewGroup0.setClipChildren(z);
                viewGroup0.setClipToPadding(z);
            }
        }

        @NonNull
        private FrameLayout l() {
            FrameLayout frameLayout0 = new FrameLayout(this.getContext());
            frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout0;
        }

        private void m(@NonNull Canvas canvas0) {
            Drawable drawable0 = this.i;
            if(drawable0 != null) {
                drawable0.setBounds(this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
                this.i.draw(canvas0);
            }
        }

        @Nullable
        private FrameLayout n(@NonNull View view0) {
            if(view0 != this.c && view0 != this.b) {
                return null;
            }
            return com.google.android.material.badge.d.a ? ((FrameLayout)view0.getParent()) : null;
        }

        private boolean o() {
            return this.e != null;
        }

        @Override  // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
            if(this.e != null && this.e.isVisible()) {
                accessibilityNodeInfoCompat0.p1(this.e.r());
            }
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(0, 1, this.a.k(), 1, false, this.isSelected()));
            if(this.isSelected()) {
                accessibilityNodeInfoCompat0.l1(false);
                accessibilityNodeInfoCompat0.W0(AccessibilityActionCompat.j);
            }
            accessibilityNodeInfoCompat0.X1(this.getResources().getString(string.item_view_role_description));
        }

        @Override  // android.widget.LinearLayout
        public void onMeasure(int v, int v1) {
            int v2 = View.MeasureSpec.getSize(v);
            int v3 = View.MeasureSpec.getMode(v);
            int v4 = TabLayout.this.getTabMaxWidth();
            if(v4 > 0 && (v3 == 0 || v2 > v4)) {
                v = View.MeasureSpec.makeMeasureSpec(TabLayout.this.v, 0x80000000);
            }
            super.onMeasure(v, v1);
            if(this.b != null) {
                float f = TabLayout.this.r;
                int v5 = this.j;
                if(this.c != null && this.c.getVisibility() == 0) {
                    v5 = 1;
                }
                else if(this.b != null && this.b.getLineCount() > 1) {
                    f = TabLayout.this.t;
                }
                float f1 = this.b.getTextSize();
                int v6 = this.b.getLineCount();
                int v7 = TextViewCompat.k(this.b);
                int v8 = Float.compare(f, f1);
                if(v8 != 0 || v7 >= 0 && v5 != v7) {
                    if(TabLayout.this.D != 1 || v8 <= 0 || v6 != 1) {
                        this.b.setTextSize(0, f);
                        this.b.setMaxLines(v5);
                        super.onMeasure(v, v1);
                    }
                    else {
                        Layout layout0 = this.b.getLayout();
                        if(layout0 != null && this.j(layout0, 0, f) <= ((float)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()))) {
                            this.b.setTextSize(0, f);
                            this.b.setMaxLines(v5);
                            super.onMeasure(v, v1);
                        }
                    }
                }
            }
        }

        private void p() {
            FrameLayout frameLayout0;
            if(com.google.android.material.badge.d.a) {
                frameLayout0 = this.l();
                this.addView(frameLayout0, 0);
            }
            else {
                frameLayout0 = this;
            }
            ImageView imageView0 = (ImageView)LayoutInflater.from(this.getContext()).inflate(layout.design_layout_tab_icon, frameLayout0, false);
            this.c = imageView0;
            frameLayout0.addView(imageView0, 0);
        }

        @Override  // android.view.View
        public boolean performClick() {
            boolean z = super.performClick();
            if(this.a != null) {
                if(!z) {
                    this.playSoundEffect(0);
                }
                this.a.r();
                return true;
            }
            return z;
        }

        private void q() {
            FrameLayout frameLayout0;
            if(com.google.android.material.badge.d.a) {
                frameLayout0 = this.l();
                this.addView(frameLayout0);
            }
            else {
                frameLayout0 = this;
            }
            TextView textView0 = (TextView)LayoutInflater.from(this.getContext()).inflate(layout.design_layout_tab_text, frameLayout0, false);
            this.b = textView0;
            frameLayout0.addView(textView0);
        }

        private void r() {
            if(this.d != null) {
                this.u();
            }
            this.e = null;
        }

        void s() {
            this.setTab(null);
            this.setSelected(false);
        }

        @Override  // android.view.View
        public void setSelected(boolean z) {
            this.isSelected();
            super.setSelected(z);
            TextView textView0 = this.b;
            if(textView0 != null) {
                textView0.setSelected(z);
            }
            ImageView imageView0 = this.c;
            if(imageView0 != null) {
                imageView0.setSelected(z);
            }
            View view0 = this.f;
            if(view0 != null) {
                view0.setSelected(z);
            }
        }

        void setTab(@Nullable i tabLayout$i0) {
            if(tabLayout$i0 != this.a) {
                this.a = tabLayout$i0;
                this.x();
            }
        }

        private void t(@Nullable View view0) {
            if(!this.o()) {
                return;
            }
            if(view0 != null) {
                this.k(false);
                com.google.android.material.badge.d.d(this.e, view0, this.n(view0));
                this.d = view0;
            }
        }

        private void u() {
            if(!this.o()) {
                return;
            }
            this.k(true);
            View view0 = this.d;
            if(view0 != null) {
                com.google.android.material.badge.d.j(this.e, view0);
                this.d = null;
            }
        }

        private void v() {
            if(!this.o()) {
                return;
            }
            if(this.f != null) {
                this.u();
                return;
            }
            if(this.c != null && (this.a != null && this.a.h() != null)) {
                ImageView imageView0 = this.c;
                if(this.d != imageView0) {
                    this.u();
                    this.t(this.c);
                    return;
                }
                this.w(imageView0);
                return;
            }
            if(this.b != null && (this.a != null && this.a.l() == 1)) {
                TextView textView0 = this.b;
                if(this.d != textView0) {
                    this.u();
                    this.t(this.b);
                    return;
                }
                this.w(textView0);
                return;
            }
            this.u();
        }

        private void w(@NonNull View view0) {
            if(this.o() && view0 == this.d) {
                com.google.android.material.badge.d.m(this.e, view0, this.n(view0));
            }
        }

        final void x() {
            this.A();
            this.setSelected(this.a != null && this.a.o());
        }

        private void y(Context context0) {
            int v = TabLayout.this.u;
            GradientDrawable gradientDrawable0 = null;
            if(v == 0) {
                this.i = null;
            }
            else {
                Drawable drawable0 = AppCompatResources.b(context0, v);
                this.i = drawable0;
                if(drawable0 != null && drawable0.isStateful()) {
                    this.i.setState(this.getDrawableState());
                }
            }
            GradientDrawable gradientDrawable1 = new GradientDrawable();
            gradientDrawable1.setColor(0);
            if(TabLayout.this.n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(0.00001f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList0 = com.google.android.material.ripple.b.a(TabLayout.this.n);
                boolean z = TabLayout.this.I;
                if(z) {
                    gradientDrawable1 = null;
                }
                if(!z) {
                    gradientDrawable0 = gradientDrawable2;
                }
                gradientDrawable1 = new RippleDrawable(colorStateList0, gradientDrawable1, gradientDrawable0);
            }
            ViewCompat.R1(this, gradientDrawable1);
            TabLayout.this.invalidate();
        }

        final void z() {
            this.setOrientation(!TabLayout.this.E);
            TextView textView0 = this.g;
            if(textView0 == null && this.h == null) {
                this.B(this.b, this.c, true);
                return;
            }
            this.B(textView0, this.h, false);
        }
    }

    public static class o implements f {
        private final ViewPager a;

        public o(ViewPager viewPager0) {
            this.a = viewPager0;
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void N(i tabLayout$i0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void R(i tabLayout$i0) {
        }

        @Override  // com.google.android.material.tabs.TabLayout$c
        public void j(@NonNull i tabLayout$i0) {
            this.a.setCurrentItem(tabLayout$i0.k());
        }
    }

    int A;
    int B;
    int C;
    int D;
    boolean E;
    boolean F;
    int G;
    int H;
    boolean I;
    private com.google.android.material.tabs.c J;
    private final TimeInterpolator K;
    @Nullable
    private c L;
    private final ArrayList M;
    private DataSetObserver M8;
    @Nullable
    private c N;
    private m N8;
    private ValueAnimator O;
    private b O8;
    @Nullable
    ViewPager P;
    private boolean P8;
    @Nullable
    private PagerAdapter Q;
    private int Q8;
    private final Pool R8;
    private static final int S8 = 0;
    @Dimension(unit = 0)
    private static final int T8 = 72;
    @Dimension(unit = 0)
    static final int U8 = 8;
    @Dimension(unit = 0)
    private static final int V8 = 0x30;
    @Dimension(unit = 0)
    private static final int W8 = 56;
    @Dimension(unit = 0)
    static final int X8 = 16;
    private static final int Y8 = -1;
    private static final int Z8 = 300;
    int a;
    private static final int a9 = -1;
    private final ArrayList b;
    private static final Pool b9 = null;
    @Nullable
    private i c;
    private static final String c9 = "TabLayout";
    @NonNull
    final h d;
    public static final int d9 = 0;
    int e;
    public static final int e9 = 1;
    int f;
    public static final int f9 = 2;
    int g;
    public static final int g9 = 0;
    int h;
    public static final int h9 = 1;
    private final int i;
    public static final int i9 = 0;
    private final int j;
    public static final int j9 = 1;
    private int k;
    public static final int k9 = 2;
    ColorStateList l;
    public static final int l9 = 0;
    ColorStateList m;
    public static final int m9 = 1;
    ColorStateList n;
    public static final int n9 = 2;
    @NonNull
    Drawable o;
    public static final int o9 = 3;
    private int p;
    public static final int p9 = 0;
    PorterDuff.Mode q;
    public static final int q9 = 1;
    float r;
    public static final int r9 = 2;
    float s;
    float t;
    final int u;
    int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;

    static {
        TabLayout.S8 = style.Widget_Design_TabLayout;
        TabLayout.b9 = new SynchronizedPool(16);
    }

    public TabLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public TabLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.tabStyle);
    }

    public TabLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, TabLayout.S8), attributeSet0, v);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.v = 0x7FFFFFFF;
        this.G = -1;
        this.M = new ArrayList();
        this.R8 = new SimplePool(12);
        Context context1 = this.getContext();
        this.setHorizontalScrollBarEnabled(false);
        h tabLayout$h0 = new h(this, context1);
        this.d = tabLayout$h0;
        super.addView(tabLayout$h0, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.TabLayout, v, TabLayout.S8, new int[]{styleable.TabLayout_tabTextAppearance});
        ColorStateList colorStateList0 = com.google.android.material.drawable.f.g(this.getBackground());
        if(colorStateList0 != null) {
            com.google.android.material.shape.k k0 = new com.google.android.material.shape.k();
            k0.p0(colorStateList0);
            k0.a0(context1);
            k0.o0(ViewCompat.V(this));
            ViewCompat.R1(this, k0);
        }
        this.setSelectedTabIndicator(com.google.android.material.resources.d.e(context1, typedArray0, styleable.TabLayout_tabIndicator));
        this.setSelectedTabIndicatorColor(typedArray0.getColor(styleable.TabLayout_tabIndicatorColor, 0));
        tabLayout$h0.i(typedArray0.getDimensionPixelSize(styleable.TabLayout_tabIndicatorHeight, -1));
        this.setSelectedTabIndicatorGravity(typedArray0.getInt(styleable.TabLayout_tabIndicatorGravity, 0));
        this.setTabIndicatorAnimationMode(typedArray0.getInt(styleable.TabLayout_tabIndicatorAnimationMode, 0));
        this.setTabIndicatorFullWidth(typedArray0.getBoolean(styleable.TabLayout_tabIndicatorFullWidth, true));
        int v1 = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPadding, 0);
        this.h = v1;
        this.g = v1;
        this.f = v1;
        this.e = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingStart, v1);
        this.f = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingTop, this.f);
        this.g = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingEnd, this.g);
        this.h = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabPaddingBottom, this.h);
        this.i = D.h(context1) ? attr.textAppearanceTitleSmall : attr.textAppearanceButton;
        int v2 = typedArray0.getResourceId(24, style.TextAppearance_Design_Tab);
        this.j = v2;
        int[] arr_v = androidx.appcompat.R.styleable.TextAppearance;
        TypedArray typedArray1 = context1.obtainStyledAttributes(v2, arr_v);
        try {
            this.r = (float)typedArray1.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.l = com.google.android.material.resources.d.a(context1, typedArray1, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        }
        finally {
            typedArray1.recycle();
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabSelectedTextAppearance)) {
            this.k = typedArray0.getResourceId(22, v2);
        }
        int v4 = this.k;
        if(v4 != -1) {
            TypedArray typedArray2 = context1.obtainStyledAttributes(v4, arr_v);
            try {
                this.s = (float)typedArray2.getDimensionPixelSize(0, ((int)this.r));
                ColorStateList colorStateList1 = com.google.android.material.resources.d.a(context1, typedArray2, 3);
                if(colorStateList1 != null) {
                    int v6 = this.l.getDefaultColor();
                    int v7 = colorStateList1.getDefaultColor();
                    this.l = TabLayout.v(v6, colorStateList1.getColorForState(new int[]{0x10100A1}, v7));
                }
            }
            finally {
                typedArray2.recycle();
            }
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabTextColor)) {
            this.l = com.google.android.material.resources.d.a(context1, typedArray0, 25);
        }
        if(typedArray0.hasValue(styleable.TabLayout_tabSelectedTextColor)) {
            int v8 = typedArray0.getColor(23, 0);
            this.l = TabLayout.v(this.l.getDefaultColor(), v8);
        }
        this.m = com.google.android.material.resources.d.a(context1, typedArray0, styleable.TabLayout_tabIconTint);
        this.q = M.u(typedArray0.getInt(styleable.TabLayout_tabIconTintMode, -1), null);
        this.n = com.google.android.material.resources.d.a(context1, typedArray0, styleable.TabLayout_tabRippleColor);
        this.B = typedArray0.getInt(styleable.TabLayout_tabIndicatorAnimationDuration, 300);
        this.K = com.google.android.material.motion.j.g(context1, attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b);
        this.w = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabMinWidth, -1);
        this.x = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabMaxWidth, -1);
        this.u = typedArray0.getResourceId(styleable.TabLayout_tabBackground, 0);
        this.z = typedArray0.getDimensionPixelSize(styleable.TabLayout_tabContentStart, 0);
        this.D = typedArray0.getInt(styleable.TabLayout_tabMode, 1);
        this.A = typedArray0.getInt(styleable.TabLayout_tabGravity, 0);
        this.E = typedArray0.getBoolean(styleable.TabLayout_tabInlineLabel, false);
        this.I = typedArray0.getBoolean(styleable.TabLayout_tabUnboundedRipple, false);
        typedArray0.recycle();
        Resources resources0 = this.getResources();
        this.t = (float)resources0.getDimensionPixelSize(dimen.design_tab_text_size_2line);
        this.y = resources0.getDimensionPixelSize(dimen.design_tab_scrollable_min_width);
        this.r();
    }

    private void A(@NonNull i tabLayout$i0) {
        for(int v = this.M.size() - 1; v >= 0; --v) {
            ((c)this.M.get(v)).j(tabLayout$i0);
        }
    }

    private void B(@NonNull i tabLayout$i0) {
        for(int v = this.M.size() - 1; v >= 0; --v) {
            ((c)this.M.get(v)).N(tabLayout$i0);
        }
    }

    private void C() {
        class com.google.android.material.tabs.TabLayout.a implements ValueAnimator.AnimatorUpdateListener {
            final TabLayout a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                TabLayout.this.scrollTo(v, 0);
            }
        }

        if(this.O == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.O = valueAnimator0;
            valueAnimator0.setInterpolator(this.K);
            this.O.setDuration(((long)this.B));
            this.O.addUpdateListener(new com.google.android.material.tabs.TabLayout.a(this));
        }
    }

    @Nullable
    public i D(int v) {
        return v < 0 || v >= this.getTabCount() ? null : ((i)this.b.get(v));
    }

    public boolean E() {
        return this.I;
    }

    public boolean F() {
        return this.E;
    }

    private boolean G() {
        return this.getTabMode() == 0 || this.getTabMode() == 2;
    }

    public boolean H() {
        return this.F;
    }

    @NonNull
    public i I() {
        i tabLayout$i0 = this.x();
        tabLayout$i0.h = this;
        tabLayout$i0.i = this.y(tabLayout$i0);
        if(tabLayout$i0.j != -1) {
            tabLayout$i0.i.setId(tabLayout$i0.j);
        }
        return tabLayout$i0;
    }

    void J() {
        this.L();
        PagerAdapter pagerAdapter0 = this.Q;
        if(pagerAdapter0 != null) {
            int v = pagerAdapter0.e();
            for(int v1 = 0; v1 < v; ++v1) {
                this.l(this.I().D(this.Q.g(v1)), false);
            }
            ViewPager viewPager0 = this.P;
            if(viewPager0 != null && v > 0) {
                int v2 = viewPager0.getCurrentItem();
                if(v2 != this.getSelectedTabPosition() && v2 < this.getTabCount()) {
                    this.R(this.D(v2));
                }
            }
        }
    }

    protected boolean K(i tabLayout$i0) {
        return TabLayout.b9.a(tabLayout$i0);
    }

    public void L() {
        for(int v = this.d.getChildCount() - 1; v >= 0; --v) {
            this.Q(v);
        }
        Iterator iterator0 = this.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            ((i)object0).q();
            this.K(((i)object0));
        }
        this.c = null;
    }

    @Deprecated
    public void M(@Nullable c tabLayout$c0) {
        this.M.remove(tabLayout$c0);
    }

    public void N(@NonNull f tabLayout$f0) {
        this.M(tabLayout$f0);
    }

    public void O(@NonNull i tabLayout$i0) {
        if(tabLayout$i0.h != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        this.P(tabLayout$i0.k());
    }

    public void P(int v) {
        int v1 = this.c == null ? 0 : this.c.k();
        this.Q(v);
        i tabLayout$i0 = (i)this.b.remove(v);
        if(tabLayout$i0 != null) {
            tabLayout$i0.q();
            this.K(tabLayout$i0);
        }
        int v2 = this.b.size();
        int v3 = -1;
        for(int v4 = v; v4 < v2; ++v4) {
            if(((i)this.b.get(v4)).k() == this.a) {
                v3 = v4;
            }
            ((i)this.b.get(v4)).z(v4);
        }
        this.a = v3;
        if(v1 == v) {
            this.R((this.b.isEmpty() ? null : ((i)this.b.get(Math.max(0, v - 1)))));
        }
    }

    private void Q(int v) {
        n tabLayout$n0 = (n)this.d.getChildAt(v);
        this.d.removeViewAt(v);
        if(tabLayout$n0 != null) {
            tabLayout$n0.s();
            this.R8.a(tabLayout$n0);
        }
        this.requestLayout();
    }

    public void R(@Nullable i tabLayout$i0) {
        this.S(tabLayout$i0, true);
    }

    public void S(@Nullable i tabLayout$i0, boolean z) {
        i tabLayout$i1 = this.c;
        if(tabLayout$i1 != tabLayout$i0) {
            int v = tabLayout$i0 == null ? -1 : tabLayout$i0.k();
            if(z) {
                if(tabLayout$i1 != null && tabLayout$i1.k() != -1 || v == -1) {
                    this.p(v);
                }
                else {
                    this.U(v, 0.0f, true);
                }
                if(v != -1) {
                    this.setSelectedTabView(v);
                }
            }
            this.c = tabLayout$i0;
            if(tabLayout$i1 != null && tabLayout$i1.h != null) {
                this.B(tabLayout$i1);
            }
            if(tabLayout$i0 != null) {
                this.A(tabLayout$i0);
            }
        }
        else if(tabLayout$i1 != null) {
            this.z(tabLayout$i0);
            this.p(tabLayout$i0.k());
        }
    }

    void T(@Nullable PagerAdapter pagerAdapter0, boolean z) {
        PagerAdapter pagerAdapter1 = this.Q;
        if(pagerAdapter1 != null) {
            DataSetObserver dataSetObserver0 = this.M8;
            if(dataSetObserver0 != null) {
                pagerAdapter1.u(dataSetObserver0);
            }
        }
        this.Q = pagerAdapter0;
        if(z && pagerAdapter0 != null) {
            if(this.M8 == null) {
                this.M8 = new g(this);
            }
            pagerAdapter0.m(this.M8);
        }
        this.J();
    }

    public void U(int v, float f, boolean z) {
        this.V(v, f, z, true);
    }

    public void V(int v, float f, boolean z, boolean z1) {
        this.W(v, f, z, z1, true);
    }

    void W(int v, float f, boolean z, boolean z1, boolean z2) {
        int v1 = Math.round(((float)v) + f);
        if(v1 >= 0 && v1 < this.d.getChildCount()) {
            if(z1) {
                this.d.h(v, f);
            }
            if(this.O != null && this.O.isRunning()) {
                this.O.cancel();
            }
            int v2 = this.s(v, f);
            int v3 = this.getScrollX();
            boolean z3 = v < this.getSelectedTabPosition() && v2 >= v3 || v > this.getSelectedTabPosition() && v2 <= v3 || v == this.getSelectedTabPosition();
            if(ViewCompat.e0(this) == 1) {
                z3 = v < this.getSelectedTabPosition() && v2 <= v3 || v > this.getSelectedTabPosition() && v2 >= v3 || v == this.getSelectedTabPosition();
            }
            if(z3 || this.Q8 == 1 || z2) {
                if(v < 0) {
                    v2 = 0;
                }
                this.scrollTo(v2, 0);
            }
            if(z) {
                this.setSelectedTabView(v1);
            }
        }
    }

    public void X(int v, int v1) {
        this.setTabTextColors(TabLayout.v(v, v1));
    }

    public void Y(@Nullable ViewPager viewPager0, boolean z) {
        this.Z(viewPager0, z, false);
    }

    private void Z(@Nullable ViewPager viewPager0, boolean z, boolean z1) {
        ViewPager viewPager1 = this.P;
        if(viewPager1 != null) {
            m tabLayout$m0 = this.N8;
            if(tabLayout$m0 != null) {
                viewPager1.O(tabLayout$m0);
            }
            b tabLayout$b0 = this.O8;
            if(tabLayout$b0 != null) {
                this.P.N(tabLayout$b0);
            }
        }
        c tabLayout$c0 = this.N;
        if(tabLayout$c0 != null) {
            this.M(tabLayout$c0);
            this.N = null;
        }
        if(viewPager0 == null) {
            this.P = null;
            this.T(null, false);
        }
        else {
            this.P = viewPager0;
            if(this.N8 == null) {
                this.N8 = new m(this);
            }
            this.N8.c();
            viewPager0.c(this.N8);
            o tabLayout$o0 = new o(viewPager0);
            this.N = tabLayout$o0;
            this.g(tabLayout$o0);
            PagerAdapter pagerAdapter0 = viewPager0.getAdapter();
            if(pagerAdapter0 != null) {
                this.T(pagerAdapter0, z);
            }
            if(this.O8 == null) {
                this.O8 = new b(this);
            }
            this.O8.a(z);
            viewPager0.b(this.O8);
            this.U(viewPager0.getCurrentItem(), 0.0f, true);
        }
        this.P8 = z1;
    }

    private void a0() {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((i)this.b.get(v1)).E();
        }
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0) {
        this.o(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, int v) {
        this.o(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.o(view0);
    }

    @Override  // android.widget.HorizontalScrollView
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.o(view0);
    }

    private void b0(@NonNull LinearLayout.LayoutParams linearLayout$LayoutParams0) {
        if(this.D == 1 && this.A == 0) {
            linearLayout$LayoutParams0.width = 0;
            linearLayout$LayoutParams0.weight = 1.0f;
            return;
        }
        linearLayout$LayoutParams0.width = -2;
        linearLayout$LayoutParams0.weight = 0.0f;
    }

    void c0(boolean z) {
        for(int v = 0; v < this.d.getChildCount(); ++v) {
            View view0 = this.d.getChildAt(v);
            view0.setMinimumWidth(this.getTabMinWidth());
            this.b0(((LinearLayout.LayoutParams)view0.getLayoutParams()));
            if(z) {
                view0.requestLayout();
            }
        }
    }

    void d0(int v) {
        this.Q8 = v;
    }

    @Deprecated
    public void g(@Nullable c tabLayout$c0) {
        if(!this.M.contains(tabLayout$c0)) {
            this.M.add(tabLayout$c0);
        }
    }

    @Override  // android.widget.FrameLayout
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.widget.FrameLayout
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateDefaultLayoutParams();
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        int v = this.b.size();
        for(int v1 = 0; v1 < v; ++v1) {
            i tabLayout$i0 = (i)this.b.get(v1);
            if(tabLayout$i0 != null && tabLayout$i0.h() != null && !TextUtils.isEmpty(tabLayout$i0.n())) {
                return this.E ? 0x30 : 72;
            }
        }
        return 0x30;
    }

    public int getSelectedTabPosition() {
        return this.c == null ? -1 : this.c.k();
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    int getTabMaxWidth() {
        return this.v;
    }

    private int getTabMinWidth() {
        int v = this.w;
        if(v != -1) {
            return v;
        }
        return this.D == 0 || this.D == 2 ? this.y : 0;
    }

    public int getTabMode() {
        return this.D;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    private int getTabScrollRange() {
        return Math.max(0, this.d.getWidth() - this.getWidth() - this.getPaddingLeft() - this.getPaddingRight());
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public void h(@NonNull f tabLayout$f0) {
        this.g(tabLayout$f0);
    }

    public void i(@NonNull i tabLayout$i0) {
        this.l(tabLayout$i0, this.b.isEmpty());
    }

    public void j(@NonNull i tabLayout$i0, int v) {
        this.k(tabLayout$i0, v, this.b.isEmpty());
    }

    public void k(@NonNull i tabLayout$i0, int v, boolean z) {
        if(tabLayout$i0.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        this.u(tabLayout$i0, v);
        this.n(tabLayout$i0);
        if(z) {
            tabLayout$i0.r();
        }
    }

    public void l(@NonNull i tabLayout$i0, boolean z) {
        this.k(tabLayout$i0, this.b.size(), z);
    }

    private void m(@NonNull TabItem tabItem0) {
        i tabLayout$i0 = this.I();
        CharSequence charSequence0 = tabItem0.a;
        if(charSequence0 != null) {
            tabLayout$i0.D(charSequence0);
        }
        Drawable drawable0 = tabItem0.b;
        if(drawable0 != null) {
            tabLayout$i0.x(drawable0);
        }
        int v = tabItem0.c;
        if(v != 0) {
            tabLayout$i0.u(v);
        }
        if(!TextUtils.isEmpty(tabItem0.getContentDescription())) {
            tabLayout$i0.t(tabItem0.getContentDescription());
        }
        this.i(tabLayout$i0);
    }

    private void n(@NonNull i tabLayout$i0) {
        n tabLayout$n0 = tabLayout$i0.i;
        tabLayout$n0.setSelected(false);
        tabLayout$n0.setActivated(false);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = this.w();
        this.d.addView(tabLayout$n0, tabLayout$i0.k(), linearLayout$LayoutParams0);
    }

    private void o(View view0) {
        if(!(view0 instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        this.m(((TabItem)view0));
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.e(this);
        if(this.P == null) {
            ViewParent viewParent0 = this.getParent();
            if(viewParent0 instanceof ViewPager) {
                this.Z(((ViewPager)viewParent0), true, true);
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.P8) {
            this.setupWithViewPager(null);
            this.P8 = false;
        }
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        for(int v = 0; v < this.d.getChildCount(); ++v) {
            View view0 = this.d.getChildAt(v);
            if(view0 instanceof n) {
                ((n)view0).m(canvas0);
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).m1(CollectionInfoCompat.h(1, this.getTabCount(), false, 1));
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.HorizontalScrollView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.G() && super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.widget.HorizontalScrollView
    protected void onMeasure(int v, int v1) {
        int v5;
        int v2 = Math.round(M.i(this.getContext(), this.getDefaultHeight()));
        switch(View.MeasureSpec.getMode(v1)) {
            case 0x80000000: {
                if(this.getChildCount() == 1 && View.MeasureSpec.getSize(v1) >= v2) {
                    this.getChildAt(0).setMinimumHeight(v2);
                }
                break;
            }
            case 0: {
                v1 = View.MeasureSpec.makeMeasureSpec(v2 + this.getPaddingTop() + this.getPaddingBottom(), 0x40000000);
            }
        }
        int v3 = View.MeasureSpec.getSize(v);
        if(View.MeasureSpec.getMode(v) != 0) {
            this.v = this.x > 0 ? this.x : ((int)(((float)v3) - M.i(this.getContext(), 56)));
        }
        super.onMeasure(v, v1);
        if(this.getChildCount() == 1) {
            View view0 = this.getChildAt(0);
            int v4 = this.D;
            switch(v4) {
                case 0: {
                label_17:
                    if(view0.getMeasuredWidth() < this.getMeasuredWidth()) {
                        v5 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingTop() + this.getPaddingBottom(), view0.getLayoutParams().height);
                        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), v5);
                        return;
                    }
                    break;
                }
                case 1: {
                    if(view0.getMeasuredWidth() != this.getMeasuredWidth()) {
                        v5 = ViewGroup.getChildMeasureSpec(v1, this.getPaddingTop() + this.getPaddingBottom(), view0.getLayoutParams().height);
                        view0.measure(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), v5);
                    }
                    break;
                }
                default: {
                    if(v4 != 2) {
                        return;
                    }
                    goto label_17;
                }
            }
        }
    }

    @Override  // android.widget.HorizontalScrollView
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return motionEvent0.getActionMasked() != 8 || this.G() ? super.onTouchEvent(motionEvent0) : false;
    }

    private void p(int v) {
        if(v == -1) {
            return;
        }
        if(this.getWindowToken() != null && ViewCompat.a1(this) && !this.d.d()) {
            int v1 = this.getScrollX();
            int v2 = this.s(v, 0.0f);
            if(v1 != v2) {
                this.C();
                this.O.setIntValues(new int[]{v1, v2});
                this.O.start();
            }
            this.d.c(v, this.B);
            return;
        }
        this.U(v, 0.0f, true);
    }

    private void q(int v) {
        switch(v) {
            case 0: {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                break;
            }
            case 1: {
                this.d.setGravity(1);
                return;
            }
            case 2: {
                break;
            }
            default: {
                return;
            }
        }
        this.d.setGravity(0x800003);
    }

    private void r() {
        ViewCompat.p2(this.d, (this.D == 0 || this.D == 2 ? Math.max(0, this.z - this.e) : 0), 0, 0, 0);
        switch(this.D) {
            case 0: {
                this.q(this.A);
                break;
            }
            case 1: 
            case 2: {
                if(this.A == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.d.setGravity(1);
            }
        }
        this.c0(true);
    }

    private int s(int v, float f) {
        int v1 = 0;
        if(this.D != 0 && this.D != 2) {
            return 0;
        }
        View view0 = this.d.getChildAt(v);
        if(view0 == null) {
            return 0;
        }
        View view1 = v + 1 >= this.d.getChildCount() ? null : this.d.getChildAt(v + 1);
        int v2 = view0.getWidth();
        if(view1 != null) {
            v1 = view1.getWidth();
        }
        int v3 = view0.getLeft() + v2 / 2 - this.getWidth() / 2;
        int v4 = (int)(((float)(v2 + v1)) * 0.5f * f);
        return ViewCompat.e0(this) == 0 ? v3 + v4 : v3 - v4;
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.shape.l.d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if(this.E != z) {
            this.E = z;
            for(int v = 0; v < this.d.getChildCount(); ++v) {
                View view0 = this.d.getChildAt(v);
                if(view0 instanceof n) {
                    ((n)view0).z();
                }
            }
            this.r();
        }
    }

    public void setInlineLabelResource(@BoolRes int v) {
        this.setInlineLabel(this.getResources().getBoolean(v));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable c tabLayout$c0) {
        c tabLayout$c1 = this.L;
        if(tabLayout$c1 != null) {
            this.M(tabLayout$c1);
        }
        this.L = tabLayout$c0;
        if(tabLayout$c0 != null) {
            this.g(tabLayout$c0);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable f tabLayout$f0) {
        this.setOnTabSelectedListener(tabLayout$f0);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.C();
        this.O.addListener(animator$AnimatorListener0);
    }

    public void setSelectedTabIndicator(@DrawableRes int v) {
        if(v != 0) {
            this.setSelectedTabIndicator(AppCompatResources.b(this.getContext(), v));
            return;
        }
        this.setSelectedTabIndicator(null);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            drawable0 = new GradientDrawable();
        }
        Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
        this.o = drawable1;
        com.google.android.material.drawable.f.n(drawable1, this.p);
        int v = this.G == -1 ? this.o.getIntrinsicHeight() : this.G;
        this.d.i(v);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int v) {
        this.p = v;
        com.google.android.material.drawable.f.n(this.o, v);
        this.c0(false);
    }

    public void setSelectedTabIndicatorGravity(int v) {
        if(this.C != v) {
            this.C = v;
            ViewCompat.v1(this.d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int v) {
        this.G = v;
        this.d.i(v);
    }

    private void setSelectedTabView(int v) {
        int v1 = this.d.getChildCount();
        if(v < v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                View view0 = this.d.getChildAt(v2);
                boolean z = true;
                if((v2 != v || view0.isSelected()) && (v2 == v || !view0.isSelected())) {
                    view0.setSelected(v2 == v);
                    if(v2 != v) {
                        z = false;
                    }
                    view0.setActivated(z);
                }
                else {
                    view0.setSelected(v2 == v);
                    if(v2 != v) {
                        z = false;
                    }
                    view0.setActivated(z);
                    if(view0 instanceof n) {
                        ((n)view0).A();
                    }
                }
            }
        }
    }

    public void setTabGravity(int v) {
        if(this.A != v) {
            this.A = v;
            this.r();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.m != colorStateList0) {
            this.m = colorStateList0;
            this.a0();
        }
    }

    public void setTabIconTintResource(@ColorRes int v) {
        this.setTabIconTint(AppCompatResources.a(this.getContext(), v));
    }

    public void setTabIndicatorAnimationMode(int v) {
        this.H = v;
        switch(v) {
            case 0: {
                this.J = new com.google.android.material.tabs.c();
                return;
            }
            case 1: {
                this.J = new com.google.android.material.tabs.a();
                return;
            }
            case 2: {
                this.J = new com.google.android.material.tabs.b();
                return;
            }
            default: {
                throw new IllegalArgumentException(v + " is not a valid TabIndicatorAnimationMode");
            }
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.F = z;
        this.d.g();
        ViewCompat.v1(this.d);
    }

    public void setTabMode(int v) {
        if(v != this.D) {
            this.D = v;
            this.r();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.n != colorStateList0) {
            this.n = colorStateList0;
            for(int v = 0; v < this.d.getChildCount(); ++v) {
                View view0 = this.d.getChildAt(v);
                if(view0 instanceof n) {
                    ((n)view0).y(this.getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int v) {
        this.setTabRippleColor(AppCompatResources.a(this.getContext(), v));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList0) {
        if(this.l != colorStateList0) {
            this.l = colorStateList0;
            this.a0();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter0) {
        this.T(pagerAdapter0, false);
    }

    public void setUnboundedRipple(boolean z) {
        if(this.I != z) {
            this.I = z;
            for(int v = 0; v < this.d.getChildCount(); ++v) {
                View view0 = this.d.getChildAt(v);
                if(view0 instanceof n) {
                    ((n)view0).y(this.getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int v) {
        this.setUnboundedRipple(this.getResources().getBoolean(v));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager0) {
        this.Y(viewPager0, true);
    }

    @Override  // android.widget.HorizontalScrollView
    public boolean shouldDelayChildPressedState() {
        return this.getTabScrollRange() > 0;
    }

    public void t() {
        this.M.clear();
    }

    private void u(@NonNull i tabLayout$i0, int v) {
        tabLayout$i0.z(v);
        this.b.add(v, tabLayout$i0);
        int v1 = this.b.size();
        int v2 = v + 1;
        int v3 = -1;
        while(v2 < v1) {
            if(((i)this.b.get(v2)).k() == this.a) {
                v3 = v2;
            }
            ((i)this.b.get(v2)).z(v2);
            ++v2;
        }
        this.a = v3;
    }

    @NonNull
    private static ColorStateList v(int v, int v1) {
        int[][] arr2_v = new int[2][];
        int[] arr_v = new int[2];
        arr2_v[0] = HorizontalScrollView.SELECTED_STATE_SET;
        arr_v[0] = v1;
        arr2_v[1] = HorizontalScrollView.EMPTY_STATE_SET;
        arr_v[1] = v;
        return new ColorStateList(arr2_v, arr_v);
    }

    @NonNull
    private LinearLayout.LayoutParams w() {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -1);
        this.b0(linearLayout$LayoutParams0);
        return linearLayout$LayoutParams0;
    }

    protected i x() {
        i tabLayout$i0 = (i)TabLayout.b9.b();
        return tabLayout$i0 == null ? new i() : tabLayout$i0;
    }

    @NonNull
    private n y(@NonNull i tabLayout$i0) {
        n tabLayout$n0 = this.R8 == null ? null : ((n)this.R8.b());
        if(tabLayout$n0 == null) {
            tabLayout$n0 = new n(this, this.getContext());
        }
        tabLayout$n0.setTab(tabLayout$i0);
        tabLayout$n0.setFocusable(true);
        tabLayout$n0.setMinimumWidth(this.getTabMinWidth());
        if(TextUtils.isEmpty(tabLayout$i0.d)) {
            tabLayout$n0.setContentDescription(tabLayout$i0.c);
            return tabLayout$n0;
        }
        tabLayout$n0.setContentDescription(tabLayout$i0.d);
        return tabLayout$n0;
    }

    private void z(@NonNull i tabLayout$i0) {
        for(int v = this.M.size() - 1; v >= 0; --v) {
            ((c)this.M.get(v)).R(tabLayout$i0);
        }
    }
}

