package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;

class TileList {
    public static class Tile {
        public final Object[] a;
        public int b;
        public int c;
        Tile d;

        Tile(@NonNull Class class0, int v) {
            this.a = (Object[])Array.newInstance(class0, v);
        }

        boolean a(int v) {
            return this.b <= v && v < this.b + this.c;
        }

        Object b(int v) {
            return this.a[v - this.b];
        }
    }

    final int a;
    private final SparseArray b;
    Tile c;

    public TileList(int v) {
        this.b = new SparseArray(10);
        this.a = v;
    }

    public Tile a(Tile tileList$Tile0) {
        int v = this.b.indexOfKey(tileList$Tile0.b);
        if(v < 0) {
            this.b.put(tileList$Tile0.b, tileList$Tile0);
            return null;
        }
        Tile tileList$Tile1 = (Tile)this.b.valueAt(v);
        this.b.setValueAt(v, tileList$Tile0);
        if(this.c == tileList$Tile1) {
            this.c = tileList$Tile0;
        }
        return tileList$Tile1;
    }

    public void b() {
        this.b.clear();
    }

    public Tile c(int v) {
        return v < 0 || v >= this.b.size() ? null : ((Tile)this.b.valueAt(v));
    }

    public Object d(int v) {
        if(this.c == null || !this.c.a(v)) {
            int v1 = this.b.indexOfKey(v - v % this.a);
            if(v1 < 0) {
                return null;
            }
            this.c = (Tile)this.b.valueAt(v1);
        }
        return this.c.b(v);
    }

    public Tile e(int v) {
        Tile tileList$Tile0 = (Tile)this.b.get(v);
        if(this.c == tileList$Tile0) {
            this.c = null;
        }
        this.b.delete(v);
        return tileList$Tile0;
    }

    public int f() {
        return this.b.size();
    }
}

