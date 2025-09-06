package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WebViewConfigurationStoreSerializer implements Serializer {
    @l
    private final WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0 = WebViewConfigurationStore.getDefaultInstance();
        L.o(webviewConfigurationStore$WebViewConfigurationStore0, "getDefaultInstance()");
        this.defaultValue = webviewConfigurationStore$WebViewConfigurationStore0;
    }

    @l
    public WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object getDefaultValue() {
        return this.getDefaultValue();
    }

    @Override  // androidx.datastore.core.Serializer
    @m
    public Object readFrom(@l InputStream inputStream0, @l d d0) {
        try {
            WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0 = WebViewConfigurationStore.parseFrom(inputStream0);
            L.o(webviewConfigurationStore$WebViewConfigurationStore0, "parseFrom(input)");
            return webviewConfigurationStore$WebViewConfigurationStore0;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw new CorruptionException("Cannot read proto.", invalidProtocolBufferException0);
        }
    }

    @m
    public Object writeTo(@l WebViewConfigurationStore webviewConfigurationStore$WebViewConfigurationStore0, @l OutputStream outputStream0, @l d d0) {
        webviewConfigurationStore$WebViewConfigurationStore0.writeTo(outputStream0);
        return S0.a;
    }

    @Override  // androidx.datastore.core.Serializer
    public Object writeTo(Object object0, OutputStream outputStream0, d d0) {
        return this.writeTo(((WebViewConfigurationStore)object0), outputStream0, d0);
    }
}

