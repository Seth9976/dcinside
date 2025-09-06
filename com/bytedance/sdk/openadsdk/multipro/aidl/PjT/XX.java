package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public class XX extends PjT {
    private static final Map PjT;
    private static volatile XX Zh;

    static {
        XX.PjT = DesugarCollections.synchronizedMap(new HashMap());
    }

    public static XX PjT() {
        if(XX.Zh == null) {
            Class class0 = XX.class;
            __monitor_enter(class0);
            try {
                if(XX.Zh == null) {
                    XX.Zh = new XX();
                }
                __monitor_exit(class0);
                return XX.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return XX.Zh;
    }

    private void PjT(String s, String s1, boolean z, int v, String s2, int v1, String s3) {
        int v3;
        RemoteCallbackList remoteCallbackList0;
        __monitor_enter(this);
        try {
            Map map0 = XX.PjT;
            if(map0 != null) {
                remoteCallbackList0 = "recycleRes".equals(s1) ? ((RemoteCallbackList)map0.remove(s)) : ((RemoteCallbackList)map0.get(s));
                if(remoteCallbackList0 != null) {
                    int v2 = remoteCallbackList0.beginBroadcast();
                    v3 = 0;
                    goto label_7;
                }
            }
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        while(true) {
        label_7:
            if(v3 >= v2) {
                goto label_29;
            }
            try {
                IRewardAdInteractionListener iRewardAdInteractionListener0 = (IRewardAdInteractionListener)remoteCallbackList0.getBroadcastItem(v3);
                if(iRewardAdInteractionListener0 != null) {
                    if("onAdShow".equals(s1)) {
                        iRewardAdInteractionListener0.onAdShow();
                    }
                    else if("onAdClose".equals(s1)) {
                        iRewardAdInteractionListener0.onAdClose();
                    }
                    else if("onAdVideoBarClick".equals(s1)) {
                        iRewardAdInteractionListener0.onAdVideoBarClick();
                    }
                    else if("onRewardVerify".equals(s1)) {
                        iRewardAdInteractionListener0.onRewardVerify(z, v, s2, v1, s3);
                    }
                    else if("recycleRes".equals(s1)) {
                        iRewardAdInteractionListener0.onDestroy();
                    }
                }
                ++v3;
                continue;
            }
            catch(Throwable throwable1) {
            }
            try {
                RD.PjT("MultiProcess", "reward1 \'" + s1 + "\'  throws Exception :", throwable1);
                ++v3;
                continue;
            label_29:
                remoteCallbackList0.finishBroadcast();
                if("recycleRes".equals(s1)) {
                    remoteCallbackList0.kill();
                }
                goto label_41;
            }
            catch(Throwable throwable0) {
                break;
            }
        }
        try {
        label_34:
            RD.PjT("MultiProcess", "reward2 \'" + s1 + "\'  throws Exception :", throwable0);
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
        return;
    label_41:
        __monitor_exit(this);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void executeRewardVideoCallback(String s, String s1, boolean z, int v, String s2, int v1, String s3) throws RemoteException {
        this.PjT(s, s1, z, v, s2, v1, s3);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void registerRewardVideoListener(String s, IRewardAdInteractionListener iRewardAdInteractionListener0) throws RemoteException {
        synchronized(this) {
            RemoteCallbackList remoteCallbackList0 = new RemoteCallbackList();
            remoteCallbackList0.register(iRewardAdInteractionListener0);
            XX.PjT.put(s, remoteCallbackList0);
        }
    }
}

