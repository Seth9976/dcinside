package com.unity3d.services.core.log;

import android.util.Log;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

public class DeviceLog {
    public static enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR;

        private static UnityAdsLogLevel[] $values() [...] // Inlined contents
    }

    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 0xC00;
    private static final HashMap _deviceLogLevel;

    static {
        HashMap hashMap0 = new HashMap();
        DeviceLog._deviceLogLevel = hashMap0;
        if(hashMap0.size() == 0) {
            DeviceLogLevel deviceLogLevel0 = new DeviceLogLevel("i");
            hashMap0.put(UnityAdsLogLevel.INFO, deviceLogLevel0);
            DeviceLogLevel deviceLogLevel1 = new DeviceLogLevel("d");
            hashMap0.put(UnityAdsLogLevel.DEBUG, deviceLogLevel1);
            DeviceLogLevel deviceLogLevel2 = new DeviceLogLevel("w");
            hashMap0.put(UnityAdsLogLevel.WARNING, deviceLogLevel2);
            DeviceLogLevel deviceLogLevel3 = new DeviceLogLevel("e");
            hashMap0.put(UnityAdsLogLevel.ERROR, deviceLogLevel3);
        }
        if(new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            DeviceLog.FORCE_DEBUG_LOG = true;
        }
    }

    private static String checkMessage(String s) {
        return s != null && s.length() != 0 ? s : "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead";
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel deviceLog$UnityAdsLogLevel0, String s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        DeviceLogLevel deviceLogLevel0 = DeviceLog.getLogLevel(deviceLog$UnityAdsLogLevel0);
        if(deviceLogLevel0 != null) {
            int v = 0;
            boolean z = false;
            while(v < arr_stackTraceElement.length) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                String s1 = stackTraceElement0.getClassName();
                Class class0 = DeviceLog.class;
                if(s1.equals("com.unity3d.services.core.log.DeviceLog")) {
                    z = true;
                }
                if(!stackTraceElement0.getClassName().equals(class0.getName()) && z) {
                    break;
                }
                ++v;
            }
            StackTraceElement stackTraceElement1 = v >= arr_stackTraceElement.length ? null : arr_stackTraceElement[v];
            return stackTraceElement1 == null ? null : new DeviceLogEntry(deviceLogLevel0, s, stackTraceElement1);
        }
        return null;
    }

    public static void debug(String s) {
        if(s.length() > 0xC00) {
            DeviceLog.debug(s.substring(0, 0xC00));
            if(s.length() < 0x7800) {
                DeviceLog.debug(s.substring(0xC00));
            }
            return;
        }
        DeviceLog.write(UnityAdsLogLevel.DEBUG, DeviceLog.checkMessage(s));
    }

    public static void debug(String s, Object[] arr_object) {
        DeviceLog.debug(String.format(s, arr_object));
    }

    public static void entered() {
        DeviceLog.debug("ENTERED METHOD");
    }

    public static void error(String s) {
        DeviceLog.write(UnityAdsLogLevel.ERROR, DeviceLog.checkMessage(s));
    }

    public static void error(String s, Object[] arr_object) {
        DeviceLog.error(String.format(s, arr_object));
    }

    public static void exception(String s, Exception exception0) {
        String s1 = s == null ? "" : "" + s;
        if(exception0 != null) {
            s1 = s1 + ": " + exception0.getMessage();
        }
        if(exception0 != null && exception0.getCause() != null) {
            s1 = s1 + ": " + exception0.getCause().getMessage();
        }
        DeviceLog.write(UnityAdsLogLevel.ERROR, s1);
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel deviceLog$UnityAdsLogLevel0) {
        return (DeviceLogLevel)DeviceLog._deviceLogLevel.get(deviceLog$UnityAdsLogLevel0);
    }

    public static void info(String s) {
        DeviceLog.write(UnityAdsLogLevel.INFO, DeviceLog.checkMessage(s));
    }

    public static void info(String s, Object[] arr_object) {
        DeviceLog.info(String.format(s, arr_object));
    }

    private static boolean isDebugEnabled() [...] // 潜在的解密器

    public static void setLogLevel(int v) {
        if(v >= 8) {
            DeviceLog.LOG_ERROR = true;
            DeviceLog.LOG_WARNING = true;
            DeviceLog.LOG_INFO = true;
            DeviceLog.LOG_DEBUG = true;
            return;
        }
        if(v >= 4) {
            DeviceLog.LOG_ERROR = true;
            DeviceLog.LOG_WARNING = true;
            DeviceLog.LOG_INFO = true;
            DeviceLog.LOG_DEBUG = false;
            return;
        }
        if(v >= 2) {
            DeviceLog.LOG_ERROR = true;
            DeviceLog.LOG_WARNING = true;
            DeviceLog.LOG_INFO = false;
            DeviceLog.LOG_DEBUG = false;
            return;
        }
        if(v >= 1) {
            DeviceLog.LOG_ERROR = true;
            DeviceLog.LOG_WARNING = false;
            DeviceLog.LOG_INFO = false;
            DeviceLog.LOG_DEBUG = false;
            return;
        }
        DeviceLog.LOG_ERROR = false;
        DeviceLog.LOG_WARNING = false;
        DeviceLog.LOG_INFO = false;
        DeviceLog.LOG_DEBUG = false;
    }

    public static void warning(String s) {
        DeviceLog.write(UnityAdsLogLevel.WARNING, DeviceLog.checkMessage(s));
    }

    public static void warning(String s, Object[] arr_object) {
        DeviceLog.warning(String.format(s, arr_object));
    }

    private static void write(UnityAdsLogLevel deviceLog$UnityAdsLogLevel0, String s) {
        boolean z1;
        boolean z = true;
        switch(deviceLog$UnityAdsLogLevel0) {
            case 1: {
                z1 = DeviceLog.LOG_INFO;
                break;
            }
            case 2: {
                z1 = true;
                break;
            }
            case 3: {
                z1 = DeviceLog.LOG_WARNING;
                break;
            }
            case 4: {
                z1 = DeviceLog.LOG_ERROR;
                break;
            }
            default: {
                z1 = true;
            }
        }
        if(!DeviceLog.FORCE_DEBUG_LOG) {
            z = z1;
        }
        if(z) {
            DeviceLog.writeToLog(DeviceLog.createLogEntry(deviceLog$UnityAdsLogLevel0, s));
        }
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry0) {
        Method method0;
        if(deviceLogEntry0 != null && deviceLogEntry0.getLogLevel() != null) {
            try {
                method0 = Log.class.getMethod(deviceLogEntry0.getLogLevel().getReceivingMethodName(), String.class, String.class);
            }
            catch(Exception exception0) {
                Log.e("UnityAds", "Writing to log failed!", exception0);
                method0 = null;
            }
            if(method0 != null) {
                try {
                    method0.invoke(null, "UnityAds", deviceLogEntry0.getParsedMessage());
                }
                catch(Exception exception1) {
                    Log.e("UnityAds", "Writing to log failed!", exception1);
                }
            }
        }
    }
}

