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
public interface c extends IInterface {
    public static class a implements c {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.customtabs.c
        public void onGreatestScrollPercentageIncreased(int v, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.c
        public void onSessionEnded(boolean z, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.customtabs.c
        public void onVerticalScrollEvent(boolean z, Bundle bundle0) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements c {
        static class android.support.customtabs.c.b.a implements c {
            private IBinder a;

            android.support.customtabs.c.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            // 去混淆评级： 低(20)
            public String i1() {
                return "android.support.customtabs.IEngagementSignalsCallback";
            }

            @Override  // android.support.customtabs.c
            public void onGreatestScrollPercentageIncreased(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
                    parcel0.writeInt(v);
                    android.support.customtabs.c.c.d(parcel0, bundle0, 0);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.c
            public void onSessionEnded(boolean z, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
                    parcel0.writeInt(((int)z));
                    android.support.customtabs.c.c.d(parcel0, bundle0, 0);
                    this.a.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.customtabs.c
            public void onVerticalScrollEvent(boolean z, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.customtabs.IEngagementSignalsCallback");
                    parcel0.writeInt(((int)z));
                    android.support.customtabs.c.c.d(parcel0, bundle0, 0);
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        static final int a = 2;
        static final int b = 3;
        static final int c = 4;

        public b() {
            this.attachInterface(this, "android.support.customtabs.IEngagementSignalsCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static c i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.IEngagementSignalsCallback");
            return iInterface0 != null && iInterface0 instanceof c ? ((c)iInterface0) : new android.support.customtabs.c.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.customtabs.IEngagementSignalsCallback");
            }
            boolean z = false;
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.customtabs.IEngagementSignalsCallback");
                return true;
            }
            switch(v) {
                case 2: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.onVerticalScrollEvent(z, ((Bundle)android.support.customtabs.c.c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 3: {
                    this.onGreatestScrollPercentageIncreased(parcel0.readInt(), ((Bundle)android.support.customtabs.c.c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 4: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.onSessionEnded(z, ((Bundle)android.support.customtabs.c.c.c(parcel0, Bundle.CREATOR)));
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static class android.support.customtabs.c.c {
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

    public static final String b0;

    static {
        c.b0 = "android.support.customtabs.IEngagementSignalsCallback";
    }

    void onGreatestScrollPercentageIncreased(int arg1, Bundle arg2) throws RemoteException;

    void onSessionEnded(boolean arg1, Bundle arg2) throws RemoteException;

    void onVerticalScrollEvent(boolean arg1, Bundle arg2) throws RemoteException;
}

