package com.fsn.cauly;

import android.util.Log;

public class Logger {
    public static enum LogLevel {
        None,
        Error,
        Warn,
        Info,
        Debug,
        Verbose;

    }

    static LogLevel a;

    static {
        Logger.a = LogLevel.Warn;
    }

    public static LogLevel getLogLevel() {
        return Logger.a;
    }

    public static void setLogLevel(LogLevel logger$LogLevel0) {
        if(logger$LogLevel0.ordinal() >= LogLevel.Debug.ordinal()) {
            Logger.a = LogLevel.Info;
            return;
        }
        Logger.a = logger$LogLevel0;
    }

    public static void writeLog(LogLevel logger$LogLevel0, String s) {
        if(Logger.a.ordinal() < logger$LogLevel0.ordinal()) {
            return;
        }
        switch(logger$LogLevel0) {
            case 1: {
                Log.e("Cauly", s);
                return;
            }
            case 2: {
                Log.w("Cauly", s);
                return;
            }
            case 3: {
                Log.i("Cauly", s);
                return;
            }
            case 4: {
                Log.d("Cauly", s);
                return;
            }
            case 5: {
                Log.v("Cauly", s);
            }
        }
    }
}

