package com.igaworks.ssp.part;

public interface IMediationLogListener {
    void OnMediationLoadFailed(String arg1, int arg2);

    void OnMediationLoadStart(String arg1, int arg2);

    void OnMediationLoadSuccess(String arg1, int arg2);
}

