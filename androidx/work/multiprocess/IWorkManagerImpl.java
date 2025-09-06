package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IWorkManagerImpl extends IInterface {
    public static class Default implements IWorkManagerImpl {
        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void I(String s, byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void J(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void K(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void Q0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void a1(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void e(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void k0(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void m0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void n0(IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void y0(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImpl {
        static class Proxy implements IWorkManagerImpl {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void I(String s, byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void J(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void K(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void Q0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void a1(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void e(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeString(s);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "androidx.work.multiprocess.IWorkManagerImpl";
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void k0(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeString(s);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void m0(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void n0(IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.work.multiprocess.IWorkManagerImpl
            public void y0(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel0.writeString(s);
                    parcel0.writeStrongInterface(iWorkManagerImplCallback0);
                    this.a.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        static final int e = 5;
        static final int f = 6;
        static final int g = 7;
        static final int h = 8;
        static final int i = 9;
        static final int j = 10;

        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IWorkManagerImpl i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
            return iInterface0 != null && iInterface0 instanceof IWorkManagerImpl ? ((IWorkManagerImpl)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch(v) {
                case 1: {
                    this.m0(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 2: {
                    this.I(parcel0.readString(), parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 3: {
                    this.K(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 4: {
                    this.y0(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 5: {
                    this.k0(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 6: {
                    this.e(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 7: {
                    this.n0(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 8: {
                    this.Q0(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 9: {
                    this.J(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 10: {
                    this.a1(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String v1;

    static {
        IWorkManagerImpl.v1 = "androidx.work.multiprocess.IWorkManagerImpl";
    }

    void I(String arg1, byte[] arg2, IWorkManagerImplCallback arg3) throws RemoteException;

    void J(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void K(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void Q0(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void a1(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void e(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void k0(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void m0(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void n0(IWorkManagerImplCallback arg1) throws RemoteException;

    void y0(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;
}

