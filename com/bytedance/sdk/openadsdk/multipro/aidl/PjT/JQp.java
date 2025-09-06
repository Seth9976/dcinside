package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public class JQp extends PjT {
    private static final Map PjT;
    private static volatile JQp Zh;

    static {
        JQp.PjT = DesugarCollections.synchronizedMap(new HashMap());
    }

    public static JQp PjT() {
        if(JQp.Zh == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.Zh == null) {
                    JQp.Zh = new JQp();
                }
                __monitor_exit(class0);
                return JQp.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.Zh;
    }

    private void PjT(String s, String s1) {
        int v1;
        RemoteCallbackList remoteCallbackList0;
        __monitor_enter(this);
        try {
            Map map0 = JQp.PjT;
            if(map0 != null) {
                remoteCallbackList0 = "recycleRes".equals(s1) ? ((RemoteCallbackList)map0.remove(s)) : ((RemoteCallbackList)map0.get(s));
                if(remoteCallbackList0 != null) {
                    int v = remoteCallbackList0.beginBroadcast();
                    v1 = 0;
                    goto label_7;
                }
            }
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        while(true) {
        label_7:
            if(v1 >= v) {
                goto label_26;
            }
            try {
                IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener0 = (IFullScreenVideoAdInteractionListener)remoteCallbackList0.getBroadcastItem(v1);
                if(iFullScreenVideoAdInteractionListener0 != null) {
                    if("onAdShow".equals(s1)) {
                        iFullScreenVideoAdInteractionListener0.onAdShow();
                    }
                    else if("onAdClose".equals(s1)) {
                        iFullScreenVideoAdInteractionListener0.onAdClose();
                    }
                    else if("onAdVideoBarClick".equals(s1)) {
                        iFullScreenVideoAdInteractionListener0.onAdVideoBarClick();
                    }
                    else if("recycleRes".equals(s1)) {
                        iFullScreenVideoAdInteractionListener0.onDestroy();
                    }
                }
                ++v1;
                continue;
            }
            catch(Throwable throwable1) {
            }
            try {
                RD.PjT("MultiProcess", "fullScreen2 method " + s1 + " throws Exception :", throwable1);
                ++v1;
                continue;
            label_26:
                remoteCallbackList0.finishBroadcast();
                if("recycleRes".equals(s1)) {
                    remoteCallbackList0.kill();
                }
                goto label_38;
            }
            catch(Throwable throwable0) {
                break;
            }
        }
        try {
        label_31:
            RD.PjT("MultiProcess", "fullScreen1 method " + s1 + " throws Exception :", throwable0);
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
        return;
    label_38:
        __monitor_exit(this);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void executeFullVideoCallback(String s, String s1) throws RemoteException {
        this.PjT(s, s1);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void registerFullVideoListener(String s, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener0) throws RemoteException {
        synchronized(this) {
            RemoteCallbackList remoteCallbackList0 = new RemoteCallbackList();
            remoteCallbackList0.register(iFullScreenVideoAdInteractionListener0);
            JQp.PjT.put(s, remoteCallbackList0);
        }
    }
}

