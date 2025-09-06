package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {
    private static final Map a;
    private FileLock b;
    private String c;

    static {
        a.a = new HashMap();
    }

    private a(String s, FileLock fileLock0) {
        this.c = s;
        this.b = fileLock0;
    }

    public static a a(String s) throws Exception {
        FileLock fileLock0;
        Map map0 = a.a;
        __monitor_enter(map0);
        try {
            Lock lock0 = (Lock)map0.get(s);
            if(lock0 == null) {
                lock0 = new ReentrantLock();
                map0.put(s, lock0);
            }
            if(!lock0.tryLock()) {
                __monitor_exit(map0);
                return null;
            }
            try {
                fileLock0 = FileLock.c(s);
            }
            catch(Exception exception0) {
                lock0.lock();
                com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(exception0));
                __monitor_exit(map0);
                return null;
            }
            if(fileLock0 == null) {
                lock0.unlock();
                __monitor_exit(map0);
                return null;
            }
            __monitor_exit(map0);
            return new a(s, fileLock0);
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    public final void a() {
        Map map0 = a.a;
        __monitor_enter(map0);
        try {
            this.b.a();
            this.b.b();
            goto label_8;
        }
        catch(Throwable throwable0) {
            try {
                ((Lock)a.a.get(this.c)).unlock();
                throw throwable0;
            label_8:
                ((Lock)map0.get(this.c)).unlock();
                __monitor_exit(map0);
                return;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(map0);
        throw throwable1;
    }
}

