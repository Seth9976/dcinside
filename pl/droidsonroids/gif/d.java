package pl.droidsonroids.gif;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public class d {
    private final GifInfoHandle a;

    public d(@NonNull m m0) throws IOException {
        this(m0, null);
    }

    public d(@NonNull m m0, @Nullable i i0) throws IOException {
        GifInfoHandle gifInfoHandle0 = m0.c();
        this.a = gifInfoHandle0;
        if(i0 != null) {
            gifInfoHandle0.K(i0.a, i0.b);
        }
    }

    private void a(Bitmap bitmap0) {
        if(bitmap0.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is recycled");
        }
        if(bitmap0.getWidth() < this.a.q() || bitmap0.getHeight() < this.a.i()) {
            throw new IllegalArgumentException("Bitmap ia too small, size must be greater than or equal to GIF size");
        }
        if(bitmap0.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Only Config.ARGB_8888 is supported. Current bitmap config: " + bitmap0.getConfig());
        }
    }

    public long b() {
        return this.a.b();
    }

    public String c() {
        return this.a.c();
    }

    public int d() {
        return this.a.g();
    }

    public int e(@IntRange(from = 0L) int v) {
        return this.a.h(v);
    }

    public int f() {
        return this.a.i();
    }

    public int g() {
        return this.a.j();
    }

    public int h() {
        return this.a.n();
    }

    public long i() {
        return this.a.p();
    }

    public int j() {
        return this.a.q();
    }

    public boolean k() {
        return this.a.n() > 1 && this.d() > 0;
    }

    public void l() {
        this.a.A();
    }

    public void m(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v, @NonNull Bitmap bitmap0) {
        this.a(bitmap0);
        this.a.G(v, bitmap0);
    }

    public void n(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v, @NonNull Bitmap bitmap0) {
        this.a(bitmap0);
        this.a.I(v, bitmap0);
    }
}

