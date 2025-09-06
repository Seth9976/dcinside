package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class ExifInterfaceUtils {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static void a(FileDescriptor fileDescriptor0) throws ErrnoException {
            Os.close(fileDescriptor0);
        }

        @DoNotInline
        static FileDescriptor b(FileDescriptor fileDescriptor0) throws ErrnoException {
            return Os.dup(fileDescriptor0);
        }

        @DoNotInline
        static long c(FileDescriptor fileDescriptor0, long v, int v1) throws ErrnoException {
            return Os.lseek(fileDescriptor0, v, v1);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        @DoNotInline
        static void a(MediaMetadataRetriever mediaMetadataRetriever0, MediaDataSource mediaDataSource0) {
            mediaMetadataRetriever0.setDataSource(mediaDataSource0);
        }
    }

    private static final String a = "ExifInterfaceUtils";

    static String a(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(String.format("%02x", ((byte)arr_b[v])));
        }
        return stringBuilder0.toString();
    }

    static void b(FileDescriptor fileDescriptor0) {
        try {
            Api21Impl.a(fileDescriptor0);
        }
        catch(Exception unused_ex) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    static void c(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    static long[] d(Object object0) {
        if(object0 instanceof int[]) {
            long[] arr_v = new long[((int[])object0).length];
            for(int v = 0; v < ((int[])object0).length; ++v) {
                arr_v[v] = (long)((int[])object0)[v];
            }
            return arr_v;
        }
        return object0 instanceof long[] ? ((long[])object0) : null;
    }

    static int e(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = new byte[0x2000];
        int v = 0;
        int v1;
        while((v1 = inputStream0.read(arr_b)) != -1) {
            v += v1;
            outputStream0.write(arr_b, 0, v1);
        }
        return v;
    }

    static void f(InputStream inputStream0, OutputStream outputStream0, int v) throws IOException {
        byte[] arr_b = new byte[0x2000];
        while(v > 0) {
            int v1 = Math.min(v, 0x2000);
            int v2 = inputStream0.read(arr_b, 0, v1);
            if(v2 != v1) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            v -= v2;
            outputStream0.write(arr_b, 0, v2);
        }
    }

    static long g(String s) {
        long v1;
        int v;
        try {
            v = Math.min(s.length(), 3);
            v1 = Long.parseLong(s.substring(0, v));
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
        while(v < 3) {
            v1 *= 10L;
            ++v;
        }
        return v1;
    }

    static boolean h(byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null || arr_b1 == null || arr_b.length < arr_b1.length) {
            return false;
        }
        for(int v = 0; v < arr_b1.length; ++v) {
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        return true;
    }
}

