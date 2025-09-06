package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

interface StableIdStorage {
    public static class IsolatedStableIdStorage implements StableIdStorage {
        class WrapperStableIdLookup implements StableIdLookup {
            private final LongSparseArray a;
            final IsolatedStableIdStorage b;

            WrapperStableIdLookup() {
                this.a = new LongSparseArray();
            }

            @Override  // androidx.recyclerview.widget.StableIdStorage$StableIdLookup
            public long a(long v) {
                Long long0 = (Long)this.a.g(v);
                if(long0 == null) {
                    long0 = IsolatedStableIdStorage.this.b();
                    this.a.n(v, long0);
                }
                return (long)long0;
            }
        }

        long a;

        public IsolatedStableIdStorage() {
            this.a = 0L;
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup a() {
            return new WrapperStableIdLookup(this);
        }

        long b() {
            long v = this.a;
            this.a = v + 1L;
            return v;
        }
    }

    public static class NoStableIdStorage implements StableIdStorage {
        private final StableIdLookup a;

        public NoStableIdStorage() {
            this.a = new StableIdLookup() {
                final NoStableIdStorage a;

                @Override  // androidx.recyclerview.widget.StableIdStorage$StableIdLookup
                public long a(long v) {
                    return -1L;
                }
            };
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup a() {
            return this.a;
        }
    }

    public static class SharedPoolStableIdStorage implements StableIdStorage {
        private final StableIdLookup a;

        public SharedPoolStableIdStorage() {
            this.a = new StableIdLookup() {
                final SharedPoolStableIdStorage a;

                @Override  // androidx.recyclerview.widget.StableIdStorage$StableIdLookup
                public long a(long v) {
                    return v;
                }
            };
        }

        @Override  // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup a() {
            return this.a;
        }
    }

    public interface StableIdLookup {
        long a(long arg1);
    }

    @NonNull
    StableIdLookup a();
}

