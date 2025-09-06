package androidx.media3.datasource.cache;

import O1.a;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@UnstableApi
public class ContentMetadataMutations {
    private final Map a;
    private final List b;

    public ContentMetadataMutations() {
        this.a = new HashMap();
        this.b = new ArrayList();
    }

    @a
    private ContentMetadataMutations a(String s, Object object0) {
        String s1 = (String)Assertions.g(s);
        Object object1 = Assertions.g(object0);
        this.a.put(s1, object1);
        this.b.remove(s);
        return this;
    }

    public Map b() {
        HashMap hashMap0 = new HashMap(this.a);
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof byte[]) {
                map$Entry0.setValue(Arrays.copyOf(((byte[])object1), ((byte[])object1).length));
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    public List c() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    @a
    public ContentMetadataMutations d(String s) {
        this.b.add(s);
        this.a.remove(s);
        return this;
    }

    @a
    public ContentMetadataMutations e(String s, long v) {
        return this.a(s, v);
    }

    @a
    public ContentMetadataMutations f(String s, String s1) {
        return this.a(s, s1);
    }

    @a
    public ContentMetadataMutations g(String s, byte[] arr_b) {
        return this.a(s, Arrays.copyOf(arr_b, arr_b.length));
    }

    public static ContentMetadataMutations h(ContentMetadataMutations contentMetadataMutations0, long v) {
        return contentMetadataMutations0.e("exo_len", v);
    }

    public static ContentMetadataMutations i(ContentMetadataMutations contentMetadataMutations0, @Nullable Uri uri0) {
        return uri0 == null ? contentMetadataMutations0.d("exo_redir") : contentMetadataMutations0.f("exo_redir", uri0.toString());
    }
}

