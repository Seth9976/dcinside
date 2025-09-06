package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IFullScreenVideoAdInteractionListener extends IInterface {
    public static class Default implements IFullScreenVideoAdInteractionListener {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdClose() throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdShow() throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onDestroy() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFullScreenVideoAdInteractionListener {
        static class PjT implements IFullScreenVideoAdInteractionListener {
            public static IFullScreenVideoAdInteractionListener PjT;
            private IBinder Zh;

            PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }

            @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdClose() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if(this.Zh.transact(4, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onAdClose();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdShow() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if(this.Zh.transact(2, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onAdShow();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdVideoBarClick() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if(this.Zh.transact(3, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onAdVideoBarClick();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if(this.Zh.transact(1, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onDestroy();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IFullScreenVideoAdInteractionListener asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
            return iInterface0 != null && iInterface0 instanceof IFullScreenVideoAdInteractionListener ? ((IFullScreenVideoAdInteractionListener)iInterface0) : new PjT(iBinder0);
        }

        public static IFullScreenVideoAdInteractionListener getDefaultImpl() {
            return PjT.PjT;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    this.onDestroy();
                    parcel1.writeNoException();
                    return true;
                }
                case 2: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    this.onAdShow();
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    this.onAdVideoBarClick();
                    parcel1.writeNoException();
                    return true;
                }
                case 4: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    this.onAdClose();
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static boolean setDefaultImpl(IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener0) {
            if(PjT.PjT == null && iFullScreenVideoAdInteractionListener0 != null) {
                PjT.PjT = iFullScreenVideoAdInteractionListener0;
                return true;
            }
            return false;
        }
    }

    void onAdClose() throws RemoteException;

    void onAdShow() throws RemoteException;

    void onAdVideoBarClick() throws RemoteException;

    void onDestroy() throws RemoteException;
}

