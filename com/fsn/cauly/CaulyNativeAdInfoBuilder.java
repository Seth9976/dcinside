package com.fsn.cauly;

public class CaulyNativeAdInfoBuilder extends CaulyAdInfoBuilder {
    public CaulyNativeAdInfoBuilder(String s) {
        super(s);
    }

    public CaulyNativeAdInfoBuilder adRatio(String s) {
        this.a.put("ad_ratio", s);
        return this;
    }

    @Override  // com.fsn.cauly.CaulyAdInfoBuilder
    public CaulyAdInfoBuilder appCode(String s) {
        return this.appCode(s);
    }

    public CaulyNativeAdInfoBuilder appCode(String s) {
        this.a.put("appcode", s);
        return this;
    }

    @Override  // com.fsn.cauly.CaulyAdInfoBuilder
    public CaulyAdInfo build() {
        return new CaulyAdInfo(this);
    }

    public CaulyNativeAdInfoBuilder clickingView(int v) {
        this.a.put("clicking_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder iconImageID(int v) {
        this.a.put("icon_image_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingCloseID(int v) {
        this.a.put("landing_close_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingIconImageID(int v) {
        this.a.put("landing_icon_image_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingLayoutID(int v) {
        this.a.put("landing_layout_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingLinkID(int v) {
        this.a.put("landing_link_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingMainImageID(int v) {
        this.a.put("landing_main_image_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingSubtitleID(int v) {
        this.a.put("landing_subtitle_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingTextID(int v) {
        this.a.put("landing_text_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder landingTitleID(int v) {
        this.a.put("landing_title_id", v);
        return this;
    }

    @Override  // com.fsn.cauly.CaulyAdInfoBuilder
    public CaulyAdInfoBuilder layoutID(int v) {
        return this.layoutID(v);
    }

    public CaulyNativeAdInfoBuilder layoutID(int v) {
        this.a.put("layout_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder mainImageID(int v) {
        this.a.put("main_image_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder mainImageOrientation(Orientation caulyAdInfo$Orientation0) {
        this.a.put("main_image_orientation", caulyAdInfo$Orientation0.ordinal());
        return this;
    }

    public CaulyNativeAdInfoBuilder sponsorPosition(int v, Direction caulyAdInfo$Direction0) {
        this.a.put("sponsor_position", caulyAdInfo$Direction0.ordinal());
        this.a.put("sponsor_view_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder sponsorVisible(boolean z) {
        this.a.put("sponsor_visible", Boolean.toString(z));
        return this;
    }

    public CaulyNativeAdInfoBuilder spreadOn(boolean z) {
        this.a.put("spread_on", Boolean.valueOf(z));
        return this;
    }

    public CaulyNativeAdInfoBuilder subtitleID(int v) {
        this.a.put("subtitle_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder textID(int v) {
        this.a.put("text_id", v);
        return this;
    }

    public CaulyNativeAdInfoBuilder titleID(int v) {
        this.a.put("title_id", v);
        return this;
    }
}

