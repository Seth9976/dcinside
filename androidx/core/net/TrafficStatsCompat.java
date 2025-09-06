package androidx.core.net;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public final class TrafficStatsCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static void a(DatagramSocket datagramSocket0) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket0);
        }

        static void b(DatagramSocket datagramSocket0) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket0);
        }
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int v) {
        TrafficStats.incrementOperationCount(v);
    }

    @Deprecated
    public static void d(int v, int v1) {
        TrafficStats.incrementOperationCount(v, v1);
    }

    @Deprecated
    public static void e(int v) {
        TrafficStats.setThreadStatsTag(v);
    }

    public static void f(DatagramSocket datagramSocket0) throws SocketException {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.a(datagramSocket0);
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.fromDatagramSocket(datagramSocket0);
        TrafficStats.tagSocket(new DatagramSocketWrapper(datagramSocket0, parcelFileDescriptor0.getFileDescriptor()));
        parcelFileDescriptor0.detachFd();
    }

    @Deprecated
    public static void g(Socket socket0) throws SocketException {
        TrafficStats.tagSocket(socket0);
    }

    public static void h(DatagramSocket datagramSocket0) throws SocketException {
        if(Build.VERSION.SDK_INT >= 24) {
            Api24Impl.b(datagramSocket0);
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor0 = ParcelFileDescriptor.fromDatagramSocket(datagramSocket0);
        TrafficStats.untagSocket(new DatagramSocketWrapper(datagramSocket0, parcelFileDescriptor0.getFileDescriptor()));
        parcelFileDescriptor0.detachFd();
    }

    @Deprecated
    public static void i(Socket socket0) throws SocketException {
        TrafficStats.untagSocket(socket0);
    }
}

