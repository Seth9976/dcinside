package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.List;

@UnstableApi
public final class BundleListRetriever extends Binder {
    private final O2 a;
    private static final int b = 0;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;

    static {
        BundleListRetriever.b = Util.a < 30 ? 0x10000 : d.a();
    }

    public BundleListRetriever(List list0) {
        this.a = O2.r(list0);
    }

    // 去混淆评级： 低(20)
    public static O2 a(IBinder iBinder0) {
        return iBinder0 instanceof BundleListRetriever ? ((BundleListRetriever)iBinder0).a : BundleListRetriever.b(iBinder0);
    }

    @VisibleForTesting
    static O2 b(IBinder iBinder0) {
        a o2$a0 = O2.n();
        int v = 0;
        for(int v1 = 1; v1 != 0; v1 = v3) {
            Parcel parcel0 = Parcel.obtain();
            Parcel parcel1 = Parcel.obtain();
            try {
                parcel0.writeInt(v);
                try {
                    iBinder0.transact(1, parcel0, parcel1, 0);
                }
                catch(RemoteException remoteException0) {
                    throw new RuntimeException(remoteException0);
                }
                int v3;
                while((v3 = parcel1.readInt()) == 1) {
                    o2$a0.j(((Bundle)Assertions.g(parcel1.readBundle())));
                    ++v;
                }
            }
            finally {
                parcel1.recycle();
                parcel0.recycle();
            }
        }
        return o2$a0.n();
    }

    @Override  // android.os.Binder
    protected boolean onTransact(int v, Parcel parcel0, @Nullable Parcel parcel1, int v1) throws RemoteException {
        int v2 = 0;
        if(v != 1) {
            return super.onTransact(v, parcel0, parcel1, v1);
        }
        if(parcel1 == null) {
            return false;
        }
        int v3 = this.a.size();
        int v4;
        for(v4 = parcel0.readInt(); v4 < v3 && parcel1.dataSize() < BundleListRetriever.b; ++v4) {
            parcel1.writeInt(1);
            parcel1.writeBundle(((Bundle)this.a.get(v4)));
        }
        if(v4 < v3) {
            v2 = 2;
        }
        parcel1.writeInt(v2);
        return true;
    }
}

