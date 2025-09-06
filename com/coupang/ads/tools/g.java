package com.coupang.ads.tools;

import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class g {
    @l
    public static final m a(@l n n0, @y4.m String s, @l ImageView imageView0) {
        L.p(n0, "<this>");
        L.p(imageView0, "imageView");
        if(s == null) {
            m m0 = n0.N(null);
            L.o(m0, "load(string as String?)");
            return m0;
        }
        int v = imageView0.getWidth();
        int v1 = imageView0.getHeight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            int v2 = viewGroup$LayoutParams0.width;
            if(v2 > 0) {
                v = v2;
            }
            int v3 = viewGroup$LayoutParams0.height;
            if(v3 > 0) {
                v1 = v3;
            }
        }
        if(v < 0 || v1 < 0) {
            v = 1200;
            v1 = 1200;
        }
        m m1 = n0.N(v.l2(v.l2(s, "$WIDTH", String.valueOf(v), false, 4, null), "$HEIGHT", String.valueOf(v1), false, 4, null));
        L.o(m1, "load(string.replace(\"\\$W…GHT\", height.toString()))");
        return m1;
    }
}

