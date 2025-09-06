package com.bytedance.sdk.openadsdk.multipro.aidl.Zh;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub;
import com.bytedance.sdk.openadsdk.PjT.ReZ.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class ReZ extends Stub {
    private Zh PjT;

    public ReZ(Zh zh0) {
        this.PjT = zh0;
    }

    private void PjT() {
        this.PjT = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.PjT != null) {
                    ReZ.this.PjT.Zh();
                }
                ReZ.this.PjT();
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.PjT != null) {
                    ReZ.this.PjT.PjT();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                if(ReZ.this.PjT != null) {
                    ReZ.this.PjT.onAdClicked();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}

