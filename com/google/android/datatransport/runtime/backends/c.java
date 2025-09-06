package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.a;

final class c extends i {
    private final Context b;
    private final a c;
    private final a d;
    private final String e;

    c(Context context0, a a0, a a1, String s) {
        if(context0 == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.b = context0;
        if(a0 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.c = a0;
        if(a1 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.d = a1;
        if(s == null) {
            throw new NullPointerException("Null backendName");
        }
        this.e = s;
    }

    @Override  // com.google.android.datatransport.runtime.backends.i
    public Context c() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.backends.i
    @NonNull
    public String d() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.runtime.backends.i
    public a e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof i) {
            Context context0 = ((i)object0).c();
            if(this.b.equals(context0)) {
                a a0 = ((i)object0).f();
                if(this.c.equals(a0)) {
                    a a1 = ((i)object0).e();
                    if(this.d.equals(a1)) {
                        String s = ((i)object0).d();
                        return this.e.equals(s);
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.backends.i
    public a f() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public String toString() {
        return "CreationContext{applicationContext=" + this.b + ", wallClock=" + this.c + ", monotonicClock=" + this.d + ", backendName=" + this.e + "}";
    }
}

