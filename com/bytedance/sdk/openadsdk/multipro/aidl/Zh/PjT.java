package com.bytedance.sdk.openadsdk.multipro.aidl.Zh;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub;
import com.bytedance.sdk.openadsdk.PjT.cr.Zh;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class PjT extends Stub {
    private Zh PjT;

    public PjT(Zh zh0) {
        this.PjT = zh0;
    }

    private void PjT() {
        this.PjT = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.onAdClicked();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.PjT();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.Zh();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                if(PjT.this.PjT != null) {
                    PjT.this.PjT.ReZ();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        this.PjT();
    }
}

