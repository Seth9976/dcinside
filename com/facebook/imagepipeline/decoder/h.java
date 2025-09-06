package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.q;
import com.facebook.imagepipeline.image.r;
import java.util.Collections;
import java.util.List;
import k1.n.a;
import k1.n;

@n(a.a)
public class h implements f {
    static class com.facebook.imagepipeline.decoder.h.a implements b {
        private com.facebook.imagepipeline.decoder.h.a() {
        }

        com.facebook.imagepipeline.decoder.h.a(i i0) {
        }

        @Override  // com.facebook.imagepipeline.decoder.h$b
        public List a() {
            return Collections.EMPTY_LIST;
        }

        @Override  // com.facebook.imagepipeline.decoder.h$b
        public int b() {
            return 0;
        }
    }

    public interface b {
        List a();

        int b();
    }

    private final b a;

    public h() {
        this(new com.facebook.imagepipeline.decoder.h.a(null));
    }

    public h(b h$b0) {
        this.a = (b)com.facebook.common.internal.n.i(h$b0);
    }

    @Override  // com.facebook.imagepipeline.decoder.f
    public int a(int v) {
        List list0 = this.a.a();
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                if(((int)(((Integer)list0.get(v1)))) > v) {
                    return (int)(((Integer)list0.get(v1)));
                }
            }
            return 0x7FFFFFFF;
        }
        return v + 1;
    }

    @Override  // com.facebook.imagepipeline.decoder.f
    public r b(int v) {
        return v < this.a.b() ? q.d(v, false, false) : q.d(v, true, false);
    }

    @Override  // com.facebook.imagepipeline.decoder.f
    public boolean c() {
        return true;
    }
}

