package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d {
    private final AtomicReference a;
    private final ArrayMap b;

    public d() {
        this.a = new AtomicReference();
        this.b = new ArrayMap();
    }

    public void a() {
        synchronized(this.b) {
            this.b.clear();
        }
    }

    @Nullable
    public List b(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        List list0;
        l l0 = (l)this.a.getAndSet(null);
        if(l0 == null) {
            l0 = new l(class0, class1, class2);
        }
        else {
            l0.b(class0, class1, class2);
        }
        synchronized(this.b) {
            list0 = (List)this.b.get(l0);
        }
        this.a.set(l0);
        return list0;
    }

    public void c(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2, @NonNull List list0) {
        synchronized(this.b) {
            l l0 = new l(class0, class1, class2);
            this.b.put(l0, list0);
        }
    }
}

