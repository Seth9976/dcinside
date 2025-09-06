package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class PlacementGroup implements DTO {
    @m
    private final String handler;
    @m
    private final Number limit;
    @m
    private final List placements;
    @m
    private final List productItemIds;
    @m
    private final Property properties;

    public PlacementGroup() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public PlacementGroup(@m List list0, @m Number number0, @m String s, @m List list1, @m Property property0) {
        this.placements = list0;
        this.limit = number0;
        this.handler = s;
        this.productItemIds = list1;
        this.properties = property0;
    }

    public PlacementGroup(List list0, Number number0, String s, List list1, Property property0, int v, w w0) {
        this(((v & 1) == 0 ? list0 : null), ((v & 2) == 0 ? number0 : null), ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? list1 : null), ((v & 16) == 0 ? property0 : null));
    }

    @m
    public final List component1() {
        return this.placements;
    }

    @m
    public final Number component2() {
        return this.limit;
    }

    @m
    public final String component3() {
        return this.handler;
    }

    @m
    public final List component4() {
        return this.productItemIds;
    }

    @m
    public final Property component5() {
        return this.properties;
    }

    @l
    public final PlacementGroup copy(@m List list0, @m Number number0, @m String s, @m List list1, @m Property property0) {
        return new PlacementGroup(list0, number0, s, list1, property0);
    }

    public static PlacementGroup copy$default(PlacementGroup placementGroup0, List list0, Number number0, String s, List list1, Property property0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = placementGroup0.placements;
        }
        if((v & 2) != 0) {
            number0 = placementGroup0.limit;
        }
        if((v & 4) != 0) {
            s = placementGroup0.handler;
        }
        if((v & 8) != 0) {
            list1 = placementGroup0.productItemIds;
        }
        if((v & 16) != 0) {
            property0 = placementGroup0.properties;
        }
        return placementGroup0.copy(list0, number0, s, list1, property0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlacementGroup)) {
            return false;
        }
        if(!L.g(this.placements, ((PlacementGroup)object0).placements)) {
            return false;
        }
        if(!L.g(this.limit, ((PlacementGroup)object0).limit)) {
            return false;
        }
        if(!L.g(this.handler, ((PlacementGroup)object0).handler)) {
            return false;
        }
        return L.g(this.productItemIds, ((PlacementGroup)object0).productItemIds) ? L.g(this.properties, ((PlacementGroup)object0).properties) : false;
    }

    @m
    public final String getHandler() {
        return this.handler;
    }

    @m
    public final Number getLimit() {
        return this.limit;
    }

    @m
    public final List getPlacements() {
        return this.placements;
    }

    @m
    public final List getProductItemIds() {
        return this.productItemIds;
    }

    @m
    public final Property getProperties() {
        return this.properties;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.placements == null ? 0 : this.placements.hashCode();
        int v2 = this.limit == null ? 0 : this.limit.hashCode();
        int v3 = this.handler == null ? 0 : this.handler.hashCode();
        int v4 = this.productItemIds == null ? 0 : this.productItemIds.hashCode();
        Property property0 = this.properties;
        if(property0 != null) {
            v = property0.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "PlacementGroup(placements=" + this.placements + ", limit=" + this.limit + ", handler=" + this.handler + ", productItemIds=" + this.productItemIds + ", properties=" + this.properties + ')';
    }
}

