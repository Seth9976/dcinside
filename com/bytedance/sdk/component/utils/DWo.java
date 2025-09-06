package com.bytedance.sdk.component.utils;

import java.io.Closeable;

public class DWo {
    public static void PjT(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }
}

