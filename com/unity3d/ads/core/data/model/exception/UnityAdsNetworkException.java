package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public class UnityAdsNetworkException extends Exception {
    @m
    private final String client;
    @m
    private final Integer code;
    @m
    private final Integer cronetCode;
    @l
    private final String message;
    @m
    private final String protocol;
    @l
    private final OperationType type;
    @m
    private final String url;

    public UnityAdsNetworkException(@l String s, @l OperationType operationType0, @m Integer integer0, @m String s1, @m String s2, @m Integer integer1, @m String s3) {
        L.p(s, "message");
        L.p(operationType0, "type");
        super(s);
        this.message = s;
        this.type = operationType0;
        this.code = integer0;
        this.url = s1;
        this.protocol = s2;
        this.cronetCode = integer1;
        this.client = s3;
    }

    public UnityAdsNetworkException(String s, OperationType operationType0, Integer integer0, String s1, String s2, Integer integer1, String s3, int v, w w0) {
        this(s, ((v & 2) == 0 ? operationType0 : OperationType.UNKNOWN), ((v & 4) == 0 ? integer0 : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? integer1 : null), ((v & 0x40) == 0 ? s3 : null));
    }

    @m
    public final String getClient() {
        return this.client;
    }

    @m
    public final Integer getCode() {
        return this.code;
    }

    @m
    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override
    @l
    public String getMessage() {
        return this.message;
    }

    @m
    public final String getProtocol() {
        return this.protocol;
    }

    @l
    public final OperationType getType() {
        return this.type;
    }

    @m
    public final String getUrl() {
        return this.url;
    }
}

