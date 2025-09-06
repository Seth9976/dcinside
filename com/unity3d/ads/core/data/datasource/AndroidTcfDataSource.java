package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AndroidTcfDataSource implements TcfDataSource {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    static {
        AndroidTcfDataSource.Companion = new Companion(null);
    }

    // 去混淆评级： 低(40)
    @Override  // com.unity3d.ads.core.data.datasource.TcfDataSource
    @m
    public String getTcfString() {
        return AndroidPreferences.getString("_settings", "IABTCF_TCString");
    }
}

