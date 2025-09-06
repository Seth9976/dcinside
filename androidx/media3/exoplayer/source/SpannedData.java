package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;

final class SpannedData {
    private int a;
    private final SparseArray b;
    private final Consumer c;

    public SpannedData() {
        this(new K());
    }

    public SpannedData(Consumer consumer0) {
        this.b = new SparseArray();
        this.c = consumer0;
        this.a = -1;
    }

    public static void a(Object object0) {
    }

    public void b(int v, Object object0) {
        boolean z = false;
        if(this.a == -1) {
            Assertions.i(this.b.size() == 0);
            this.a = 0;
        }
        if(this.b.size() > 0) {
            int v1 = this.b.keyAt(this.b.size() - 1);
            if(v >= v1) {
                z = true;
            }
            Assertions.a(z);
            if(v1 == v) {
                Object object1 = this.b.valueAt(this.b.size() - 1);
                this.c.accept(object1);
            }
        }
        this.b.append(v, object0);
    }

    public void c() {
        for(int v = 0; v < this.b.size(); ++v) {
            Object object0 = this.b.valueAt(v);
            this.c.accept(object0);
        }
        this.a = -1;
        this.b.clear();
    }

    public void d(int v) {
        for(int v1 = this.b.size() - 1; v1 >= 0 && v < this.b.keyAt(v1); --v1) {
            Object object0 = this.b.valueAt(v1);
            this.c.accept(object0);
            this.b.removeAt(v1);
        }
        this.a = this.b.size() <= 0 ? -1 : Math.min(this.a, this.b.size() - 1);
    }

    public void e(int v) {
        for(int v1 = 0; v1 < this.b.size() - 1 && v >= this.b.keyAt(v1 + 1); ++v1) {
            Object object0 = this.b.valueAt(v1);
            this.c.accept(object0);
            this.b.removeAt(v1);
            int v2 = this.a;
            if(v2 > 0) {
                this.a = v2 - 1;
            }
        }
    }

    public Object f(int v) {
        if(this.a == -1) {
            this.a = 0;
        }
        while(this.a > 0 && v < this.b.keyAt(this.a)) {
            --this.a;
        }
        while(this.a < this.b.size() - 1 && v >= this.b.keyAt(this.a + 1)) {
            ++this.a;
        }
        return this.b.valueAt(this.a);
    }

    public Object g() {
        return this.b.valueAt(this.b.size() - 1);
    }

    public boolean h() {
        return this.b.size() == 0;
    }

    private static void i(Object object0) {
    }
}

