package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.d;
import java.util.ArrayList;
import java.util.List;

public class a {
    static final class com.bumptech.glide.provider.a.a {
        private final Class a;
        final d b;

        com.bumptech.glide.provider.a.a(@NonNull Class class0, @NonNull d d0) {
            this.a = class0;
            this.b = d0;
        }

        boolean a(@NonNull Class class0) {
            return this.a.isAssignableFrom(class0);
        }
    }

    private final List a;

    public a() {
        this.a = new ArrayList();
    }

    public void a(@NonNull Class class0, @NonNull d d0) {
        synchronized(this) {
            com.bumptech.glide.provider.a.a a$a0 = new com.bumptech.glide.provider.a.a(class0, d0);
            this.a.add(a$a0);
        }
    }

    @Nullable
    public d b(@NonNull Class class0) {
        synchronized(this) {
            for(Object object0: this.a) {
                com.bumptech.glide.provider.a.a a$a0 = (com.bumptech.glide.provider.a.a)object0;
                if(a$a0.a(class0)) {
                    return a$a0.b;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    public void c(@NonNull Class class0, @NonNull d d0) {
        synchronized(this) {
            com.bumptech.glide.provider.a.a a$a0 = new com.bumptech.glide.provider.a.a(class0, d0);
            this.a.add(0, a$a0);
        }
    }
}

