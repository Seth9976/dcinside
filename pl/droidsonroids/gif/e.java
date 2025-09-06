package pl.droidsonroids.gif;

import C4.b;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController.MediaPlayerControl;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class e extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    final ScheduledThreadPoolExecutor a;
    volatile boolean b;
    long c;
    private final Rect d;
    protected final Paint e;
    final Bitmap f;
    final GifInfoHandle g;
    final ConcurrentLinkedQueue h;
    private ColorStateList i;
    private PorterDuffColorFilter j;
    private PorterDuff.Mode k;
    final boolean l;
    final n m;
    private final r n;
    private final Rect o;
    ScheduledFuture p;
    private int q;
    private int r;
    private b s;

    public e(@Nullable ContentResolver contentResolver0, @NonNull Uri uri0) throws IOException {
        this(GifInfoHandle.y(contentResolver0, uri0), null, null, true);
    }

    public e(@NonNull AssetFileDescriptor assetFileDescriptor0) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor0), null, null, true);
    }

    public e(@NonNull AssetManager assetManager0, @NonNull String s) throws IOException {
        this(assetManager0.openFd(s));
    }

    public e(@NonNull Resources resources0, @DrawableRes @RawRes int v) throws Resources.NotFoundException, IOException {
        this(resources0.openRawResourceFd(v));
        float f = l.b(resources0, v);
        this.r = (int)(((float)this.g.i()) * f);
        this.q = (int)(((float)this.g.q()) * f);
    }

    public e(@NonNull File file0) throws IOException {
        this(file0.getPath());
    }

    public e(@NonNull FileDescriptor fileDescriptor0) throws IOException {
        this(new GifInfoHandle(fileDescriptor0), null, null, true);
    }

    public e(@NonNull InputStream inputStream0) throws IOException {
        this(new GifInfoHandle(inputStream0), null, null, true);
    }

    public e(@NonNull String s) throws IOException {
        this(new GifInfoHandle(s), null, null, true);
    }

    public e(@NonNull ByteBuffer byteBuffer0) throws IOException {
        this(new GifInfoHandle(byteBuffer0), null, null, true);
    }

    e(GifInfoHandle gifInfoHandle0, e e0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0, boolean z) {
        this.b = true;
        this.c = 0x8000000000000000L;
        this.d = new Rect();
        this.e = new Paint(6);
        this.h = new ConcurrentLinkedQueue();
        r r0 = new r(this);
        this.n = r0;
        this.l = z;
        if(scheduledThreadPoolExecutor0 == null) {
            scheduledThreadPoolExecutor0 = j.a();
        }
        this.a = scheduledThreadPoolExecutor0;
        this.g = gifInfoHandle0;
        Bitmap bitmap0 = null;
        if(e0 != null) {
            synchronized(e0.g) {
                if(!e0.g.w() && e0.g.i() >= gifInfoHandle0.i() && e0.g.q() >= gifInfoHandle0.q()) {
                    e0.L();
                    bitmap0 = e0.f;
                    bitmap0.eraseColor(0);
                }
            }
        }
        this.f = bitmap0 == null ? Bitmap.createBitmap(gifInfoHandle0.q(), gifInfoHandle0.i(), Bitmap.Config.ARGB_8888) : bitmap0;
        boolean z1 = gifInfoHandle0.v();
        this.f.setHasAlpha(!z1);
        this.o = new Rect(0, 0, gifInfoHandle0.q(), gifInfoHandle0.i());
        this.m = new n(this);
        r0.a();
        this.q = gifInfoHandle0.q();
        this.r = gifInfoHandle0.i();
    }

    protected e(@NonNull m m0, @Nullable e e0, @Nullable ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0, boolean z, @NonNull i i0) throws IOException {
        this(m0.b(i0), e0, scheduledThreadPoolExecutor0, z);
    }

    public e(@NonNull byte[] arr_b) throws IOException {
        this(new GifInfoHandle(arr_b), null, null, true);
    }

    public boolean A(a a0) {
        return this.h.remove(a0);
    }

    public void B() {
        class pl.droidsonroids.gif.e.a extends s {
            final e b;

            pl.droidsonroids.gif.e.a(e e1) {
                super(e1);
            }

            @Override  // pl.droidsonroids.gif.s
            public void a() {
                if(e.this.g.C()) {
                    e.this.start();
                }
            }
        }

        pl.droidsonroids.gif.e.a e$a0 = new pl.droidsonroids.gif.e.a(this, this);
        this.a.execute(e$a0);
    }

    private void C() {
        if(this.l && this.b) {
            long v = this.c;
            if(v != 0x8000000000000000L) {
                long v1 = Math.max(0L, v - SystemClock.uptimeMillis());
                this.c = 0x8000000000000000L;
                this.a.remove(this.n);
                this.p = this.a.schedule(this.n, v1, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void D(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        synchronized(this.g) {
            this.g.I(v, this.f);
        }
        this.m.sendEmptyMessageAtTime(-1, 0L);
    }

    public void E(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v) {
        class c extends s {
            final int b;
            final e c;

            c(e e1, int v) {
                this.b = v;
                super(e1);
            }

            @Override  // pl.droidsonroids.gif.s
            public void a() {
                e.this.g.G(this.b, e.this.f);
                e.this.m.sendEmptyMessageAtTime(-1, 0L);
            }
        }

        if(v < 0) {
            throw new IndexOutOfBoundsException("Frame index is not positive");
        }
        c e$c0 = new c(this, this, v);
        this.a.execute(e$c0);
    }

    public Bitmap F(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v) {
        Bitmap bitmap0;
        if(v < 0) {
            throw new IndexOutOfBoundsException("Frame index is not positive");
        }
        synchronized(this.g) {
            this.g.G(v, this.f);
            bitmap0 = this.j();
        }
        this.m.sendEmptyMessageAtTime(-1, 0L);
        return bitmap0;
    }

    public Bitmap G(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v) {
        Bitmap bitmap0;
        if(v < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        synchronized(this.g) {
            this.g.I(v, this.f);
            bitmap0 = this.j();
        }
        this.m.sendEmptyMessageAtTime(-1, 0L);
        return bitmap0;
    }

    public void H(@FloatRange(from = 0.0) float f) {
        C4.a a0 = new C4.a(f);
        this.s = a0;
        a0.b(this.d);
    }

    public void I(@IntRange(from = 0L, to = 0xFFFFL) int v) {
        this.g.J(v);
    }

    public void J(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        this.g.L(f);
    }

    public void K(@Nullable b b0) {
        this.s = b0;
        if(b0 != null) {
            b0.b(this.d);
        }
    }

    private void L() {
        this.b = false;
        this.m.removeMessages(-1);
        this.g.A();
    }

    void M(long v) {
        if(this.l) {
            this.c = 0L;
            this.m.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        this.c();
        this.p = this.a.schedule(this.n, Math.max(v, 0L), TimeUnit.MILLISECONDS);
    }

    private PorterDuffColorFilter N(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    public void a(@NonNull a a0) {
        this.h.add(a0);
    }

    private void c() {
        ScheduledFuture scheduledFuture0 = this.p;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.m.removeMessages(-1);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekBackward() {
        return this.s() > 1;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean canSeekForward() {
        return this.s() > 1;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        boolean z;
        if(this.j == null || this.e.getColorFilter() != null) {
            z = false;
        }
        else {
            this.e.setColorFilter(this.j);
            z = true;
        }
        b b0 = this.s;
        if(b0 == null) {
            canvas0.drawBitmap(this.f, this.o, this.d, this.e);
        }
        else {
            b0.a(canvas0, this.e, this.f);
        }
        if(z) {
            this.e.setColorFilter(null);
        }
    }

    @Nullable
    public static e f(@NonNull Resources resources0, @DrawableRes @RawRes int v) {
        try {
            return new e(resources0, v);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public long g() {
        return this.g.b() + ((long)this.f.getAllocationByteCount());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.getAlpha();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.e.getColorFilter();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getCurrentPosition() {
        return this.g.f();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public int getDuration() {
        return this.g.g();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.q;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return !this.g.v() || this.e.getAlpha() < 0xFF ? -2 : -1;
    }

    @Nullable
    public String h() {
        return this.g.c();
    }

    // 去混淆评级： 低(20)
    @FloatRange(from = 0.0)
    public float i() {
        return this.s instanceof C4.a ? ((C4.a)this.s).d() : 0.0f;
    }

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.C();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public boolean isPlaying() {
        return this.b;
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.b;
    }

    // 去混淆评级： 低(30)
    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || this.i != null && this.i.isStateful();
    }

    public Bitmap j() {
        Bitmap.Config bitmap$Config0 = this.f.getConfig();
        boolean z = this.f.isMutable();
        Bitmap bitmap0 = this.f.copy(bitmap$Config0, z);
        bitmap0.setHasAlpha(this.f.hasAlpha());
        return bitmap0;
    }

    public int k() {
        return this.g.d();
    }

    public int l() {
        int v = this.g.e();
        return v == 0 || v < this.g.j() ? v : v - 1;
    }

    @NonNull
    public h m() {
        return h.a(this.g.l());
    }

    public int n() {
        return this.f.getRowBytes() * this.f.getHeight();
    }

    public int o(@IntRange(from = 0L) int v) {
        return this.g.h(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        this.d.set(rect0);
        b b0 = this.s;
        if(b0 != null) {
            b0.b(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        ColorStateList colorStateList0 = this.i;
        if(colorStateList0 != null) {
            PorterDuff.Mode porterDuff$Mode0 = this.k;
            if(porterDuff$Mode0 != null) {
                this.j = this.N(colorStateList0, porterDuff$Mode0);
                return true;
            }
        }
        return false;
    }

    public long p() {
        return this.g.p();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void pause() {
        this.stop();
    }

    public int q() {
        return this.g.j();
    }

    public long r() {
        return this.g.k();
    }

    public int s() {
        return this.g.n();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public void seekTo(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v) {
        class pl.droidsonroids.gif.e.b extends s {
            final int b;
            final e c;

            pl.droidsonroids.gif.e.b(e e1, int v) {
                this.b = v;
                super(e1);
            }

            @Override  // pl.droidsonroids.gif.s
            public void a() {
                e.this.g.I(this.b, e.this.f);
                this.a.m.sendEmptyMessageAtTime(-1, 0L);
            }
        }

        if(v < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        pl.droidsonroids.gif.e.b e$b0 = new pl.droidsonroids.gif.e.b(this, this, v);
        this.a.execute(e$b0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.e.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.e.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.e.setDither(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        this.i = colorStateList0;
        this.j = this.N(colorStateList0, this.k);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.k = porterDuff$Mode0;
        this.j = this.N(this.i, porterDuff$Mode0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        if(!this.l) {
            if(z) {
                if(z1) {
                    this.B();
                }
                if(z2) {
                    this.start();
                    return true;
                }
            }
            else if(z2) {
                this.stop();
            }
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Animatable, android.widget.MediaController$MediaPlayerControl
    public void start() {
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
        }
        this.M(this.g.D());
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        synchronized(this) {
            if(!this.b) {
                return;
            }
            this.b = false;
        }
        this.c();
        this.g.F();
    }

    @NonNull
    public final Paint t() {
        return this.e;
    }

    @Override
    @NonNull
    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", this.g.q(), this.g.i(), this.g.n(), this.g.l());
    }

    public int u(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= this.g.q()) {
            throw new IllegalArgumentException("x must be < width");
        }
        if(v1 >= this.g.i()) {
            throw new IllegalArgumentException("y must be < height");
        }
        return this.f.getPixel(v, v1);
    }

    public void v(@NonNull int[] arr_v) {
        int v = this.g.q();
        int v1 = this.g.q();
        int v2 = this.g.i();
        this.f.getPixels(arr_v, 0, v, 0, 0, v1, v2);
    }

    @Nullable
    public b w() {
        return this.s;
    }

    public boolean x() {
        return this.g.u();
    }

    public boolean y() {
        return this.g.w();
    }

    public void z() {
        this.L();
        this.f.recycle();
    }
}

