package com.igaworks.ssp;

import com.igaworks.ssp.common.adapter.ADOPAdapter;
import com.igaworks.ssp.common.adapter.AdFitAdapter;
import com.igaworks.ssp.common.adapter.AdForusAdapter;
import com.igaworks.ssp.common.adapter.AdPopcornSSPAdapter;
import com.igaworks.ssp.common.adapter.AdmobAdapter;
import com.igaworks.ssp.common.adapter.AppLovinAdapter;
import com.igaworks.ssp.common.adapter.AppLovinMaxDynamicBidAdapter;
import com.igaworks.ssp.common.adapter.BaseMediationAdapter;
import com.igaworks.ssp.common.adapter.CaulyAdapter;
import com.igaworks.ssp.common.adapter.CoupangAdapter;
import com.igaworks.ssp.common.adapter.CoupangCPMAdapter;
import com.igaworks.ssp.common.adapter.FANAdapter;
import com.igaworks.ssp.common.adapter.FyberAdapter;
import com.igaworks.ssp.common.adapter.GAMAdapter;
import com.igaworks.ssp.common.adapter.MezzoMediaAdapter;
import com.igaworks.ssp.common.adapter.MintegralAdapter;
import com.igaworks.ssp.common.adapter.MobWithAdapter;
import com.igaworks.ssp.common.adapter.MobonAdapter;
import com.igaworks.ssp.common.adapter.NAMAdapter;
import com.igaworks.ssp.common.adapter.PangleAdapter;
import com.igaworks.ssp.common.adapter.UnityAdsAdapter;
import com.igaworks.ssp.common.adapter.VideoMixAdMediationAdapter;
import com.igaworks.ssp.common.adapter.VungleAdapter;

public enum i {
    ADPOPCORN("ADPOPCORN", 0),
    ADMOB("AdMob", 1),
    FAN("FAN", 2),
    FACEBOOK_AD("FACEBOOK_AD", 2),
    FAN_NATIVE("FAN_Native", 2),
    CAULY("Cauly", 4),
    MEZZOMEDIA("MezzoMedia", 5),
    MOBON("Mobon", 6),
    UNITY_ADS("UnityAds", 7),
    MINTEGRAL("Mintegral", 8),
    FAN_NATIVE_BANNER("FAN_NATIVE_BANNER", 9),
    ADFIT("AdFit", 10),
    APPNEXT("AppNext", 11),
    CRITEO("Criteo", 12),
    ADCOLONY("AdColony", 13),
    VUNGLE("Vungle", 14),
    APPLOVIN("AppLovin", 15),
    FYBER("Fyber", 16),
    TAPJOY("TapJoy", 17),
    PANGLE("Pangle", 18),
    GAM("GAM", 19),
    COUPANG("COUPANG", 20),
    NAM("NAM", 22),
    APPLOVIN_MAX_DYNAMIC_BID("APPLOVIN_MAX_DYNAMIC_BID", 23),
    ADOP("ADOP", 24),
    COUPANG_CPM("COUPANG_CPM", 25),
    MOBWITH("MobWith", 26),
    ADFORUS("AdForus", 28),
    UNKNOWN_AD_NETWORK("UNKNOWN_AD_NETWORK", -1);

    private String a;
    private int b;

    private i(String s1, int v1) {
        this.a = s1;
        this.b = v1;
    }

    public static i a(int v) {
        switch(v) {
            case 0: {
                return i.c;
            }
            case 1: {
                return i.d;
            }
            case 2: {
                return i.e;
            }
            case 4: {
                return i.h;
            }
            case 5: {
                return i.i;
            }
            case 6: {
                return i.j;
            }
            case 7: {
                return i.k;
            }
            case 8: {
                return i.l;
            }
            case 9: {
                return i.m;
            }
            case 10: {
                return i.n;
            }
            case 11: {
                return i.o;
            }
            case 12: {
                return i.p;
            }
            case 13: {
                return i.q;
            }
            case 14: {
                return i.r;
            }
            case 15: {
                return i.s;
            }
            case 16: {
                return i.t;
            }
            case 17: {
                return i.u;
            }
            case 18: {
                return i.v;
            }
            case 19: {
                return i.w;
            }
            case 20: {
                return i.x;
            }
            case 22: {
                return i.y;
            }
            case 23: {
                return i.z;
            }
            case 24: {
                return i.A;
            }
            case 25: {
                return i.B;
            }
            case 26: {
                return i.C;
            }
            case 28: {
                return i.D;
            }
            default: {
                return i.E;
            }
        }
    }

    public static i a(String s) {
        s.hashCode();
        switch(s) {
            case "ADOP": {
                return i.A;
            }
            case "ADPOPCORN": {
                return i.c;
            }
            case "APPLOVIN_MAX_DYNAMIC_BID": {
                return i.z;
            }
            case "AdColony": {
                return i.q;
            }
            case "AdFit": {
                return i.n;
            }
            case "AdForus": {
                return i.D;
            }
            case "AdMob": {
                return i.d;
            }
            case "AppLovin": {
                return i.s;
            }
            case "AppNext": {
                return i.o;
            }
            case "COUPANG": {
                return i.x;
            }
            case "COUPANG_CPM": {
                return i.B;
            }
            case "Cauly": {
                return i.h;
            }
            case "Criteo": {
                return i.p;
            }
            case "FACEBOOK_AD": {
                return i.e;
            }
            case "FAN": {
                return i.e;
            }
            case "FAN_NATIVE_BANNER": {
                return i.m;
            }
            case "FAN_Native": {
                return i.e;
            }
            case "Fyber": {
                return i.t;
            }
            case "GAM": {
                return i.w;
            }
            case "MezzoMedia": {
                return i.i;
            }
            case "Mintegral": {
                return i.l;
            }
            case "MobWith": {
                return i.C;
            }
            case "Mobon": {
                return i.j;
            }
            case "NAM": {
                return i.y;
            }
            case "Pangle": {
                return i.v;
            }
            case "TapJoy": {
                return i.u;
            }
            case "UnityAds": {
                return i.k;
            }
            case "Vungle": {
                return i.r;
            }
            default: {
                return i.E;
            }
        }
    }

    private static i[] a() [...] // Inlined contents

    public int b() {
        return this.b;
    }

    public String c() [...] // 潜在的解密器

    public String d() {
        return this.a;
    }

    public BaseMediationAdapter e() {
        if(this == i.c) {
            return new AdPopcornSSPAdapter();
        }
        if(this == i.d) {
            return new AdmobAdapter();
        }
        if(this != i.f && this != i.e && this != i.g) {
            if(this == i.m) {
                return new FANAdapter(true);
            }
            if(this == i.h) {
                return new CaulyAdapter();
            }
            if(this == i.i) {
                return new MezzoMediaAdapter();
            }
            if(this == i.j) {
                return new MobonAdapter();
            }
            if(this == i.k) {
                return new UnityAdsAdapter();
            }
            if(this == i.l) {
                return new MintegralAdapter();
            }
            if(this == i.n) {
                return new AdFitAdapter();
            }
            if(this == i.r) {
                return new VungleAdapter();
            }
            if(this == i.s) {
                return new AppLovinAdapter();
            }
            if(this == i.t) {
                return new FyberAdapter();
            }
            if(this == i.v) {
                return new PangleAdapter();
            }
            if(this == i.w) {
                return new GAMAdapter();
            }
            if(this == i.x) {
                return new CoupangAdapter();
            }
            if(this == i.y) {
                return new NAMAdapter();
            }
            if(this == i.z) {
                return new AppLovinMaxDynamicBidAdapter();
            }
            if(this == i.A) {
                return new ADOPAdapter();
            }
            if(this == i.B) {
                return new CoupangCPMAdapter();
            }
            if(this == i.C) {
                return new MobWithAdapter();
            }
            return this == i.D ? new AdForusAdapter() : null;
        }
        return new FANAdapter(false);
    }

    public VideoMixAdMediationAdapter f() {
        if(this == i.c) {
            return new AdPopcornSSPAdapter();
        }
        if(this == i.d) {
            return new AdmobAdapter();
        }
        if(this == i.h) {
            return new CaulyAdapter();
        }
        if(this == i.k) {
            return new UnityAdsAdapter();
        }
        if(this == i.r) {
            return new VungleAdapter();
        }
        if(this == i.s) {
            return new AppLovinAdapter();
        }
        if(this == i.t) {
            return new FyberAdapter();
        }
        if(this == i.v) {
            return new PangleAdapter();
        }
        if(this == i.w) {
            return new GAMAdapter();
        }
        if(this == i.z) {
            return new AppLovinMaxDynamicBidAdapter();
        }
        return this == i.C ? new MobWithAdapter() : null;
    }
}

