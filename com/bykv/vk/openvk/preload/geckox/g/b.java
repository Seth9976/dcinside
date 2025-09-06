package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class b {
    private static final Map a;
    private static ReentrantLock b;
    private String c;
    private FileLock d;

    static {
        b.a = new HashMap();
        b.b = new ReentrantLock();
    }

    private b(String s, FileLock fileLock0) {
        this.c = s;
        this.d = fileLock0;
    }

    public static b a(String s) throws Exception {
        b.b.lock();
        try {
            FileLock fileLock0 = FileLock.a(s);
            Map map0 = b.a;
            Lock lock0 = (Lock)map0.get(s);
            if(lock0 == null) {
                lock0 = new ReentrantLock();
                map0.put(s, lock0);
            }
            lock0.lock();
            return new b(s, fileLock0);
        }
        catch(Exception exception0) {
        }
        b.b.unlock();
        throw exception0;
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            Lock lock0 = (Lock)b.a.get(this.c);
            if(lock0 != null) {
                lock0.unlock();
            }
        }
        finally {
            b.b.unlock();
        }
    }
}

