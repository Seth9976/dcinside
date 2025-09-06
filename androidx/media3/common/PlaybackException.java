package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class PlaybackException extends Exception {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface ErrorCode {
    }

    public static final int A = 2004;
    public static final int B = 2005;
    public static final int C = 2006;
    public static final int D = 2007;
    public static final int E = 2008;
    public static final int F = 3001;
    public static final int G = 3002;
    public static final int H = 3003;
    public static final int I = 3004;
    public static final int J = 4001;
    public static final int K = 4002;
    public static final int L = 4003;
    public static final int M = 4004;
    public static final int M8 = 6001;
    public static final int N = 4005;
    public static final int N8 = 6002;
    @UnstableApi
    public static final int O = 4006;
    public static final int O8 = 6003;
    public static final int P = 5001;
    public static final int P8 = 6004;
    public static final int Q = 5002;
    public static final int Q8 = 6005;
    public static final int R8 = 6006;
    public static final int S8 = 6007;
    public static final int T8 = 6008;
    @UnstableApi
    public static final int U8 = 7000;
    @UnstableApi
    public static final int V8 = 7001;
    public static final int W8 = 1000000;
    public static final int X = 5003;
    private static final String X8 = null;
    public static final int Y = 5004;
    private static final String Y8 = null;
    public static final int Z = 6000;
    private static final String Z8 = null;
    public final int a;
    private static final String a9 = null;
    public final long b;
    private static final String b9 = null;
    @UnstableApi
    public final Bundle c;
    private static final String c9 = null;
    public static final int d = -2;
    @UnstableApi
    protected static final int d9 = 1000;
    public static final int e = -3;
    public static final int f = -4;
    public static final int g = -6;
    public static final int h = -100;
    public static final int i = -102;
    public static final int j = -103;
    public static final int k = -104;
    public static final int l = -105;
    public static final int m = -106;
    public static final int n = -107;
    public static final int o = -108;
    public static final int p = -109;
    public static final int q = -110;
    public static final int r = 1000;
    public static final int s = 1001;
    public static final int t = 1002;
    public static final int u = 1003;
    public static final int v = 1004;
    public static final int w = 2000;
    public static final int x = 2001;
    public static final int y = 2002;
    public static final int z = 2003;

    static {
        PlaybackException.X8 = "0";
        PlaybackException.Y8 = "1";
        PlaybackException.Z8 = "2";
        PlaybackException.a9 = "3";
        PlaybackException.b9 = "4";
        PlaybackException.c9 = "5";
    }

    @UnstableApi
    protected PlaybackException(Bundle bundle0) {
        String s = bundle0.getString(PlaybackException.Z8);
        Throwable throwable0 = PlaybackException.e(bundle0);
        int v = bundle0.getInt(PlaybackException.X8, 1000);
        Bundle bundle1 = PlaybackException.h(bundle0);
        long v1 = SystemClock.elapsedRealtime();
        this(s, throwable0, v, bundle1, bundle0.getLong(PlaybackException.Y8, v1));
    }

    @UnstableApi
    public PlaybackException(@Nullable String s, @Nullable Throwable throwable0, int v) {
        this(s, throwable0, v, Bundle.EMPTY, Clock.a.elapsedRealtime());
    }

    @UnstableApi
    public PlaybackException(@Nullable String s, @Nullable Throwable throwable0, int v, Bundle bundle0) {
        this(s, throwable0, v, bundle0, Clock.a.elapsedRealtime());
    }

    @UnstableApi
    protected PlaybackException(@Nullable String s, @Nullable Throwable throwable0, int v, Bundle bundle0, long v1) {
        super(s, throwable0);
        this.a = v;
        this.c = bundle0;
        this.b = v1;
    }

    private static RemoteException a(@Nullable String s) {
        return new RemoteException(s);
    }

    private static Throwable b(Class class0, @Nullable String s) throws Exception {
        return (Throwable)class0.getConstructor(String.class).newInstance(s);
    }

    @CallSuper
    public boolean c(@Nullable PlaybackException playbackException0) {
        if(this == playbackException0) {
            return true;
        }
        if(playbackException0 != null && this.getClass() == playbackException0.getClass()) {
            Throwable throwable0 = this.getCause();
            Throwable throwable1 = playbackException0.getCause();
            if(throwable0 != null && throwable1 != null) {
                if(!Util.g(throwable0.getMessage(), throwable1.getMessage())) {
                    return false;
                }
                return Util.g(throwable0.getClass(), throwable1.getClass()) ? this.a == playbackException0.a && Util.g(this.getMessage(), playbackException0.getMessage()) && this.b == playbackException0.b : false;
            }
            return throwable0 != null || throwable1 != null ? false : this.a == playbackException0.a && Util.g(this.getMessage(), playbackException0.getMessage()) && this.b == playbackException0.b;
        }
        return false;
    }

    @UnstableApi
    public static PlaybackException d(Bundle bundle0) {
        return new PlaybackException(bundle0);
    }

    @Nullable
    private static Throwable e(Bundle bundle0) {
        String s = bundle0.getString(PlaybackException.a9);
        String s1 = bundle0.getString(PlaybackException.b9);
        Throwable throwable0 = null;
        if(!TextUtils.isEmpty(s)) {
            try {
                Class class0 = Class.forName(s, true, PlaybackException.class.getClassLoader());
                if(Throwable.class.isAssignableFrom(class0)) {
                    throwable0 = PlaybackException.b(class0, s1);
                }
                return throwable0 == null ? PlaybackException.a(s1) : throwable0;
            }
            catch(Throwable unused_ex) {
            }
            return PlaybackException.a(s1);
        }
        return throwable0;
    }

    public final String f() {
        return PlaybackException.g(this.a);
    }

    public static String g(int v) {
        switch(v) {
            case -110: {
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            }
            case -109: {
                return "ERROR_CODE_END_OF_PLAYLIST";
            }
            case -108: {
                return "ERROR_CODE_SETUP_REQUIRED";
            }
            case -107: {
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            }
            case -106: {
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            }
            case -105: {
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            }
            case -104: {
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            }
            case -103: {
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            }
            case -102: {
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            }
            case -100: {
                return "ERROR_CODE_DISCONNECTED";
            }
            case -6: {
                return "ERROR_CODE_NOT_SUPPORTED";
            }
            case -4: {
                return "ERROR_CODE_PERMISSION_DENIED";
            }
            case -3: {
                return "ERROR_CODE_BAD_VALUE";
            }
            case -2: {
                return "ERROR_CODE_INVALID_STATE";
            }
            case 1000: {
                return "ERROR_CODE_UNSPECIFIED";
            }
            case 1001: {
                return "ERROR_CODE_REMOTE_ERROR";
            }
            case 1002: {
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            }
            case 1003: {
                return "ERROR_CODE_TIMEOUT";
            }
            case 1004: {
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            }
            case 2000: {
                return "ERROR_CODE_IO_UNSPECIFIED";
            }
            case 2001: {
                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
            }
            case 2002: {
                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
            }
            case 2003: {
                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
            }
            case 2004: {
                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
            }
            case 2005: {
                return "ERROR_CODE_IO_FILE_NOT_FOUND";
            }
            case 2006: {
                return "ERROR_CODE_IO_NO_PERMISSION";
            }
            case 2007: {
                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
            }
            case 2008: {
                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
            }
            case 3001: {
                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
            }
            case 3002: {
                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
            }
            case 3003: {
                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
            }
            case 3004: {
                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
            }
            case 4001: {
                return "ERROR_CODE_DECODER_INIT_FAILED";
            }
            case 4002: {
                return "ERROR_CODE_DECODER_QUERY_FAILED";
            }
            case 4003: {
                return "ERROR_CODE_DECODING_FAILED";
            }
            case 4004: {
                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
            }
            case 4005: {
                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
            }
            case 4006: {
                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
            }
            case 5001: {
                return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            }
            case 5002: {
                return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            }
            case 5003: {
                return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
            }
            case 5004: {
                return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
            }
            case 6000: {
                return "ERROR_CODE_DRM_UNSPECIFIED";
            }
            case 6001: {
                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
            }
            case 6002: {
                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
            }
            case 6003: {
                return "ERROR_CODE_DRM_CONTENT_ERROR";
            }
            case 6004: {
                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
            }
            case 6005: {
                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
            }
            case 6006: {
                return "ERROR_CODE_DRM_SYSTEM_ERROR";
            }
            case 6007: {
                return "ERROR_CODE_DRM_DEVICE_REVOKED";
            }
            case 6008: {
                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
            }
            case 7000: {
                return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
            }
            case 7001: {
                return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
            }
            default: {
                return v < 1000000 ? "invalid error code" : "custom error code";
            }
        }
    }

    private static Bundle h(Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle(PlaybackException.c9);
        return bundle1 == null ? Bundle.EMPTY : bundle1;
    }

    @CallSuper
    @UnstableApi
    public Bundle i() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(PlaybackException.X8, this.a);
        bundle0.putLong(PlaybackException.Y8, this.b);
        bundle0.putString(PlaybackException.Z8, this.getMessage());
        bundle0.putBundle(PlaybackException.c9, this.c);
        Throwable throwable0 = this.getCause();
        if(throwable0 != null) {
            String s = throwable0.getClass().getName();
            bundle0.putString(PlaybackException.a9, s);
            bundle0.putString(PlaybackException.b9, throwable0.getMessage());
        }
        return bundle0;
    }
}

