package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {
    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void C0(boolean z, boolean z1) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
        static class Proxy implements IUnusedAppRestrictionsBackportCallback {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void C0(boolean z, boolean z1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                    parcel0.writeInt(((int)z));
                    parcel0.writeInt(((int)z1));
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
                return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
            }
        }

        static final int a = 1;

        public Stub() {
            this.attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IUnusedAppRestrictionsBackportCallback i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return iInterface0 != null && iInterface0 instanceof IUnusedAppRestrictionsBackportCallback ? ((IUnusedAppRestrictionsBackportCallback)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            }
            boolean z = false;
            if(v == 0x5F4E5446) {
                parcel1.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                return true;
            }
            if(v != 1) {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
            boolean z1 = parcel0.readInt() != 0;
            if(parcel0.readInt() != 0) {
                z = true;
            }
            this.C0(z1, z);
            return true;
        }
    }

    public static final String t0;

    static {
        IUnusedAppRestrictionsBackportCallback.t0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
    }

    void C0(boolean arg1, boolean arg2) throws RemoteException;
}

