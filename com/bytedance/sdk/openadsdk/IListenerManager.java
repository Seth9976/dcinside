package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IListenerManager extends IInterface {
    public static class Default implements IListenerManager {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

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

    public static abstract class Stub extends Binder implements IListenerManager {
        static class PjT implements IListenerManager {
            public static IListenerManager PjT;
            private IBinder Zh;

            PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastDialogListener(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    if(this.Zh.transact(6, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().broadcastDialogListener(s, v);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void broadcastPermissionListener(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(this.Zh.transact(8, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().broadcastPermissionListener(s, s1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeAppOpenAdCallback(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(this.Zh.transact(13, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().executeAppOpenAdCallback(s, s1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeDisLikeClosedCallback(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(this.Zh.transact(11, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().executeDisLikeClosedCallback(s, s1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeFullVideoCallback(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(this.Zh.transact(4, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().executeFullVideoCallback(s, s1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void executeRewardVideoCallback(String s, String s1, boolean z, int v, String s2, int v1, String s3) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(((int)z));
                    parcel0.writeInt(v);
                    parcel0.writeString(s2);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s3);
                    if(this.Zh.transact(2, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().executeRewardVideoCallback(s, s1, z, v, s2, v1, s3);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerAppOpenAdListener(String s, IAppOpenAdInteractionListener iAppOpenAdInteractionListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iAppOpenAdInteractionListener0 == null ? null : iAppOpenAdInteractionListener0.asBinder()));
                    if(this.Zh.transact(12, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerAppOpenAdListener(s, iAppOpenAdInteractionListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDialogListener(String s, ICommonDialogListener iCommonDialogListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iCommonDialogListener0 == null ? null : iCommonDialogListener0.asBinder()));
                    if(this.Zh.transact(5, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerDialogListener(s, iCommonDialogListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerDisLikeClosedListener(String s, IDislikeClosedListener iDislikeClosedListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iDislikeClosedListener0 == null ? null : iDislikeClosedListener0.asBinder()));
                    if(this.Zh.transact(9, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerDisLikeClosedListener(s, iDislikeClosedListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerFullVideoListener(String s, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iFullScreenVideoAdInteractionListener0 == null ? null : iFullScreenVideoAdInteractionListener0.asBinder()));
                    if(this.Zh.transact(3, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerFullVideoListener(s, iFullScreenVideoAdInteractionListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerPermissionListener(String s, ICommonPermissionListener iCommonPermissionListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iCommonPermissionListener0 == null ? null : iCommonPermissionListener0.asBinder()));
                    if(this.Zh.transact(7, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerPermissionListener(s, iCommonPermissionListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void registerRewardVideoListener(String s, IRewardAdInteractionListener iRewardAdInteractionListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iRewardAdInteractionListener0 == null ? null : iRewardAdInteractionListener0.asBinder()));
                    if(this.Zh.transact(1, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().registerRewardVideoListener(s, iRewardAdInteractionListener0);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IListenerManager
            public void unregisterDisLikeClosedListener(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IListenerManager");
                    parcel0.writeString(s);
                    if(this.Zh.transact(10, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().unregisterDisLikeClosedListener(s);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.bytedance.sdk.openadsdk.IListenerManager");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IListenerManager asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.openadsdk.IListenerManager");
            return iInterface0 != null && iInterface0 instanceof IListenerManager ? ((IListenerManager)iInterface0) : new PjT(iBinder0);
        }

        public static IListenerManager getDefaultImpl() {
            return PjT.PjT;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v != 0x5F4E5446) {
                switch(v) {
                    case 1: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerRewardVideoListener(parcel0.readString(), com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 2: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.executeRewardVideoCallback(parcel0.readString(), parcel0.readString(), parcel0.readInt() != 0, parcel0.readInt(), parcel0.readString(), parcel0.readInt(), parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 3: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerFullVideoListener(parcel0.readString(), com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 4: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.executeFullVideoCallback(parcel0.readString(), parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 5: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerDialogListener(parcel0.readString(), com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 6: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.broadcastDialogListener(parcel0.readString(), parcel0.readInt());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 7: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerPermissionListener(parcel0.readString(), com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 8: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.broadcastPermissionListener(parcel0.readString(), parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 9: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerDisLikeClosedListener(parcel0.readString(), com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 10: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.unregisterDisLikeClosedListener(parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 11: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.executeDisLikeClosedCallback(parcel0.readString(), parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    case 12: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.registerAppOpenAdListener(parcel0.readString(), com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.asInterface(parcel0.readStrongBinder()));
                        parcel1.writeNoException();
                        return true;
                    }
                    case 13: {
                        parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IListenerManager");
                        this.executeAppOpenAdCallback(parcel0.readString(), parcel0.readString());
                        parcel1.writeNoException();
                        return true;
                    }
                    default: {
                        return super.onTransact(v, parcel0, parcel1, v1);
                    }
                }
            }
            parcel1.writeString("com.bytedance.sdk.openadsdk.IListenerManager");
            return true;
        }

        public static boolean setDefaultImpl(IListenerManager iListenerManager0) {
            if(PjT.PjT == null && iListenerManager0 != null) {
                PjT.PjT = iListenerManager0;
                return true;
            }
            return false;
        }
    }

    void broadcastDialogListener(String arg1, int arg2) throws RemoteException;

    void broadcastPermissionListener(String arg1, String arg2) throws RemoteException;

    void executeAppOpenAdCallback(String arg1, String arg2) throws RemoteException;

    void executeDisLikeClosedCallback(String arg1, String arg2) throws RemoteException;

    void executeFullVideoCallback(String arg1, String arg2) throws RemoteException;

    void executeRewardVideoCallback(String arg1, String arg2, boolean arg3, int arg4, String arg5, int arg6, String arg7) throws RemoteException;

    void registerAppOpenAdListener(String arg1, IAppOpenAdInteractionListener arg2) throws RemoteException;

    void registerDialogListener(String arg1, ICommonDialogListener arg2) throws RemoteException;

    void registerDisLikeClosedListener(String arg1, IDislikeClosedListener arg2) throws RemoteException;

    void registerFullVideoListener(String arg1, IFullScreenVideoAdInteractionListener arg2) throws RemoteException;

    void registerPermissionListener(String arg1, ICommonPermissionListener arg2) throws RemoteException;

    void registerRewardVideoListener(String arg1, IRewardAdInteractionListener arg2) throws RemoteException;

    void unregisterDisLikeClosedListener(String arg1) throws RemoteException;
}

