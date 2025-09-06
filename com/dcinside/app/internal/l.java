package com.dcinside.app.internal;

import android.text.SpannableStringBuilder;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.io.c;
import kotlin.io.y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.f;
import kotlin.text.v;

@s0({"SMAP\nStringExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtension.kt\ncom/dcinside/app/internal/StringExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,120:1\n1#2:121\n13346#3,2:122\n*S KotlinDebug\n*F\n+ 1 StringExtension.kt\ncom/dcinside/app/internal/StringExtensionKt\n*L\n54#1:122,2\n*E\n"})
public final class l {
    public static final void a(@y4.l SpannableStringBuilder spannableStringBuilder0, @y4.l CharSequence charSequence0, @y4.l Object object0) {
        L.p(spannableStringBuilder0, "<this>");
        L.p(charSequence0, "text");
        L.p(object0, "span");
        int v = charSequence0.length();
        spannableStringBuilder0.append(charSequence0);
        spannableStringBuilder0.setSpan(object0, spannableStringBuilder0.length() - v, spannableStringBuilder0.length(), 17);
    }

    public static final void b(@y4.l SpannableStringBuilder spannableStringBuilder0, @y4.l CharSequence charSequence0, @y4.l Object[] arr_object) {
        L.p(spannableStringBuilder0, "<this>");
        L.p(charSequence0, "text");
        L.p(arr_object, "spans");
        int v = charSequence0.length();
        spannableStringBuilder0.append(charSequence0);
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            spannableStringBuilder0.setSpan(arr_object[v1], spannableStringBuilder0.length() - v, spannableStringBuilder0.length(), 17);
        }
    }

    @y4.l
    public static final String c(@y4.l String s, char c) {
        L.p(s, "<this>");
        return v.k2(s, c, ' ', false, 4, null);
    }

    public static String d(String s, char c, int v, Object object0) {
        if((v & 1) != 0) {
            c = ' ';
        }
        return l.c(s, c);
    }

    @y4.l
    public static final String e(@y4.l byte[] arr_b) {
        String s;
        L.p(arr_b, "<this>");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(arr_b)), f.b), 0x2000);
        try {
            s = y.k(bufferedReader0);
        }
        catch(Throwable throwable0) {
            c.a(bufferedReader0, throwable0);
            throw throwable0;
        }
        c.a(bufferedReader0, null);
        return s;
    }

    @y4.l
    public static final String f(@y4.l String s) {
        L.p(s, "<this>");
        char[] arr_c = s.toCharArray();
        L.o(arr_c, "toCharArray(...)");
        return kotlin.collections.l.gh(arr_c, "​", null, null, 0, null, null, 62, null);
    }

    @y4.l
    public static final String g(@y4.l String s, int v, @y4.l String s1) {
        L.p(s, "<this>");
        L.p(s1, "tail");
        return s.length() <= v ? s : v.Z8(s, v) + s1;
    }

    public static String h(String s, int v, String s1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s1 = "…";
        }
        return l.g(s, v, s1);
    }

    @y4.l
    public static final byte[] i(@y4.l String s) {
        L.p(s, "<this>");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream0), f.b), 0x2000);
        try {
            bufferedWriter0.write(s);
        }
        catch(Throwable throwable0) {
            c.a(bufferedWriter0, throwable0);
            throw throwable0;
        }
        c.a(bufferedWriter0, null);
        byte[] arr_b = byteArrayOutputStream0.toByteArray();
        L.o(arr_b, "toByteArray(...)");
        return arr_b;
    }

    @y4.l
    public static final String j(@y4.l String s, int v, @y4.l Charset charset0, @y4.l CodingErrorAction codingErrorAction0, @y4.l CodingErrorAction codingErrorAction1) {
        L.p(s, "<this>");
        L.p(charset0, "charset");
        L.p(codingErrorAction0, "malformedInputAction");
        L.p(codingErrorAction1, "unmappableCharacterAction");
        if(s.length() == 0 || v <= 0) {
            return "";
        }
        byte[] arr_b = s.getBytes(charset0);
        L.o(arr_b, "getBytes(...)");
        byte[] arr_b1 = Base64.encode(arr_b, 0);
        if(arr_b1.length <= v) {
            return s;
        }
        CharsetDecoder charsetDecoder0 = charset0.newDecoder().onMalformedInput(codingErrorAction0).onUnmappableCharacter(codingErrorAction1);
        L.o(charsetDecoder0, "onUnmappableCharacter(...)");
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1, 0, v);
        L.o(byteBuffer0, "wrap(...)");
        CharBuffer charBuffer0 = CharBuffer.allocate(v);
        L.o(charBuffer0, "allocate(...)");
        charsetDecoder0.decode(byteBuffer0, charBuffer0, true);
        charsetDecoder0.flush(charBuffer0);
        char[] arr_c = charBuffer0.array();
        L.o(arr_c, "array(...)");
        return new String(arr_c, 0, charBuffer0.position());
    }

    public static String k(String s, int v, Charset charset0, CodingErrorAction codingErrorAction0, CodingErrorAction codingErrorAction1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            charset0 = StandardCharsets.UTF_8;
            L.o(charset0, "UTF_8");
        }
        if((v1 & 4) != 0) {
            codingErrorAction0 = CodingErrorAction.IGNORE;
            L.o(codingErrorAction0, "IGNORE");
        }
        if((v1 & 8) != 0) {
            codingErrorAction1 = CodingErrorAction.IGNORE;
            L.o(codingErrorAction1, "IGNORE");
        }
        return l.j(s, v, charset0, codingErrorAction0, codingErrorAction1);
    }
}

