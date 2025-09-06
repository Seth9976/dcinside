package com.dcinside.app.view.tool;

import android.annotation.SuppressLint;
import android.content.Context;
import com.dcinside.app.rx.bus.Z;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.view.HackyDrawerLayout;
import kotlin.jvm.internal.L;
import y4.l;

public final class i extends a {
    @Override  // com.dcinside.app.view.tool.a
    @SuppressLint({"RtlHardcoded"})
    public void a(@l HackyDrawerLayout hackyDrawerLayout0, boolean z) {
        L.p(hackyDrawerLayout0, "drawer");
        if(z) {
            hackyDrawerLayout0.V(1, 5);
            hackyDrawerLayout0.requestDisallowInterceptTouchEvent(true);
            return;
        }
        hackyDrawerLayout0.requestDisallowInterceptTouchEvent(false);
        Context context0 = hackyDrawerLayout0.getContext();
        if(context0 != null) {
            c.a(context0, new Z());
        }
    }
}

