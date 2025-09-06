package com.kakao.adfit.g;

import android.content.Context;
import com.kakao.adfit.common.matrix.e;
import com.kakao.adfit.k.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlin.text.v;

public final class b implements c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final boolean a(File file0) {
            try {
                return file0.delete();
            }
            catch(Exception unused_ex) {
                return false;
            }
        }
    }

    public static final class com.kakao.adfit.g.b.b implements B3.a, Iterator {
        private final Iterator a;
        private final d b;
        private e c;
        private boolean d;

        public com.kakao.adfit.g.b.b(Iterator iterator0, d d0) {
            L.p(iterator0, "files");
            L.p(d0, "serializer");
            super();
            this.a = iterator0;
            this.b = d0;
        }

        private final e a(File file0) {
            e e0;
            BufferedReader bufferedReader0;
            try {
                bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(file0), f.b), 0x2000);
            }
            catch(FileNotFoundException unused_ex) {
                com.kakao.adfit.m.f.a(("Event file \'" + file0.getAbsolutePath() + "\' disappeared while converting all cached files to events."));
                return null;
            }
            catch(IOException iOException0) {
                com.kakao.adfit.m.f.b(("Error while reading cached event from file " + file0.getAbsolutePath()), iOException0);
                return null;
            }
            try {
                e0 = this.b.a(bufferedReader0);
                com.kakao.adfit.common.matrix.f f0 = e0 == null ? null : e0.g();
                goto label_12;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                try {
                    kotlin.io.c.a(bufferedReader0, throwable0);
                    throw throwable1;
                label_12:
                    if(f0 == null) {
                        kotlin.io.c.a(bufferedReader0, null);
                        return null;
                    }
                    kotlin.io.c.a(bufferedReader0, null);
                    return e0;
                }
                catch(FileNotFoundException unused_ex) {
                }
                catch(IOException iOException0) {
                    com.kakao.adfit.m.f.b(("Error while reading cached event from file " + file0.getAbsolutePath()), iOException0);
                    return null;
                }
            }
            com.kakao.adfit.m.f.a(("Event file \'" + file0.getAbsolutePath() + "\' disappeared while converting all cached files to events."));
            return null;
        }

        public e a() {
            if(this.c == null && !this.hasNext()) {
                throw new NoSuchElementException();
            }
            e e0 = this.c;
            L.m(e0);
            this.c = null;
            return e0;
        }

        @Override
        public boolean hasNext() {
            if(this.d) {
                return false;
            }
            if(this.c == null) {
                while(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    e e0 = this.a(((File)object0));
                    if(e0 != null) {
                        this.c = e0;
                        return true;
                    }
                    b.d.a(((File)object0));
                }
                this.d = true;
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final File a;
    private final int b;
    private final d c;
    public static final a d;

    static {
        b.d = new a(null);
    }

    public b(Context context0, int v, d d0) {
        L.p(context0, "context");
        L.p(d0, "serializer");
        this(new File(context0.getCacheDir(), "com.kakao.adfit.matrix.cache"), v, d0);
    }

    public b(File file0, int v, d d0) {
        L.p(file0, "directory");
        L.p(d0, "serializer");
        super();
        this.a = file0;
        this.b = v;
        this.c = d0;
    }

    private final File a(String s) {
        return new File(this.a.getAbsolutePath(), s + ".matrix-event");
    }

    static boolean a(b b0, File file0, int v, Object object0) {
        if((v & 1) != 0) {
            file0 = b0.a;
        }
        return b0.a(file0);
    }

    private final boolean a(File file0) {
        if((file0.exists() && file0.isDirectory() || file0.mkdirs()) && file0.canWrite() && file0.canRead()) {
            return true;
        }
        com.kakao.adfit.m.f.b(("The directory for caching Matrix events is inaccessible: " + file0.getAbsolutePath()));
        return false;
    }

    // 检测为 Lambda 实现
    private static final boolean a(File file0, String s) [...]

    private final File[] a() {
        if(b.a(this, null, 1, null)) {
            com.kakao.adfit.g.e e0 = (File file0, String s) -> {
                L.o(s, "name");
                return v.N1(s, ".matrix-event", false, 2, null);
            };
            File[] arr_file = this.a.listFiles(e0);
            L.o(arr_file, "directory.listFiles { di…e.endsWith(FILE_SUFFIX) }");
            return arr_file;
        }
        return new File[0];
    }

    @Override  // com.kakao.adfit.g.c
    public void a(e e0) {
        L.p(e0, "event");
        com.kakao.adfit.common.matrix.f f0 = e0.g();
        String s = f0 == null ? null : f0.toString();
        if(s != null && s.length() != 0) {
            if(this.b() >= this.b) {
                com.kakao.adfit.m.f.e(("Disk cache full (respecting maxSize). Not storing event: " + s));
                return;
            }
            File file0 = this.a(s);
            if(file0.exists()) {
                com.kakao.adfit.m.f.e(("Not adding Event to offline storage because it already exists: " + file0.getAbsolutePath()));
                return;
            }
            try {
                BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), f.b), 0x2000);
                try {
                    this.c.a(e0, bufferedWriter0);
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(bufferedWriter0, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(bufferedWriter0, null);
            }
            catch(Exception exception0) {
                com.kakao.adfit.m.f.b(("Error writing Event to offline storage: " + s), exception0);
                b.d.a(file0);
            }
            return;
        }
        com.kakao.adfit.m.f.b("Event ID is empty");
    }

    private final int b() {
        return this.a().length;
    }

    @Override  // com.kakao.adfit.g.c
    public void b(e e0) {
        L.p(e0, "event");
        com.kakao.adfit.common.matrix.f f0 = e0.g();
        String s = f0 == null ? null : f0.toString();
        if(s != null && s.length() != 0) {
            File file0 = this.a(s);
            if(!file0.exists()) {
                com.kakao.adfit.m.f.a(("Event was not cached: " + file0.getAbsolutePath()));
                return;
            }
            if(!b.d.a(file0)) {
                com.kakao.adfit.m.f.b(("Failed to delete Event: " + file0.getAbsolutePath()));
            }
            return;
        }
        com.kakao.adfit.m.f.b("Event ID is empty");
    }

    @Override
    public Iterator iterator() {
        return new com.kakao.adfit.g.b.b(i.a(this.a()), this.c);
    }
}

