package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

public class ReZ extends PjT {
    private static final HashMap PjT;
    private static volatile ReZ Zh;

    static {
        ReZ.PjT = new HashMap();
    }

    public static ReZ PjT() {
        if(ReZ.Zh == null) {
            Class class0 = ReZ.class;
            __monitor_enter(class0);
            try {
                if(ReZ.Zh == null) {
                    ReZ.Zh = new ReZ();
                }
                __monitor_exit(class0);
                return ReZ.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return ReZ.Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void broadcastPermissionListener(String s, String s1) throws RemoteException {
        RemoteCallbackList remoteCallbackList0 = (RemoteCallbackList)ReZ.PjT.remove(s);
        if(remoteCallbackList0 == null) {
            return;
        }
        int v = remoteCallbackList0.beginBroadcast();
        for(int v1 = 0; v1 < v; ++v1) {
            ICommonPermissionListener iCommonPermissionListener0 = (ICommonPermissionListener)remoteCallbackList0.getBroadcastItem(v1);
            if(iCommonPermissionListener0 != null) {
                if(s1 == null) {
                    iCommonPermissionListener0.onGranted();
                }
                else {
                    iCommonPermissionListener0.onDenied(s1);
                }
            }
        }
        remoteCallbackList0.finishBroadcast();
        remoteCallbackList0.kill();
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.aidl.PjT.PjT
    public void registerPermissionListener(String s, ICommonPermissionListener iCommonPermissionListener0) throws RemoteException {
        if(iCommonPermissionListener0 == null) {
            return;
        }
        RemoteCallbackList remoteCallbackList0 = new RemoteCallbackList();
        remoteCallbackList0.register(iCommonPermissionListener0);
        ReZ.PjT.put(s, remoteCallbackList0);
    }
}

