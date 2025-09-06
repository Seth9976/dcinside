package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.List;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface ScarManager {
    @m
    Object getSignals(@m List arg1, @l d arg2);

    @m
    Object getVersion(@l d arg1);

    @m
    Object loadAd(@l String arg1, @l String arg2, @l String arg3, @l String arg4, @l String arg5, int arg6, @l d arg7);

    @l
    i loadBannerAd(@l Context arg1, @l BannerView arg2, @l P2.d arg3, @l UnityBannerSize arg4, @l String arg5);

    @l
    i show(@l String arg1, @l String arg2);
}

