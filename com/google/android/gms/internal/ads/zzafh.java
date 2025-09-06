package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class zzafh {
    private static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;

    static {
        zzafh.zza = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        zzafh.zzb = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        zzafh.zzc = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    @Nullable
    public static zzafd zza(String s) throws IOException {
        try {
            XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParser0.setInput(new StringReader(s));
            xmlPullParser0.next();
            if(!zzej.zzc(xmlPullParser0, "x:xmpmeta")) {
                throw zzbc.zza("Couldn\'t find xmp metadata", null);
            }
            zzfxn zzfxn0 = zzfxn.zzn();
            long v = 0x8000000000000001L;
        alab1:
            while(true) {
                xmlPullParser0.next();
                if(zzej.zzc(xmlPullParser0, "rdf:Description")) {
                    String[] arr_s = zzafh.zza;
                    int v1 = 0;
                    int v2 = 0;
                    while(true) {
                        if(v2 >= 4) {
                            break alab1;
                        }
                        String s1 = zzej.zza(xmlPullParser0, arr_s[v2]);
                        if(s1 != null) {
                            if(Integer.parseInt(s1) != 1) {
                                break alab1;
                            }
                            long v3 = 0x8000000000000001L;
                            String[] arr_s1 = zzafh.zzb;
                            for(int v4 = 0; v4 < 4; ++v4) {
                                String s2 = zzej.zza(xmlPullParser0, arr_s1[v4]);
                                if(s2 != null) {
                                    long v5 = Long.parseLong(s2);
                                    if(v5 == -1L) {
                                        break;
                                    }
                                    v3 = v5;
                                    break;
                                }
                            }
                            String[] arr_s2 = zzafh.zzc;
                            while(v1 < 2) {
                                String s3 = zzej.zza(xmlPullParser0, arr_s2[v1]);
                                if(s3 == null) {
                                    ++v1;
                                    continue;
                                }
                                long v6 = Long.parseLong(s3);
                                zzfxn0 = zzfxn.zzp(new zzafc("image/jpeg", "Primary", 0L, 0L), new zzafc("video/mp4", "MotionPhoto", v6, 0L));
                                goto label_39;
                            }
                            zzfxn0 = zzfxn.zzn();
                        label_39:
                            v = v3;
                            break;
                        }
                        ++v2;
                    }
                }
                else if(zzej.zzc(xmlPullParser0, "Container:Directory")) {
                    zzfxn0 = zzafh.zzb(xmlPullParser0, "Container", "Item");
                }
                else if(zzej.zzc(xmlPullParser0, "GContainer:Directory")) {
                    zzfxn0 = zzafh.zzb(xmlPullParser0, "GContainer", "GContainerItem");
                }
                if(zzej.zzb(xmlPullParser0, "x:xmpmeta")) {
                    return zzfxn0.isEmpty() ? null : new zzafd(v, zzfxn0);
                }
            }
        }
        catch(XmlPullParserException | zzbc | NumberFormatException unused_ex) {
            zzdo.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
        }
        return null;
    }

    private static zzfxn zzb(XmlPullParser xmlPullParser0, String s, String s1) throws XmlPullParserException, IOException {
        zzfxk zzfxk0 = new zzfxk();
        do {
            xmlPullParser0.next();
            if(zzej.zzc(xmlPullParser0, s + ":Item")) {
                String s2 = zzej.zza(xmlPullParser0, s1 + ":Mime");
                String s3 = zzej.zza(xmlPullParser0, s1 + ":Semantic");
                String s4 = zzej.zza(xmlPullParser0, s1 + ":Length");
                String s5 = zzej.zza(xmlPullParser0, s1 + ":Padding");
                if(s2 != null && s3 != null) {
                    zzfxk0.zzf(new zzafc(s2, s3, (s4 == null ? 0L : Long.parseLong(s4)), (s5 == null ? 0L : Long.parseLong(s5))));
                    continue;
                }
                return zzfxn.zzn();
            }
        }
        while(!zzej.zzb(xmlPullParser0, s + ":Directory"));
        return zzfxk0.zzi();
    }
}

