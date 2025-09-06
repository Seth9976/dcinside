package io.realm.internal;

import io.realm.P0;
import io.realm.v0;
import io.realm.w0;
import o3.h;

@Keep
public interface ObservableCollection {
    public static class a implements io.realm.internal.n.a {
        private final OsCollectionChangeSet a;

        a(OsCollectionChangeSet osCollectionChangeSet0) {
            this.a = osCollectionChangeSet0;
        }

        @Override  // io.realm.internal.n$a
        public void a(b n$b0, Object object0) {
            this.b(((io.realm.internal.ObservableCollection.b)n$b0), object0);
        }

        public void b(io.realm.internal.ObservableCollection.b observableCollection$b0, Object object0) {
            observableCollection$b0.a(object0, this.a);
        }
    }

    public static class io.realm.internal.ObservableCollection.b extends b {
        io.realm.internal.ObservableCollection.b(Object object0, Object object1) {
            super(object0, object1);
        }

        public void a(Object object0, OsCollectionChangeSet osCollectionChangeSet0) {
            Object object1 = this.b;
            if(object1 instanceof w0) {
                ((w0)object1).a(object0, new v(osCollectionChangeSet0));
                return;
            }
            if(!(object1 instanceof P0)) {
                throw new RuntimeException("Unsupported listener type: " + this.b);
            }
            ((P0)object1).M(object0);
        }
    }

    public static class c implements w0 {
        private final P0 a;

        public c(P0 p00) {
            this.a = p00;
        }

        @Override  // io.realm.w0
        public void a(Object object0, @h v0 v00) {
            this.a.M(object0);
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

