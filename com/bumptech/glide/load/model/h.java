package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.m;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class h implements g {
    private final i c;
    @Nullable
    private final URL d;
    @Nullable
    private final String e;
    @Nullable
    private String f;
    @Nullable
    private URL g;
    @Nullable
    private volatile byte[] h;
    private int i;
    private static final String j = "@#&=*+-_.,:!?()/~\'%;$";

    public h(String s) {
        this(s, i.b);
    }

    public h(String s, i i0) {
        this.d = null;
        this.e = m.c(s);
        this.c = (i)m.e(i0);
    }

    public h(URL uRL0) {
        this(uRL0, i.b);
    }

    public h(URL uRL0, i i0) {
        this.d = (URL)m.e(uRL0);
        this.e = null;
        this.c = (i)m.e(i0);
    }

    @Override  // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest0) {
        messageDigest0.update(this.d());
    }

    public String c() {
        return this.e == null ? ((URL)m.e(this.d)).toString() : this.e;
    }

    private byte[] d() {
        if(this.h == null) {
            this.h = this.c().getBytes(g.b);
        }
        return this.h;
    }

    public Map e() {
        return this.c.H();
    }

    // 去混淆评级： 低(30)
    @Override  // com.bumptech.glide.load.g
    public boolean equals(Object object0) {
        return object0 instanceof h && this.c().equals(((h)object0).c()) && this.c.equals(((h)object0).c);
    }

    private String f() {
        if(TextUtils.isEmpty(this.f)) {
            this.f = Uri.encode((TextUtils.isEmpty(this.e) ? ((URL)m.e(this.d)).toString() : this.e), "@#&=*+-_.,:!?()/~\'%;$");
        }
        return this.f;
    }

    private URL g() throws MalformedURLException {
        if(this.g == null) {
            this.g = new URL(this.f());
        }
        return this.g;
    }

    public String h() {
        return this.f();
    }

    @Override  // com.bumptech.glide.load.g
    public int hashCode() {
        if(this.i == 0) {
            this.i = this.c().hashCode() * 0x1F + this.c.hashCode();
        }
        return this.i;
    }

    public URL i() throws MalformedURLException {
        return this.g();
    }

    @Override
    public String toString() {
        return this.c();
    }
}

