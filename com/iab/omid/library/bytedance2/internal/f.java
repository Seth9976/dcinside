package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
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

    private void a(View view0) {
        if(view0 == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void a(String s) {
        if(s != null) {
            if(s.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if(!f.b.matcher(s).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public List a() {
        return this.a;
    }

    public void a(View view0, FriendlyObstructionPurpose friendlyObstructionPurpose0, @Nullable String s) {
        this.a(view0);
        this.a(s);
        if(this.b(view0) == null) {
            e e0 = new e(view0, friendlyObstructionPurpose0, s);
            this.a.add(e0);
        }
    }

    private e b(View view0) {
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

    public void b() {
        this.a.clear();
    }

    public void c(View view0) {
        this.a(view0);
        e e0 = this.b(view0);
        if(e0 != null) {
            this.a.remove(e0);
        }
    }
}

