package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jeb.synthetic.TWR;
import o3.h;

public class n extends L {
    public static final class a extends c implements Comparable {
        final ZipEntry c;
        final int d;

        a(String s, ZipEntry zipEntry0, int v) {
            super(s, String.valueOf(zipEntry0.getCrc()));
            this.c = zipEntry0;
            this.d = v;
        }

        public int a(a n$a0) {
            return this.a.compareTo(n$a0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((a)object0));
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return a.class == class0 && (this.c.equals(((a)object0).c) && this.d == ((a)object0).d);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.d * 0x1F + this.c.hashCode();
        }
    }

    public class b extends e {
        @h
        protected a[] a;
        private final ZipFile b;
        private final L c;
        final n d;

        b(L l0) throws IOException {
            this.b = new ZipFile(n0.w);
            this.c = l0;
        }

        @Override  // com.facebook.soloader.L$e
        public final c[] b() throws IOException {
            return this.f();
        }

        @Override  // com.facebook.soloader.L$e
        public void c(File file0) throws IOException {
            a[] arr_n$a = this.f();
            for(int v = 0; v < arr_n$a.length; ++v) {
                a n$a0 = arr_n$a[v];
                InputStream inputStream0 = this.b.getInputStream(n$a0.c);
                try(d l$d0 = new d(n$a0, inputStream0)) {
                    inputStream0 = null;
                    this.a(l$d0, new byte[0x8000], file0);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(inputStream0, throwable0);
                    throw throwable0;
                }
            }
        }

        @Override  // com.facebook.soloader.L$e
        public void close() throws IOException {
            this.b.close();
        }

        a[] e() {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            HashMap hashMap0 = new HashMap();
            Pattern pattern0 = Pattern.compile(n.this.x);
            String[] arr_s = SysUtil.m();
            Enumeration enumeration0 = this.b.entries();
            while(enumeration0.hasMoreElements()) {
                ZipEntry zipEntry0 = (ZipEntry)enumeration0.nextElement();
                Matcher matcher0 = pattern0.matcher(zipEntry0.getName());
                if(matcher0.matches()) {
                    String s = matcher0.group(1);
                    String s1 = matcher0.group(2);
                    int v = SysUtil.e(arr_s, s);
                    if(v >= 0) {
                        linkedHashSet0.add(s);
                        a n$a0 = (a)hashMap0.get(s1);
                        if(n$a0 == null || v < n$a0.d) {
                            hashMap0.put(s1, new a(s1, zipEntry0, v));
                        }
                    }
                }
            }
            String[] arr_s1 = (String[])linkedHashSet0.toArray(new String[linkedHashSet0.size()]);
            this.c.A(arr_s1);
            a[] arr_n$a = (a[])hashMap0.values().toArray(new a[hashMap0.size()]);
            Arrays.sort(arr_n$a);
            return arr_n$a;
        }

        a[] f() {
            a[] arr_n$a = this.a;
            if(arr_n$a != null) {
                return arr_n$a;
            }
            a[] arr_n$a1 = this.e();
            this.a = arr_n$a1;
            return arr_n$a1;
        }
    }

    protected final File w;
    protected final String x;
    private static final String y = "soloader.ExtractFromZipSoSource";

    public n(Context context0, String s, File file0, String s1) {
        super(context0, s);
        this.w = file0;
        this.x = s1;
    }

    @Override  // com.facebook.soloader.e
    public String f() {
        return "ExtractFromZipSoSource";
    }

    @Override  // com.facebook.soloader.L
    protected String n(File file0) {
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            CRC32 cRC320 = new CRC32();
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = fileInputStream0.read(arr_b)) != -1) {
                cRC320.update(arr_b, 0, v);
            }
            return String.valueOf(cRC320.getValue());
        }
        catch(IOException iOException0) {
            p.k("soloader.ExtractFromZipSoSource", "Failed to compute file hash ", iOException0);
            return "";
        }
    }

    @Override  // com.facebook.soloader.L
    protected e w(boolean z) throws IOException {
        return new b(this, this);
    }
}

