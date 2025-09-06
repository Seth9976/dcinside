package com.vungle.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    public static final int AUTO_ROTATE = 2;
    @l
    public static final a Companion = null;
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    @l
    private static final String WATERMARK = "WATERMARK";
    private int adOrientation;
    @l
    private Map extras;
    private int settings;

    static {
        d.Companion = new a(null);
    }

    public d() {
        this.extras = new LinkedHashMap();
        this.adOrientation = 2;
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    @b
    public static void getAdOrientation$annotations() {
    }

    public final int getSettings() {
        return this.settings;
    }

    @m
    public final String getWatermark$vungle_ads_release() {
        return (String)this.extras.get("WATERMARK");
    }

    public final void setAdOrientation(int v) {
        this.adOrientation = v;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z) {
        this.settings = z ? this.settings | 2 : this.settings & -3;
    }

    public final void setWatermark(@l String s) {
        L.p(s, "watermark");
        this.extras.put("WATERMARK", s);
    }
}

