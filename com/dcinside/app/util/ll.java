package com.dcinside.app.util;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dcinside.app.type.I;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class ll {
    public interface a {
        void a(SharedPreferences arg1, int arg2, int arg3);
    }

    private static final String A = "CheerShowMillis";
    private static final String B = "ADK";
    private static final String C = "ADT";
    private static final String D = "NotificationGuideRequire";
    private static final String E = "NotificationGuideRequire2";
    private static final String F = "NotificationGuideRequire3";
    private static final String G = "NotificationGuideRequire4";
    @Deprecated
    private static final String H = "CoverImgPath";
    @Deprecated
    private static final String I = "CookieClearTimeMillis";
    public static final String J = "TotalSearchPostFilter";
    private static final String K = "InputLastVoiceModeRecord";
    private static final String L = "ArchiveLastChooseMode";
    @Deprecated
    private static final String M = "PostFilterRewardDate";
    @Deprecated
    private static final String N = "PostFilterUsedDate";
    public static SharedPreferences a = null;
    private static final String b = "OldVersion";
    @Deprecated
    private static final String c = "LastNoticeNumber";
    private static final String d = "LastNoticeDate_";
    private static final String e = "DefaultSearchType";
    private static final String f = "KeyboardHeight";
    private static final String g = "AutoLoginEnabled";
    private static final String h = "SimpleLoginEnabled";
    @Deprecated
    private static final String i = "PostWriteSettingEnabled";
    @Deprecated
    private static final String j = "ReplySettingEnabled";
    @Deprecated
    private static final String k = "PostHeader";
    @Deprecated
    private static final String l = "PostFooter";
    @Deprecated
    private static final String m = "ReplySuffix";
    @Deprecated
    private static final String n = "BestBoxHidden";
    public static final String o = "ReadImageHideCount";
    private static final String p = "StatusBar";
    private static final String q = "DownloadDir";
    public static final String r = "MenuIsExpandedRecent";
    public static final String s = "MenuIsExpandedFavorite";
    @Deprecated
    private static final String t = "IgnoreNotice";
    @Deprecated
    private static final String u = "JjalbangPath";
    private static final String v = "DownloadType";
    private static final String w = "GuideAppLink";
    private static final String x = "ReplyAlert";
    private static final String y = "NotificationEffect";
    private static final String z = "RequestedPermissions";

    public static void A(boolean z) {
        ll.a.edit().putBoolean("NotificationGuideRequire2", z).apply();
    }

    @Deprecated
    public static boolean A0() {
        return ll.a.getBoolean("BestBoxHidden", true);
    }

    public static boolean B() {
        return ll.a.getBoolean("NotificationGuideRequire2", true);
    }

    public static void B0(@NonNull SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        ll.a.unregisterOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    public static void C(boolean z) {
        ll.a.edit().putBoolean("NotificationGuideRequire3", z).apply();
    }

    public static boolean D() {
        return ll.a.getBoolean("NotificationGuideRequire3", true);
    }

    public static void E(boolean z) {
        ll.a.edit().putBoolean("NotificationGuideRequire4", z).apply();
    }

    public static boolean F() {
        return ll.a.getBoolean("NotificationGuideRequire4", true);
    }

    @Deprecated
    public static long G() {
        return ll.a.getLong("IgnoreNotice", 0L);
    }

    @Deprecated
    public static void H(long v) {
        ll.a.edit().putLong("IgnoreNotice", v).apply();
    }

    public static void I(Context context0) {
        ll.a = context0.getSharedPreferences("save", 0);
    }

    public static boolean J() {
        return ll.a.getBoolean("AutoLoginEnabled", true);
    }

    public static boolean K() {
        return ll.a.getBoolean("InputLastVoiceModeRecord", true);
    }

    public static boolean L() {
        return Math.abs(System.currentTimeMillis() - ll.a.getLong("GuideAppLink", 0L)) > TimeUnit.DAYS.toMillis(1L);
    }

    public static boolean M() {
        return ll.a.getBoolean("TotalSearchPostFilter", true);
    }

    @Deprecated
    public static boolean N() {
        return ll.a.getBoolean("PostWriteSettingEnabled", true);
    }

    @Deprecated
    public static boolean O() {
        return ll.a.getBoolean("ReplySettingEnabled", true);
    }

    public static boolean P() {
        return ll.a.getBoolean("SimpleLoginEnabled", true);
    }

    public static void Q(@NonNull SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        ll.a.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    public static void R(boolean z) {
        ll.a.edit().putBoolean("MenuIsExpandedFavorite", z).apply();
    }

    public static boolean S() {
        return ll.a.getBoolean("MenuIsExpandedFavorite", false);
    }

    public static void T(boolean z) {
        ll.a.edit().putBoolean("MenuIsExpandedRecent", z).apply();
    }

    public static boolean U() {
        return ll.a.getBoolean("MenuIsExpandedRecent", false);
    }

    public static void V(int v, a ll$a0) {
        int v1 = ll.Y();
        if(v1 < v) {
            ll$a0.a(ll.a, v1, v);
            ll.Z(v);
        }
    }

    public static int W() {
        return ll.a.getInt("NotificationEffect", 1);
    }

    public static void X(int v) {
        ll.a.edit().putInt("NotificationEffect", v).apply();
    }

    public static int Y() {
        return ll.a.getInt("OldVersion", 0);
    }

    public static void Z(int v) {
        ll.a.edit().putInt("OldVersion", v).apply();
    }

    public static long a() {
        return ll.a.getLong("ADT", 0L);
    }

    public static int a0() {
        return ll.a.getInt("ReadImageHideCount", 0x7FFFFFFF);
    }

    public static void b(long v) {
        ll.a.edit().putLong("ADT", v).apply();
    }

    public static void b0(int v) {
        ll.a.edit().putInt("ReadImageHideCount", v).apply();
    }

    public static String c() {
        return ll.a.getString("ADK", null);
    }

    public static void c0(boolean z) {
        ll.a.edit().putBoolean("ReplyAlert", z).apply();
    }

    public static void d(String s) {
        ll.a.edit().putString("ADK", s).apply();
    }

    public static boolean d0() {
        return ll.a.getBoolean("ReplyAlert", true);
    }

    public static long e() {
        return ll.a.getLong("CheerShowMillis", 0L);
    }

    @Nullable
    public static String e0() {
        return ll.a.getString("RequestedPermissions", null);
    }

    public static void f(long v) {
        ll.a.edit().putLong("CheerShowMillis", v).apply();
    }

    public static void f0(String s) {
        try {
            HashSet hashSet0 = new HashSet();
            String s1 = ll.e0();
            if(s1 != null && s1.length() > 0) {
                Collections.addAll(hashSet0, s1.split(":"));
            }
            hashSet0.add(s);
            ll.a.edit().putString("RequestedPermissions", TextUtils.join(":", hashSet0)).apply();
        }
        catch(Exception unused_ex) {
            ll.a.edit().putString("RequestedPermissions", "").apply();
        }
    }

    public static long g() {
        return ll.a.getLong("CookieClearTimeMillis", 0L);
    }

    public static void g0(int v) {
        ll.a.edit().putInt("ArchiveLastChooseMode", v).apply();
    }

    public static void h(long v) {
        ll.a.edit().putLong("CookieClearTimeMillis", v).apply();
    }

    public static void h0(boolean z) {
        ll.a.edit().putBoolean("AutoLoginEnabled", z).apply();
    }

    public static String i() {
        String s = ll.a.getString("DownloadDir", null);
        if(s == null) {
            s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            ll.a.edit().putString("DownloadDir", s).apply();
        }
        return s;
    }

    @Deprecated
    public static void i0(String s) {
        ll.a.edit().putString("CoverImgPath", s).apply();
    }

    public static void j(String s) {
        ll.a.edit().putString("DownloadDir", s).apply();
    }

    @Deprecated
    public static void j0(String s) {
        ll.a.edit().putString("JjalbangPath", s).apply();
    }

    public static void k(boolean z) {
        ll.a.edit().putBoolean("DownloadType", z).apply();
    }

    public static void k0(I i0) {
        ll.a.edit().putString("DefaultSearchType", i0.e()).apply();
    }

    public static boolean l() {
        return ll.a.getBoolean("DownloadType", true);
    }

    public static void l0() {
        ll.a.edit().putLong("GuideAppLink", System.currentTimeMillis()).apply();
    }

    public static int m() {
        return ll.a.getInt("ArchiveLastChooseMode", 0);
    }

    public static void m0(boolean z) {
        ll.a.edit().putBoolean("InputLastVoiceModeRecord", z).apply();
    }

    @Nullable
    @Deprecated
    public static String n() {
        return ll.a.getString("CoverImgPath", null);
    }

    public static void n0(int v) {
        ll.a.edit().putInt("KeyboardHeight", v).apply();
    }

    @Nullable
    @Deprecated
    public static String o() {
        return ll.a.getString("JjalbangPath", null);
    }

    public static void o0(String s, long v) {
        ll.a.edit().putLong("LastNoticeDate_" + s, v).apply();
    }

    @Nullable
    public static String p() {
        return ll.a.getString("DefaultSearchType", null);
    }

    @Deprecated
    public static void p0(String s, int v) {
        ll.a.edit().putInt(String.format("%s_%s", "LastNoticeNumber", s), v).apply();
    }

    // 去混淆评级： 低(20)
    public static int q() {
        return ll.a.getInt("KeyboardHeight", 0);
    }

    public static void q0(boolean z) {
        ll.a.edit().putBoolean("TotalSearchPostFilter", z).apply();
    }

    public static long r(String s) {
        return ll.a.getLong("LastNoticeDate_" + s, -1L);
    }

    @Deprecated
    public static void r0(String s) {
        ll.a.edit().putString("PostFooter", s).apply();
    }

    @Deprecated
    public static int s(String s) {
        return ll.a.getInt(String.format("%s_%s", "LastNoticeNumber", s), -1);
    }

    @Deprecated
    public static void s0(String s) {
        ll.a.edit().putString("PostHeader", s).apply();
    }

    @Deprecated
    public static String t() {
        return ll.a.getString("PostFooter", " - dc official App");
    }

    @Deprecated
    public static void t0(boolean z) {
        ll.a.edit().putBoolean("PostWriteSettingEnabled", z).apply();
    }

    @Deprecated
    public static String u() {
        return ll.a.getString("PostHeader", "");
    }

    public static void u0(boolean z) {
        ll.a.edit().putBoolean("RecentExpand", z).apply();
    }

    public static boolean v() {
        return ll.a.getBoolean("RecentExpand", false);
    }

    @Deprecated
    public static void v0(boolean z) {
        ll.a.edit().putBoolean("ReplySettingEnabled", z).apply();
    }

    @Deprecated
    public static String w() {
        return ll.a.getString("ReplySuffix", " - dc App");
    }

    @Deprecated
    public static void w0(String s) {
        ll.a.edit().putString("ReplySuffix", s).apply();
    }

    public static boolean x() {
        return ll.a.getBoolean("StatusBar", true);
    }

    public static void x0(boolean z) {
        ll.a.edit().putBoolean("SimpleLoginEnabled", z).apply();
    }

    public static void y(boolean z) {
        ll.a.edit().putBoolean("NotificationGuideRequire", z).apply();
    }

    public static void y0(boolean z) {
        ll.a.edit().putBoolean("StatusBar", z).apply();
    }

    public static boolean z() {
        return ll.a.getBoolean("NotificationGuideRequire", true);
    }

    @Deprecated
    public static void z0(boolean z) {
        ll.a.edit().putBoolean("BestBoxHidden", z).apply();
    }
}

