package android.support.v4.os;

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
public interface b extends IInterface {
    public static class a implements b {
        @Override  // android.support.v4.os.b
        public void a(int v, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class android.support.v4.os.b.b extends Binder implements b {
        static class android.support.v4.os.b.b.a implements b {
            private IBinder a;

            android.support.v4.os.b.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.v4.os.b
            public void a(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.os.IResultReceiver2");
                    parcel0.writeInt(v);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            // 去混淆评级： 低(20)
            public String i1() {
                return "android.support.v4.os.IResultReceiver2";
            }
        }

        static final int a = 1;

        public android.support.v4.os.b.b() {
            this.attachInterface(this, "android.support.v4.os.IResultReceiver2");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static b i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.os.IResultReceiver2");
            return iInterface0 != null && iInterface0 instanceof b ? ((b)iInterface0) : new android.support.v4.os.b.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.os.IResultReceiver2");
            }
            switch(v) {
                case 1: {
                    this.a(parcel0.readInt(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.v4.os.IResultReceiver2");
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

    public static final String i0;

    static {
        b.i0 = "android.support.v4.os.IResultReceiver2";
    }

    void a(int arg1, Bundle arg2) throws RemoteException;
}

