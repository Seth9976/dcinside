package io.realm.internal;

import io.realm.P0;
import io.realm.U0;
import io.realm.h0;
import io.realm.i0;
import y4.m;

@Keep
public interface ObservableMap {
    public static class a implements io.realm.internal.n.a {
        private final i0 a;

        public a(i0 i00) {
            this.a = i00;
        }

        @Override  // io.realm.internal.n$a
        public void a(b n$b0, Object object0) {
            this.b(((io.realm.internal.ObservableMap.b)n$b0), object0);
        }

        public void b(io.realm.internal.ObservableMap.b observableMap$b0, Object object0) {
            observableMap$b0.a(object0, this.a);
        }
    }

    public static class io.realm.internal.ObservableMap.b extends b {
        public io.realm.internal.ObservableMap.b(U0 u00, h0 h00) {
            super(u00, h00);
        }

        public void a(Object object0, i0 i00) {
            ((h0)this.b).a(((U0)object0), i00);
        }
    }

    public static class c implements h0 {
        private final P0 a;

        public c(P0 p00) {
            this.a = p00;
        }

        @Override  // io.realm.h0
        public void a(U0 u00, @m i0 i00) {
            this.a.M(u00);
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof c && this.a == ((c)object0).a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    void notifyChangeListeners(long arg1);
}

