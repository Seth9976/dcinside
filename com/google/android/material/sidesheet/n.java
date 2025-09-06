package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;

public class n extends g {
    private static final int p;
    private static final int q;

    static {
        n.p = attr.sideSheetDialogTheme;
        n.q = style.Theme_Material3_Light_SideSheetDialog;
    }

    public n(@NonNull Context context0) {
        this(context0, 0);
    }

    public n(@NonNull Context context0, @StyleRes int v) {
        super(context0, v, n.p, n.q);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void B(boolean z) {
        super.B(z);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void C(@GravityInt int v) {
        super.C(v);
    }

    @NonNull
    public SideSheetBehavior G() {
        c c0 = super.o();
        if(!(c0 instanceof SideSheetBehavior)) {
            throw new IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior)c0;
    }

    @Override  // com.google.android.material.sidesheet.g
    public void cancel() {
        super.cancel();
    }

    @Override  // com.google.android.material.sidesheet.g
    void m(c c0) {
        class a extends m {
            final n a;

            @Override  // com.google.android.material.sidesheet.m
            public void a(@NonNull View view0, int v) {
                if(v == 5) {
                    n.this.cancel();
                }
            }

            @Override  // com.google.android.material.sidesheet.m
            public void b(@NonNull View view0, float f) {
            }
        }

        c0.a(new a(this));
    }

    @Override  // com.google.android.material.sidesheet.g
    @NonNull
    public c o() {
        return this.G();
    }

    @Override  // com.google.android.material.sidesheet.g
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // com.google.android.material.sidesheet.g
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override  // com.google.android.material.sidesheet.g
    @NonNull
    c p(@NonNull FrameLayout frameLayout0) {
        return SideSheetBehavior.j0(frameLayout0);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void setContentView(@LayoutRes int v) {
        super.setContentView(v);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void setContentView(@Nullable View view0) {
        super.setContentView(view0);
    }

    @Override  // com.google.android.material.sidesheet.g
    public void setContentView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // com.google.android.material.sidesheet.g
    @IdRes
    int t() {
        return id.m3_side_sheet;
    }

    @Override  // com.google.android.material.sidesheet.g
    @LayoutRes
    int u() {
        return layout.m3_side_sheet_dialog;
    }

    @Override  // com.google.android.material.sidesheet.g
    int w() {
        return 3;
    }

    @Override  // com.google.android.material.sidesheet.g
    public boolean y() {
        return super.y();
    }
}

