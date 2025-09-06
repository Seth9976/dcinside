package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

public class c extends n {
    public class a extends b {
        private final boolean e;
        private final File f;
        private final int g;
        final c h;

        a(n n0, boolean z) throws IOException {
            super(n0);
            this.e = z;
            this.f = new File(c0.o.getApplicationInfo().nativeLibraryDir);
            this.g = c0.z;
        }

        @Override  // com.facebook.soloader.n$b
        protected com.facebook.soloader.n.a[] f() {
            com.facebook.soloader.n.a[] arr_n$a = this.a;
            if(arr_n$a != null) {
                return arr_n$a;
            }
            com.facebook.soloader.n.a[] arr_n$a1 = this.e();
            this.a = arr_n$a1;
            if(this.e) {
                p.j("BackupSoSource", "Unconditonally extracting all DSOs from zip");
                return this.a;
            }
            if((this.g & 1) == 0) {
                p.j("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
                return this.a;
            }
            for(int v = 0; v < arr_n$a1.length; ++v) {
                com.facebook.soloader.n.a n$a0 = arr_n$a1[v];
                if(this.i(n$a0.c, n$a0.a)) {
                    return this.a;
                }
            }
            com.facebook.soloader.n.a[] arr_n$a2 = new com.facebook.soloader.n.a[0];
            this.a = arr_n$a2;
            return arr_n$a2;
        }

        boolean i(ZipEntry zipEntry0, String s) {
            String s1 = zipEntry0.getName();
            File file0 = new File(this.f, s);
            try {
                if(!file0.getCanonicalPath().startsWith(this.f.getCanonicalPath())) {
                    p.a("BackupSoSource", "Not allowing consideration of " + s1 + ": " + s + " not in lib dir.");
                    return false;
                }
            }
            catch(IOException iOException0) {
                p.j("BackupSoSource", "Not allowing consideration of " + s1 + ": " + s + ", IOException when constructing path: " + iOException0.toString());
                return false;
            }
            if(!file0.isFile()) {
                p.j("BackupSoSource", "Allowing consideration of " + s1 + ": " + s + " not in system lib dir");
                return true;
            }
            long v = file0.length();
            long v1 = zipEntry0.getSize();
            if(v != v1) {
                p.j("BackupSoSource", "Allowing consideration of " + file0 + ": sysdir file length is " + v + ", but the file is " + v1 + " bytes long in the APK");
                return true;
            }
            p.j("BackupSoSource", "Not allowing consideration of " + s1 + ": deferring to libdir");
            return false;
        }
    }

    private static final String A = "BackupSoSource";
    public static final int B = 1;
    private static final byte C = 2;
    private static final byte D = 0;
    private static final byte E = 1;
    private static final byte F = 2;
    private final int z;

    public c(Context context0, File file0, String s, int v) {
        super(context0, s, file0, "^lib/([^/]+)/([^/]+\\.so)$");
        this.z = v;
    }

    public c(Context context0, String s, int v) {
        this(context0, new File(context0.getApplicationInfo().sourceDir), s, v);
    }

    public boolean D() throws IOException {
        try(a c$a0 = new a(this, this, false)) {
            return c$a0.e().length != 0;
        }
    }

    @Override  // com.facebook.soloader.n
    public String f() [...] // Inlined contents

    @Override  // com.facebook.soloader.L
    protected byte[] s() throws IOException {
        File file0 = this.w.getCanonicalFile();
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeByte(2);
            parcel0.writeString(file0.getPath());
            parcel0.writeLong(file0.lastModified());
            parcel0.writeInt(SysUtil.h(this.o));
            if((this.z & 1) == 0) {
                parcel0.writeByte(0);
                return parcel0.marshall();
            }
            String s = this.o.getApplicationInfo().nativeLibraryDir;
            if(s == null) {
                parcel0.writeByte(1);
                return parcel0.marshall();
            }
            File file1 = new File(s).getCanonicalFile();
            if(!file1.exists()) {
                parcel0.writeByte(1);
                return parcel0.marshall();
            }
            parcel0.writeByte(2);
            parcel0.writeString(file1.getPath());
            parcel0.writeLong(file1.lastModified());
            return parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // com.facebook.soloader.n
    protected e w(boolean z) throws IOException {
        return new a(this, this, z);
    }
}

