package io.realm.internal;

import io.realm.i1;
import io.realm.k1;
import io.realm.l1;

@Keep
public interface ObservableSet {
    public static class a implements io.realm.internal.n.a {
        private final l1 a;

        public a(l1 l10) {
            this.a = l10;
        }

        @Override  // io.realm.internal.n$a
        public void a(b n$b0, Object object0) {
            this.b(((io.realm.internal.ObservableSet.b)n$b0), object0);
        }

        public void b(io.realm.internal.ObservableSet.b observableSet$b0, Object object0) {
            observableSet$b0.a(object0, this.a);
        }
    }

    public static class io.realm.internal.ObservableSet.b extends b {
        public io.realm.internal.ObservableSet.b(i1 i10, Object object0) {
            super(i10, object0);
        }

        public void a(Object object0, l1 l10) {
            ((k1)this.b).a(((i1)object0), l10);
        }
    }

    void notifyChangeListeners(long arg1);
}

