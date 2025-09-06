package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class RawParameter implements DTO {
    @m
    private final Raw ad_token;
    @m
    private final Raw affiliate_id;
    @m
    private final Raw affiliate_page;
    @m
    private final Raw app_id;
    @m
    private final Raw app_name;
    @m
    private final Raw app_version;
    @m
    private final Raw device_density;
    @m
    private final Raw device_make;
    @m
    private final Raw device_model;
    @m
    private final Raw device_size;
    @m
    private final Raw device_type;
    @m
    private final Raw dfa;
    @m
    private final Raw os;
    @m
    private final Raw os_version;
    @m
    private final Raw puid;
    @m
    private final Raw sdk_version;
    @m
    private final Raw sub_id;
    @m
    private final Raw token_request_id;

    public RawParameter() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFFF, null);
    }

    public RawParameter(@m Raw raw0, @m Raw raw1, @m Raw raw2, @m Raw raw3, @m Raw raw4, @m Raw raw5, @m Raw raw6, @m Raw raw7, @m Raw raw8, @m Raw raw9, @m Raw raw10, @m Raw raw11, @m Raw raw12, @m Raw raw13, @m Raw raw14, @m Raw raw15, @m Raw raw16, @m Raw raw17) {
        this.sdk_version = raw0;
        this.sub_id = raw1;
        this.affiliate_id = raw2;
        this.affiliate_page = raw3;
        this.dfa = raw4;
        this.device_make = raw5;
        this.device_model = raw6;
        this.device_size = raw7;
        this.device_density = raw8;
        this.device_type = raw9;
        this.os = raw10;
        this.os_version = raw11;
        this.app_name = raw12;
        this.app_id = raw13;
        this.app_version = raw14;
        this.puid = raw15;
        this.ad_token = raw16;
        this.token_request_id = raw17;
    }

    public RawParameter(Raw raw0, Raw raw1, Raw raw2, Raw raw3, Raw raw4, Raw raw5, Raw raw6, Raw raw7, Raw raw8, Raw raw9, Raw raw10, Raw raw11, Raw raw12, Raw raw13, Raw raw14, Raw raw15, Raw raw16, Raw raw17, int v, w w0) {
        this(((v & 1) == 0 ? raw0 : null), ((v & 2) == 0 ? raw1 : null), ((v & 4) == 0 ? raw2 : null), ((v & 8) == 0 ? raw3 : null), ((v & 16) == 0 ? raw4 : null), ((v & 0x20) == 0 ? raw5 : null), ((v & 0x40) == 0 ? raw6 : null), ((v & 0x80) == 0 ? raw7 : null), ((v & 0x100) == 0 ? raw8 : null), ((v & 0x200) == 0 ? raw9 : null), ((v & 0x400) == 0 ? raw10 : null), ((v & 0x800) == 0 ? raw11 : null), ((v & 0x1000) == 0 ? raw12 : null), ((v & 0x2000) == 0 ? raw13 : null), ((v & 0x4000) == 0 ? raw14 : null), ((v & 0x8000) == 0 ? raw15 : null), ((v & 0x10000) == 0 ? raw16 : null), ((v & 0x20000) == 0 ? raw17 : null));
    }

    @m
    public final Raw component1() {
        return this.sdk_version;
    }

    @m
    public final Raw component10() {
        return this.device_type;
    }

    @m
    public final Raw component11() {
        return this.os;
    }

    @m
    public final Raw component12() {
        return this.os_version;
    }

    @m
    public final Raw component13() {
        return this.app_name;
    }

    @m
    public final Raw component14() {
        return this.app_id;
    }

    @m
    public final Raw component15() {
        return this.app_version;
    }

    @m
    public final Raw component16() {
        return this.puid;
    }

    @m
    public final Raw component17() {
        return this.ad_token;
    }

    @m
    public final Raw component18() {
        return this.token_request_id;
    }

    @m
    public final Raw component2() {
        return this.sub_id;
    }

    @m
    public final Raw component3() {
        return this.affiliate_id;
    }

    @m
    public final Raw component4() {
        return this.affiliate_page;
    }

    @m
    public final Raw component5() {
        return this.dfa;
    }

    @m
    public final Raw component6() {
        return this.device_make;
    }

    @m
    public final Raw component7() {
        return this.device_model;
    }

    @m
    public final Raw component8() {
        return this.device_size;
    }

    @m
    public final Raw component9() {
        return this.device_density;
    }

    @l
    public final RawParameter copy(@m Raw raw0, @m Raw raw1, @m Raw raw2, @m Raw raw3, @m Raw raw4, @m Raw raw5, @m Raw raw6, @m Raw raw7, @m Raw raw8, @m Raw raw9, @m Raw raw10, @m Raw raw11, @m Raw raw12, @m Raw raw13, @m Raw raw14, @m Raw raw15, @m Raw raw16, @m Raw raw17) {
        return new RawParameter(raw0, raw1, raw2, raw3, raw4, raw5, raw6, raw7, raw8, raw9, raw10, raw11, raw12, raw13, raw14, raw15, raw16, raw17);
    }

    public static RawParameter copy$default(RawParameter rawParameter0, Raw raw0, Raw raw1, Raw raw2, Raw raw3, Raw raw4, Raw raw5, Raw raw6, Raw raw7, Raw raw8, Raw raw9, Raw raw10, Raw raw11, Raw raw12, Raw raw13, Raw raw14, Raw raw15, Raw raw16, Raw raw17, int v, Object object0) {
        Raw raw18 = (v & 1) == 0 ? raw0 : rawParameter0.sdk_version;
        Raw raw19 = (v & 2) == 0 ? raw1 : rawParameter0.sub_id;
        Raw raw20 = (v & 4) == 0 ? raw2 : rawParameter0.affiliate_id;
        Raw raw21 = (v & 8) == 0 ? raw3 : rawParameter0.affiliate_page;
        Raw raw22 = (v & 16) == 0 ? raw4 : rawParameter0.dfa;
        Raw raw23 = (v & 0x20) == 0 ? raw5 : rawParameter0.device_make;
        Raw raw24 = (v & 0x40) == 0 ? raw6 : rawParameter0.device_model;
        Raw raw25 = (v & 0x80) == 0 ? raw7 : rawParameter0.device_size;
        Raw raw26 = (v & 0x100) == 0 ? raw8 : rawParameter0.device_density;
        Raw raw27 = (v & 0x200) == 0 ? raw9 : rawParameter0.device_type;
        Raw raw28 = (v & 0x400) == 0 ? raw10 : rawParameter0.os;
        Raw raw29 = (v & 0x800) == 0 ? raw11 : rawParameter0.os_version;
        Raw raw30 = (v & 0x1000) == 0 ? raw12 : rawParameter0.app_name;
        Raw raw31 = (v & 0x2000) == 0 ? raw13 : rawParameter0.app_id;
        Raw raw32 = (v & 0x4000) == 0 ? raw14 : rawParameter0.app_version;
        Raw raw33 = (v & 0x8000) == 0 ? raw15 : rawParameter0.puid;
        Raw raw34 = (v & 0x10000) == 0 ? raw16 : rawParameter0.ad_token;
        return (v & 0x20000) == 0 ? rawParameter0.copy(raw18, raw19, raw20, raw21, raw22, raw23, raw24, raw25, raw26, raw27, raw28, raw29, raw30, raw31, raw32, raw33, raw34, raw17) : rawParameter0.copy(raw18, raw19, raw20, raw21, raw22, raw23, raw24, raw25, raw26, raw27, raw28, raw29, raw30, raw31, raw32, raw33, raw34, rawParameter0.token_request_id);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RawParameter)) {
            return false;
        }
        if(!L.g(this.sdk_version, ((RawParameter)object0).sdk_version)) {
            return false;
        }
        if(!L.g(this.sub_id, ((RawParameter)object0).sub_id)) {
            return false;
        }
        if(!L.g(this.affiliate_id, ((RawParameter)object0).affiliate_id)) {
            return false;
        }
        if(!L.g(this.affiliate_page, ((RawParameter)object0).affiliate_page)) {
            return false;
        }
        if(!L.g(this.dfa, ((RawParameter)object0).dfa)) {
            return false;
        }
        if(!L.g(this.device_make, ((RawParameter)object0).device_make)) {
            return false;
        }
        if(!L.g(this.device_model, ((RawParameter)object0).device_model)) {
            return false;
        }
        if(!L.g(this.device_size, ((RawParameter)object0).device_size)) {
            return false;
        }
        if(!L.g(this.device_density, ((RawParameter)object0).device_density)) {
            return false;
        }
        if(!L.g(this.device_type, ((RawParameter)object0).device_type)) {
            return false;
        }
        if(!L.g(this.os, ((RawParameter)object0).os)) {
            return false;
        }
        if(!L.g(this.os_version, ((RawParameter)object0).os_version)) {
            return false;
        }
        if(!L.g(this.app_name, ((RawParameter)object0).app_name)) {
            return false;
        }
        if(!L.g(this.app_id, ((RawParameter)object0).app_id)) {
            return false;
        }
        if(!L.g(this.app_version, ((RawParameter)object0).app_version)) {
            return false;
        }
        if(!L.g(this.puid, ((RawParameter)object0).puid)) {
            return false;
        }
        return L.g(this.ad_token, ((RawParameter)object0).ad_token) ? L.g(this.token_request_id, ((RawParameter)object0).token_request_id) : false;
    }

    @m
    public final Raw getAd_token() {
        return this.ad_token;
    }

    @m
    public final Raw getAffiliate_id() {
        return this.affiliate_id;
    }

    @m
    public final Raw getAffiliate_page() {
        return this.affiliate_page;
    }

    @m
    public final Raw getApp_id() {
        return this.app_id;
    }

    @m
    public final Raw getApp_name() {
        return this.app_name;
    }

    @m
    public final Raw getApp_version() {
        return this.app_version;
    }

    @m
    public final Raw getDevice_density() {
        return this.device_density;
    }

    @m
    public final Raw getDevice_make() {
        return this.device_make;
    }

    @m
    public final Raw getDevice_model() {
        return this.device_model;
    }

    @m
    public final Raw getDevice_size() {
        return this.device_size;
    }

    @m
    public final Raw getDevice_type() {
        return this.device_type;
    }

    @m
    public final Raw getDfa() {
        return this.dfa;
    }

    @m
    public final Raw getOs() {
        return this.os;
    }

    @m
    public final Raw getOs_version() {
        return this.os_version;
    }

    @m
    public final Raw getPuid() {
        return this.puid;
    }

    @m
    public final Raw getSdk_version() {
        return this.sdk_version;
    }

    @m
    public final Raw getSub_id() {
        return this.sub_id;
    }

    @m
    public final Raw getToken_request_id() {
        return this.token_request_id;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.sdk_version == null ? 0 : this.sdk_version.hashCode();
        int v2 = this.sub_id == null ? 0 : this.sub_id.hashCode();
        int v3 = this.affiliate_id == null ? 0 : this.affiliate_id.hashCode();
        int v4 = this.affiliate_page == null ? 0 : this.affiliate_page.hashCode();
        int v5 = this.dfa == null ? 0 : this.dfa.hashCode();
        int v6 = this.device_make == null ? 0 : this.device_make.hashCode();
        int v7 = this.device_model == null ? 0 : this.device_model.hashCode();
        int v8 = this.device_size == null ? 0 : this.device_size.hashCode();
        int v9 = this.device_density == null ? 0 : this.device_density.hashCode();
        int v10 = this.device_type == null ? 0 : this.device_type.hashCode();
        int v11 = this.os == null ? 0 : this.os.hashCode();
        int v12 = this.os_version == null ? 0 : this.os_version.hashCode();
        int v13 = this.app_name == null ? 0 : this.app_name.hashCode();
        int v14 = this.app_id == null ? 0 : this.app_id.hashCode();
        int v15 = this.app_version == null ? 0 : this.app_version.hashCode();
        int v16 = this.puid == null ? 0 : this.puid.hashCode();
        int v17 = this.ad_token == null ? 0 : this.ad_token.hashCode();
        Raw raw0 = this.token_request_id;
        if(raw0 != null) {
            v = raw0.hashCode();
        }
        return ((((((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "RawParameter(sdk_version=" + this.sdk_version + ", sub_id=" + this.sub_id + ", affiliate_id=" + this.affiliate_id + ", affiliate_page=" + this.affiliate_page + ", dfa=" + this.dfa + ", device_make=" + this.device_make + ", device_model=" + this.device_model + ", device_size=" + this.device_size + ", device_density=" + this.device_density + ", device_type=" + this.device_type + ", os=" + this.os + ", os_version=" + this.os_version + ", app_name=" + this.app_name + ", app_id=" + this.app_id + ", app_version=" + this.app_version + ", puid=" + this.puid + ", ad_token=" + this.ad_token + ", token_request_id=" + this.token_request_id + ')';
    }
}

