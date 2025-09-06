package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IMultiInstanceInvalidationService extends IInterface {
    public static class Default implements IMultiInstanceInvalidationService {
        @Override  // androidx.room.IMultiInstanceInvalidationService
        public void E0(int v, String[] arr_s) throws RemoteException {
        }

        @Override  // androidx.room.IMultiInstanceInvalidationService
        public int M0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, String s) throws RemoteException {
            return 0;
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.room.IMultiInstanceInvalidationService
        public void g1(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        static class Proxy implements IMultiInstanceInvalidationService {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void E0(int v, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public int M0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel0.writeStrongInterface(iMultiInstanceInvalidationCallback0);
                    parcel0.writeString(s);
                    this.a.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void g1(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcel0.writeStrongInterface(iMultiInstanceInvalidationCallback0);
                    parcel0.writeInt(v);
                    this.a.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "androidx.room.IMultiInstanceInvalidationService";
            }
        }

        static final int a = 1;
        static final int b = 2;
        static final int c = 3;

        public Stub() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IMultiInstanceInvalidationService i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return iInterface0 != null && iInterface0 instanceof IMultiInstanceInvalidationService ? ((IMultiInstanceInvalidationService)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            switch(v) {
                case 1: {
                    int v2 = this.M0(androidx.room.IMultiInstanceInvalidationCallback.Stub.i1(parcel0.readStrongBinder()), parcel0.readString());
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 2: {
                    this.g1(androidx.room.IMultiInstanceInvalidationCallback.Stub.i1(parcel0.readStrongBinder()), parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    this.E0(parcel0.readInt(), parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String r1;

    static {
        IMultiInstanceInvalidationService.r1 = "androidx.room.IMultiInstanceInvalidationService";
    }

    void E0(int arg1, String[] arg2) throws RemoteException;

    int M0(IMultiInstanceInvalidationCallback arg1, String arg2) throws RemoteException;

    void g1(IMultiInstanceInvalidationCallback arg1, int arg2) throws RemoteException;
}

