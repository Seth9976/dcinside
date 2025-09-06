package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class f {
    static final class a {
        final Class a;
        final Class b;
        final e c;

        a(@NonNull Class class0, @NonNull Class class1, @NonNull e e0) {
            this.a = class0;
            this.b = class1;
            this.c = e0;
        }

        // 去混淆评级： 低(20)
        public boolean a(@NonNull Class class0, @NonNull Class class1) {
            return this.a.isAssignableFrom(class0) && class1.isAssignableFrom(this.b);
        }
    }

    private final List a;

    public f() {
        this.a = new ArrayList();
    }

    @NonNull
    public e a(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            if(class1.isAssignableFrom(class0)) {
                return g.b();
            }
            for(Object object0: this.a) {
                a f$a0 = (a)object0;
                if(f$a0.a(class0, class1)) {
                    return f$a0.c;
                }
                if(false) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + class0 + " to " + class1);
    }

    @NonNull
    public List b(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            List list0 = new ArrayList();
            if(class1.isAssignableFrom(class0)) {
                list0.add(class1);
                return list0;
            }
            for(Object object0: this.a) {
                a f$a0 = (a)object0;
                if(f$a0.a(class0, class1) && !list0.contains(f$a0.b)) {
                    list0.add(f$a0.b);
                }
            }
            return list0;
        }
    }

    public void c(@NonNull Class class0, @NonNull Class class1, @NonNull e e0) {
        synchronized(this) {
            a f$a0 = new a(class0, class1, e0);
            this.a.add(f$a0);
        }
    }
}

