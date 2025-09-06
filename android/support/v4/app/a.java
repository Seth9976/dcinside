package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
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
    public static class android.support.v4.app.a.a implements a {
        @Override  // android.support.v4.app.a
        public void L0(String s) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.v4.app.a
        public void l0(String s, int v, String s1, Notification notification0) throws RemoteException {
        }

        @Override  // android.support.v4.app.a
        public void o(String s, int v, String s1) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        static class android.support.v4.app.a.b.a implements a {
            private IBinder a;

            android.support.v4.app.a.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.v4.app.a
            public void L0(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    parcel0.writeString(s);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String i1() {
                return "android.support.v4.app.INotificationSideChannel";
            }

            @Override  // android.support.v4.app.a
            public void l0(String s, int v, String s1, Notification notification0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeString(s1);
                    c.d(parcel0, notification0, 0);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.app.a
            public void o(String s, int v, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeString(s1);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 1;
        static final int b = 2;
        static final int c = 3;

        public b() {
            this.attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static a i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return iInterface0 != null && iInterface0 instanceof a ? ((a)iInterface0) : new android.support.v4.app.a.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.app.INotificationSideChannel");
            }
            switch(v) {
                case 1: {
                    this.l0(parcel0.readString(), parcel0.readInt(), parcel0.readString(), ((Notification)c.c(parcel0, Notification.CREATOR)));
                    return true;
                }
                case 2: {
                    this.o(parcel0.readString(), parcel0.readInt(), parcel0.readString());
                    return true;
                }
                case 3: {
                    this.L0(parcel0.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.v4.app.INotificationSideChannel");
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

    public static final String f0;

    static {
        a.f0 = "android.support.v4.app.INotificationSideChannel";
    }

    void L0(String arg1) throws RemoteException;

    void l0(String arg1, int arg2, String arg3, Notification arg4) throws RemoteException;

    void o(String arg1, int arg2, String arg3) throws RemoteException;
}

