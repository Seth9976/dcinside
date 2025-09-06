package com.dcinside.app.util;

import A3.o;
import A3.p;
import android.content.Context;
import android.content.pm.Signature;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.dcinside.app.Application;
import com.dcinside.app.http.IntTypeAdapter;
import com.dcinside.app.http.h;
import com.dcinside.app.http.j;
import com.dcinside.app.http.q;
import com.dcinside.app.model.A;
import com.dcinside.app.model.AiImageStatusResult;
import com.dcinside.app.model.AiPromptLoadItem;
import com.dcinside.app.model.BigDcconResult;
import com.dcinside.app.model.E;
import com.dcinside.app.model.I;
import com.dcinside.app.model.K;
import com.dcinside.app.model.L;
import com.dcinside.app.model.M;
import com.dcinside.app.model.MajorRanking;
import com.dcinside.app.model.MinorInfo;
import com.dcinside.app.model.MinorRanking;
import com.dcinside.app.model.N;
import com.dcinside.app.model.P;
import com.dcinside.app.model.PostImage;
import com.dcinside.app.model.ProfileInfo;
import com.dcinside.app.model.Q;
import com.dcinside.app.model.RelationData;
import com.dcinside.app.model.S;
import com.dcinside.app.model.U;
import com.dcinside.app.model.V;
import com.dcinside.app.model.VideoInfoUploadResult;
import com.dcinside.app.model.VideoUploadResult;
import com.dcinside.app.model.X;
import com.dcinside.app.model.c;
import com.dcinside.app.model.d0;
import com.dcinside.app.model.e0;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.h0;
import com.dcinside.app.model.i;
import com.dcinside.app.model.j0;
import com.dcinside.app.model.k0;
import com.dcinside.app.model.k;
import com.dcinside.app.model.l0;
import com.dcinside.app.model.l;
import com.dcinside.app.model.s;
import com.dcinside.app.model.t;
import com.dcinside.app.model.u;
import com.dcinside.app.model.y;
import com.dcinside.app.model.z;
import com.dcinside.app.read.Q0;
import com.dcinside.app.realm.B;
import com.dcinside.app.realm.w0;
import com.dcinside.app.realm.x0;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.totalsearch.a.d;
import com.dcinside.app.type.f;
import com.dcinside.app.type.m;
import com.dcinside.app.type.v;
import com.dcinside.app.type.x;
import com.dcinside.app.write.menu.video.VideoInfoData;
import com.dcinside.app.youtube.YoutubeSearchResult.Item;
import com.dcinside.app.youtube.YoutubeSearchResult;
import com.google.gson.Gson;
import com.google.gson.e;
import io.realm.F0;
import io.realm.W;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import rx.g;
import rx.n;

public final class uk {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[f.values().length];
            a.b = arr_v;
            try {
                arr_v[f.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[f.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[f.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[f.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[m.values().length];
            a.a = arr_v1;
            try {
                arr_v1[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final Gson a = null;
    private static g b = null;
    private static final Object c = null;
    private static final long d = 39600000L;
    private static com.dcinside.app.rx.g e;

    static {
        e e0 = new e().x().m(Integer.TYPE, new IntTypeAdapter());
        IntTypeAdapter intTypeAdapter0 = new IntTypeAdapter();
        uk.a = e0.m(Integer.class, intTypeAdapter0).u(new com.google.gson.a[]{new hl(), new b()}).e();
        uk.c = new Object();
        uk.e = new com.dcinside.app.rx.g(TimeUnit.HOURS.toMillis(12L), () -> uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("app_ad_charge.php"))).w(new Lg()), (Throwable throwable0) -> new c());
    }

    // 检测为 Lambda 实现
    public static Object A4() [...]

    // 检测为 Lambda 实现
    private static S0 AA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static g AB(String s) [...]

    // 检测为 Lambda 实现
    private static S0 AC(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static g AD(String s, String s1, boolean z, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 AE(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 AF(Function1 function10) [...]

    public static g AG(AiPromptLoadItem aiPromptLoadItem0, com.dcinside.app.write.menu.ai.type.f f0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("save_prompt"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("type", f0.c()))).R((o o0) -> ((S0)o0.invoke("prompt", aiPromptLoadItem0.o()))).R((o o0) -> ((S0)o0.invoke("neg_prompt", aiPromptLoadItem0.m()))).R((o o0) -> {
            if(f0 == com.dcinside.app.write.menu.ai.type.f.b) {
                o0.invoke("title", aiPromptLoadItem0.q());
            }
            return S0.a;
        }).R((o o0) -> {
            if(f0 == com.dcinside.app.write.menu.ai.type.f.c) {
                o0.invoke("idx", String.valueOf(aiPromptLoadItem0.i()));
            }
            return S0.a;
        }).w((String s) -> try {
            i i0 = (i)c0.a.a.a(uk.a, s, i.class);
            return i0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(i0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Af() [...]

    public static g Ak(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("person_profile"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> ((S0)o0.invoke("id", s))).w((String s) -> try {
            y y0 = (y)c0.a.a.a(uk.a, s, y.class);
            if(y0 != null) {
                y0.l();
                return g.Q2(y0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static Uri.Builder Al(String s, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 Am(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 An(o o0) [...]

    private static Object Ao() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Ap(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Aq(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g Ar(String s) [...]

    // 检测为 Lambda 实现
    private static S0 As(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 At(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static String Au(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 Av(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Aw(P p0, o o0) [...]

    private static Object Ax() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Ay(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Az(String s, Q q0, boolean z, int v, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 BA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static g BB(com.dcinside.app.write.menu.ai.type.f f0, AiPromptLoadItem aiPromptLoadItem0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 BC(String s, o o0) [...]

    private static Object BD() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 BE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 BF(o o0) [...]

    public static g BG(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("character_prompt"))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("keyword", s))).w((String s) -> try {
            com.dcinside.app.write.menu.ai.type.b b0 = (com.dcinside.app.write.menu.ai.type.b)c0.a.a.a(uk.a, s, com.dcinside.app.write.menu.ai.type.b.class);
            return b0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(b0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Bc() [...]

    // 检测为 Lambda 实现
    public static Object Bh() [...]

    // 检测为 Lambda 实现
    public static Object Bi() [...]

    public static g Bk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("usergallogcnt"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> {
            if(s != null) {
                o0.invoke("g_id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            k0 k00 = (k0)c0.a.a.a(uk.a, s, k0.class);
            return k00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(k00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static Uri.Builder Bl(Integer integer0, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 Bm(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Bn(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Bo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Bp(List list0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Bq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Br(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Bs(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Bt(String s, o o0) [...]

    private static Object Bu() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Bv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Bw(P p0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Bx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 By(V v0, o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static g Bz(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static S0 CA(com.dcinside.app.model.f f0, o o0) [...]

    private static Object CB() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 CC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 CD(Function1 function10) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 CE(VideoInfoData videoInfoData0, o o0) [...]

    public static g CF(boolean z, String s, int v) {
        return uk.DF(z, s, v, null, null);
    }

    public static g CG() {
        return g.u0(uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json3"))).G((Function1 function10) -> ((S0)function10.invoke("category_name.php"))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.gallery.b.class);
                if(list0 != null && list0.size() > 0) {
                    return g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }), uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json3"))).G((Function1 function10) -> ((S0)function10.invoke("gall_name.php"))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.gallery.c.class);
                if(list0 != null && list0.size() > 0) {
                    return g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }), (List list0, List list1) -> {
            SparseArray sparseArray0 = new SparseArray();
            for(int v = 0; true; ++v) {
                String s = null;
                if(v >= list0.size()) {
                    break;
                }
                com.dcinside.app.gallery.b b0 = (com.dcinside.app.gallery.b)list0.get(v);
                String s1 = b0.b();
                if(s1 != null) {
                    s = s1.replace('_', '-');
                }
                w0 w00 = new w0();
                w00.V5(((long)b0.a()));
                w00.X5(s);
                w00.W5(((long)v));
                sparseArray0.put(b0.a(), w00);
            }
            for(Object object0: list1) {
                com.dcinside.app.gallery.c c0 = (com.dcinside.app.gallery.c)object0;
                w0 w01 = (w0)sparseArray0.get(c0.a());
                if(w01 == null) {
                    continue;
                }
                String s2 = c0.e();
                x0 x00 = new x0();
                x00.V5(c0.c());
                x00.Y5((s2 == null ? null : s2.replace('_', '-')));
                x00.Z5(!"up".equals(c0.b()));
                x00.W5(c0.d());
                w01.Q5().add(x00);
            }
            try(F0 f00 = F0.g4()) {
                f00.Y3((F0 f00) -> {
                    f00.C4(x0.class).p0().L0();
                    f00.C4(w0.class).p0().L0();
                    for(int v = 0; v < sparseArray0.size(); ++v) {
                        f00.t2(((w0)sparseArray0.valueAt(v)), new W[0]);
                    }
                });
            }
            return true;
        });
    }

    // 检测为 Lambda 实现
    public static Object Ca() [...]

    // 检测为 Lambda 实现
    public static Object Cf() [...]

    public static g Ck(String s, com.dcinside.app.gallery.history.a a0, int v, boolean z, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("managehistory"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> {
            if(a0 != null) {
                o0.invoke("category", a0.c());
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("page", String.valueOf(v)))).R((o o0) -> // 去混淆评级： 低(20)
        (z ? ((S0)o0.invoke("mylist", "1")) : ((S0)o0.invoke("mylist", "0")))).R((o o0) -> {
            if(s1 != null && !s1.isEmpty()) {
                o0.invoke("search", s1);
            }
            return S0.a;
        }).w((String s) -> try {
            com.dcinside.app.gallery.history.c c0 = (com.dcinside.app.gallery.history.c)c0.a.a.a(uk.a, s, com.dcinside.app.gallery.history.c.class);
            return c0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(c0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static Uri.Builder Cl(Integer integer0, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 Cm(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Cn(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Co(Function1 function10) [...]

    private static Object Cp() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Cq(Function1 function10) [...]

    private static Object Cr() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Cs(String s) [...]

    // 检测为 Lambda 实现
    private static g Ct(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Cu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Cv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Cw(P p0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Cx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Cy(o o0) [...]

    private static Object Cz() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 DA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 DB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 DC(boolean z, String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 DD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 DE(VideoInfoData videoInfoData0, o o0) [...]

    public static g DF(boolean z, String s, int v, String s1, String s2) {
        return g.v1(new C()).f2((String s3) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> // 去混淆评级： 低(20)
        (z ? ((S0)function10.invoke("_recommend_up.php")) : ((S0)function10.invoke("_recommend_down.php")))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).R((o o0) -> ((S0)o0.invoke("app_id", s3))).R((o o0) -> ((S0)o0.invoke("rand_code", s1))).R((o o0) -> ((S0)o0.invoke("captcha_code", s2))).w((String s) -> {
            try {
                A a0 = (A)c0.a.a.a(uk.a, s, A.class);
                if(a0 != null) {
                    if(a0.g()) {
                        return g.Q2(a0);
                    }
                    Boolean boolean0 = a0.h();
                    return boolean0 == null || !boolean0.booleanValue() ? g.X1(new com.dcinside.app.http.f(a0.a())) : g.X1(new q(a0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g DG(String s, String s1, String s2, boolean z) {
        return g.v1(new C()).f2((String s3) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("search_comment"))).H((o o0) -> ((S0)o0.invoke("app_id", s3))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("no", s1))).H((o o0) -> {
            if(m0.a.k(s2)) {
                o0.invoke("serval", s2);
            }
            return S0.a;
        }).H((o o0) -> {
            if(z) {
                o0.invoke("confirm_id", B.i7());
            }
            return S0.a;
        }).w((String s) -> try {
            U u0 = (U)c0.a.a.a(uk.a, s, U.class);
            return u0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(u0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Dc() [...]

    // 检测为 Lambda 实现
    public static Object Df() [...]

    // 检测为 Lambda 实现
    public static Object Di() [...]

    public static g Dk() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("autozzal"))).G((Function1 function10) -> ((S0)function10.invoke("my_list"))).H((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> ((S0)o0.invoke("mode", "all"))).w((String s) -> try {
            j0.e e0 = (j0.e)c0.a.a.a(uk.a, s, j0.e.class);
            if(e0 != null) {
                return e0.f() ? g.Q2(e0) : g.X1(new com.dcinside.app.http.f(e0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static Uri.Builder Dl(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static g Dm(String s) [...]

    // 检测为 Lambda 实现
    private static g Dn(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Do(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Dp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Dq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Dr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Ds(String s) [...]

    // 检测为 Lambda 实现
    private static g Dt(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Du(m m0, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Dv(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Dw(P p0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Dx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Dy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Dz(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 EA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 EB(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 EC(boolean z, String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ED(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 EE(VideoInfoData videoInfoData0, o o0) [...]

    public static g EF(int v, @NonNull String s, @NonNull String s1) {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("recommend"))).G((Function1 function10) -> ((S0)function10.invoke("recommend_" + s + ".php"))).w((String s2) -> {
            if(s2 != null) {
                try {
                    s2 = s2.trim();
                    List list0 = c0.a.a.b(uk.a, (!s2.startsWith("(") || !s2.endsWith(")") ? s2 : s2.substring(1, s2.length() - 1)), z.class);
                    if(list0 != null) {
                        if(list0.isEmpty()) {
                            return g.X1(new com.dcinside.app.http.g("response list is empty"));
                        }
                        if(list0.size() == 1 && "nodata".equals(((z)list0.get(0)).c())) {
                            return g.X1(new com.dcinside.app.http.g("response no data gallery"));
                        }
                        for(Object object0: list0) {
                            ((z)object0).g(s);
                        }
                        return g.Q2(new e0(v, new kotlin.V(s, s1), list0));
                    }
                }
                catch(Exception exception0) {
                    return xk.r(s2, exception0);
                }
            }
            return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        });
    }

    public static g EG(String s, int v, d[] arr_a$d) {
        String s1 = B.i7();
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("_total_search_new.php"))).R((o o0) -> ((S0)o0.invoke("keyword", s))).R((o o0) -> (v <= 0 ? ((S0)o0.invoke("page", null)) : ((S0)o0.invoke("page", String.valueOf(v))))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("confirm_id", s1))).R((o o0) -> {
            if(arr_a$d != null) {
                for(int v = 0; v < arr_a$d.length; ++v) {
                    d a$d0 = arr_a$d[v];
                    o0.invoke(a$d0.getKey(), a$d0.getValue());
                }
            }
            return S0.a;
        }).w((String s) -> {
            try {
                com.dcinside.app.totalsearch.a a0 = (com.dcinside.app.totalsearch.a)c0.a.a.a(uk.a, s, com.dcinside.app.totalsearch.a.class);
                if(a0 != null) {
                    if(a0.m()) {
                        return g.X1(new com.dcinside.app.http.a(a0.b()));
                    }
                    return !m0.a.h(a0.k()) || !m0.a.h(a0.b()) ? g.X1(new com.dcinside.app.http.f(a0.b())) : g.Q2(a0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    public static Object Ef() [...]

    public static g Ek(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("oglink"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("url", s))).w((String s) -> try {
            N n0 = (N)c0.a.a.a(uk.a, s, N.class);
            return n0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(n0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static String El(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static g Em(String s, String s1, String s2) [...]

    private static Object En() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Eo(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ep(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Eq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Er(Function1 function10) [...]

    private static Object Es() [...] // Inlined contents

    private static Object Et() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Eu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Ev(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g Ew(P p0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Ex(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ey(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ez(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 FA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 FB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 FC(boolean z, String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 FD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 FE(VideoInfoData videoInfoData0, o o0) [...]

    public static g FF() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("bestcontent"))).G((Function1 function10) -> ((S0)function10.invoke("livebest"))).w((String s) -> try {
            List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.model.B.class);
            return list0 == null || list0.size() <= 0 ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(list0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception unused_ex) {
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g FG(String s, d[] arr_a$d) {
        return uk.EG(s, 0, arr_a$d);
    }

    // 检测为 Lambda 实现
    public static Object Fb() [...]

    // 检测为 Lambda 实现
    public static Object Fe() [...]

    // 检测为 Lambda 实现
    public static Object Fg() [...]

    public static g Fk(String s, String s1, String s2) {
        return g.v1(new C()).f2((String s3) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("get_article_config"))).H((o o0) -> ((S0)o0.invoke("app_id", s3))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(s != null) {
                o0.invoke("id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(s1 != null) {
                o0.invoke("no", s1);
            }
            return S0.a;
        }).H((o o0) -> {
            if(s1 != null) {
                o0.invoke("user", s2);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.e e0 = (g0.e)c0.a.a.a(uk.a, s, g0.e.class);
            return e0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(e0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    private static Object Fl() [...] // Inlined contents

    private static Object Fm() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Fn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Fo(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Fp(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Fq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Fr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Fs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ft(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Fu(m m0, String s, Function1 function10) [...]

    private static Object Fv() [...] // Inlined contents

    private static Object Fw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Fx(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Fy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Fz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object G3() [...]

    // 检测为 Lambda 实现
    private static g GA(String s) [...]

    // 检测为 Lambda 实现
    private static S0 GB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 GC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 GD(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 GE(VideoInfoData videoInfoData0, o o0) [...]

    private static g GF(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {
        return uk.fG().W(() -> "https://msign.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("login"))).R((o o0) -> ((S0)o0.invoke("user_id", s))).R((o o0) -> ((S0)o0.invoke("user_pw", s1))).R((o o0) -> ((S0)o0.invoke("rand_code", s2))).R((o o0) -> ((S0)o0.invoke("captcha_code", s3))).R((o o0) -> ((S0)o0.invoke("mode", s4))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("otp_num", s5))).R((o o0) -> ((S0)o0.invoke("otp_auto", s6))).R((o o0) -> ((S0)o0.invoke("auth_mode", s7))).w((String s2) -> {
            try {
                B b0 = (B)c0.a.a.a(uk.a, s2, B.class);
                if(b0 != null) {
                    String s3 = b0.d6();
                    if(s3 == null) {
                        s3 = "";
                    }
                    b0.I6(s7);
                    if(b0.s6()) {
                        String s4 = b0.m6();
                        if(s4 != null) {
                            b0.X6(s4.replace("\\", ""));
                        }
                        b0.d7(s);
                        return g.Q2(b0);
                    }
                    if(b0.x6()) {
                        return g.X1(new com.dcinside.app.http.c(b0.c6()));
                    }
                    if(!"1".equals(b0.A6()) && !Boolean.parseBoolean(b0.A6()) && !m0.a.k(s3)) {
                        return g.X1(new com.dcinside.app.http.f(b0.c6()));
                    }
                    String s5 = b0.A6();
                    if(s5 != null && !s5.isEmpty()) {
                        return g.X1(new h(s3));
                    }
                }
            }
            catch(Exception exception0) {
                return xk.r(s2, exception0);
            }
            return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        });
    }

    public static g GG(GalleryInfo galleryInfo0) {
        return g.v1(new C()).g3((String s) -> {
            String s3;
            String s1 = B.i7();
            if(m0.a.i(s1)) {
                throw new NullPointerException("unknown user");
            }
            String s2 = galleryInfo0.r() == null ? "" : galleryInfo0.r();
            switch(galleryInfo0.q()) {
                case 1: 
                case 2: {
                    s3 = "https://m.dcinside.com/management/minor/chkduplrestrict/" + m.d.g(s2);
                    break;
                }
                case 4: {
                    s3 = "https://m.dcinside.com/management/person/chkduplrestrict/" + m.d.h(s2);
                    break;
                }
                default: {
                    s3 = "https://m.dcinside.com/management/mini/chkduplrestrict/" + m.d.g(s2);
                }
            }
            Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
            uri$Builder0.appendQueryParameter("app_id", s);
            uri$Builder0.appendQueryParameter("confirm_id", s1);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.build().toString());
    }

    // 检测为 Lambda 实现
    public static Object Gf() [...]

    // 检测为 Lambda 实现
    public static Object Gh() [...]

    public static g Gk(g0.b b0, int v) {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("message"))).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> ((S0)o0.invoke("type", b0.c()))).H((o o0) -> ((S0)o0.invoke("page", Integer.toString(v)))).w((String s) -> try {
            g0.d d0 = (g0.d)c0.a.a.a(uk.a, s, g0.d.class);
            if(d0 != null) {
                if(d0.a() != null) {
                    for(Object object0: d0.a()) {
                        ((g0.d.a)object0).H(Dl.C(((g0.d.a)object0).o()));
                        ((g0.d.a)object0).v(Dl.C(((g0.d.a)object0).c()));
                        ((g0.d.a)object0).C(Dl.C(((g0.d.a)object0).j()));
                    }
                }
                return g.Q2(d0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Gl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Gm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Gn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Go(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Gp(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gs(Function1 function10) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Gt(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Gu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Gw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Gx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Gz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    private static g HA(com.dcinside.app.model.f f0, boolean z, String s) [...]

    // 检测为 Lambda 实现
    private static g HB(String s) [...]

    // 检测为 Lambda 实现
    private static g HC(String s) [...]

    // 检测为 Lambda 实现
    private static S0 HD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 HE(VideoInfoData videoInfoData0, o o0) [...]

    public static g HF(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        return uk.GF(s, s1, s2, s3, "login_normal", s4, s5, s6);
    }

    public static g HG(boolean z, String s, String s1, String s2, String s3, String s4, String s5) {
        return g.v1(new C()).f2((String s6) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> {
            if(z) {
                function10.invoke("article");
                return S0.a;
            }
            function10.invoke("del_article");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s6))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(!z) {
                o0.invoke("article_type", "A");
                o0.invoke("type", "U");
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("no", s1))).R((o o0) -> {
            if(z && s2 != null) {
                o0.invoke("ko_name", s2);
            }
            return S0.a;
        }).R((o o0) -> {
            if(z && s3 != null) {
                o0.invoke("nickname", s3);
            }
            return S0.a;
        }).R((o o0) -> {
            if(z && s4 != null) {
                o0.invoke("subject", s4);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s5 != null) {
                o0.invoke("write_time", s5);
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Hk() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("setting"))).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            X x0 = (X)c0.a.a.a(uk.a, s, X.class);
            if(x0 != null) {
                return g.Q2(x0);
            }
            if(s.contentEquals("[]")) {
                X x1 = new X();
                x1.q(1);
                x1.r(1);
                x1.s(1);
                x1.t(1);
                x1.w(1);
                x1.u(1);
                x1.x(1);
                return g.Q2(x1);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Hl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Hm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Hn(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ho(String[] arr_s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hr(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hs(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ht(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hu(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Hw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Hx(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Hy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Hz(i0.a a0, p p0) [...]

    private static Object IA() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g IB(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g IC(boolean z, String s, String s1, String s2, String s3, String s4, String s5, String s6) [...]

    // 检测为 Lambda 实现
    private static S0 ID(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g IE(String s) [...]

    public static g IF(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        return uk.GF(s, s1, s2, s3, "login_quick", s4, s5, s6);
    }

    public static g IG(Boolean boolean0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://m.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("aside"))).Q((Function1 function10) -> ((S0)function10.invoke("usehitcon"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            if(boolean0 != null) {
                o0.invoke("use_bestcon", (boolean0.booleanValue() ? "1" : "0"));
            }
            return S0.a;
        }).w((String s) -> try {
            l l0 = (l)c0.a.a.a(uk.a, s, l.class);
            return l0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(l0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Ij(String s, String s1, String s2) {
        return g.v1(new C()).f2((String s3) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("minor"))).Q((Function1 function10) -> ((S0)function10.invoke("minor-appointagreemanager"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s3))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("mode", s1))).R((o o0) -> ((S0)o0.invoke("agree", s2))).w((String s) -> try {
            E e0 = (E)c0.a.a.a(uk.a, s, E.class);
            return e0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(e0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Ik(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("keyword"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(m0.a.k(s)) {
                o0.invoke("id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.f f0 = (g0.f)c0.a.a.a(uk.a, s, g0.f.class);
            return f0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Il(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Im(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 In(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Io(String s) [...]

    // 检测为 Lambda 实现
    private static g Ip(String s) [...]

    // 检测为 Lambda 实现
    private static g Iq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Ir(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Is(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 It(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Iu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Iv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Iw(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Ix(String s, int v, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Iy(V v0, p p0) [...]

    // 检测为 Lambda 实现
    private static S0 Iz(o o0) [...]

    // 检测为 Lambda 实现
    public static Object J6() [...]

    // 检测为 Lambda 实现
    private static S0 JA(Function1 function10) [...]

    private static Object JB() [...] // Inlined contents

    private static Object JC() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g JD(String s) [...]

    // 检测为 Lambda 实现
    private static g JE(String s, VideoInfoData videoInfoData0, String s1) [...]

    public static g JF() {
        return uk.vk().J("api_mainContents").K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json3"))).G((Function1 function10) -> {
            function10.invoke("main_content_new.php");
            return S0.a;
        }).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.model.C.class);
                if(list0 == null || list0.size() <= 0) {
                    return g.Q2(new com.dcinside.app.model.C());
                }
                com.dcinside.app.model.C c0 = (com.dcinside.app.model.C)list0.get(0);
                if(c0 != null) {
                    List list1 = c0.b();
                    List list2 = c0.c();
                    if((list1 == null || list1.size() == 0) && (list2 == null || list2.size() == 0)) {
                        return g.X1(new com.dcinside.app.http.f(0x7F150323));  // string:failed_main_contents "컨텐츠를 가져오기를 실패했습니다."
                    }
                    List list3 = c0.d();
                    if(list3 != null) {
                        Iterator iterator0 = list3.iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            if(m0.a.h(((com.dcinside.app.model.B)object0).h()) || xk.o(((com.dcinside.app.model.B)object0).l())) {
                                iterator0.remove();
                            }
                        }
                    }
                    return g.Q2(c0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        });
    }

    public static g JG(boolean z, String s, String s1, String s2) {
        return g.v1(new C()).f2((String s3) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> {
            if(z) {
                function10.invoke("keyword");
                return S0.a;
            }
            function10.invoke("del_keyword");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s3))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("keyword", s))).R((o o0) -> ((S0)o0.invoke("id", s1))).R((o o0) -> ((S0)o0.invoke("ko_name", s2))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Jj() {
        return uk.vk().J("api_access").K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> {
            function10.invoke("app_check_A_rina_new.php");
            return S0.a;
        }).w(new B6());
    }

    public static g Jk() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("notify"))).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.f.c f$c0 = (g0.f.c)c0.a.a.a(uk.a, s, g0.f.c.class);
            return f$c0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f$c0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Jl(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Jm(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Jn(o o0) [...]

    // 检测为 Lambda 实现
    private static g Jo(String[] arr_s, String s) [...]

    private static Object Jp() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Jq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Jr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Js(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Jt(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ju(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Jv(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Jw(o o0) [...]

    private static Object Jx() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Jy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Jz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 KA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 KB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 KC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g KD(boolean z, String s, String s1, String s2) [...]

    private static Object KE() [...] // Inlined contents

    public static g KF() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("ranking_gallery.php"))).w((String s) -> {
            String s1;
            try {
                s = s.trim();
                if(!s.startsWith("(") || !s.endsWith(")")) {
                    s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                }
                else {
                    s1 = s.substring(1, s.length() - 1);
                }
                if(s1 != null) {
                    List list0 = c0.a.a.b(uk.a, s1, MajorRanking.class);
                    return list0 == null || list0.size() <= 0 ? g.Q2(new ArrayList()) : g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return g.X1(new com.dcinside.app.http.f(0x7F150324));  // string:failed_main_ranking "실시간 북적 갤러리 목록을 불러올 수 없습니다."
        });
    }

    public static g KG() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> {
            function10.invoke("update_notice_A_rina_new.php");
            return S0.a;
        }).w((String s) -> try {
            j0 j00 = (j0)c0.a.a.a(uk.a, s, j0.class);
            return j00 == null || !m0.a.j(j00.a()) ? g.Q2(new j0()) : g.Q2(j00);
        }
        catch(Exception unused_ex) {
            return g.Q2(new j0());
        });
    }

    // 检测为 Lambda 实现
    public static Object Kf() [...]

    // 检测为 Lambda 实现
    public static Object Kh() [...]

    // 检测为 Lambda 实现
    public static g Kj(Object object0) [...]

    public static g Kk() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("recomm"))).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.f.c f$c0 = (g0.f.c)c0.a.a.a(uk.a, s, g0.f.c.class);
            return f$c0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f$c0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Kl(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Km(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Kn(String s) [...]

    private static Object Ko() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Kp(Function1 function10) [...]

    private static Object Kq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Kr(String s, String s1, o o0) [...]

    // 检测为 Lambda 实现
    private static g Ks(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Kt(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ku(String s, o o0) [...]

    private static Object Kv() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Kw(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Kx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ky(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Kz(o o0) [...]

    // 检测为 Lambda 实现
    public static Object L3() [...]

    // 检测为 Lambda 实现
    private static S0 LA(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 LB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 LC(Function1 function10) [...]

    private static Object LD() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 LE(Function1 function10) [...]

    @NonNull
    private static ArrayList LF(GalleryInfo galleryInfo0) {
        List list0 = galleryInfo0.N();
        int v1 = list0 == null ? 0 : list0.size();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < v1; ++v) {
            ((ProfileInfo)list0.get(v)).g();
        }
        return arrayList0;
    }

    public static g LG(boolean z, String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> {
            if(z) {
                function10.invoke("notify");
                return S0.a;
            }
            function10.invoke("del_notify");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("ko_name", s1))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Lj() {
        if(uk.b == null) {
            Object object0 = uk.c;
            synchronized(object0) {
                if(uk.b == null) {
                    uk.b = g.v1(new Rh()).T1(() -> uk.b = null).g0();
                }
            }
        }
        return uk.b;
    }

    public static g Lk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("my_transfer"))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("no", s))).w((String s) -> try {
            h0 h00 = (h0)c0.a.a.a(uk.a, s, h0.class);
            return h00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(h00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static g Ll(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Lm(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Ln(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Lo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Lp(Function1 function10) [...]

    private static Object Lq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Lr(String s) [...]

    // 检测为 Lambda 实现
    private static g Ls(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Lt(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Lu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Lv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Lw(VideoInfoData videoInfoData0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Lx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ly(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Lz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object M5() [...]

    // 检测为 Lambda 实现
    public static Object M8() [...]

    // 检测为 Lambda 实现
    private static g MA(String s) [...]

    // 检测为 Lambda 实现
    private static g MB(Gson gson0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 MC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 MD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ME(String s, o o0) [...]

    public static g MF(GalleryInfo galleryInfo0) {
        return g.v1(new C()).g3((String s) -> {
            String s3;
            String s1 = B.i7();
            if(m0.a.i(s1)) {
                throw new NullPointerException("unknown user");
            }
            String s2 = galleryInfo0.r() == null ? "" : galleryInfo0.r();
            if(galleryInfo0.d0()) {
                s3 = "https://m.dcinside.com/management/minor/main/" + m.d.i(s2);
            }
            else if(galleryInfo0.c0()) {
                s3 = "https://m.dcinside.com/management/mini/main/" + m.d.g(s2);
            }
            else {
                s3 = galleryInfo0.e0() ? "https://m.dcinside.com/management/person/main/" + m.d.h(s2) : "https://gall.dcinside.com/management/mobile";
            }
            Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
            if(galleryInfo0.q() == m.g) {
                uri$Builder0.appendQueryParameter("id", galleryInfo0.r());
            }
            uri$Builder0.appendQueryParameter("app_id", s);
            uri$Builder0.appendQueryParameter("confirm_id", s1);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.build().toString());
    }

    public static g MG(String s, String s1, boolean z) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("receive"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("no", s1))).R((o o0) -> // 去混淆评级： 低(20)
        (z ? ((S0)o0.invoke("receive", "1")) : ((S0)o0.invoke("receive", "0")))).w(new M2()));
    }

    private static g Mj() {
        return g.M6((n n0) -> {
            n0.onStart();
            Context context0 = Application.e();
            try {
                Signature[] arr_signature = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0x40).signatures;
                if(arr_signature.length > 0) {
                    Signature signature0 = arr_signature[0];
                    MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-1");
                    messageDigest0.update(signature0.toByteArray());
                    byte[] arr_b = messageDigest0.digest();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    for(int v = 0; v < arr_b.length; ++v) {
                        String s = Integer.toHexString(arr_b[v] & 0xFF);
                        int v1 = s.length();
                        for(int v2 = 0; v2 < 2 - v1; ++v2) {
                            stringBuilder0.append('0');
                        }
                        stringBuilder0.append(s);
                    }
                    n0.onNext(stringBuilder0.toString());
                }
                else {
                    n0.onError(new NullPointerException("Package info not found."));
                }
            }
            catch(Exception exception0) {
                n0.onError(exception0);
            }
            n0.d();
        });
    }

    public static g Mk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("user"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(s != null) {
                o0.invoke("id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.f.c f$c0 = (g0.f.c)c0.a.a.a(uk.a, s, g0.f.c.class);
            return f$c0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f$c0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static g Ml(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g Mm(String s) [...]

    private static Object Mn() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Mo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Mp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Mq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Mr(String s, String s1, String s2, String s3) [...]

    private static Object Ms() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Mt(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Mu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Mv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Mw(VideoInfoData videoInfoData0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Mx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 My(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Mz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object N3() [...]

    // 检测为 Lambda 实现
    public static Object N7() [...]

    // 检测为 Lambda 实现
    public static Object N9() [...]

    // 检测为 Lambda 实现
    private static g NA(String s) [...]

    private static Object NB() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 NC(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ND(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 NE(File file0, p p0) [...]

    public static g NF(String s, Integer integer0) {
        return g.v1(new C()).g3((String s) -> {
            Uri.Builder uri$Builder0 = Uri.parse("https://m.dcinside.com/api/management_board").buildUpon();
            uri$Builder0.appendQueryParameter("app_id", s);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("id", s)).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("no", Integer.toString(((int)integer0)))).g3((Uri.Builder uri$Builder0) -> {
            String s = B.i7();
            if(!m0.a.k(s)) {
                throw new NullPointerException("unknown user");
            }
            uri$Builder0.appendQueryParameter("confirm_id", s);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.build().toString());
    }

    public static g NG(boolean z, String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> {
            if(z) {
                function10.invoke("recomm");
                return S0.a;
            }
            function10.invoke("del_recomm");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("ko_name", s1))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Nj(X x0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("setting"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.o();
            if(integer0 != null) {
                o0.invoke("use_yn", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.f();
            if(integer0 != null) {
                o0.invoke("keyword", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.e();
            if(integer0 != null) {
                o0.invoke("attention", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.i();
            if(integer0 != null) {
                o0.invoke("recomm", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.d();
            if(integer0 != null) {
                o0.invoke("activity", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.g();
            if(integer0 != null) {
                o0.invoke("notify", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.j();
            if(integer0 != null) {
                o0.invoke("user", integer0.toString());
            }
            return S0.a;
        }).R((o o0) -> {
            Integer integer0 = x0.h();
            if(integer0 != null) {
                o0.invoke("recomm_article", integer0.toString());
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Nk(@NonNull Q q0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("hit_recommend"))).R((o o0) -> ((S0)o0.invoke("id", q0.G0()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(q0.c1())))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w(new M2()));
    }

    private static Object Nl() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Nm(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Nn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 No(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Np(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Nq(Function1 function10) [...]

    private static Object Nr() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Ns(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Nt(String s) [...]

    // 检测为 Lambda 实现
    private static g Nu(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Nv(String s, o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Nw(VideoInfoData videoInfoData0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Nx(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ny(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Nz(String s, o o0) [...]

    // 检测为 Lambda 实现
    public static Object O0() [...]

    private static Object OA() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 OB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 OC(Boolean boolean0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 OD(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 OE(String s, o o0) [...]

    public static g OF(String s, String s1, String s2, String s3, String s4, String s5, m m0) {
        return g.v1(new C()).f2((String s6) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("management"))).Q((Function1 function10) -> switch(m0) {
            case 1: 
            case 2: {
                function10.invoke("minor");
                return S0.a;
            }
            case 3: {
                function10.invoke("mini");
                return S0.a;
            }
            case 4: {
                function10.invoke("person");
                return S0.a;
            }
            default: {
                return S0.a;
            }
        }).Q((Function1 function10) -> ((S0)function10.invoke("blockImg"))).Q((Function1 function10) -> switch(m0) {
            case 1: 
            case 2: {
                function10.invoke(s);
                return S0.a;
            }
            case 3: {
                function10.invoke(m.d.g(s));
                return S0.a;
            }
            case 4: {
                function10.invoke(m.d.h(s));
                return S0.a;
            }
            default: {
                return S0.a;
            }
        }).R((o o0) -> ((S0)o0.invoke("app_id", s6))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", s1))).R((o o0) -> ((S0)o0.invoke("rel1", s2))).R((o o0) -> ((S0)o0.invoke("rel2", s3))).R((o o0) -> ((S0)o0.invoke("imgSrc", s4))).R((o o0) -> ((S0)o0.invoke("subject", s5))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g OG(boolean z, String s, String s1, String s2, String s3) {
        return g.v1(new C()).f2((String s4) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> {
            if(z) {
                function10.invoke("user");
                return S0.a;
            }
            function10.invoke("del_user");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s4))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s != null) {
                o0.invoke("id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(z && s1 != null) {
                o0.invoke("ko_name", s1);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s2 != null) {
                o0.invoke("user_id", s2);
            }
            return S0.a;
        }).R((o o0) -> {
            if(z && s3 != null) {
                o0.invoke("nickname", s3);
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Ob() [...]

    // 检测为 Lambda 实现
    public static Object Og() [...]

    public static g Oj(String s, Integer integer0, Integer integer1) {
        return g.v1(new C()).g3((String s) -> {
            Uri.Builder uri$Builder0 = Uri.parse("https://m.dcinside.com/api/minor_avoid").buildUpon();
            uri$Builder0.appendQueryParameter("app_id", s);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("id", s)).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("no", Integer.toString(((int)integer0)))).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("comment_no", Integer.toString(((int)integer1)))).g3((Uri.Builder uri$Builder0) -> {
            String s = B.i7();
            if(!m0.a.k(s)) {
                throw new NullPointerException("unknown user");
            }
            uri$Builder0.appendQueryParameter("confirm_id", s);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.build().toString());
    }

    public static g Ok(m m0) {
        switch(m0) {
            case 1: {
                return uk.vk().K(() -> "https://json.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> ((S0)function10.invoke("gallmain"))).G((Function1 function10) -> ((S0)function10.invoke("gallery_hot_day.php"))).w((String s) -> {
                    String s1;
                    try {
                        s = s.trim();
                        if(!s.startsWith("(") || !s.endsWith(")")) {
                            s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                        }
                        else {
                            s1 = s.substring(1, s.length() - 1);
                        }
                        if(s1 != null) {
                            List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                            if(list0 != null && !list0.isEmpty()) {
                                if(m0 == m.i) {
                                    for(Object object0: list0) {
                                        ((MinorRanking)object0).A();
                                    }
                                }
                                if(m0 == m.j) {
                                    for(Object object1: list0) {
                                        ((MinorRanking)object1).B();
                                    }
                                }
                                return g.Q2(list0);
                            }
                            return g.Q2(new ArrayList());
                        }
                    }
                    catch(Exception exception0) {
                        return xk.r(s, exception0);
                    }
                    return g.X1(new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                });
            }
            case 2: {
                return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> ((S0)function10.invoke("mgallmain"))).G((Function1 function10) -> ((S0)function10.invoke("mgallery_hot.php"))).w((String s) -> {
                    String s1;
                    try {
                        s = s.trim();
                        if(!s.startsWith("(") || !s.endsWith(")")) {
                            s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                        }
                        else {
                            s1 = s.substring(1, s.length() - 1);
                        }
                        if(s1 != null) {
                            List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                            if(list0 != null && !list0.isEmpty()) {
                                if(m0 == m.i) {
                                    for(Object object0: list0) {
                                        ((MinorRanking)object0).A();
                                    }
                                }
                                if(m0 == m.j) {
                                    for(Object object1: list0) {
                                        ((MinorRanking)object1).B();
                                    }
                                }
                                return g.Q2(list0);
                            }
                            return g.Q2(new ArrayList());
                        }
                    }
                    catch(Exception exception0) {
                        return xk.r(s, exception0);
                    }
                    return g.X1(new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                });
            }
            case 3: {
                return uk.vk().K(() -> "https://json.dcinside.com").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> ((S0)function10.invoke("mgallmain"))).G((Function1 function10) -> ((S0)function10.invoke("migallery_hot.php"))).w((String s) -> {
                    String s1;
                    try {
                        s = s.trim();
                        if(!s.startsWith("(") || !s.endsWith(")")) {
                            s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                        }
                        else {
                            s1 = s.substring(1, s.length() - 1);
                        }
                        if(s1 != null) {
                            List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                            if(list0 != null && !list0.isEmpty()) {
                                if(m0 == m.i) {
                                    for(Object object0: list0) {
                                        ((MinorRanking)object0).A();
                                    }
                                }
                                if(m0 == m.j) {
                                    for(Object object1: list0) {
                                        ((MinorRanking)object1).B();
                                    }
                                }
                                return g.Q2(list0);
                            }
                            return g.Q2(new ArrayList());
                        }
                    }
                    catch(Exception exception0) {
                        return xk.r(s, exception0);
                    }
                    return g.X1(new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                });
            }
            default: {
                return uk.vk().K(() -> "https://json.dcinside.com").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> ((S0)function10.invoke("mgallmain"))).G((Function1 function10) -> ((S0)function10.invoke("prgallery_hot.php"))).w((String s) -> {
                    String s1;
                    try {
                        s = s.trim();
                        if(!s.startsWith("(") || !s.endsWith(")")) {
                            s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                        }
                        else {
                            s1 = s.substring(1, s.length() - 1);
                        }
                        if(s1 != null) {
                            List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                            if(list0 != null && !list0.isEmpty()) {
                                if(m0 == m.i) {
                                    for(Object object0: list0) {
                                        ((MinorRanking)object0).A();
                                    }
                                }
                                if(m0 == m.j) {
                                    for(Object object1: list0) {
                                        ((MinorRanking)object1).B();
                                    }
                                }
                                return g.Q2(list0);
                            }
                            return g.Q2(new ArrayList());
                        }
                    }
                    catch(Exception exception0) {
                        return xk.r(s, exception0);
                    }
                    return g.X1(new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static S0 Ol(Function1 function10) [...]

    private static Object Om() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 On(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Oo(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Op(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Oq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Or(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Os(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Ot(boolean z, String s, int v, String s1, String s2, String s3) [...]

    // 检测为 Lambda 实现
    private static g Ou(m m0, String s, String s1, String s2, String s3, String s4, String s5, String s6) [...]

    // 检测为 Lambda 实现
    private static S0 Ov(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ow(VideoInfoData videoInfoData0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ox(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Oy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Oz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object P() [...]

    // 检测为 Lambda 实现
    public static Object P1() [...]

    // 检测为 Lambda 实现
    public static Object P4() [...]

    // 检测为 Lambda 实现
    private static S0 PA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 PB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g PC(String s) [...]

    // 检测为 Lambda 实现
    private static S0 PD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 PE(String s, o o0) [...]

    public static g PF(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("manager_entrust"))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("entrust_memo", s))).R((o o0) -> ((S0)o0.invoke("id", s1))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).w(new jg()));
    }

    public static g PG(String s, String[] arr_s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("autozzal"))).Q((Function1 function10) -> ((S0)function10.invoke("insert"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s.equals("__DC_GLOBAL_DEF_IMAGE_ID")) {
                s = "X";
            }
            o0.invoke("id", s);
            return S0.a;
        }).R((o o0) -> {
            if(arr_s != null && arr_s.length > 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    try {
                        String s = arr_s[v];
                        if(m0.a.k(s)) {
                            o0.invoke(String.format(Locale.ENGLISH, "img[%d]", v), s);
                        }
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException(exception0);
                    }
                }
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            if(f00 != null) {
                return f00.f() ? g.Q2(f00) : g.X1(new com.dcinside.app.http.f(f00.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Pb() [...]

    // 检测为 Lambda 实现
    public static Object Pd() [...]

    public static g Pj() {
        return uk.e.d();
    }

    public static String Pk(String s, int v) {
        m m0 = m.d.b(s);
        String s1 = m.d.i(s);
        if(m0 == m.i) {
            return String.format(Locale.ENGLISH, "https://%s/mini/%s/%d", "m.dcinside.com", s1, v);
        }
        return m0 == m.j ? String.format(Locale.ENGLISH, "https://%s/person/%s/%d", "m.dcinside.com", s1, v) : String.format(Locale.ENGLISH, "https://%s/%s/%d", "gall.dcinside.com", s1, v);
    }

    // 检测为 Lambda 实现
    private static S0 Pl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Pm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Pn(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Po(o o0) [...]

    // 检测为 Lambda 实现
    private static g Pp(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Pq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Pr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ps(Function1 function10) [...]

    private static Object Pt() [...] // Inlined contents

    private static Object Pu() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Pv(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Pw(VideoInfoData videoInfoData0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Px(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Py(V v0, o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Pz(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    public static Object Q3() [...]

    // 检测为 Lambda 实现
    private static S0 QA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g QB(Gson gson0, String s) [...]

    // 检测为 Lambda 实现
    private static g QC(Boolean boolean0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 QD(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 QE(boolean z, o o0) [...]

    public static g QF(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("manager_info"))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).w(new Cj()));
    }

    public static g QG(String[] arr_s, @Nullable com.dcinside.app.http.p p0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("upload_img_auto.php"))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s))).S((p p1) -> {
            if(arr_s != null && arr_s.length > 0) {
                int v = 0;
                while(v < arr_s.length) {
                    try {
                        String s = arr_s[v];
                        if(m0.a.k(s)) {
                            File file0 = new File(s);
                            String s1 = String.format(Locale.ENGLISH, "upload[%d]", v);
                            com.dcinside.app.http.l.b l$b0 = p0 == null || p0.b() == null ? null : p0.b()[v];
                            p1.invoke(s1, file0.getName(), com.dcinside.app.http.n.b(file0, l$b0));
                        }
                        ++v;
                        continue;
                    }
                    catch(Exception exception0) {
                    }
                    throw new RuntimeException(exception0);
                }
            }
            return S0.a;
        }).w((String s) -> try {
            j0.e e0 = (j0.e)c0.a.a.a(uk.a, s, j0.e.class);
            if(e0 != null) {
                return e0.f() ? g.Q2(e0) : g.X1(new com.dcinside.app.http.f(e0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Qe() [...]

    // 检测为 Lambda 实现
    public static Object Qg() [...]

    public static g Qj(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("chk_upload_restriction"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("mode", "img"))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Qk(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("memberjoin_ok"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("question_memo", s1))).w((String s) -> try {
            return g.Q2(((com.dcinside.app.response.d)c0.a.a.a(uk.a, s, com.dcinside.app.response.d.class)));
        }
        catch(Exception exception0) {
            return xk.r(s, exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Ql(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Qm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Qn(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Qo(String[] arr_s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Qp(String s, String s1, String s2, String s3) [...]

    // 检测为 Lambda 实现
    private static g Qq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Qr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Qs(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Qt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Qu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Qv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Qw(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Qx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Qy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static g Qz(i0.a a0, boolean z, String s) [...]

    // 检测为 Lambda 实现
    private static S0 RA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static void RB(SparseArray sparseArray0, F0 f00) [...]

    private static Object RC() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 RD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g RE(String s, File file0, String s1, boolean z, String s2) [...]

    public static g RF(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("minor-notification"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).w((String s) -> try {
            I i0 = (I)c0.a.a.a(uk.a, s, I.class);
            return i0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(i0.l());  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g RG(String s, String s1, com.dcinside.app.http.l.b l$b0) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://m4up4.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("movie_upload_v1.php"))).R((o o0) -> ((S0)o0.invoke("id", s))).S((p p0) -> {
            if(m0.a.k(s1)) {
                File file0 = new File(s1);
                p0.invoke("avatar", file0.getName(), com.dcinside.app.http.n.c(file0, l$b0));
            }
            return S0.a;
        }).w((String s) -> try {
            VideoUploadResult videoUploadResult0 = (VideoUploadResult)c0.a.a.a(uk.a, s, VideoUploadResult.class);
            return videoUploadResult0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(videoUploadResult0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g Rj(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("chk_upload_restriction"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("mode", "movie"))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    private static Object Rk() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Rl(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Rm(Q q0, o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Rn(o o0) [...]

    // 检测为 Lambda 实现
    private static g Ro(String s) [...]

    private static Object Rp() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Rq(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Rr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Rs(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Rt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ru(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Rv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Rw(String s, VideoInfoData videoInfoData0, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Rx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ry(V v0, o o0) [...]

    private static Object Rz() [...] // Inlined contents

    // 检测为 Lambda 实现
    public static Object S0() [...]

    // 检测为 Lambda 实现
    private static S0 SA(String s, p p0) [...]

    // 检测为 Lambda 实现
    private static Boolean SB(List list0, List list1) [...]

    // 检测为 Lambda 实现
    private static S0 SC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 SD(boolean z, String s, o o0) [...]

    private static Object SE() [...] // Inlined contents

    public static g SF(String s, String s1, String s2, m m0) {
        return g.v1(new C()).f2((String s3) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("management"))).Q((Function1 function10) -> switch(m0) {
            case 1: 
            case 2: {
                function10.invoke("minor");
                return S0.a;
            }
            case 3: {
                function10.invoke("mini");
                return S0.a;
            }
            case 4: {
                function10.invoke("person");
                return S0.a;
            }
            default: {
                return S0.a;
            }
        }).Q((Function1 function10) -> ((S0)function10.invoke("blockImgClear"))).Q((Function1 function10) -> switch(m0) {
            case 1: 
            case 2: {
                function10.invoke(s);
                return S0.a;
            }
            case 3: {
                function10.invoke(m.d.g(s));
                return S0.a;
            }
            case 4: {
                function10.invoke(m.d.h(s));
                return S0.a;
            }
            default: {
                return S0.a;
            }
        }).R((o o0) -> ((S0)o0.invoke("app_id", s3))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("rel1", s1))).R((o o0) -> ((S0)o0.invoke("rel2", s2))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g SG(String s, VideoInfoData videoInfoData0) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("movie"))).Q((Function1 function10) -> ((S0)function10.invoke("insert-mvinfo"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> // 去混淆评级： 低(20)
        (videoInfoData0.q() ? ((S0)o0.invoke("mv_allow_down", "1")) : ((S0)o0.invoke("mv_allow_down", "0")))).R((o o0) -> ((S0)o0.invoke("mv_thumb", videoInfoData0.v()))).R((o o0) -> ((S0)o0.invoke("mv_width", String.valueOf(videoInfoData0.y())))).R((o o0) -> ((S0)o0.invoke("mv_height", String.valueOf(videoInfoData0.t())))).R((o o0) -> ((S0)o0.invoke("mv_desc", videoInfoData0.r()))).R((o o0) -> ((S0)o0.invoke("mv_tag", videoInfoData0.u()))).w((String s) -> try {
            VideoInfoUploadResult videoInfoUploadResult0 = (VideoInfoUploadResult)c0.a.a.a(uk.a, s, VideoInfoUploadResult.class);
            return videoInfoUploadResult0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(videoInfoUploadResult0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object Si() [...]

    public static g Sj(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("memberjoincancel"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("id", s))).w(new M2()));
    }

    // 检测为 Lambda 实现
    private static S0 Sk(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Sl(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Sm(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Sn(String[] arr_s, o o0) [...]

    // 检测为 Lambda 实现
    private static g So(String[] arr_s, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Sp(Function1 function10) [...]

    private static Object Sq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Sr(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ss(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 St(String s, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Su(o o0) [...]

    // 检测为 Lambda 实现
    private static g Sv(String s) [...]

    private static Object Sw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Sx(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Sy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Sz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object T0() [...]

    // 检测为 Lambda 实现
    public static Object T2() [...]

    // 检测为 Lambda 实现
    private static g TA(String s) [...]

    private static Object TB() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 TC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 TD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 TE(Function1 function10) [...]

    public static g TF(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("memberjoin"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("id", s))).w((String s) -> try {
            return g.Q2(((com.dcinside.app.response.c)c0.a.a.a(uk.a, s, com.dcinside.app.response.c.class)));
        }
        catch(Exception exception0) {
            return xk.r(s, exception0);
        }));
    }

    public static String TG(String s, int v, @NonNull m m0) {
        if(v > 0) {
            if(m0 == m.i) {
                Object[] arr_object = {"m.dcinside.com", m.d.g(s), v};
                return String.format(Locale.ENGLISH, "https://%s/mini/%s/%d", arr_object);
            }
            if(m0 == m.j) {
                Object[] arr_object1 = {"m.dcinside.com", m.d.h(s), v};
                return String.format(Locale.ENGLISH, "https://%s/person/%s/%d", arr_object1);
            }
            return String.format(Locale.ENGLISH, "https://%s/board/%s/%d", "m.dcinside.com", s, v);
        }
        if(m0 == m.i) {
            Object[] arr_object2 = {"m.dcinside.com", m.d.g(s)};
            return String.format(Locale.ENGLISH, "https://%s/mini/%s", arr_object2);
        }
        if(m0 == m.j) {
            Object[] arr_object3 = {"m.dcinside.com", m.d.h(s)};
            return String.format(Locale.ENGLISH, "https://%s/person/%s", arr_object3);
        }
        return String.format(Locale.ENGLISH, "https://%s/board/%s", "m.dcinside.com", s);
    }

    // 检测为 Lambda 实现
    public static Object Te() [...]

    public static g Tj(String s, int v) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("minor-notificationconfirm"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", String.valueOf(v)))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Tk(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Tl(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Tm(o o0) [...]

    // 检测为 Lambda 实现
    private static g Tn(String s) [...]

    private static Object To() [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 Tp(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Tq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Tr(g0.b b0, o o0) [...]

    // 检测为 Lambda 实现
    private static g Ts(String s) [...]

    // 检测为 Lambda 实现
    private static g Tt(String s, String s1, int v, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Tu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Tv(String s, int v, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Tw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Tx(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Ty(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Tz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object U6() [...]

    // 检测为 Lambda 实现
    private static g UA(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 UB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 UC(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 UD(boolean z, String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 UE(Function1 function10) [...]

    public static g UF() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("migallmain"))).G((Function1 function10) -> ((S0)function10.invoke("migallery_ranking.php"))).w((String s) -> {
            String s1;
            try {
                s = s.trim();
                if(!s.startsWith("(") || !s.endsWith(")")) {
                    s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                }
                else {
                    s1 = s.substring(1, s.length() - 1);
                }
                if(s1 != null) {
                    List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                    if(list0 != null && !list0.isEmpty()) {
                        for(Object object0: list0) {
                            ((MinorRanking)object0).A();
                        }
                        return g.Q2(list0);
                    }
                    return g.Q2(new ArrayList());
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return g.X1(new com.dcinside.app.http.f(0x7F150324));  // string:failed_main_ranking "실시간 북적 갤러리 목록을 불러올 수 없습니다."
        });
    }

    public static String UG(String s, int v, @NonNull m m0, int v1) {
        if(v > 0) {
            if(m0 == m.i) {
                Object[] arr_object = {"m.dcinside.com", m.d.g(s), v, v1};
                return String.format(Locale.ENGLISH, "https://%s/mini/%s/%d?comment=%d", arr_object);
            }
            if(m0 == m.j) {
                Object[] arr_object1 = {"m.dcinside.com", m.d.h(s), v, v1};
                return String.format(Locale.ENGLISH, "https://%s/person/%s/%d?comment=%d", arr_object1);
            }
            return String.format(Locale.ENGLISH, "https://%s/board/%s/%d?comment=%d", "m.dcinside.com", s, v, v1);
        }
        if(m0 == m.i) {
            Object[] arr_object2 = {"m.dcinside.com", m.d.g(s), v1};
            return String.format(Locale.ENGLISH, "https://%s/mini/%s?comment=%d", arr_object2);
        }
        if(m0 == m.j) {
            Object[] arr_object3 = {"m.dcinside.com", m.d.h(s), v1};
            return String.format(Locale.ENGLISH, "https://%s/person/%s?comment=%d", arr_object3);
        }
        return String.format(Locale.ENGLISH, "https://%s/board/%s?comment=%d", "m.dcinside.com", s, v1);
    }

    public static g Uj(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("cancel_transfer"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", s))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Uk(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Ul(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Um(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Un(String[] arr_s, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Uo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Up(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Uq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ur(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static g Us(String s, String s1) [...]

    private static Object Ut() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Uu(String s, o o0) [...]

    private static Object Uv() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Uw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Ux(String s, int v, String s1, String s2, String s3, String s4) [...]

    // 检测为 Lambda 实现
    private static g Uy(V v0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Uz(i0.a a0, o o0) [...]

    private static Object VA() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 VB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 VC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g VD(String s) [...]

    // 检测为 Lambda 实现
    private static S0 VE(o o0) [...]

    public static g VF(String s, int v, int v1) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("_manager_request.php"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("mode", "headtext"))).R((o o0) -> ((S0)o0.invoke("headtxt_no", Integer.toString(v1)))).w((String s) -> {
            try {
                K k0 = (K)c0.a.a.a(uk.a, s, K.class);
                if(k0 != null) {
                    return k0.f() ? g.Q2(k0) : g.X1(new com.dcinside.app.http.f(k0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static String VG(String s, @NonNull m m0) {
        return uk.TG(s, 0, m0);
    }

    // 检测为 Lambda 实现
    public static Object Ve() [...]

    // 检测为 Lambda 实现
    public static Object Vg() [...]

    public static String Vj(f f0, String s, String s1) {
        return (String)g.v1(new a1(f0, s, s1)).x6().p();
    }

    // 检测为 Lambda 实现
    private static S0 Vk(String s, o o0) [...]

    private static Object Vl() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g Vm(Q q0, String s) [...]

    private static Object Vn() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Vo(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Vp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Vq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Vr(String s) [...]

    private static Object Vs() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Vt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Vu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Vv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Vw(o o0) [...]

    private static Object Vx() [...] // Inlined contents

    private static Object Vy() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Vz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object W5() [...]

    // 检测为 Lambda 实现
    private static S0 WA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 WB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 WC(o o0) [...]

    // 检测为 Lambda 实现
    private static g WD(boolean z, String s, String s1, String s2, String s3, String s4) [...]

    // 检测为 Lambda 实现
    private static S0 WE(String s, o o0) [...]

    public static g WF(String s, int v, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("_manager_request.php"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("mode", s1))).w((String s) -> {
            try {
                K k0 = (K)c0.a.a.a(uk.a, s, K.class);
                if(k0 != null) {
                    return k0.f() ? g.Q2(k0) : g.X1(new com.dcinside.app.http.f(k0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g WG(String s, File file0, String s1, boolean z) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_vr_board.php"))).R((o o0) -> ((S0)o0.invoke("gall_id", s))).S((p p0) -> ((S0)p0.invoke("upfile", file0.getName(), com.dcinside.app.http.n.a(file0, null)))).R((o o0) -> {
            String s1 = B.i7();
            if(m0.a.h(s1)) {
                try {
                    o0.invoke("name", (s1 == null ? null : URLEncoder.encode(s1, "UTF-8")));
                    return S0.a;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException(unsupportedEncodingException0);
                }
            }
            o0.invoke("user_id", s1);
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> // 去混淆评级： 低(20)
        (z ? ((S0)o0.invoke("down_chk", "1")) : ((S0)o0.invoke("down_chk", "0")))).w(new M2()));
    }

    // 检测为 Lambda 实现
    public static Object Wh() [...]

    public static g Wj(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("autozzal"))).Q((Function1 function10) -> ((S0)function10.invoke("main_image"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s.equals("__DC_GLOBAL_DEF_IMAGE_ID")) {
                s = "X";
            }
            o0.invoke("id", s);
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("img", s1))).w((String s) -> try {
            j0.b b0 = (j0.b)c0.a.a.a(uk.a, s, j0.b.class);
            if(b0 != null) {
                return b0.f() ? g.Q2(b0) : g.X1(new com.dcinside.app.http.f(b0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Wk(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Wl(Function1 function10) [...]

    private static Object Wm() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Wn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Wo(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Wp(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Wq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Wr(g0.b b0, int v, String s) [...]

    // 检测为 Lambda 实现
    private static S0 Ws(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Wt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Wu(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Wv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ww(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Wx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Wy(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Wz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object X1() [...]

    // 检测为 Lambda 实现
    public static Object X3() [...]

    // 检测为 Lambda 实现
    public static Object X5() [...]

    // 检测为 Lambda 实现
    public static Object X6() [...]

    // 检测为 Lambda 实现
    private static S0 XA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 XB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 XC(String s, o o0) [...]

    private static Object XD() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 XE(String s, o o0) [...]

    public static g XF(String s, int v, int[] arr_v) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("_manager_request.php"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("mode", "change_noti"))).R((o o0) -> {
            if(arr_v != null) {
                for(int v = 0; v < arr_v.length; ++v) {
                    o0.invoke(String.format(Locale.ENGLISH, "o_no[%d]", v), String.valueOf(arr_v[v]));
                }
            }
            return S0.a;
        }).w((String s) -> {
            try {
                K k0 = (K)c0.a.a.a(uk.a, s, K.class);
                if(k0 != null) {
                    return k0.f() ? g.Q2(k0) : g.X1(new com.dcinside.app.http.f(k0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g XG(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("memberout_ok"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("id", s))).w(new M2()));
    }

    // 检测为 Lambda 实现
    public static Object Xa() [...]

    // 检测为 Lambda 实现
    public static Object Xb() [...]

    // 检测为 Lambda 实现
    public static Object Xc() [...]

    // 检测为 Lambda 实现
    public static Object Xe() [...]

    public static g Xj(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("fixtoday"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("no", s1))).w((String s) -> try {
            return g.Q2(((f0)c0.a.a.a(uk.a, s, f0.class)));
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 Xk(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Xl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Xm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Xn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Xo(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static g Xp(String s) [...]

    // 检测为 Lambda 实现
    private static g Xq(String s) [...]

    private static Object Xr() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Xs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g Xt(String s) [...]

    private static Object Xu() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Xv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g Xw(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Xx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Xy(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Xz(o o0) [...]

    // 检测为 Lambda 实现
    public static Object Y7() [...]

    // 检测为 Lambda 实现
    private static S0 YA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 YB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 YC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 YD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g YE(String s, String s1) [...]

    public static g YF() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("mgallmain"))).G((Function1 function10) -> ((S0)function10.invoke("mgallery_ranking.php"))).w((String s) -> {
            String s1;
            try {
                s = s.trim();
                if(!s.startsWith("(") || !s.endsWith(")")) {
                    s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                }
                else {
                    s1 = s.substring(1, s.length() - 1);
                }
                if(s1 != null) {
                    List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                    return list0 == null || list0.size() <= 0 ? g.Q2(new ArrayList()) : g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return g.X1(new com.dcinside.app.http.f(0x7F150324));  // string:failed_main_ranking "실시간 북적 갤러리 목록을 불러올 수 없습니다."
        });
    }

    public static g YG(P p0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_vote_upload.php"))).R((o o0) -> ((S0)o0.invoke("id", p0.d()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> {
            String s = p0.k();
            if(s != null) {
                o0.invoke("title", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(p0.a()) {
                o0.invoke("multi", "1");
                Integer integer0 = p0.e();
                if(integer0 != null) {
                    o0.invoke("multi_cnt", String.format(Locale.ENGLISH, "%d", integer0));
                    return S0.a;
                }
            }
            else {
                o0.invoke("multi", "0");
            }
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("preview", String.format(Locale.ENGLISH, "%d", ((int)p0.b())));
            return S0.a;
        }).R((o o0) -> {
            String s = p0.c();
            if(s == null) {
                o0.invoke("end_date_set", "0");
                return S0.a;
            }
            o0.invoke("end_date_set", "1");
            o0.invoke("end_date", s);
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("permission", p0.f());
            return S0.a;
        }).R((o o0) -> {
            String[] arr_s = p0.i();
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    o0.invoke(String.format(Locale.ENGLISH, "voteItem[%d]", v), arr_s[v]);
                }
            }
            return S0.a;
        }).S((p p1) -> {
            String[] arr_s = p0.h();
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    try {
                        String s = arr_s[v];
                        if(m0.a.k(s)) {
                            File file0 = new File(s);
                            p1.invoke(String.format(Locale.ENGLISH, "vote_img[%d]", v), file0.getName(), com.dcinside.app.http.n.b(file0, null));
                        }
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException(exception0);
                    }
                }
            }
            return S0.a;
        }).w(new M2()));
    }

    public static g Yj(String s, Class class0) {
        try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, class0);
            if(f00 != null) {
                return f00.f() ? g.Q2(f00) : g.X1(new com.dcinside.app.http.f(f00.a()));
            }
        }
        catch(Exception exception0) {
            return xk.r(s, exception0);
        }
        return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
    }

    // 检测为 Lambda 实现
    private static S0 Yk(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Yl(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Ym(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Yn(o o0) [...]

    // 检测为 Lambda 实现
    private static g Yo(String s) [...]

    // 检测为 Lambda 实现
    private static g Yp(boolean z, String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g Yq(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 Yr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Ys(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    private static g Yt(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Yu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Yv(o o0) [...]

    // 检测为 Lambda 实现
    private static g Yw(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Yx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Yy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Yz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object Z() [...]

    // 检测为 Lambda 实现
    public static Object Z3() [...]

    // 检测为 Lambda 实现
    public static Object Z4() [...]

    // 检测为 Lambda 实现
    private static S0 ZA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ZB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ZC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ZD(Function1 function10) [...]

    private static Object ZE() [...] // Inlined contents

    public static g ZF(P p0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("votemodify"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("id", p0.d()))).R((o o0) -> {
            Integer integer0 = p0.j();
            if(integer0 != null) {
                o0.invoke("no", Integer.toString(((int)integer0)));
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("vote_confirm", p0.g()))).R((o o0) -> {
            String s = p0.c();
            if(s == null) {
                o0.invoke("end_date_set", "0");
                return S0.a;
            }
            o0.invoke("end_date_set", "1");
            o0.invoke("end_date", s);
            return S0.a;
        }).w(new M2()));
    }

    public static g ZG(@Nullable String s, @Nullable String s1) {
        return uk.Mj().f2((String s2) -> uk.vk().K(() -> "https://www.googleapis.com/").v((o o0) -> ((S0)o0.invoke("X-Android-Package", "com.dcinside.app.android"))).v((o o0) -> ((S0)o0.invoke("X-Android-Cert", s2))).G((Function1 function10) -> ((S0)function10.invoke("youtube"))).G((Function1 function10) -> ((S0)function10.invoke("v3"))).G((Function1 function10) -> ((S0)function10.invoke("search"))).H((o o0) -> ((S0)o0.invoke("part", "id,snippet"))).H((o o0) -> ((S0)o0.invoke("q", s))).H((o o0) -> ((S0)o0.invoke("pageToken", s1))).H((o o0) -> ((S0)o0.invoke("maxResults", Long.toString(Math.min(Math.max(jl.a.U0(), 1L), 50L))))).H((o o0) -> ((S0)o0.invoke("type", "video"))).H((o o0) -> ((S0)o0.invoke("fields", "items(id(videoId),snippet(publishedAt,channelTitle,title,thumbnails(high(url)))),nextPageToken"))).H((o o0) -> try {
            String s = jl.a.J0();
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(new byte[]{-91, 26, 0, 73, 67, 65, 34, 25, 23, -73, -65, 44, -106, 19, 38, 78, -59, 36, -78, -84, -86, 94, 40, -28, 24, 38, 91, 93, 9, 85, 19, -66}, "AES");
            Charset charset0 = StandardCharsets.UTF_8;
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec("0123456789012345".getBytes(charset0));
            Cipher cipher0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher0.init(2, secretKeySpec0, ivParameterSpec0);
            o0.invoke("key", new String(cipher0.doFinal(Base64.decode(s, 0)), charset0));
            return S0.a;
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }).s(new T1()).w((String s) -> {
            try {
                YoutubeSearchResult youtubeSearchResult0 = (YoutubeSearchResult)c0.a.a.a(uk.a, s, YoutubeSearchResult.class);
                if(youtubeSearchResult0 != null) {
                    if(youtubeSearchResult0.c() == null) {
                        List list0 = youtubeSearchResult0.e();
                        for(int v = 0; v < list0.size(); ++v) {
                            Item youtubeSearchResult$Item0 = (Item)list0.get(v);
                            if(youtubeSearchResult$Item0 != null) {
                                youtubeSearchResult$Item0.d();
                            }
                        }
                        return g.Q2(youtubeSearchResult0);
                    }
                    return g.X1(new com.dcinside.app.http.f(youtubeSearchResult0.c().d()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g Zj(@NonNull Q q0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("bestcontent"))).Q((Function1 function10) -> ((S0)function10.invoke("recommend"))).R((o o0) -> ((S0)o0.invoke("id", q0.G0()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(q0.c1())))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w(new M2()));
    }

    // 检测为 Lambda 实现
    private static g Zk(String s) [...]

    // 检测为 Lambda 实现
    private static S0 Zl(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Zm(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Zn(com.dcinside.app.model.p p0, o o0) [...]

    // 检测为 Lambda 实现
    private static g Zo(int v, String s) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static g Zp(String s, String s1) [...]

    private static Object Zq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Zr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Zs(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    private static g Zt(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 Zu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 Zv(int v, o o0) [...]

    private static Object Zw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 Zx(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Zy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 Zz(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object a0() [...]

    // 检测为 Lambda 实现
    private static S0 aA(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 aB(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 aC(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static g aD(String s) [...]

    // 检测为 Lambda 实现
    private static S0 aE(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 aF(Function1 function10) [...]

    public static g aG(String s, VideoInfoData videoInfoData0) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("movie"))).Q((Function1 function10) -> ((S0)function10.invoke("modify-mvinfo"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("mv_token", videoInfoData0.x()))).R((o o0) -> ((S0)o0.invoke("mv_no", videoInfoData0.w()))).R((o o0) -> // 去混淆评级： 低(20)
        (videoInfoData0.q() ? ((S0)o0.invoke("mv_allow_down", "1")) : ((S0)o0.invoke("mv_allow_down", "0")))).R((o o0) -> ((S0)o0.invoke("mv_desc", videoInfoData0.r()))).R((o o0) -> ((S0)o0.invoke("mv_tag", videoInfoData0.u()))).w((String s) -> try {
            VideoInfoUploadResult videoInfoUploadResult0 = (VideoInfoUploadResult)c0.a.a.a(uk.a, s, VideoInfoUploadResult.class);
            return videoInfoUploadResult0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(videoInfoUploadResult0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object ad() [...]

    public static g ak(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("package_idx", s))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "buy_dccon"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).w((String s) -> {
            try {
                u u0 = (u)c0.a.a.a(uk.a, s, u.class);
                if(u0 != null) {
                    if(!"1005".equals(u0.d()) && !"6002".equals(u0.d())) {
                        return "6003".equals(u0.d()) ? g.X1(new com.dcinside.app.http.f(0x7F150325)) : g.X1(new com.dcinside.app.http.f(u0.c()));  // string:failed_not_enough_mandu "보유 만두가 부족합니다.\n모바일 웹 [MY] > [MY만두] 메뉴에서 충전 후 결제해주세요."
                    }
                    return g.Q2(u0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    private static g al(String s, String s1, String s2, String s3) [...]

    // 检测为 Lambda 实现
    private static S0 am(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 an(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ao(com.dcinside.app.model.p p0, o o0) [...]

    private static Object ap() [...] // Inlined contents

    private static Object aq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ar(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 as(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 at(o o0) [...]

    private static Object au() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 av(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 aw(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ax(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ay(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 az(o o0) [...]

    // 检测为 Lambda 实现
    public static Object b() [...]

    // 检测为 Lambda 实现
    public static Object b5() [...]

    // 检测为 Lambda 实现
    private static S0 bA(i0.a a0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bB(o o0) [...]

    // 检测为 Lambda 实现
    private static g bC(String s) [...]

    // 检测为 Lambda 实现
    private static g bD(boolean z, String s, String s1, String s2, String s3) [...]

    // 检测为 Lambda 实现
    private static S0 bE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bF(P p0, o o0) [...]

    public static g bG() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("mymanageGallChk"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.response.e.class);
                com.dcinside.app.response.e e0 = list0 == null || list0.isEmpty() ? null : ((com.dcinside.app.response.e)list0.get(0));
                if(e0 != null) {
                    if(m0.a.h(e0.d()) && m0.a.h(e0.a())) {
                        e0.i();
                        e0.i();
                        return g.Q2(e0);
                    }
                    return g.X1(new com.dcinside.app.http.f(e0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    public static Object ba() [...]

    // 检测为 Lambda 实现
    public static Object bh() [...]

    public static g bk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("package_idx", s))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "package_detail"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).w((String s) -> {
            try {
                com.dcinside.app.model.o o0 = (com.dcinside.app.model.o)c0.a.a.a(uk.a, s, com.dcinside.app.model.o.class);
                if(o0 != null) {
                    return o0.c() == null || o0.c().size() <= 0 || o0.b() == null || o0.b().size() <= 0 ? g.X1(new com.dcinside.app.http.f(0x7F150315, new Object[]{o0.a()})) : g.Q2(o0);  // string:failed_dccon_buy_layer "이 디시콘을 찾을 수 없습니다. (%1$s)"
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    private static Object bl() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g bm(String s, String s1) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 bn(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 bo(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 bq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 br(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 bs(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bt(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 bv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bw(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 bx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g bz(String s) [...]

    // 检测为 Lambda 实现
    private static S0 cA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cB(V.z z0, o o0) [...]

    // 检测为 Lambda 实现
    private static g cC(String s, String s1, String s2, boolean z, String s3) [...]

    private static Object cD() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 cE(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cF(String s, o o0) [...]

    public static g cG() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("myminijoinGallChk"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.response.h.class);
                com.dcinside.app.response.h h0 = list0 == null || list0.size() <= 0 ? null : ((com.dcinside.app.response.h)list0.get(0));
                if(h0 != null) {
                    if(m0.a.h(h0.d()) && m0.a.h(h0.a())) {
                        h0.m();
                        return g.Q2(h0);
                    }
                    return g.X1(new com.dcinside.app.http.f(h0.a()));
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    public static g ck() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "list"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w((String s) -> {
            try {
                com.dcinside.app.model.q q0 = (com.dcinside.app.model.q)c0.a.a.a(uk.a, s, com.dcinside.app.model.q.class);
                if(q0 != null) {
                    if(m0.a.h(q0.d()) && m0.a.h(q0.a())) {
                        List list0 = q0.c();
                        return list0 == null || list0.size() <= 0 ? g.X1(new com.dcinside.app.http.f(0x7F150316)) : g.Q2(q0);  // string:failed_dccon_empty "사용 가능한 디시콘이 없습니다."
                    }
                    if(m0.a.j(q0.a())) {
                        return g.X1(new com.dcinside.app.http.f(q0.a()));
                    }
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    private static S0 cl(Function1 function10) [...]

    private static Object cm() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 cn(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 co(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 cq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cs(o o0) [...]

    // 检测为 Lambda 实现
    private static g ct(Q q0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 cu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 cv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cw(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cx(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 cy(PostHead postHead0, o o0) [...]

    // 检测为 Lambda 实现
    private static g cz(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g dA(i0.a a0, String s) [...]

    // 检测为 Lambda 实现
    private static g dB(String s) [...]

    private static Object dC() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 dD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 dE(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 dF(o o0) [...]

    public static g dG() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json0"))).G((Function1 function10) -> {
            function10.invoke("app_dc_notice_new.php");
            return S0.a;
        }).w((String s) -> try {
            M m0 = (M)c0.a.a.a(uk.a, s, M.class);
            return m0 == null || !"true".equals(m0.e()) || !m0.a.k(m0.f()) ? g.Q2("") : g.Q2(m0.f());
        }
        catch(Exception unused_ex) {
            return g.Q2("");
        });
    }

    // 检测为 Lambda 实现
    public static Object dc() [...]

    public static g dk() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "recent"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, com.dcinside.app.model.p.class);
                if(list0 != null) {
                    if(list0.size() == 0) {
                        return g.Q2(list0);
                    }
                    com.dcinside.app.model.p p0 = (com.dcinside.app.model.p)list0.get(0);
                    return !m0.a.h(p0.d()) || !m0.a.h(p0.a()) ? g.X1(new com.dcinside.app.http.f(p0.a())) : g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    private static S0 dl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 dm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g dn(String s) [...]

    // 检测为 Lambda 实现
    private static S0 dp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 dq(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 dr(o o0) [...]

    // 检测为 Lambda 实现
    private static g ds(String s) [...]

    private static Object dt() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 du(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g dv(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g dw(String s) [...]

    // 检测为 Lambda 实现
    private static S0 dx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 dy(com.dcinside.app.type.I i0, o o0) [...]

    private static Object dz() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static Uri.Builder eA(String s) [...]

    // 检测为 Lambda 实现
    private static g eB(V.z z0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 eC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 eD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 eE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 eF(o o0) [...]

    public static g eG() {
        return uk.vk().K(() -> "https://json2.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("json1"))).G((Function1 function10) -> ((S0)function10.invoke("prgallmain"))).G((Function1 function10) -> ((S0)function10.invoke("prgallery_ranking.php"))).w((String s) -> {
            String s1;
            try {
                s = s.trim();
                if(!s.startsWith("(") || !s.endsWith(")")) {
                    s1 = !s.startsWith("[") || !s.endsWith("]") ? null : s;
                }
                else {
                    s1 = s.substring(1, s.length() - 1);
                }
                if(s1 != null) {
                    List list0 = c0.a.a.b(uk.a, s1, MinorRanking.class);
                    if(list0 != null && !list0.isEmpty()) {
                        for(Object object0: list0) {
                            ((MinorRanking)object0).B();
                        }
                        return g.Q2(list0);
                    }
                    return g.Q2(new ArrayList());
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return g.X1(new com.dcinside.app.http.f(0x7F150324));  // string:failed_main_ranking "실시간 북적 갤러리 목록을 불러올 수 없습니다."
        });
    }

    public static g ek() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "setting"))).w((String s) -> uk.Yj(s, com.dcinside.app.response.b.class)));
    }

    // 检测为 Lambda 实现
    private static String el(String s) [...]

    // 检测为 Lambda 实现
    private static S0 em(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g en(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static s eo(com.dcinside.app.model.p p0, t t0) [...]

    // 检测为 Lambda 实现
    private static g ep(String s) [...]

    // 检测为 Lambda 实现
    private static S0 eq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 er(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g es(String s) [...]

    // 检测为 Lambda 实现
    private static S0 et(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 eu(String s, o o0) [...]

    private static Object ev() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g ew(String s, int v, int v1, String s1) [...]

    // 检测为 Lambda 实现
    private static g ex(String s) [...]

    // 检测为 Lambda 实现
    private static S0 ey(CharSequence charSequence0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ez(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object f6() [...]

    // 检测为 Lambda 实现
    private static Uri.Builder fA(Uri.Builder uri$Builder0) [...]

    private static Object fB() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 fC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g fD(String s) [...]

    // 检测为 Lambda 实现
    private static S0 fE(String[] arr_s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 fF(P p0, o o0) [...]

    public static com.dcinside.app.util.A.b fG() {
        return new com.dcinside.app.util.A.b();
    }

    // 检测为 Lambda 实现
    public static Object ff() [...]

    // 检测为 Lambda 实现
    public static Object fh() [...]

    public static g fk(String[] arr_s) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "setting_save"))).R((o o0) -> {
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    o0.invoke(String.format(Locale.ENGLISH, "setting_data[%d]", v), arr_s[v]);
                }
            }
            return S0.a;
        }).w((String s) -> uk.Yj(s, f0.class)));
    }

    // 检测为 Lambda 实现
    private static g fl(String s) [...]

    // 检测为 Lambda 实现
    private static S0 fm(String s, o o0) [...]

    private static Object fn() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g fo(com.dcinside.app.model.p p0, String s) [...]

    private static Object fp() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g fq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 fr(com.dcinside.app.gallery.history.a a0, o o0) [...]

    private static Object fs() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ft(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 fu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 fv(Function1 function10) [...]

    private static Object fw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g fx(String s) [...]

    // 检测为 Lambda 实现
    private static S0 fy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 fz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object g5() [...]

    // 检测为 Lambda 实现
    private static Uri.Builder gA(String s, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 gB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g gC() [...]

    private static Object gD() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g gE(String s) [...]

    // 检测为 Lambda 实现
    private static S0 gF(P p0, o o0) [...]

    public static g gG(String s, int v, @Nullable String s1) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("gall_del.php"))).R((o o0) -> {
            if(m0.a.i(s)) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            o0.invoke("write_pw", s);
            return S0.a;
        }).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s1))).R((o o0) -> ((S0)o0.invoke("no", String.valueOf(v)))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("mode", "board_del"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).w(new M2())).Z3((Throwable throwable0) -> // 去混淆评级： 低(20)
        (xk.m(throwable0.getMessage()) ? g.X1(new com.dcinside.app.http.f(0x7F1502F8)) : g.X1(throwable0)));  // string:fail_pw_mismatch "비밀번호가 맞지 않습니다."
    }

    public static g gk(com.dcinside.app.model.p p0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("package_idx", Integer.toString(p0.s())))).R((o o0) -> ((S0)o0.invoke("detail_idx", Integer.toString(p0.q())))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("type", "insert"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w((String s) -> uk.Yj(s, t.class).g3((t t0) -> new s(p0.s(), p0.q(), t0))));
    }

    private static g gl() {
        String s = ll.c();
        long v = ll.a();
        return !m0.a.k(s) || Math.abs(System.currentTimeMillis() - v) >= 39600000L ? uk.Jj().M3(rx.schedulers.c.e()).g3(new Fg()).g3((String s) -> {
            Application application0 = Application.h();
            Context context0 = Application.e();
            String s1 = dl.a.c0();
            if(s1 == null) {
                s1 = "";
            }
            return application0.getText(context0, "com.dcinside.app.android", s, s1);
        }).f2((String s) -> try {
            if(s.startsWith("S:")) {
                String s1 = s.substring(2);
                ll.b(System.currentTimeMillis());
                ll.d(s1);
                return g.Q2(s1);
            }
            return s.startsWith("F:") ? g.X1(new com.dcinside.app.http.f(s.substring(2))) : g.X1(new com.dcinside.app.http.f(s));
        }
        catch(Exception exception0) {
            return xk.r(s, exception0);
        }).M3(rx.android.schedulers.a.c()) : g.Q2(s);
    }

    // 检测为 Lambda 实现
    private static S0 gm(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 gn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g go(com.dcinside.app.model.p p0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 gp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g gq(boolean z, String s) [...]

    // 检测为 Lambda 实现
    private static S0 gr(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 gs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 gt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 gu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 gv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 gw(Function1 function10) [...]

    private static Object gx() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 gy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 gz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object h4() [...]

    // 检测为 Lambda 实现
    private static Uri.Builder hA(int v, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 hB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static c hC(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static S0 hD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g hE(String s, String[] arr_s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 hF(P p0, o o0) [...]

    public static g hG(String s, int v) {
        return g.v1(new C()).f2((String s1) -> uk.vk().I().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("view_img.php"))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).H((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, PostImage.class);
                if(list0 != null && !list0.isEmpty()) {
                    PostImage postImage0 = (PostImage)list0.get(0);
                    return !m0.a.h(postImage0.m()) || !m0.a.h(postImage0.h()) ? g.X1(new com.dcinside.app.http.f(postImage0.h())) : g.Q2(list0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    public static Object hd() [...]

    // 检测为 Lambda 实现
    public static Object hi() [...]

    public static g hk() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("del_all_message"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static void hl() [...]

    // 检测为 Lambda 实现
    private static S0 hm(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 hn(Function1 function10) [...]

    private static Object ho() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 hp(String s, o o0) [...]

    private static Object hq() [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 hr(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 hs(Function1 function10) [...]

    private static Object ht() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 hu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 hv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 hw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 hx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 hy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 hz(String s, o o0) [...]

    // 检测为 Lambda 实现
    public static Object i5() [...]

    // 检测为 Lambda 实现
    private static Uri.Builder iA(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 iB(Function1 function10) [...]

    private static Object iC() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 iD(Function1 function10) [...]

    private static Object iE() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 iF(P p0, o o0) [...]

    public static g iG(String s, int v, String s1, @Nullable String s2) {
        String s3 = B.i7();
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s4) -> uk.vk().I().J("api_postInfo").K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("gall_view_new.php"))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("no", Integer.toString(v)))).H((o o0) -> ((S0)o0.invoke("app_id", s4))).H((o o0) -> ((S0)o0.invoke("confirm_id", s1))).H((o o0) -> ((S0)o0.invoke("permission_pw", s2))).H((o o0) -> ((S0)o0.invoke("headid", s3))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).w((String s2) -> try {
            List list0 = c0.a.a.b(uk.a, s2, S.class);
            S s3 = list0 == null || list0.size() <= 0 ? null : ((S)list0.get(0));
            if(s3 == null) {
                return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
            }
            if(!m0.a.j(s3.d()) && !m0.a.j(s3.a())) {
                Q q0 = s3.h();
                com.dcinside.app.model.S.a s$a0 = s3.g();
                if(q0 != null && s$a0 != null) {
                    q0.b2(s);
                    if(q0.y1()) {
                        q0.a2(m.h);
                    }
                    else if(q0.x1()) {
                        q0.a2(m.i);
                    }
                    else if(q0.z1()) {
                        q0.a2(m.j);
                    }
                    else {
                        q0.a2(m.g);
                    }
                    L l0 = q0.a1();
                    if(l0 != null) {
                        l0.g("");
                    }
                    com.dcinside.app.model.W w0 = q0.d1();
                    if(w0 != null) {
                        w0.g("");
                    }
                    q0.m2(new int[]{s$a0.m(), s$a0.o(), s$a0.l()});
                    q0.X1(s$a0.q());
                    q0.I2(Dl.C(Dl.t(Dl.M(q0.k1()))));
                    q0.u2(Dl.t(Dl.M(q0.X0())));
                    q0.r2(Dl.M(s$a0.i()));
                    if(!s$a0.r()) {
                        s1 = null;
                    }
                    q0.o2(s1);
                    q0.F1(((long)q0.hashCode()));
                    q0.Q1(s$a0.g());
                    return g.Q2(q0);
                }
                return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
            }
            return s3.i() ? g.X1(new j(s3.a())) : g.X1(new com.dcinside.app.http.f(s3.a(), s3.l()));
        }
        catch(Exception exception0) {
            return xk.r(s2, exception0);
        }));
    }

    public static g ik(String s, List list0) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("autozzal"))).Q((Function1 function10) -> ((S0)function10.invoke("delete"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(s.equals("__DC_GLOBAL_DEF_IMAGE_ID")) {
                s = "X";
            }
            o0.invoke("id", s);
            return S0.a;
        }).R((o o0) -> {
            if(list0 != null && !list0.isEmpty()) {
                for(int v = 0; v < list0.size(); ++v) {
                    try {
                        String s = (String)list0.get(v);
                        if(m0.a.k(s)) {
                            o0.invoke(String.format(Locale.ENGLISH, "img[%d]", v), s);
                        }
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException(exception0);
                    }
                }
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            if(f00 != null) {
                if(f00.f()) {
                    return g.Q2(f00);
                }
                return f00.a() == null ? g.X1(new com.dcinside.app.http.f(f00.c())) : g.X1(new com.dcinside.app.http.f(f00.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static void il(n n0) [...]

    // 检测为 Lambda 实现
    private static S0 im(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 in(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 io(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ip(String s, p p0) [...]

    // 检测为 Lambda 实现
    private static S0 iq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ir(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 is(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 iu(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 iv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 iw(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ix(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 iy(x x0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 iz(o o0) [...]

    // 检测为 Lambda 实现
    private static String jA(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 jB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 jD(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 jE(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 jF(P p0, o o0) [...]

    public static g jG(@NonNull String s, @Nullable String s1, int v, @Nullable PostHead postHead0, @Nullable v v1, @Nullable x x0) {
        return uk.kG(s, s1, v, null, null, null, postHead0, v1, null, x0, null);
    }

    // 检测为 Lambda 实现
    public static Object je() [...]

    public static g jk(String[] arr_s) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("autozzal"))).Q((Function1 function10) -> ((S0)function10.invoke("my_delete"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(arr_s != null && arr_s.length > 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    try {
                        String s = arr_s[v];
                        if(m0.a.k(s)) {
                            o0.invoke(String.format(Locale.ENGLISH, "img[%d]", v), s);
                        }
                    }
                    catch(Exception exception0) {
                        throw new RuntimeException(exception0);
                    }
                }
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            if(f00 != null) {
                return f00.f() ? g.Q2(f00) : g.X1(new com.dcinside.app.http.f(f00.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    private static Object jl() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g jm(String s) [...]

    // 检测为 Lambda 实现
    private static S0 jn(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g jp(String s) [...]

    // 检测为 Lambda 实现
    private static S0 jq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g jr(String s) [...]

    // 检测为 Lambda 实现
    private static S0 js(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ju(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jv(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jw(o o0) [...]

    // 检测为 Lambda 实现
    private static g jx(String s) [...]

    // 检测为 Lambda 实现
    private static S0 jy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 jz(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static String kA(String s) [...]

    // 检测为 Lambda 实现
    private static S0 kB(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 kC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 kD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 kE(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 kF(P p0, o o0) [...]

    public static g kG(@NonNull String s, @Nullable String s1, int v, @Nullable com.dcinside.app.type.I i0, @Nullable CharSequence charSequence0, @Nullable String s2, @Nullable PostHead postHead0, @Nullable v v1, @Nullable String s3, @Nullable x x0, @Nullable String s4) {
        String s5 = B.i7();
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s6) -> uk.vk().I().J("api_postList").K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("gall_list_new.php"))).H((o o0) -> ((S0)o0.invoke("id", s))).H((o o0) -> ((S0)o0.invoke("page", Integer.toString(v)))).H((o o0) -> ((S0)o0.invoke("app_id", s6))).H((o o0) -> (postHead0 == null ? ((S0)o0.invoke("headid", null)) : ((S0)o0.invoke("headid", Integer.toString(postHead0.i()))))).H((o o0) -> (i0 == null ? ((S0)o0.invoke("s_type", null)) : ((S0)o0.invoke("s_type", i0.e())))).H((o o0) -> (charSequence0 == null || m0.a.h(charSequence0) ? ((S0)o0.invoke("serVal", null)) : ((S0)o0.invoke("serVal", charSequence0.toString())))).H((o o0) -> ((S0)o0.invoke("ser_pos", s1))).H((o o0) -> ((S0)o0.invoke("confirm_id", s2))).H((o o0) -> {
            if(s3 != null && !s3.isEmpty()) {
                o0.invoke("pageLastHeadnum", s3);
            }
            return S0.a;
        }).H((o o0) -> {
            if(x0 != null && x0 == x.d) {
                o0.invoke("boardtype", "I");
            }
            return S0.a;
        }).H((o o0) -> {
            if(s4 != null) {
                o0.invoke("date", s4);
            }
            return S0.a;
        }).H((o o0) -> {
            String s = v1 == null ? null : v1.b();
            if(m0.a.j(s)) {
                o0.invoke(s, "1");
            }
            return S0.a;
        }).H((o o0) -> {
            if(s5 != null) {
                o0.invoke("pixno", s5);
            }
            return S0.a;
        }).w((String s2) -> try {
            com.dcinside.app.response.i i0 = (com.dcinside.app.response.i)c0.a.a.a(uk.a, s2, com.dcinside.app.response.i.class);
            if(i0 == null) {
                return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
            }
            if(!m0.a.j(i0.h()) && !m0.a.j(i0.a())) {
                List list0 = i0.e();
                if(list0.isEmpty()) {
                    return xk.r(s2, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
                }
                GalleryInfo galleryInfo0 = (GalleryInfo)list0.get(0);
                galleryInfo0.X0(uk.LF(galleryInfo0));
                galleryInfo0.x0(s);
                if(!galleryInfo0.b0()) {
                    s2 = null;
                }
                galleryInfo0.J0(s2);
                if(galleryInfo0.d0()) {
                    galleryInfo0.w0(m.h);
                }
                else if(galleryInfo0.c0()) {
                    galleryInfo0.w0(m.i);
                }
                else if(galleryInfo0.e0()) {
                    galleryInfo0.w0(m.j);
                }
                else {
                    galleryInfo0.w0(m.g);
                }
                if(v1 != null) {
                    galleryInfo0.p0(v1.b());
                }
                i0.m(galleryInfo0);
                i0.l(galleryInfo0.o());
                List list1 = i0.f();
                i0.p(list1.size());
                int v1 = list1.size();
                Application.e();
                int v2 = dl.a.k2();
                boolean z = com.dcinside.app.settings.spoiler.c.d.a(v2).d();
                String s3 = !z || postHead0 != null ? null : "스포)";
                for(Object object0: list1) {
                    PostItem postItem0 = (PostItem)object0;
                    String s4 = postItem0.K();
                    if(!TextUtils.isEmpty(s4)) {
                        String s5 = Dl.t(Dl.C(Dl.M(s4)));
                        if(!z) {
                            postItem0.q0(null);
                            postItem0.r0(s5);
                        }
                        else if(postHead0 != null || !postItem0.i0()) {
                            postItem0.r0(s5);
                        }
                        else {
                            postItem0.q0(s3);
                            postItem0.r0(String.format("%s%s", s3, s5));
                        }
                    }
                    String s6 = postItem0.e();
                    if(!TextUtils.isEmpty(s6)) {
                        postItem0.m0(Dl.t(Dl.C(Dl.M(s6))));
                    }
                    String s7 = postItem0.z();
                    if(!TextUtils.isEmpty(s7)) {
                        postItem0.o0(Dl.t(Dl.C(Dl.M(s7))));
                    }
                }
                if(v1 > 0) {
                    i0.n(((PostItem)list1.get(v1 - 1)).o());
                    PostItem postItem1 = (PostItem)list1.get(0);
                    if(m0.a.h(postItem1.I()) && m0.a.h(postItem1.d())) {
                        return g.Q2(i0);
                    }
                    if(xk.d(postItem1.d())) {
                        i0.o(new ArrayList());
                        i0.p(0);
                        return g.Q2(i0);
                    }
                    return g.X1(new com.dcinside.app.http.f(postItem1.d()));
                }
                return g.Q2(i0);
            }
            return i0.i() ? g.X1(new j(i0.a())) : g.X1(new com.dcinside.app.http.f(i0.a(), i0.j()));
        }
        catch(Exception exception0) {
            return xk.r(s2, exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object ke() [...]

    // 检测为 Lambda 实现
    public static Object kg() [...]

    public static g kk(String[] arr_s) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("del_message"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            for(int v = 0; v < arr_s.length; ++v) {
                o0.invoke(String.format(Locale.ENGLISH, "del_message[%d]", v), arr_s[v]);
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 kl(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g km(String s, int v, String s1) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 kn(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ko(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g kp(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 kq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g kr(String s, com.dcinside.app.gallery.history.a a0, int v, boolean z, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 ks(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 kt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ku(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g kv(String s) [...]

    // 检测为 Lambda 实现
    private static S0 kw(int v, o o0) [...]

    private static Object kx() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ky(v v0, o o0) [...]

    // 检测为 Lambda 实现
    private static g kz(String s) [...]

    // 检测为 Lambda 实现
    public static Object l1() [...]

    // 检测为 Lambda 实现
    public static Object l2() [...]

    // 检测为 Lambda 实现
    public static Object l8() [...]

    // 检测为 Lambda 实现
    private static String lA(String s) [...]

    // 检测为 Lambda 实现
    private static S0 lB(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lD(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lE(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lF(P p0, p p1) [...]

    public static g lG(Q q0, @Nullable String s) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("gall_modify.php"))).R((o o0) -> {
            if(m0.a.i(s)) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            o0.invoke("password", s);
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", q0.G0()))).R((o o0) -> ((S0)o0.invoke("no", String.valueOf(q0.c1())))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).w((String s) -> com.dcinside.app.util.n.w(s, q0.S0())));
    }

    public static g lk(int v) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("del_prompt_list"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("idx", String.valueOf(v)))).w((String s) -> try {
            i i0 = (i)c0.a.a.a(uk.a, s, i.class);
            return i0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(i0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 ll(Function1 function10) [...]

    private static Object lm() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ln(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lo(String s, o o0) [...]

    private static Object lp() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 lq(String s, o o0) [...]

    private static Object lr() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ls(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 lu(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g lv(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 lw(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 lx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ly(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g lz(String s, String s1) [...]

    // 检测为 Lambda 实现
    public static Object m0() [...]

    // 检测为 Lambda 实现
    public static Object m2() [...]

    private static Object mA() [...] // Inlined contents

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 mB(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mC(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g mF(P p0, String s) [...]

    public static g mG(V v0) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s) -> uk.fG().V("api_postWrite").W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_write_api.php"))).R((o o0) -> ((S0)o0.invoke("id", v0.h()))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            try {
                String s = v0.m();
                if(s != null) {
                    o0.invoke("mode", "modify");
                    o0.invoke("no", s);
                    return S0.a;
                }
                o0.invoke("mode", "write");
            }
            catch(Exception unused_ex) {
            }
            return S0.a;
        }).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> {
            PostHead postHead0 = v0.i();
            if(postHead0 != null && postHead0.i() != -1) {
                o0.invoke("head_name", postHead0.m());
                o0.invoke("head_no", Integer.toString(postHead0.i()));
            }
            return S0.a;
        }).R((o o0) -> {
            String s = v0.r();
            if(s != null) {
                try {
                    o0.invoke("subject", URLEncoder.encode(s, "UTF-8"));
                    return S0.a;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException(unsupportedEncodingException0);
                }
            }
            return S0.a;
        }).R((o o0) -> {
            if(!m0.a.k(v0.n()) && !m0.a.k(v0.p())) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            try {
                String s = dl.a.l0();
                if(m0.a.k(s)) {
                    o0.invoke("adult_code", s);
                }
                String s1 = v0.n();
                o0.invoke("name", (s1 == null ? null : URLEncoder.encode(s1, "UTF-8")));
                o0.invoke("password", v0.p());
                return S0.a;
            }
            catch(Exception exception0) {
            }
            throw new RuntimeException(exception0);
        }).R((o o0) -> {
            String[] arr_s = v0.l();
            if(arr_s != null) {
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    try {
                        String s = arr_s[v1];
                        String s1 = URLEncoder.encode(s, "UTF-8");
                        if(s.startsWith("{{_OG_START::")) {
                            o0.invoke(String.format(Locale.ENGLISH, "memo_block[%d]", v1), s1.replace("%3A", ":").replace("%2F", "/").replace("%3F", "?").replace("%3D", "=").replace("%26", "&").replace("%2C", ",").replace("%21", "!").replace("%24", "$").replace("%27", "\'").replace("%28", "(").replace("%29", ")").replace("%2B", "+").replace("%3B", ";").replace("%40", "@").replace("%7E", "~").replace("&q", "&").replace("+", "%20"));
                        }
                        else {
                            o0.invoke(String.format(Locale.ENGLISH, "memo_block[%d]", v1), s1.replace("%0A", "\n"));
                        }
                    }
                    catch(UnsupportedEncodingException unsupportedEncodingException0) {
                        throw new RuntimeException(unsupportedEncodingException0);
                    }
                }
            }
            return S0.a;
        }).R((o o0) -> {
            SparseArray sparseArray0 = v0.f();
            if(sparseArray0 != null) {
                for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                    int v2 = sparseArray0.keyAt(v1);
                    kotlin.V v3 = (kotlin.V)sparseArray0.get(v2);
                    o0.invoke(String.format(Locale.ENGLISH, "detail_idx[%d]", v2), (v3.f() == null ? String.valueOf(v3.e()) : v3.f() + "|dccon|" + v3.e()));
                }
            }
            return S0.a;
        }).S((p p0) -> {
            List list0 = v0.j();
            if(list0 != null) {
                com.dcinside.app.http.l.b[] arr_l$b = v0.k();
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    File file0 = (File)list0.get(v2);
                    if(file0 != null) {
                        String s = String.format(Locale.ENGLISH, "upload[%d]", v2);
                        com.dcinside.app.http.l.b l$b0 = arr_l$b == null ? null : arr_l$b[v2];
                        p0.invoke(s, file0.getName(), com.dcinside.app.http.n.b(file0, l$b0));
                    }
                }
            }
            return S0.a;
        }).R((o o0) -> {
            HashSet hashSet0 = v0.e();
            if(hashSet0 != null) {
                ArrayList arrayList0 = new ArrayList(hashSet0);
                Collections.sort(arrayList0);
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    o0.invoke(String.format(Locale.ENGLISH, "file_del_img[%d]", v1), arrayList0.get(v1));
                }
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("code", v0.d()))).R((o o0) -> ((S0)o0.invoke("dcblock", v0.c()))).R((o o0) -> {
            if(!com.dcinside.app.internal.f.c(v0.i())) {
                if(v0.u()) {
                    o0.invoke("fix", "true");
                    return S0.a;
                }
                o0.invoke("fix", "");
            }
            return S0.a;
        }).R((o o0) -> {
            if(!com.dcinside.app.internal.f.c(v0.i())) {
                String s = v0.q();
                if(m0.a.k(s)) {
                    o0.invoke("secret_use", "1");
                    o0.invoke("secret_password", s);
                    return S0.a;
                }
                if(v0.g()) {
                    o0.invoke("secret_use", "1");
                    return S0.a;
                }
                o0.invoke("secret_use", "0");
            }
            return S0.a;
        }).R((o o0) -> {
            String s = v0.o();
            if(m0.a.k(s)) {
                o0.invoke("vote", s);
            }
            return S0.a;
        }).R((o o0) -> {
            if(!com.dcinside.app.internal.f.c(v0.i())) {
                String s = v0.b();
                if(s != null) {
                    o0.invoke("auto_del_time", s);
                }
            }
            return S0.a;
        }).R((o o0) -> {
            String[] arr_s = v0.s();
            if(arr_s != null && arr_s.length > 0) {
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    o0.invoke(String.format(Locale.ENGLISH, "movie_data[%d]", v1), arr_s[v1]);
                }
            }
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("is_quick", (v0.v() ? "1" : "0"));
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("use_gall_nickname", (v0.t() ? "1" : "0"));
            return S0.a;
        }).R((o o0) -> {
            List list0 = v0.a();
            if(list0 != null && list0.size() > 0) {
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    com.dcinside.app.write.a a0 = (com.dcinside.app.write.a)list0.get(v1);
                    Locale locale0 = Locale.ENGLISH;
                    String s = String.format(locale0, "aiImg[%d][img]", v1);
                    String s1 = String.format(locale0, "aiImg[%d][hide_prompt]", v1);
                    String s2 = a0.f();
                    if(s2 != null) {
                        o0.invoke(s, s2);
                    }
                    o0.invoke(s1, (Boolean.TRUE.equals(a0.g()) ? "1" : "0"));
                    String s3 = a0.h();
                    if(s3 != null) {
                        o0.invoke(String.format(locale0, "aiImg[%d][ct_img]", v1), s3);
                    }
                }
            }
            return S0.a;
        }).w(new M2()));
    }

    public static g mk(String s) {
        return uk.fG().W(() -> "https://m.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("voice"))).Q((Function1 function10) -> ((S0)function10.invoke("download"))).R((o o0) -> ((S0)o0.invoke("vr", s))).w((String s) -> {
            try {
                l0 l00 = (l0)c0.a.a.a(uk.a, s, l0.class);
                if(l00 != null) {
                    return !l00.f() || !m0.a.h(l00.a()) ? g.X1(new com.dcinside.app.http.f(l00.a())) : g.Q2(l00);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        });
    }

    // 检测为 Lambda 实现
    private static S0 ml(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 mm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g mn(String s) [...]

    // 检测为 Lambda 实现
    private static S0 mo(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 mq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g ms(String s) [...]

    private static Object mt() [...] // Inlined contents

    private static Object mu() [...] // Inlined contents

    private static Object mv() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 mw(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 mx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g my(String s, String s1, v v0, PostHead postHead0, String s2) [...]

    private static Object mz() [...] // Inlined contents

    // 检测为 Lambda 实现
    public static Object n() [...]

    // 检测为 Lambda 实现
    private static S0 nA(Function1 function10) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 nB(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nE(String[] arr_s, com.dcinside.app.http.p p0, p p1) [...]

    // 检测为 Lambda 实现
    private static S0 nF(String s, o o0) [...]

    public static g nG(@NonNull String s, @Nullable String s1, int v, @Nullable PostHead postHead0, @Nullable v v1, @Nullable x x0, String s2) {
        return uk.kG(s, s1, v, null, null, null, postHead0, v1, null, x0, s2);
    }

    // 检测为 Lambda 实现
    public static Object nb() [...]

    public static g nk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_aiImg_fill_prompts.php"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).S((p p0) -> {
            if(s != null) {
                File file0 = new File(s);
                p0.invoke("prompt_img", file0.getName(), com.dcinside.app.http.n.b(file0, null));
            }
            return S0.a;
        }).w((String s) -> try {
            com.dcinside.app.model.j j0 = (com.dcinside.app.model.j)c0.a.a.a(uk.a, s, com.dcinside.app.model.j.class);
            return j0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(j0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 nl(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g nn(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g no(String s) [...]

    // 检测为 Lambda 实现
    private static S0 np(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 nq(g0.b b0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g ns(String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 nt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 nu(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 nv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 nw(int[] arr_v, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 nx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g ny(String s, int v, PostHead postHead0, com.dcinside.app.type.I i0, CharSequence charSequence0, String s1, String s2, String s3, x x0, String s4, v v1, String s5, String s6) [...]

    // 检测为 Lambda 实现
    private static S0 nz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object o8() [...]

    // 检测为 Lambda 实现
    public static Object o9() [...]

    // 检测为 Lambda 实现
    private static S0 oA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 oB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 oC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g oD(String s) [...]

    // 检测为 Lambda 实现
    private static g oE(String s) [...]

    // 检测为 Lambda 实现
    private static S0 oF(String s, o o0) [...]

    public static g oG(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("relation_list.php"))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).w((String s) -> {
            try {
                List list0 = c0.a.a.b(uk.a, s, RelationData.class);
                RelationData relationData0 = list0 == null || list0.size() <= 0 ? null : ((RelationData)list0.get(0));
                if(relationData0 != null) {
                    return relationData0.e() == null || relationData0.e().size() <= 0 ? g.X1(new com.dcinside.app.http.f(relationData0.a())) : g.Q2(relationData0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    public static Object og() [...]

    // 检测为 Lambda 实现
    public static Object oj() [...]

    public static String ok(String s, @NonNull m m0) {
        if(m0 == m.i) {
            Object[] arr_object = {"gall.dcinside.com", m.d.g(s)};
            return String.format(Locale.ENGLISH, "https://%s/mini/%s", arr_object);
        }
        if(m0 == m.j) {
            Object[] arr_object1 = {"gall.dcinside.com", m.d.h(s)};
            return String.format(Locale.ENGLISH, "https://%s/person/%s", arr_object1);
        }
        return String.format(Locale.ENGLISH, "https://%s/%s", "gall.dcinside.com", s);
    }

    // 检测为 Lambda 实现
    private static S0 ol(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 om(String s, o o0) [...]

    private static Object on() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g oo(String s) [...]

    // 检测为 Lambda 实现
    private static S0 op(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 oq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 or(Function1 function10) [...]

    private static Object os() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 ot(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ou(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ov(m m0, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g ow(String s) [...]

    // 检测为 Lambda 实现
    private static g ox(String s) [...]

    private static Object oy() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 oz(Function1 function10) [...]

    // 检测为 Lambda 实现
    public static Object p3() [...]

    // 检测为 Lambda 实现
    public static Object p5() [...]

    // 检测为 Lambda 实现
    private static S0 pA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g pB(String s) [...]

    // 检测为 Lambda 实现
    private static S0 pC(d[] arr_a$d, o o0) [...]

    // 检测为 Lambda 实现
    private static g pD(boolean z, String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static g pE(String[] arr_s, com.dcinside.app.http.p p0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 pF(o o0) [...]

    public static g pG(String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("del_keyword_all"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", s))).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object pa() [...]

    public static g pk(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("mygall_modify.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("gall_nm", s))).R((o o0) -> ((S0)o0.invoke("gall_id", s1))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("mode", "favori_gall"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).w(new M2()));
    }

    // 检测为 Lambda 实现
    private static S0 pl(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 pm(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 pn(Function1 function10) [...]

    private static Object po() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 pp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g pq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 pr(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ps(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 pt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g pu(String s) [...]

    // 检测为 Lambda 实现
    private static S0 pv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g pw(String s, int v, int[] arr_v, String s1) [...]

    private static Object px() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 py(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 pz(String s, o o0) [...]

    // 检测为 Lambda 实现
    public static Object q1() [...]

    // 检测为 Lambda 实现
    public static Object q2() [...]

    // 检测为 Lambda 实现
    private static S0 qA(o o0) [...]

    // 检测为 Lambda 实现
    private static g qB(boolean z, boolean z1, String s, String s1) [...]

    // 检测为 Lambda 实现
    private static g qC(String s) [...]

    private static Object qD() [...] // Inlined contents

    private static Object qE() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 qF(o o0) [...]

    public static g qG(Q q0, int v, String s, boolean z) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("comment_del.php"))).R((o o0) -> {
            if(m0.a.i(s)) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            o0.invoke("comment_pw", s);
            return S0.a;
        }).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("id", q0.G0()))).R((o o0) -> ((S0)o0.invoke("no", Integer.toString(q0.c1())))).R((o o0) -> ((S0)o0.invoke("board_id", q0.l1()))).R((o o0) -> {
            if(z) {
                o0.invoke("mode", "comment_noti");
                return S0.a;
            }
            o0.invoke("mode", "comment_del");
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("best_chk", q0.t0()))).R((o o0) -> ((S0)o0.invoke("best_comid", q0.u0()))).R((o o0) -> ((S0)o0.invoke("best_comno", Integer.toString(q0.v0())))).R((o o0) -> ((S0)o0.invoke("comment_no", Integer.toString(v)))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).w(new M2())).Z3((Throwable throwable0) -> // 去混淆评级： 低(20)
        (xk.m(throwable0.getMessage()) ? g.X1(new com.dcinside.app.http.f(0x7F1502F8)) : g.X1(throwable0)));  // string:fail_pw_mismatch "비밀번호가 맞지 않습니다."
    }

    // 检测为 Lambda 实现
    public static Object qd() [...]

    public static g qk(List list0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("mygall_modify.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                o0.invoke(String.format(Locale.ENGLISH, "gall_array[%d]", v1), list0.get(v1));
            }
            return S0.a;
        }).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("mode", "favori_gall_sort"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w(new M2()));
    }

    // 检测为 Lambda 实现
    private static S0 ql(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 qm(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 qn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 qo(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 qp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g qq(g0.b b0, String s, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 qr(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 qs(Function1 function10) [...]

    private static Object qt() [...] // Inlined contents

    private static Object qu() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 qv(m m0, String s, Function1 function10) [...]

    private static Object qw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 qx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 qy(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 qz(o o0) [...]

    // 检测为 Lambda 实现
    public static Object r8() [...]

    // 检测为 Lambda 实现
    private static S0 rA(o o0) [...]

    private static Object rB() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g rC(String s, int v, String s1, d[] arr_a$d, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 rD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 rE(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 rF(o o0) [...]

    public static g rG(i0.a a0, boolean z) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s) -> uk.fG().V("api_replyVoice").W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_upload.php"))).R((o o0) -> {
            Q q0 = a0.n();
            if(q0 != null) {
                String s = q0.t0();
                o0.invoke("best_chk", s);
                o0.invoke("gall_id", q0.G0());
                o0.invoke("gall_no", Integer.toString(q0.c1()));
                if(!"N".equals(s)) {
                    o0.invoke("best_comid", q0.u0());
                    o0.invoke("best_comno", Integer.toString(q0.v0()));
                }
            }
            return S0.a;
        }).R((o o0) -> {
            Q0 q00 = a0.l();
            if(q00 == null) {
                q00 = Q0.b;
            }
            o0.invoke("mode", q00.c());
            if(Q0.b != q00) {
                com.dcinside.app.response.j j0 = a0.p();
                if(j0 != null) {
                    o0.invoke("reple_id", j0.f0());
                    o0.invoke("comment_no", Integer.toString(j0.a0()));
                }
            }
            return S0.a;
        }).R((o o0) -> {
            if(a0.j() != null) {
                o0.invoke("file_name", a0.j().getName());
            }
            return S0.a;
        }).S((p p0) -> {
            File file0 = a0.j();
            if(file0 != null) {
                p0.invoke("upfile", file0.getName(), com.dcinside.app.http.n.a(file0, null));
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("user_no", B.k7()))).R((o o0) -> {
            if(!m0.a.k(a0.m()) && !m0.a.k(a0.o())) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            try {
                String s = dl.a.l0();
                if(m0.a.k(s)) {
                    o0.invoke("adult_code", s);
                }
                String s1 = a0.m();
                o0.invoke("comment_nick", (s1 == null ? null : URLEncoder.encode(s1, "UTF-8")));
                o0.invoke("password", a0.o());
                return S0.a;
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
            }
            throw new RuntimeException(unsupportedEncodingException0);
        }).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> try {
            String s = a0.k();
            o0.invoke("comment_txt", (s == null ? null : URLEncoder.encode(s, "UTF-8")));
            return S0.a;
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }).R((o o0) -> {
            if(m0.a.k(a0.f())) {
                o0.invoke("rand_code", a0.g());
                o0.invoke("captcha_code", a0.f());
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            o0.invoke("use_gall_nickname", (a0.s() ? "1" : "0"));
            return S0.a;
        }).R((o o0) -> // 去混淆评级： 低(20)
        (z ? ((S0)o0.invoke("down_chk", "1")) : ((S0)o0.invoke("down_chk", "0")))).w(new M2()));
    }

    // 检测为 Lambda 实现
    public static Object rj() [...]

    public static g rk() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("mygall_modify.php"))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> // 去混淆评级： 低(20)
        ((S0)o0.invoke("mode", "favori_all_del"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).w(new M2()));
    }

    // 检测为 Lambda 实现
    private static S0 rl(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static g rm(String s) [...]

    // 检测为 Lambda 实现
    private static S0 rn(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ro(Function1 function10) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 rp(o o0) [...]

    private static Object rq() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 rr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 rs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 rt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ru(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 rv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 rw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 rx(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 ry(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 rz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object s9() [...]

    // 检测为 Lambda 实现
    private static g sA(String s) [...]

    // 检测为 Lambda 实现
    private static S0 sB(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder sC(GalleryInfo galleryInfo0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 sD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 sE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 sF(o o0) [...]

    public static g sG(i0.a a0) {
        return g.v1(new C()).f2((Object object0) -> g.Q2(object0)).f2((String s) -> uk.fG().V("api_replyWrite").W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("comment_ok.php"))).R((o o0) -> {
            Q q0 = a0.n();
            if(q0 != null) {
                o0.invoke("id", q0.G0());
                o0.invoke("no", Integer.toString(q0.c1()));
                o0.invoke("board_id", q0.l1());
                o0.invoke("best_chk", q0.t0());
                o0.invoke("best_comid", q0.u0());
                o0.invoke("best_comno", Integer.toString(q0.v0()));
            }
            return S0.a;
        }).R((o o0) -> {
            Q0 q00 = a0.l();
            if(q00 == null) {
                q00 = Q0.b;
            }
            o0.invoke("mode", q00.c());
            if(Q0.b != q00) {
                com.dcinside.app.response.j j0 = a0.p();
                if(j0 != null) {
                    o0.invoke("reple_id", j0.f0());
                    o0.invoke("comment_no", Integer.toString(j0.a0()));
                }
            }
            return S0.a;
        }).R((o o0) -> {
            if(!m0.a.k(a0.m()) && !m0.a.k(a0.o())) {
                o0.invoke("user_id", B.i7());
                return S0.a;
            }
            String s = dl.a.l0();
            if(m0.a.k(s)) {
                o0.invoke("adult_code", s);
            }
            o0.invoke("comment_nick", a0.m());
            o0.invoke("comment_pw", a0.o());
            return S0.a;
        }).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_token", s);
            }
            return S0.a;
        }).R((o o0) -> {
            String[] arr_s = a0.i();
            int[] arr_v = a0.h();
            if(arr_s.length >= 2 && arr_v.length >= 2) {
                o0.invoke("comment_memo", arr_s[0] + arr_s[1]);
                for(int v = 0; v < arr_v.length; ++v) {
                    o0.invoke(String.format(Locale.ENGLISH, "detail_idx[%s]", v), String.valueOf(arr_v[v]));
                }
                return S0.a;
            }
            if(arr_s.length == 1 && arr_v.length == 1) {
                o0.invoke("comment_memo", arr_s[0]);
                o0.invoke("detail_idx", Integer.toString(arr_v[0]));
                return S0.a;
            }
            o0.invoke("comment_memo", a0.k());
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("use_gall_nickname", (a0.s() ? "1" : "0"));
            return S0.a;
        }).R((o o0) -> {
            if(m0.a.k(a0.f())) {
                o0.invoke("rand_code", a0.g());
                o0.invoke("captcha_code", a0.f());
            }
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("use_bigdccon", (a0.q() ? "1" : "0"));
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("app_id", s))).w(new M2()));
    }

    public static g sk(String s, String s1, String s2) {
        return g.v1(new C()).f2((String s3) -> uk.fG().W(() -> "https://m.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("poll"))).Q((Function1 function10) -> ((S0)function10.invoke("finish"))).R((o o0) -> ((S0)o0.invoke("con_key", s))).R((o o0) -> ((S0)o0.invoke("poll", s1))).R((o o0) -> ((S0)o0.invoke("pw", s2))).w((String s) -> try {
            return g.Q2(((d0)c0.a.a.a(uk.a, s, d0.class)));
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 sl(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static g sm(String s, String s1) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 sn(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 so(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 sp(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 sq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 sr(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ss(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 st(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 su(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 sv(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 sw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 sx(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 sy(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 sz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object t2() [...]

    // 检测为 Lambda 实现
    public static Object t8() [...]

    // 检测为 Lambda 实现
    private static g tA(String s) [...]

    // 检测为 Lambda 实现
    private static S0 tB(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static String tC(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 tD(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 tE(String s, com.dcinside.app.http.l.b l$b0, p p0) [...]

    // 检测为 Lambda 实现
    private static g tF(String s) [...]

    public static g tG(String s, int v) {
        return g.v1(new C()).g3((String s) -> {
            Uri.Builder uri$Builder0 = Uri.parse("https://m.dcinside.com/api/report.php").buildUpon();
            uri$Builder0.appendQueryParameter("app_id", s);
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("report_new", "1")).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("id", s)).g3((Uri.Builder uri$Builder0) -> uri$Builder0.appendQueryParameter("no", Integer.toString(v))).g3((Uri.Builder uri$Builder0) -> {
            String s = B.i7();
            if(m0.a.k(s)) {
                uri$Builder0.appendQueryParameter("confirm_id", s);
            }
            return uri$Builder0;
        }).g3((Uri.Builder uri$Builder0) -> uri$Builder0.build().toString()).g3((String s) -> Base64.encodeToString(s.getBytes(), 2)).g3((String s) -> Uri.parse("https://m.dcinside.com/api/redirect.php").buildUpon().appendQueryParameter("hash", s).toString());
    }

    // 检测为 Lambda 实现
    public static Object ta() [...]

    // 检测为 Lambda 实现
    public static Object td() [...]

    public static g tk(boolean z, String s) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> // 去混淆评级： 低(20)
        (z ? ((S0)function10.invoke("gall_info")) : ((S0)function10.invoke("minor_info")))).R((o o0) -> ((S0)o0.invoke("id", s))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).w((String s) -> {
            try {
                MinorInfo minorInfo0 = (MinorInfo)c0.a.a.a(uk.a, s, MinorInfo.class);
                if(minorInfo0 != null) {
                    return !m0.a.h(minorInfo0.d()) || !m0.a.h(minorInfo0.a()) ? g.X1(new com.dcinside.app.http.f(minorInfo0.a())) : g.Q2(minorInfo0);
                }
            }
            catch(Exception exception0) {
                return xk.r(s, exception0);
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }));
    }

    // 检测为 Lambda 实现
    private static S0 tl(X x0, o o0) [...]

    private static g tm(f f0, String s, String s1) {
        Uri.Builder uri$Builder0;
        switch(f0) {
            case 1: {
                uri$Builder0 = Uri.parse("https://app.dcinside.com/code_reple.php").buildUpon();
                uri$Builder0.appendQueryParameter("type", "C");
                uri$Builder0.appendQueryParameter("id", s);
                break;
            }
            case 2: {
                uri$Builder0 = Uri.parse("https://app.dcinside.com/code_reple.php").buildUpon();
                uri$Builder0.appendQueryParameter("type", "R");
                uri$Builder0.appendQueryParameter("id", s);
                break;
            }
            case 3: {
                uri$Builder0 = Uri.parse("https://app.dcinside.com/captcha/code?id=login_botchk").buildUpon();
                uri$Builder0.appendQueryParameter("type", "L");
                break;
            }
            default: {
                uri$Builder0 = Uri.parse("https://app.dcinside.com/code.php").buildUpon();
                uri$Builder0.appendQueryParameter("id", s);
            }
        }
        uri$Builder0.appendQueryParameter("dccode", s1);
        return g.Q2(uri$Builder0.toString());
    }

    // 检测为 Lambda 实现
    private static S0 tn(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 to(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g tp(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 tq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g tr(String s) [...]

    // 检测为 Lambda 实现
    private static S0 ts(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 tt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g tu(String s) [...]

    // 检测为 Lambda 实现
    private static S0 tv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 tw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 tx(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ty(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 tz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object u0() [...]

    // 检测为 Lambda 实现
    public static Object u4() [...]

    private static Object uA() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 uB(o o0) [...]

    private static Object uC() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 uD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g uE(String s) [...]

    // 检测为 Lambda 实现
    private static g uF(String s, String s1, String s2) [...]

    public static g uG() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("dccon.php"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("type", "chk_bigdccon"))).w((String s) -> try {
            BigDcconResult bigDcconResult0 = (BigDcconResult)c0.a.a.a(uk.a, s, BigDcconResult.class);
            return bigDcconResult0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(bigDcconResult0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    public static g uk(String s) {
        return g.v1(new C()).f2((String s1) -> // 去混淆评级： 低(20)
        (m0.a.i(s) ? g.X1(new NullPointerException("unknown user")) : g.Q2(new Uri.Builder().scheme("https").authority("m.dcinside.com").appendPath("gallog").appendPath(s).appendQueryParameter("app_id", s1).appendQueryParameter("confirm_id", B.i7()).build().toString())));
    }

    // 检测为 Lambda 实现
    private static S0 ul(X x0, o o0) [...]

    private static Object um() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g un(String s) [...]

    // 检测为 Lambda 实现
    private static S0 uo(o o0) [...]

    private static Object up() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 uq(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g ur(String s) [...]

    // 检测为 Lambda 实现
    private static g us(String s) [...]

    // 检测为 Lambda 实现
    private static g ut(m m0, String s) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder uu(GalleryInfo galleryInfo0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 uv(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static g uw(String s) [...]

    // 检测为 Lambda 实现
    private static S0 ux(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 uy(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 uz(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 vA(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 vB(com.dcinside.app.write.menu.ai.type.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 vC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 vD(o o0) [...]

    // 检测为 Lambda 实现
    private static g vE(String s, String s1, com.dcinside.app.http.l.b l$b0, String s2) [...]

    private static Object vF() [...] // Inlined contents

    public static g vG(com.dcinside.app.model.f f0, boolean z) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("insert_aiImg"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).R((o o0) -> ((S0)o0.invoke("gallery_id", f0.a()))).R((o o0) -> {
            if(z) {
                String s = dl.a.c0();
                if(s != null && s.length() > 0) {
                    o0.invoke("client_id", s);
                }
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("prompt", f0.d()))).R((o o0) -> ((S0)o0.invoke("neg_prompt", f0.c()))).R((o o0) -> ((S0)o0.invoke("aiImg_sampling", f0.i()))).R((o o0) -> ((S0)o0.invoke("model", f0.b()))).R((o o0) -> {
            if(f0.j()) {
                o0.invoke("upscaler", "true");
                return S0.a;
            }
            o0.invoke("upscaler", "false");
            return S0.a;
        }).R((o o0) -> {
            if(f0.g() != null) {
                o0.invoke("chk_tr", "1");
                o0.invoke("ct_mode", Integer.toString(f0.g().b()));
                o0.invoke("filename", f0.e());
                o0.invoke("ct_ext", f0.f());
                o0.invoke("ct_weight", Float.toString((f0.h() == null ? 0.5f : ((float)f0.h()))));
                return S0.a;
            }
            o0.invoke("chk_tr", "0");
            return S0.a;
        }).w((String s) -> try {
            com.dcinside.app.model.g g0 = (com.dcinside.app.model.g)c0.a.a.a(uk.a, s, com.dcinside.app.model.g.class);
            return g0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(g0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object vj() [...]

    public static com.dcinside.app.util.A.a vk() {
        return new com.dcinside.app.util.A.a();
    }

    // 检测为 Lambda 实现
    private static S0 vl(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 vm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g vn(String s) [...]

    // 检测为 Lambda 实现
    private static S0 vo(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 vp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 vq(String s, o o0) [...]

    private static Object vr() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static g vs(String s) [...]

    private static Object vt() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static String vu(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static g vv(String s) [...]

    private static Object vw() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 vx(int v, o o0) [...]

    // 检测为 Lambda 实现
    private static g vy(Q q0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 vz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object w() [...]

    // 检测为 Lambda 实现
    public static Object w1() [...]

    // 检测为 Lambda 实现
    public static Object w8() [...]

    // 检测为 Lambda 实现
    private static S0 wA(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 wB(AiPromptLoadItem aiPromptLoadItem0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 wC(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 wD(String s, o o0) [...]

    private static Object wE() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 wF(o o0) [...]

    public static g wG() {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("prompt_list"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).w((String s) -> try {
            i i0 = (i)c0.a.a.a(uk.a, s, i.class);
            return i0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(i0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object wc() [...]

    public static g wk(boolean z) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("recom_prompt_new"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            if(z) {
                String s = dl.a.c0();
                if(s != null && !s.isEmpty()) {
                    o0.invoke("client_id", s);
                }
            }
            return S0.a;
        }).R((o o0) -> ((S0)o0.invoke("user_id", B.i7()))).w((String s) -> try {
            AiImageStatusResult aiImageStatusResult0 = (AiImageStatusResult)c0.a.a.a(uk.a, s, AiImageStatusResult.class);
            return aiImageStatusResult0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(aiImageStatusResult0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static S0 wl(X x0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 wm(Function1 function10) [...]

    private static Object wn() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 wo(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 wp(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 wq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 wr(Function1 function10) [...]

    private static Object ws() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 wt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder wu(String s) [...]

    // 检测为 Lambda 实现
    private static g wv(m m0, String s, String s1, String s2, String s3) [...]

    // 检测为 Lambda 实现
    private static S0 ww(Function1 function10) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 wx(o o0) [...]

    // 检测为 Lambda 实现
    private static g wy(String s, Q q0, String s1) [...]

    // 检测为 Lambda 实现
    private static S0 wz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object x0() [...]

    // 检测为 Lambda 实现
    private static S0 xA(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xB(AiPromptLoadItem aiPromptLoadItem0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xC(boolean z, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xE(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xF(String s, o o0) [...]

    public static g xG(String s, String s1) {
        return g.v1(new C()).f2((String s2) -> uk.fG().W(() -> "https://upload.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("_app_aiImg_resample_upload.php"))).R((o o0) -> ((S0)o0.invoke("app_id", s2))).R((o o0) -> ((S0)o0.invoke("gall_id", s))).S((p p0) -> {
            if(s1 != null) {
                File file0 = new File(s1);
                p0.invoke("resample_img_file", file0.getName(), com.dcinside.app.http.n.b(file0, null));
            }
            return S0.a;
        }).w((String s) -> try {
            k k0 = (k)c0.a.a.a(uk.a, s, k.class);
            return k0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(k0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object xj() [...]

    public static g xk(String s, g0.b b0) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("alarm"))).G((Function1 function10) -> ((S0)function10.invoke("article"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(b0 != null) {
                o0.invoke("type", b0.c());
            }
            return S0.a;
        }).H((o o0) -> {
            if(s != null) {
                o0.invoke("id", s);
            }
            return S0.a;
        }).w((String s) -> try {
            g0.f.c f$c0 = (g0.f.c)c0.a.a.a(uk.a, s, g0.f.c.class);
            return f$c0 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f$c0);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static g xl(String s) [...]

    // 检测为 Lambda 实现
    private static S0 xm(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xo(List list0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xp(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xq(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 xr(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xt(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder xu(String s, Uri.Builder uri$Builder0) [...]

    private static Object xv() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 xw(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 xx(String s, o o0) [...]

    private static Object xy() [...] // Inlined contents

    // 检测为 Lambda 实现
    private static S0 xz(Q q0, o o0) [...]

    // 检测为 Lambda 实现
    public static Object y1() [...]

    // 检测为 Lambda 实现
    public static Object y5() [...]

    // 检测为 Lambda 实现
    private static S0 yA(com.dcinside.app.model.f f0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yB(com.dcinside.app.write.menu.ai.type.f f0, AiPromptLoadItem aiPromptLoadItem0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yC(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yD(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yE(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 yF(Function1 function10) [...]

    public static g yG(V.z z0) {
        return g.v1(new C()).f2((String s) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("alarm"))).Q((Function1 function10) -> ((S0)function10.invoke("restore"))).R((o o0) -> ((S0)o0.invoke("app_id", s))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && s.length() > 0) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> {
            o0.invoke("restore_type", "del_restore");
            return S0.a;
        }).R((o o0) -> {
            if(z0 != null) {
                o0.invoke("restore_data", uk.a.D(z0));
            }
            return S0.a;
        }).w((String s) -> try {
            f0 f00 = (f0)c0.a.a.a(uk.a, s, f0.class);
            return f00 == null ? xk.r(s, new com.dcinside.app.http.f(0x7F150310)) : g.Q2(f00);  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object yi() [...]

    public static g yk(String s) {
        return g.v1(new C()).f2((String s1) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("autozzal"))).G((Function1 function10) -> ((S0)function10.invoke("list"))).H((o o0) -> ((S0)o0.invoke("app_id", s1))).H((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> {
            if(s.equals("__DC_GLOBAL_DEF_IMAGE_ID")) {
                s = "X";
            }
            o0.invoke("id", s);
            return S0.a;
        }).w((String s) -> try {
            j0.a a0 = (j0.a)c0.a.a.a(uk.a, s, j0.a.class);
            if(a0 != null) {
                return a0.f() ? g.Q2(a0) : g.X1(new com.dcinside.app.http.f(a0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static g yl(X x0, String s) [...]

    // 检测为 Lambda 实现
    private static S0 ym(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yn(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static g yo(String s) [...]

    // 检测为 Lambda 实现
    private static S0 yp(List list0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yq(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 yr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 ys(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 yt(o o0) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder yu(Integer integer0, Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 yv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 yw(o o0) [...]

    // 检测为 Lambda 实现
    private static g yx(String s, String s1, int v, String s2) [...]

    // 检测为 Lambda 实现
    private static S0 yy(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 yz(int v, o o0) [...]

    // 检测为 Lambda 实现
    public static Object z2() [...]

    // 检测为 Lambda 实现
    public static Object z7() [...]

    // 检测为 Lambda 实现
    private static S0 zA(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zB(com.dcinside.app.write.menu.ai.type.f f0, AiPromptLoadItem aiPromptLoadItem0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zC(o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 zD(boolean z, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zE(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zF(Function1 function10) [...]

    public static g zG(String s, boolean z, boolean z1) {
        return g.v1(new C()).f2((String s1) -> uk.fG().W(() -> "https://app.dcinside.com/").Q((Function1 function10) -> ((S0)function10.invoke("api"))).Q((Function1 function10) -> ((S0)function10.invoke("autozzal"))).Q((Function1 function10) -> ((S0)function10.invoke("setting"))).R((o o0) -> ((S0)o0.invoke("app_id", s1))).R((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).R((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).R((o o0) -> // 去混淆评级： 低(20)
        (z ? ((S0)o0.invoke("mode", "random")) : ((S0)o0.invoke("mode", "use")))).R((o o0) -> // 去混淆评级： 低(20)
        (z1 ? ((S0)o0.invoke("use", "1")) : ((S0)o0.invoke("use", "0")))).R((o o0) -> {
            if(s.equals("__DC_GLOBAL_DEF_IMAGE_ID")) {
                s = "X";
            }
            o0.invoke("id", s);
            return S0.a;
        }).w((String s) -> try {
            j0.b b0 = (j0.b)c0.a.a.a(uk.a, s, j0.b.class);
            if(b0 != null) {
                return b0.f() ? g.Q2(b0) : g.X1(new com.dcinside.app.http.f(b0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    public static Object za() [...]

    public static g zk() {
        return g.v1(new C()).f2((String s) -> uk.vk().K(() -> "https://app.dcinside.com/").G((Function1 function10) -> ((S0)function10.invoke("api"))).G((Function1 function10) -> ((S0)function10.invoke("autozzal"))).G((Function1 function10) -> ((S0)function10.invoke("my_list"))).H((o o0) -> ((S0)o0.invoke("confirm_id", B.i7()))).H((o o0) -> {
            String s = dl.a.c0();
            if(s != null && !s.isEmpty()) {
                o0.invoke("client_id", s);
            }
            return S0.a;
        }).H((o o0) -> ((S0)o0.invoke("app_id", s))).H((o o0) -> ((S0)o0.invoke("mode", "gallery"))).w((String s) -> try {
            j0.d d0 = (j0.d)c0.a.a.a(uk.a, s, j0.d.class);
            if(d0 != null) {
                return d0.f() ? g.Q2(d0) : g.X1(new com.dcinside.app.http.f(d0.a()));
            }
            return xk.r(s, new com.dcinside.app.http.f(0x7F150310));  // string:failed_cant_read "데이터를 읽을 수 없습니다."
        }
        catch(Exception exception0) {
            return g.X1(exception0);
        }));
    }

    // 检测为 Lambda 实现
    private static Uri.Builder zl(String s) [...]

    // 检测为 Lambda 实现
    private static S0 zm(o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zn(o o0) [...]

    // 检测为 Lambda 实现
    private static g zo(String s, List list0, String s1) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static S0 zp(o o0) [...]

    // 检测为 Lambda 实现
    private static g zq(String s) [...]

    // 检测为 Lambda 实现
    private static S0 zr(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zs(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 zt(String s, o o0) [...]

    // 检测为 Lambda 实现
    private static Uri.Builder zu(Uri.Builder uri$Builder0) [...]

    // 检测为 Lambda 实现
    private static S0 zv(Function1 function10) [...]

    // 检测为 Lambda 实现
    private static S0 zw(String s, o o0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static g zx(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static S0 zy(V v0, o o0) [...]

    // 检测为 Lambda 实现
    private static S0 zz(String s, o o0) [...]
}

