package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader.Callback;
import androidx.media3.exoplayer.upstream.Loader.LoadErrorAction;
import androidx.media3.exoplayer.upstream.Loader.Loadable;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

@UnstableApi
public final class SntpClient {
    public interface InitializationCallback {
        void a(IOException arg1);

        void b();
    }

    static final class NtpTimeCallback implements Callback {
        @Nullable
        private final InitializationCallback a;

        public NtpTimeCallback(@Nullable InitializationCallback sntpClient$InitializationCallback0) {
            this.a = sntpClient$InitializationCallback0;
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public LoadErrorAction h(Loadable loader$Loadable0, long v, long v1, IOException iOException0, int v2) {
            InitializationCallback sntpClient$InitializationCallback0 = this.a;
            if(sntpClient$InitializationCallback0 != null) {
                sntpClient$InitializationCallback0.a(iOException0);
            }
            return Loader.k;
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void o(Loadable loader$Loadable0, long v, long v1, boolean z) {
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Callback
        public void u(Loadable loader$Loadable0, long v, long v1) {
            if(this.a != null) {
                if(!SntpClient.k()) {
                    IOException iOException0 = new IOException(new ConcurrentModificationException());
                    this.a.a(iOException0);
                    return;
                }
                this.a.b();
            }
        }
    }

    static final class NtpTimeLoadable implements Loadable {
        private NtpTimeLoadable() {
        }

        NtpTimeLoadable(androidx.media3.exoplayer.util.SntpClient.1 sntpClient$10) {
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void b() {
        }

        @Override  // androidx.media3.exoplayer.upstream.Loader$Loadable
        public void w() throws IOException {
            synchronized(SntpClient.p) {
                Object object1 = SntpClient.q;
                synchronized(object1) {
                }
                long v1 = SntpClient.l();
                Object object2 = SntpClient.q;
                synchronized(object2) {
                    SntpClient.s = v1;
                    SntpClient.r = true;
                }
            }
        }
    }

    public static final String a = "time.android.com";
    private static final int b = 10000;
    private static final int c = 24;
    private static final int d = 0x20;
    private static final int e = 40;
    private static final int f = 0x30;
    private static final int g = 0x7B;
    private static final int h = 3;
    private static final int i = 4;
    private static final int j = 5;
    private static final int k = 3;
    private static final int l = 3;
    private static final int m = 0;
    private static final int n = 15;
    private static final long o = 2208988800L;
    private static final Object p = null;
    private static final Object q = null;
    @GuardedBy("valueLock")
    private static boolean r = false;
    @GuardedBy("valueLock")
    private static long s = 0L;
    @GuardedBy("valueLock")
    private static String t = "time.android.com";

    static {
        SntpClient.p = new Object();
        SntpClient.q = new Object();
    }

    static boolean c() [...] // 潜在的解密器

    private static void g(byte b, byte b1, int v, long v1) throws IOException {
        if(b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if(b1 != 4 && b1 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int)b1));
        }
        if(v == 0 || v > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + v);
        }
        if(v1 == 0L) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long h() {
        synchronized(SntpClient.q) {
        }
        return SntpClient.r ? SntpClient.s : 0x8000000000000001L;
    }

    public static String i() [...] // 潜在的解密器

    public static void j(@Nullable Loader loader0, @Nullable InitializationCallback sntpClient$InitializationCallback0) {
        if(SntpClient.k()) {
            if(sntpClient$InitializationCallback0 != null) {
                sntpClient$InitializationCallback0.b();
            }
            return;
        }
        if(loader0 == null) {
            loader0 = new Loader("SntpClient");
        }
        loader0.n(new NtpTimeLoadable(null), new NtpTimeCallback(sntpClient$InitializationCallback0), 1);
    }

    public static boolean k() {
        synchronized(SntpClient.q) {
        }
        return SntpClient.r;
    }

    private static long l() throws IOException {
        InetAddress inetAddress0 = InetAddress.getByName("time.android.com");
        try(DatagramSocket datagramSocket0 = new DatagramSocket()) {
            datagramSocket0.setSoTimeout(10000);
            byte[] arr_b = new byte[0x30];
            DatagramPacket datagramPacket0 = new DatagramPacket(arr_b, 0x30, inetAddress0, 0x7B);
            arr_b[0] = 27;
            long v = System.currentTimeMillis();
            long v1 = SystemClock.elapsedRealtime();
            SntpClient.p(arr_b, 40, v);
            datagramSocket0.send(datagramPacket0);
            datagramSocket0.receive(new DatagramPacket(arr_b, 0x30));
            long v2 = SystemClock.elapsedRealtime();
            long v3 = v + (v2 - v1);
            int v4 = (byte)(arr_b[0] >> 6 & 3);
            int v5 = (byte)(arr_b[0] & 7);
            int v6 = arr_b[1] & 0xFF;
            long v7 = SntpClient.n(arr_b, 24);
            long v8 = SntpClient.n(arr_b, 0x20);
            long v9 = SntpClient.n(arr_b, 40);
            SntpClient.g(((byte)v4), ((byte)v5), v6, v9);
            return v3 + (v8 - v7 + (v9 - v3)) / 2L - v2;
        }
    }

    private static long m(byte[] arr_b, int v) {
        int v1 = arr_b[v];
        int v2 = arr_b[v + 1];
        int v3 = arr_b[v + 2];
        int v4 = arr_b[v + 3];
        if((v1 & 0x80) == 0x80) {
            v1 = (v1 & 0x7F) + 0x80;
        }
        if((v2 & 0x80) == 0x80) {
            v2 = (v2 & 0x7F) + 0x80;
        }
        if((v3 & 0x80) == 0x80) {
            v3 = (v3 & 0x7F) + 0x80;
        }
        if((v4 & 0x80) == 0x80) {
            v4 = (v4 & 0x7F) + 0x80;
        }
        return (((long)v1) << 24) + (((long)v2) << 16) + (((long)v3) << 8) + ((long)v4);
    }

    private static long n(byte[] arr_b, int v) {
        long v1 = SntpClient.m(arr_b, v);
        long v2 = SntpClient.m(arr_b, v + 4);
        return v1 != 0L || v2 != 0L ? (v1 - 2208988800L) * 1000L + v2 * 1000L / 0x100000000L : 0L;
    }

    public static void o(String s) {
        synchronized(SntpClient.q) {
            if(!"time.android.com".equals(s)) {
                SntpClient.t = s;
                SntpClient.r = false;
            }
        }
    }

    private static void p(byte[] arr_b, int v, long v1) {
        if(v1 == 0L) {
            Arrays.fill(arr_b, v, v + 8, 0);
            return;
        }
        long v2 = v1 / 1000L + 2208988800L;
        arr_b[v] = (byte)(((int)(v2 >> 24)));
        arr_b[v + 1] = (byte)(((int)(v2 >> 16)));
        arr_b[v + 2] = (byte)(((int)(v2 >> 8)));
        arr_b[v + 3] = (byte)(((int)v2));
        arr_b[v + 4] = 0;
        arr_b[v + 5] = 0;
        arr_b[v + 6] = 0;
        arr_b[v + 7] = (byte)(((int)(Math.random() * 255.0)));
    }

    class androidx.media3.exoplayer.util.SntpClient.1 {
    }

}

