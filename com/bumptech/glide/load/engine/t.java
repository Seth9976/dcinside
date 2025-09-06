package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.j;
import com.bumptech.glide.util.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t {
    private final Class a;
    private final Pool b;
    private final List c;
    private final String d;

    public t(Class class0, Class class1, Class class2, List list0, Pool pools$Pool0) {
        this.a = class0;
        this.b = pools$Pool0;
        this.c = (List)m.d(list0);
        this.d = "Failed LoadPath{" + class0.getSimpleName() + "->" + class1.getSimpleName() + "->" + class2.getSimpleName() + "}";
    }

    public Class a() {
        return this.a;
    }

    public v b(e e0, @NonNull j j0, int v, int v1, a i$a0) throws q {
        List list0 = (List)m.e(this.b.b());
        try {
            return this.c(e0, j0, v, v1, i$a0, list0);
        }
        finally {
            this.b.a(list0);
        }
    }

    private v c(e e0, @NonNull j j0, int v, int v1, a i$a0, List list0) throws q {
        int v2 = this.c.size();
        v v3 = null;
        for(int v4 = 0; v4 < v2; ++v4) {
            i i0 = (i)this.c.get(v4);
            try {
                v3 = i0.a(e0, v, v1, j0, i$a0);
            }
            catch(q q0) {
                list0.add(q0);
            }
            if(v3 != null) {
                break;
            }
        }
        if(v3 != null) {
            return v3;
        }
        ArrayList arrayList0 = new ArrayList(list0);
        throw new q(this.d, arrayList0);
    }

    @Override
    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
    }
}

