package com.bykv.vk.openvk.preload.geckox.g;

import android.os.Process;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import com.bykv.vk.openvk.preload.geckox.utils.b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class c {
    private static final Map a;

    static {
        c.a = new HashMap();
    }

    public static void a(String s) throws Exception {
        Map map0 = c.a;
        __monitor_enter(map0);
        try {
            Pair pair0 = (Pair)map0.get(s);
            if(pair0 == null) {
                Pair pair1 = new Pair(FileLock.a(s, Process.myPid()), new AtomicLong(0L));
                map0.put(s, pair1);
                pair0 = pair1;
            }
            ((AtomicLong)pair0.second).incrementAndGet();
            __monitor_exit(map0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    public static void b(String s) throws Exception {
        Map map0 = c.a;
        __monitor_enter(map0);
        try {
            Pair pair0 = (Pair)map0.get(s);
            if(pair0 == null) {
                throw new RuntimeException("using.lock illegal state");
            }
            int v = Long.compare(((AtomicLong)pair0.second).decrementAndGet(), 0L);
            if(v < 0) {
                throw new RuntimeException("using.lock count illegal");
            }
            if(v == 0) {
                ((FileLock)pair0.first).a();
                map0.remove(s);
            }
            __monitor_exit(map0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    public static void c(String s) throws Exception {
        Map map0 = c.a;
        __monitor_enter(map0);
        try {
            FileLock fileLock0 = FileLock.b(s);
            if(fileLock0 == null) {
                __monitor_exit(map0);
                return;
            }
            Pair pair0 = (Pair)map0.get(s);
            if(pair0 != null && ((AtomicLong)pair0.second).get() != 0L) {
                fileLock0.a();
                FileLock.a(s, Process.myPid());
                __monitor_exit(map0);
                return;
            }
            File file0 = new File(s).getParentFile();
            File file1 = new File(file0.getAbsolutePath() + "--pending-delete");
            if(file0.renameTo(file1)) {
                fileLock0.a();
                fileLock0.b();
                com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() {
                    @Override
                    public final void run() {
                        b.a(file1);
                    }
                });
            }
            __monitor_exit(map0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }
}

