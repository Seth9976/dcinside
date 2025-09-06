package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public class Zh extends PjT {
    private static final Map PjT;
    private static volatile Zh Zh;

    static {
        Zh.PjT = DesugarCollections.synchronizedMap(new HashMap());
    }

    public static Zh PjT() {
        if(Zh.Zh == null) {
            Class class0 = Zh.class;
            __monitor_enter(class0);
            try {
                if(Zh.Zh == null) {
                    Zh.Zh = new Zh();
                }
                __monitor_exit(class0);
                return Zh.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return Zh.Zh;
    }

    private void PjT(String s, String s1) {
        int v1;
        RemoteCallbackList remoteCallbackList0;
        __monitor_enter(this);
        try {
            Map map0 = Zh.PjT;
            if(map0 != null) {
                remoteCallbackList0 = "recycleRes".equals(s1) ? ((RemoteCallbackList)map0.remove(s)) : ((RemoteCallbackList)map0.get(s));
                if(remoteCallbackList0 != null) {
                    int v = remoteCallbackList0.beginBroadcast();
                    v1 = 0;
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
            if(v1 >= v) {
                goto label_29;
            }
            try {
                IAppOpenAdInteractionListener iAppOpenAdInteractionListener0 = (IAppOpenAdInteractionListener)remoteCallbackList0.getBroadcastItem(v1);
                if(iAppOpenAdInteractionListener0 != null) {
                    if("onAdShow".equals(s1)) {
                        iAppOpenAdInteractionListener0.onAdShow();
                    }
                    else if("onAdClicked".equals(s1)) {
                        iAppOpenAdInteractionListener0.onAdClicked();
                    }
                    else if("onAdSkip".equals(s1)) {
                        iAppOpenAdInteractionListener0.onAdSkip();
                    }
                    else if("onAdTimeOver".equals(s1)) {
                        iAppOpenAdInteractionListener0.onAdTimeOver();
                    }
                    else if("recycleRes".equals(s1)) {
                        iAppOpenAdInteractionListener0.onDestroy();
                    }
                }
                ++v1;
                continue;
            }
            catch(Throwable throwable1) {
            }
            try {
                RD.PjT("MultiProcess", "appOpenAd2 method " + s1 + " throws Exception :", throwable1);
                ++v1;
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
            RD.PjT("MultiProcess", "appOpenAd1 method " + s1 + " throws Exception :", throwable0);
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
    public void executeAppOpenAdCallback(String s, String s1) throws RemoteException {
        this.PjT(s, s1);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void registerAppOpenAdListener(String s, IAppOpenAdInteractionListener iAppOpenAdInteractionListener0) throws RemoteException {
        synchronized(this) {
            RemoteCallbackList remoteCallbackList0 = new RemoteCallbackList();
            remoteCallbackList0.register(iAppOpenAdInteractionListener0);
            Zh.PjT.put(s, remoteCallbackList0);
        }
    }
}

