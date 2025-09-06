package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o3.h;
import p3.d;

@d
public class com.facebook.soloader.d extends H implements z {
    private final Map j;
    private final Map k;
    private final Set l;

    public com.facebook.soloader.d(Context context0) {
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = com.facebook.soloader.d.r(context0);
    }

    public com.facebook.soloader.d(Set set0) {
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = set0;
    }

    @Override  // com.facebook.soloader.z
    public H b(Context context0) {
        H h0 = new com.facebook.soloader.d(context0);
        try {
            ((com.facebook.soloader.d)h0).v();
            return h0;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    @Override  // com.facebook.soloader.H
    @h
    public String e(String s) throws IOException {
        for(Object object0: this.l) {
            String s1 = (String)object0;
            Set set0 = (Set)this.j.get(s1);
            if(!TextUtils.isEmpty(s1) && set0 != null && set0.contains(s)) {
                return s1 + "/" + s;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // com.facebook.soloader.H
    public String f() [...] // Inlined contents

    @Override  // com.facebook.soloader.H
    public int i(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        if(SoLoader.d == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for(Object object0: this.l) {
            String s1 = (String)object0;
            Set set0 = (Set)this.j.get(s1);
            if(!TextUtils.isEmpty(s1) && set0 != null && set0.contains(s)) {
                this.u(s1, s, v, strictMode$ThreadPolicy0);
                try {
                    v |= 4;
                    SoLoader.d.b(s1 + "/" + s, v);
                }
                catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                    p.k("SoLoader", s + " not found on " + s1 + " flag: " + v, unsatisfiedLinkError0);
                    continue;
                }
                p.a("SoLoader", s + " found on " + s1);
                return 1;
            }
            p.h("SoLoader", s + " not found on " + s1);
        }
        return 0;
    }

    @Override  // com.facebook.soloader.H
    protected void j(int v) throws IOException {
        this.v();
    }

    @Override  // com.facebook.soloader.H
    public File k(String s) throws IOException {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn\'t support unpackLibrary");
    }

    private void l(String s, String s1, String s2) {
        synchronized(this.k) {
            String s3 = s + s1;
            if(!this.k.containsKey(s3)) {
                HashSet hashSet0 = new HashSet();
                this.k.put(s3, hashSet0);
            }
            ((Set)this.k.get(s3)).add(s2);
        }
    }

    private void m(String s, String s1) {
        synchronized(this.j) {
            if(!this.j.containsKey(s)) {
                HashSet hashSet0 = new HashSet();
                this.j.put(s, hashSet0);
            }
            ((Set)this.j.get(s)).add(s1);
        }
    }

    private void n(String s, String s1) throws IOException {
        try(ZipFile zipFile0 = new ZipFile(com.facebook.soloader.d.p(s))) {
            Enumeration enumeration0 = zipFile0.entries();
            while(true) {
                if(!enumeration0.hasMoreElements()) {
                    break;
                }
                ZipEntry zipEntry0 = (ZipEntry)enumeration0.nextElement();
                if(zipEntry0 != null && zipEntry0.getName().endsWith("/" + s1)) {
                    this.o(s, zipFile0, zipEntry0, s1);
                }
            }
        }
    }

    private void o(String s, ZipFile zipFile0, ZipEntry zipEntry0, String s1) throws IOException {
        try(l l0 = new l(zipFile0, zipEntry0)) {
            String[] arr_s = s.f(s1, l0);
            for(int v = 0; true; ++v) {
                if(v >= arr_s.length) {
                    break;
                }
                String s2 = arr_s[v];
                if(!s2.startsWith("/")) {
                    this.l(s, s1, s2);
                }
            }
        }
    }

    private static String p(String s) {
        return s.substring(0, s.indexOf(33));
    }

    @h
    private Set q(String s, String s1) {
        synchronized(this.k) {
        }
        return (Set)this.k.get(s + s1);
    }

    static Set r(Context context0) {
        Set set0 = new HashSet();
        String s = com.facebook.soloader.d.s(context0.getApplicationInfo().sourceDir);
        if(s != null) {
            set0.add(s);
        }
        if(context0.getApplicationInfo().splitSourceDirs != null) {
            String[] arr_s = context0.getApplicationInfo().splitSourceDirs;
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = com.facebook.soloader.d.s(arr_s[v]);
                if(s1 != null) {
                    set0.add(s1);
                }
            }
        }
        return set0;
    }

    @h
    private static String s(String s) {
        String[] arr_s = SysUtil.m();
        String s1 = "empty";
        if(s != null && !s.isEmpty()) {
            if(arr_s != null && arr_s.length != 0) {
                return s + "!/lib/" + arr_s[0];
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Cannot compute fallback path, supportedAbis is ");
            if(arr_s == null) {
                s1 = "null";
            }
            stringBuilder0.append(s1);
            p.j("SoLoader", stringBuilder0.toString());
            return null;
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Cannot compute fallback path, apk path is ");
        if(s == null) {
            s1 = "null";
        }
        stringBuilder1.append(s1);
        p.j("SoLoader", stringBuilder1.toString());
        return null;
    }

    public boolean t() {
        return !this.l.isEmpty();
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.soloader.H
    public String toString() {
        return "DirectApkSoSource[root = " + this.l.toString() + ']';
    }

    private void u(String s, String s1, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        Set set0 = this.q(s, s1);
        if(set0 == null) {
            this.n(s, s1);
            set0 = this.q(s, s1);
        }
        if(set0 != null) {
            for(Object object0: set0) {
                SoLoader.G(((String)object0), v, strictMode$ThreadPolicy0);
            }
        }
    }

    private void v() throws IOException {
        CharSequence charSequence0 = null;
        for(Object object0: this.l) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                int v = s.indexOf(33);
                if(v >= 0 && v + 2 < s.length()) {
                    charSequence0 = s.substring(v + 2);
                }
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                try(ZipFile zipFile0 = new ZipFile(com.facebook.soloader.d.p(s))) {
                    Enumeration enumeration0 = zipFile0.entries();
                    while(true) {
                        if(!enumeration0.hasMoreElements()) {
                            break;
                        }
                        ZipEntry zipEntry0 = (ZipEntry)enumeration0.nextElement();
                        if(zipEntry0 != null && zipEntry0.getMethod() == 0 && zipEntry0.getName().startsWith(((String)charSequence0)) && zipEntry0.getName().endsWith(".so")) {
                            this.m(s, zipEntry0.getName().substring(((String)charSequence0).length() + 1));
                        }
                    }
                }
            }
        }
    }
}

