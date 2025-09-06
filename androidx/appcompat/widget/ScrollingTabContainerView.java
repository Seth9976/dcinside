package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;
import androidx.appcompat.view.ActionBarPolicy;

@RestrictTo({Scope.c})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    class TabAdapter extends BaseAdapter {
        final ScrollingTabContainerView a;

        @Override  // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.c.getChildCount();
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            return ((TabView)ScrollingTabContainerView.this.c.getChildAt(v)).b();
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            if(view0 == null) {
                Tab actionBar$Tab0 = (Tab)this.getItem(v);
                return ScrollingTabContainerView.this.g(actionBar$Tab0, true);
            }
            ((TabView)view0).a(((Tab)this.getItem(v)));
            return view0;
        }
    }

    class TabClickListener implements View.OnClickListener {
        final ScrollingTabContainerView a;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            ((TabView)view0).b().g();
            int v = ScrollingTabContainerView.this.c.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ScrollingTabContainerView.this.c.getChildAt(v1);
                view1.setSelected(view1 == view0);
            }
        }
    }

    class TabView extends LinearLayout {
        private final int[] a;
        private Tab b;
        private TextView c;
        private ImageView d;
        private View e;
        final ScrollingTabContainerView f;
        private static final String g = "androidx.appcompat.app.ActionBar$Tab";

        public TabView(Context context0, Tab actionBar$Tab0, boolean z) {
            super(context0, null, attr.actionBarTabStyle);
            int[] arr_v = {0x10100D4};
            this.a = arr_v;
            this.b = actionBar$Tab0;
            TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, null, arr_v, attr.actionBarTabStyle, 0);
            if(tintTypedArray0.C(0)) {
                this.setBackgroundDrawable(tintTypedArray0.h(0));
            }
            tintTypedArray0.I();
            if(z) {
                this.setGravity(0x800013);
            }
            this.c();
        }

        public void a(Tab actionBar$Tab0) {
            this.b = actionBar$Tab0;
            this.c();
        }

        public Tab b() {
            return this.b;
        }

        public void c() {
            Tab actionBar$Tab0 = this.b;
            View view0 = actionBar$Tab0.b();
            CharSequence charSequence0 = null;
            if(view0 == null) {
                View view1 = this.e;
                if(view1 != null) {
                    this.removeView(view1);
                    this.e = null;
                }
                Drawable drawable0 = actionBar$Tab0.c();
                CharSequence charSequence1 = actionBar$Tab0.f();
                if(drawable0 == null) {
                    ImageView imageView1 = this.d;
                    if(imageView1 != null) {
                        imageView1.setVisibility(8);
                        this.d.setImageDrawable(null);
                    }
                }
                else {
                    if(this.d == null) {
                        AppCompatImageView appCompatImageView0 = new AppCompatImageView(this.getContext());
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
                        linearLayout$LayoutParams0.gravity = 16;
                        appCompatImageView0.setLayoutParams(linearLayout$LayoutParams0);
                        this.addView(appCompatImageView0, 0);
                        this.d = appCompatImageView0;
                    }
                    this.d.setImageDrawable(drawable0);
                    this.d.setVisibility(0);
                }
                boolean z = TextUtils.isEmpty(charSequence1);
                if(z) {
                    TextView textView1 = this.c;
                    if(textView1 != null) {
                        textView1.setVisibility(8);
                        this.c.setText(null);
                    }
                }
                else {
                    if(this.c == null) {
                        AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext(), null, attr.actionBarTabTextStyle);
                        appCompatTextView0.setEllipsize(TextUtils.TruncateAt.END);
                        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                        linearLayout$LayoutParams1.gravity = 16;
                        appCompatTextView0.setLayoutParams(linearLayout$LayoutParams1);
                        this.addView(appCompatTextView0);
                        this.c = appCompatTextView0;
                    }
                    this.c.setText(charSequence1);
                    this.c.setVisibility(0);
                }
                ImageView imageView2 = this.d;
                if(imageView2 != null) {
                    imageView2.setContentDescription(actionBar$Tab0.a());
                }
                if(z) {
                    charSequence0 = actionBar$Tab0.a();
                }
                TooltipCompat.a(this, charSequence0);
            }
            else {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 != this) {
                    if(viewParent0 != null) {
                        ((ViewGroup)viewParent0).removeView(view0);
                    }
                    this.addView(view0);
                }
                this.e = view0;
                TextView textView0 = this.c;
                if(textView0 != null) {
                    textView0.setVisibility(8);
                }
                ImageView imageView0 = this.d;
                if(imageView0 != null) {
                    imageView0.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
        }

        @Override  // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
            super.onInitializeAccessibilityEvent(accessibilityEvent0);
            accessibilityEvent0.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override  // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
            accessibilityNodeInfo0.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override  // android.widget.LinearLayout
        public void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            if(ScrollingTabContainerView.this.f > 0) {
                int v2 = this.getMeasuredWidth();
                int v3 = ScrollingTabContainerView.this.f;
                if(v2 > v3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), v1);
                }
            }
        }

        @Override  // android.view.View
        public void setSelected(boolean z) {
            boolean z1 = this.isSelected() != z;
            super.setSelected(z);
            if(z1 && z) {
                this.sendAccessibilityEvent(4);
            }
        }
    }

    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        private boolean a;
        private int b;
        final ScrollingTabContainerView c;

        protected VisibilityAnimListener() {
            this.a = false;
        }

        public VisibilityAnimListener a(ViewPropertyAnimator viewPropertyAnimator0, int v) {
            this.b = v;
            ScrollingTabContainerView.this.j = viewPropertyAnimator0;
            return this;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.a = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            if(this.a) {
                return;
            }
            ScrollingTabContainerView.this.j = null;
            ScrollingTabContainerView.this.setVisibility(this.b);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.a = false;
        }
    }

    Runnable a;
    private TabClickListener b;
    LinearLayoutCompat c;
    private Spinner d;
    private boolean e;
    int f;
    int g;
    private int h;
    private int i;
    protected ViewPropertyAnimator j;
    protected final VisibilityAnimListener k;
    private static final String l = "ScrollingTabContainerView";
    private static final Interpolator m = null;
    private static final int n = 200;

    static {
        ScrollingTabContainerView.m = new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context0) {
        super(context0);
        this.k = new VisibilityAnimListener(this);
        this.setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.b(context0);
        this.setContentHeight(actionBarPolicy0.f());
        this.g = actionBarPolicy0.e();
        LinearLayoutCompat linearLayoutCompat0 = this.f();
        this.c = linearLayoutCompat0;
        this.addView(linearLayoutCompat0, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(Tab actionBar$Tab0, int v, boolean z) {
        TabView scrollingTabContainerView$TabView0 = this.g(actionBar$Tab0, false);
        this.c.addView(scrollingTabContainerView$TabView0, v, new LayoutParams(0, -1, 1.0f));
        Spinner spinner0 = this.d;
        if(spinner0 != null) {
            ((TabAdapter)spinner0.getAdapter()).notifyDataSetChanged();
        }
        if(z) {
            scrollingTabContainerView$TabView0.setSelected(true);
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void b(Tab actionBar$Tab0, boolean z) {
        TabView scrollingTabContainerView$TabView0 = this.g(actionBar$Tab0, false);
        this.c.addView(scrollingTabContainerView$TabView0, new LayoutParams(0, -1, 1.0f));
        Spinner spinner0 = this.d;
        if(spinner0 != null) {
            ((TabAdapter)spinner0.getAdapter()).notifyDataSetChanged();
        }
        if(z) {
            scrollingTabContainerView$TabView0.setSelected(true);
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void c(int v) {
        View view0 = this.c.getChildAt(v);
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            this.removeCallbacks(runnable0);
        }
        androidx.appcompat.widget.ScrollingTabContainerView.1 scrollingTabContainerView$10 = new Runnable() {
            final ScrollingTabContainerView b;

            @Override
            public void run() {
                int v = view0.getLeft();
                int v1 = ScrollingTabContainerView.this.getWidth();
                int v2 = view0.getWidth();
                ScrollingTabContainerView.this.smoothScrollTo(v - (v1 - v2) / 2, 0);
                ScrollingTabContainerView.this.a = null;
            }
        };
        this.a = scrollingTabContainerView$10;
        this.post(scrollingTabContainerView$10);
    }

    public void d(int v) {
        ViewPropertyAnimator viewPropertyAnimator0 = this.j;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
        }
        if(v == 0) {
            if(this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator1 = this.animate().alpha(1.0f);
            viewPropertyAnimator1.setDuration(200L);
            viewPropertyAnimator1.setInterpolator(ScrollingTabContainerView.m);
            viewPropertyAnimator1.setListener(this.k.a(viewPropertyAnimator1, 0));
            viewPropertyAnimator1.start();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.animate().alpha(0.0f);
        viewPropertyAnimator2.setDuration(200L);
        viewPropertyAnimator2.setInterpolator(ScrollingTabContainerView.m);
        viewPropertyAnimator2.setListener(this.k.a(viewPropertyAnimator2, v));
        viewPropertyAnimator2.start();
    }

    private Spinner e() {
        Spinner spinner0 = new AppCompatSpinner(this.getContext(), null, attr.actionDropDownStyle);
        spinner0.setLayoutParams(new LayoutParams(-2, -1));
        spinner0.setOnItemSelectedListener(this);
        return spinner0;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat0 = new LinearLayoutCompat(this.getContext(), null, attr.actionBarTabBarStyle);
        linearLayoutCompat0.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat0.setGravity(17);
        linearLayoutCompat0.setLayoutParams(new LayoutParams(-2, -1));
        return linearLayoutCompat0;
    }

    TabView g(Tab actionBar$Tab0, boolean z) {
        TabView scrollingTabContainerView$TabView0 = new TabView(this, this.getContext(), actionBar$Tab0, z);
        if(z) {
            scrollingTabContainerView$TabView0.setBackgroundDrawable(null);
            scrollingTabContainerView$TabView0.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
            return scrollingTabContainerView$TabView0;
        }
        scrollingTabContainerView$TabView0.setFocusable(true);
        if(this.b == null) {
            this.b = new TabClickListener(this);
        }
        scrollingTabContainerView$TabView0.setOnClickListener(this.b);
        return scrollingTabContainerView$TabView0;
    }

    private boolean h() {
        return this.d != null && this.d.getParent() == this;
    }

    private void i() {
        if(this.h()) {
            return;
        }
        if(this.d == null) {
            this.d = this.e();
        }
        this.removeView(this.c);
        this.addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        if(this.d.getAdapter() == null) {
            this.d.setAdapter(new TabAdapter(this));
        }
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            this.removeCallbacks(runnable0);
            this.a = null;
        }
        this.d.setSelection(this.i);
    }

    private boolean j() {
        if(!this.h()) {
            return false;
        }
        this.removeView(this.d);
        this.addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        this.setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void k() {
        this.c.removeAllViews();
        Spinner spinner0 = this.d;
        if(spinner0 != null) {
            ((TabAdapter)spinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void l(int v) {
        this.c.removeViewAt(v);
        Spinner spinner0 = this.d;
        if(spinner0 != null) {
            ((TabAdapter)spinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    public void m(int v) {
        ((TabView)this.c.getChildAt(v)).c();
        Spinner spinner0 = this.d;
        if(spinner0 != null) {
            ((TabAdapter)spinner0.getAdapter()).notifyDataSetChanged();
        }
        if(this.e) {
            this.requestLayout();
        }
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            this.post(runnable0);
        }
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.b(this.getContext());
        this.setContentHeight(actionBarPolicy0.f());
        this.g = actionBarPolicy0.e();
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            this.removeCallbacks(runnable0);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        ((TabView)view0).b().g();
    }

    @Override  // android.widget.HorizontalScrollView
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        this.setFillViewport(v2 == 0x40000000);
        int v3 = this.c.getChildCount();
        if(v3 <= 1 || v2 != 0x80000000 && v2 != 0x40000000) {
            this.f = -1;
        }
        else {
            this.f = v3 > 2 ? ((int)(((float)View.MeasureSpec.getSize(v)) * 0.4f)) : View.MeasureSpec.getSize(v) / 2;
            this.f = Math.min(this.f, this.g);
        }
        int v4 = View.MeasureSpec.makeMeasureSpec(this.h, 0x40000000);
        if(v2 == 0x40000000 || !this.e) {
            this.j();
        }
        else {
            this.c.measure(0, v4);
            if(this.c.getMeasuredWidth() > View.MeasureSpec.getSize(v)) {
                this.i();
            }
            else {
                this.j();
            }
        }
        int v5 = this.getMeasuredWidth();
        super.onMeasure(v, v4);
        if(v2 == 0x40000000 && v5 != this.getMeasuredWidth()) {
            this.setTabSelected(this.i);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView0) {
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int v) {
        this.h = v;
        this.requestLayout();
    }

    public void setTabSelected(int v) {
        this.i = v;
        int v1 = this.c.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            boolean z = v2 == v;
            this.c.getChildAt(v2).setSelected(z);
            if(z) {
                this.c(v);
            }
        }
        Spinner spinner0 = this.d;
        if(spinner0 != null && v >= 0) {
            spinner0.setSelection(v);
        }
    }
}

