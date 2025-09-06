package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IBinderPool extends IInterface {
    public static class Default implements IBinderPool {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int v) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IBinderPool {
        static class PjT implements IBinderPool {
            public static IBinderPool PjT;
            private IBinder Zh;

            PjT(IBinder iBinder0) {
                this.Zh = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.Zh;
            }

            @Override  // com.bytedance.sdk.openadsdk.IBinderPool
            public IBinder queryBinder(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    parcel0.writeInt(v);
                    if(!this.Zh.transact(1, parcel0, parcel1, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(v);
                    }
                    parcel1.readException();
                    return parcel1.readStrongBinder();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IBinderPool asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            return iInterface0 != null && iInterface0 instanceof IBinderPool ? ((IBinderPool)iInterface0) : new PjT(iBinder0);
        }

        public static IBinderPool getDefaultImpl() {
            return PjT.PjT;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
                    IBinder iBinder0 = this.queryBinder(parcel0.readInt());
                    parcel1.writeNoException();
                    parcel1.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool0) {
            if(PjT.PjT == null && iBinderPool0 != null) {
                PjT.PjT = iBinderPool0;
                return true;
            }
            return false;
        }
    }

    IBinder queryBinder(int arg1) throws RemoteException;
}

