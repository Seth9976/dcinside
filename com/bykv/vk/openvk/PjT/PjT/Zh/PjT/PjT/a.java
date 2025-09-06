package com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import u.b;

public class a implements b {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public a() {
        this.a = "video_reward_full";
        this.b = "video_brand";
        this.c = "video_splash";
        this.d = "video_default";
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    @Override  // u.b
    public String PjT() {
        if(this.f == null) {
            this.f = this.e + "/" + this.a;
            File file0 = new File(this.f);
            if(!file0.exists()) {
                file0.mkdirs();
            }
        }
        return this.f;
    }

    @Override  // u.b
    public void PjT(String s) {
        this.e = s;
    }

    // 去混淆评级： 低(20)
    @Override  // u.b
    public boolean PjT(v.b b0) {
        return TextUtils.isEmpty(b0.Zh()) || TextUtils.isEmpty(b0.fDm()) ? false : new File(b0.Zh(), b0.fDm()).exists();
    }

    @Override  // u.b
    public String ReZ() {
        if(this.i == null) {
            this.i = this.e + "/" + this.d;
            File file0 = new File(this.i);
            if(!file0.exists()) {
                file0.mkdirs();
            }
        }
        return this.i;
    }

    // 去混淆评级： 低(20)
    @Override  // u.b
    public long Zh(v.b b0) {
        return TextUtils.isEmpty(b0.Zh()) || TextUtils.isEmpty(b0.fDm()) ? 0L : z.b.a(b0.Zh(), b0.fDm());
    }

    @Override  // u.b
    public String Zh() {
        if(this.h == null) {
            this.h = this.e + "/" + this.c;
            File file0 = new File(this.h);
            if(!file0.exists()) {
                file0.mkdirs();
            }
        }
        return this.h;
    }

    public String a() {
        if(this.g == null) {
            this.g = this.e + "/" + this.b;
            File file0 = new File(this.g);
            if(!file0.exists()) {
                file0.mkdirs();
            }
        }
        return this.g;
    }

    private static void b(File[] arr_file, int v, Set set0) {
        static final class com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.a.a implements Comparator {
            public int b(File file0, File file1) {
                int v = Long.compare(file1.lastModified() - file0.lastModified(), 0L);
                if(v == 0) {
                    return 0;
                }
                return v >= 0 ? 1 : -1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((File)object0), ((File)object1));
            }
        }

        if(v < 0) {
            return;
        }
        if(arr_file != null) {
            try {
                if(arr_file.length > v) {
                    List list0 = Arrays.asList(arr_file);
                    Collections.sort(list0, new com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.a.a());
                    while(v < list0.size()) {
                        if(set0 != null && !set0.contains(((File)list0.get(v)).getAbsolutePath())) {
                            ((File)list0.get(v)).delete();
                        }
                        ++v;
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private Set c() {
        Set set0 = new HashSet();
        for(Object object0: A.a.e.values()) {
            A.a a0 = (A.a)object0;
            if(a0 != null && a0.b() != null) {
                v.b b0 = a0.b();
                set0.add(z.b.d(b0.Zh(), b0.fDm()).getAbsolutePath());
                set0.add(z.b.c(b0.Zh(), b0.fDm()).getAbsolutePath());
            }
        }
        for(Object object1: com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh.b.a.values()) {
            c c0 = (c)object1;
            if(c0 != null && c0.c() != null) {
                v.b b1 = c0.c();
                set0.add(z.b.d(b1.Zh(), b1.fDm()).getAbsolutePath());
                set0.add(z.b.c(b1.Zh(), b1.fDm()).getAbsolutePath());
            }
        }
        return set0;
    }

    @Override  // u.b
    public void cr() {
        synchronized(this) {
            List list0 = this.d();
            if(Build.VERSION.SDK_INT >= 23) {
                Set set0 = null;
                for(Object object0: list0) {
                    u.a a0 = (u.a)object0;
                    File[] arr_file = a0.a();
                    if(arr_file != null && arr_file.length >= a0.b()) {
                        if(set0 == null) {
                            set0 = this.c();
                        }
                        a.b(a0.a(), (a0.b() - 2 >= 0 ? a0.b() - 2 : 0), set0);
                    }
                }
            }
        }
    }

    private List d() {
        List list0 = new ArrayList();
        list0.add(new u.a(new File(this.PjT()).listFiles(), 10));
        list0.add(new u.a(new File(this.Zh()).listFiles(), 10));
        list0.add(new u.a(new File(this.a()).listFiles(), 10));
        list0.add(new u.a(new File(this.ReZ()).listFiles(), 10));
        return list0;
    }
}

