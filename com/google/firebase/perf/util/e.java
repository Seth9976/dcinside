package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.a;

public final class e {
    private final Bundle a;
    private static final a b;

    static {
        e.b = a.e();
    }

    public e() {
        this(new Bundle());
    }

    public e(Bundle bundle0) {
        this.a = (Bundle)bundle0.clone();
    }

    public boolean a(String s) {
        return s != null && this.a.containsKey(s);
    }

    public f b(String s) {
        if(!this.a(s)) {
            return f.a();
        }
        try {
            return f.b(((Boolean)this.a.get(s)));
        }
        catch(ClassCastException classCastException0) {
            e.b.b("Metadata key %s contains type other than boolean: %s", new Object[]{s, classCastException0.getMessage()});
            return f.a();
        }
    }

    public f c(String s) {
        if(!this.a(s)) {
            return f.a();
        }
        Object object0 = this.a.get(s);
        if(object0 == null) {
            return f.a();
        }
        if(object0 instanceof Float) {
            return f.e(((Float)object0).doubleValue());
        }
        if(object0 instanceof Double) {
            return f.e(((Double)object0));
        }
        e.b.b("Metadata key %s contains type other than double: %s", new Object[]{s});
        return f.a();
    }

    private f d(String s) {
        if(!this.a(s)) {
            return f.a();
        }
        try {
            return f.b(((Integer)this.a.get(s)));
        }
        catch(ClassCastException classCastException0) {
            e.b.b("Metadata key %s contains type other than int: %s", new Object[]{s, classCastException0.getMessage()});
            return f.a();
        }
    }

    public f e(String s) {
        f f0 = this.d(s);
        return f0.d() ? f.e(((long)(((int)(((Integer)f0.c())))))) : f.a();
    }
}

