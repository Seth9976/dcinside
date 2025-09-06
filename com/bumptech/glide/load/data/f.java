package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.m;
import java.util.HashMap;
import java.util.Map;

public class f {
    class a implements com.bumptech.glide.load.data.e.a {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override  // com.bumptech.glide.load.data.e$a
        @NonNull
        public e b(@NonNull Object object0) {
            return new b(object0);
        }
    }

    static final class b implements e {
        private final Object a;

        b(@NonNull Object object0) {
            this.a = object0;
        }

        @Override  // com.bumptech.glide.load.data.e
        @NonNull
        public Object a() {
            return this.a;
        }

        @Override  // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    private final Map a;
    private static final com.bumptech.glide.load.data.e.a b;

    static {
        f.b = new a();
    }

    public f() {
        this.a = new HashMap();
    }

    @NonNull
    public e a(@NonNull Object object0) {
        synchronized(this) {
            m.e(object0);
            Class class0 = object0.getClass();
            com.bumptech.glide.load.data.e.a e$a0 = (com.bumptech.glide.load.data.e.a)this.a.get(class0);
            if(e$a0 == null) {
                for(Object object1: this.a.values()) {
                    com.bumptech.glide.load.data.e.a e$a1 = (com.bumptech.glide.load.data.e.a)object1;
                    if(e$a1.a().isAssignableFrom(object0.getClass())) {
                        e$a0 = e$a1;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(e$a0 == null) {
                e$a0 = f.b;
            }
            return e$a0.b(object0);
        }
    }

    public void b(@NonNull com.bumptech.glide.load.data.e.a e$a0) {
        synchronized(this) {
            Class class0 = e$a0.a();
            this.a.put(class0, e$a0);
        }
    }
}

