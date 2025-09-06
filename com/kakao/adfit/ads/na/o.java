package com.kakao.adfit.ads.na;

import android.widget.TextView;
import com.kakao.adfit.e.k;
import kotlin.jvm.internal.L;

public final class o extends k {
    public o(TextView textView0, e m$e0) {
        L.p(textView0, "view");
        String s;
        super();
        if(m$e0 == null) {
            s = "";
        }
        else {
            s = m$e0.b();
            if(s == null) {
                s = "";
            }
        }
        textView0.setText(s);
    }

    @Override  // com.kakao.adfit.e.k
    protected void g() {
    }
}

