package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public class j extends g {
    private int c;
    private static final int[] d;
    private static final int[] e;

    static {
        j.d = new int[]{1};
        j.e = new int[]{0, 1};
    }

    public j() {
        this.c = 0;
    }

    @Override  // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b b0, @NonNull View view0) {
        int v = b0.e();
        if(b0.r()) {
            v = b0.n();
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f1 = (float)(view0.getMeasuredWidth() * 2);
        if(b0.r()) {
            f = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f1 = (float)(view0.getMeasuredHeight() * 2);
        }
        float f2 = this.d() + f;
        float f3 = Math.max(this.c() + f, f2);
        float f4 = Math.min(f1 + f, v);
        float f5 = MathUtils.d(f1 / 3.0f + f, f2 + f, f3 + f);
        float f6 = (f4 + f5) / 2.0f;
        int[] arr_v = ((float)v) < 2.0f * f2 ? new int[]{0} : j.d;
        int v1 = (int)Math.max(1.0, Math.floor((((float)v) - 1.0f * f3) / f4));
        int v2 = ((int)Math.ceil(((float)v) / f4)) - v1 + 1;
        int[] arr_v1 = new int[v2];
        for(int v3 = 0; v3 < v2; ++v3) {
            arr_v1[v3] = v1 + v3;
        }
        int v4 = b0.p() == 1 ? 1 : 0;
        a a0 = a.c(v, f5, f2, f3, (v4 == 0 ? arr_v : g.a(arr_v)), f6, (v4 == 0 ? j.e : g.a(j.e)), f4, arr_v1);
        this.c = a0.e();
        if(a0.e() > b0.getItemCount()) {
            a0 = a.c(v, f5, f2, f3, arr_v, f6, j.e, f4, arr_v1);
            return h.d(view0.getContext(), f, ((float)v), a0, 0);
        }
        return h.d(view0.getContext(), f, ((float)v), a0, v4);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.material.carousel.g
    boolean j(@NonNull b b0, int v) {
        return b0.p() == 1 && (v < this.c && b0.getItemCount() >= this.c || v >= this.c && b0.getItemCount() < this.c);
    }
}

