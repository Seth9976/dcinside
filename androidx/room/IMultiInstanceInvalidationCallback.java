package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.room.IMultiInstanceInvalidationCallback
        public void h(String[] arr_s) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {
        static class Proxy implements IMultiInstanceInvalidationCallback {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // androidx.room.IMultiInstanceInvalidationCallback
            public void h(String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcel0.writeStringArray(arr_s);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            // 去混淆评级： 低(20)
            public String i1() {
                return "androidx.room.IMultiInstanceInvalidationCallback";
            }
        }

        static final int a = 1;

        public Stub() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IMultiInstanceInvalidationCallback i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return iInterface0 != null && iInterface0 instanceof IMultiInstanceInvalidationCallback ? ((IMultiInstanceInvalidationCallback)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            switch(v) {
                case 1: {
                    this.h(parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String q1;

    static {
        IMultiInstanceInvalidationCallback.q1 = "androidx.room.IMultiInstanceInvalidationCallback";
    }

    void h(String[] arg1) throws RemoteException;
}

