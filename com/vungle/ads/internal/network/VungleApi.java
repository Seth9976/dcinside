package com.vungle.ads.internal.network;

import androidx.annotation.Keep;
import com.vungle.ads.internal.model.f;
import java.util.Map;
import okhttp3.RequestBody;
import y4.l;
import y4.m;

@Keep
public interface VungleApi {
    public static final class a {
        public static com.vungle.ads.internal.network.a pingTPAT$default(VungleApi vungleApi0, String s, String s1, d d0, Map map0, RequestBody requestBody0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pingTPAT");
            }
            if((v & 4) != 0) {
                d0 = d.GET;
            }
            Map map1 = (v & 8) == 0 ? map0 : null;
            return (v & 16) == 0 ? vungleApi0.pingTPAT(s, s1, d0, map1, requestBody0) : vungleApi0.pingTPAT(s, s1, d0, map1, null);
        }
    }

    @m
    com.vungle.ads.internal.network.a ads(@l String arg1, @l String arg2, @l f arg3);

    @m
    com.vungle.ads.internal.network.a config(@l String arg1, @l String arg2, @l f arg3);

    @l
    com.vungle.ads.internal.network.a pingTPAT(@l String arg1, @l String arg2, @l d arg3, @m Map arg4, @m RequestBody arg5);

    @m
    com.vungle.ads.internal.network.a ri(@l String arg1, @l String arg2, @l f arg3);

    @l
    com.vungle.ads.internal.network.a sendAdMarkup(@l String arg1, @l RequestBody arg2);

    @l
    com.vungle.ads.internal.network.a sendErrors(@l String arg1, @l String arg2, @l RequestBody arg3);

    @l
    com.vungle.ads.internal.network.a sendMetrics(@l String arg1, @l String arg2, @l RequestBody arg3);

    void setAppId(@l String arg1);
}

