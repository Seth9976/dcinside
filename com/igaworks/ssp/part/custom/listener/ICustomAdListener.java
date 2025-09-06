package com.igaworks.ssp.part.custom.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface ICustomAdListener {
    void OnCustomAdReceiveFailed(String arg1, SSPErrorCode arg2);

    void OnCustomAdReceiveSuccess(String arg1, String arg2);
}

