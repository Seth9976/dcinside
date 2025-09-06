package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R.attr;
import com.google.android.material.R.layout;

public class Snackbar extends BaseTransientBottomBar {
    @RestrictTo({Scope.b})
    public static final class SnackbarLayout extends w {
        public SnackbarLayout(Context context0) {
            super(context0);
        }

        public SnackbarLayout(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        protected void onMeasure(int v, int v1) {
            super.onMeasure(v, v1);
            int v2 = this.getChildCount();
            int v3 = this.getMeasuredWidth();
            int v4 = this.getPaddingLeft();
            int v5 = this.getPaddingRight();
            for(int v6 = 0; v6 < v2; ++v6) {
                View view0 = this.getChildAt(v6);
                if(view0.getLayoutParams().width == -1) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v4 - v5, 0x40000000), View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0x40000000));
                }
            }
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setBackground(@Nullable Drawable drawable0) {
            super.setBackground(drawable0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setBackgroundDrawable(@Nullable Drawable drawable0) {
            super.setBackgroundDrawable(drawable0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
            super.setBackgroundTintList(colorStateList0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
            super.setBackgroundTintMode(porterDuff$Mode0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super.setLayoutParams(viewGroup$LayoutParams0);
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$w
        public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
            super.setOnClickListener(view$OnClickListener0);
        }
    }

    public static class a extends s {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$s
        public void a(Object object0, int v) {
        }

        @Override  // com.google.android.material.snackbar.BaseTransientBottomBar$s
        public void b(Object object0) {
        }

        public void c(Snackbar snackbar0, int v) {
        }

        public void d(Snackbar snackbar0) {
        }
    }

    @Nullable
    private final AccessibilityManager T;
    private boolean U;
    @Nullable
    private s V;
    private static final int[] W;
    private static final int[] X;

    static {
        Snackbar.W = new int[]{attr.snackbarButtonStyle};
        Snackbar.X = new int[]{attr.snackbarButtonStyle, attr.snackbarTextViewStyle};
    }

    private Snackbar(@NonNull Context context0, @NonNull ViewGroup viewGroup0, @NonNull View view0, @NonNull b b0) {
        super(context0, viewGroup0, view0, b0);
        this.T = (AccessibilityManager)viewGroup0.getContext().getSystemService("accessibility");
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    private static boolean A0(@NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Snackbar.X);
        int v = typedArray0.getResourceId(0, -1);
        int v1 = typedArray0.getResourceId(1, -1);
        typedArray0.recycle();
        return v != -1 && v1 != -1;
    }

    // 检测为 Lambda 实现
    private void B0(View.OnClickListener view$OnClickListener0, View view0) [...]

    @NonNull
    public static Snackbar C0(@NonNull Context context0, @NonNull View view0, @NonNull CharSequence charSequence0, int v) {
        return Snackbar.F0(context0, view0, charSequence0, v);
    }

    @NonNull
    public static Snackbar D0(@NonNull View view0, @StringRes int v, int v1) {
        return Snackbar.E0(view0, view0.getResources().getText(v), v1);
    }

    @NonNull
    public static Snackbar E0(@NonNull View view0, @NonNull CharSequence charSequence0, int v) {
        return Snackbar.F0(null, view0, charSequence0, v);
    }

    @NonNull
    private static Snackbar F0(@Nullable Context context0, @NonNull View view0, @NonNull CharSequence charSequence0, int v) {
        ViewGroup viewGroup0 = Snackbar.v0(view0);
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if(context0 == null) {
            context0 = viewGroup0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout0 = (SnackbarContentLayout)LayoutInflater.from(context0).inflate((Snackbar.A0(context0) ? layout.mtrl_layout_snackbar_include : layout.design_layout_snackbar_include), viewGroup0, false);
        Snackbar snackbar0 = new Snackbar(context0, viewGroup0, snackbarContentLayout0, snackbarContentLayout0);
        snackbar0.Q0(charSequence0);
        snackbar0.h0(v);
        return snackbar0;
    }

    @O1.a
    @NonNull
    public Snackbar G0(@StringRes int v, View.OnClickListener view$OnClickListener0) {
        return this.H0(this.G().getText(v), view$OnClickListener0);
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public int H() {
        int v = super.H();
        if(v == -2) {
            return -2;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            return this.U ? this.T.getRecommendedTimeoutMillis(v, 7) : this.T.getRecommendedTimeoutMillis(v, 3);
        }
        return !this.U || !this.T.isTouchExplorationEnabled() ? v : -2;
    }

    @O1.a
    @NonNull
    public Snackbar H0(@Nullable CharSequence charSequence0, @Nullable View.OnClickListener view$OnClickListener0) {
        Button button0 = this.w0();
        if(!TextUtils.isEmpty(charSequence0) && view$OnClickListener0 != null) {
            this.U = true;
            button0.setVisibility(0);
            button0.setText(charSequence0);
            button0.setOnClickListener((View view0) -> {
                view$OnClickListener0.onClick(view0);
                this.B(1);
            });
            return this;
        }
        button0.setVisibility(8);
        button0.setOnClickListener(null);
        this.U = false;
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar I0(@ColorInt int v) {
        this.w0().setTextColor(v);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar J0(ColorStateList colorStateList0) {
        this.w0().setTextColor(colorStateList0);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar K0(@ColorInt int v) {
        return this.L0(ColorStateList.valueOf(v));
    }

    @O1.a
    @NonNull
    public Snackbar L0(@Nullable ColorStateList colorStateList0) {
        this.i.setBackgroundTintList(colorStateList0);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar M0(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.i.setBackgroundTintMode(porterDuff$Mode0);
        return this;
    }

    @O1.a
    @NonNull
    @Deprecated
    public Snackbar N0(@Nullable a snackbar$a0) {
        s baseTransientBottomBar$s0 = this.V;
        if(baseTransientBottomBar$s0 != null) {
            this.b0(baseTransientBottomBar$s0);
        }
        if(snackbar$a0 != null) {
            this.u(snackbar$a0);
        }
        this.V = snackbar$a0;
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar O0(@Dimension int v) {
        this.x0().setMaxInlineActionWidth(v);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar P0(@StringRes int v) {
        return this.Q0(this.G().getText(v));
    }

    @O1.a
    @NonNull
    public Snackbar Q0(@NonNull CharSequence charSequence0) {
        this.y0().setText(charSequence0);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar R0(@ColorInt int v) {
        this.y0().setTextColor(v);
        return this;
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean S() {
        return super.S();
    }

    @O1.a
    @NonNull
    public Snackbar S0(ColorStateList colorStateList0) {
        this.y0().setTextColor(colorStateList0);
        return this;
    }

    @O1.a
    @NonNull
    public Snackbar T0(int v) {
        this.y0().setMaxLines(v);
        return this;
    }

    @Override  // com.google.android.material.snackbar.BaseTransientBottomBar
    public void m0() {
        super.m0();
    }

    @Nullable
    private static ViewGroup v0(View view0) {
        ViewGroup viewGroup0 = null;
        do {
            if(view0 instanceof CoordinatorLayout) {
                return (ViewGroup)view0;
            }
            if(view0 instanceof FrameLayout) {
                if(view0.getId() == 0x1020002) {
                    return (ViewGroup)view0;
                }
                viewGroup0 = (ViewGroup)view0;
            }
            if(view0 != null) {
                ViewParent viewParent0 = view0.getParent();
                view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            }
        }
        while(view0 != null);
        return viewGroup0;
    }

    private Button w0() {
        return this.x0().getActionView();
    }

    private SnackbarContentLayout x0() {
        return (SnackbarContentLayout)this.i.getChildAt(0);
    }

    private TextView y0() {
        return this.x0().getMessageView();
    }

    @Deprecated
    protected static boolean z0(@NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Snackbar.W);
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v != -1;
    }
}

