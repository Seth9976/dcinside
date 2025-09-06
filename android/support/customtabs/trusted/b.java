package android.support.customtabs.trusted;

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
        @Override  // android.support.customtabs.trusted.b
        public Bundle G(Bundle bundle0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.trusted.b
        public Bundle I0() throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.trusted.b
        public int X0() throws RemoteException {
            return 0;
        }

        @Override  // android.support.customtabs.trusted.b
        public Bundle Y0(Bundle bundle0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.trusted.b
        public void Z0(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.customtabs.trusted.b
        public Bundle q0(String s, Bundle bundle0, IBinder iBinder0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.trusted.b
        public Bundle t0() throws RemoteException {
            return null;
        }
    }

    public static abstract class android.support.customtabs.trusted.b.b extends Binder implements b {
        static class android.support.customtabs.trusted.b.b.a implements b {
            private IBinder a;

            android.support.customtabs.trusted.b.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle G(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle I0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    this.a.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public int X0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    this.a.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle Y0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public void Z0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
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

            // 去混淆评级： 低(20)
            public String i1() {
                return "android.support.customtabs.trusted.ITrustedWebActivityService";
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle q0(String s, Bundle bundle0, IBinder iBinder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    parcel0.writeString(s);
                    c.d(parcel0, bundle0, 0);
                    parcel0.writeStrongBinder(iBinder0);
                    this.a.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.trusted.b
            public Bundle t0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.trusted.ITrustedWebActivityService");
                    this.a.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        static final int a = 6;
        static final int b = 2;
        static final int c = 3;
        static final int d = 5;
        static final int e = 4;
        static final int f = 7;
        static final int g = 9;

        public android.support.customtabs.trusted.b.b() {
            this.attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static b i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            return iInterface0 != null && iInterface0 instanceof b ? ((b)iInterface0) : new android.support.customtabs.trusted.b.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
                return true;
            }
            switch(v) {
                case 2: {
                    Bundle bundle0 = this.G(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    c.d(parcel1, bundle0, 1);
                    return true;
                }
                case 3: {
                    this.Z0(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 4: {
                    int v2 = this.X0();
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 5: {
                    Bundle bundle1 = this.I0();
                    parcel1.writeNoException();
                    c.d(parcel1, bundle1, 1);
                    return true;
                }
                case 6: {
                    Bundle bundle2 = this.Y0(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    c.d(parcel1, bundle2, 1);
                    return true;
                }
                case 7: {
                    Bundle bundle3 = this.t0();
                    parcel1.writeNoException();
                    c.d(parcel1, bundle3, 1);
                    return true;
                }
                case 9: {
                    Bundle bundle4 = this.q0(parcel0.readString(), ((Bundle)c.c(parcel0, Bundle.CREATOR)), parcel0.readStrongBinder());
                    parcel1.writeNoException();
                    c.d(parcel1, bundle4, 1);
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

    public static final String e0;

    static {
        b.e0 = "android.support.customtabs.trusted.ITrustedWebActivityService";
    }

    Bundle G(Bundle arg1) throws RemoteException;

    Bundle I0() throws RemoteException;

    int X0() throws RemoteException;

    Bundle Y0(Bundle arg1) throws RemoteException;

    void Z0(Bundle arg1) throws RemoteException;

    Bundle q0(String arg1, Bundle arg2, IBinder arg3) throws RemoteException;

    Bundle t0() throws RemoteException;
}

