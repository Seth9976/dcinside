package com.dcinside.app.view.tool;

import android.annotation.SuppressLint;
import com.dcinside.app.view.HackyDrawerLayout;
import kotlin.jvm.internal.L;
import y4.l;

public final class f extends a {
    @Override  // com.dcinside.app.view.tool.a
    @SuppressLint({"RtlHardcoded"})
    public void a(@l HackyDrawerLayout hackyDrawerLayout0, boolean z) {
        L.p(hackyDrawerLayout0, "drawer");
        if(z) {
            hackyDrawerLayout0.V(2, 3);
            hackyDrawerLayout0.requestDisallowInterceptTouchEvent(true);
            return;
        }
        hackyDrawerLayout0.requestDisallowInterceptTouchEvent(false);
        hackyDrawerLayout0.V(0, 3);
    }
}

