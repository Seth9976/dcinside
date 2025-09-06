package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

interface ViewTypeStorage {
    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        class WrapperViewTypeLookup implements ViewTypeLookup {
            private SparseIntArray a;
            private SparseIntArray b;
            final NestedAdapterWrapper c;
            final IsolatedViewTypeStorage d;

            WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper0) {
                this.a = new SparseIntArray(1);
                this.b = new SparseIntArray(1);
                this.c = nestedAdapterWrapper0;
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public int a(int v) {
                int v1 = this.a.indexOfKey(v);
                if(v1 > -1) {
                    return this.a.valueAt(v1);
                }
                int v2 = IsolatedViewTypeStorage.this.c(this.c);
                this.a.put(v, v2);
                this.b.put(v2, v);
                return v2;
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public int b(int v) {
                int v1 = this.b.indexOfKey(v);
                if(v1 < 0) {
                    throw new IllegalStateException("requested global type " + v + " does not belong to the adapter:" + this.c.c);
                }
                return this.b.valueAt(v1);
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.d(this.c);
            }
        }

        SparseArray a;
        int b;

        public IsolatedViewTypeStorage() {
            this.a = new SparseArray();
            this.b = 0;
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper a(int v) {
            NestedAdapterWrapper nestedAdapterWrapper0 = (NestedAdapterWrapper)this.a.get(v);
            if(nestedAdapterWrapper0 == null) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + v);
            }
            return nestedAdapterWrapper0;
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup b(@NonNull NestedAdapterWrapper nestedAdapterWrapper0) {
            return new WrapperViewTypeLookup(this, nestedAdapterWrapper0);
        }

        int c(NestedAdapterWrapper nestedAdapterWrapper0) {
            int v = this.b;
            this.b = v + 1;
            this.a.put(v, nestedAdapterWrapper0);
            return v;
        }

        void d(@NonNull NestedAdapterWrapper nestedAdapterWrapper0) {
            for(int v = this.a.size() - 1; v >= 0; --v) {
                if(((NestedAdapterWrapper)this.a.valueAt(v)) == nestedAdapterWrapper0) {
                    this.a.removeAt(v);
                }
            }
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        class androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper a;
            final SharedIdRangeViewTypeStorage b;

            androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper0) {
                this.a = nestedAdapterWrapper0;
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public int a(int v) {
                List list0 = (List)SharedIdRangeViewTypeStorage.this.a.get(v);
                if(list0 == null) {
                    list0 = new ArrayList();
                    SharedIdRangeViewTypeStorage.this.a.put(v, list0);
                }
                if(!list0.contains(this.a)) {
                    list0.add(this.a);
                }
                return v;
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public int b(int v) {
                return v;
            }

            @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.c(this.a);
            }
        }

        SparseArray a;

        public SharedIdRangeViewTypeStorage() {
            this.a = new SparseArray();
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public NestedAdapterWrapper a(int v) {
            List list0 = (List)this.a.get(v);
            if(list0 == null || list0.isEmpty()) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + v);
            }
            return (NestedAdapterWrapper)list0.get(0);
        }

        @Override  // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup b(@NonNull NestedAdapterWrapper nestedAdapterWrapper0) {
            return new androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage.WrapperViewTypeLookup(this, nestedAdapterWrapper0);
        }

        void c(@NonNull NestedAdapterWrapper nestedAdapterWrapper0) {
            for(int v = this.a.size() - 1; v >= 0; --v) {
                List list0 = (List)this.a.valueAt(v);
                if(list0.remove(nestedAdapterWrapper0) && list0.isEmpty()) {
                    this.a.removeAt(v);
                }
            }
        }
    }

    public interface ViewTypeLookup {
        int a(int arg1);

        int b(int arg1);

        void dispose();
    }

    @NonNull
    NestedAdapterWrapper a(int arg1);

    @NonNull
    ViewTypeLookup b(@NonNull NestedAdapterWrapper arg1);
}

