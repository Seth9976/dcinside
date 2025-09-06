package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public class i extends g {
    @Override  // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b b0, @NonNull View view0) {
        int v1;
        int v;
        float f;
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        if(b0.r()) {
            f = (float)b0.n();
            v = recyclerView$LayoutParams0.leftMargin;
            v1 = recyclerView$LayoutParams0.rightMargin;
        }
        else {
            f = (float)b0.e();
            v = recyclerView$LayoutParams0.topMargin;
            v1 = recyclerView$LayoutParams0.bottomMargin;
        }
        float f1 = (float)(v + v1);
        a a0 = new a(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f + f1, f), 1, f);
        return h.e(view0.getContext(), f1, f, a0);
    }
}

