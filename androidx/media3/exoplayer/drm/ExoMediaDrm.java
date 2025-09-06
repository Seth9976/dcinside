package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@UnstableApi
public interface ExoMediaDrm {
    public static final class AppManagedProvider implements Provider {
        private final ExoMediaDrm a;

        public AppManagedProvider(ExoMediaDrm exoMediaDrm0) {
            this.a = exoMediaDrm0;
        }

        @Override  // androidx.media3.exoplayer.drm.ExoMediaDrm$Provider
        public ExoMediaDrm a(UUID uUID0) {
            this.a.b();
            return this.a;
        }
    }

    public static final class KeyRequest {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface RequestType {
        }

        private final byte[] a;
        private final String b;
        private final int c;
        public static final int d = 0x80000000;
        public static final int e = 0;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;
        public static final int i = 4;

        public KeyRequest(byte[] arr_b, String s) {
            this(arr_b, s, 0x80000000);
        }

        public KeyRequest(byte[] arr_b, String s, int v) {
            this.a = arr_b;
            this.b = s;
            this.c = v;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }
    }

    public static final class KeyStatus {
        private final int a;
        private final byte[] b;

        public KeyStatus(int v, byte[] arr_b) {
            this.a = v;
            this.b = arr_b;
        }

        public byte[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public interface OnEventListener {
        void a(ExoMediaDrm arg1, @Nullable byte[] arg2, int arg3, int arg4, @Nullable byte[] arg5);
    }

    public interface OnExpirationUpdateListener {
        void a(ExoMediaDrm arg1, byte[] arg2, long arg3);
    }

    public interface OnKeyStatusChangeListener {
        void a(ExoMediaDrm arg1, byte[] arg2, List arg3, boolean arg4);
    }

    public interface Provider {
        ExoMediaDrm a(UUID arg1);
    }

    public static final class ProvisionRequest {
        private final byte[] a;
        private final String b;

        public ProvisionRequest(byte[] arr_b, String s) {
            this.a = arr_b;
            this.b = s;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    @UnstableApi
    public static final int a = 2;
    @UnstableApi
    public static final int b = 3;
    @UnstableApi
    public static final int c = 1;
    @UnstableApi
    public static final int d = 1;
    @UnstableApi
    public static final int e = 2;
    @UnstableApi
    public static final int f = 3;

    void b();

    @Nullable
    PersistableBundle c();

    Map d(byte[] arg1);

    ProvisionRequest e();

    List f();

    byte[] g() throws MediaDrmException;

    void h(byte[] arg1, byte[] arg2);

    void i(String arg1, String arg2);

    void j(byte[] arg1);

    void k(String arg1, byte[] arg2);

    String l(String arg1);

    @Nullable
    byte[] m(byte[] arg1, byte[] arg2) throws NotProvisionedException, DeniedByServerException;

    void n(byte[] arg1, PlayerId arg2);

    void o(@Nullable OnExpirationUpdateListener arg1);

    void p(byte[] arg1) throws DeniedByServerException;

    int q();

    CryptoConfig r(byte[] arg1) throws MediaCryptoException;

    void release();

    void s(@Nullable OnKeyStatusChangeListener arg1);

    boolean t(byte[] arg1, String arg2);

    void u(byte[] arg1);

    byte[] v(String arg1);

    void w(@Nullable OnEventListener arg1);

    KeyRequest x(byte[] arg1, @Nullable List arg2, int arg3, @Nullable HashMap arg4) throws NotProvisionedException;
}

