package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMetadataReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n1#1,24:1\n8#1,6:25\n*S KotlinDebug\n*F\n+ 1 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n*L\n17#1:25,6\n*E\n"})
public abstract class MetadataReader {
    @l
    private final JsonStorage jsonStorage;
    @l
    private final String key;

    public MetadataReader(@l JsonStorage jsonStorage0, @l String s) {
        L.p(jsonStorage0, "jsonStorage");
        L.p(s, "key");
        super();
        this.jsonStorage = jsonStorage0;
        this.key = s;
    }

    @l
    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    @l
    public final String getKey() {
        return this.key;
    }

    public final Object read(Object object0) {
        Object object1 = this.getJsonStorage().get(this.getKey());
        if(object1 != null) {
            L.y(3, "T");
            return object1;
        }
        return object0;
    }

    public static Object read$default(MetadataReader metadataReader0, Object object0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        Object object2 = metadataReader0.getJsonStorage().get(metadataReader0.getKey());
        if(object2 != null) {
            L.y(3, "T");
            return object2;
        }
        return object0;
    }

    public final Object readAndDelete(Object object0) {
        Object object1 = this.getJsonStorage().get(this.getKey());
        if(object1 != null) {
            L.o(object1, "get(key)");
            L.y(3, "T");
            object0 = object1;
        }
        Object object2 = this.getJsonStorage().get(this.getKey());
        if(object2 != null) {
            L.o(object2, "get(key)");
            this.getJsonStorage().delete(this.getKey());
        }
        return object0;
    }

    public static Object readAndDelete$default(MetadataReader metadataReader0, Object object0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        Object object2 = metadataReader0.getJsonStorage().get(metadataReader0.getKey());
        if(object2 != null) {
            L.o(object2, "get(key)");
            L.y(3, "T");
            object0 = object2;
        }
        Object object3 = metadataReader0.getJsonStorage().get(metadataReader0.getKey());
        if(object3 != null) {
            L.o(object3, "get(key)");
            metadataReader0.getJsonStorage().delete(metadataReader0.getKey());
        }
        return object0;
    }
}

