package com.bytedance.sdk.openadsdk.ub;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

public interface Zh {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String arg1, int arg2);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List arg1);
}

