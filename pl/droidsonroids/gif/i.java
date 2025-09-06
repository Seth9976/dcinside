package pl.droidsonroids.gif;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

public class i {
    char a;
    boolean b;

    public i() {
        this.a();
    }

    private void a() {
        this.a = '\u0001';
        this.b = false;
    }

    void b(@Nullable i i0) {
        if(i0 == null) {
            this.a();
            return;
        }
        this.b = i0.b;
        this.a = i0.a;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(@IntRange(from = 1L, to = 0xFFFFL) int v) {
        if(v >= 1 && v <= 0xFFFF) {
            this.a = (char)v;
            return;
        }
        this.a = '\u0001';
    }
}

