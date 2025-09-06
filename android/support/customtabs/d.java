package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface d extends IInterface {
    public static class a implements d {
        @Override  // android.support.customtabs.d
        public void T0(android.support.customtabs.a a0, String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.customtabs.d
        public void m(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements d {
        static class android.support.customtabs.d.b.a implements d {
            private IBinder a;

            android.support.customtabs.d.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.customtabs.d
            public void T0(android.support.customtabs.a a0, String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.IPostMessageService");
                    parcel0.writeStrongInterface(a0);
                    parcel0.writeString(s);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
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

            public String i1() {
                return "android.support.customtabs.IPostMessageService";
            }

            @Override  // android.support.customtabs.d
            public void m(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.IPostMessageService");
                    parcel0.writeStrongInterface(a0);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        static final int a = 2;
        static final int b = 3;

        public b() {
            this.attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static d i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.IPostMessageService");
            return iInterface0 != null && iInterface0 instanceof d ? ((d)iInterface0) : new android.support.customtabs.d.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.IPostMessageService");
            }
            switch(v) {
                case 2: {
                    this.m(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    this.T0(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), parcel0.readString(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.customtabs.IPostMessageService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static class c {
        private static Object c(Parcel parcel0, Parcelable.Creator parcelable$Creator0) {
            return parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0);
        }

        private static void d(Parcel parcel0, Parcelable parcelable0, int v) {
            if(parcelable0 != null) {
                parcel0.writeInt(1);
                parcelable0.writeToParcel(parcel0, v);
                return;
            }
            parcel0.writeInt(0);
        }
    }

    public static final String c0;

    static {
        d.c0 = "android.support.customtabs.IPostMessageService";
    }

    void T0(android.support.customtabs.a arg1, String arg2, Bundle arg3) throws RemoteException;

    void m(android.support.customtabs.a arg1, Bundle arg2) throws RemoteException;
}

