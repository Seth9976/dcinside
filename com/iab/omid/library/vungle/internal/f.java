package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.i;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class f {
    private final List a;
    private static final Pattern b;

    static {
        f.b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public f() {
        this.a = new ArrayList();
    }

    public List a() {
        return this.a;
    }

    private void b(View view0) {
        if(view0 == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void c(View view0, i i0, @Nullable String s) {
        this.b(view0);
        this.d(s);
        if(this.e(view0) == null) {
            e e0 = new e(view0, i0, s);
            this.a.add(e0);
        }
    }

    private void d(String s) {
        if(s != null) {
            if(s.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if(!f.b.matcher(s).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private e e(View view0) {
        for(Object object0: this.a) {
            e e0 = (e)object0;
            if(e0.c().get() == view0) {
                return e0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public void f() {
        this.a.clear();
    }

    public void g(View view0) {
        this.b(view0);
        e e0 = this.e(view0);
        if(e0 != null) {
            this.a.remove(e0);
        }
    }
}

