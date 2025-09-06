package com.google.common.io;

import J1.a;
import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@a
@c
@d
@q
public final class r extends OutputStream {
    static class com.google.common.io.r.c extends ByteArrayOutputStream {
        private com.google.common.io.r.c() {
        }

        com.google.common.io.r.c(com.google.common.io.r.a r$a0) {
        }

        byte[] a() [...] // 潜在的解密器

        int getCount() {
            return this.count;
        }
    }

    private final int a;
    private final boolean b;
    private final g c;
    @P1.a("this")
    private OutputStream d;
    @P1.a("this")
    @o3.a
    private com.google.common.io.r.c e;
    @P1.a("this")
    @o3.a
    private File f;

    public r(int v) {
        this(v, false);
    }

    public r(int v, boolean z) {
        class com.google.common.io.r.a extends g {
            final r a;

            @Override
            protected void finalize() {
                try {
                    r.this.reset();
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace(System.err);
                }
            }

            @Override  // com.google.common.io.g
            public InputStream m() throws IOException {
                return r.this.e();
            }
        }


        class b extends g {
            final r a;

            @Override  // com.google.common.io.g
            public InputStream m() throws IOException {
                return r.this.e();
            }
        }

        H.k(v >= 0, "fileThreshold must be non-negative, but was %s", v);
        this.a = v;
        this.b = z;
        com.google.common.io.r.c r$c0 = new com.google.common.io.r.c(null);
        this.e = r$c0;
        this.d = r$c0;
        if(z) {
            this.c = new com.google.common.io.r.a(this);
            return;
        }
        this.c = new b(this);
    }

    public g b() {
        return this.c;
    }

    @e
    @o3.a
    File c() {
        synchronized(this) {
        }
        return this.f;
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.d.close();
        }
    }

    private InputStream e() throws IOException {
        synchronized(this) {
            if(this.f != null) {
                return new FileInputStream(this.f);
            }
            Objects.requireNonNull(this.e);
            return new ByteArrayInputStream(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, this.e.getCount());
        }
    }

    @P1.a("this")
    private void f(int v) throws IOException {
        if(this.e != null && this.e.getCount() + v > this.a) {
            File file0 = I.a.b("FileBackedOutputStream");
            if(this.b) {
                file0.deleteOnExit();
            }
            try {
                FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                fileOutputStream0.write(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, this.e.getCount());
                fileOutputStream0.flush();
                this.d = fileOutputStream0;
                this.f = file0;
                this.e = null;
            }
            catch(IOException iOException0) {
                file0.delete();
                throw iOException0;
            }
        }
    }

    @Override
    public void flush() throws IOException {
        synchronized(this) {
            this.d.flush();
        }
    }

    public void reset() throws IOException {
        com.google.common.io.r.c r$c0;
        synchronized(this) {
            try {
                this.close();
                r$c0 = this.e;
            }
            catch(Throwable throwable0) {
                if(this.e == null) {
                    this.e = new com.google.common.io.r.c(null);
                }
                else {
                    this.e.reset();
                }
                this.d = this.e;
                File file0 = this.f;
                if(file0 != null) {
                    this.f = null;
                    if(!file0.delete()) {
                        throw new IOException("Could not delete: " + file0);
                    }
                }
                throw throwable0;
            }
        }
        if(r$c0 == null) {
            this.e = new com.google.common.io.r.c(null);
        }
        else {
            r$c0.reset();
        }
        this.d = this.e;
        File file1 = this.f;
        if(file1 != null) {
            this.f = null;
            if(!file1.delete()) {
                throw new IOException("Could not delete: " + file1);
            }
        }
    }

    @Override
    public void write(int v) throws IOException {
        synchronized(this) {
            this.f(1);
            this.d.write(v);
        }
    }

    @Override
    public void write(byte[] arr_b) throws IOException {
        synchronized(this) {
            this.write(arr_b, 0, arr_b.length);
        }
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        synchronized(this) {
            this.f(v1);
            this.d.write(arr_b, v, v1);
        }
    }
}

