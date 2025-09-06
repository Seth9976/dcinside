package com.unity3d.services.core.webview.bridge;

import y4.l;

public interface INativeCallbackSubject {
    @l
    NativeCallback getCallback(@l String arg1);

    void remove(@l NativeCallback arg1);
}

