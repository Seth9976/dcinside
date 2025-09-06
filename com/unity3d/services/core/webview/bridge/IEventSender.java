package com.unity3d.services.core.webview.bridge;

import y4.l;

public interface IEventSender {
    boolean canSend();

    boolean sendEvent(@l Enum arg1, @l Enum arg2, @l Object[] arg3);
}

