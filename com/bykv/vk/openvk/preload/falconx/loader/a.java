package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.f.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class a implements ILoader {
    private b a;
    private AtomicBoolean b;

    public a(Context context0, String s, File file0) {
        this.b = new AtomicBoolean(false);
        if(context0 == null) {
            throw new RuntimeException("context == null");
        }
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("access key empty");
        }
        if(file0 == null) {
            throw new RuntimeException("resRootDir == null");
        }
        this.a = new b(context0, s, file0);
    }

    public final int a(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released!");
        }
        return this.a.b(s);
    }

    @Override  // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public boolean exist(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released!");
        }
        return this.a.c(s);
    }

    @Override  // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public Map getChannelVersion() {
        return this.a.b();
    }

    @Override  // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public InputStream getInputStream(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released!");
        }
        GeckoLogger.d("WebOffline-falcon", new Object[]{"GeckoResLoader ready to load, file:", s});
        return this.a.a(s);
    }

    @Override  // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public String getResRootDir() {
        return this.a.a();
    }

    @Override  // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public void release() throws Exception {
        if(this.b.getAndSet(true)) {
            return;
        }
        this.a.c();
    }
}

