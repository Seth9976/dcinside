package com.igaworks.ssp.part.custom.listener;

import com.igaworks.ssp.SSPErrorCode;
import java.util.List;

public interface IOneStoreAdEventCallbackListener {
    void OnLoadFailed(SSPErrorCode arg1);

    void OnLoadSuccess(List arg1);
}

