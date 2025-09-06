package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import o3.h;

public class a extends H implements z {
    private final int j;
    private e k;

    public a(Context context0, int v) {
        this.j = v;
        this.k = new e(a.l(context0), v);
    }

    @Override  // com.facebook.soloader.z
    public H b(Context context0) {
        this.k = new e(a.l(context0), this.j | 1);
        return this;
    }

    @Override  // com.facebook.soloader.H
    public void c(Collection collection0) {
        this.k.c(collection0);
    }

    @Override  // com.facebook.soloader.H
    @h
    public String[] d(String s) throws IOException {
        return this.k.d(s);
    }

    @Override  // com.facebook.soloader.H
    @h
    public String e(String s) throws IOException {
        return this.k.e(s);
    }

    @Override  // com.facebook.soloader.H
    public String f() [...] // Inlined contents

    @Override  // com.facebook.soloader.H
    @h
    public File g(String s) throws IOException {
        return this.k.g(s);
    }

    @Override  // com.facebook.soloader.H
    public int i(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        return this.k.i(s, v, strictMode$ThreadPolicy0);
    }

    @Override  // com.facebook.soloader.H
    protected void j(int v) throws IOException {
        this.k.j(v);
    }

    @Override  // com.facebook.soloader.H
    @h
    public File k(String s) throws IOException {
        return this.k.k(s);
    }

    private static File l(Context context0) {
        return new File(context0.getApplicationInfo().nativeLibraryDir);
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.soloader.H
    public String toString() {
        return "ApplicationSoSource[" + this.k.toString() + "]";
    }
}

