package com.igaworks.ssp.part.contents.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IContentsAdEventCallbackListener {
    void OnContentsAdClosed();

    void OnContentsAdCompleted(long arg1, String arg2);

    void OnContentsAdOpenFailed(SSPErrorCode arg1);

    void OnContentsAdOpened();
}

