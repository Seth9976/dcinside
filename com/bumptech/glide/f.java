package com.bumptech.glide;

import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public class f {
    static final class a {
        private final Map a;

        a() {
            this.a = new HashMap();
        }

        a b(b f$b0) {
            Class class0 = f$b0.getClass();
            this.a.put(class0, f$b0);
            return this;
        }

        f c() {
            return new f(this);
        }

        a d(b f$b0, boolean z) {
            if(z) {
                this.b(f$b0);
                return this;
            }
            Class class0 = f$b0.getClass();
            this.a.remove(class0);
            return this;
        }
    }

    interface b {
    }

    private final Map a;

    f(a f$a0) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap(f$a0.a));
    }

    @Nullable
    b a(Class class0) {
        return (b)this.a.get(class0);
    }

    public boolean b(Class class0) {
        return this.a.containsKey(class0);
    }
}

