package com.facebook.drawee.backends.pipeline.info;

import k1.n.a;
import k1.n;

@n(a.a)
public class f {
    public static int a(String s) {
        s.hashCode();
        switch(s) {
            case "BitmapMemoryCacheGetProducer": {
                return 5;
            }
            case "BitmapMemoryCacheProducer": {
                return 5;
            }
            case "DataFetchProducer": {
                return 7;
            }
            case "DiskCacheProducer": {
                return 3;
            }
            case "EncodedMemoryCacheProducer": {
                return 4;
            }
            case "LocalAssetFetchProducer": {
                return 7;
            }
            case "LocalContentUriFetchProducer": {
                return 7;
            }
            case "LocalContentUriThumbnailFetchProducer": {
                return 7;
            }
            case "LocalFileFetchProducer": {
                return 7;
            }
            case "LocalResourceFetchProducer": {
                return 7;
            }
            case "NetworkFetchProducer": {
                return 2;
            }
            case "PartialDiskCacheProducer": {
                return 3;
            }
            case "PostprocessedBitmapMemoryCacheProducer": {
                return 5;
            }
            case "QualifiedResourceFetchProducer": {
                return 7;
            }
            case "VideoThumbnailProducer": {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }

    public static String b(int v) {
        switch(v) {
            case 2: {
                return "network";
            }
            case 3: {
                return "disk";
            }
            case 4: {
                return "memory_encoded";
            }
            case 5: {
                return "memory_bitmap";
            }
            case 6: {
                return "memory_bitmap_shortcut";
            }
            case 7: {
                return "local";
            }
            default: {
                return "unknown";
            }
        }
    }
}

