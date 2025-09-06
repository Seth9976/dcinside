package com.gomfactory.adpie.sdk.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

public class AdData implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String adm;
    private String admImageTag;
    private int animationType;
    private int backButtonEnabled;
    private String bgColor;
    private int checkView;
    private long closeButtonDelay;
    private int closeButtonPosition;
    private int height;
    private int icType;
    private int monitoring;
    private int orientation;
    private int position;
    private ArrayList trackingClkUrls;
    private ArrayList trackingImpUrls;
    private int webviewLanding;
    private int webviewLoadingSkip;
    private int width;

    static {
        AdData.CREATOR = new Parcelable.Creator() {
            public AdData createFromParcel(Parcel parcel0) {
                return new AdData(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public AdData[] newArray(int v) {
                return new AdData[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public AdData() {
    }

    protected AdData(Parcel parcel0) {
        this.icType = parcel0.readInt();
        this.adm = parcel0.readString();
        this.admImageTag = parcel0.readString();
        this.width = parcel0.readInt();
        this.height = parcel0.readInt();
        this.bgColor = parcel0.readString();
        this.closeButtonPosition = parcel0.readInt();
        this.closeButtonDelay = parcel0.readLong();
        this.monitoring = parcel0.readInt();
        this.webviewLoadingSkip = parcel0.readInt();
        this.trackingImpUrls = parcel0.createStringArrayList();
        this.trackingClkUrls = parcel0.createStringArrayList();
        this.webviewLanding = parcel0.readInt();
        this.orientation = parcel0.readInt();
        this.backButtonEnabled = parcel0.readInt();
        this.checkView = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdm() {
        return this.adm;
    }

    public String getAdmImageTag() {
        return this.admImageTag;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public int getBackButtonEnabled() {
        return this.backButtonEnabled;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public int getCheckView() {
        return this.checkView;
    }

    public long getCloseButtonDelay() {
        return this.closeButtonDelay;
    }

    public int getCloseButtonPosition() {
        return this.closeButtonPosition;
    }

    public int getContentHeight() {
        return this.height;
    }

    public int getContentWidth() {
        return this.width;
    }

    public int getIcType() {
        return this.icType;
    }

    public int getMonitoring() {
        return this.monitoring;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int getPosition() {
        return this.position;
    }

    public ArrayList getTrackingClkUrls() {
        return this.trackingClkUrls;
    }

    public ArrayList getTrackingImpUrls() {
        return this.trackingImpUrls;
    }

    public int getWebviewLanding() {
        return this.webviewLanding;
    }

    public int getWebviewLoadingSkip() {
        return this.webviewLoadingSkip;
    }

    public void setAdm(String s) {
        this.adm = s;
    }

    public void setAdmImageTag(String s) {
        this.admImageTag = s;
    }

    public void setAnimationType(int v) {
        this.animationType = v;
    }

    public void setBackButtonEnabled(int v) {
        this.backButtonEnabled = v;
    }

    public void setBgColor(String s) {
        this.bgColor = s;
    }

    public void setCheckView(int v) {
        this.checkView = v;
    }

    public void setCloseButtonDelay(long v) {
        this.closeButtonDelay = v;
    }

    public void setCloseButtonPosition(int v) {
        this.closeButtonPosition = v;
    }

    public void setContentHeight(int v) {
        this.height = v;
    }

    public void setContentWidth(int v) {
        this.width = v;
    }

    public void setIcType(int v) {
        this.icType = v;
    }

    public void setMonitoring(int v) {
        this.monitoring = v;
    }

    public void setOrientation(int v) {
        this.orientation = v;
    }

    public void setPosition(int v) {
        this.position = v;
    }

    public void setTrackingClkUrls(ArrayList arrayList0) {
        this.trackingClkUrls = arrayList0;
    }

    public void setTrackingImpUrls(ArrayList arrayList0) {
        this.trackingImpUrls = arrayList0;
    }

    public void setWebviewLanding(int v) {
        this.webviewLanding = v;
    }

    public void setWebviewLoadingSkip(int v) {
        this.webviewLoadingSkip = v;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.icType);
        parcel0.writeString(this.adm);
        parcel0.writeString(this.admImageTag);
        parcel0.writeInt(this.width);
        parcel0.writeInt(this.height);
        parcel0.writeString(this.bgColor);
        parcel0.writeInt(this.closeButtonPosition);
        parcel0.writeLong(this.closeButtonDelay);
        parcel0.writeInt(this.monitoring);
        parcel0.writeInt(this.webviewLoadingSkip);
        parcel0.writeStringList(this.trackingImpUrls);
        parcel0.writeStringList(this.trackingClkUrls);
        parcel0.writeInt(this.webviewLanding);
        parcel0.writeInt(this.orientation);
        parcel0.writeInt(this.backButtonEnabled);
        parcel0.writeInt(this.checkView);
    }
}

