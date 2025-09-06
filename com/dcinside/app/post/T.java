package com.dcinside.app.post;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.dcinside.app.span.e;
import com.dcinside.app.util.vk;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import org.json.JSONArray;
import org.json.JSONObject;
import y4.l;

public enum t {
    @s0({"SMAP\nPersonProfileType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonProfileType.kt\ncom/dcinside/app/post/PersonProfileType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Spannable a(@l Context context0, @l String s) {
            int v4;
            L.p(context0, "context");
            L.p(s, "value");
            Spannable spannable0 = new SpannableStringBuilder();
            try {
                JSONArray jSONArray0 = new JSONArray(s);
                int v = vk.b(context0, 0x7F0401F8);  // attr:dcBodyLinkColor
                int v1 = jSONArray0.length();
                int v2 = 0;
                while(v2 < v1) {
                    int v3 = ((SpannableStringBuilder)spannable0).length();
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v2);
                    if(!jSONObject0.has("name") || !jSONObject0.has("link")) {
                        v4 = v;
                    }
                    else {
                        String s1 = jSONObject0.getString("name");
                        L.m(s1);
                        String s2 = null;
                        if(s1.length() <= 0) {
                            s1 = null;
                        }
                        String s3 = jSONObject0.getString("link");
                        L.m(s3);
                        if(s3.length() > 0) {
                            s2 = s3;
                        }
                        if(s1 != null && s2 != null) {
                            if(v3 != 0) {
                                ((SpannableStringBuilder)spannable0).append(", ");
                            }
                            ((SpannableStringBuilder)spannable0).append(com.dcinside.app.internal.l.f(s1));
                            v4 = v;
                            ((SpannableStringBuilder)spannable0).setSpan(new e(v, false, s2, null, 8, null), v3, ((SpannableStringBuilder)spannable0).length(), 33);
                        }
                    }
                    ++v2;
                    v = v4;
                }
                return spannable0;
            }
            catch(Exception unused_ex) {
                Spannable spannable1 = ((SpannableStringBuilder)spannable0).append(s);
                L.o(spannable1, "append(...)");
                return spannable1;
            }
        }
    }

    IMG("대표 이미지"),
    NAME("본명"),
    JOB("직업"),
    GENDER("성별"),
    SITE("사이트"),
    BIRTH("출생일");

    @l
    private final String a;
    @l
    public static final a b;
    private static final t[] i;
    private static final kotlin.enums.a j;

    static {
        t.i = arr_t;
        L.p(arr_t, "entries");
        t.j = new d(arr_t);
        t.b = new a(null);
    }

    private t(String s1) {
        this.a = s1;
    }

    private static final t[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return t.j;
    }

    @l
    public final String c() {
        return this.a;
    }
}

