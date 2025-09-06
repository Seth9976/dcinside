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
import java.util.List;

@RestrictTo({Scope.a})
public interface b extends IInterface {
    public static class a implements b {
        @Override  // android.support.customtabs.b
        public boolean F(android.support.customtabs.a a0, IBinder iBinder0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean H(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean L(android.support.customtabs.a a0, Uri uri0, Bundle bundle0, List list0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean M(long v) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public int O(android.support.customtabs.a a0, String s, Bundle bundle0) throws RemoteException {
            return 0;
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.customtabs.b
        public boolean b1(android.support.customtabs.a a0, Uri uri0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean f(android.support.customtabs.a a0, int v, Uri uri0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean f1(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean g0(android.support.customtabs.a a0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean j(android.support.customtabs.a a0, Uri uri0, int v, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public Bundle o0(String s, Bundle bundle0) throws RemoteException {
            return null;
        }

        @Override  // android.support.customtabs.b
        public boolean w0(android.support.customtabs.a a0, Uri uri0, Bundle bundle0) throws RemoteException {
            return false;
        }

        @Override  // android.support.customtabs.b
        public boolean x0(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
            return false;
        }
    }

    public static abstract class android.support.customtabs.b.b extends Binder implements b {
        static class android.support.customtabs.b.b.a implements b {
            private IBinder a;

            android.support.customtabs.b.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.customtabs.b
            public boolean F(android.support.customtabs.a a0, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    parcel0.writeStrongBinder(iBinder0);
                    boolean z = false;
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean H(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean L(android.support.customtabs.a a0, Uri uri0, Bundle bundle0, List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, uri0, 0);
                    c.f(parcel0, bundle0, 0);
                    c.e(parcel0, list0, 0);
                    this.a.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean M(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeLong(v);
                    boolean z = false;
                    this.a.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public int O(android.support.customtabs.a a0, String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(8, parcel0, parcel1, 0);
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

            @Override  // android.support.customtabs.b
            public boolean b1(android.support.customtabs.a a0, Uri uri0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, uri0, 0);
                    this.a.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean f(android.support.customtabs.a a0, int v, Uri uri0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    parcel0.writeInt(v);
                    boolean z = false;
                    c.f(parcel0, uri0, 0);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean f1(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean g0(android.support.customtabs.a a0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    this.a.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "android.support.customtabs.ICustomTabsService";
            }

            @Override  // android.support.customtabs.b
            public boolean j(android.support.customtabs.a a0, Uri uri0, int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, uri0, 0);
                    parcel0.writeInt(v);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public Bundle o0(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.d(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean w0(android.support.customtabs.a a0, Uri uri0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, uri0, 0);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.b
            public boolean x0(android.support.customtabs.a a0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcel0.writeStrongInterface(a0);
                    boolean z = false;
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        static final int a = 2;
        static final int b = 3;
        static final int c = 10;
        static final int d = 4;
        static final int e = 5;
        static final int f = 6;
        static final int g = 7;
        static final int h = 11;
        static final int i = 8;
        static final int j = 9;
        static final int k = 12;
        static final int l = 13;
        static final int m = 14;

        public android.support.customtabs.b.b() {
            this.attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static b i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return iInterface0 != null && iInterface0 instanceof b ? ((b)iInterface0) : new android.support.customtabs.b.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.ICustomTabsService");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch(v) {
                case 2: {
                    boolean z = this.M(parcel0.readLong());
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z));
                    return true;
                }
                case 3: {
                    boolean z1 = this.g0(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z1));
                    return true;
                }
                case 4: {
                    android.support.customtabs.a a0 = android.support.customtabs.a.b.i1(parcel0.readStrongBinder());
                    Uri uri0 = (Uri)c.d(parcel0, Uri.CREATOR);
                    Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                    boolean z2 = this.L(a0, uri0, ((Bundle)c.d(parcel0, parcelable$Creator0)), parcel0.createTypedArrayList(parcelable$Creator0));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z2));
                    return true;
                }
                case 5: {
                    Bundle bundle0 = this.o0(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    c.f(parcel1, bundle0, 1);
                    return true;
                }
                case 6: {
                    boolean z3 = this.H(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z3));
                    return true;
                }
                case 7: {
                    boolean z4 = this.b1(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Uri)c.d(parcel0, Uri.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z4));
                    return true;
                }
                case 8: {
                    int v2 = this.O(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 9: {
                    boolean z5 = this.f(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), parcel0.readInt(), ((Uri)c.d(parcel0, Uri.CREATOR)), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z5));
                    return true;
                }
                case 10: {
                    boolean z6 = this.x0(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z6));
                    return true;
                }
                case 11: {
                    boolean z7 = this.w0(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Uri)c.d(parcel0, Uri.CREATOR)), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z7));
                    return true;
                }
                case 12: {
                    boolean z8 = this.j(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Uri)c.d(parcel0, Uri.CREATOR)), parcel0.readInt(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z8));
                    return true;
                }
                case 13: {
                    boolean z9 = this.f1(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z9));
                    return true;
                }
                case 14: {
                    boolean z10 = this.F(android.support.customtabs.a.b.i1(parcel0.readStrongBinder()), parcel0.readStrongBinder(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z10));
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static class c {
        private static Object d(Parcel parcel0, Parcelable.Creator parcelable$Creator0) {
            return parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0);
        }

        private static void e(Parcel parcel0, List list0, int v) {
            if(list0 == null) {
                parcel0.writeInt(-1);
                return;
            }
            int v1 = list0.size();
            parcel0.writeInt(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                c.f(parcel0, ((Parcelable)list0.get(v2)), v);
            }
        }

        private static void f(Parcel parcel0, Parcelable parcelable0, int v) {
            if(parcelable0 != null) {
                parcel0.writeInt(1);
                parcelable0.writeToParcel(parcel0, v);
                return;
            }
            parcel0.writeInt(0);
        }
    }

    public static final String a0;

    static {
        b.a0 = "android.support.customtabs.ICustomTabsService";
    }

    boolean F(android.support.customtabs.a arg1, IBinder arg2, Bundle arg3) throws RemoteException;

    boolean H(android.support.customtabs.a arg1, Bundle arg2) throws RemoteException;

    boolean L(android.support.customtabs.a arg1, Uri arg2, Bundle arg3, List arg4) throws RemoteException;

    boolean M(long arg1) throws RemoteException;

    int O(android.support.customtabs.a arg1, String arg2, Bundle arg3) throws RemoteException;

    boolean b1(android.support.customtabs.a arg1, Uri arg2) throws RemoteException;

    boolean f(android.support.customtabs.a arg1, int arg2, Uri arg3, Bundle arg4) throws RemoteException;

    boolean f1(android.support.customtabs.a arg1, Bundle arg2) throws RemoteException;

    boolean g0(android.support.customtabs.a arg1) throws RemoteException;

    boolean j(android.support.customtabs.a arg1, Uri arg2, int arg3, Bundle arg4) throws RemoteException;

    Bundle o0(String arg1, Bundle arg2) throws RemoteException;

    boolean w0(android.support.customtabs.a arg1, Uri arg2, Bundle arg3) throws RemoteException;

    boolean x0(android.support.customtabs.a arg1, Bundle arg2) throws RemoteException;
}

