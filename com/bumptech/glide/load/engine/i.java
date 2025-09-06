package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.transcode.e;
import com.bumptech.glide.util.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class i {
    interface a {
        @NonNull
        v a(@NonNull v arg1);
    }

    private final Class a;
    private final List b;
    private final e c;
    private final Pool d;
    private final String e;
    private static final String f = "DecodePath";

    public i(Class class0, Class class1, Class class2, List list0, e e0, Pool pools$Pool0) {
        this.a = class0;
        this.b = list0;
        this.c = e0;
        this.d = pools$Pool0;
        this.e = "Failed DecodePath{" + class0.getSimpleName() + "->" + class1.getSimpleName() + "->" + class2.getSimpleName() + "}";
    }

    public v a(com.bumptech.glide.load.data.e e0, int v, int v1, @NonNull j j0, a i$a0) throws q {
        v v2 = i$a0.a(this.b(e0, v, v1, j0));
        return this.c.a(v2, j0);
    }

    @NonNull
    private v b(com.bumptech.glide.load.data.e e0, int v, int v1, @NonNull j j0) throws q {
        List list0 = (List)m.e(this.d.b());
        try {
            return this.c(e0, v, v1, j0, list0);
        }
        finally {
            this.d.a(list0);
        }
    }

    @NonNull
    private v c(com.bumptech.glide.load.data.e e0, int v, int v1, @NonNull j j0, List list0) throws q {
        int v2 = this.b.size();
        v v3 = null;
        for(int v4 = 0; v4 < v2; ++v4) {
            l l0 = (l)this.b.get(v4);
            try {
                if(l0.a(e0.a(), j0)) {
                    v3 = l0.b(e0.a(), v, v1, j0);
                }
            }
            catch(IOException | RuntimeException | OutOfMemoryError iOException0) {
                if(Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + l0, iOException0);
                }
                list0.add(iOException0);
            }
            if(v3 != null) {
                break;
            }
        }
        if(v3 != null) {
            return v3;
        }
        ArrayList arrayList0 = new ArrayList(list0);
        throw new q(this.e, arrayList0);
    }

    @Override
    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}

