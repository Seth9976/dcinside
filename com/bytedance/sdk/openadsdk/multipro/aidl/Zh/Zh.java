package com.bytedance.sdk.openadsdk.multipro.aidl.Zh;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub;
import com.bytedance.sdk.openadsdk.ReZ.DWo;
import com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class Zh extends Stub {
    private final PjT PjT;
    private final String Zh;

    public Zh(String s, PjT cr$PjT0) {
        this.Zh = s;
        this.PjT = cr$PjT0;
    }

    @Override  // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        Jo.PjT(new Runnable() {
            final Zh PjT;

            @Override
            public void run() {
                if(Zh.this.PjT != null) {
                    Zh.this.PjT.PjT();
                    DWo.PjT(6, Zh.this.Zh);
                }
            }
        });
    }
}

