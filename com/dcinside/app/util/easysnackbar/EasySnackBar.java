package com.dcinside.app.util.easysnackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class EasySnackBar extends d {
    @RestrictTo({Scope.b})
    public static final class SnackBarLayout extends r {
        public SnackBarLayout(Context context0) {
            super(context0);
        }

        public SnackBarLayout(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }

        @Override  // android.widget.FrameLayout
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
    }

    public static class a extends l {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;

        @Override  // com.dcinside.app.util.easysnackbar.d$l
        public void a(Object object0, int v) {
        }

        @Override  // com.dcinside.app.util.easysnackbar.d$l
        public void b(Object object0) {
        }

        public void c(EasySnackBar easySnackBar0, int v) {
        }

        public void d(EasySnackBar easySnackBar0) {
        }
    }

    private l s;
    public static final int t = -2;
    public static final int u = -1;
    public static final int v;

    private EasySnackBar(ViewGroup viewGroup0, View view0, n d$n0, boolean z) {
        super(viewGroup0, view0, d$n0, z);
    }

    public static View C(@NonNull View view0, @LayoutRes int v) {
        ViewGroup viewGroup0 = EasySnackBar.D(view0);
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        try {
            View view1 = layoutInflater0.inflate(v, viewGroup0, false);
            return view1 == null ? layoutInflater0.inflate(0x7F0E012A, viewGroup0, false) : view1;  // layout:layout_custom
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return layoutInflater0.inflate(0x7F0E012A, viewGroup0, false);  // layout:layout_custom
        }
    }

    private static ViewGroup D(View view0) {
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

    // 检测为 Lambda 实现
    private void E(View.OnClickListener view$OnClickListener0, View view0) [...]

    @NonNull
    public static EasySnackBar F(@NonNull View view0, @LayoutRes int v, int v1, boolean z) {
        return EasySnackBar.G(view0, EasySnackBar.C(view0, v), v1, z);
    }

    @NonNull
    public static EasySnackBar G(@NonNull View view0, @NonNull View view1, int v, boolean z) {
        ViewGroup viewGroup0 = EasySnackBar.D(view0);
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        CustomContentLayout customContentLayout0 = (CustomContentLayout)LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E012B, viewGroup0, false);  // layout:layout_custom_snack_bar
        customContentLayout0.addView(view1);
        EasySnackBar easySnackBar0 = new EasySnackBar(viewGroup0, customContentLayout0, customContentLayout0, z);
        easySnackBar0.x(v);
        return easySnackBar0;
    }

    @NonNull
    public EasySnackBar H(@StringRes int v, View.OnClickListener view$OnClickListener0) {
        return this.I(this.l().getText(v), view$OnClickListener0);
    }

    @NonNull
    public EasySnackBar I(CharSequence charSequence0, View.OnClickListener view$OnClickListener0) {
        Button button0 = ((SnackbarContentLayout)this.d.getChildAt(0)).getActionView();
        if(!TextUtils.isEmpty(charSequence0) && view$OnClickListener0 != null) {
            button0.setVisibility(0);
            button0.setText(charSequence0);
            button0.setOnClickListener((View view0) -> {
                view$OnClickListener0.onClick(view0);
                this.k(1);
            });
            return this;
        }
        button0.setVisibility(8);
        button0.setOnClickListener(null);
        return this;
    }

    @NonNull
    public EasySnackBar J(@ColorInt int v) {
        ((SnackbarContentLayout)this.d.getChildAt(0)).getActionView().setTextColor(v);
        return this;
    }

    @NonNull
    public EasySnackBar K(ColorStateList colorStateList0) {
        ((SnackbarContentLayout)this.d.getChildAt(0)).getActionView().setTextColor(colorStateList0);
        return this;
    }

    @NonNull
    @Deprecated
    public EasySnackBar L(a easySnackBar$a0) {
        l d$l0 = this.s;
        if(d$l0 != null) {
            this.w(d$l0);
        }
        if(easySnackBar$a0 != null) {
            this.e(easySnackBar$a0);
        }
        this.s = easySnackBar$a0;
        return this;
    }
}

