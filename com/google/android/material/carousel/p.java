package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public final class p extends g {
    private int c;
    private static final int[] d;
    private static final int[] e;

    static {
        p.d = new int[]{1};
        p.e = new int[]{1, 0};
    }

    public p() {
        this.c = 0;
    }

    @Override  // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b b0, @NonNull View view0) {
        float f = (float)b0.e();
        if(b0.r()) {
            f = (float)b0.n();
        }
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f1 = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f2 = (float)view0.getMeasuredHeight();
        if(b0.r()) {
            f1 = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f2 = (float)view0.getMeasuredWidth();
        }
        float f3 = this.d() + f1;
        float f4 = Math.max(this.c() + f1, f3);
        float f5 = Math.min(f2 + f1, f);
        float f6 = MathUtils.d(f2 / 3.0f + f1, f3 + f1, f4 + f1);
        float f7 = (f5 + f6) / 2.0f;
        int[] arr_v = p.d;
        if(f < 2.0f * f3) {
            arr_v = new int[]{0};
        }
        int[] arr_v1 = p.e;
        if(b0.p() == 1) {
            arr_v = g.a(arr_v);
            arr_v1 = g.a(arr_v1);
        }
        double f8 = Math.floor((f - ((float)h.i(arr_v1)) * f7 - ((float)h.i(arr_v)) * f4) / f5);
        int v1 = (int)Math.ceil(f / f5);
        int v2 = v1 - ((int)Math.max(1.0, f8)) + 1;
        int[] arr_v2 = new int[v2];
        for(int v = 0; v < v2; ++v) {
            arr_v2[v] = v1 - v;
        }
        a a0 = a.c(f, f6, f3, f4, arr_v, f7, arr_v1, f5, arr_v2);
        this.c = a0.e();
        if(this.k(a0, b0.getItemCount())) {
            a0 = a.c(f, f6, f3, f4, new int[]{a0.c}, f7, new int[]{a0.d}, f5, new int[]{a0.g});
        }
        return h.d(view0.getContext(), f1, f, a0, b0.p());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.carousel.g
    boolean j(b b0, int v) {
        return v < this.c && b0.getItemCount() >= this.c || v >= this.c && b0.getItemCount() < this.c;
    }

    boolean k(a a0, int v) {
        int v1 = a0.e() - v;
        boolean z = v1 > 0 && (a0.c > 0 || a0.d > 1);
        while(v1 > 0) {
            int v2 = a0.c;
            if(v2 > 0) {
                a0.c = v2 - 1;
            }
            else {
                int v3 = a0.d;
                if(v3 > 1) {
                    a0.d = v3 - 1;
                }
            }
            --v1;
        }
        return z;
    }
}

