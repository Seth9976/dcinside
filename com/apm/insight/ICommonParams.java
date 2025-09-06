package com.apm.insight;

import java.util.List;
import java.util.Map;

public interface ICommonParams {
    Map getCommonParams();

    String getDeviceId();

    List getPatchInfo();

    Map getPluginInfo();

    String getSessionId();

    long getUserId();
}

