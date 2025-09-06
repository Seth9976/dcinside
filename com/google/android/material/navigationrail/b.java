package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.d;
import com.google.android.material.navigation.f;

@RestrictTo({Scope.b})
public class b extends f {
    @Px
    private int J;
    private final FrameLayout.LayoutParams K;

    public b(@NonNull Context context0) {
        super(context0);
        this.J = -1;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        this.K = frameLayout$LayoutParams0;
        frameLayout$LayoutParams0.gravity = 49;
        this.setLayoutParams(frameLayout$LayoutParams0);
        this.setItemActiveIndicatorResizeable(true);
    }

    @Override  // com.google.android.material.navigation.f
    @NonNull
    protected d g(@NonNull Context context0) {
        return new a(context0);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.J;
    }

    int getMenuGravity() {
        return this.K.gravity;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = this.getChildAt(v5);
            if(view0.getVisibility() != 8) {
                int v7 = view0.getMeasuredHeight() + v6;
                view0.layout(0, v6, v2 - v, v7);
                v6 = v7;
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getSize(v1);
        int v3 = this.getMenu().H().size();
        int v4 = v3 <= 1 || !this.l(this.getLabelVisibilityMode(), v3) ? this.x(v, v2, v3, null) : this.y(v, v2, v3);
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.resolveSizeAndState(v4, v1, 0));
    }

    public void setItemMinimumHeight(@Px int v) {
        if(this.J != v) {
            this.J = v;
            this.requestLayout();
        }
    }

    void setMenuGravity(int v) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = this.K;
        if(frameLayout$LayoutParams0.gravity != v) {
            frameLayout$LayoutParams0.gravity = v;
            this.setLayoutParams(frameLayout$LayoutParams0);
        }
    }

    boolean u() {
        return (this.K.gravity & 0x70) == 0x30;
    }

    private int v(int v, int v1, int v2) {
        return View.MeasureSpec.makeMeasureSpec(Math.min((this.J == -1 ? View.MeasureSpec.getSize(v) : this.J), v1 / Math.max(1, v2)), 0);
    }

    private int w(View view0, int v, int v1) {
        if(view0.getVisibility() != 8) {
            view0.measure(v, v1);
            return view0.getMeasuredHeight();
        }
        return 0;
    }

    private int x(int v, int v1, int v2, View view0) {
        int v4 = view0 == null ? this.v(v, v1, v2) : View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0);
        int v5 = this.getChildCount();
        int v6 = 0;
        for(int v3 = 0; v3 < v5; ++v3) {
            View view1 = this.getChildAt(v3);
            if(view1 != view0) {
                v6 += this.w(view1, v, v4);
            }
        }
        return v6;
    }

    private int y(int v, int v1, int v2) {
        View view0 = this.getChildAt(this.getSelectedItemPosition());
        if(view0 != null) {
            int v3 = this.w(view0, v, this.v(v, v1, v2));
            return v3 + this.x(v, v1 - v3, v2 - 1, view0);
        }
        return this.x(v, v1, v2, null);
    }
}

