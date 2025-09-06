package com.iab.omid.library.vungle.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.vungle.adsession.q;

public class b extends d {
    @SuppressLint({"StaticFieldLeak"})
    private static b d;

    static {
        b.d = new b();
    }

    @Override  // com.iab.omid.library.vungle.internal.d
    public void f(boolean z) {
        for(Object object0: c.e().c()) {
            ((q)object0).f().o(z);
        }
    }

    @Override  // com.iab.omid.library.vungle.internal.d
    public boolean h() {
        for(Object object0: c.e().a()) {
            View view0 = ((q)object0).r();
            if(view0 != null && view0.hasWindowFocus()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static b k() {
        return b.d;
    }
}

