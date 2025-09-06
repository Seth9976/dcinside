package com.bytedance.sdk.openadsdk.multipro.aidl.Zh;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub;
import com.bytedance.sdk.openadsdk.PjT.JQp.PjT;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class cr extends Stub {
    private PjT PjT;

    public cr(PjT pjT0) {
        this.PjT = pjT0;
    }

    private void PjT() {
        this.PjT = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final cr PjT;

            @Override
            public void run() {
                if(cr.this.PjT != null) {
                    cr.this.PjT.Zh();
                }
                cr.this.PjT();
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final cr PjT;

            @Override
            public void run() {
                if(cr.this.PjT != null) {
                    cr.this.PjT.PjT();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final cr PjT;

            @Override
            public void run() {
                if(cr.this.PjT != null) {
                    cr.this.PjT.onAdClicked();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(boolean z, int v, String s, int v1, String s1) throws RemoteException {
        if(this.PjT == null) {
            return;
        }
        Jo.PjT(new Runnable() {
            final cr cz;

            @Override
            public void run() {
                if(cr.this.PjT != null) {
                    cr.this.PjT.PjT(z, v, s, v1, s1);
                }
            }
        });
    }
}

