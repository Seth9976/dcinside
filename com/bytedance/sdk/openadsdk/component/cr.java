package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager.Stub;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.PjT.cr.Zh;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.aidl.PjT;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.Yo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class cr extends PAGAppOpenAd {
    private boolean Au;
    private final AtomicBoolean JQp;
    private final Context PjT;
    private final AdSlot ReZ;
    private boolean SM;
    private final boolean XX;
    private final Owx Zh;
    private Zh cr;
    private final String cz;

    public cr(Context context0, @NonNull Owx owx0, boolean z, AdSlot adSlot0) {
        this.JQp = new AtomicBoolean(false);
        this.PjT = context0;
        this.Zh = owx0;
        this.XX = z;
        this.cz = "46e1c6b3-1ded-4543-b32c-8fb845a07c92";
        this.ReZ = adSlot0;
    }

    private void PjT() {
        if(!com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            return;
        }
        Jo.ReZ(new Au("AppOpenAd_registerMultiProcessListener") {
            final cr PjT;

            @Override
            public void run() {
                PjT pjT0 = PjT.PjT();
                if(cr.this.cr != null) {
                    IListenerManager iListenerManager0 = Stub.asInterface(pjT0.PjT(7));
                    if(iListenerManager0 != null) {
                        try {
                            com.bytedance.sdk.openadsdk.multipro.aidl.Zh.PjT pjT1 = new com.bytedance.sdk.openadsdk.multipro.aidl.Zh.PjT(cr.this.cr);
                            iListenerManager0.registerAppOpenAdListener(cr.this.cz, pjT1);
                            cr.this.cr = null;
                        }
                        catch(RemoteException remoteException0) {
                            RD.Zh("TTAppOpenAdImpl", remoteException0.getMessage());
                        }
                    }
                }
            }
        }, 5);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String s) {
        if(this.Zh != null && this.Zh.Vs() != null) {
            try {
                return this.Zh.Vs().get(s);
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAppOpenAdImpl", throwable0.getMessage());
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map getMediaExtraInfo() {
        return this.Zh == null ? null : this.Zh.Vs();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double double0, String s, String s1) {
        if(!this.SM) {
            Yo.PjT(this.Zh, double0, s, s1);
            this.SM = true;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback0) {
        this.cr = new JQp(pAGAppOpenAdInteractionCallback0);
        this.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0) {
        this.cr = new JQp(pAGAppOpenAdInteractionListener0);
        this.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity0) {
        int v1;
        if(activity0 != null && activity0.isFinishing()) {
            activity0 = null;
        }
        int v = 1;
        if(this.JQp.getAndSet(true)) {
            return;
        }
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        IPMiBroadcastReceiver.PjT(this.PjT, this.Zh);
        Context context0 = activity0 == null ? this.PjT : activity0;
        if(context0 == null) {
            context0 = ub.PjT();
        }
        try {
            v1 = 0;
            v1 = activity0.getWindowManager().getDefaultDisplay().getRotation();
        }
        catch(Exception unused_ex) {
        }
        Intent intent0 = new Intent(context0, TTAppOpenAdActivity.class);
        intent0.putExtra("orientation_angle", v1);
        if(!this.XX) {
            v = 2;
        }
        intent0.putExtra("ad_source", v);
        if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
            intent0.putExtra("multi_process_materialmeta", this.Zh.dDm().toString());
            intent0.putExtra("multi_process_meta_md5", this.cz);
        }
        else {
            Lrd.PjT().cz();
            Lrd.PjT().PjT(this.Zh);
            Lrd.PjT().PjT(this.cr);
            this.cr = null;
        }
        intent0.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.Zh.PjT(context0, intent0, new com.bytedance.sdk.component.utils.Zh.Zh() {
            final cr PjT;

            @Override  // com.bytedance.sdk.component.utils.Zh$Zh
            public void PjT() {
            }

            @Override  // com.bytedance.sdk.component.utils.Zh$Zh
            public void PjT(Throwable throwable0) {
            }
        });
        fDm.Zh().post(new Runnable() {
            final cr PjT;

            @Override
            public void run() {
                if(cr.this.ReZ != null) {
                    try {
                        if(xs.Gr().cRA(cr.this.ReZ.getCodeId()) == 1 && !Owx.cz(cr.this.Zh) && !cr.this.Zh.zq()) {
                            cz cz0 = cz.PjT(cr.this.PjT);
                            cz0.XX(Integer.parseInt(cr.this.ReZ.getCodeId()));
                            cz0.PjT(cr.this.ReZ);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double double0) {
        if(!this.Au) {
            Yo.PjT(this.Zh, double0);
            this.Au = true;
        }
    }
}

