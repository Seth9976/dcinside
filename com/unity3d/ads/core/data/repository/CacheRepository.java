package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import kotlin.coroutines.d;
import org.json.JSONArray;
import y4.l;
import y4.m;

public interface CacheRepository {
    public static final class DefaultImpls {
        public static Object getFile$default(CacheRepository cacheRepository0, String s, String s1, JSONArray jSONArray0, int v, d d0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if((v1 & 4) != 0) {
                jSONArray0 = null;
            }
            return (v1 & 8) == 0 ? cacheRepository0.getFile(s, s1, jSONArray0, v, d0) : cacheRepository0.getFile(s, s1, jSONArray0, 0, d0);
        }
    }

    @m
    Object clearCache(@l d arg1);

    @m
    Object doesFileExist(@l String arg1, @l d arg2);

    @m
    Object getCacheSize(@l d arg1);

    @m
    Object getFile(@l String arg1, @l String arg2, @m JSONArray arg3, int arg4, @l d arg5);

    boolean removeFile(@l CachedFile arg1);

    @l
    CacheResult retrieveFile(@l String arg1);
}

