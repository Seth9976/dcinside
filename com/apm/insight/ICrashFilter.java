package com.apm.insight;

public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable arg1, Thread arg2);

    boolean onNativeCrashFilter(String arg1, String arg2);
}

