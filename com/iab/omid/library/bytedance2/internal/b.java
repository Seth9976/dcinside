package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.a;

public class b extends d {
    @SuppressLint({"StaticFieldLeak"})
    private static b d;

    static {
        b.d = new b();
    }

    @Override  // com.iab.omid.library.bytedance2.internal.d
    public void b(boolean z) {
        for(Object object0: c.c().b()) {
            ((a)object0).getAdSessionStatePublisher().a(z);
        }
    }

    @Override  // com.iab.omid.library.bytedance2.internal.d
    public boolean d() {
        for(Object object0: c.c().a()) {
            View view0 = ((a)object0).c();
            if(view0 != null && view0.hasWindowFocus()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static b g() {
        return b.d;
    }
}

