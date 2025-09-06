package com.dcinside.app.read.capture;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.text.SpannableStringBuilder;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.c;
import com.dcinside.app.model.J;
import com.dcinside.app.model.Mention;
import com.dcinside.app.model.Q;
import com.dcinside.app.read.C;
import com.dcinside.app.read.Q0;
import com.dcinside.app.read.x;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.response.j;
import com.dcinside.app.span.g;
import com.dcinside.app.type.t;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.vk;
import com.dcinside.app.wv.B;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.dcinside.app.wv.r;
import com.dcinside.app.wv.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import m0.a;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nCapturePdf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturePdf.kt\ncom/dcinside/app/read/capture/CapturePdf\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 ModelExtension.kt\ncom/dcinside/app/internal/ModelExtensionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n31#2:456\n12#3:457\n295#4,2:458\n1#5:460\n*S KotlinDebug\n*F\n+ 1 CapturePdf.kt\ncom/dcinside/app/read/capture/CapturePdf\n*L\n55#1:456\n185#1:457\n185#1:458,2\n*E\n"})
public final class b {
    @l
    public static final b a;

    static {
        b.a = new b();
    }

    public static final String e(b b0, String s) {
        return "<div style=\'text-align:center;color:#A0A0A0; padding-bottom:5px\'>" + s + "</div>";
    }

    private final String g(Context context0, x x0, int v) {
        String s10;
        String s9;
        String s8;
        String s7;
        String s4;
        String s5;
        String s2;
        String s1;
        int v1 = x0.getItemViewType(v);
        C c0 = x0.Q(v);
        L.o(c0, "getItem(...)");
        j j0 = c0.g();
        boolean z = j0 == null ? false : j0.i0();
        if(j0 == null) {
            s1 = "";
        }
        else {
            String s = j0.R();
            s1 = s == null || s.length() <= 0 ? "" : "(" + a.a.m(j0.R(), ".*") + ")";
        }
        if(z) {
            s2 = 10000018 == v1 ? "<img src=\'file:///android_res/drawable/ico_reply_under_pdf\' width=\'14px\' height=\'14px\' style=\'float:left; padding-top:10px;\'/>" : "<img src=\'file:///android_res/drawable/ico_reply_under_pdf\' width=\'14px\' height=\'14px\' style=\'float:left;\'/>";
        }
        else {
            s2 = "";
        }
        if(j0 == null) {
        label_22:
            if(j0 == null) {
                s5 = "";
            }
            else {
                s5 = t.c.m(j0).n();
                if(s5 == null) {
                    s5 = "";
                }
            }
            s4 = s5.length() <= 0 ? "" : "<img src=\'file:///android_res/drawable/" + s5 + "\' width=\'10\' height=\'10\'/>";
        }
        else {
            String s3 = j0.T();
            if(s3 != null && s3.length() > 0) {
                s4 = "<img src=\'" + j0.T() + "\' height=\'15\'/>";
                goto label_29;
            }
            goto label_22;
        }
    label_29:
        String s6 = null;
        Mention mention0 = j0 == null ? null : j0.W();
        if(mention0 == null) {
            s7 = s4;
            s8 = s2;
            s9 = "";
        }
        else {
            boolean z1 = J.a(mention0);
            s7 = s4;
            s8 = s2;
            SpannableStringBuilder spannableStringBuilder0 = g.w(context0, Q0.d, "", "", "", z1);
            switch(c0.j()) {
                case 10000005: 
                case 10000006: {
                    s9 = "<span><a style=\'color:" + c.i(vk.b(context0, 0x7F0401F8)) + ";\'>" + spannableStringBuilder0 + "</a></span><br/>";  // attr:dcBodyLinkColor
                    break;
                }
                case 10000004: 
                case 10000022: {
                    s9 = "<br/><span><a style=\'color:" + c.i(vk.b(context0, 0x7F0401F8)) + ";\'>" + spannableStringBuilder0 + "</a></span>";  // attr:dcBodyLinkColor
                    break;
                }
                default: {
                    s9 = "<span><a style=\'color:" + c.i(vk.b(context0, 0x7F0401F8)) + ";\'>" + spannableStringBuilder0 + "</a></span>";  // attr:dcBodyLinkColor
                }
            }
        }
        switch(v1) {
            case 10000004: {
                SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder();
                L.m(j0);
                spannableStringBuilder1.append(v.p(("\n                    <div style=\"clear:both;\">" + s8 + "<div style=\"padding-left:" + (z ? 20 : 0) + "px;\">\n                    <span><a>" + j0.X() + "</a>" + s7 + "<font size=\"2px\" color=\"#A0A0A0\">" + s1 + "</font></span>\n                    " + s9 + "\n                    <br/>\n                    <img style=\"padding-top:2px;padding-bottom:2px; display: inline-block;\" src=\"" + "" + "\" width=\"100\" height=\"100\"/>\n                    ")));
                if(j0.N().h() != null) {
                    if(j0.N().h() != null) {
                        s6 = "";
                    }
                    spannableStringBuilder1.append(v.p(("\n                        <img style=\"padding-top:2px;padding-bottom:2px; display: inline-block;\" src=\"" + s6 + "\" width=\"100\" height=\"100\"/>\n                        ")));
                }
                spannableStringBuilder1.append(v.p(("\n                    <br/>\n                    <span><font size=\"2px\" color=\"#A0A0A0\">" + j0.I() + " " + "" + "</font></span>\n                    </div>\n                    </div>\n                    <hr size=\"1\" color=\"#dcdcdc\">\n                    ")));
                s10 = spannableStringBuilder1.toString();
                L.m(s10);
                return s10;
            }
            case 10000005: 
            case 10000006: {
                L.m(j0);
                return v.p(("\n                <div style=\"clear:both;\">" + s8 + "<div style=\"padding-left:" + (z ? 20 : 0) + "px;\">\n                <span><a>" + j0.X() + "</a>" + s7 + "<font size=\"2px\" color=\"#A0A0A0\">" + s1 + "</font></span>\n                <br/>\n                " + s9 + "\n                <span style=\'padding-top:10px; padding-bottom:10px; display: inline-block;\'>" + c0.i() + "</span>\n                <br/>\n                " + c0.b() + "\n                <br/>\n                <span><font size=\"2px\" color=\"#A0A0A0\">" + j0.I() + " " + "" + "</font></span>\n                </div>\n                </div>\n                <hr size=\"1\" color=\"#dcdcdc\">\n                "));
            }
            case 10000007: {
                L.m(j0);
                return v.p(("\n                <div style=\"clear:both;\">" + s8 + "<div style=\"padding-left:" + (z ? 20 : 0) + "px;\">\n                <span><a>" + j0.X() + "</a>" + s7 + "<font size=\"2px\" color=\"#A0A0A0\">" + s1 + "</font></span>\n                <br/>\n                " + s9 + "\n                <span style=\'padding-top:10px; padding-bottom:10px; display: inline-block;\'>" + j0.V() + "</span>\n                <br/>\n                <div><font size=\"2px\" color=\"#A0A0A0\">" + j0.I() + " " + "" + "</font></span>\n                </div>\n                </div>\n                <hr size=\"1\" color=\"#dcdcdc\">\n                "));
            }
            case 10000009: 
            case 10000010: {
                String s11 = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F040158) & 0xFFFFFF))}, 1));  // attr:colorPrimary
                L.o(s11, "format(...)");
                com.dcinside.app.read.C.c c$c0 = c0.h() == null ? new com.dcinside.app.read.C.c(0, 0, 0, 7, null) : c0.h();
                String s12 = context0.getString(0x7F150752, new Object[]{c$c0.a(), c$c0.c()});  // string:pages "%1$d / %2$d"
                L.o(s12, "getString(...)");
                return v.p(("\n                <div style=\"margin-right:30px\"><a>댓글 " + c$c0.b() + "</a> \n                <a style=\"border-radius:2px; float:right; background-color:" + s11 + ";padding:2px 6px;\">\n                <font color=\"#F9F9F9\" style=\"vertical-align:middle;\">" + s12 + "</font></a></div>\n                <hr size=\"1\" style=\"clear:both;\" color=\"#dcdcdc\">\n                "));
            }
            case 10000018: {
                L.m(j0);
                return v.p(("\n                <div style=\"clear:both;\">" + s8 + "<div style=\"padding-left:" + (z ? 20 : 0) + "px;\">\n                <span style=\'padding-top:10px; padding-bottom:10px; display: inline-block;\'><font color=\"#A0A0A0\">" + j0.O() + "</font></span>\n                </div>\n                </div>\n                <hr size=\"1\" color=\"#dcdcdc\">\n                "));
            }
            case 10000022: {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                L.m(j0);
                spannableStringBuilder2.append(v.p(("\n                    <div style=\"clear:both;\">" + s8 + "<div style=\"padding-left:" + (z ? 20 : 0) + "px;\">\n                    <span><a>" + j0.X() + "</a>" + s7 + "<font size=\"2px\" color=\"#A0A0A0\">" + s1 + "</font></span>\n                    " + s9 + "\n                    <br/>\n                    <img style=\"padding-top:2px;padding-bottom:2px; display: inline-block;\" src=\"" + j0.L() + "\" width=\"150\" height=\"150\"/>\n                    ")));
                if(j0.N().h() != null) {
                    if(j0.N().h() != null) {
                        s6 = "";
                    }
                    spannableStringBuilder2.append(v.p(("\n                        <img style=\"padding-top:2px;padding-bottom:2px; display: inline-block;\" src=\"" + s6 + "\" width=\"150\" height=\"150\"/>\n                        ")));
                }
                spannableStringBuilder2.append(v.p(("\n                    <br/>\n                    <span><font size=\"2px\" color=\"#A0A0A0\">" + j0.I() + " " + "" + "</font></span>\n                    </div>\n                    </div>\n                    <hr size=\"1\" color=\"#dcdcdc\">\n                    ")));
                s10 = spannableStringBuilder2.toString();
                L.m(s10);
                return s10;
            }
            default: {
                return "";
            }
        }
    }

    private final String h(Context context0, Q q0) {
        int[] arr_v;
        String s = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F040160) & 0xFFFFFF))}, 1));  // attr:colorPrimaryText
        L.o(s, "format(...)");
        String s1 = q0 == null ? null : q0.X0();
        if(q0 == null) {
            arr_v = new int[]{0, 0, 0};
        }
        else {
            arr_v = q0.R0();
            if(arr_v == null) {
                return Q.n0.d(q0) ? v.p(("\n               </br>\n               <div style=\"padding-left:10px; padding-top:5px; padding-bottom:5px\"><span>" + s1 + " 님의 <font color=\"" + c.i(vk.b(context0, 0x7F0401F8)) + "\">[작성글 검색]</font></span></div>\n               <div class=\"box_wrapper pdfcf\">\n               <table style=\"height:35px; margin:auto;\">\n               <tr>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 3px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_like_recommend_tinted" + "\" width=\"32px\" height=\"32px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:7px; margin-right:10px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               <span style=\"display:inline-block; padding-top: 5px; padding-bottom:5px; \">\n                 <img src=\"file:///android_res/drawable/icon_nick1\" width=\"13px\" height=\"13px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:5px; margin-right:8px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               </td>\n               <td width=\"10px\"><div style=\"display: block;\"></div></td>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 6px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_dislike_normal" + "\" width=\"25px\" height=\"25px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:10px; margin-right:10px; vertical-align:-5px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               </td>\n               </tr>\n               </table>\n               </div>\n               <hr size=\"1\" color=\"#dcdcdc\">\n               ")) : v.p(("\n               </br>\n               <div style=\"padding-left:10px; padding-top:5px; padding-bottom:5px\"><span>" + s1 + " 님의 <font color=\"" + c.i(vk.b(context0, 0x7F0401F8)) + "\">[작성글 검색]</font></span></div>\n               <div class=\"box_wrapper pdfcf\">\n               <table style=\"height:35px; margin:auto;\">\n               <tr>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 3px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_like_normal_tinted" + "\" width=\"32px\" height=\"32px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:7px; margin-right:10px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               <span style=\"display:inline-block; padding-top: 5px; padding-bottom:5px; \">\n                 <img src=\"file:///android_res/drawable/icon_nick1\" width=\"13px\" height=\"13px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:5px; margin-right:8px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               </td>\n               <td width=\"10px\"><div style=\"display: block;\"></div></td>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 6px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_dislike_normal" + "\" width=\"25px\" height=\"25px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:10px; margin-right:10px; vertical-align:-5px; font-size:24px; color:" + s + "; display:inline-block;\">" + 0 + "</a>\n               </span>\n               </td>\n               </tr>\n               </table>\n               </div>\n               <hr size=\"1\" color=\"#dcdcdc\">\n               "));  // attr:dcBodyLinkColor
            }
        }
        return Q.n0.d(q0) ? v.p(("\n               </br>\n               <div style=\"padding-left:10px; padding-top:5px; padding-bottom:5px\"><span>" + s1 + " 님의 <font color=\"" + c.i(vk.b(context0, 0x7F0401F8)) + "\">[작성글 검색]</font></span></div>\n               <div class=\"box_wrapper pdfcf\">\n               <table style=\"height:35px; margin:auto;\">\n               <tr>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 3px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_like_recommend_tinted" + "\" width=\"32px\" height=\"32px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:7px; margin-right:10px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[0] + "</a>\n               </span>\n               <span style=\"display:inline-block; padding-top: 5px; padding-bottom:5px; \">\n                 <img src=\"file:///android_res/drawable/icon_nick1\" width=\"13px\" height=\"13px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:5px; margin-right:8px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[1] + "</a>\n               </span>\n               </td>\n               <td width=\"10px\"><div style=\"display: block;\"></div></td>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 6px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_dislike_normal" + "\" width=\"25px\" height=\"25px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:10px; margin-right:10px; vertical-align:-5px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[2] + "</a>\n               </span>\n               </td>\n               </tr>\n               </table>\n               </div>\n               <hr size=\"1\" color=\"#dcdcdc\">\n               ")) : v.p(("\n               </br>\n               <div style=\"padding-left:10px; padding-top:5px; padding-bottom:5px\"><span>" + s1 + " 님의 <font color=\"" + c.i(vk.b(context0, 0x7F0401F8)) + "\">[작성글 검색]</font></span></div>\n               <div class=\"box_wrapper pdfcf\">\n               <table style=\"height:35px; margin:auto;\">\n               <tr>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 3px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_like_normal_tinted" + "\" width=\"32px\" height=\"32px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:7px; margin-right:10px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[0] + "</a>\n               </span>\n               <span style=\"display:inline-block; padding-top: 5px; padding-bottom:5px; \">\n                 <img src=\"file:///android_res/drawable/icon_nick1\" width=\"13px\" height=\"13px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:5px; margin-right:8px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[1] + "</a>\n               </span>\n               </td>\n               <td width=\"10px\"><div style=\"display: block;\"></div></td>\n               <td style=\"border:2px solid #dadada;border-radius:5px;\">\n               <span style=\"padding-left: 6px; padding-top: 5px; padding-bottom:5px; padding-right: 6px;\">\n                 <img src=\"http://com.dcinside.app/resources/drawable/" + "ic_read_dislike_normal" + "\" width=\"25px\" height=\"25px\" style=\"display:inline-block; vertical-align:middle;\"/>\n                 <a style=\"vertical-align:middle; line-height: 35px; margin-top:5px; margin-left:10px; margin-right:10px; vertical-align:-5px; font-size:24px; color:" + s + "; display:inline-block;\">" + arr_v[2] + "</a>\n               </span>\n               </td>\n               </tr>\n               </table>\n               </div>\n               <hr size=\"1\" color=\"#dcdcdc\">\n               "));  // attr:dcBodyLinkColor
    }

    private final String i(Context context0, Q q0) {
        PostHead postHead0;
        String s2;
        String s = "";
        if(q0 == null) {
            return "";
        }
        String s1 = a.a.l(q0.P0(), "**", "*");
        if(a.a.i(s1)) {
            s2 = "";
        }
        else {
            s2 = context0.getString(0x7F1507D3, new Object[]{s1});  // string:post_read_ip_wrapper "(%s)"
            L.m(s2);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        List list0 = q0.M0();
        String s3 = null;
        if(list0 == null) {
            postHead0 = null;
        }
        else {
            for(Object object0: list0) {
                Integer integer0 = q0.L0();
                if(integer0 == null || ((PostHead)object0).i() != ((int)integer0)) {
                    continue;
                }
                goto label_20;
            }
            object0 = null;
        label_20:
            postHead0 = (PostHead)object0;
        }
        if(postHead0 != null) {
            s3 = postHead0.m();
        }
        if(s3 != null && s3.length() != 0) {
            stringBuilder0.append('[');
            stringBuilder0.append(s3);
            stringBuilder0.append("] ");
        }
        stringBuilder0.append(q0.k1());
        String s4 = stringBuilder0.toString();
        L.o(s4, "toString(...)");
        int v = q0.i1();
        String s5 = q0.U0();
        if(s5 != null && s5.length() > 0) {
            return "\n                   <div style=\"padding-top:5px;\"><font size=\"5\">" + s4 + "</font></div>\n                   <div style=\"padding-top:8px; padding-bottom:8px\"><a>" + q0.X0() + "</a>\n                   " + ("<img src=\"" + q0.U0() + "\" height=\"15\"/>") + "\n                   <font size=\"2px\" color=\"#A0A0A0\">" + s2 + "</font>\n                   <a style=\"float:right;\"><font size=\"2px\" color=\"#A0A0A0\">" + q0.D0() + "</font></a></div>\n                   <div><font color=\"#A0A0A0\">조회 " + q0.N0() + " <u>댓글 " + v + "</u></font></div>\n                   <hr size=\"1\" color=\"#dcdcdc\">\n                   ";
        }
        String s6 = t.c.j(q0).n();
        if(s6.length() > 0) {
            s = "<img src=\"file:///android_res/drawable/" + s6 + "\" width=\"10\" height=\"10\"/>";
        }
        return "\n                   <div style=\"padding-top:5px;\"><font size=\"5\">" + s4 + "</font></div>\n                   <div style=\"padding-top:8px; padding-bottom:8px\"><a>" + q0.X0() + "</a>\n                   " + s + "\n                   <font size=\"2px\" color=\"#A0A0A0\">" + s2 + "</font>\n                   <a style=\"float:right;\"><font size=\"2px\" color=\"#A0A0A0\">" + q0.D0() + "</font></a></div>\n                   <div><font color=\"#A0A0A0\">조회 " + q0.N0() + " <u>댓글 " + v + "</u></font></div>\n                   <hr size=\"1\" color=\"#dcdcdc\">\n                   ";
    }

    private final String j(Context context0, String s) {
        int v = vk.b(context0, 0x7F040158);  // attr:colorPrimary
        if(s == null) {
            s = "디시인사이드";
            L.o("디시인사이드", "getString(...)");
        }
        String s1 = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(v & 0xFFFFFF))}, 1));
        L.o(s1, "format(...)");
        return "<div style=\'background-color:" + s1 + "; text-align:center; padding: 10px; font-size:25px; color:#ffffff;\'>" + s + "</div>";
    }

    private final String k(String s) [...] // Inlined contents

    private final void l(Context context0, WebView webView0, String s, String s1) {
        boolean z;
        d d0 = context0 instanceof d ? ((d)context0) : null;
        if(d0 == null) {
            z = false;
        }
        else {
            gl.j(d0);
            z = d0.q1();
        }
        if(z) {
            String s2 = context0.getString(0x7F1501CB, new Object[]{s, s1});  // string:capture_pdf_file_name "%1$s-[%2$s].pdf"
            L.o(s2, "getString(...)");
            d d1 = context0 instanceof d ? ((d)context0) : null;
            if(d1 != null) {
                Context context1 = d1.m1();
                if(context1 != null) {
                    context0 = context1;
                }
            }
            PrintManager printManager0 = (PrintManager)ContextCompat.getSystemService(context0, PrintManager.class);
            if(printManager0 == null) {
                return;
            }
            PrintDocumentAdapter printDocumentAdapter0 = webView0.createPrintDocumentAdapter(s2);
            L.o(printDocumentAdapter0, "createPrintDocumentAdapter(...)");
            printManager0.print(s2, printDocumentAdapter0, null);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @l
    @n
    public static final V m(@l Context context0, @l LifecycleCoroutineScope lifecycleCoroutineScope0, @l x x0, @m Q q0, @l String s) {
        @s0({"SMAP\nCapturePdf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturePdf.kt\ncom/dcinside/app/read/capture/CapturePdf$save$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
        public static final class com.dcinside.app.read.capture.b.a extends WebViewClient {
            final Context a;
            final String b;
            final String c;

            com.dcinside.app.read.capture.b.a(Context context0, String s, String s1) {
                this.a = context0;
                this.b = s;
                this.c = s1;
                super();
            }

            private final WebResourceResponse a(Context context0, List list0) {
                String s = (String)u.W2(list0, 1);
                if(s != null) {
                    if(!L.g(s, "drawable")) {
                        s = null;
                    }
                    if(s != null) {
                        String s1 = (String)u.W2(list0, 2);
                        if(s1 == null) {
                            return null;
                        }
                        Drawable drawable0 = ContextCompat.getDrawable(context0, context0.getResources().getIdentifier(s1, s, "com.dcinside.app.android"));
                        if(drawable0 == null) {
                            return null;
                        }
                        Integer integer0 = drawable0.getIntrinsicWidth();
                        if(integer0.intValue() <= 0) {
                            integer0 = null;
                        }
                        if(integer0 != null) {
                            int v = (int)integer0;
                            Integer integer1 = drawable0.getIntrinsicHeight();
                            if(integer1.intValue() <= 0) {
                                integer1 = null;
                            }
                            if(integer1 != null) {
                                Bitmap bitmap0 = Bitmap.createBitmap(v, ((int)integer1), Bitmap.Config.ARGB_8888);
                                L.o(bitmap0, "createBitmap(...)");
                                Canvas canvas0 = new Canvas(bitmap0);
                                drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                                drawable0.draw(canvas0);
                                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                                bitmap0.compress(Bitmap.CompressFormat.PNG, 0x5F, byteArrayOutputStream0);
                                return new WebResourceResponse("application/octet-stream", null, new ByteArrayInputStream(byteArrayOutputStream0.toByteArray()));
                            }
                        }
                    }
                }
                return null;
            }

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(@l WebView webView0, @m String s) {
                L.p(webView0, "view");
                b.a.l(this.a, webView0, this.b, this.c);
            }

            @Override  // android.webkit.WebViewClient
            @m
            public WebResourceResponse shouldInterceptRequest(@m WebView webView0, @m WebResourceRequest webResourceRequest0) {
                Uri uri0 = null;
                Context context0 = webView0 == null ? null : webView0.getContext();
                if(context0 == null) {
                    return super.shouldInterceptRequest(webView0, webResourceRequest0);
                }
                if(webResourceRequest0 != null) {
                    uri0 = webResourceRequest0.getUrl();
                }
                if(uri0 == null) {
                    return super.shouldInterceptRequest(webView0, webResourceRequest0);
                }
                if(L.g(uri0.getAuthority(), "com.dcinside.app")) {
                    List list0 = uri0.getPathSegments();
                    L.m(list0);
                    return !L.g(((String)u.G2(list0)), "resources") || list0.size() < 3 ? super.shouldInterceptRequest(webView0, webResourceRequest0) : this.a(context0, list0);
                }
                return super.shouldInterceptRequest(webView0, webResourceRequest0);
            }
        }


        @f(c = "com.dcinside.app.read.capture.CapturePdf$save$job$1", f = "CapturePdf.kt", i = {}, l = {0x8E}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCapturePdf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturePdf.kt\ncom/dcinside/app/read/capture/CapturePdf$save$job$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n774#2:456\n865#2,2:457\n1557#2:459\n1628#2,3:460\n1863#2,2:463\n*S KotlinDebug\n*F\n+ 1 CapturePdf.kt\ncom/dcinside/app/read/capture/CapturePdf$save$job$1\n*L\n128#1:456\n128#1:457,2\n129#1:459\n129#1:460,3\n136#1:463,2\n*E\n"})
        static final class com.dcinside.app.read.capture.b.b extends o implements A3.o {
            int k;
            final x l;
            final String m;
            final Context n;
            final String o;
            final Q p;
            final String q;
            final VideoEnabledWebView r;

            com.dcinside.app.read.capture.b.b(x x0, String s, Context context0, String s1, Q q0, String s2, VideoEnabledWebView videoEnabledWebView0, kotlin.coroutines.d d0) {
                this.l = x0;
                this.m = s;
                this.n = context0;
                this.o = s1;
                this.p = q0;
                this.q = s2;
                this.r = videoEnabledWebView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.read.capture.b.b(this.l, this.m, this.n, this.o, this.p, this.q, this.r, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.read.capture.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.read.capture.CapturePdf$save$job$1$2", f = "CapturePdf.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.read.capture.b.b.a extends o implements A3.o {
                    int k;
                    final VideoEnabledWebView l;
                    final String m;

                    com.dcinside.app.read.capture.b.b.a(VideoEnabledWebView videoEnabledWebView0, String s, kotlin.coroutines.d d0) {
                        this.l = videoEnabledWebView0;
                        this.m = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.read.capture.b.b.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.read.capture.b.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.loadDataWithBaseURL("http://www.dcinside.com/", this.m, "text/html; charset=UTF-8", "utf-8", null);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            V v0 = this.l.U();
                            Integer integer0 = (Integer)v0.b();
                            L.m(integer0);
                            kotlin.ranges.l l0 = new kotlin.ranges.l(((int)(((Integer)v0.a()))), ((int)integer0));
                            x x0 = this.l;
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object2: l0) {
                                if(x0.getItemViewType(((Number)object2).intValue()) != 10000013) {
                                    arrayList0.add(object2);
                                }
                            }
                            Context context0 = this.n;
                            x x1 = this.l;
                            ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
                            for(Object object3: arrayList0) {
                                arrayList1.add(b.a.g(context0, x1, ((Number)object3).intValue()));
                            }
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append(b.e(b.a, this.m));
                            stringBuilder0.append(b.a.j(this.n, this.o));
                            stringBuilder0.append(b.a.i(this.n, this.p));
                            stringBuilder0.append(this.q);
                            stringBuilder0.append(b.a.h(this.n, this.p));
                            for(Object object4: arrayList1) {
                                stringBuilder0.append(((String)object4));
                            }
                            org.jsoup.nodes.f f0 = Dl.A(stringBuilder0.toString());
                            L.o(f0, "soup(...)");
                            String s = y.u(this.n, f0, false, false, false, 0, r.c, false, null, false, false, false, 0xFBC, null).i().toString();
                            L.o(s, "toString(...)");
                            com.dcinside.app.read.capture.b.b.a b$b$a0 = new com.dcinside.app.read.capture.b.b.a(this.r, s, null);
                            this.k = 1;
                            if(i.h(h0.e(), b$b$a0, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Exception exception0) {
                        label_46:
                            timber.log.b.a.y(exception0);
                            Context context1 = this.n;
                            if(context1 instanceof AppCompatActivity) {
                                gl.j(((Activity)context1));
                            }
                        }
                        return S0.a;
                    }
                    case 1: {
                        try {
                            f0.n(object0);
                            return S0.a;
                        }
                        catch(Exception exception0) {
                            goto label_46;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        String s3;
        String s2;
        L.p(context0, "context");
        L.p(lifecycleCoroutineScope0, "lifecycleScope");
        L.p(x0, "adapter");
        L.p(s, "url");
        if(context0 instanceof AppCompatActivity) {
            gl.c(((Activity)context0));
        }
        String s1 = q0 == null ? null : q0.H0();
        if(q0 == null) {
            s2 = "dcinside";
        }
        else {
            s2 = q0.k1();
            if(s2 == null) {
                s2 = "dcinside";
            }
        }
        if(q0 == null) {
            s3 = "";
        }
        else {
            s3 = q0.W0();
            if(s3 == null) {
                s3 = "";
            }
        }
        VideoEnabledWebView videoEnabledWebView0 = new VideoEnabledWebView(context0);
        videoEnabledWebView0.setBackgroundColor(vk.b(context0, 0x1010054));
        com.dcinside.app.wv.f f0 = B.a.e(videoEnabledWebView0);
        videoEnabledWebView0.setWebViewClient(new com.dcinside.app.read.capture.b.a(context0, s2, s1));
        return r0.a(f0, k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.read.capture.b.b(x0, s, context0, s1, q0, s3, videoEnabledWebView0, null), 2, null));
    }
}

