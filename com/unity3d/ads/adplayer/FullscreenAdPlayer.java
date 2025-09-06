package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface FullscreenAdPlayer extends AdPlayer {
    public static final class DefaultImpls {
        @CallSuper
        @m
        public static Object destroy(@l FullscreenAdPlayer fullscreenAdPlayer0, @l d d0) {
            Object object0 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer0, d0);
            return object0 == b.l() ? object0 : S0.a;
        }

        public static void show(@l FullscreenAdPlayer fullscreenAdPlayer0, @l ShowOptions showOptions0) {
            L.p(showOptions0, "showOptions");
            com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.show(fullscreenAdPlayer0, showOptions0);
        }
    }

}

