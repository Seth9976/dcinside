package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IWorkManagerImplCallback extends IInterface {
    public static class Default implements IWorkManagerImplCallback {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
        public void i0(byte[] arr_b) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(String error) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        static class Proxy implements IWorkManagerImplCallback {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
            public void i0(byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcel0.writeByteArray(arr_b);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "androidx.work.multiprocess.IWorkManagerImplCallback";
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
                    parcel0.writeString(s);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 1;
        static final int b = 2;

        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IWorkManagerImplCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IWorkManagerImplCallback i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            return iInterface0 != null && iInterface0 instanceof IWorkManagerImplCallback ? ((IWorkManagerImplCallback)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            }
            switch(v) {
                case 1: {
                    this.i0(parcel0.createByteArray());
                    return true;
                }
                case 2: {
                    this.onFailure(parcel0.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String w1;

    static {
        IWorkManagerImplCallback.w1 = "androidx.work.multiprocess.IWorkManagerImplCallback";
    }

    void i0(byte[] arg1) throws RemoteException;

    void onFailure(String arg1) throws RemoteException;
}

