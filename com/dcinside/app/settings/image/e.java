package com.dcinside.app.settings.image;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class e {
    public static final class a extends e {
        @l
        private final Throwable a;

        public a(@l Throwable throwable0) {
            L.p(throwable0, "error");
            super(null);
            this.a = throwable0;
        }

        @l
        public final Throwable a() {
            return this.a;
        }

        @l
        public final a b(@l Throwable throwable0) {
            L.p(throwable0, "error");
            return new a(throwable0);
        }

        public static a c(a e$a0, Throwable throwable0, int v, Object object0) {
            if((v & 1) != 0) {
                throwable0 = e$a0.a;
            }
            return e$a0.b(throwable0);
        }

        @l
        public final Throwable d() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof a ? L.g(this.a, ((a)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Error(error=" + this.a + ")";
        }
    }

    public static final class b extends e {
        @l
        private final d a;

        public b(@l d d0) {
            L.p(d0, "data");
            super(null);
            this.a = d0;
        }

        @l
        public final d a() {
            return this.a;
        }

        @l
        public final b b(@l d d0) {
            L.p(d0, "data");
            return new b(d0);
        }

        public static b c(b e$b0, d d0, int v, Object object0) {
            if((v & 1) != 0) {
                d0 = e$b0.a;
            }
            return e$b0.b(d0);
        }

        @l
        public final d d() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof b ? L.g(this.a, ((b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Success(data=" + this.a + ")";
        }
    }

    private e() {
    }

    public e(w w0) {
    }
}

