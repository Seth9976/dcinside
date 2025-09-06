package j$.time.zone;

import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class j {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;
    private static volatile Set c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList0 = new CopyOnWriteArrayList();
        j.a = copyOnWriteArrayList0;
        j.b = new ConcurrentHashMap(0x200, 0.75f, 2);
        ArrayList arrayList0 = new ArrayList();
        AccessController.doPrivileged(new h(arrayList0));
        copyOnWriteArrayList0.addAll(arrayList0);
    }

    public static Set a() {
        return j.c;
    }

    public static f b(String s, boolean z) {
        Objects.requireNonNull(s, "zoneId");
        ConcurrentHashMap concurrentHashMap0 = j.b;
        j j0 = (j)concurrentHashMap0.get(s);
        if(j0 == null) {
            throw concurrentHashMap0.isEmpty() ? new g("No time-zone data files registered") : new g("Unknown time-zone ID: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V / 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return j0.c(s);
    }

    protected abstract f c(String arg1);

    protected abstract Set d();

    public static void e(j j0) {
        Objects.requireNonNull(j0, "provider");
        synchronized(j.class) {
            for(Object object0: j0.d()) {
                String s = (String)object0;
                Objects.requireNonNull(s, "zoneId");
                if(((j)j.b.putIfAbsent(s, j0)) != null) {
                    throw new g("Unable to register zone as one already registered with that ID: " + s + ", currently loading from provider: " + j0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                if(false) {
                    break;
                }
            }
            j.c = Collections.unmodifiableSet(new HashSet(j.b.keySet()));
        }
        j.a.add(j0);
    }
}

