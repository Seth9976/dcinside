package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IListenableWorkerImpl extends IInterface {
    public static class Default implements IListenableWorkerImpl {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IListenableWorkerImpl
        public void f0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IListenableWorkerImpl
        public void l(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {
        static class Proxy implements IListenableWorkerImpl {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // androidx.work.multiprocess.IListenableWorkerImpl
            public void f0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            // 去混淆评级： 低(20)
            public String i1() {
                return "androidx.work.multiprocess.IListenableWorkerImpl";
            }

            @Override  // androidx.work.multiprocess.IListenableWorkerImpl
            public void l(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 1;
        static final int b = 2;

        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IListenableWorkerImpl");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IListenableWorkerImpl i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            return iInterface0 != null && iInterface0 instanceof IListenableWorkerImpl ? ((IListenableWorkerImpl)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            }
            switch(v) {
                case 1: {
                    this.l(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 2: {
                    this.f0(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String u1;

    static {
        IListenableWorkerImpl.u1 = "androidx.work.multiprocess.IListenableWorkerImpl";
    }

    void f0(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void l(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;
}

