package com.bytedance.sdk.openadsdk.component.Zh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.PjT.Zh.PjT.ReZ;
import com.bytedance.sdk.openadsdk.PjT.Zh.Zh;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.cz;
import com.bytedance.sdk.openadsdk.core.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Co;
import java.util.ArrayList;
import java.util.List;

public class PjT {
    private static volatile PjT PjT;
    private final ltE Zh;

    private PjT() {
        this.Zh = ub.ReZ();
    }

    public static PjT PjT() {
        if(PjT.PjT == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.PjT == null) {
                    PjT.PjT = new PjT();
                }
                __monitor_exit(class0);
                return PjT.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.PjT;
    }

    public void PjT(Context context0, AdSlot adSlot0, cz cz0) {
        Co co0 = Co.Zh();
        tT tT0 = new tT();
        com.bytedance.sdk.openadsdk.component.Zh.PjT.1 pjT$10 = new com.bytedance.sdk.openadsdk.core.ltE.PjT() {
            final PjT JQp;

            private PAGNativeAd PjT(Context context0, Owx owx0, AdSlot adSlot0) {
                if(owx0.iZZ() != 2) {
                    return new Zh(context0, owx0, 5, adSlot0);
                }
                return owx0.MWx() != null ? new com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh(context0, owx0, adSlot0) : new ReZ(context0, owx0, adSlot0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(int v, String s) {
                cz0.onError(v, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.ltE$PjT
            public void PjT(com.bytedance.sdk.openadsdk.core.model.PjT pjT0, com.bytedance.sdk.openadsdk.core.model.ReZ reZ0) {
                if(pjT0.cr() != null && !pjT0.cr().isEmpty()) {
                    List list0 = pjT0.cr();
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        Owx owx0 = (Owx)object0;
                        if(Owx.JQp(owx0) || owx0 != null && owx0.OL()) {
                            PAGNativeAd pAGNativeAd0 = this.PjT(context0, owx0, adSlot0);
                            if(cz0 instanceof PAGNativeAdLoadListener) {
                                arrayList0.add(pAGNativeAd0);
                            }
                        }
                        if(Owx.JQp(owx0) && owx0.MWx() != null && owx0.MWx().I() != null) {
                            int v = owx0.joj();
                            if(ub.cr().JQp(String.valueOf(v)) && ub.cr().MWx()) {
                                if(owx0.MWx() != null) {
                                    owx0.MWx().D(1);
                                }
                                if(owx0.JU() != null) {
                                    owx0.JU().D(1);
                                }
                                com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(owx0.hx()).ReZ(), owx0);
                                zh0.PjT("material_meta", owx0);
                                zh0.PjT("ad_slot", adSlot0);
                                com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, null);
                            }
                            IPMiBroadcastReceiver.PjT(context0, owx0);
                        }
                    }
                    if(!(cz0 instanceof PAGNativeAdLoadListener) || arrayList0.isEmpty()) {
                        cz0.onError(-4, "");
                        reZ0.PjT(-4);
                        com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                    }
                    else {
                        if(adSlot0 != null && !TextUtils.isEmpty(adSlot0.getBidAdm())) {
                            long v1 = co0.cr();
                            com.bytedance.sdk.openadsdk.qla.ReZ.PjT(((Owx)list0.get(0)), v1);
                        }
                        cz cz0 = cz0;
                        if(cz0 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener)cz0).onAdLoaded(arrayList0.get(0));
                        }
                        if(reZ0.JQp() != null && !reZ0.JQp().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
                            return;
                        }
                    }
                    return;
                }
                cz0.onError(-3, "");
                reZ0.PjT(-3);
                com.bytedance.sdk.openadsdk.core.model.ReZ.PjT(reZ0);
            }
        };
        this.Zh.PjT(adSlot0, tT0, 5, pjT$10);
    }
}

