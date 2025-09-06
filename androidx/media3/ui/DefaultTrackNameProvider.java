package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;

@UnstableApi
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources a;

    public DefaultTrackNameProvider(Resources resources0) {
        this.a = (Resources)Assertions.g(resources0);
    }

    @Override  // androidx.media3.ui.TrackNameProvider
    public String a(Format format0) {
        String s;
        int v = DefaultTrackNameProvider.i(format0);
        if(v == 2) {
            s = this.j(new String[]{this.h(format0), this.g(format0), this.c(format0)});
        }
        else {
            s = v == 1 ? this.j(new String[]{this.e(format0), this.b(format0), this.c(format0)}) : this.e(format0);
        }
        if(s.length() != 0) {
            return s;
        }
        return format0.d == null || format0.d.trim().isEmpty() ? this.a.getString(string.exo_track_unknown) : this.a.getString(string.exo_track_unknown_name, new Object[]{format0.d});
    }

    private String b(Format format0) {
        int v = format0.B;
        if(v != -1 && v >= 1) {
            switch(v) {
                case 1: {
                    return this.a.getString(string.exo_track_mono);
                }
                case 2: {
                    return this.a.getString(string.exo_track_stereo);
                }
                case 6: 
                case 7: {
                    return this.a.getString(string.exo_track_surround_5_point_1);
                }
                case 8: {
                    return this.a.getString(string.exo_track_surround_7_point_1);
                }
                default: {
                    return this.a.getString(string.exo_track_surround);
                }
            }
        }
        return "";
    }

    private String c(Format format0) {
        return format0.i == -1 ? "" : this.a.getString(string.exo_track_bitrate, new Object[]{((float)(((float)format0.i) / 1000000.0f))});
    }

    // 去混淆评级： 低(20)
    private String d(Format format0) {
        return TextUtils.isEmpty(format0.b) ? "" : format0.b;
    }

    private String e(Format format0) {
        String s = this.j(new String[]{this.f(format0), this.h(format0)});
        return TextUtils.isEmpty(s) ? this.d(format0) : s;
    }

    private String f(Format format0) {
        String s = format0.d;
        if(!TextUtils.isEmpty(s) && !"und".equals(s)) {
            Locale locale0 = Util.a < 21 ? new Locale(s) : Locale.forLanguageTag(s);
            Locale locale1 = Util.m0();
            String s1 = locale0.getDisplayName(locale1);
            if(TextUtils.isEmpty(s1)) {
                return "";
            }
            try {
                int v = s1.offsetByCodePoints(0, 1);
                return s1.substring(0, v).toUpperCase(locale1) + s1.substring(v);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                return s1;
            }
        }
        return "";
    }

    private String g(Format format0) {
        return format0.t == -1 || format0.u == -1 ? "" : this.a.getString(string.exo_track_resolution, new Object[]{format0.t, format0.u});
    }

    private String h(Format format0) {
        String s = (format0.f & 2) == 0 ? "" : this.a.getString(string.exo_track_role_alternate);
        if((format0.f & 4) != 0) {
            s = this.j(new String[]{s, this.a.getString(string.exo_track_role_supplementary)});
        }
        if((format0.f & 8) != 0) {
            s = this.j(new String[]{s, this.a.getString(string.exo_track_role_commentary)});
        }
        return (format0.f & 0x440) == 0 ? s : this.j(new String[]{s, this.a.getString(string.exo_track_role_closed_captions)});
    }

    private static int i(Format format0) {
        int v = MimeTypes.m(format0.n);
        if(v != -1) {
            return v;
        }
        if(MimeTypes.p(format0.j) != null) {
            return 2;
        }
        if(MimeTypes.c(format0.j) != null) {
            return 1;
        }
        if(format0.t == -1 && format0.u == -1) {
            return format0.B != -1 || format0.C != -1 ? 1 : -1;
        }
        return 2;
    }

    private String j(String[] arr_s) {
        String s = "";
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(s1.length() > 0) {
                s = TextUtils.isEmpty(s) ? s1 : this.a.getString(string.exo_item_list, new Object[]{s, s1});
            }
        }
        return s;
    }
}

