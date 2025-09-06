package com.google.firebase.crashlytics.internal.metadata;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class g implements Closeable {
    static class b {
        final int a;
        final int b;
        static final int c = 4;
        static final b d;

        static {
            b.d = new b(0, 0);
        }

        b(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    final class c extends InputStream {
        private int a;
        private int b;
        final g c;

        private c(b g$b0) {
            this.a = g0.h0(g$b0.a + 4);
            this.b = g$b0.b;
        }

        c(b g$b0, a g$a0) {
            this(g$b0);
        }

        @Override
        public int read() throws IOException {
            if(this.b == 0) {
                return -1;
            }
            g.this.a.seek(((long)this.a));
            int v = g.this.a.read();
            this.a = g.this.h0(this.a + 1);
            --this.b;
            return v;
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) throws IOException {
            g.s(arr_b, "buffer");
            if((v | v1) < 0 || v1 > arr_b.length - v) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int v2 = this.b;
            if(v2 > 0) {
                if(v1 > v2) {
                    v1 = v2;
                }
                g.this.Y(this.a, arr_b, v, v1);
                this.a = g.this.h0(this.a + v1);
                this.b -= v1;
                return v1;
            }
            return -1;
        }
    }

    public interface d {
        void c(InputStream arg1, int arg2) throws IOException;
    }

    private final RandomAccessFile a;
    int b;
    private int c;
    private b d;
    private b e;
    private final byte[] f;
    private static final Logger g = null;
    private static final int h = 0x1000;
    static final int i = 16;

    static {
        g.g = Logger.getLogger("com.google.firebase.crashlytics.internal.metadata.g");
    }

    public g(File file0) throws IOException {
        this.f = new byte[16];
        if(!file0.exists()) {
            g.p(file0);
        }
        this.a = g.t(file0);
        this.L();
    }

    g(RandomAccessFile randomAccessFile0) throws IOException {
        this.f = new byte[16];
        this.a = randomAccessFile0;
        this.L();
    }

    private void L() throws IOException {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int v = g.Q(this.f, 0);
        this.b = v;
        if(((long)v) > this.a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
        }
        this.c = g.Q(this.f, 4);
        int v1 = g.Q(this.f, 8);
        int v2 = g.Q(this.f, 12);
        this.d = this.x(v1);
        this.e = this.x(v2);
    }

    private static int Q(byte[] arr_b, int v) {
        return ((arr_b[v] & 0xFF) << 24) + ((arr_b[v + 1] & 0xFF) << 16) + ((arr_b[v + 2] & 0xFF) << 8) + (arr_b[v + 3] & 0xFF);
    }

    private int R() {
        return this.b - this.f0();
    }

    public void T() throws IOException {
        synchronized(this) {
            if(!this.q()) {
                if(this.c == 1) {
                    this.j();
                }
                else {
                    int v1 = this.h0(this.d.a + 4 + this.d.b);
                    this.Y(v1, this.f, 0, 4);
                    int v2 = g.Q(this.f, 0);
                    this.l0(this.b, this.c - 1, v1, this.e.a);
                    --this.c;
                    this.d = new b(v1, v2);
                }
                return;
            }
        }
        throw new NoSuchElementException();
    }

    private void Y(int v, byte[] arr_b, int v1, int v2) throws IOException {
        int v3 = this.h0(v);
        int v4 = this.b;
        if(v3 + v2 <= v4) {
            this.a.seek(((long)v3));
            this.a.readFully(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        this.a.seek(((long)v3));
        this.a.readFully(arr_b, v1, v5);
        this.a.seek(16L);
        this.a.readFully(arr_b, v1 + v5, v2 - v5);
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.a.close();
        }
    }

    private void d0(int v, byte[] arr_b, int v1, int v2) throws IOException {
        int v3 = this.h0(v);
        int v4 = this.b;
        if(v3 + v2 <= v4) {
            this.a.seek(((long)v3));
            this.a.write(arr_b, v1, v2);
            return;
        }
        int v5 = v4 - v3;
        this.a.seek(((long)v3));
        this.a.write(arr_b, v1, v5);
        this.a.seek(16L);
        this.a.write(arr_b, v1 + v5, v2 - v5);
    }

    private void e0(int v) throws IOException {
        this.a.setLength(((long)v));
        this.a.getChannel().force(true);
    }

    public void f(byte[] arr_b) throws IOException {
        this.i(arr_b, 0, arr_b.length);
    }

    public int f0() {
        if(this.c == 0) {
            return 16;
        }
        int v = this.e.a;
        int v1 = this.d.a;
        return v < v1 ? v + 4 + this.e.b + this.b - v1 : v - v1 + 4 + this.e.b + 16;
    }

    private int h0(int v) {
        return v < this.b ? v : v + 16 - this.b;
    }

    public void i(byte[] arr_b, int v, int v1) throws IOException {
        synchronized(this) {
            g.s(arr_b, "buffer");
            if((v | v1) >= 0 && v1 <= arr_b.length - v) {
                this.k(v1);
                boolean z = this.q();
                b g$b0 = new b((z ? 16 : this.h0(this.e.a + 4 + this.e.b)), v1);
                g.u0(this.f, 0, v1);
                this.d0(g$b0.a, this.f, 0, 4);
                this.d0(g$b0.a + 4, arr_b, v, v1);
                this.l0(this.b, this.c + 1, (z ? g$b0.a : this.d.a), g$b0.a);
                this.e = g$b0;
                ++this.c;
                if(z) {
                    this.d = g$b0;
                }
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void j() throws IOException {
        synchronized(this) {
            this.l0(0x1000, 0, 0, 0);
            this.c = 0;
            this.d = b.d;
            this.e = b.d;
            if(this.b > 0x1000) {
                this.e0(0x1000);
            }
            this.b = 0x1000;
        }
    }

    private void k(int v) throws IOException {
        int v1 = this.R();
        if(v1 >= v + 4) {
            return;
        }
        int v2 = this.b;
        do {
            v1 += v2;
            v2 <<= 1;
        }
        while(v1 < v + 4);
        this.e0(v2);
        int v3 = this.h0(this.e.a + 4 + this.e.b);
        if(v3 < this.d.a) {
            FileChannel fileChannel0 = this.a.getChannel();
            fileChannel0.position(((long)this.b));
            if(fileChannel0.transferTo(16L, ((long)(v3 - 4)), fileChannel0) != ((long)(v3 - 4))) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int v4 = this.e.a;
        int v5 = this.d.a;
        if(v4 < v5) {
            int v6 = this.b + v4 - 16;
            this.l0(v2, this.c, v5, v6);
            this.e = new b(v6, this.e.b);
        }
        else {
            this.l0(v2, this.c, v5, v4);
        }
        this.b = v2;
    }

    private void l0(int v, int v1, int v2, int v3) throws IOException {
        g.x0(this.f, new int[]{v, v1, v2, v3});
        this.a.seek(0L);
        this.a.write(this.f);
    }

    public void n(d g$d0) throws IOException {
        synchronized(this) {
            int v1 = this.d.a;
            for(int v2 = 0; v2 < this.c; ++v2) {
                b g$b0 = this.x(v1);
                g$d0.c(new c(this, g$b0, null), g$b0.b);
                v1 = this.h0(g$b0.a + 4 + g$b0.b);
            }
        }
    }

    public boolean o(int v, int v1) {
        return this.f0() + 4 + v <= v1;
    }

    private static void p(File file0) throws IOException {
        File file1 = new File(file0.getPath() + ".tmp");
        try(RandomAccessFile randomAccessFile0 = g.t(file1)) {
            randomAccessFile0.setLength(0x1000L);
            randomAccessFile0.seek(0L);
            byte[] arr_b = new byte[16];
            g.x0(arr_b, new int[]{0x1000, 0, 0, 0});
            randomAccessFile0.write(arr_b);
        }
        if(!file1.renameTo(file0)) {
            throw new IOException("Rename failed!");
        }
    }

    public boolean q() {
        synchronized(this) {
        }
        return this.c == 0;
    }

    private static Object s(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public int size() {
        synchronized(this) {
        }
        return this.c;
    }

    private static RandomAccessFile t(File file0) throws FileNotFoundException {
        return new RandomAccessFile(file0, "rwd");
    }

    @Override
    public String toString() {
        class a implements d {
            boolean a;
            final StringBuilder b;
            final g c;

            a(StringBuilder stringBuilder0) {
                this.b = stringBuilder0;
                super();
                this.a = true;
            }

            @Override  // com.google.firebase.crashlytics.internal.metadata.g$d
            public void c(InputStream inputStream0, int v) throws IOException {
                if(this.a) {
                    this.a = false;
                }
                else {
                    this.b.append(", ");
                }
                this.b.append(v);
            }
        }

        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append('[');
        stringBuilder0.append("fileLength=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", size=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", first=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", last=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", element lengths=[");
        try {
            this.n(new a(this, stringBuilder0));
        }
        catch(IOException iOException0) {
            g.g.log(Level.WARNING, "read error", iOException0);
        }
        stringBuilder0.append("]]");
        return stringBuilder0.toString();
    }

    private static void u0(byte[] arr_b, int v, int v1) {
        arr_b[v] = (byte)(v1 >> 24);
        arr_b[v + 1] = (byte)(v1 >> 16);
        arr_b[v + 2] = (byte)(v1 >> 8);
        arr_b[v + 3] = (byte)v1;
    }

    public void v(d g$d0) throws IOException {
        synchronized(this) {
            if(this.c > 0) {
                g$d0.c(new c(this, this.d, null), this.d.b);
            }
        }
    }

    public byte[] w() throws IOException {
        synchronized(this) {
            if(this.q()) {
                return null;
            }
            b g$b0 = this.d;
            byte[] arr_b = new byte[g$b0.b];
            this.Y(g$b0.a + 4, arr_b, 0, g$b0.b);
            return arr_b;
        }
    }

    private b x(int v) throws IOException {
        if(v == 0) {
            return b.d;
        }
        this.a.seek(((long)v));
        return new b(v, this.a.readInt());
    }

    private static void x0(byte[] arr_b, int[] arr_v) {
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            g.u0(arr_b, v1, arr_v[v]);
            v1 += 4;
        }
    }
}

