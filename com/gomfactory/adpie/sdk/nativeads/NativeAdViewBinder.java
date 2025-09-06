package com.gomfactory.adpie.sdk.nativeads;

import androidx.annotation.NonNull;

public class NativeAdViewBinder {
    public static class Builder {
        private int callToActionId;
        private int descriptionId;
        private int iconImageId;
        private int layoutId;
        private int mainId;
        private int optOutId;
        private int ratingbarId;
        private int titleId;

        public Builder(int v) {
            this.layoutId = v;
        }

        public NativeAdViewBinder build() {
            return new NativeAdViewBinder(this);
        }

        public Builder setCallToActionId(int v) {
            this.callToActionId = v;
            return this;
        }

        public Builder setDescriptionId(int v) {
            this.descriptionId = v;
            return this;
        }

        public Builder setIconImageId(int v) {
            this.iconImageId = v;
            return this;
        }

        public Builder setMainId(int v) {
            this.mainId = v;
            return this;
        }

        public Builder setOptOutId(int v) {
            this.optOutId = v;
            return this;
        }

        public Builder setRatingbarId(int v) {
            this.ratingbarId = v;
            return this;
        }

        public Builder setTitleId(int v) {
            this.titleId = v;
            return this;
        }
    }

    private int callToActionId;
    private int descriptionId;
    private int iconImageId;
    private int layoutId;
    private int mainId;
    private int optOutId;
    private int ratingbarId;
    private int titleId;

    public NativeAdViewBinder(@NonNull Builder nativeAdViewBinder$Builder0) {
        this.layoutId = nativeAdViewBinder$Builder0.layoutId;
        this.titleId = nativeAdViewBinder$Builder0.titleId;
        this.descriptionId = nativeAdViewBinder$Builder0.descriptionId;
        this.mainId = nativeAdViewBinder$Builder0.mainId;
        this.iconImageId = nativeAdViewBinder$Builder0.iconImageId;
        this.callToActionId = nativeAdViewBinder$Builder0.callToActionId;
        this.ratingbarId = nativeAdViewBinder$Builder0.ratingbarId;
        this.optOutId = nativeAdViewBinder$Builder0.optOutId;
    }

    public int getCallToActionId() {
        return this.callToActionId;
    }

    public int getDescriptionId() {
        return this.descriptionId;
    }

    public int getIconImageId() {
        return this.iconImageId;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public int getMainId() {
        return this.mainId;
    }

    public int getOptOutId() {
        return this.optOutId;
    }

    public int getRatingbarId() {
        return this.ratingbarId;
    }

    public int getTitleId() {
        return this.titleId;
    }
}

