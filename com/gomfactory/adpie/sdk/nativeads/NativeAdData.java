package com.gomfactory.adpie.sdk.nativeads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.gomfactory.adpie.sdk.common.AdData;
import com.gomfactory.adpie.sdk.videoads.VideoAdData;
import java.util.ArrayList;

public class NativeAdData extends AdData {
    public static final Parcelable.Creator CREATOR;
    private int[] assetTypes;
    private String callToAction;
    private String description;
    private int icType;
    private int iconHeight;
    private String iconImageUrl;
    private int iconWidth;
    private String link;
    private int mainHeight;
    private String mainImageUrl;
    private int mainWidth;
    private int onlyClickCTA;
    private String optoutImageUrl;
    private String optoutLink;
    private double rating;
    private String title;
    private ArrayList trackingClkUrls;
    private ArrayList trackingImpUrls;
    private VideoAdData videoAdData;

    static {
        NativeAdData.CREATOR = new Parcelable.Creator() {
            public NativeAdData createFromParcel(Parcel parcel0) {
                return new NativeAdData(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public NativeAdData[] newArray(int v) {
                return new NativeAdData[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public NativeAdData() {
    }

    protected NativeAdData(Parcel parcel0) {
        this.icType = parcel0.readInt();
        this.assetTypes = parcel0.createIntArray();
        this.title = parcel0.readString();
        this.description = parcel0.readString();
        this.iconImageUrl = parcel0.readString();
        this.mainImageUrl = parcel0.readString();
        this.callToAction = parcel0.readString();
        this.rating = parcel0.readDouble();
        this.iconWidth = parcel0.readInt();
        this.iconHeight = parcel0.readInt();
        this.mainWidth = parcel0.readInt();
        this.mainHeight = parcel0.readInt();
        this.link = parcel0.readString();
        this.trackingImpUrls = parcel0.createStringArrayList();
        this.trackingClkUrls = parcel0.createStringArrayList();
        this.optoutImageUrl = parcel0.readString();
        this.optoutLink = parcel0.readString();
        this.videoAdData = (VideoAdData)parcel0.readParcelable(VideoAdData.class.getClassLoader());
        this.onlyClickCTA = parcel0.readInt();
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int describeContents() {
        return 0;
    }

    public int[] getAssetTypes() {
        return this.assetTypes;
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public String getDescription() {
        return this.description;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getIcType() {
        return this.icType;
    }

    public int getIconHeight() {
        return this.iconHeight;
    }

    public String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public int getIconWidth() {
        return this.iconWidth;
    }

    public String getLink() {
        return this.link;
    }

    public int getMainHeight() {
        return this.mainHeight;
    }

    public String getMainImageUrl() {
        return this.mainImageUrl;
    }

    public int getMainWidth() {
        return this.mainWidth;
    }

    public int getOnlyClickCTA() {
        return this.onlyClickCTA;
    }

    public String getOptoutImageUrl() {
        return this.optoutImageUrl;
    }

    public String getOptoutLink() {
        return this.optoutLink;
    }

    public double getRating() {
        return this.rating;
    }

    public String getTitle() {
        return this.title;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public ArrayList getTrackingClkUrls() {
        return this.trackingClkUrls;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public ArrayList getTrackingImpUrls() {
        return this.trackingImpUrls;
    }

    public VideoAdData getVideoAdData() {
        return this.videoAdData;
    }

    public void setAssetTypes(int[] arr_v) {
        this.assetTypes = arr_v;
    }

    public void setCallToAction(String s) {
        this.callToAction = s;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setIcType(int v) {
        this.icType = v;
    }

    public void setIconHeight(int v) {
        this.iconHeight = v;
    }

    public void setIconImageUrl(String s) {
        this.iconImageUrl = s;
    }

    public void setIconWidth(int v) {
        this.iconWidth = v;
    }

    public void setLink(String s) {
        this.link = s;
    }

    public void setMainHeight(int v) {
        this.mainHeight = v;
    }

    public void setMainImageUrl(String s) {
        this.mainImageUrl = s;
    }

    public void setMainWidth(int v) {
        this.mainWidth = v;
    }

    public void setOnlyClickCTA(int v) {
        this.onlyClickCTA = v;
    }

    public void setOptoutImageUrl(String s) {
        this.optoutImageUrl = s;
    }

    public void setOptoutLink(String s) {
        this.optoutLink = s;
    }

    public void setRating(double f) {
        this.rating = f;
    }

    public void setTitle(String s) {
        this.title = s;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setTrackingClkUrls(ArrayList arrayList0) {
        this.trackingClkUrls = arrayList0;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setTrackingImpUrls(ArrayList arrayList0) {
        this.trackingImpUrls = arrayList0;
    }

    public void setVideoAdData(VideoAdData videoAdData0) {
        this.videoAdData = videoAdData0;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.icType);
        parcel0.writeIntArray(this.assetTypes);
        parcel0.writeString(this.title);
        parcel0.writeString(this.description);
        parcel0.writeString(this.iconImageUrl);
        parcel0.writeString(this.mainImageUrl);
        parcel0.writeString(this.callToAction);
        parcel0.writeDouble(this.rating);
        parcel0.writeInt(this.iconWidth);
        parcel0.writeInt(this.iconHeight);
        parcel0.writeInt(this.mainWidth);
        parcel0.writeInt(this.mainHeight);
        parcel0.writeString(this.link);
        parcel0.writeStringList(this.trackingImpUrls);
        parcel0.writeStringList(this.trackingClkUrls);
        parcel0.writeString(this.optoutImageUrl);
        parcel0.writeString(this.optoutLink);
        parcel0.writeParcelable(this.videoAdData, v);
        parcel0.writeInt(this.onlyClickCTA);
    }
}

