package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;

public abstract class PjT extends Stub {
    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastDialogListener(String s, int v) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String s, String s1) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String s, String s1) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String s, String s1) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String s, String s1) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String s, String s1, boolean z, int v, String s2, int v1, String s3) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerAppOpenAdListener(String s, IAppOpenAdInteractionListener iAppOpenAdInteractionListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDialogListener(String s, ICommonDialogListener iCommonDialogListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDisLikeClosedListener(String s, IDislikeClosedListener iDislikeClosedListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerFullVideoListener(String s, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String s, ICommonPermissionListener iCommonPermissionListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerRewardVideoListener(String s, IRewardAdInteractionListener iRewardAdInteractionListener0) throws RemoteException {
    }

    @Override  // com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String s) throws RemoteException {
    }
}

