package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class m {
    static class a {
    }

    public static class b extends m {
        private final AssetFileDescriptor a;

        public b(@NonNull AssetFileDescriptor assetFileDescriptor0) {
            super(null);
            this.a = assetFileDescriptor0;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static final class c extends m {
        private final AssetManager a;
        private final String b;

        public c(@NonNull AssetManager assetManager0, @NonNull String s) {
            super(null);
            this.a = assetManager0;
            this.b = s;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a.openFd(this.b));
        }
    }

    public static final class d extends m {
        private final byte[] a;

        public d(@NonNull byte[] arr_b) {
            super(null);
            this.a = arr_b;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static final class e extends m {
        private final ByteBuffer a;

        public e(@NonNull ByteBuffer byteBuffer0) {
            super(null);
            this.a = byteBuffer0;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static final class f extends m {
        private final FileDescriptor a;

        public f(@NonNull FileDescriptor fileDescriptor0) {
            super(null);
            this.a = fileDescriptor0;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static final class g extends m {
        private final String a;

        public g(@NonNull File file0) {
            super(null);
            this.a = file0.getPath();
        }

        public g(@NonNull String s) {
            super(null);
            this.a = s;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static final class h extends m {
        private final InputStream a;

        public h(@NonNull InputStream inputStream0) {
            super(null);
            this.a = inputStream0;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    public static class i extends m {
        private final Resources a;
        private final int b;

        public i(@NonNull Resources resources0, @DrawableRes @RawRes int v) {
            super(null);
            this.a = resources0;
            this.b = v;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a.openRawResourceFd(this.b));
        }
    }

    public static final class j extends m {
        private final ContentResolver a;
        private final Uri b;

        public j(@Nullable ContentResolver contentResolver0, @NonNull Uri uri0) {
            super(null);
            this.a = contentResolver0;
            this.b = uri0;
        }

        @Override  // pl.droidsonroids.gif.m
        GifInfoHandle c() throws IOException {
            return GifInfoHandle.y(this.a, this.b);
        }
    }

    private m() {
    }

    m(a m$a0) {
    }

    final pl.droidsonroids.gif.e a(pl.droidsonroids.gif.e e0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0, boolean z, pl.droidsonroids.gif.i i0) throws IOException {
        return new pl.droidsonroids.gif.e(this.b(i0), e0, scheduledThreadPoolExecutor0, z);
    }

    final GifInfoHandle b(@NonNull pl.droidsonroids.gif.i i0) throws IOException {
        GifInfoHandle gifInfoHandle0 = this.c();
        gifInfoHandle0.K(i0.a, i0.b);
        return gifInfoHandle0;
    }

    abstract GifInfoHandle c() throws IOException;
}

