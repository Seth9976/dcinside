package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements Closeable {
    class a implements Callable {
        final b a;

        public Void a() throws Exception {
            synchronized(b.this) {
                if(b.this.i == null) {
                    return null;
                }
                b.this.T0();
                if(b.this.d0()) {
                    b.this.u0();
                    b.this.k = 0;
                }
                return null;
            }
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    static final class com.bumptech.glide.disklrucache.b.b implements ThreadFactory {
        private com.bumptech.glide.disklrucache.b.b() {
        }

        com.bumptech.glide.disklrucache.b.b(a b$a0) {
        }

        @Override
        public Thread newThread(Runnable runnable0) {
            synchronized(this) {
                Thread thread0 = new Thread(runnable0, "glide-disk-lru-cache-thread");
                thread0.setPriority(1);
                return thread0;
            }
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        final b d;

        private c(d b$d0) {
            this.a = b$d0;
            this.b = b$d0.e ? null : new boolean[b0.g];
        }

        c(d b$d0, a b$a0) {
            this(b$d0);
        }

        public void a() throws IOException {
            b.this.s(this, false);
        }

        public void b() {
            if(!this.c) {
                try {
                    this.a();
                }
                catch(IOException unused_ex) {
                }
            }
        }

        public void e() throws IOException {
            b.this.s(this, true);
            this.c = true;
        }

        public File f(int v) throws IOException {
            synchronized(b.this) {
                if(this.a.f == this) {
                    if(!this.a.e) {
                        this.b[v] = true;
                    }
                    File file0 = this.a.k(v);
                    b.this.a.mkdirs();
                    return file0;
                }
            }
            throw new IllegalStateException();
        }

        public String g(int v) throws IOException {
            InputStream inputStream0 = this.h(v);
            return inputStream0 == null ? null : b.Y(inputStream0);
        }

        private InputStream h(int v) throws IOException {
            synchronized(b.this) {
                if(this.a.f == this) {
                    if(!this.a.e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.a.j(v));
                    }
                    catch(FileNotFoundException unused_ex) {
                        return null;
                    }
                }
            }
            throw new IllegalStateException();
        }

        public void i(int v, String s) throws IOException {
            OutputStreamWriter outputStreamWriter0;
            try {
                outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(this.f(v)), com.bumptech.glide.disklrucache.d.b);
                outputStreamWriter0.write(s);
            }
            finally {
                com.bumptech.glide.disklrucache.d.a(outputStreamWriter0);
            }
        }
    }

    final class d {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;
        final b h;

        private d(String s) {
            this.a = s;
            this.b = new long[b0.g];
            this.c = new File[b0.g];
            this.d = new File[b0.g];
            StringBuilder stringBuilder0 = new StringBuilder(s);
            stringBuilder0.append('.');
            int v = stringBuilder0.length();
            for(int v1 = 0; v1 < b0.g; ++v1) {
                stringBuilder0.append(v1);
                File[] arr_file = this.c;
                arr_file[v1] = new File(b0.a, stringBuilder0.toString());
                stringBuilder0.append(".tmp");
                File[] arr_file1 = this.d;
                arr_file1[v1] = new File(b0.a, stringBuilder0.toString());
                stringBuilder0.setLength(v);
            }
        }

        d(String s, a b$a0) {
            this(s);
        }

        public File j(int v) {
            return this.c[v];
        }

        public File k(int v) {
            return this.d[v];
        }

        public String l() throws IOException {
            StringBuilder stringBuilder0 = new StringBuilder();
            long[] arr_v = this.b;
            for(int v = 0; v < arr_v.length; ++v) {
                long v1 = arr_v[v];
                stringBuilder0.append(' ');
                stringBuilder0.append(v1);
            }
            return stringBuilder0.toString();
        }

        private IOException m(String[] arr_s) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
        }

        private void n(String[] arr_s) throws IOException {
            if(arr_s.length == b.this.g) {
                try {
                    for(int v = 0; v < arr_s.length; ++v) {
                        this.b[v] = Long.parseLong(arr_s[v]);
                    }
                    return;
                }
                catch(NumberFormatException unused_ex) {
                    throw this.m(arr_s);
                }
            }
            throw this.m(arr_s);
        }
    }

    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;
        final b e;

        private e(String s, long v, File[] arr_file, long[] arr_v) {
            this.a = s;
            this.b = v;
            this.d = arr_file;
            this.c = arr_v;
        }

        e(String s, long v, File[] arr_file, long[] arr_v, a b$a0) {
            this(s, v, arr_file, arr_v);
        }

        public c a() throws IOException {
            return b.this.x(this.a, this.b);
        }

        public File b(int v) {
            return this.d[v];
        }

        public long c(int v) {
            return this.c[v];
        }

        public String d(int v) throws IOException {
            return b.Y(new FileInputStream(this.d[v]));
        }
    }

    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private long h;
    private Writer i;
    private final LinkedHashMap j;
    private int k;
    private long l;
    final ThreadPoolExecutor m;
    private final Callable n;
    static final String o = "journal";
    static final String p = "journal.tmp";
    static final String q = "journal.bkp";
    static final String r = "libcore.io.DiskLruCache";
    static final String s = "1";
    static final long t = -1L;
    private static final String u = "CLEAN";
    private static final String v = "DIRTY";
    private static final String w = "REMOVE";
    private static final String x = "READ";

    private b(File file0, int v, int v1, long v2) {
        this.h = 0L;
        this.j = new LinkedHashMap(0, 0.75f, true);
        this.l = 0L;
        this.m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.bumptech.glide.disklrucache.b.b(null));
        this.n = new a(this);
        this.a = file0;
        this.e = v;
        this.b = new File(file0, "journal");
        this.c = new File(file0, "journal.tmp");
        this.d = new File(file0, "journal.bkp");
        this.g = v1;
        this.f = v2;
    }

    private static void E0(File file0, File file1, boolean z) throws IOException {
        if(z) {
            b.v(file1);
        }
        if(!file0.renameTo(file1)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    private static void L(Writer writer0) throws IOException {
        if(Build.VERSION.SDK_INT < 26) {
            writer0.flush();
            return;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            writer0.flush();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    public void L0(long v) {
        synchronized(this) {
            this.f = v;
            this.m.submit(this.n);
        }
    }

    public e Q(String s) throws IOException {
        synchronized(this) {
            this.p();
            d b$d0 = (d)this.j.get(s);
            if(b$d0 == null) {
                return null;
            }
            if(!b$d0.e) {
                return null;
            }
            File[] arr_file = b$d0.c;
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                if(!arr_file[v1].exists()) {
                    return null;
                }
            }
            ++this.k;
            this.i.append("READ");
            this.i.append(' ');
            this.i.append(s);
            this.i.append('\n');
            if(this.d0()) {
                this.m.submit(this.n);
            }
            return new e(this, s, b$d0.g, b$d0.c, b$d0.b, null);
        }
    }

    public File R() {
        return this.a;
    }

    public long T() {
        synchronized(this) {
        }
        return this.f;
    }

    private void T0() throws IOException {
        while(this.h > this.f) {
            Object object0 = this.j.entrySet().iterator().next();
            this.x0(((String)((Map.Entry)object0).getKey()));
        }
    }

    private static String Y(InputStream inputStream0) throws IOException {
        return com.bumptech.glide.disklrucache.d.c(new InputStreamReader(inputStream0, com.bumptech.glide.disklrucache.d.b));
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            if(this.i == null) {
                return;
            }
            for(Object object0: new ArrayList(this.j.values())) {
                d b$d0 = (d)object0;
                if(b$d0.f != null) {
                    b$d0.f.a();
                }
            }
            this.T0();
            b.q(this.i);
            this.i = null;
        }
    }

    private boolean d0() {
        return this.k >= 2000 && this.k >= this.j.size();
    }

    public static b e0(File file0, int v, int v1, long v2) throws IOException {
        if(v2 <= 0L) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file1 = new File(file0, "journal.bkp");
        if(file1.exists()) {
            File file2 = new File(file0, "journal");
            if(file2.exists()) {
                file1.delete();
            }
            else {
                b.E0(file1, file2, false);
            }
        }
        b b0 = new b(file0, v, v1, v2);
        if(b0.b.exists()) {
            try {
                b0.h0();
                b0.f0();
                return b0;
            }
            catch(IOException iOException0) {
                System.out.println("DiskLruCache " + file0 + " is corrupt: " + iOException0.getMessage() + ", removing");
                b0.t();
            }
        }
        file0.mkdirs();
        b b1 = new b(file0, v, v1, v2);
        b1.u0();
        return b1;
    }

    private void f0() throws IOException {
        b.v(this.c);
        Iterator iterator0 = this.j.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            d b$d0 = (d)object0;
            int v = 0;
            if(b$d0.f == null) {
                while(v < this.g) {
                    this.h += b$d0.b[v];
                    ++v;
                }
            }
            else {
                b$d0.f = null;
                while(v < this.g) {
                    b.v(b$d0.j(v));
                    b.v(b$d0.k(v));
                    ++v;
                }
                iterator0.remove();
            }
        }
    }

    public void flush() throws IOException {
        synchronized(this) {
            this.p();
            this.T0();
            b.L(this.i);
        }
    }

    private void h0() throws IOException {
        String s4;
        String s3;
        String s1;
        String s;
        com.bumptech.glide.disklrucache.c c0 = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.b), com.bumptech.glide.disklrucache.d.a);
        try {
            s = c0.e();
            s1 = c0.e();
            String s2 = c0.e();
            s3 = c0.e();
            s4 = c0.e();
            if("libcore.io.DiskLruCache".equals(s) && "1".equals(s1) && Integer.toString(this.e).equals(s2) && Integer.toString(this.g).equals(s3) && "".equals(s4)) {
                int v1 = 0;
                try {
                    while(true) {
                        this.l0(c0.e());
                        ++v1;
                    }
                }
                catch(EOFException unused_ex) {
                    this.k = v1 - this.j.size();
                    if(c0.c()) {
                        this.u0();
                    }
                    else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.disklrucache.d.a));
                    }
                    return;
                }
            }
        }
        finally {
            com.bumptech.glide.disklrucache.d.a(c0);
        }
        throw new IOException("unexpected journal header: [" + s + ", " + s1 + ", " + s3 + ", " + s4 + "]");
    }

    public boolean isClosed() {
        synchronized(this) {
        }
        return this.i == null;
    }

    private void l0(String s) throws IOException {
        String s1;
        int v = s.indexOf(0x20);
        if(v == -1) {
            throw new IOException("unexpected journal line: " + s);
        }
        int v1 = s.indexOf(0x20, v + 1);
        if(v1 == -1) {
            s1 = s.substring(v + 1);
            if(v == 6 && s.startsWith("REMOVE")) {
                this.j.remove(s1);
                return;
            }
        }
        else {
            s1 = s.substring(v + 1, v1);
        }
        d b$d0 = (d)this.j.get(s1);
        if(b$d0 == null) {
            b$d0 = new d(this, s1, null);
            this.j.put(s1, b$d0);
        }
        if(v1 != -1 && v == 5 && s.startsWith("CLEAN")) {
            b$d0.e = true;
            b$d0.f = null;
            b$d0.n(s.substring(v1 + 1).split(" "));
            return;
        }
        if(v1 == -1 && v == 5 && s.startsWith("DIRTY")) {
            b$d0.f = new c(this, b$d0, null);
            return;
        }
        if(v1 != -1 || v != 4 || !s.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + s);
        }
    }

    private void p() {
        if(this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void q(Writer writer0) throws IOException {
        if(Build.VERSION.SDK_INT < 26) {
            writer0.close();
            return;
        }
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitUnbufferedIo().build());
        try {
            writer0.close();
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }

    private void s(c b$c0, boolean z) throws IOException {
        synchronized(this) {
            d b$d0 = b$c0.a;
            if(b$d0.f == b$c0) {
                if(z && !b$d0.e) {
                    int v2 = 0;
                    while(v2 < this.g) {
                        if(b$c0.b[v2]) {
                            if(!b$d0.k(v2).exists()) {
                                b$c0.a();
                                return;
                            }
                            ++v2;
                            continue;
                        }
                        b$c0.a();
                        throw new IllegalStateException("Newly created entry didn\'t create value for index " + v2);
                    }
                }
                for(int v1 = 0; v1 < this.g; ++v1) {
                    File file0 = b$d0.k(v1);
                    if(!z) {
                        b.v(file0);
                    }
                    else if(file0.exists()) {
                        File file1 = b$d0.j(v1);
                        file0.renameTo(file1);
                        long v3 = b$d0.b[v1];
                        long v4 = file1.length();
                        b$d0.b[v1] = v4;
                        this.h = this.h - v3 + v4;
                    }
                }
                ++this.k;
                b$d0.f = null;
                if((b$d0.e | z) == 0) {
                    this.j.remove(b$d0.a);
                    this.i.append("REMOVE");
                    this.i.append(' ');
                    this.i.append(b$d0.a);
                    this.i.append('\n');
                }
                else {
                    b$d0.e = true;
                    this.i.append("CLEAN");
                    this.i.append(' ');
                    this.i.append(b$d0.a);
                    this.i.append(b$d0.l());
                    this.i.append('\n');
                    if(z) {
                        long v5 = this.l;
                        this.l = v5 + 1L;
                        b$d0.g = v5;
                    }
                }
                b.L(this.i);
                if(this.h > this.f || this.d0()) {
                    this.m.submit(this.n);
                }
                return;
            }
        }
        throw new IllegalStateException();
    }

    public long size() {
        synchronized(this) {
        }
        return this.h;
    }

    public void t() throws IOException {
        this.close();
        com.bumptech.glide.disklrucache.d.b(this.a);
    }

    private void u0() throws IOException {
        synchronized(this) {
            Writer writer0 = this.i;
            if(writer0 != null) {
                b.q(writer0);
            }
            BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), com.bumptech.glide.disklrucache.d.a));
            try {
                bufferedWriter0.write("libcore.io.DiskLruCache");
                bufferedWriter0.write("\n");
                bufferedWriter0.write("1");
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.e));
                bufferedWriter0.write("\n");
                bufferedWriter0.write(Integer.toString(this.g));
                bufferedWriter0.write("\n");
                bufferedWriter0.write("\n");
                Iterator iterator0 = this.j.values().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_28;
                    }
                    Object object0 = iterator0.next();
                    d b$d0 = (d)object0;
                    if(b$d0.f == null) {
                        bufferedWriter0.write("CLEAN " + b$d0.a + b$d0.l() + '\n');
                    }
                    else {
                        bufferedWriter0.write("DIRTY " + b$d0.a + '\n');
                    }
                }
            }
            catch(Throwable throwable0) {
            }
            b.q(bufferedWriter0);
            throw throwable0;
        label_28:
            b.q(bufferedWriter0);
            if(this.b.exists()) {
                b.E0(this.b, this.d, true);
            }
            b.E0(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.disklrucache.d.a));
        }
    }

    private static void v(File file0) throws IOException {
        if(file0.exists() && !file0.delete()) {
            throw new IOException();
        }
    }

    public c w(String s) throws IOException {
        return this.x(s, -1L);
    }

    private c x(String s, long v) throws IOException {
        synchronized(this) {
            this.p();
            d b$d0 = (d)this.j.get(s);
            if(v != -1L && (b$d0 == null || b$d0.g != v)) {
                return null;
            }
            if(b$d0 == null) {
                b$d0 = new d(this, s, null);
                this.j.put(s, b$d0);
            }
            else if(b$d0.f != null) {
                return null;
            }
            c b$c0 = new c(this, b$d0, null);
            b$d0.f = b$c0;
            this.i.append("DIRTY");
            this.i.append(' ');
            this.i.append(s);
            this.i.append('\n');
            b.L(this.i);
            return b$c0;
        }
    }

    public boolean x0(String s) throws IOException {
        synchronized(this) {
            this.p();
            d b$d0 = (d)this.j.get(s);
            if(b$d0 != null && b$d0.f == null) {
                for(int v1 = 0; v1 < this.g; ++v1) {
                    File file0 = b$d0.j(v1);
                    if(file0.exists() && !file0.delete()) {
                        throw new IOException("failed to delete " + file0);
                    }
                    this.h -= b$d0.b[v1];
                    b$d0.b[v1] = 0L;
                }
                ++this.k;
                this.i.append("REMOVE");
                this.i.append(' ');
                this.i.append(s);
                this.i.append('\n');
                this.j.remove(s);
                if(this.d0()) {
                    this.m.submit(this.n);
                }
                return true;
            }
            return false;
        }
    }
}

