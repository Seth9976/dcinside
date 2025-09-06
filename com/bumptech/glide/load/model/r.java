package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class r implements o {
    static class a implements com.bumptech.glide.load.data.d.a, d {
        private final List a;
        private final Pool b;
        private int c;
        private j d;
        private com.bumptech.glide.load.data.d.a e;
        @Nullable
        private List f;
        private boolean g;

        a(@NonNull List list0, @NonNull Pool pools$Pool0) {
            this.b = pools$Pool0;
            m.d(list0);
            this.a = list0;
            this.c = 0;
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public Class a() {
            return ((d)this.a.get(0)).a();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void b() {
            List list0 = this.f;
            if(list0 != null) {
                this.b.a(list0);
            }
            this.f = null;
            for(Object object0: this.a) {
                ((d)object0).b();
            }
        }

        @Override  // com.bumptech.glide.load.data.d
        @NonNull
        public com.bumptech.glide.load.a c() {
            return ((d)this.a.get(0)).c();
        }

        @Override  // com.bumptech.glide.load.data.d
        public void cancel() {
            this.g = true;
            for(Object object0: this.a) {
                ((d)object0).cancel();
            }
        }

        @Override  // com.bumptech.glide.load.data.d
        public void d(@NonNull j j0, @NonNull com.bumptech.glide.load.data.d.a d$a0) {
            this.d = j0;
            this.e = d$a0;
            this.f = (List)this.b.b();
            ((d)this.a.get(this.c)).d(j0, this);
            if(this.g) {
                this.cancel();
            }
        }

        @Override  // com.bumptech.glide.load.data.d$a
        public void e(@Nullable Object object0) {
            if(object0 != null) {
                this.e.e(object0);
                return;
            }
            this.g();
        }

        @Override  // com.bumptech.glide.load.data.d$a
        public void f(@NonNull Exception exception0) {
            ((List)m.e(this.f)).add(exception0);
            this.g();
        }

        private void g() {
            if(this.g) {
                return;
            }
            if(this.c < this.a.size() - 1) {
                ++this.c;
                this.d(this.d, this.e);
                return;
            }
            m.e(this.f);
            this.e.f(new q("Fetch failed", new ArrayList(this.f)));
        }
    }

    private final List a;
    private final Pool b;

    r(@NonNull List list0, @NonNull Pool pools$Pool0) {
        this.a = list0;
        this.b = pools$Pool0;
    }

    @Override  // com.bumptech.glide.load.model.o
    public com.bumptech.glide.load.model.o.a a(@NonNull Object object0, int v, int v1, @NonNull com.bumptech.glide.load.j j0) {
        int v2 = this.a.size();
        ArrayList arrayList0 = new ArrayList(v2);
        g g0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            o o0 = (o)this.a.get(v3);
            if(o0.b(object0)) {
                com.bumptech.glide.load.model.o.a o$a0 = o0.a(object0, v, v1, j0);
                if(o$a0 != null) {
                    g0 = o$a0.a;
                    arrayList0.add(o$a0.c);
                }
            }
        }
        return arrayList0.isEmpty() || g0 == null ? null : new com.bumptech.glide.load.model.o.a(g0, new a(arrayList0, this.b));
    }

    @Override  // com.bumptech.glide.load.model.o
    public boolean b(@NonNull Object object0) {
        for(Object object1: this.a) {
            if(((o)object1).b(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}

