package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICommonPermissionListener extends IInterface {
    public static class Default implements ICommonPermissionListener {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onDenied(String s) throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onGranted() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonPermissionListener {
        static class PjT implements ICommonPermissionListener {
            public static ICommonPermissionListener PjT;
            private IBinder Zh;

            PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }

            @Override  // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onDenied(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    parcel0.writeString(s);
                    if(this.Zh.transact(2, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onDenied(s);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onGranted() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if(this.Zh.transact(1, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onGranted();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ICommonPermissionListener asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            return iInterface0 != null && iInterface0 instanceof ICommonPermissionListener ? ((ICommonPermissionListener)iInterface0) : new PjT(iBinder0);
        }

        public static ICommonPermissionListener getDefaultImpl() {
            return PjT.PjT;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    this.onGranted();
                    parcel1.writeNoException();
                    return true;
                }
                case 2: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    this.onDenied(parcel0.readString());
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static boolean setDefaultImpl(ICommonPermissionListener iCommonPermissionListener0) {
            if(PjT.PjT == null && iCommonPermissionListener0 != null) {
                PjT.PjT = iCommonPermissionListener0;
                return true;
            }
            return false;
        }
    }

    void onDenied(String arg1) throws RemoteException;

    void onGranted() throws RemoteException;
}

