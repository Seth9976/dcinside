package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;

public class WebViewCallback implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String _callbackId;
    private int _invocationId;
    private boolean _invoked;

    static {
        WebViewCallback.CREATOR = new Parcelable.Creator() {
            public WebViewCallback createFromParcel(Parcel parcel0) {
                return new WebViewCallback(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public WebViewCallback[] newArray(int v) {
                return new WebViewCallback[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public WebViewCallback(Parcel parcel0) {
        this._callbackId = parcel0.readString();
        this._invoked = parcel0.readByte() != 0;
        this._invocationId = parcel0.readInt();
    }

    public WebViewCallback(String s, int v) {
        this._callbackId = s;
        this._invocationId = v;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0xB26E;
    }

    public void error(Enum enum0, Object[] arr_object) {
        this.invoke(CallbackStatus.ERROR, enum0, arr_object);
    }

    public String getCallbackId() {
        return this._callbackId;
    }

    public int getInvocationId() {
        return this._invocationId;
    }

    private void invoke(CallbackStatus callbackStatus0, Enum enum0, Object[] arr_object) {
        if(!this._invoked && (this._callbackId != null && this._callbackId.length() != 0)) {
            this._invoked = true;
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(Arrays.asList(arr_object));
            arrayList0.add(0, this._callbackId);
            Invocation invocation0 = Invocation.getInvocationById(this._invocationId);
            if(invocation0 == null) {
                DeviceLog.error(("Couldn\'t get batch with id: " + this.getInvocationId()));
                return;
            }
            invocation0.setInvocationResponse(callbackStatus0, enum0, arrayList0.toArray());
        }
    }

    public void invoke(Object[] arr_object) {
        this.invoke(CallbackStatus.OK, null, arr_object);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this._callbackId);
        parcel0.writeByte(((byte)this._invoked));
        parcel0.writeInt(this._invocationId);
    }
}

