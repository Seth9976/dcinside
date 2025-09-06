package com.igaworks.ssp.part.popcontents.listener;

import com.igaworks.ssp.SSPErrorCode;

public interface IPopContentsAdEventCallbackListener {
    void OnPopContentsAdClosed();

    void OnPopContentsAdOpenFailed(SSPErrorCode arg1);

    void OnPopContentsAdOpened();
}

