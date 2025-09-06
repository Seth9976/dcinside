package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.services.core.log.DeviceLog;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000L;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool = null;
    private static LinkedBlockingQueue _queue = null;
    private static boolean _ready = false;
    private static final Object _readyLock;

    static {
        WebRequestThread._readyLock = new Object();
    }

    public static void cancel() {
        synchronized(WebRequestThread.class) {
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = WebRequestThread._pool;
            if(cancelableThreadPoolExecutor0 != null) {
                cancelableThreadPoolExecutor0.cancel();
                for(Object object0: WebRequestThread._queue) {
                    Runnable runnable0 = (Runnable)object0;
                    if(runnable0 instanceof WebRequestRunnable) {
                        ((WebRequestRunnable)runnable0).setCancelStatus(true);
                    }
                }
                WebRequestThread._queue.clear();
                WebRequestThread._pool.purge();
            }
        }
    }

    private static void init() {
        synchronized(WebRequestThread.class) {
            WebRequestThread._queue = new LinkedBlockingQueue();
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = new CancelableThreadPoolExecutor(WebRequestThread._corePoolSize, WebRequestThread._maximumPoolSize, WebRequestThread._keepAliveTime, TimeUnit.MILLISECONDS, WebRequestThread._queue);
            WebRequestThread._pool = cancelableThreadPoolExecutor0;
            cancelableThreadPoolExecutor0.prestartAllCoreThreads();
            WebRequestThread._queue.add(new Runnable() {
                @Override
                public void run() {
                    WebRequestThread._ready = true;
                    synchronized(WebRequestThread._readyLock) {
                        WebRequestThread._readyLock.notifyAll();
                    }
                }
            });
            while(!WebRequestThread._ready) {
                try {
                    synchronized(WebRequestThread._readyLock) {
                        WebRequestThread._readyLock.wait();
                    }
                }
                catch(InterruptedException unused_ex) {
                    DeviceLog.debug("Couldn\'t synchronize thread");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static void request(String s, RequestType webRequest$RequestType0, Map map0, Integer integer0, Integer integer1, IWebRequestListener iWebRequestListener0) {
        synchronized(WebRequestThread.class) {
            WebRequestThread.request(s, webRequest$RequestType0, map0, null, integer0, integer1, iWebRequestListener0);
        }
    }

    public static void request(String s, RequestType webRequest$RequestType0, Map map0, String s1, Integer integer0, Integer integer1, IWebRequestListener iWebRequestListener0) {
        synchronized(WebRequestThread.class) {
            if(!WebRequestThread._ready) {
                WebRequestThread.init();
            }
            if(s != null && s.length() >= 3) {
                WebRequestThread._queue.add(new WebRequestRunnable(s, webRequest$RequestType0.name(), s1, ((int)integer0), ((int)integer1), map0, iWebRequestListener0));
                return;
            }
            iWebRequestListener0.onFailed(s, "Request is NULL or too short");
        }
    }

    public static void reset() {
        synchronized(WebRequestThread.class) {
            WebRequestThread.cancel();
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = WebRequestThread._pool;
            if(cancelableThreadPoolExecutor0 != null) {
                cancelableThreadPoolExecutor0.shutdown();
                try {
                    WebRequestThread._pool.awaitTermination(0x7FFFFFFFFFFFFFFFL, TimeUnit.NANOSECONDS);
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                }
                WebRequestThread._queue.clear();
                WebRequestThread._pool = null;
                WebRequestThread._queue = null;
                WebRequestThread._ready = false;
            }
        }
    }

    public static boolean resolve(String s, IResolveHostListener iResolveHostListener0) {
        synchronized(WebRequestThread.class) {
            if(s != null && s.length() >= 3) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Exception exception1;
                        Thread thread0;
                        ConditionVariable conditionVariable0 = new ConditionVariable();
                        try {
                            thread0 = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        String s = InetAddress.getByName(com.unity3d.services.core.request.WebRequestThread.2.this.val$host).getHostAddress();
                                        com.unity3d.services.core.request.WebRequestThread.2.this.val$listener.onResolve(com.unity3d.services.core.request.WebRequestThread.2.this.val$host, s);
                                    }
                                    catch(UnknownHostException unknownHostException0) {
                                        DeviceLog.exception("Unknown host", unknownHostException0);
                                        com.unity3d.services.core.request.WebRequestThread.2.this.val$listener.onFailed(com.unity3d.services.core.request.WebRequestThread.2.this.val$host, ResolveHostError.UNKNOWN_HOST, unknownHostException0.getMessage());
                                    }
                                    conditionVariable0.open();
                                }
                            });
                        }
                        catch(Exception exception0) {
                            thread0 = null;
                            exception1 = exception0;
                            goto label_10;
                        }
                        try {
                            thread0.start();
                            goto label_12;
                        }
                        catch(Exception exception1) {
                        }
                    label_10:
                        DeviceLog.exception("Exception while resolving host", exception1);
                        iResolveHostListener0.onFailed(s, ResolveHostError.UNEXPECTED_EXCEPTION, exception1.getMessage());
                    label_12:
                        if(!conditionVariable0.block(20000L) && thread0 != null) {
                            thread0.interrupt();
                            iResolveHostListener0.onFailed(s, ResolveHostError.TIMEOUT, "Timeout");
                        }
                    }
                }).start();
                return true;
            }
            iResolveHostListener0.onFailed(s, ResolveHostError.INVALID_HOST, "Host is NULL");
            return false;
        }
    }

    public static void setConcurrentRequestCount(int v) {
        synchronized(WebRequestThread.class) {
            WebRequestThread._corePoolSize = v;
            WebRequestThread._maximumPoolSize = v;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = WebRequestThread._pool;
            if(cancelableThreadPoolExecutor0 != null) {
                cancelableThreadPoolExecutor0.setCorePoolSize(v);
                WebRequestThread._pool.setMaximumPoolSize(WebRequestThread._maximumPoolSize);
            }
        }
    }

    public static void setKeepAliveTime(long v) {
        synchronized(WebRequestThread.class) {
            WebRequestThread._keepAliveTime = v;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = WebRequestThread._pool;
            if(cancelableThreadPoolExecutor0 != null) {
                cancelableThreadPoolExecutor0.setKeepAliveTime(v, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static void setMaximumPoolSize(int v) {
        synchronized(WebRequestThread.class) {
            WebRequestThread._maximumPoolSize = v;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor0 = WebRequestThread._pool;
            if(cancelableThreadPoolExecutor0 != null) {
                cancelableThreadPoolExecutor0.setMaximumPoolSize(v);
            }
        }
    }
}

