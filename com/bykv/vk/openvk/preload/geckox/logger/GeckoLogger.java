package com.bykv.vk.openvk.preload.geckox.logger;

public class GeckoLogger {
    private static boolean DEBUG = false;
    private static Logger sLogger;

    static {
        GeckoLogger.sLogger = new DefaultLogger();
    }

    public static void d(String s, Object[] arr_object) {
        if(GeckoLogger.DEBUG) {
            Logger logger0 = GeckoLogger.sLogger;
            if(logger0 != null) {
                logger0.d(s, arr_object);
            }
        }
    }

    public static void disable() {
        GeckoLogger.DEBUG = false;
    }

    public static void e(String s, String s1, Throwable throwable0) {
        if(GeckoLogger.DEBUG) {
            Logger logger0 = GeckoLogger.sLogger;
            if(logger0 != null) {
                logger0.e(s, s1, throwable0);
            }
        }
    }

    public static void enable() {
        GeckoLogger.DEBUG = true;
    }

    public static boolean isDebug() {
        return GeckoLogger.DEBUG;
    }

    public static void redirect(Logger logger0) {
        GeckoLogger.sLogger = logger0;
    }

    public static void w(String s, String s1) {
        if(GeckoLogger.DEBUG) {
            Logger logger0 = GeckoLogger.sLogger;
            if(logger0 != null) {
                logger0.w(s, s1);
            }
        }
    }

    public static void w(String s, String s1, Throwable throwable0) {
        if(GeckoLogger.DEBUG) {
            Logger logger0 = GeckoLogger.sLogger;
            if(logger0 != null) {
                logger0.w(s, s1, throwable0);
            }
        }
    }
}

