package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.HashMap;
import java.util.List;

public class CacheThread extends Thread {
    public static final int MSG_DOWNLOAD = 1;
    private static int _connectTimeout = 30000;
    private static CacheThreadHandler _handler = null;
    private static int _progressInterval = 0;
    private static int _readTimeout = 30000;
    private static boolean _ready = false;
    private static final Object _readyLock;

    static {
        CacheThread._readyLock = new Object();
    }

    public static void cancel() {
    }

    public static void download(String s, String s1, HashMap hashMap0, boolean z, IEventSender iEventSender0) {
        synchronized(CacheThread.class) {
            CacheThread.init();
            Bundle bundle0 = new Bundle();
            bundle0.putString("source", s);
            bundle0.putString("target", s1);
            bundle0.putInt("connectTimeout", CacheThread._connectTimeout);
            bundle0.putInt("readTimeout", CacheThread._readTimeout);
            bundle0.putInt("progressInterval", CacheThread._progressInterval);
            bundle0.putBoolean("append", z);
            bundle0.putSerializable("cacheEventSender", new CacheEventSender(iEventSender0));
            if(hashMap0 != null) {
                for(Object object0: hashMap0.keySet()) {
                    String[] arr_s = new String[((List)hashMap0.get(((String)object0))).size()];
                    bundle0.putStringArray(((String)object0), ((String[])((List)hashMap0.get(((String)object0))).toArray(arr_s)));
                }
            }
            Message message0 = new Message();
            message0.what = 1;
            message0.setData(bundle0);
            CacheThread._handler.setCancelStatus(false);
            CacheThread._handler.sendMessage(message0);
        }
    }

    public static int getConnectTimeout() [...] // 潜在的解密器

    public static int getProgressInterval() [...] // 潜在的解密器

    public static int getReadTimeout() [...] // 潜在的解密器

    private static void init() {
        CacheThread cacheThread0 = new CacheThread();
        cacheThread0.setName("UnityAdsCacheThread");
        cacheThread0.start();
        while(true) {
            try {
                synchronized(CacheThread._readyLock) {
                    CacheThread._readyLock.wait();
                }
            }
            catch(InterruptedException unused_ex) {
                DeviceLog.debug("Couldn\'t synchronize thread");
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean isActive() [...] // 潜在的解密器

    @Override
    public void run() {
        Looper.prepare();
        CacheThread._handler = new CacheThreadHandler();
        CacheThread._ready = true;
        synchronized(CacheThread._readyLock) {
            CacheThread._readyLock.notifyAll();
        }
        Looper.loop();
    }

    public static void setConnectTimeout(int v) {
        CacheThread._connectTimeout = v;
    }

    public static void setProgressInterval(int v) {
        CacheThread._progressInterval = v;
    }

    public static void setReadTimeout(int v) {
        CacheThread._readTimeout = v;
    }
}

