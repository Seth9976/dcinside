package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import j..util.concurrent.ConcurrentHashMap;

public class cr extends PjT {
    public static ConcurrentHashMap PjT;
    private static volatile cr Zh;

    static {
        cr.PjT = new ConcurrentHashMap();
    }

    public static cr PjT() {
        if(cr.Zh == null) {
            Class class0 = cr.class;
            __monitor_enter(class0);
            try {
                if(cr.Zh == null) {
                    cr.Zh = new cr();
                }
                __monitor_exit(class0);
                return cr.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cr.Zh;
    }

    private void PjT(String s, String s1) {
        int v1;
        RemoteCallbackList remoteCallbackList0;
        __monitor_enter(this);
        try {
            ConcurrentHashMap concurrentHashMap0 = cr.PjT;
            if(concurrentHashMap0 != null) {
                remoteCallbackList0 = (RemoteCallbackList)concurrentHashMap0.get(s);
                if(remoteCallbackList0 != null) {
                    int v = remoteCallbackList0.beginBroadcast();
                    v1 = 0;
                    goto label_7;
                }
            }
            goto label_26;
        }
        catch(Throwable throwable0) {
            goto label_19;
        }
        while(true) {
        label_7:
            if(v1 >= v) {
                goto label_16;
            }
            try {
                IDislikeClosedListener iDislikeClosedListener0 = (IDislikeClosedListener)remoteCallbackList0.getBroadcastItem(v1);
                if(iDislikeClosedListener0 != null && "onItemClickClosed".equals(s1)) {
                    iDislikeClosedListener0.onItemClickClosed();
                }
                ++v1;
                continue;
            }
            catch(Throwable throwable1) {
                try {
                    RD.PjT("MultiProcess", "dislike \'" + s1 + "\'  throws Exception :", throwable1);
                    ++v1;
                    continue;
                label_16:
                    remoteCallbackList0.finishBroadcast();
                    goto label_26;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
        }
        try {
        label_19:
            RD.PjT("MultiProcess", "dislike \'" + s1 + "\'  throws Exception :", throwable0);
        }
        catch(Throwable throwable2) {
            __monitor_exit(this);
            throw throwable2;
        }
        __monitor_exit(this);
        return;
    label_26:
        __monitor_exit(this);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void executeDisLikeClosedCallback(String s, String s1) throws RemoteException {
        this.PjT(s, s1);
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void registerDisLikeClosedListener(String s, IDislikeClosedListener iDislikeClosedListener0) throws RemoteException {
        synchronized(this) {
            RemoteCallbackList remoteCallbackList0 = new RemoteCallbackList();
            remoteCallbackList0.register(iDislikeClosedListener0);
            cr.PjT.put(s, remoteCallbackList0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void unregisterDisLikeClosedListener(String s) throws RemoteException {
        if(!TextUtils.isEmpty(s)) {
            cr.PjT.remove(s);
        }
    }
}

