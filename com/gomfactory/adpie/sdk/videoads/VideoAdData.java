package com.gomfactory.adpie.sdk.videoads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.gomfactory.adpie.sdk.common.AdData;
import java.util.ArrayList;

public class VideoAdData extends AdData {
    public static final Parcelable.Creator CREATOR;
    private boolean autoPlay;
    private int backButtonEnabled;
    private int contentHeight;
    private int contentWidth;
    private int delivery;
    private String description;
    private int duration;
    private int icType;
    private String link;
    private String linkText;
    private String optoutImageUrl;
    private String optoutLink;
    private int orientation;
    private int skipOffset;
    private String ssvUrl;
    private String title;
    private ArrayList trackingClkUrls;
    private ArrayList trackingCompleteUrls;
    private ArrayList trackingFirstQuartileUrls;
    private ArrayList trackingImpUrls;
    private ArrayList trackingMidpointUrls;
    private ArrayList trackingStartUrls;
    private ArrayList trackingThirdQuartileUrls;
    private String videoContent;
    private String videoContentType;

    static {
        VideoAdData.CREATOR = new Parcelable.Creator() {
            public VideoAdData createFromParcel(Parcel parcel0) {
                return new VideoAdData(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public VideoAdData[] newArray(int v) {
                return new VideoAdData[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public VideoAdData() {
    }

    protected VideoAdData(Parcel parcel0) {
        this.icType = parcel0.readInt();
        this.title = parcel0.readString();
        this.description = parcel0.readString();
        this.skipOffset = parcel0.readInt();
        this.duration = parcel0.readInt();
        this.link = parcel0.readString();
        this.linkText = parcel0.readString();
        this.videoContent = parcel0.readString();
        this.videoContentType = parcel0.readString();
        this.delivery = parcel0.readInt();
        this.contentWidth = parcel0.readInt();
        this.contentHeight = parcel0.readInt();
        this.autoPlay = parcel0.readInt() != 0;
        this.trackingStartUrls = parcel0.createStringArrayList();
        this.trackingFirstQuartileUrls = parcel0.createStringArrayList();
        this.trackingMidpointUrls = parcel0.createStringArrayList();
        this.trackingThirdQuartileUrls = parcel0.createStringArrayList();
        this.trackingCompleteUrls = parcel0.createStringArrayList();
        this.trackingImpUrls = parcel0.createStringArrayList();
        this.trackingClkUrls = parcel0.createStringArrayList();
        this.ssvUrl = parcel0.readString();
        this.optoutImageUrl = parcel0.readString();
        this.optoutLink = parcel0.readString();
        this.orientation = parcel0.readInt();
        this.backButtonEnabled = parcel0.readInt();
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int describeContents() {
        return 0;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getBackButtonEnabled() {
        return this.backButtonEnabled;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getContentHeight() {
        return this.contentHeight;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getContentWidth() {
        return this.contentWidth;
    }

    public int getDelivery() {
        return this.delivery;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getIcType() {
        return this.icType;
    }

    public String getLink() {
        return this.link;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getOptoutImageUrl() {
        return this.optoutImageUrl;
    }

    public String getOptoutLink() {
        return this.optoutLink;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public int getOrientation() {
        return this.orientation;
    }

    public int getSkipOffset() {
        return this.skipOffset;
    }

    public String getSsvUrl() {
        return this.ssvUrl;
    }

    public String getTitle() {
        return this.title;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public ArrayList getTrackingClkUrls() {
        return this.trackingClkUrls;
    }

    public ArrayList getTrackingCompleteUrls() {
        return this.trackingCompleteUrls;
    }

    public ArrayList getTrackingFirstQuartileUrls() {
        return this.trackingFirstQuartileUrls;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public ArrayList getTrackingImpUrls() {
        return this.trackingImpUrls;
    }

    public ArrayList getTrackingMidpointUrls() {
        return this.trackingMidpointUrls;
    }

    public ArrayList getTrackingStartUrls() {
        return this.trackingStartUrls;
    }

    public ArrayList getTrackingThirdQuartileUrls() {
        return this.trackingThirdQuartileUrls;
    }

    public String getVideoContent() {
        return this.videoContent;
    }

    public String getVideoContentType() {
        return this.videoContentType;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setBackButtonEnabled(int v) {
        this.backButtonEnabled = v;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setContentHeight(int v) {
        this.contentHeight = v;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setContentWidth(int v) {
        this.contentWidth = v;
    }

    public void setDelivery(int v) {
        this.delivery = v;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    public void setDuration(int v) {
        this.duration = v;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setIcType(int v) {
        this.icType = v;
    }

    public void setLink(String s) {
        this.link = s;
    }

    public void setLinkText(String s) {
        this.linkText = s;
    }

    public void setOptoutImageUrl(String s) {
        this.optoutImageUrl = s;
    }

    public void setOptoutLink(String s) {
        this.optoutLink = s;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setOrientation(int v) {
        this.orientation = v;
    }

    public void setSkipOffset(int v) {
        this.skipOffset = v;
    }

    public void setSsvUrl(String s) {
        this.ssvUrl = s;
    }

    public void setTitle(String s) {
        this.title = s;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setTrackingClkUrls(ArrayList arrayList0) {
        this.trackingClkUrls = arrayList0;
    }

    public void setTrackingCompleteUrls(ArrayList arrayList0) {
        this.trackingCompleteUrls = arrayList0;
    }

    public void setTrackingFirstQuartileUrls(ArrayList arrayList0) {
        this.trackingFirstQuartileUrls = arrayList0;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void setTrackingImpUrls(ArrayList arrayList0) {
        this.trackingImpUrls = arrayList0;
    }

    public void setTrackingMidpointUrls(ArrayList arrayList0) {
        this.trackingMidpointUrls = arrayList0;
    }

    public void setTrackingStartUrls(ArrayList arrayList0) {
        this.trackingStartUrls = arrayList0;
    }

    public void setTrackingThirdQuartileUrls(ArrayList arrayList0) {
        this.trackingThirdQuartileUrls = arrayList0;
    }

    public void setVideoContent(String s) {
        this.videoContent = s;
    }

    public void setVideoContentType(String s) {
        this.videoContentType = s;
    }

    @Override  // com.gomfactory.adpie.sdk.common.AdData
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.icType);
        parcel0.writeString(this.title);
        parcel0.writeString(this.description);
        parcel0.writeInt(this.skipOffset);
        parcel0.writeInt(this.duration);
        parcel0.writeString(this.link);
        parcel0.writeString(this.linkText);
        parcel0.writeString(this.videoContent);
        parcel0.writeString(this.videoContentType);
        parcel0.writeInt(this.delivery);
        parcel0.writeInt(this.contentWidth);
        parcel0.writeInt(this.contentHeight);
        parcel0.writeInt(((int)this.autoPlay));
        parcel0.writeStringList(this.trackingStartUrls);
        parcel0.writeStringList(this.trackingFirstQuartileUrls);
        parcel0.writeStringList(this.trackingMidpointUrls);
        parcel0.writeStringList(this.trackingThirdQuartileUrls);
        parcel0.writeStringList(this.trackingCompleteUrls);
        parcel0.writeStringList(this.trackingImpUrls);
        parcel0.writeStringList(this.trackingClkUrls);
        parcel0.writeString(this.ssvUrl);
        parcel0.writeString(this.optoutImageUrl);
        parcel0.writeString(this.optoutLink);
        parcel0.writeInt(this.orientation);
        parcel0.writeInt(this.backButtonEnabled);
    }
}

