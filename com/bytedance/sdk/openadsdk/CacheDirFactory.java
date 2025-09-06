package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.PjT.PjT.Zh.PjT.PjT.a;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import java.io.File;
import u.b;

public class CacheDirFactory {
    public static volatile b MEDIA_CACHE_DIR = null;
    private static String PjT = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    static {
    }

    private static b PjT() {
        if(CacheDirFactory.MEDIA_CACHE_DIR == null) {
            Class class0 = CacheDirFactory.class;
            __monitor_enter(class0);
            try {
                if(CacheDirFactory.MEDIA_CACHE_DIR == null) {
                    a a0 = new a();
                    CacheDirFactory.MEDIA_CACHE_DIR = a0;
                    a0.PjT(CacheDirFactory.getRootDir());
                    CacheDirFactory.MEDIA_CACHE_DIR.cr();
                }
                __monitor_exit(class0);
                return CacheDirFactory.MEDIA_CACHE_DIR;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return CacheDirFactory.MEDIA_CACHE_DIR;
    }

    public static int getCacheType() [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static String getDiskCacheDirPath(String s) {
        return CacheDirFactory.getRootDir() + "/" + s;
    }

    public static b getICacheDir(int v) {
        return CacheDirFactory.PjT();
    }

    public static String getImageCacheDir(String s) {
        if(CacheDirFactory.PjT == null) {
            CacheDirFactory.PjT = CacheDirFactory.getDiskCacheDirPath(s);
        }
        return CacheDirFactory.PjT;
    }

    public static String getRootDir() {
        if(!TextUtils.isEmpty(CacheDirFactory.ROOT_DIR)) {
            return CacheDirFactory.ROOT_DIR;
        }
        File file0 = XX.PjT(ub.PjT(), Zh.ReZ(), "tt_ad");
        if(file0.isFile()) {
            file0.delete();
        }
        if(!file0.exists()) {
            file0.mkdirs();
        }
        String s = file0.getAbsolutePath();
        CacheDirFactory.ROOT_DIR = s;
        return s;
    }
}

