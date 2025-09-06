package com.dcinside.app.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.q0;
import com.dcinside.app.post.view.DrawerLayout.LayoutParams;
import com.dcinside.app.post.view.DrawerLayout;
import com.dcinside.app.post.view.b;
import com.dcinside.app.util.dl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class HackyDrawerLayout extends DrawerLayout {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @SuppressLint({"RtlHardcoded"})
        @l
        public final String a(int v) {
            if((v & 3) == 3) {
                return "LEFT";
            }
            if((v & 5) == 5) {
                return "RIGHT";
            }
            String s = Integer.toHexString(v);
            L.o(s, "toHexString(...)");
            return s;
        }
    }

    private boolean a9;
    @l
    public static final a b9;

    static {
        HackyDrawerLayout.b9 = new a(null);
    }

    @j
    public HackyDrawerLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public HackyDrawerLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public HackyDrawerLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.g0();
    }

    public HackyDrawerLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout
    public final boolean B(@l View view0) {
        L.p(view0, "child");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type com.dcinside.app.post.view.DrawerLayout.LayoutParams");
        return ((LayoutParams)viewGroup$LayoutParams0).a == 0;
    }

    @RequiresApi(20)
    private final WindowInsets d0(WindowInsets windowInsets0, int v, int v1, int v2, int v3) {
        if(Build.VERSION.SDK_INT >= 29) {
            Insets insets0 = Insets.of(v, v1, v2, v3);
            L.o(insets0, "of(...)");
            WindowInsets windowInsets1 = q0.a(windowInsets0).setSystemWindowInsets(insets0).build();
            L.o(windowInsets1, "build(...)");
            return windowInsets1;
        }
        WindowInsets windowInsets2 = windowInsets0.replaceSystemWindowInsets(v, v1, v2, v3);
        L.o(windowInsets2, "replaceSystemWindowInsets(...)");
        return windowInsets2;
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "ev");
        if(motionEvent0.getPointerCount() > 1 && this.a9) {
            this.requestDisallowInterceptTouchEvent(false);
            boolean z = super.dispatchTouchEvent(motionEvent0);
            this.requestDisallowInterceptTouchEvent(true);
            return z;
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    public final int e0(@l View view0) {
        L.p(view0, "drawerView");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type com.dcinside.app.post.view.DrawerLayout.LayoutParams");
        return Gravity.getAbsoluteGravity(((LayoutParams)viewGroup$LayoutParams0).a, view0.getLayoutDirection());
    }

    @SuppressLint({"RtlHardcoded"})
    public final boolean f0(@l View view0) {
        L.p(view0, "child");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type com.dcinside.app.post.view.DrawerLayout.LayoutParams");
        return (Gravity.getAbsoluteGravity(((LayoutParams)viewGroup$LayoutParams0).a, view0.getLayoutDirection()) & 7) != 0;
    }

    public final void g0() {
        Context context0 = this.getContext();
        try {
            b b0 = this.getRightDragger();
            int v = ViewConfiguration.get(context0).getScaledTouchSlop();
            float f = dl.a.o2();
            b0.W(2.5f - 1.5f * f);
            b0.X(((int)(((float)v) * 2.0f * (1.0f / f))));
            b0.T(0);
        }
        catch(Exception exception0) {
            timber.log.b.a.y(exception0);
        }
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout
    @SuppressLint({"RtlHardcoded"})
    protected void onMeasure(int v, int v1) {
        View view2;
        View view1;
        LayoutParams drawerLayout$LayoutParams1;
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        this.setMeasuredDimension(v4, v5);
        Object object0 = this.getLastInsets();
        int v6 = this.getChildCount();
        boolean z = object0 != null && ViewCompat.Y(this);
        int v7 = ViewCompat.e0(this);
        for(int v8 = 0; v8 < v6; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type com.dcinside.app.post.view.DrawerLayout.LayoutParams");
                LayoutParams drawerLayout$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
                if(z) {
                    int v9 = GravityCompat.d(drawerLayout$LayoutParams0.a, v7);
                    if(ViewCompat.Y(view0)) {
                        L.n(object0, "null cannot be cast to non-null type android.view.WindowInsets");
                        WindowInsets windowInsets0 = (WindowInsets)object0;
                        switch(v9) {
                            case 3: {
                                drawerLayout$LayoutParams1 = drawerLayout$LayoutParams0;
                                view1 = view0;
                                windowInsets0 = this.d0(windowInsets0, windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                                break;
                            }
                            case 5: {
                                drawerLayout$LayoutParams1 = drawerLayout$LayoutParams0;
                                view1 = view0;
                                windowInsets0 = this.d0(windowInsets0, 0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                                break;
                            }
                            default: {
                                drawerLayout$LayoutParams1 = drawerLayout$LayoutParams0;
                                view1 = view0;
                            }
                        }
                        view1.dispatchApplyWindowInsets(windowInsets0);
                        view2 = view1;
                    }
                    else {
                        drawerLayout$LayoutParams1 = drawerLayout$LayoutParams0;
                        L.n(object0, "null cannot be cast to non-null type android.view.WindowInsets");
                        WindowInsets windowInsets1 = (WindowInsets)object0;
                        switch(v9) {
                            case 3: {
                                view2 = view0;
                                windowInsets1 = this.d0(windowInsets1, windowInsets1.getSystemWindowInsetLeft(), windowInsets1.getSystemWindowInsetTop(), 0, windowInsets1.getSystemWindowInsetBottom());
                                break;
                            }
                            case 5: {
                                view2 = view0;
                                windowInsets1 = this.d0(windowInsets1, 0, windowInsets1.getSystemWindowInsetTop(), windowInsets1.getSystemWindowInsetRight(), windowInsets1.getSystemWindowInsetBottom());
                                break;
                            }
                            default: {
                                view2 = view0;
                            }
                        }
                        drawerLayout$LayoutParams1.leftMargin = windowInsets1.getSystemWindowInsetLeft();
                        drawerLayout$LayoutParams1.topMargin = windowInsets1.getSystemWindowInsetTop();
                        drawerLayout$LayoutParams1.rightMargin = windowInsets1.getSystemWindowInsetRight();
                        drawerLayout$LayoutParams1.bottomMargin = windowInsets1.getSystemWindowInsetBottom();
                    }
                }
                else {
                    drawerLayout$LayoutParams1 = drawerLayout$LayoutParams0;
                    view2 = view0;
                }
                L.m(view2);
                if(this.B(view2)) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(v4 - drawerLayout$LayoutParams1.leftMargin - drawerLayout$LayoutParams1.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - drawerLayout$LayoutParams1.topMargin - drawerLayout$LayoutParams1.bottomMargin, 0x40000000));
                }
                else {
                    if(!this.f0(view2)) {
                        throw new IllegalStateException("Child " + view2 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    view2.measure(ViewGroup.getChildMeasureSpec(v, (this.e0(view2) == 0x800003 ? 0x40 : 0) + drawerLayout$LayoutParams1.leftMargin + drawerLayout$LayoutParams1.rightMargin, drawerLayout$LayoutParams1.width), ViewGroup.getChildMeasureSpec(v1, drawerLayout$LayoutParams1.topMargin + drawerLayout$LayoutParams1.bottomMargin, drawerLayout$LayoutParams1.height));
                    continue;
                }
            }
        }
    }

    @Override  // com.dcinside.app.post.view.DrawerLayout
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if(this.a9 != z) {
            this.a9 = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }
}

