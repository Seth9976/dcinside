package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.d;
import h2.b;
import java.util.HashMap;
import java.util.Map;

public class a {
    @GuardedBy("this")
    private final Map a;
    private final Context b;
    private final b c;

    @VisibleForTesting(otherwise = 3)
    protected a(Context context0, b b0) {
        this.a = new HashMap();
        this.b = context0;
        this.c = b0;
    }

    @VisibleForTesting
    protected d a(String s) {
        return new d(this.b, this.c, s);
    }

    public d b(String s) {
        synchronized(this) {
            if(!this.a.containsKey(s)) {
                d d0 = this.a(s);
                this.a.put(s, d0);
            }
            return (d)this.a.get(s);
        }
    }
}

