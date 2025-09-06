package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.model.h;
import com.bumptech.glide.load.model.i;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class a implements o {
    private final o a;
    @Nullable
    private final n b;

    protected a(o o0) {
        this(o0, null);
    }

    protected a(o o0, @Nullable n n0) {
        this.a = o0;
        this.b = n0;
    }

    @Override  // com.bumptech.glide.load.model.o
    @Nullable
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull j j0) {
        h h0 = this.b == null ? null : ((h)this.b.b(object0, v, v1));
        if(h0 == null) {
            String s = this.f(object0, v, v1, j0);
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            h h1 = new h(s, this.e(object0, v, v1, j0));
            n n0 = this.b;
            if(n0 != null) {
                n0.c(object0, v, v1, h1);
            }
            h0 = h1;
        }
        List list0 = this.d(object0, v, v1, j0);
        com.bumptech.glide.load.model.o.a o$a0 = this.a.a(h0, v, v1, j0);
        if(o$a0 != null && !list0.isEmpty()) {
            List list1 = a.c(list0);
            return new com.bumptech.glide.load.model.o.a(o$a0.a, list1, o$a0.c);
        }
        return o$a0;
    }

    private static List c(Collection collection0) {
        List list0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            list0.add(new h(((String)object0)));
        }
        return list0;
    }

    protected List d(Object object0, int v, int v1, j j0) {
        return Collections.emptyList();
    }

    @Nullable
    protected i e(Object object0, int v, int v1, j j0) {
        return i.b;
    }

    protected abstract String f(Object arg1, int arg2, int arg3, j arg4);
}

