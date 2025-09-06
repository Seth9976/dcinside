package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

public class BatchingListUpdateCallback implements ListUpdateCallback {
    final ListUpdateCallback a;
    int b;
    int c;
    int d;
    Object e;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback0) {
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.e = null;
        this.a = listUpdateCallback0;
    }

    public void a() {
        int v = this.b;
        if(v == 0) {
            return;
        }
        switch(v) {
            case 1: {
                this.a.g(this.c, this.d);
                break;
            }
            case 2: {
                this.a.i(this.c, this.d);
                break;
            }
            case 3: {
                this.a.b(this.c, this.d, this.e);
            }
        }
        this.e = null;
        this.b = 0;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void b(int v, int v1, Object object0) {
        if(this.b == 3) {
            int v2 = this.c;
            int v3 = this.d;
            if(v <= v2 + v3) {
                int v4 = v + v1;
                if(v4 >= v2 && this.e == object0) {
                    this.c = Math.min(v, v2);
                    this.d = Math.max(v3 + v2, v4) - this.c;
                    return;
                }
            }
        }
        this.a();
        this.c = v;
        this.d = v1;
        this.e = object0;
        this.b = 3;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void g(int v, int v1) {
        if(this.b == 1) {
            int v2 = this.c;
            if(v >= v2) {
                int v3 = this.d;
                if(v <= v2 + v3) {
                    this.d = v3 + v1;
                    this.c = Math.min(v, v2);
                    return;
                }
            }
        }
        this.a();
        this.c = v;
        this.d = v1;
        this.b = 1;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void i(int v, int v1) {
        if(this.b == 2 && (this.c >= v && this.c <= v + v1)) {
            this.d += v1;
            this.c = v;
            return;
        }
        this.a();
        this.c = v;
        this.d = v1;
        this.b = 2;
    }

    @Override  // androidx.recyclerview.widget.ListUpdateCallback
    public void j(int v, int v1) {
        this.a();
        this.a.j(v, v1);
    }
}

