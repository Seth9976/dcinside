package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICommonDialogListener extends IInterface {
    public static class Default implements ICommonDialogListener {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws RemoteException {
        }

        @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ICommonDialogListener {
        static class PjT implements ICommonDialogListener {
            public static ICommonDialogListener PjT;
            private IBinder Zh;

            PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }

            @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if(this.Zh.transact(2, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onDialogBtnNo();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if(this.Zh.transact(1, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onDialogBtnYes();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if(this.Zh.transact(3, parcel0, parcel1, 0) || Stub.getDefaultImpl() == null) {
                        parcel1.readException();
                    }
                    else {
                        Stub.getDefaultImpl().onDialogCancel();
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ICommonDialogListener asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            return iInterface0 != null && iInterface0 instanceof ICommonDialogListener ? ((ICommonDialogListener)iInterface0) : new PjT(iBinder0);
        }

        public static ICommonDialogListener getDefaultImpl() {
            return PjT.PjT;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    this.onDialogBtnYes();
                    parcel1.writeNoException();
                    return true;
                }
                case 2: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    this.onDialogBtnNo();
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    this.onDialogCancel();
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static boolean setDefaultImpl(ICommonDialogListener iCommonDialogListener0) {
            if(PjT.PjT == null && iCommonDialogListener0 != null) {
                PjT.PjT = iCommonDialogListener0;
                return true;
            }
            return false;
        }
    }

    void onDialogBtnNo() throws RemoteException;

    void onDialogBtnYes() throws RemoteException;

    void onDialogCancel() throws RemoteException;
}

