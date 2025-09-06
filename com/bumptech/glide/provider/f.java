package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.m;
import java.util.ArrayList;
import java.util.List;

public class f {
    static final class a {
        private final Class a;
        final m b;

        a(@NonNull Class class0, @NonNull m m0) {
            this.a = class0;
            this.b = m0;
        }

        boolean a(@NonNull Class class0) {
            return this.a.isAssignableFrom(class0);
        }
    }

    private final List a;

    public f() {
        this.a = new ArrayList();
    }

    public void a(@NonNull Class class0, @NonNull m m0) {
        synchronized(this) {
            a f$a0 = new a(class0, m0);
            this.a.add(f$a0);
        }
    }

    @Nullable
    public m b(@NonNull Class class0) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                a f$a0 = (a)this.a.get(v2);
                if(f$a0.a(class0)) {
                    return f$a0.b;
                }
            }
            return null;
        }
    }

    public void c(@NonNull Class class0, @NonNull m m0) {
        synchronized(this) {
            a f$a0 = new a(class0, m0);
            this.a.add(0, f$a0);
        }
    }
}

