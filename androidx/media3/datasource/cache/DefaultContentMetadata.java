package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.f;
import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@UnstableApi
public final class DefaultContentMetadata implements ContentMetadata {
    private int d;
    private final Map e;
    public static final DefaultContentMetadata f;

    static {
        DefaultContentMetadata.f = new DefaultContentMetadata(Collections.emptyMap());
    }

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    public DefaultContentMetadata(Map map0) {
        this.e = DesugarCollections.unmodifiableMap(map0);
    }

    @Override  // androidx.media3.datasource.cache.ContentMetadata
    public final long a(String s, long v) {
        byte[] arr_b = (byte[])this.e.get(s);
        return arr_b == null ? v : ByteBuffer.wrap(arr_b).getLong();
    }

    @Override  // androidx.media3.datasource.cache.ContentMetadata
    @Nullable
    public final String b(String s, @Nullable String s1) {
        byte[] arr_b = (byte[])this.e.get(s);
        return arr_b == null ? s1 : new String(arr_b, f.c);
    }

    @Override  // androidx.media3.datasource.cache.ContentMetadata
    @Nullable
    public final byte[] c(String s, @Nullable byte[] arr_b) {
        byte[] arr_b1 = (byte[])this.e.get(s);
        return arr_b1 == null ? arr_b : Arrays.copyOf(arr_b1, arr_b1.length);
    }

    @Override  // androidx.media3.datasource.cache.ContentMetadata
    public final boolean contains(String s) {
        return this.e.containsKey(s);
    }

    private static void d(HashMap hashMap0, Map map0) {
        for(Object object0: map0.entrySet()) {
            hashMap0.put(((String)((Map.Entry)object0).getKey()), DefaultContentMetadata.h(((Map.Entry)object0).getValue()));
        }
    }

    private static Map e(Map map0, ContentMetadataMutations contentMetadataMutations0) {
        Map map1 = new HashMap(map0);
        DefaultContentMetadata.j(((HashMap)map1), contentMetadataMutations0.c());
        DefaultContentMetadata.d(((HashMap)map1), contentMetadataMutations0.b());
        return map1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return DefaultContentMetadata.class == class0 ? DefaultContentMetadata.i(this.e, ((DefaultContentMetadata)object0).e) : false;
        }
        return false;
    }

    public DefaultContentMetadata f(ContentMetadataMutations contentMetadataMutations0) {
        Map map0 = DefaultContentMetadata.e(this.e, contentMetadataMutations0);
        return DefaultContentMetadata.i(this.e, map0) ? this : new DefaultContentMetadata(map0);
    }

    public Set g() {
        return this.e.entrySet();
    }

    private static byte[] h(Object object0) {
        if(object0 instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((long)(((Long)object0)))).array();
        }
        if(object0 instanceof String) {
            return ((String)object0).getBytes(f.c);
        }
        if(!(object0 instanceof byte[])) {
            throw new IllegalArgumentException();
        }
        return (byte[])object0;
    }

    @Override
    public int hashCode() {
        if(this.d == 0) {
            int v = 0;
            for(Object object0: this.e.entrySet()) {
                int v1 = ((String)((Map.Entry)object0).getKey()).hashCode();
                v += Arrays.hashCode(((byte[])((Map.Entry)object0).getValue())) ^ v1;
            }
            this.d = v;
        }
        return this.d;
    }

    private static boolean i(Map map0, Map map1) {
        if(map0.size() != map1.size()) {
            return false;
        }
        for(Object object0: map0.entrySet()) {
            if(!Arrays.equals(((byte[])((Map.Entry)object0).getValue()), ((byte[])map1.get(((Map.Entry)object0).getKey())))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    private static void j(HashMap hashMap0, List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            hashMap0.remove(list0.get(v));
        }
    }
}

