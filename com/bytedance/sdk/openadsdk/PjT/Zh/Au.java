package com.bytedance.sdk.openadsdk.PjT.Zh;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Lrd.Zh.JQp;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xE;
import com.bytedance.sdk.openadsdk.utils.Yo;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Au extends PAGNativeAd {
    private boolean Au;
    protected int JQp;
    protected xE PjT;
    protected final Context ReZ;
    private boolean SM;
    protected String XX;
    protected final Owx Zh;
    protected PjT cr;
    protected int cz;

    public Au(@NonNull Context context0, @NonNull Owx owx0, int v, boolean z) {
        this.Zh = owx0;
        this.ReZ = context0;
        this.JQp = v;
        this.cz = owx0.joj();
        String s = wN.ReZ(v);
        this.XX = s;
        if(z) {
            this.cr = new PjT(context0, owx0, s);
            this.PjT = new xE(context0, this, owx0, this.PjT(v), this.cr);
        }
    }

    public PjT Au() {
        return this.cr;
    }

    private String PjT(int v) {
        switch(v) {
            case 1: {
                return "banner_ad";
            }
            case 2: {
                return "interaction";
            }
            default: {
                return "embeded_ad";
            }
        }
    }

    private List PjT(List list0, List list1) {
        List list2 = new LinkedList();
        if(list0 != null && !list0.isEmpty()) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                list2.add(list0.get(v2));
            }
        }
        if(list1 != null && !list1.isEmpty()) {
            int v3 = list1.size();
            for(int v = 0; v < v3; ++v) {
                list2.add(list1.get(v));
            }
        }
        return list2;
    }

    public void PjT(@NonNull ViewGroup viewGroup0, @NonNull List list0, @NonNull List list1, @Nullable List list2, @Nullable View view0, cz cz0) {
        if(viewGroup0 == null) {
            return;
        }
        if(list1 == null) {
            return;
        }
        if(list1.size() <= 0) {
            return;
        }
        if(this.XX()) {
            list2 = this.PjT(list1, list2);
        }
        if(view0 != null && cz0 != null && cz0.Zh()) {
            view0.setOnClickListener(new View.OnClickListener() {
                final Au Zh;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    com.bytedance.sdk.openadsdk.PjT.Zh.Au.1.1 au$1$10 = new com.bytedance.sdk.openadsdk.core.ReZ.cr.PjT() {
                        final com.bytedance.sdk.openadsdk.PjT.Zh.Au.1 Zh;

                        @Override  // com.bytedance.sdk.openadsdk.core.ReZ.cr$PjT
                        public void PjT() {
                            com.bytedance.sdk.openadsdk.PjT.Zh.Au.1.this.PjT.PjT();
                            SM.Zh().cz("f0c09319-b50c-4ba9-bfb3-d63cffbee45b");
                            PAGMediaView pAGMediaView0 = Au.this.Au().PjT();
                            if(pAGMediaView0 != null) {
                                pAGMediaView0.close();
                            }
                        }
                    };
                    TTDelegateActivity.PjT(Au.this.Zh, "f0c09319-b50c-4ba9-bfb3-d63cffbee45b", au$1$10);
                }
            });
        }
        this.PjT.PjT(viewGroup0, list0, list1, list2, view0, cz0);
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = this.Zh == null || this.Zh.iZZ() != 2 ? null : new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.Zh.ZX());
        JQp.PjT(viewGroup0, this.Zh, jQp$PjT0);
    }

    protected void PjT(String s) {
        this.XX = s;
    }

    protected boolean XX() {
        Owx owx0 = this.Zh;
        if(owx0 == null) {
            return false;
        }
        return owx0.cI() == 5 ? false : ub.cr().ReZ(this.cz) == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String s) {
        if(this.Zh != null && this.Zh.Vs() != null) {
            try {
                return this.Zh.Vs().get(s);
            }
            catch(Throwable throwable0) {
                RD.Zh("TTNativeAdImpl", throwable0.getMessage());
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map getMediaExtraInfo() {
        return this.Zh == null ? null : this.Zh.Vs();
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new cr(this.Au());
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double double0, String s, String s1) {
        if(!this.SM) {
            Yo.PjT(this.Zh, double0, s, s1);
            this.SM = true;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup0, @NonNull List list0, @Nullable List list1, @Nullable View view0, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback0) {
        this.registerViewForInteraction(viewGroup0, list0, list1, view0, pAGNativeAdInteractionCallback0);
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup0, @NonNull List list0, @Nullable List list1, @Nullable View view0, PAGNativeAdInteractionListener pAGNativeAdInteractionListener0) {
        if(viewGroup0 == null) {
            return;
        }
        if(list0 == null) {
            return;
        }
        if(list0.size() <= 0) {
            return;
        }
        this.PjT(viewGroup0, null, list0, list1, view0, new XX(pAGNativeAdInteractionListener0));
    }

    @Override  // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double double0) {
        if(!this.Au) {
            Yo.PjT(this.Zh, double0);
            this.Au = true;
        }
    }
}

