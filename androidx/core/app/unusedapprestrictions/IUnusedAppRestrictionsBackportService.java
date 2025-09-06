package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void N0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {
        static class Proxy implements IUnusedAppRestrictionsBackportService {
            private IBinder a;

            Proxy(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void N0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                    parcel0.writeStrongInterface(iUnusedAppRestrictionsBackportCallback0);
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
                return "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
            }
        }

        static final int a = 1;

        public Stub() {
            this.attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IUnusedAppRestrictionsBackportService i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return iInterface0 != null && iInterface0 instanceof IUnusedAppRestrictionsBackportService ? ((IUnusedAppRestrictionsBackportService)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            switch(v) {
                case 1: {
                    this.N0(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.i1(parcel0.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String u0;

    static {
        IUnusedAppRestrictionsBackportService.u0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
    }

    void N0(IUnusedAppRestrictionsBackportCallback arg1) throws RemoteException;
}

