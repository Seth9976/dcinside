package com.bykv.vk.openvk.preload.b;

public final class h {
    public static final class a {
        private Class a;
        private com.bykv.vk.openvk.preload.b.b.a b;
        private Object[] c;

        public static a a() {
            return new a();
        }

        public final a a(com.bykv.vk.openvk.preload.b.b.a a0) {
            this.b = a0;
            return this;
        }

        public final a a(Class class0) {
            if(class0 == null) {
                throw new IllegalArgumentException("interceptor class == null");
            }
            this.a = class0;
            return this;
        }

        public final a a(Object[] arr_object) {
            this.c = arr_object;
            return this;
        }

        public final h b() {
            return new h(this, 0);
        }
    }

    Class a;
    private com.bykv.vk.openvk.preload.b.b.a b;
    private Object[] c;

    private h(a h$a0) {
        this.a = h$a0.a;
        this.b = h$a0.b;
        this.c = h$a0.c;
        if(this.a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    h(a h$a0, byte b) {
        this(h$a0);
    }

    final com.bykv.vk.openvk.preload.b.b.a a() {
        return this.b;
    }

    final Object[] b() {
        return this.c;
    }
}

