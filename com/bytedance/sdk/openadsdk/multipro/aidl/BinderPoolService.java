package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.IBinderPool.Stub;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.JQp;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.ReZ;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.XX;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.Zh;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.cr;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.cz;

public class BinderPoolService extends Service {
    public static class PjT extends Stub {
        @Override  // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int v) throws RemoteException {
            switch(v) {
                case 0: {
                    return XX.PjT();
                }
                case 1: {
                    return JQp.PjT();
                }
                case 4: {
                    return ReZ.PjT();
                }
                case 5: {
                    return cz.Zh();
                }
                case 6: {
                    return cr.PjT();
                }
                case 7: {
                    return Zh.PjT();
                }
                default: {
                    return null;
                }
            }
        }
    }

    public static volatile boolean PjT;
    private static boolean ReZ;
    private final Binder Zh;

    public BinderPoolService() {
        this.Zh = new PjT();
    }

    @Override  // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent0) {
        return this.Zh;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        ub.Zh(this.getApplicationContext());
        BinderPoolService.PjT = true;
        if(!BinderPoolService.ReZ) {
            SM.Zh().post(new Runnable() {
                final BinderPoolService PjT;

                @Override
                public void run() {
                    xs.Gr().PjT(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        BinderPoolService.ReZ = true;
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}

