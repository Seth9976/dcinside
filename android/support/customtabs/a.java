package android.support.customtabs;

import android.net.Uri;
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
public interface a extends IInterface {
    public static class android.support.customtabs.a.a implements a {
        @Override  // android.support.customtabs.a
        public void A0(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void N(int v, int v1, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void R0(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void S0(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.customtabs.a
        public void d(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void d1(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void e1(int v, Uri uri0, boolean z, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void g(int v, int v1, int v2, int v3, int v4, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public void h0(int v, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.a
        public Bundle k(String s, Bundle bundle0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.a
        public void z0(String s, Bundle bundle0) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        static class android.support.customtabs.a.b.a implements a {
            private IBinder a;

            android.support.customtabs.a.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.customtabs.a
            public void A0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void N(int v, int v1, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void R0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(11, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void S0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(12, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // android.support.customtabs.a
            public void d(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeString(s);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void d1(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void e1(int v, Uri uri0, boolean z, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeInt(v);
                    c.d(parcel0, uri0, 0);
                    parcel0.writeInt(((int)z));
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void g(int v, int v1, int v2, int v3, int v4, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    parcel0.writeInt(v3);
                    parcel0.writeInt(v4);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void h0(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeInt(v);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "android.support.customtabs.ICustomTabsCallback";
            }

            @Override  // android.support.customtabs.a
            public Bundle k(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeString(s);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.c(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.a
            public void z0(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcel0.writeString(s);
                    c.d(parcel0, bundle0, 0);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 2;
        static final int b = 3;
        static final int c = 4;
        static final int d = 5;
        static final int e = 6;
        static final int f = 7;
        static final int g = 8;
        static final int h = 9;
        static final int i = 10;
        static final int j = 11;
        static final int k = 12;

        public b() {
            this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static a i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return iInterface0 != null && iInterface0 instanceof a ? ((a)iInterface0) : new android.support.customtabs.a.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch(v) {
                case 2: {
                    this.h0(parcel0.readInt(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 3: {
                    this.z0(parcel0.readString(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 4: {
                    this.d1(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 5: {
                    this.d(parcel0.readString(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 6: {
                    this.e1(parcel0.readInt(), ((Uri)c.c(parcel0, Uri.CREATOR)), parcel0.readInt() != 0, ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 7: {
                    Bundle bundle0 = this.k(parcel0.readString(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    c.d(parcel1, bundle0, 1);
                    return true;
                }
                case 8: {
                    this.N(parcel0.readInt(), parcel0.readInt(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 9: {
                    this.A0(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 10: {
                    this.g(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), ((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 11: {
                    this.R0(((Bundle)c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 12: {
                    this.S0(((Bundle)c.c(parcel0, Bundle.CREATOR)));
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

    public static final String W;

    static {
        a.W = "android.support.customtabs.ICustomTabsCallback";
    }

    void A0(Bundle arg1) throws RemoteException;

    void N(int arg1, int arg2, Bundle arg3) throws RemoteException;

    void R0(Bundle arg1) throws RemoteException;

    void S0(Bundle arg1) throws RemoteException;

    void d(String arg1, Bundle arg2) throws RemoteException;

    void d1(Bundle arg1) throws RemoteException;

    void e1(int arg1, Uri arg2, boolean arg3, Bundle arg4) throws RemoteException;

    void g(int arg1, int arg2, int arg3, int arg4, int arg5, Bundle arg6) throws RemoteException;

    void h0(int arg1, Bundle arg2) throws RemoteException;

    Bundle k(String arg1, Bundle arg2) throws RemoteException;

    void z0(String arg1, Bundle arg2) throws RemoteException;
}

