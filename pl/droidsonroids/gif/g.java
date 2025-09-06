package pl.droidsonroids.gif;

import B4.a;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class g {
    private m a;
    private e b;
    private ScheduledThreadPoolExecutor c;
    private boolean d;
    private i e;

    public g() {
        this.d = true;
        this.e = new i();
    }

    public e a() throws IOException {
        m m0 = this.a;
        if(m0 == null) {
            throw new NullPointerException("Source is not set");
        }
        return m0.a(this.b, this.c, this.d, this.e);
    }

    public g b(ContentResolver contentResolver0, Uri uri0) {
        this.a = new j(contentResolver0, uri0);
        return this.t();
    }

    public g c(AssetFileDescriptor assetFileDescriptor0) {
        this.a = new b(assetFileDescriptor0);
        return this.t();
    }

    public g d(AssetManager assetManager0, String s) {
        this.a = new c(assetManager0, s);
        return this.t();
    }

    public g e(Resources resources0, int v) {
        this.a = new pl.droidsonroids.gif.m.i(resources0, v);
        return this.t();
    }

    public g f(File file0) {
        this.a = new pl.droidsonroids.gif.m.g(file0);
        return this.t();
    }

    public g g(FileDescriptor fileDescriptor0) {
        this.a = new f(fileDescriptor0);
        return this.t();
    }

    public g h(InputStream inputStream0) {
        this.a = new h(inputStream0);
        return this.t();
    }

    public g i(String s) {
        this.a = new pl.droidsonroids.gif.m.g(s);
        return this.t();
    }

    public g j(ByteBuffer byteBuffer0) {
        this.a = new pl.droidsonroids.gif.m.e(byteBuffer0);
        return this.t();
    }

    public g k(byte[] arr_b) {
        this.a = new d(arr_b);
        return this.t();
    }

    public ScheduledThreadPoolExecutor l() {
        return this.c;
    }

    public m m() {
        return this.a;
    }

    public e n() {
        return this.b;
    }

    public i o() {
        return this.e;
    }

    public boolean p() {
        return this.d;
    }

    @a
    public g q(@Nullable i i0) {
        this.e.b(i0);
        return this.t();
    }

    public g r(boolean z) {
        this.d = z;
        return this.t();
    }

    public g s(@IntRange(from = 1L, to = 0xFFFFL) int v) {
        this.e.d(v);
        return this.t();
    }

    protected abstract g t();

    public g u(boolean z) {
        return this.r(z);
    }

    public g v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0) {
        this.c = scheduledThreadPoolExecutor0;
        return this.t();
    }

    public g w(int v) {
        this.c = new ScheduledThreadPoolExecutor(v);
        return this.t();
    }

    public g x(e e0) {
        this.b = e0;
        return this.t();
    }
}

