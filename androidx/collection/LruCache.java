package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
public class LruCache {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    @l
    private final Lock lock;
    @l
    private final LruHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@IntRange(from = 1L, to = 0x7FFFFFFFFFFFFFFFL) int v) {
        this.maxSize = v;
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap(0, 0.75f);
        this.lock = new Lock();
    }

    private final int a(Object object0, Object object1) {
        int v = this.sizeOf(object0, object1);
        if(v < 0) {
            throw new IllegalStateException(("Negative size: " + object0 + '=' + object1).toString());
        }
        return v;
    }

    @m
    protected Object create(@l Object object0) {
        L.p(object0, "key");
        return null;
    }

    public final int createCount() {
        synchronized(this.lock) {
        }
        return this.createCount;
    }

    protected void entryRemoved(boolean z, @l Object object0, @l Object object1, @m Object object2) {
        L.p(object0, "key");
        L.p(object1, "oldValue");
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final int evictionCount() {
        synchronized(this.lock) {
        }
        return this.evictionCount;
    }

    @m
    public final Object get(@l Object object0) {
        Object object3;
        L.p(object0, "key");
        synchronized(this.lock) {
            Object object1 = this.map.a(object0);
            if(object1 != null) {
                ++this.hitCount;
                return object1;
            }
            ++this.missCount;
        }
        Object object2 = this.create(object0);
        if(object2 == null) {
            return null;
        }
        synchronized(this.lock) {
            ++this.createCount;
            object3 = this.map.d(object0, object2);
            if(object3 == null) {
                this.size += this.a(object0, object2);
            }
            else {
                this.map.d(object0, object3);
            }
        }
        if(object3 != null) {
            this.entryRemoved(false, object0, object2, object3);
            return object3;
        }
        this.trimToSize(this.maxSize);
        return object2;
    }

    public final int hitCount() {
        synchronized(this.lock) {
        }
        return this.hitCount;
    }

    public final int maxSize() {
        synchronized(this.lock) {
        }
        return this.maxSize;
    }

    public final int missCount() {
        synchronized(this.lock) {
        }
        return this.missCount;
    }

    @m
    public final Object put(@l Object object0, @l Object object1) {
        Object object2;
        L.p(object0, "key");
        L.p(object1, "value");
        synchronized(this.lock) {
            ++this.putCount;
            this.size += this.a(object0, object1);
            object2 = this.map.d(object0, object1);
            if(object2 != null) {
                this.size -= this.a(object0, object2);
            }
        }
        if(object2 != null) {
            this.entryRemoved(false, object0, object2, object1);
        }
        this.trimToSize(this.maxSize);
        return object2;
    }

    public final int putCount() {
        synchronized(this.lock) {
        }
        return this.putCount;
    }

    @m
    public final Object remove(@l Object object0) {
        Object object1;
        L.p(object0, "key");
        synchronized(this.lock) {
            object1 = this.map.e(object0);
            if(object1 != null) {
                this.size -= this.a(object0, object1);
            }
        }
        if(object1 != null) {
            this.entryRemoved(false, object0, object1, null);
        }
        return object1;
    }

    public void resize(@IntRange(from = 1L, to = 0x7FFFFFFFFFFFFFFFL) int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized(this.lock) {
            this.maxSize = v;
        }
        this.trimToSize(v);
    }

    public final int size() {
        synchronized(this.lock) {
        }
        return this.size;
    }

    protected int sizeOf(@l Object object0, @l Object object1) {
        L.p(object0, "key");
        L.p(object1, "value");
        return 1;
    }

    @l
    public final Map snapshot() {
        Map map0 = new LinkedHashMap();
        synchronized(this.lock) {
            for(Object object0: this.map.b()) {
                map0.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
            }
            return map0;
        }
    }

    @Override
    @l
    public String toString() {
        synchronized(this.lock) {
            int v1 = this.missCount + this.hitCount;
            int v2 = v1 == 0 ? 0 : this.hitCount * 100 / v1;
            return "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + v2 + "%]";
        }
    }

    public void trimToSize(int v) {
        Object object1;
        Object object0;
        Lock lock0;
        while(true) {
            lock0 = this.lock;
            synchronized(lock0) {
                if(this.size < 0 || this.map.c() && this.size != 0) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if(this.size <= v || this.map.c()) {
                    break;
                }
                Map.Entry map$Entry0 = (Map.Entry)u.E2(this.map.b());
                if(map$Entry0 == null) {
                    return;
                }
                object0 = map$Entry0.getKey();
                object1 = map$Entry0.getValue();
                this.map.e(object0);
                this.size -= this.a(object0, object1);
                ++this.evictionCount;
            }
            this.entryRemoved(true, object0, object1, null);
        }
    }
}

