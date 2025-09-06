package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o3.h;

public class e extends H {
    protected final File j;
    protected final int k;
    protected final List l;
    public static final int m = 1;
    public static final int n = 2;

    public e(File file0, int v) {
        this(file0, v, new String[0]);
    }

    public e(File file0, int v, String[] arr_s) {
        this.j = file0;
        this.k = v;
        this.l = Arrays.asList(arr_s);
    }

    @Override  // com.facebook.soloader.H
    public void c(Collection collection0) {
        try {
            collection0.add(this.j.getCanonicalPath());
        }
        catch(IOException iOException0) {
            p.c("SoLoader", "Failed to get canonical path for " + this.j.getName() + " due to " + iOException0.toString() + ", falling to the absolute one");
            collection0.add(this.j.getAbsolutePath());
        }
    }

    @Override  // com.facebook.soloader.H
    @h
    public String[] d(String s) throws IOException {
        File file0 = this.g(s);
        if(file0 == null) {
            return null;
        }
        try(k k0 = new k(file0)) {
            return s.f(s, k0);
        }
    }

    @Override  // com.facebook.soloader.H
    @h
    public String e(String s) throws IOException {
        File file0 = this.g(s);
        return file0 == null ? null : file0.getCanonicalPath();
    }

    @Override  // com.facebook.soloader.H
    public String f() [...] // 潜在的解密器

    @Override  // com.facebook.soloader.H
    @h
    protected File g(String s) throws IOException {
        File file0 = new File(this.j, s);
        return file0.exists() ? file0 : null;
    }

    @Override  // com.facebook.soloader.H
    public int i(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        return this.l(s, v, this.j, strictMode$ThreadPolicy0);
    }

    @Override  // com.facebook.soloader.H
    @h
    public File k(String s) throws IOException {
        return this.g(s);
    }

    protected int l(String s, int v, File file0, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        if(SoLoader.d != null) {
            if(this.l.contains(s)) {
                p.a("SoLoader", s + " is on the denyList, skip loading from " + file0.getCanonicalPath());
                return 0;
            }
            File file1 = this.g(s);
            if(file1 == null) {
                p.h("SoLoader", s + " file not found on " + file0.getCanonicalPath());
                return 0;
            }
            String s1 = file1.getCanonicalPath();
            p.a("SoLoader", s + " file found at " + s1);
            if((v & 1) != 0 && (this.k & 2) != 0) {
                p.a("SoLoader", s + " loaded implicitly");
                return 2;
            }
            if((this.k & 1) == 0) {
                p.a("SoLoader", "Not resolving dependencies for " + s);
            }
            else {
                try(k k0 = new k(file1)) {
                    s.o(s, k0, v, strictMode$ThreadPolicy0);
                }
            }
            try {
                SoLoader.d.b(s1, v);
                return 1;
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                throw G.b(s, unsatisfiedLinkError0);
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    // 去混淆评级： 低(40)
    @Override  // com.facebook.soloader.H
    public String toString() {
        try {
            return "DirectorySoSource[root = " + this.j.getCanonicalPath() + " flags = " + this.k + ']';
        }
        catch(IOException unused_ex) {
            return "DirectorySoSource[root = " + this.j.getName() + " flags = " + this.k + ']';
        }
    }
}

