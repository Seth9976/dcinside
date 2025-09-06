package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.cz;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class d.c extends d.b {
    class a implements Runnable {
        final d.c a;

        @Override
        public void run() {
            class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.a.a extends Au {
                final a a;

                com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.a.a(String s, int v) {
                    super(s, v);
                }

                @Override
                public void run() {
                    long v = d.c.this.g;
                    d.c.this.m(v);
                }
            }

            cz.Zh(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.a.a(this, "cleanupCmd", 1));
        }
    }

    public interface f {
        void PjT(String arg1);

        void a(Set arg1);
    }

    static final class g {
        private final Map a;

        private g() {
            this.a = new HashMap();
        }

        g(a d$c$a0) {
        }

        void a(String s) {
            synchronized(this) {
                if(!TextUtils.isEmpty(s)) {
                    Integer integer0 = (Integer)this.a.get(s);
                    if(integer0 == null) {
                        this.a.put(s, 1);
                        return;
                    }
                    this.a.put(s, ((int)(((int)integer0) + 1)));
                }
            }
        }

        boolean b(String s) {
            synchronized(this) {
                return !TextUtils.isEmpty(s) ? this.a.containsKey(s) : false;
            }
        }

        void c(String s) {
            synchronized(this) {
                if(!TextUtils.isEmpty(s)) {
                    Integer integer0 = (Integer)this.a.get(s);
                    if(integer0 != null) {
                        if(((int)integer0) == 1) {
                            this.a.remove(s);
                            return;
                        }
                        this.a.put(s, ((int)(((int)integer0) - 1)));
                    }
                }
            }
        }
    }

    public final File a;
    private final LinkedHashMap b;
    private final ReentrantReadWriteLock c;
    private final ReentrantReadWriteLock.ReadLock d;
    private final ReentrantReadWriteLock.WriteLock e;
    private final Set f;
    private volatile long g;
    private volatile float h;
    private final g i;
    private final Runnable j;
    private final Handler k;

    public d.c(File file0) throws IOException {
        class b extends Au {
            final d.c a;

            b(String s, int v) {
                super(s, v);
            }

            @Override
            public void run() {
                d.c.this.l();
            }
        }

        this.b = new LinkedHashMap(0, 0.75f, true);
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock0;
        this.d = reentrantReadWriteLock0.readLock();
        this.e = reentrantReadWriteLock0.writeLock();
        this.f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.g = 0x6400000L;
        this.h = 0.5f;
        this.i = new g(null);
        this.j = new a(this);
        this.k = new Handler(Looper.getMainLooper());
        if(file0 == null || !file0.exists() || !file0.isDirectory() || !file0.canRead() || !file0.canWrite()) {
            throw new IOException("dir error!  " + (file0 == null ? " dir null" : "exists: " + file0.exists() + ", isDirectory: " + file0.isDirectory() + ", canRead: " + file0.canRead() + ", canWrite: " + file0.canWrite()));
        }
        this.a = file0;
        cz.Zh(new b(this, "DiskLruCache", 5));
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$b
    public void a(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.i.a(s);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$b
    public File b(String s) {
        this.d.lock();
        File file0 = (File)this.b.get(s);
        this.d.unlock();
        if(file0 != null) {
            return file0;
        }
        File file1 = new File(this.a, s);
        this.e.lock();
        this.b.put(s, file1);
        this.e.unlock();
        for(Object object0: this.f) {
            ((f)object0).PjT(s);
        }
        this.k();
        return file1;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$b
    public void c(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.i.c(s);
        }
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d$b
    public File d(String s) {
        if(this.d.tryLock()) {
            File file0 = (File)this.b.get(s);
            this.d.unlock();
            return file0;
        }
        return null;
    }

    private String f(File file0) {
        return file0.getName();
    }

    public void g() {
        class d extends Au {
            final d.c a;

            d(String s, int v) {
                super(s, v);
            }

            @Override
            public void run() {
                d.c.this.m(0L);
            }
        }

        i.l().o();
        Context context0 = c.a();
        if(context0 != null) {
            h.d.d(context0).e(0);
        }
        this.k.removeCallbacks(this.j);
        cz.Zh(new d(this, "clear", 1));
    }

    public void h(long v) {
        this.g = v;
        this.k();
    }

    public void i(f d$c$f0) {
        if(d$c$f0 != null) {
            this.f.add(d$c$f0);
        }
    }

    private void k() {
        this.k.removeCallbacks(this.j);
        this.k.postDelayed(this.j, 10000L);
    }

    private void l() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.c implements Comparator {
            final HashMap a;
            final d.c b;

            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.c(HashMap hashMap0) {
                this.a = hashMap0;
                super();
            }

            public int b(File file0, File file1) {
                int v = Long.compare(((long)(((Long)this.a.get(file0)))) - ((long)(((Long)this.a.get(file1)))), 0L);
                if(v < 0) {
                    return -1;
                }
                return v <= 0 ? 0 : 1;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.b(((File)object0), ((File)object1));
            }
        }

        this.e.lock();
        try {
            File[] arr_file = this.a.listFiles();
            if(arr_file != null && arr_file.length > 0) {
                HashMap hashMap0 = new HashMap(arr_file.length);
                ArrayList arrayList0 = new ArrayList(arr_file.length);
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    File file0 = arr_file[v1];
                    if(file0.isFile()) {
                        arrayList0.add(file0);
                        hashMap0.put(file0, file0.lastModified());
                    }
                }
                Collections.sort(arrayList0, new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.c.c(this, hashMap0));
                for(Object object0: arrayList0) {
                    String s = this.f(((File)object0));
                    this.b.put(s, ((File)object0));
                }
            }
        }
        finally {
            this.e.unlock();
        }
        this.k();
    }

    private void m(long v) {
        class e extends Au {
            final HashSet a;
            final d.c b;

            e(String s, int v, HashSet hashSet0) {
                this.a = hashSet0;
                super(s, v);
            }

            @Override
            public void run() {
                for(Object object0: this.a) {
                    File file0 = (File)object0;
                    try {
                        file0.delete();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }

        HashSet hashSet1;
        long v1;
        HashSet hashSet0 = new HashSet();
        this.e.lock();
        try {
            v1 = 0L;
            for(Object object0: this.b.entrySet()) {
                v1 += ((File)((Map.Entry)object0).getValue()).length();
            }
        }
        catch(Throwable unused_ex) {
            hashSet1 = null;
            goto label_38;
        }
        if(v1 <= v) {
            this.e.unlock();
            return;
        }
        try {
            long v2 = (long)(((float)v) * this.h);
            hashSet1 = new HashSet();
        }
        catch(Throwable unused_ex) {
            hashSet1 = null;
            goto label_38;
        }
        try {
            for(Object object1: this.b.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                File file0 = (File)map$Entry0.getValue();
                if(file0 == null || !file0.exists()) {
                    hashSet1.add(map$Entry0.getKey());
                }
                else {
                    String s = this.f(file0);
                    if(!this.i.b(s)) {
                        long v3 = file0.length();
                        File file1 = new File(file0.getAbsolutePath() + "-tmp");
                        if(file0.renameTo(file1)) {
                            hashSet0.add(file1);
                            v1 -= v3;
                            hashSet1.add(map$Entry0.getKey());
                        }
                    }
                }
                if(v1 <= v2) {
                    break;
                }
            }
            Iterator iterator2 = hashSet1.iterator();
            while(true) {
                if(!iterator2.hasNext()) {
                    goto label_38;
                }
                Object object2 = iterator2.next();
                this.b.remove(((String)object2));
            }
        }
        catch(Throwable unused_ex) {
        label_38:
            this.e.unlock();
            for(Object object3: this.f) {
                ((f)object3).a(hashSet1);
            }
            cz.Zh(new e(this, "trimSize", 1, hashSet0));
        }
    }
}

