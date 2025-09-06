package com.unity3d.ads.core.data.datasource;

import java.io.File;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface CacheDataSource {
    public static final class DefaultImpls {
        public static Object getFile$default(CacheDataSource cacheDataSource0, File file0, String s, String s1, Integer integer0, d d0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if((v & 4) != 0) {
                s1 = null;
            }
            if((v & 8) != 0) {
                integer0 = 0x7FFFFFFF;
            }
            return cacheDataSource0.getFile(file0, s, s1, integer0, d0);
        }
    }

    @m
    Object getFile(@l File arg1, @l String arg2, @m String arg3, @m Integer arg4, @l d arg5);
}

