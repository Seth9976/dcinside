package com.bumptech.glide.util;

public final class h {
    public interface b {
        Object get();
    }

    public static b a(b h$b0) {
        class a implements b {
            private volatile Object a;
            final b b;

            a(b h$b0) {
            }

            @Override  // com.bumptech.glide.util.h$b
            public Object get() {
                if(this.a == null) {
                    synchronized(this) {
                        if(this.a == null) {
                            this.a = m.e(this.b.get());
                        }
                    }
                }
                return this.a;
            }
        }

        return new a(h$b0);
    }
}

