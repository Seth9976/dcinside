package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.IBinderPool.Stub;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.JQp;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.XX;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.cr;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.wN;

public class PjT {
    private final ServiceConnection JQp;
    private IBinderPool PjT;
    private Zh ReZ;
    private static final PjT Zh;
    private long cr;
    private final IBinder.DeathRecipient cz;

    static {
        PjT.Zh = new PjT();
    }

    private PjT() {
        this.cr = 0L;
        this.JQp = new ServiceConnection() {
            final PjT PjT;

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
                Jo.PjT(new Au("onServiceConnected") {
                    final com.bytedance.sdk.openadsdk.multipro.aidl.PjT.2 Zh;

                    @Override
                    public void run() {
                        IBinderPool iBinderPool0 = Stub.asInterface(iBinder0);
                        PjT.this.PjT = iBinderPool0;
                        try {
                            PjT.this.PjT.asBinder().linkToDeath(PjT.this.cz, 0);
                        }
                        catch(RemoteException remoteException0) {
                            RD.PjT("TTAD.BinderPool", "onServiceConnected throws :", remoteException0);
                        }
                        if(PjT.this.ReZ != null) {
                            PjT.this.ReZ.onServiceConnected();
                        }
                    }
                }, 5);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName0) {
            }
        };
        this.cz = new IBinder.DeathRecipient() {
            final PjT PjT;

            @Override  // android.os.IBinder$DeathRecipient
            public void binderDied() {
                Jo.PjT(new Au("binderDied") {
                    final com.bytedance.sdk.openadsdk.multipro.aidl.PjT.3 PjT;

                    @Override
                    public void run() {
                        try {
                            if(PjT.this.PjT.asBinder().isBinderAlive()) {
                                PjT.this.PjT.asBinder().unlinkToDeath(PjT.this.cz, 0);
                            }
                        }
                        catch(Exception exception0) {
                            RD.Zh("TTAD.BinderPool", exception0.getMessage());
                        }
                        PjT.this.PjT = null;
                        PjT.this.cr();
                    }
                }, 5);
            }
        };
        this.cr();
    }

    public static PjT PjT() {
        return PjT.Zh;
    }

    public IBinder PjT(int v) {
        try {
            if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                switch(v) {
                    case 0: {
                        return XX.PjT();
                    }
                    case 1: {
                        return JQp.PjT();
                    }
                    case 5: {
                        return cz.Zh();
                    }
                    case 6: {
                        return cr.PjT();
                    }
                    case 7: {
                        return com.bytedance.sdk.openadsdk.multipro.aidl.PjT.Zh.PjT();
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
            return null;
        }
        IBinderPool iBinderPool0 = this.PjT;
        if(iBinderPool0 != null) {
            try {
                return iBinderPool0.queryBinder(v);
            }
            catch(RemoteException remoteException0) {
                RD.Zh("TTAD.BinderPool", remoteException0.getMessage());
                wN.Au("queryBinder error");
            }
        }
        return null;
    }

    public void PjT(Zh zh0) {
        this.ReZ = zh0;
        if(this.PjT != null) {
            Jo.PjT(new Au("onServiceConnected2") {
                final PjT PjT;

                @Override
                public void run() {
                    if(PjT.this.ReZ != null) {
                        PjT.this.ReZ.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public void ReZ() {
        try {
            Context context0 = ub.PjT();
            context0.bindService(new Intent(context0, BinderPoolService.class), this.JQp, 1);
            this.cr = System.currentTimeMillis();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void Zh() {
        try {
            Context context0 = ub.PjT();
            context0.startService(new Intent(context0, BinderPoolService.class));
        }
        catch(Exception unused_ex) {
        }
    }

    static long cr(PjT pjT0) {
        return pjT0.cr;
    }

    private void cr() {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        this.ReZ();
    }
}

