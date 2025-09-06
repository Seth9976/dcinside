package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display.Mode;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem.SubtitleConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.Player.Commands;
import androidx.media3.common.Player;
import androidx.media3.common.audio.AudioProcessor.AudioFormat;
import com.google.common.base.c;
import com.google.common.base.f;
import com.google.common.collect.O2;
import com.google.common.math.h;
import com.google.common.primitives.l;
import com.google.common.primitives.u;
import com.google.common.util.concurrent.C0;
import com.google.common.util.concurrent.O0;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.t0;
import com.google.common.util.concurrent.w;
import h4.d;
import h4.e;
import j..util.DesugarTimeZone;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale.Category;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;

public final class Util {
    @RequiresApi(21)
    static final class Api21 {
        @DoNotInline
        public static Drawable a(Context context0, Resources resources0, @DrawableRes int v) {
            return resources0.getDrawable(v, context0.getTheme());
        }
    }

    @RequiresApi(29)
    static class Api29 {
        @DoNotInline
        public static void a(Service service0, int v, Notification notification0, int v1, String s) {
            try {
                service0.startForeground(v, notification0, v1);
            }
            catch(RuntimeException runtimeException0) {
                Log.d("Util", "The service must be declared with a foregroundServiceType that includes " + s);
                throw runtimeException0;
            }
        }
    }

    @UnstableApi
    public static final int a = 0;
    @UnstableApi
    public static final String b = null;
    @UnstableApi
    public static final String c = null;
    @UnstableApi
    public static final String d = null;
    @UnstableApi
    public static final String e = null;
    @UnstableApi
    public static final byte[] f = null;
    @UnstableApi
    public static final long[] g = null;
    private static final String h = "Util";
    private static final Pattern i = null;
    private static final Pattern j = null;
    private static final Pattern k = null;
    private static final Pattern l = null;
    private static final String m = "format=m3u8-aapl";
    private static final String n = "format=mpd-time-csf";
    @Nullable
    private static HashMap o;
    private static final String[] p;
    private static final String[] q;
    private static final int[] r;
    private static final int[] s;
    private static final int[] t;

    static {
        Util.a = Build.VERSION.SDK_INT;
        Util.b = Build.DEVICE;
        Util.c = Build.MANUFACTURER;
        Util.d = Build.MODEL;
        Util.e = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
        Util.f = new byte[0];
        Util.g = new long[0];
        Util.i = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Util.j = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Util.k = Pattern.compile("%([A-Fa-f0-9]{2})");
        Util.l = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        Util.p = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        Util.q = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        Util.r = new int[]{0, 0x4C11DB7, 0x9823B6E, 222504665, 0x130476DC, 398814059, 445009330, 507990021, 0x2608EDB8, 0x22C9F00F, 0x2F8AD6D6, 0x2B4BCB61, 890018660, 0x31CD86D3, 1015980042, 944750013, 0x4C11DB70, 0x48D0C6C7, 1167319070, 0x4152FDA9, 0x5F15ADAC, 0x5BD4B01B, 1452775106, 1381403509, 1780037320, 0x6ED82B7F, 0x639B0DA6, 0x675A1011, 2031960084, 0x7DDC5DA3, 1889500026, 0x745E66CD, 0x9823B6E0, -1662866601, 0x91A18D8E, 0x95609039, 0x8B27C03C, 0x8FE6DD8B, -2103051438, -2040207643, -1104454824, -1159051537, 0xB7A96036, 0xB3687D81, 0xAD2F2D84, -1444007885, -1532160278, 0xA06C0B5D, 0xD4326D90, 0xD0F37027, 0xDDB056FE, 0xD9714B49, -952755380, 0xC3F706FB, -827056094, 0xCA753D95, 0xF23A8028, 0xF6FB9D9F, 0xFBB8BB46, 0xFF79A6F1, 0xE13EF6F4, 0xE5FFEB43, -390279782, 0xEC7DD02D, 0x34867077, 0x30476DC0, 0x3D044B19, 969234094, 0x278206AB, 591600412, 0x2E003DC5, 0x2AC12072, 0x128E9DCF, 0x164F8078, 0x1B0CA6A1, 0x1FCDBB16, 0x18AEB13, 0x54BF6A4, 0x808D07D, 214552010, 2023205639, 2086057648, 0x71159069, 0x75D48DDE, 1804852699, 0x6F52C06C, 1645340341, 0x66D0FB02, 0x5E9F46BF, 0x5A5E5B08, 1461550545, 0x53DC6066, 1302016099, 1230646740, 0x44190B0D, 1087903418, 0xACA5C697, 0xA864DB20, 0xA527FDF9, 0xA1E6E04E, 0xBFA1B04B, 0xBB60ADFC, -1239184603, 0xB2E29692, -1968362705, -1905510760, 0x832F1041, 0x87EE0DF6, 0x99A95DF3, 0x9D684044, 0x902B669D, 0x94EA7B2A, 0xE0B41DE7, 0xE4750050, 0xE9362689, 0xEDF73B3E, -206542021, -143559028, 0xFA325055, 0xFEF34DE2, 0xC6BCF05F, -1031934488, 0xCF3ECB31, 0xCBFFD686, -709327229, -780559564, -600130067, 0xD8FBA05A, 0x690CE0EE, 0x6DCDFD59, 0x608EDB80, 0x644FC637, 2047383090, 0x7EC98B85, 0x738AAD5C, 2001449195, 0x4F040D56, 0x4BC510E1, 1183200824, 0x42472B8F, 0x5C007B8A, 1489069629, 0x558240E4, 0x51435D53, 0x251D3B9E, 568075817, 0x2C9F00F0, 0x285E1D47, 907627842, 0x32D850F5, 1067152940, 0x3B5A6B9B, 0x315D626, 0x7D4CB91, 177728840, 0xE56F0FF, 0x1011A0FA, 0x14D0BD4D, 429104020, 0x1D528623, 0xF12F560E, 0xF5EE4BB9, -122852000, -60002089, -500490030, -420856475, 0xEBA91BBC, 0xEF68060B, 0xD727BBB6, 0xD3E6A601, 0xDEA580D8, -630940305, -1004286614, 0xC0E2D0DD, 0xCDA1F604, 0xC960EBB3, -1119974018, 0xB9FF90C9, -1262701040, 0xB07DABA7, 0xAE3AFBA2, 0xAAFBE615, 0xA7B8C0CC, 0xA379DD7B, -1690935098, 0x9FF77D71, 0x92B45BA8, -1770699233, -2009983462, 0x8CF30BAD, -2119160460, 0x857130C3, 0x5D8A9099, 0x594B8D2E, 0x5408ABF7, 0x50C9B640, 1317987909, 0x4A4FFBF2, 0x470CDD2B, 0x43CDC09C, 2072149281, 0x7F436096, 0x7200464F, 0x76C15BF8, 0x68860BFD, 1816598090, 0x61043093, 1707420964, 295390185, 0x155A565E, 404320391, 0x1CD86D30, 0x29F3D35, 106832002, 0xB1D065B, 266083308, 0x3793A651, 861060070, 0x3E119D3F, 0x3AD08088, 0x2497D08D, 0x2056CD3A, 0x2D15EBE3, 0x29D4F654, -978770311, -1050133554, 0xCC2B1D17, 0xC8EA00A0, 0xD6AD50A5, 0xD26C4D12, 0xDF2F6BCB, -605129092, 0xE3A1CBC1, -413084042, 0xEA23F0AF, -287118056, 0xF0A5BD1D, 0xF464A0AA, -114850189, 0xFDE69BC4, 0x89B8FD09, 0x8D79E0BE, 0x803AC667, 0x84FBDBD0, 0x9ABC8BD5, -1635936670, -1824608069, 0x97FFAD0C, 0xAFB010B1, 0xAB710D06, -1506661409, 0xA2F33668, -1129027987, -1200260134, 0xB5365D03, 0xB1F740B4};
        Util.s = new int[]{0, 0x1021, 0x2042, 0x3063, 0x4084, 0x50A5, 0x60C6, 0x70E7, 0x8108, 0x9129, 41290, 0xB16B, 0xC18C, 0xD1AD, 57806, 0xF1EF};
        Util.t = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 0x3F, 54, 49, 36, 35, 42, 45, 0x70, 0x77, 0x7E, 0x79, 108, 107, 98, 101, 72, 0x4F, 70, 65, 84, 83, 90, 93, 0xE0, 0xE7, 0xEE, 0xE9, 0xFC, 0xFB, 0xF2, 0xF5, 0xD8, 0xDF, 0xD6, 209, 0xC4, 0xC3, 202, 205, 0x90, 0x97, 0x9E, 0x99, 140, 0x8B, 130, 0x85, 0xA8, 0xAF, 0xA6, 0xA1, 180, 0xB3, 0xBA, 0xBD, 0xC7, 0xC0, 201, 206, 0xDB, 220, 0xD5, 210, 0xFF, 0xF8, 0xF1, 0xF6, 0xE3, 0xE4, 0xED, 0xEA, 0xB7, 0xB0, 0xB9, 190, 0xAB, 0xAC, 0xA5, 0xA2, 0x8F, 0x88, 0x81, 0x86, 0x93, 0x94, 0x9D, 0x9A, 39, 0x20, 41, 46, 59, 60, 53, 50, 0x1F, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 0x6F, 104, 97, 102, 0x73, 0x74, 0x7D, 0x7A, 0x89, 0x8E, 0x87, 0x80, 0x95, 0x92, 0x9B, 0x9C, 0xB1, 0xB6, 0xBF, 0xB8, 0xAD, 170, 0xA3, 0xA4, 0xF9, 0xFE, 0xF7, 0xF0, 0xE5, 0xE2, 0xEB, 0xEC, 0xC1, 0xC6, 0xCF, 200, 0xDD, 0xDA, 0xD3, 0xD4, 105, 110, 103, 0x60, 0x75, 0x72, 0x7B, 0x7C, 81, 86, 0x5F, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 0x2F, 40, 61, 58, 51, 52, 78, 73, 0x40, 71, 82, 85, 92, 91, 0x76, 0x71, 120, 0x7F, 106, 109, 100, 99, 62, 57, 0x30, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 0xAE, 0xA9, 0xA0, 0xA7, 0xB2, 0xB5, 0xBC, 0xBB, 150, 0x91, 0x98, 0x9F, 0x8A, 0x8D, 0x84, 0x83, 0xDE, 0xD9, 0xD0, 0xD7, 0xC2, 0xC5, 204, 203, 230, 0xE1, 0xE8, 0xEF, 0xFA, 0xFD, 0xF4, 0xF3};
    }

    @UnstableApi
    public static boolean A(@Nullable SparseArray sparseArray0, @Nullable SparseArray sparseArray1) {
        if(sparseArray0 == null) {
            return sparseArray1 == null;
        }
        if(sparseArray1 == null) {
            return false;
        }
        if(Util.a >= 0x1F) {
            return sparseArray0.contentEquals(sparseArray1);
        }
        int v = sparseArray0.size();
        if(v != sparseArray1.size()) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseArray0.keyAt(v1);
            if(!Objects.equals(sparseArray0.valueAt(v1), sparseArray1.get(v2))) {
                return false;
            }
        }
        return true;
    }

    @UnstableApi
    public static Format A0(int v, int v1, int v2) {
        return new Builder().o0("audio/raw").N(v1).p0(v2).i0(v).K();
    }

    @Deprecated
    public static boolean A1(Activity activity0, MediaItem[] arr_mediaItem) {
        return Util.C1(activity0, arr_mediaItem);
    }

    @Nullable
    @UnstableApi
    public static String A2(String s) {
        int v = s.length();
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            if(s.charAt(v2) == 37) {
                ++v3;
            }
        }
        if(v3 == 0) {
            return s;
        }
        int v4 = v - v3 * 2;
        StringBuilder stringBuilder0 = new StringBuilder(v4);
        Matcher matcher0 = Util.k.matcher(s);
        while(v3 > 0 && matcher0.find()) {
            int v5 = (char)Integer.parseInt(((String)Assertions.g(matcher0.group(1))), 16);
            stringBuilder0.append(s, v1, matcher0.start());
            stringBuilder0.append(((char)v5));
            v1 = matcher0.end();
            --v3;
        }
        if(v1 < v) {
            stringBuilder0.append(s, v1, v);
        }
        return stringBuilder0.length() == v4 ? stringBuilder0.toString() : null;
    }

    @UnstableApi
    public static int B(SparseArray sparseArray0) {
        if(Util.a >= 0x1F) {
            return sparseArray0.contentHashCode();
        }
        int v = 17;
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            v = (v * 0x1F + sparseArray0.keyAt(v1)) * 0x1F + Objects.hashCode(sparseArray0.valueAt(v1));
        }
        return v;
    }

    @UnstableApi
    public static Format B0(AudioFormat audioProcessor$AudioFormat0) {
        return Util.A0(audioProcessor$AudioFormat0.c, audioProcessor$AudioFormat0.b, audioProcessor$AudioFormat0.a);
    }

    private static boolean B1(Activity activity0, Uri uri0) {
        if(!Util.k1(activity0, uri0)) {
            return false;
        }
        return Util.a >= 33 ? Util.X1(activity0) : Util.W1(activity0);
    }

    @UnstableApi
    public static long B2(long v) {
        return v == 0x8000000000000001L || v == 0x8000000000000000L ? v : v / 1000L;
    }

    @UnstableApi
    public static int C(byte[] arr_b, int v, int v1, int v2) {
        while(v < v1) {
            int v3 = u.p(arr_b[v]);
            v2 = Util.D(v3 & 15, Util.D(v3 >> 4, v2));
            ++v;
        }
        return v2;
    }

    @UnstableApi
    public static int C0(int v, int v1) {
        switch(v) {
            case 3: {
                return v1;
            }
            case 2: 
            case 0x10000000: {
                return v1 * 2;
            }
            case 21: 
            case 0x50000000: {
                return v1 * 3;
            }
            case 4: 
            case 22: 
            case 0x60000000: {
                return v1 * 4;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public static boolean C1(Activity activity0, MediaItem[] arr_mediaItem) {
        if(Util.a < 23) {
            return false;
        }
        for(int v = 0; v < arr_mediaItem.length; ++v) {
            MediaItem mediaItem0 = arr_mediaItem[v];
            LocalConfiguration mediaItem$LocalConfiguration0 = mediaItem0.b;
            if(mediaItem$LocalConfiguration0 != null) {
                if(Util.B1(activity0, mediaItem$LocalConfiguration0.a)) {
                    return true;
                }
                O2 o20 = mediaItem0.b.g;
                for(int v1 = 0; v1 < o20.size(); ++v1) {
                    if(Util.B1(activity0, ((SubtitleConfiguration)o20.get(v1)).a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @UnstableApi
    public static void C2(Parcel parcel0, boolean z) {
        parcel0.writeInt(((int)z));
    }

    private static int D(int v, int v1) {
        return (Util.s[(v ^ v1 >> 12 & 0xFF) & 0xFF] ^ v1 << 4 & 0xFFFF) & 0xFFFF;
    }

    @UnstableApi
    public static long D0(long v, float f) {
        return f == 1.0f ? v : Math.round(((double)v) / ((double)f));
    }

    @UnstableApi
    public static long D1(SparseLongArray sparseLongArray0) {
        if(sparseLongArray0.size() == 0) {
            throw new NoSuchElementException();
        }
        long v = 0x7FFFFFFFFFFFFFFFL;
        for(int v1 = 0; v1 < sparseLongArray0.size(); ++v1) {
            v = Math.min(v, sparseLongArray0.valueAt(v1));
        }
        return v;
    }

    @UnstableApi
    public static int E(byte[] arr_b, int v, int v1, int v2) {
        while(v < v1) {
            v2 = Util.r[(v2 >>> 24 ^ arr_b[v] & 0xFF) & 0xFF] ^ v2 << 8;
            ++v;
        }
        return v2;
    }

    @UnstableApi
    public static List E0(int v) {
        List list0 = new ArrayList();
        if((v & 1) != 0) {
            list0.add("main");
        }
        if((v & 2) != 0) {
            list0.add("alt");
        }
        if((v & 4) != 0) {
            list0.add("supplementary");
        }
        if((v & 8) != 0) {
            list0.add("commentary");
        }
        if((v & 16) != 0) {
            list0.add("dub");
        }
        if((v & 0x20) != 0) {
            list0.add("emergency");
        }
        if((v & 0x40) != 0) {
            list0.add("caption");
        }
        if((v & 0x80) != 0) {
            list0.add("subtitle");
        }
        if((v & 0x100) != 0) {
            list0.add("sign");
        }
        if((v & 0x200) != 0) {
            list0.add("describes-video");
        }
        if((v & 0x400) != 0) {
            list0.add("describes-music");
        }
        if((v & 0x800) != 0) {
            list0.add("enhanced-intelligibility");
        }
        if((v & 0x1000) != 0) {
            list0.add("transcribes-dialog");
        }
        if((v & 0x2000) != 0) {
            list0.add("easy-read");
        }
        if((v & 0x4000) != 0) {
            list0.add("trick-play");
        }
        return list0;
    }

    @UnstableApi
    public static void E1(List list0, int v, int v1, int v2) {
        ArrayDeque arrayDeque0 = new ArrayDeque();
        for(int v3 = v1 - v - 1; v3 >= 0; --v3) {
            arrayDeque0.addFirst(list0.remove(v + v3));
        }
        list0.addAll(Math.min(v2, list0.size()), arrayDeque0);
    }

    @UnstableApi
    public static int F(byte[] arr_b, int v, int v1, int v2) {
        while(v < v1) {
            v2 = Util.t[v2 ^ arr_b[v] & 0xFF];
            ++v;
        }
        return v2;
    }

    @UnstableApi
    public static List F0(int v) {
        List list0 = new ArrayList();
        if((v & 4) != 0) {
            list0.add("auto");
        }
        if((v & 1) != 0) {
            list0.add("default");
        }
        if((v & 2) != 0) {
            list0.add("forced");
        }
        return list0;
    }

    @UnstableApi
    public static long F1(long v) [...] // 潜在的解密器

    @UnstableApi
    public static Handler G(Looper looper0, @Nullable Handler.Callback handler$Callback0) {
        return new Handler(looper0, handler$Callback0);
    }

    @UnstableApi
    public static int G0(int v) {
        if(v != 13) {
            switch(v) {
                case 2: {
                    return 0;
                }
                case 3: {
                    return 8;
                }
                case 4: {
                    return 4;
                }
                case 6: {
                    return 2;
                }
                case 5: 
                case 7: 
                case 8: 
                case 9: 
                case 10: {
                    return 5;
                }
                default: {
                    return 3;
                }
            }
        }
        return 1;
    }

    @UnstableApi
    public static ExecutorService G1(String s) {
        return Executors.newSingleThreadExecutor((Runnable runnable0) -> new Thread(runnable0, s));
    }

    @UnstableApi
    public static Handler H() {
        return Util.I(null);
    }

    @UnstableApi
    public static String H0(StringBuilder stringBuilder0, Formatter formatter0, long v) {
        long v1 = v == 0x8000000000000001L ? 0L : v;
        String s = v1 >= 0L ? "" : "-";
        long v2 = (Math.abs(v1) + 500L) / 1000L;
        long v3 = v2 / 60L % 60L;
        stringBuilder0.setLength(0);
        return v2 / 3600L <= 0L ? formatter0.format("%s%02d:%02d", s, v3, ((long)(v2 % 60L))).toString() : formatter0.format("%s%d:%02d:%02d", s, ((long)(v2 / 3600L)), v3, ((long)(v2 % 60L))).toString();
    }

    @UnstableApi
    public static ScheduledExecutorService H1(String s) {
        return Executors.newSingleThreadScheduledExecutor((Runnable runnable0) -> new Thread(runnable0, s));
    }

    @UnstableApi
    public static Handler I(@Nullable Handler.Callback handler$Callback0) {
        return Util.G(((Looper)Assertions.k(Looper.myLooper())), handler$Callback0);
    }

    @UnstableApi
    public static String[] I0() {
        String[] arr_s = Util.J0();
        for(int v = 0; v < arr_s.length; ++v) {
            arr_s[v] = Util.I1(arr_s[v]);
        }
        return arr_s;
    }

    @UnstableApi
    public static String I1(String s) {
        if(s == null) {
            return null;
        }
        String s1 = s.replace('_', '-');
        if(!s1.isEmpty() && !s1.equals("und")) {
            s = s1;
        }
        String s2 = c.g(s);
        String s3 = Util.n2(s2, "-")[0];
        if(Util.o == null) {
            Util.o = Util.L();
        }
        String s4 = (String)Util.o.get(s3);
        if(s4 != null) {
            s2 = s4 + s2.substring(s3.length());
            s3 = s4;
        }
        return !"no".equals(s3) && !"i".equals(s3) && !"zh".equals(s3) ? s2 : Util.y1(s2);
    }

    @UnstableApi
    public static Handler J() {
        return Util.K(null);
    }

    private static String[] J0() {
        Configuration configuration0 = Resources.getSystem().getConfiguration();
        return Util.a < 24 ? new String[]{Util.u0(configuration0.locale)} : Util.K0(configuration0);
    }

    @UnstableApi
    public static Object[] J1(Object[] arr_object, Object object0) {
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 1);
        arr_object1[arr_object.length] = object0;
        return arr_object1;
    }

    @UnstableApi
    public static Handler K(@Nullable Handler.Callback handler$Callback0) {
        return Util.G(Util.k0(), handler$Callback0);
    }

    @RequiresApi(24)
    private static String[] K0(Configuration configuration0) {
        return Util.m2(configuration0.getLocales().toLanguageTags(), ",");
    }

    @UnstableApi
    public static Object[] K1(Object[] arr_object, Object[] arr_object1) {
        Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object.length + arr_object1.length);
        System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
        return arr_object2;
    }

    private static HashMap L() {
        String[] arr_s = Locale.getISOLanguages();
        HashMap hashMap0 = new HashMap(arr_s.length + Util.p.length);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            try {
                String s1 = new Locale(s).getISO3Language();
                if(!TextUtils.isEmpty(s1)) {
                    hashMap0.put(s1, s);
                }
            }
            catch(MissingResourceException unused_ex) {
            }
        }
        for(int v = 0; true; v += 2) {
            String[] arr_s1 = Util.p;
            if(v >= arr_s1.length) {
                break;
            }
            hashMap0.put(arr_s1[v], arr_s1[v + 1]);
        }
        return hashMap0;
    }

    @Nullable
    private static String L0(String s) {
        try {
            Class class0 = Class.forName("android.os.SystemProperties");
            return (String)class0.getMethod("get", String.class).invoke(class0, s);
        }
        catch(Exception exception0) {
            Log.e("Util", "Failed to read system property " + s, exception0);
            return null;
        }
    }

    @UnstableApi
    public static Object[] L1(Object[] arr_object, int v) {
        Assertions.a(v <= arr_object.length);
        return Arrays.copyOf(arr_object, v);
    }

    @UnstableApi
    public static ByteBuffer M(ByteBuffer byteBuffer0) {
        return byteBuffer0.asReadOnlyBuffer().order(byteBuffer0.order());
    }

    @UnstableApi
    public static String M0(int v) {
        switch(v) {
            case -2: {
                return "none";
            }
            case -1: {
                return "unknown";
            }
            case 0: {
                return "default";
            }
            case 1: {
                return "audio";
            }
            case 2: {
                return "video";
            }
            case 3: {
                return "text";
            }
            case 4: {
                return "image";
            }
            case 5: {
                return "metadata";
            }
            case 6: {
                return "camera motion";
            }
            default: {
                return v < 10000 ? "?" : "custom (" + v + ")";
            }
        }
    }

    @UnstableApi
    public static Object[] M1(Object[] arr_object, int v, int v1) {
        boolean z = false;
        Assertions.a(v >= 0);
        if(v1 <= arr_object.length) {
            z = true;
        }
        Assertions.a(z);
        return Arrays.copyOfRange(arr_object, v, v1);
    }

    @UnstableApi
    public static File N(Context context0, String s) throws IOException {
        File file0 = Util.O(context0, s);
        file0.delete();
        file0.mkdir();
        return file0;
    }

    @UnstableApi
    public static String N0(Context context0, String s) {
        String s1 = "?";
        try {
            s1 = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return s + "/" + s1 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + "AndroidXMedia3/1.4.1";
    }

    @UnstableApi
    public static void N1(List list0, Object[] arr_object) {
        Assertions.i(list0.size() == arr_object.length);
        list0.toArray(arr_object);
    }

    @UnstableApi
    public static File O(Context context0, String s) throws IOException {
        return File.createTempFile(s, null, ((File)Assertions.g(context0.getCacheDir())));
    }

    @UnstableApi
    public static byte[] O0(String s) [...] // 潜在的解密器

    @UnstableApi
    public static long O1(String s) throws ParserException {
        int v = 0;
        Matcher matcher0 = Util.i.matcher(s);
        if(!matcher0.matches()) {
            throw ParserException.a(("Invalid date/time format: " + s), null);
        }
        if(matcher0.group(9) != null && !matcher0.group(9).equalsIgnoreCase("Z")) {
            v = Integer.parseInt(matcher0.group(12)) * 60 + Integer.parseInt(matcher0.group(13));
            if("-".equals(matcher0.group(11))) {
                v = -v;
            }
        }
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar0.clear();
        gregorianCalendar0.set(Integer.parseInt(matcher0.group(1)), Integer.parseInt(matcher0.group(2)) - 1, Integer.parseInt(matcher0.group(3)), Integer.parseInt(matcher0.group(4)), Integer.parseInt(matcher0.group(5)), Integer.parseInt(matcher0.group(6)));
        if(!TextUtils.isEmpty(matcher0.group(8))) {
            gregorianCalendar0.set(14, new BigDecimal("0." + matcher0.group(8)).movePointRight(3).intValue());
        }
        long v1 = gregorianCalendar0.getTimeInMillis();
        return v == 0 ? v1 : v1 - ((long)v) * 60000L;
    }

    @UnstableApi
    public static long P(long v, int v1) {
        return Util.c2(v, v1, 1000000L, RoundingMode.CEILING);
    }

    @UnstableApi
    public static byte[] P0(byte[] arr_b) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0)) {
            gZIPOutputStream0.write(arr_b);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new IllegalStateException(iOException0);
        }
    }

    @UnstableApi
    public static long P1(String s) {
        Matcher matcher0 = Util.j.matcher(s);
        if(matcher0.matches()) {
            boolean z = TextUtils.isEmpty(matcher0.group(1));
            String s1 = matcher0.group(3);
            double f = 0.0;
            double f1 = s1 == null ? 0.0 : Double.parseDouble(s1) * 31556908.0;
            String s2 = matcher0.group(5);
            double f2 = s2 == null ? 0.0 : Double.parseDouble(s2) * 2629739.0;
            String s3 = matcher0.group(7);
            double f3 = s3 == null ? 0.0 : Double.parseDouble(s3) * 86400.0;
            String s4 = matcher0.group(10);
            double f4 = s4 == null ? 0.0 : Double.parseDouble(s4) * 3600.0;
            String s5 = matcher0.group(12);
            double f5 = s5 == null ? 0.0 : Double.parseDouble(s5) * 60.0;
            String s6 = matcher0.group(14);
            if(s6 != null) {
                f = Double.parseDouble(s6);
            }
            long v = (long)((f1 + f2 + f3 + f4 + f5 + f) * 1000.0);
            return z ? v : -v;
        }
        return (long)(Double.parseDouble(s) * 3600000.0);
    }

    @UnstableApi
    public static String Q(String s) {
        int v = s.length();
        int v1 = 0;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            if(Util.h2(s.charAt(v2))) {
                ++v3;
            }
        }
        if(v3 == 0) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v3 * 2 + v);
        while(v3 > 0) {
            int v4 = s.charAt(v1);
            if(Util.h2(((char)v4))) {
                stringBuilder0.append('%');
                stringBuilder0.append(Integer.toHexString(v4));
                --v3;
            }
            else {
                stringBuilder0.append(((char)v4));
            }
            ++v1;
        }
        if(v1 < v) {
            stringBuilder0.append(s, v1, v);
        }
        return stringBuilder0.toString();
    }

    public static boolean Q0(@Nullable Player player0) {
        if(player0 != null && player0.v0(1)) {
            player0.pause();
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean Q1(Handler handler0, Runnable runnable0) {
        if(!handler0.getLooper().getThread().isAlive()) {
            return false;
        }
        if(handler0.getLooper() == Looper.myLooper()) {
            runnable0.run();
            return true;
        }
        return handler0.post(runnable0);
    }

    @UnstableApi
    public static Uri R(Uri uri0) {
        String s = uri0.getPath();
        if(s == null) {
            return uri0;
        }
        Matcher matcher0 = Util.l.matcher(s);
        return !matcher0.matches() || matcher0.group(1) != null ? uri0 : Uri.withAppendedPath(uri0, "Manifest");
    }

    public static boolean R0(@Nullable Player player0) {
        boolean z = false;
        if(player0 == null) {
            return false;
        }
        int v = player0.b();
        if(v == 1 && player0.v0(2)) {
            player0.n();
            z = true;
        }
        else if(v == 4 && player0.v0(4)) {
            player0.r1();
            z = true;
        }
        if(player0.v0(1)) {
            player0.c();
            return true;
        }
        return z;
    }

    @UnstableApi
    public static t0 R1(Handler handler0, Runnable runnable0, Object object0) {
        t0 t00 = O0.F();
        Util.Q1(handler0, () -> try {
            if(((O0)t00).isCancelled()) {
                return;
            }
            runnable0.run();
            ((O0)t00).B(object0);
        }
        catch(Throwable throwable0) {
            ((O0)t00).C(throwable0);
        });
        return t00;
    }

    @UnstableApi
    public static String S(String s, Object[] arr_object) [...] // 潜在的解密器

    public static boolean S0(@Nullable Player player0) {
        return Util.T0(player0, true);
    }

    @UnstableApi
    public static boolean S1(Parcel parcel0) {
        return parcel0.readInt() != 0;
    }

    @UnstableApi
    public static String T(byte[] arr_b) {
        return new String(arr_b, f.c);
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public static boolean T0(@Nullable Player player0, boolean z) {
        return Util.j2(player0, z) ? Util.R0(player0) : Util.Q0(player0);
    }

    @UnstableApi
    public static void T1(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                Util.T1(arr_file[v]);
            }
        }
        file0.delete();
    }

    @UnstableApi
    public static String U(byte[] arr_b, int v, int v1) {
        return new String(arr_b, v, v1, f.c);
    }

    public static int U0(Uri uri0) {
        String s = uri0.getScheme();
        if(s != null && c.a("rtsp", s)) {
            return 3;
        }
        String s1 = uri0.getLastPathSegment();
        if(s1 == null) {
            return 4;
        }
        int v = s1.lastIndexOf(46);
        if(v >= 0) {
            int v1 = Util.X0(s1.substring(v + 1));
            if(v1 != 4) {
                return v1;
            }
        }
        CharSequence charSequence0 = (CharSequence)Assertions.g(uri0.getPath());
        Matcher matcher0 = Util.l.matcher(charSequence0);
        if(matcher0.matches()) {
            String s2 = matcher0.group(2);
            if(s2 != null) {
                if(s2.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return s2.contains("format=m3u8-aapl") ? 2 : 1;
            }
            return 1;
        }
        return 4;
    }

    @Nullable
    @UnstableApi
    public static Intent U1(Context context0, @Nullable BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        return Util.a >= 33 ? context0.registerReceiver(broadcastReceiver0, intentFilter0, 4) : context0.registerReceiver(broadcastReceiver0, intentFilter0);
    }

    @RequiresApi(21)
    @UnstableApi
    public static int V(Context context0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        return audioManager0 == null ? -1 : audioManager0.generateAudioSessionId();
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    @Deprecated
    public static int V0(Uri uri0, @Nullable String s) {
        return TextUtils.isEmpty(s) ? Util.U0(uri0) : Util.X0(s);
    }

    @UnstableApi
    public static void V1(List list0, int v, int v1) {
        if(v < 0 || v1 > list0.size() || v > v1) {
            throw new IllegalArgumentException();
        }
        if(v != v1) {
            list0.subList(v, v1).clear();
        }
    }

    @Nullable
    public static String W(int v) {
        switch(v) {
            case 0: {
                return "application/dash+xml";
            }
            case 1: {
                return "application/vnd.ms-sstr+xml";
            }
            case 2: {
                return "application/x-mpegURL";
            }
            default: {
                return null;
            }
        }
    }

    @UnstableApi
    @Deprecated
    public static int W0(String s) {
        return Util.U0(Uri.parse(("file:///" + s)));
    }

    @RequiresApi(api = 23)
    private static boolean W1(Activity activity0) {
        if(activity0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            activity0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
            return true;
        }
        return false;
    }

    @UnstableApi
    public static int X(int v) {
        if(v != 20) {
            switch(v) {
                case 2: 
                case 3: {
                    return 3;
                }
                case 4: 
                case 5: 
                case 6: {
                    return 21;
                }
                case 7: 
                case 8: {
                    return 23;
                }
                case 14: {
                    return 25;
                }
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 15: 
                case 16: 
                case 17: 
                case 18: {
                    return 28;
                }
                case 22: {
                    return 0x1F;
                }
                case 30: {
                    return 34;
                }
                default: {
                    return 0x7FFFFFFF;
                }
            }
        }
        return 30;
    }

    public static int X0(String s) {
        String s1 = c.g(s);
        s1.hashCode();
        switch(s1) {
            case "ism": {
                return 1;
            }
            case "isml": {
                return 1;
            }
            case "m3u8": {
                return 2;
            }
            case "mpd": {
                return 0;
            }
            default: {
                return 4;
            }
        }
    }

    @RequiresApi(api = 33)
    private static boolean X1(Activity activity0) {
        if(activity0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity0.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity0.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity0.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @UnstableApi
    @Deprecated
    public static int Y(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 4;
            }
            default: {
                return v == 2 || v == 4 || (v == 5 || v == 8) ? 4 : 2;
            }
        }
    }

    public static int Y0(Uri uri0, @Nullable String s) {
        if(s == null) {
            return Util.U0(uri0);
        }
        switch(s) {
            case "application/dash+xml": {
                return 0;
            }
            case "application/vnd.ms-sstr+xml": {
                return 1;
            }
            case "application/x-mpegURL": {
                return 2;
            }
            case "application/x-rtsp": {
                return 3;
            }
            default: {
                return 4;
            }
        }
    }

    @UnstableApi
    public static long Y1(long v, int v1) {
        return Util.c2(v, 1000000L, v1, RoundingMode.FLOOR);
    }

    @RequiresApi(21)
    @UnstableApi
    public static android.media.AudioFormat Z(int v, int v1, int v2) {
        return new AudioFormat.Builder().setSampleRate(v).setChannelMask(v1).setEncoding(v2).build();
    }

    @UnstableApi
    public static boolean Z0(ParsableByteArray parsableByteArray0, ParsableByteArray parsableByteArray1, @Nullable Inflater inflater0) {
        if(parsableByteArray0.a() <= 0) {
            return false;
        }
        if(parsableByteArray1.b() < parsableByteArray0.a()) {
            parsableByteArray1.c(parsableByteArray0.a() * 2);
        }
        if(inflater0 == null) {
            inflater0 = new Inflater();
        }
        inflater0.setInput(parsableByteArray0.e(), parsableByteArray0.f(), parsableByteArray0.a());
        int v = 0;
        try {
            while(true) {
                v += inflater0.inflate(parsableByteArray1.e(), v, parsableByteArray1.b() - v);
                if(inflater0.finished()) {
                    break;
                }
                if(inflater0.needsDictionary() || inflater0.needsInput()) {
                    return false;
                }
                if(v == parsableByteArray1.b()) {
                    parsableByteArray1.c(parsableByteArray1.b() * 2);
                }
            }
            parsableByteArray1.X(v);
            return true;
        }
        catch(DataFormatException unused_ex) {
            return false;
        }
        finally {
            inflater0.reset();
        }
    }

    @UnstableApi
    public static long Z1(long v, long v1, long v2) {
        return Util.c2(v, v1, v2, RoundingMode.FLOOR);
    }

    @SuppressLint({"InlinedApi"})
    @UnstableApi
    public static int a0(int v) {
        switch(v) {
            case 1: {
                return 4;
            }
            case 2: {
                return 12;
            }
            case 3: {
                return 28;
            }
            case 4: {
                return 204;
            }
            case 5: {
                return 220;
            }
            case 6: {
                return 0xFC;
            }
            case 7: {
                return 0x4FC;
            }
            case 8: {
                return 0x18FC;
            }
            case 10: {
                return Util.a < 0x20 ? 0x18FC : 0xB40FC;
            }
            case 12: {
                return 0xB58FC;
            }
            default: {
                return 0;
            }
        }
    }

    @UnstableApi
    public static String a1(int v) [...] // 潜在的解密器

    @UnstableApi
    public static long[] a2(List list0, long v, long v1) {
        return Util.e2(list0, v, v1, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static int b0(int v) {
        int v1 = 4;
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 13;
                }
                case 2: {
                    return 6;
                label_6:
                    v1 = 5;
                    switch(v) {
                        case 5: {
                            return v1;
                        }
                        case 8: {
                            return 3;
                        }
                        default: {
                            return 1;
                        }
                    }
                }
                case 4: {
                    return v1;
                }
                default: {
                    goto label_6;
                }
            }
        }
        return 2;
    }

    private static boolean b1(Activity activity0, Uri uri0) {
        String s3;
        String s1;
        try {
            String s = uri0.getPath();
            if(s == null) {
                return false;
            }
            s1 = new File(s).getCanonicalPath();
            String s2 = activity0.getFilesDir().getCanonicalPath();
            s3 = null;
            File file0 = activity0.getExternalFilesDir(null);
            if(file0 != null) {
                s3 = file0.getCanonicalPath();
            }
            if(s1.startsWith(s2)) {
                return true;
            }
        }
        catch(IOException unused_ex) {
            return false;
        }
        return s3 == null ? false : s1.startsWith(s3);
    }

    @UnstableApi
    public static void b2(long[] arr_v, long v, long v1) {
        Util.f2(arr_v, v, v1, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static Commands c0(Player player0, Commands player$Commands0) {
        boolean z = player0.W();
        boolean z1 = player0.V0();
        boolean z2 = player0.Z1();
        boolean z3 = player0.t0();
        boolean z4 = player0.j1();
        boolean z5 = player0.L1();
        boolean z6 = player0.O1().w();
        boolean z7 = false;
        androidx.media3.common.Player.Commands.Builder player$Commands$Builder0 = new androidx.media3.common.Player.Commands.Builder().b(player$Commands0).e(4, !z).e(5, z1 && !z).e(6, z2 && !z).e(7, !z6 && (z2 || !z4 || z1) && !z).e(8, z3 && !z).e(9, !z6 && (z3 || z4 && z5) && !z).e(10, !z).e(11, z1 && !z);
        if(z1 && !z) {
            z7 = true;
        }
        return player$Commands$Builder0.e(12, z7).f();
    }

    @UnstableApi
    public static boolean c1(Context context0) {
        return Util.a >= 23 && context0.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @UnstableApi
    public static long c2(long v, long v1, long v2, RoundingMode roundingMode0) {
        if(v != 0L && v1 != 0L) {
            int v3 = Long.compare(v2, v1);
            if(v3 >= 0 && v2 % v1 == 0L) {
                return h.g(v, h.g(v2, v1, RoundingMode.UNNECESSARY), roundingMode0);
            }
            if(v3 < 0 && v1 % v2 == 0L) {
                return h.y(v, h.g(v1, v2, RoundingMode.UNNECESSARY));
            }
            int v4 = Long.compare(v2, v);
            if(v4 >= 0 && v2 % v == 0L) {
                return h.g(v1, h.g(v2, v, RoundingMode.UNNECESSARY), roundingMode0);
            }
            return v4 >= 0 || v % v2 != 0L ? Util.d2(v, v1, v2, roundingMode0) : h.y(v1, h.g(v, v2, RoundingMode.UNNECESSARY));
        }
        return 0L;
    }

    @UnstableApi
    public static int d0(ByteBuffer byteBuffer0, int v) {
        int v1 = byteBuffer0.getInt(v);
        return byteBuffer0.order() == ByteOrder.BIG_ENDIAN ? v1 : Integer.reverseBytes(v1);
    }

    @UnstableApi
    public static boolean d1(String s) {
        s.hashCode();
        switch(s) {
            case "image/avif": {
                return Util.a >= 34;
            }
            case "image/bmp": {
                return true;
            }
            case "image/heic": {
                return Util.a >= 26;
            }
            case "image/heif": {
                return Util.a >= 26;
            }
            case "image/jpeg": {
                return true;
            }
            case "image/png": {
                return true;
            }
            case "image/webp": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static long d2(long v, long v1, long v2, RoundingMode roundingMode0) {
        long v3 = h.y(v, v1);
        if(v3 != 0x7FFFFFFFFFFFFFFFL && v3 != 0x8000000000000000L) {
            return h.g(v3, v2, roundingMode0);
        }
        long v4 = h.k(Math.abs(v1), Math.abs(v2));
        RoundingMode roundingMode1 = RoundingMode.UNNECESSARY;
        long v5 = h.g(v1, v4, roundingMode1);
        long v6 = h.g(v2, v4, roundingMode1);
        long v7 = h.k(Math.abs(v), Math.abs(v6));
        long v8 = h.g(v, v7, roundingMode1);
        long v9 = h.g(v6, v7, roundingMode1);
        long v10 = h.y(v8, v5);
        if(v10 != 0x7FFFFFFFFFFFFFFFL && v10 != 0x8000000000000000L) {
            return h.g(v10, v9, roundingMode0);
        }
        double f = ((double)v8) * (((double)v5) / ((double)v9));
        if(f > 9223372036854776000.0) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return f < -9223372036854776000.0 ? 0x8000000000000000L : com.google.common.math.c.q(f, roundingMode0);
    }

    @UnstableApi
    public static byte[] e0(String s) {
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            arr_b[v1] = (byte)((Character.digit(s.charAt(v1 * 2), 16) << 4) + Character.digit(s.charAt(v1 * 2 + 1), 16));
        }
        return arr_b;
    }

    @UnstableApi
    public static boolean e1(int v) {
        return v == 4 || v == 21 || v == 22 || v == 0x50000000 || v == 0x60000000;
    }

    @UnstableApi
    public static long[] e2(List list0, long v, long v1, RoundingMode roundingMode0) {
        int v10;
        int v2 = list0.size();
        long[] arr_v = new long[v2];
        if(v == 0L) {
            return arr_v;
        }
        int v3 = 0;
        int v4 = Long.compare(v1, v);
        if(v4 >= 0 && v1 % v == 0L) {
            long v5 = h.g(v1, v, RoundingMode.UNNECESSARY);
            while(v3 < v2) {
                arr_v[v3] = h.g(((long)(((Long)list0.get(v3)))), v5, roundingMode0);
                ++v3;
            }
            return arr_v;
        }
        if(v4 < 0 && v % v1 == 0L) {
            long v6 = h.g(v, v1, RoundingMode.UNNECESSARY);
            while(v3 < v2) {
                arr_v[v3] = h.y(((long)(((Long)list0.get(v3)))), v6);
                ++v3;
            }
            return arr_v;
        }
        for(int v7 = 0; v7 < v2; v7 = v10 + 1) {
            long v8 = (long)(((Long)list0.get(v7)));
            if(v8 != 0L) {
                int v9 = Long.compare(v1, v8);
                if(v9 < 0 || v1 % v8 != 0L) {
                    if(v9 >= 0 || v8 % v1 != 0L) {
                        v10 = v7;
                        arr_v[v10] = Util.d2(v8, v, v1, roundingMode0);
                    }
                    else {
                        arr_v[v7] = h.y(v, h.g(v8, v1, RoundingMode.UNNECESSARY));
                        v10 = v7;
                    }
                    continue;
                }
                else {
                    arr_v[v7] = h.g(v, h.g(v1, v8, RoundingMode.UNNECESSARY), roundingMode0);
                }
            }
            v10 = v7;
        }
        return arr_v;
    }

    @UnstableApi
    public static long f(long v, long v1, long v2) {
        long v3 = v + v1;
        return ((v ^ v3) & (v1 ^ v3)) >= 0L ? v3 : v2;
    }

    @UnstableApi
    public static int f0(@Nullable String s, int v) {
        String[] arr_s = Util.o2(s);
        int v2 = 0;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(v == MimeTypes.o(arr_s[v1])) {
                ++v2;
            }
        }
        return v2;
    }

    @UnstableApi
    public static boolean f1(int v) {
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 21: 
            case 22: 
            case 0x10000000: 
            case 0x50000000: 
            case 0x60000000: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @UnstableApi
    public static void f2(long[] arr_v, long v, long v1, RoundingMode roundingMode0) {
        if(v == 0L) {
            Arrays.fill(arr_v, 0L);
            return;
        }
        int v2 = 0;
        int v3 = Long.compare(v1, v);
        if(v3 >= 0 && v1 % v == 0L) {
            long v4 = h.g(v1, v, RoundingMode.UNNECESSARY);
            while(v2 < arr_v.length) {
                arr_v[v2] = h.g(arr_v[v2], v4, roundingMode0);
                ++v2;
            }
            return;
        }
        if(v3 < 0 && v % v1 == 0L) {
            long v5 = h.g(v, v1, RoundingMode.UNNECESSARY);
            while(v2 < arr_v.length) {
                arr_v[v2] = h.y(arr_v[v2], v5);
                ++v2;
            }
            return;
        }
        for(int v6 = 0; v6 < arr_v.length; ++v6) {
            long v7 = arr_v[v6];
            if(v7 != 0L) {
                if(v1 >= v7 && v1 % v7 == 0L) {
                    arr_v[v6] = h.g(v, h.g(v1, v7, RoundingMode.UNNECESSARY), roundingMode0);
                }
                else if(v1 >= v7 || v7 % v1 != 0L) {
                    arr_v[v6] = Util.d2(v7, v, v1, roundingMode0);
                }
                else {
                    arr_v[v6] = h.y(v, h.g(v7, v1, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    @UnstableApi
    public static boolean g(@Nullable Object object0, @Nullable Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    @Nullable
    @UnstableApi
    public static String g0(@Nullable String s, int v) {
        String[] arr_s = Util.o2(s);
        if(arr_s.length == 0) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            if(v == MimeTypes.o(s1)) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(s1);
            }
        }
        return stringBuilder0.length() <= 0 ? null : stringBuilder0.toString();
    }

    // 去混淆评级： 低(30)
    @UnstableApi
    public static boolean g1(Context context0) {
        return Util.a < 29 || Util.a == 30 && (c.a(Util.d, "moto g(20)") || c.a(Util.d, "rmx3231"));
    }

    @UnstableApi
    public static void g2(Service service0, int v, Notification notification0, int v1, String s) {
        if(Util.a >= 29) {
            Api29.a(service0, v, notification0, v1, s);
            return;
        }
        service0.startForeground(v, notification0);
    }

    @UnstableApi
    public static int h(List list0, Comparable comparable0, boolean z, boolean z1) {
        int v1;
        int v = Collections.binarySearch(list0, comparable0);
        if(v < 0) {
            v1 = ~v;
            return z1 ? Math.min(list0.size() - 1, v1) : v1;
        }
        int v2 = list0.size();
        while(v + 1 < v2 && ((Comparable)list0.get(v + 1)).compareTo(comparable0) == 0) {
            ++v;
        }
        v1 = z ? v : v + 1;
        return z1 ? Math.min(list0.size() - 1, v1) : v1;
    }

    @UnstableApi
    public static String h0(@Nullable Context context0) {
        if(context0 != null) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
            if(telephonyManager0 != null) {
                String s = telephonyManager0.getNetworkCountryIso();
                return TextUtils.isEmpty(s) ? c.j(Locale.getDefault().getCountry()) : c.j(s);
            }
        }
        return c.j(Locale.getDefault().getCountry());
    }

    @UnstableApi
    public static boolean h1(int v) {
        return v == 10 || v == 13;
    }

    private static boolean h2(char c) {
        switch(c) {
            case 34: 
            case 37: 
            case 42: 
            case 0x2F: 
            case 58: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 92: 
            case 0x7C: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @UnstableApi
    public static int i(int[] arr_v, int v, boolean z, boolean z1) {
        int v2;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            v2 = ~v1;
            return z1 ? Math.min(arr_v.length - 1, v2) : v2;
        }
        while(v1 + 1 < arr_v.length && arr_v[v1 + 1] == v) {
            ++v1;
        }
        v2 = z ? v1 : v1 + 1;
        return z1 ? Math.min(arr_v.length - 1, v2) : v2;
    }

    @UnstableApi
    public static Point i0(Context context0) {
        DisplayManager displayManager0 = (DisplayManager)context0.getSystemService("display");
        Display display0 = displayManager0 == null ? null : displayManager0.getDisplay(0);
        if(display0 == null) {
            display0 = ((WindowManager)Assertions.g(((WindowManager)context0.getSystemService("window")))).getDefaultDisplay();
        }
        return Util.j0(context0, display0);
    }

    @UnstableApi
    public static boolean i1(Uri uri0) {
        String s = uri0.getScheme();
        return TextUtils.isEmpty(s) || "file".equals(s);
    }

    @e(expression = {"#1"}, result = false)
    public static boolean i2(@Nullable Player player0) {
        return Util.j2(player0, true);
    }

    @UnstableApi
    public static int j(long[] arr_v, long v, boolean z, boolean z1) {
        int v2;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            v2 = ~v1;
            return z1 ? Math.min(arr_v.length - 1, v2) : v2;
        }
        while(v1 + 1 < arr_v.length && arr_v[v1 + 1] == v) {
            ++v1;
        }
        v2 = z ? v1 : v1 + 1;
        return z1 ? Math.min(arr_v.length - 1, v2) : v2;
    }

    @UnstableApi
    public static Point j0(Context context0, Display display0) {
        if(display0.getDisplayId() == 0 && Util.n1(context0)) {
            String s = Util.a >= 28 ? Util.L0("vendor.display-size") : Util.L0("sys.display-size");
            if(!TextUtils.isEmpty(s)) {
                try {
                    String[] arr_s = Util.m2(s.trim(), "x");
                    if(arr_s.length == 2) {
                        int v = Integer.parseInt(arr_s[0]);
                        int v1 = Integer.parseInt(arr_s[1]);
                        if(v > 0 && v1 > 0) {
                            return new Point(v, v1);
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
                Log.d("Util", "Invalid display size: " + s);
            }
            if("Sony".equals(Util.c) && Util.d.startsWith("BRAVIA") && context0.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(0xF00, 0x870);
            }
        }
        Point point0 = new Point();
        if(Util.a >= 23) {
            Util.n0(display0, point0);
            return point0;
        }
        display0.getRealSize(point0);
        return point0;
    }

    private static boolean j1(Uri uri0) {
        if("content".equals(uri0.getScheme()) && "media".equals(uri0.getAuthority())) {
            List list0 = uri0.getPathSegments();
            if(list0.isEmpty()) {
                return false;
            }
            String s = (String)list0.get(0);
            return "external".equals(s) || "external_primary".equals(s);
        }
        return false;
    }

    @UnstableApi
    @e(expression = {"#1"}, result = false)
    public static boolean j2(@Nullable Player player0, boolean z) {
        if(player0 != null && player0.D0()) {
            switch(player0.b()) {
                case 1: 
                case 4: {
                    break;
                }
                default: {
                    return z && player0.N1() != 0;
                }
            }
        }
        return true;
    }

    @UnstableApi
    public static int k(LongArray longArray0, long v, boolean z, boolean z1) {
        int v1 = longArray0.c() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            if(longArray0.b(v3) < v) {
                v2 = v3 + 1;
            }
            else {
                v1 = v3 - 1;
            }
        }
        if(z && v1 + 1 < longArray0.c() && longArray0.b(v1 + 1) == v) {
            return v1 + 1;
        }
        return z1 && v1 == -1 ? 0 : v1;
    }

    @UnstableApi
    public static Looper k0() {
        Looper looper0 = Looper.myLooper();
        return looper0 == null ? Looper.getMainLooper() : looper0;
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean k1(Activity activity0, Uri uri0) {
        if(Util.a < 23) {
            return false;
        }
        return Util.i1(uri0) ? !Util.b1(activity0, uri0) : Util.j1(uri0);
    }

    @UnstableApi
    public static void k2(Throwable throwable0) {
        Util.l2(throwable0);
    }

    @UnstableApi
    public static int l(List list0, Comparable comparable0, boolean z, boolean z1) {
        int v1;
        int v = Collections.binarySearch(list0, comparable0);
        if(v < 0) {
            v1 = -(v + 2);
            return z1 ? Math.max(0, v1) : v1;
        }
        while(v - 1 >= 0 && ((Comparable)list0.get(v - 1)).compareTo(comparable0) == 0) {
            --v;
        }
        v1 = z ? v : v - 1;
        return z1 ? Math.max(0, v1) : v1;
    }

    @UnstableApi
    public static Uri l0(String s, String s1) {
        return Uri.parse(("data:" + s + ";base64," + Base64.encodeToString(s1.getBytes(), 2)));
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public static boolean l1() {
        String s = c.g(Util.b);
        return s.contains("emulator") || s.contains("emu64a") || s.contains("emu64x") || s.contains("generic");
    }

    private static void l2(Throwable throwable0) throws Throwable {
        throw throwable0;
    }

    @UnstableApi
    public static int m(int[] arr_v, int v, boolean z, boolean z1) {
        int v2;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            v2 = -(v1 + 2);
            return z1 ? Math.max(0, v2) : v2;
        }
        while(v1 - 1 >= 0 && arr_v[v1 - 1] == v) {
            --v1;
        }
        v2 = z ? v1 : v1 - 1;
        return z1 ? Math.max(0, v2) : v2;
    }

    @UnstableApi
    public static Locale m0() {
        return Util.a < 24 ? Locale.getDefault() : Locale.getDefault(Locale.Category.DISPLAY);
    }

    // 去混淆评级： 低(20)
    @RequiresApi(api = 24)
    private static boolean m1(Uri uri0) {
        return "http".equals(uri0.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(((String)Assertions.g(uri0.getHost())));
    }

    @UnstableApi
    public static String[] m2(String s, String s1) {
        return s.split(s1, -1);
    }

    @UnstableApi
    public static int n(long[] arr_v, long v, boolean z, boolean z1) {
        int v2;
        int v1 = Arrays.binarySearch(arr_v, v);
        if(v1 < 0) {
            v2 = -(v1 + 2);
            return z1 ? Math.max(0, v2) : v2;
        }
        while(v1 - 1 >= 0 && arr_v[v1 - 1] == v) {
            --v1;
        }
        v2 = z ? v1 : v1 - 1;
        return z1 ? Math.max(0, v2) : v2;
    }

    @RequiresApi(23)
    private static void n0(Display display0, Point point0) {
        Display.Mode display$Mode0 = display0.getMode();
        point0.x = display$Mode0.getPhysicalWidth();
        point0.y = display$Mode0.getPhysicalHeight();
    }

    @UnstableApi
    public static boolean n1(Context context0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getApplicationContext().getSystemService("uimode");
        return uiModeManager0 != null && uiModeManager0.getCurrentModeType() == 4;
    }

    @UnstableApi
    public static String[] n2(String s, String s1) {
        return s.split(s1, 2);
    }

    @UnstableApi
    @d({"#1"})
    public static Object o(@Nullable Object object0) [...] // Inlined contents

    @UnstableApi
    public static Drawable o0(Context context0, Resources resources0, @DrawableRes int v) {
        return Util.a < 21 ? resources0.getDrawable(v) : Api21.a(context0, resources0, v);
    }

    @UnstableApi
    public static boolean o1(Context context0) {
        return Util.a >= 20 && context0.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public static String[] o2(@Nullable String s) {
        return TextUtils.isEmpty(s) ? new String[0] : Util.m2(s.trim(), "(\\s*,\\s*)");
    }

    @UnstableApi
    @d({"#1"})
    public static Object[] p(Object[] arr_object) [...] // Inlined contents

    @Nullable
    public static UUID p0(String s) {
        String s1 = c.g(s);
        s1.hashCode();
        switch(s1) {
            case "clearkey": {
                return C.i2;
            }
            case "playready": {
                return C.k2;
            }
            case "widevine": {
                return C.j2;
            }
            default: {
                try {
                    return UUID.fromString(s);
                }
                catch(RuntimeException unused_ex) {
                    return null;
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static Thread p1(String s, Runnable runnable0) [...]

    @Nullable
    @UnstableApi
    public static ComponentName p2(Context context0, Intent intent0) {
        return Util.a < 26 ? context0.startService(intent0) : context0.startForegroundService(intent0);
    }

    @UnstableApi
    public static int q(int v, int v1) [...] // Inlined contents

    @UnstableApi
    public static int q0(int v) {
        switch(v) {
            case 8: 
            case 15: {
                return 6003;
            }
            case 2: 
            case 4: 
            case 7: 
            case 16: 
            case 18: {
                return 6005;
            }
            case 10: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            default: {
                return v == 24 || v == 25 || v == 26 || v == 27 || v == 28 ? 6002 : 6006;
            }
        }
    }

    // 检测为 Lambda 实现
    private static Thread q1(String s, Runnable runnable0) [...]

    @UnstableApi
    public static long q2(long v, long v1, long v2) {
        long v3 = v - v1;
        return ((v ^ v3) & (v1 ^ v)) >= 0L ? v3 : v2;
    }

    @UnstableApi
    public static long r(long v, long v1) [...] // Inlined contents

    @UnstableApi
    public static int r0(@Nullable String s) {
        int v = 0;
        if(s == null) {
            return 0;
        }
        String[] arr_s = Util.m2(s, "_");
        if(arr_s.length < 2) {
            return 0;
        }
        String s1 = arr_s[arr_s.length - 1];
        boolean z = arr_s.length >= 3 && "neg".equals(arr_s[arr_s.length - 2]);
        try {
            v = Integer.parseInt(((String)Assertions.g(s1)));
            if(z) {
                return -v;
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        return v;
    }

    // 检测为 Lambda 实现
    private static void r1(O0 o00, Runnable runnable0, Object object0) [...]

    @UnstableApi
    public static long r2(long[] arr_v) {
        long v = 0L;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            v += arr_v[v1];
        }
        return v;
    }

    public static boolean s(MediaItem[] arr_mediaItem) {
        if(Util.a < 24) {
            return true;
        }
        for(int v = 0; v < arr_mediaItem.length; ++v) {
            MediaItem mediaItem0 = arr_mediaItem[v];
            LocalConfiguration mediaItem$LocalConfiguration0 = mediaItem0.b;
            if(mediaItem$LocalConfiguration0 != null) {
                if(Util.m1(mediaItem$LocalConfiguration0.a)) {
                    return false;
                }
                for(int v1 = 0; v1 < mediaItem0.b.g.size(); ++v1) {
                    if(Util.m1(((SubtitleConfiguration)mediaItem0.b.g.get(v1)).a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @UnstableApi
    public static String s0(int v) {
        switch(v) {
            case 0: {
                return "NO";
            }
            case 1: {
                return "NO_UNSUPPORTED_TYPE";
            }
            case 2: {
                return "NO_UNSUPPORTED_DRM";
            }
            case 3: {
                return "NO_EXCEEDS_CAPABILITIES";
            }
            case 4: {
                return "YES";
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    // 检测为 Lambda 实现
    private static void s1(O0 o00, t0 t00) [...]

    @UnstableApi
    public static boolean s2(SQLiteDatabase sQLiteDatabase0, String s) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase0, "sqlite_master", "tbl_name = ?", new String[]{s}) > 0L;
    }

    @UnstableApi
    public static void t(@Nullable Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @UnstableApi
    public static int t0(String s) {
        int v = s.length();
        Assertions.a(v <= 4);
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = v2 << 8 | s.charAt(v1);
        }
        return v2;
    }

    // 检测为 Lambda 实现
    private static void t1(t0 t00, O0 o00, w w0) [...]

    @UnstableApi
    public static byte[] t2(float f) {
        return l.E(Float.floatToIntBits(f));
    }

    @UnstableApi
    public static int u(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 == 0 ? 0 : 1;
    }

    @UnstableApi
    public static String u0(Locale locale0) {
        return Util.a < 21 ? locale0.toString() : Util.v0(locale0);
    }

    @UnstableApi
    public static int u1(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @UnstableApi
    @Deprecated
    public static byte[] u2(InputStream inputStream0) throws IOException {
        return com.google.common.io.h.u(inputStream0);
    }

    @UnstableApi
    public static float v(float f, float f1, float f2) {
        return Math.max(f1, Math.min(f, f2));
    }

    @RequiresApi(21)
    private static String v0(Locale locale0) {
        return locale0.toLanguageTag();
    }

    @UnstableApi
    public static int v1(long[] arr_v, long v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @UnstableApi
    public static byte[] v2(int[] arr_v) {
        byte[] arr_b = new byte[arr_v.length * 4];
        int v1 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v2 = arr_v[v];
            arr_b[v1] = (byte)(v2 >> 24);
            arr_b[v1 + 1] = (byte)(v2 >> 16);
            int v3 = v1 + 3;
            arr_b[v1 + 2] = (byte)(v2 >> 8);
            v1 += 4;
            arr_b[v3] = (byte)v2;
        }
        return arr_b;
    }

    @UnstableApi
    public static int w(int v, int v1, int v2) {
        return Math.max(v1, Math.min(v, v2));
    }

    // 去混淆评级： 低(20)
    @UnstableApi
    public static int w0(Context context0) {
        return Util.g1(context0) ? 1 : 5;
    }

    @UnstableApi
    public static String w1(Context context0, String s) throws IOException {
        InputStream inputStream0;
        try {
            inputStream0 = context0.getAssets().open(s);
            return Util.T(com.google.common.io.h.u(inputStream0));
        }
        finally {
            Util.t(inputStream0);
        }
    }

    @UnstableApi
    public static String w2(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(Character.forDigit(arr_b[v] >> 4 & 15, 16));
            stringBuilder0.append(Character.forDigit(arr_b[v] & 15, 16));
        }
        return stringBuilder0.toString();
    }

    @UnstableApi
    public static long x(long v, long v1, long v2) {
        return Math.max(v1, Math.min(v, v2));
    }

    @UnstableApi
    public static long x0(long v, float f) {
        return f == 1.0f ? v : Math.round(((double)v) * ((double)f));
    }

    @UnstableApi
    public static long x1(SparseLongArray sparseLongArray0) {
        if(sparseLongArray0.size() == 0) {
            throw new NoSuchElementException();
        }
        long v = 0x8000000000000000L;
        for(int v1 = 0; v1 < sparseLongArray0.size(); ++v1) {
            v = Math.max(v, sparseLongArray0.valueAt(v1));
        }
        return v;
    }

    @UnstableApi
    public static long x2(int v, int v1) [...] // Inlined contents

    @UnstableApi
    public static boolean y(SparseArray sparseArray0, int v) {
        return sparseArray0.indexOfKey(v) >= 0;
    }

    @UnstableApi
    public static long y0(long v) {
        return v == 0x8000000000000001L ? System.currentTimeMillis() : v + SystemClock.elapsedRealtime();
    }

    private static String y1(String s) {
        for(int v = 0; true; v += 2) {
            String[] arr_s = Util.q;
            if(v >= arr_s.length) {
                break;
            }
            if(s.startsWith(arr_s[v])) {
                return arr_s[v + 1] + s.substring(arr_s[v].length());
            }
        }
        return s;
    }

    @UnstableApi
    public static long y2(int v) [...] // Inlined contents

    @UnstableApi
    public static boolean z(Object[] arr_object, @Nullable Object object0) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(Util.g(arr_object[v], object0)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static int z0(int v) {
        switch(v) {
            case 8: {
                return 3;
            }
            case 16: {
                return 2;
            }
            case 24: {
                return 21;
            }
            case 0x20: {
                return 22;
            }
            default: {
                return 0;
            }
        }
    }

    @Deprecated
    public static boolean z1(Activity activity0, Uri[] arr_uri) {
        for(int v = 0; v < arr_uri.length; ++v) {
            if(Util.B1(activity0, arr_uri[v])) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static t0 z2(t0 t00, w w0) {
        t0 t01 = O0.F();
        ((O0)t01).addListener(() -> if(((O0)t01).isCancelled()) {
            t00.cancel(false);
        }, C0.c());
        t00.addListener(() -> {
            Object object0;
            try {
                object0 = h0.j(t00);
            }
            catch(CancellationException unused_ex) {
                ((O0)t01).cancel(false);
                return;
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 != null) {
                    executionException0 = throwable0;
                }
                ((O0)t01).C(executionException0);
                return;
            }
            catch(RuntimeException | Error runtimeException0) {
                ((O0)t01).C(runtimeException0);
                return;
            }
            try {
                ((O0)t01).D(w0.apply(object0));
            }
            catch(Throwable throwable1) {
                ((O0)t01).C(throwable1);
            }
        }, C0.c());
        return t01;
    }
}

