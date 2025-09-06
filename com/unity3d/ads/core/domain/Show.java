package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface Show {
    @l
    i invoke(@l Activity arg1, @l AdObject arg2, @l UnityAdsShowOptions arg3);

    @m
    Object terminate(@l AdObject arg1, @l d arg2);
}

