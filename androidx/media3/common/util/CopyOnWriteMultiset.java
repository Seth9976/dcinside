package androidx.media3.common.util;

import androidx.annotation.GuardedBy;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@UnstableApi
public final class CopyOnWriteMultiset implements Iterable {
    private final Object a;
    @GuardedBy("lock")
    private final Map b;
    @GuardedBy("lock")
    private Set c;
    @GuardedBy("lock")
    private List d;

    public CopyOnWriteMultiset() {
        this.a = new Object();
        this.b = new HashMap();
        this.c = Collections.emptySet();
        this.d = Collections.emptyList();
    }

    public void a(Object object0) {
        synchronized(this.a) {
            ArrayList arrayList0 = new ArrayList(this.d);
            arrayList0.add(object0);
            this.d = DesugarCollections.unmodifiableList(arrayList0);
            Integer integer0 = (Integer)this.b.get(object0);
            if(integer0 == null) {
                HashSet hashSet0 = new HashSet(this.c);
                hashSet0.add(object0);
                this.c = DesugarCollections.unmodifiableSet(hashSet0);
            }
            this.b.put(object0, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
        }
    }

    public void b(Object object0) {
        synchronized(this.a) {
            Integer integer0 = (Integer)this.b.get(object0);
            if(integer0 == null) {
                return;
            }
            ArrayList arrayList0 = new ArrayList(this.d);
            arrayList0.remove(object0);
            this.d = DesugarCollections.unmodifiableList(arrayList0);
            if(((int)integer0) == 1) {
                this.b.remove(object0);
                HashSet hashSet0 = new HashSet(this.c);
                hashSet0.remove(object0);
                this.c = DesugarCollections.unmodifiableSet(hashSet0);
            }
            else {
                this.b.put(object0, ((int)(((int)integer0) - 1)));
            }
        }
    }

    public Set f() {
        synchronized(this.a) {
        }
        return this.c;
    }

    @Override
    public Iterator iterator() {
        synchronized(this.a) {
        }
        return this.d.iterator();
    }

    public int y3(Object object0) {
        synchronized(this.a) {
            return this.b.containsKey(object0) ? ((int)(((Integer)this.b.get(object0)))) : 0;
        }
    }
}

