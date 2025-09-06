package androidx.room.util;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@RestrictTo({Scope.c})
@i(name = "RelationUtil")
public final class RelationUtil {
    public static final void a(@l ArrayMap arrayMap0, boolean z, @l Function1 function10) {
        L.p(arrayMap0, "map");
        L.p(function10, "fetchBlock");
        ArrayMap arrayMap1 = new ArrayMap(999);
        int v = arrayMap0.size();
        int v1 = 0;
    alab1:
        while(true) {
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v1 >= v) {
                    break alab1;
                }
                if(z) {
                    arrayMap1.put(arrayMap0.g(v1), arrayMap0.l(v1));
                }
                else {
                    arrayMap1.put(arrayMap0.g(v1), null);
                }
                ++v1;
                if(v2 + 1 == 999) {
                    function10.invoke(arrayMap1);
                    if(!z) {
                        arrayMap0.putAll(arrayMap1);
                    }
                    arrayMap1.clear();
                    break;
                }
            }
        }
        if(v2 > 0) {
            function10.invoke(arrayMap1);
            if(!z) {
                arrayMap0.putAll(arrayMap1);
            }
        }
    }

    public static final void b(@l HashMap hashMap0, boolean z, @l Function1 function10) {
        L.p(hashMap0, "map");
        L.p(function10, "fetchBlock");
        HashMap hashMap1 = new HashMap(999);
        Iterator iterator0 = hashMap0.keySet().iterator();
    alab1:
        while(true) {
            int v;
            for(v = 0; true; ++v) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(z) {
                    L.o(object0, "key");
                    hashMap1.put(object0, hashMap0.get(object0));
                }
                else {
                    L.o(object0, "key");
                    hashMap1.put(object0, null);
                }
                if(v + 1 == 999) {
                    function10.invoke(hashMap1);
                    if(!z) {
                        hashMap0.putAll(hashMap1);
                    }
                    hashMap1.clear();
                    break;
                }
            }
        }
        if(v > 0) {
            function10.invoke(hashMap1);
            if(!z) {
                hashMap0.putAll(hashMap1);
            }
        }
    }

    public static final void c(@l LongSparseArray longSparseArray0, boolean z, @l Function1 function10) {
        L.p(longSparseArray0, "map");
        L.p(function10, "fetchBlock");
        LongSparseArray longSparseArray1 = new LongSparseArray(999);
        int v = longSparseArray0.w();
        int v1 = 0;
    alab1:
        while(true) {
            int v2;
            for(v2 = 0; true; ++v2) {
                if(v1 >= v) {
                    break alab1;
                }
                if(z) {
                    longSparseArray1.n(longSparseArray0.m(v1), longSparseArray0.x(v1));
                }
                else {
                    longSparseArray1.n(longSparseArray0.m(v1), null);
                }
                ++v1;
                if(v2 + 1 == 999) {
                    function10.invoke(longSparseArray1);
                    if(!z) {
                        longSparseArray0.o(longSparseArray1);
                    }
                    longSparseArray1.b();
                    break;
                }
            }
        }
        if(v2 > 0) {
            function10.invoke(longSparseArray1);
            if(!z) {
                longSparseArray0.o(longSparseArray1);
            }
        }
    }
}

