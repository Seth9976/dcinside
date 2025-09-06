package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class ExoPlaybackException extends PlaybackException {
    @UnstableApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface Type {
    }

    @UnstableApi
    public final int e9;
    @Nullable
    @UnstableApi
    public final String f9;
    @UnstableApi
    public final int g9;
    @Nullable
    @UnstableApi
    public final Format h9;
    @UnstableApi
    public final int i9;
    @Nullable
    @UnstableApi
    public final MediaPeriodId j9;
    final boolean k9;
    @UnstableApi
    public static final int l9 = 0;
    @UnstableApi
    public static final int m9 = 1;
    @UnstableApi
    public static final int n9 = 2;
    @UnstableApi
    public static final int o9 = 3;
    private static final String p9;
    private static final String q9;
    private static final String r9;
    private static final String s9;
    private static final String t9;
    private static final String u9;

    static {
        ExoPlaybackException.p9 = "rt";
        ExoPlaybackException.q9 = "ru";
        ExoPlaybackException.r9 = "rv";
        ExoPlaybackException.s9 = "rw";
        ExoPlaybackException.t9 = "rx";
        ExoPlaybackException.u9 = "ry";
    }

    private ExoPlaybackException(int v, Throwable throwable0, int v1) {
        this(v, throwable0, null, v1, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int v, @Nullable Throwable throwable0, @Nullable String s, int v1, @Nullable String s1, int v2, @Nullable Format format0, int v3, boolean z) {
        this(ExoPlaybackException.p(v, s, s1, v2, format0, v3), throwable0, v1, v, s1, v2, format0, v3, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(Bundle bundle0) {
        super(bundle0);
        this.e9 = bundle0.getInt(ExoPlaybackException.p9, 2);
        this.f9 = bundle0.getString(ExoPlaybackException.q9);
        this.g9 = bundle0.getInt(ExoPlaybackException.r9, -1);
        Bundle bundle1 = bundle0.getBundle(ExoPlaybackException.s9);
        this.h9 = bundle1 == null ? null : Format.d(bundle1);
        this.i9 = bundle0.getInt(ExoPlaybackException.t9, 4);
        this.k9 = bundle0.getBoolean(ExoPlaybackException.u9, false);
        this.j9 = null;
    }

    private ExoPlaybackException(String s, @Nullable Throwable throwable0, int v, int v1, @Nullable String s1, int v2, @Nullable Format format0, int v3, @Nullable MediaPeriodId mediaSource$MediaPeriodId0, long v4, boolean z) {
        super(s, throwable0, v, Bundle.EMPTY, v4);
        boolean z1 = false;
        Assertions.a(!z || v1 == 1);
        if(throwable0 != null || v1 == 3) {
            z1 = true;
        }
        Assertions.a(z1);
        this.e9 = v1;
        this.f9 = s1;
        this.g9 = v2;
        this.h9 = format0;
        this.i9 = v3;
        this.j9 = mediaSource$MediaPeriodId0;
        this.k9 = z;
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.media3.common.PlaybackException
    public boolean c(@Nullable PlaybackException playbackException0) {
        return super.c(playbackException0) ? this.e9 == ((ExoPlaybackException)playbackException0).e9 && Util.g(this.f9, ((ExoPlaybackException)playbackException0).f9) && this.g9 == ((ExoPlaybackException)playbackException0).g9 && Util.g(this.h9, ((ExoPlaybackException)playbackException0).h9) && this.i9 == ((ExoPlaybackException)playbackException0).i9 && Util.g(this.j9, ((ExoPlaybackException)playbackException0).j9) && this.k9 == ((ExoPlaybackException)playbackException0).k9 : false;
    }

    @Override  // androidx.media3.common.PlaybackException
    @UnstableApi
    public Bundle i() {
        Bundle bundle0 = super.i();
        bundle0.putInt(ExoPlaybackException.p9, this.e9);
        bundle0.putString(ExoPlaybackException.q9, this.f9);
        bundle0.putInt(ExoPlaybackException.r9, this.g9);
        Format format0 = this.h9;
        if(format0 != null) {
            Bundle bundle1 = format0.k(false);
            bundle0.putBundle(ExoPlaybackException.s9, bundle1);
        }
        bundle0.putInt(ExoPlaybackException.t9, this.i9);
        bundle0.putBoolean(ExoPlaybackException.u9, this.k9);
        return bundle0;
    }

    @CheckResult
    ExoPlaybackException j(@Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return new ExoPlaybackException(this.getMessage(), this.getCause(), this.a, this.e9, this.f9, this.g9, this.h9, this.i9, mediaSource$MediaPeriodId0, this.b, this.k9);
    }

    @UnstableApi
    public static ExoPlaybackException k(String s) {
        return new ExoPlaybackException(3, null, s, 1001, null, -1, null, 4, false);
    }

    @UnstableApi
    public static ExoPlaybackException l(Throwable throwable0, String s, int v, @Nullable Format format0, int v1, boolean z, int v2) {
        return format0 == null ? new ExoPlaybackException(1, throwable0, null, v2, s, v, null, 4, z) : new ExoPlaybackException(1, throwable0, null, v2, s, v, format0, v1, z);
    }

    @UnstableApi
    public static ExoPlaybackException m(IOException iOException0, int v) {
        return new ExoPlaybackException(0, iOException0, v);
    }

    @UnstableApi
    @Deprecated
    public static ExoPlaybackException n(RuntimeException runtimeException0) {
        return ExoPlaybackException.o(runtimeException0, 1000);
    }

    @UnstableApi
    public static ExoPlaybackException o(RuntimeException runtimeException0, int v) {
        return new ExoPlaybackException(2, runtimeException0, v);
    }

    private static String p(int v, @Nullable String s, @Nullable String s1, int v1, @Nullable Format format0, int v2) {
        switch(v) {
            case 0: {
                return TextUtils.isEmpty(s) ? "Source error" : "Source error: " + s;
            }
            case 1: {
                String s2 = s1 + " error, index=" + v1 + ", format=" + format0 + ", format_supported=" + Util.s0(v2);
                return TextUtils.isEmpty(s) ? s2 : s2 + ": " + s;
            }
            case 3: {
                return TextUtils.isEmpty(s) ? "Remote error" : "Remote error: " + s;
            }
            default: {
                return TextUtils.isEmpty(s) ? "Unexpected runtime error" : "Unexpected runtime error: " + s;
            }
        }
    }

    @UnstableApi
    public static ExoPlaybackException q(Bundle bundle0) {
        return new ExoPlaybackException(bundle0);
    }

    @UnstableApi
    public Exception r() {
        Assertions.i(this.e9 == 1);
        return (Exception)Assertions.g(this.getCause());
    }

    @UnstableApi
    public IOException s() {
        Assertions.i(this.e9 == 0);
        return (IOException)Assertions.g(this.getCause());
    }

    @UnstableApi
    public RuntimeException u() {
        Assertions.i(this.e9 == 2);
        return (RuntimeException)Assertions.g(this.getCause());
    }
}

