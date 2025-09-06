package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import com.google.common.collect.p3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;

@UnstableApi
public final class BaseUrlExclusionList {
    private final Map a;
    private final Map b;
    private final Map c;
    private final Random d;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    @VisibleForTesting
    BaseUrlExclusionList(Random random0) {
        this.c = new HashMap();
        this.d = random0;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    private static void b(Object object0, long v, Map map0) {
        if(map0.containsKey(object0)) {
            v = Math.max(v, ((long)(((Long)Util.o(((Long)map0.get(object0)))))));
        }
        map0.put(object0, v);
    }

    private List c(List list0) {
        long v = SystemClock.elapsedRealtime();
        BaseUrlExclusionList.h(v, this.a);
        BaseUrlExclusionList.h(v, this.b);
        List list1 = new ArrayList();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            BaseUrl baseUrl0 = (BaseUrl)list0.get(v1);
            if(!this.a.containsKey(baseUrl0.b) && !this.b.containsKey(baseUrl0.c)) {
                list1.add(baseUrl0);
            }
        }
        return list1;
    }

    // 检测为 Lambda 实现
    private static int d(BaseUrl baseUrl0, BaseUrl baseUrl1) [...]

    public void e(BaseUrl baseUrl0, long v) {
        long v1 = SystemClock.elapsedRealtime() + v;
        BaseUrlExclusionList.b(baseUrl0.b, v1, this.a);
        int v2 = baseUrl0.c;
        if(v2 != 0x80000000) {
            BaseUrlExclusionList.b(v2, v1, this.b);
        }
    }

    public static int f(List list0) {
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < list0.size(); ++v) {
            hashSet0.add(((BaseUrl)list0.get(v)).c);
        }
        return hashSet0.size();
    }

    public int g(List list0) {
        HashSet hashSet0 = new HashSet();
        List list1 = this.c(list0);
        for(int v = 0; v < list1.size(); ++v) {
            hashSet0.add(((BaseUrl)list1.get(v)).c);
        }
        return hashSet0.size();
    }

    private static void h(long v, Map map0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((long)(((Long)map$Entry0.getValue()))) <= v) {
                arrayList0.add(map$Entry0.getKey());
            }
        }
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            map0.remove(arrayList0.get(v1));
        }
    }

    public void i() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    @Nullable
    public BaseUrl j(List list0) {
        List list1 = this.c(list0);
        if(list1.size() < 2) {
            return (BaseUrl)p3.v(list1, null);
        }
        Collections.sort(list1, (BaseUrl baseUrl0, BaseUrl baseUrl1) -> {
            int v = Integer.compare(baseUrl0.c, baseUrl1.c);
            return v == 0 ? baseUrl0.b.compareTo(baseUrl1.b) : v;
        });
        ArrayList arrayList0 = new ArrayList();
        int v = ((BaseUrl)list1.get(0)).c;
        for(int v1 = 0; v1 < list1.size(); ++v1) {
            BaseUrl baseUrl0 = (BaseUrl)list1.get(v1);
            if(v != baseUrl0.c) {
                if(arrayList0.size() != 1) {
                    break;
                }
                return (BaseUrl)list1.get(0);
            }
            arrayList0.add(new Pair(baseUrl0.b, baseUrl0.d));
        }
        BaseUrl baseUrl1 = (BaseUrl)this.c.get(arrayList0);
        if(baseUrl1 == null) {
            baseUrl1 = this.k(list1.subList(0, arrayList0.size()));
            this.c.put(arrayList0, baseUrl1);
        }
        return baseUrl1;
    }

    private BaseUrl k(List list0) {
        int v2 = 0;
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            v2 += ((BaseUrl)list0.get(v1)).d;
        }
        int v3 = this.d.nextInt(v2);
        int v4 = 0;
        for(int v = 0; v < list0.size(); ++v) {
            BaseUrl baseUrl0 = (BaseUrl)list0.get(v);
            v4 += baseUrl0.d;
            if(v3 < v4) {
                return baseUrl0;
            }
        }
        return (BaseUrl)p3.w(list0);
    }
}

