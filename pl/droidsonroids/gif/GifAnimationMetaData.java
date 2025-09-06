package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;

public class GifAnimationMetaData implements Parcelable, Serializable {
    static final class a implements Parcelable.Creator {
        public GifAnimationMetaData a(Parcel parcel0) {
            return new GifAnimationMetaData(parcel0, null);
        }

        public GifAnimationMetaData[] b(int v) {
            return new GifAnimationMetaData[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final long f;
    private final long g;
    private static final long h = 0x4EFF56D4F010140DL;

    static {
        GifAnimationMetaData.CREATOR = new a();
    }

    public GifAnimationMetaData(@Nullable ContentResolver contentResolver0, @NonNull Uri uri0) throws IOException {
        this(GifInfoHandle.y(contentResolver0, uri0));
    }

    public GifAnimationMetaData(@NonNull AssetFileDescriptor assetFileDescriptor0) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor0));
    }

    public GifAnimationMetaData(@NonNull AssetManager assetManager0, @NonNull String s) throws IOException {
        this(assetManager0.openFd(s));
    }

    public GifAnimationMetaData(@NonNull Resources resources0, @DrawableRes @RawRes int v) throws Resources.NotFoundException, IOException {
        this(resources0.openRawResourceFd(v));
    }

    private GifAnimationMetaData(Parcel parcel0) {
        this.a = parcel0.readInt();
        this.b = parcel0.readInt();
        this.c = parcel0.readInt();
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.g = parcel0.readLong();
        this.f = parcel0.readLong();
    }

    GifAnimationMetaData(Parcel parcel0, a gifAnimationMetaData$a0) {
        this(parcel0);
    }

    public GifAnimationMetaData(@NonNull File file0) throws IOException {
        this(file0.getPath());
    }

    public GifAnimationMetaData(@NonNull FileDescriptor fileDescriptor0) throws IOException {
        this(new GifInfoHandle(fileDescriptor0));
    }

    public GifAnimationMetaData(@NonNull InputStream inputStream0) throws IOException {
        this(new GifInfoHandle(inputStream0));
    }

    public GifAnimationMetaData(@NonNull String s) throws IOException {
        this(new GifInfoHandle(s));
    }

    public GifAnimationMetaData(@NonNull ByteBuffer byteBuffer0) throws IOException {
        this(new GifInfoHandle(byteBuffer0));
    }

    private GifAnimationMetaData(GifInfoHandle gifInfoHandle0) {
        this.a = gifInfoHandle0.j();
        this.b = gifInfoHandle0.g();
        this.d = gifInfoHandle0.q();
        this.c = gifInfoHandle0.i();
        this.e = gifInfoHandle0.n();
        this.g = gifInfoHandle0.k();
        this.f = gifInfoHandle0.b();
        gifInfoHandle0.A();
    }

    public GifAnimationMetaData(@NonNull byte[] arr_b) throws IOException {
        this(new GifInfoHandle(arr_b));
    }

    public long a() {
        return this.f;
    }

    @B4.a
    public long c(@Nullable e e0, @IntRange(from = 1L, to = 0xFFFFL) int v) {
        if(v < 1 || v > 0xFFFF) {
            throw new IllegalStateException("Sample size " + v + " out of range <1, " + '\uFFFF' + ">");
        }
        int v1 = v * v;
        if(e0 != null && !e0.f.isRecycled()) {
            int v2 = e0.f.getAllocationByteCount();
            return this.f / ((long)v1) + ((long)v2);
        }
        return this.f / ((long)v1) + ((long)(this.d * this.c * 4 / v1));
    }

    public int d() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.a;
    }

    public long g() {
        return this.g;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.d;
    }

    public boolean l() {
        return this.e > 1 && this.b > 0;
    }

    @Override
    @NonNull
    public String toString() {
        String s = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", this.d, this.c, this.e, (this.a == 0 ? "Infinity" : Integer.toString(this.a)), this.b);
        return this.l() ? "Animated " + s : s;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeLong(this.g);
        parcel0.writeLong(this.f);
    }
}

