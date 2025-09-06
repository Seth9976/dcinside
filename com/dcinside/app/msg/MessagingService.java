package com.dcinside.app.msg;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.post.PostContainerFullActivity;
import com.dcinside.app.push.PushNoticeListActivity;
import com.dcinside.app.realm.e;
import com.dcinside.app.realm.n;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Zk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import g0.c;
import io.realm.F0;
import io.realm.W;
import io.realm.r1;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.J;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nMessagingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingService.kt\ncom/dcinside/app/msg/MessagingService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,529:1\n1#2:530\n177#3,9:531\n177#3,9:545\n177#3,9:554\n1755#4,3:540\n31#5:543\n31#5:544\n*S KotlinDebug\n*F\n+ 1 MessagingService.kt\ncom/dcinside/app/msg/MessagingService\n*L\n62#1:531,9\n191#1:545,9\n473#1:554,9\n73#1:540,3\n101#1:543\n122#1:544\n*E\n"})
public final class MessagingService extends FirebaseMessagingService {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final String a(Context context0) {
            List list0;
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent0 = new Intent("android.intent.action.MAIN");
            intent0.addCategory("android.intent.category.LAUNCHER");
            try {
                list0 = packageManager0.queryIntentActivities(intent0, 0);
            }
            catch(Exception exception0) {
                b.a.e(exception0);
                return null;
            }
            L.m(list0);
            for(Object object0: list0) {
                ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                if(v.O1(resolveInfo0.activityInfo.applicationInfo.packageName, "com.dcinside.app.android", true)) {
                    return resolveInfo0.activityInfo.name;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        public final void b(@l Context context0, int v) {
            L.p(context0, "context");
            String s = this.a(context0);
            if(s == null) {
                return;
            }
            Intent intent0 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent0.putExtra("badge_count", v);
            intent0.putExtra("badge_count_package_name", "com.dcinside.app.android");
            intent0.putExtra("badge_count_class_name", s);
            context0.sendBroadcast(intent0);
        }

        public final void c(@m String s) throws Exception {
            try {
                dl dl0 = dl.a;
                if(!L.g(dl0.c0(), s)) {
                    dl0.U3(s);
                }
            }
            catch(Exception exception0) {
                b.a.y(exception0);
            }
            try {
                FirebaseMessaging firebaseMessaging0 = FirebaseMessaging.y();
                firebaseMessaging0.i0("DcRefreshRemoteConfig");
                firebaseMessaging0.i0("DcShowNoticeMessage");
            }
            catch(Exception exception1) {
                b.a.y(exception1);
            }
        }
    }

    public final class com.dcinside.app.msg.MessagingService.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            try {
                arr_v[c.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.h.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.i.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.j.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.k.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.l.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.msg.MessagingService.b.a = arr_v;
        }
    }

    @l
    public static final a o;

    static {
        MessagingService.o = new a(null);
    }

    private final boolean B(String s) {
        if(Build.VERSION.SDK_INT < 26) {
            return true;
        }
        Object object0 = this.getSystemService("notification");
        NotificationChannel notificationChannel0 = null;
        NotificationManager notificationManager0 = object0 instanceof NotificationManager ? ((NotificationManager)object0) : null;
        if(notificationManager0 != null) {
            try {
                notificationChannel0 = notificationManager0.getNotificationChannel(s);
            }
            catch(Exception unused_ex) {
            }
            return notificationChannel0 == null || notificationChannel0.getImportance() != 0;
        }
        return true;
    }

    private final V C(F0 f00, String s, int v, c c0, String s1) {
        Class class0 = n.class;
        long v1 = 0L;
        if(f00.C4(class0).N() >= 10L) {
            n n0 = (n)f00.C4(class0).g2("time", r1.c).p0().get(9);
            if(n0 != null) {
                v1 = n0.S5();
                f00.Y3((F0 f01) -> {
                    L.p(f00, "$realm");
                    L.p(n0, "$msg");
                    f00.C4(n.class).v1("time", n0.V5()).p0().L0();
                });
            }
        }
        else {
            Number number0 = f00.C4(class0).G1("idx");
            if(number0 != null) {
                v1 = number0.longValue() + 1L;
            }
        }
        n n1 = new n();
        n1.Y5(v1);
        if(dl.a.x1() == 0) {
            n1.X5(s);
            n1.Z5(v);
            n1.W5(1);
            n1.b6(System.currentTimeMillis());
            n1.a6(s1);
        }
        else {
            n1.W5(1);
            n1.a6(String.valueOf(c0.c()));
        }
        f00.Y3((F0 f01) -> {
            L.p(f00, "$realm");
            L.p(n1, "$fcmMsg");
            f00.t2(n1, new W[0]);
        });
        return r0.a(v1, 1);
    }

    // 检测为 Lambda 实现
    private static final void D(F0 f00, n n0, F0 f01) [...]

    // 检测为 Lambda 实现
    private static final void E(F0 f00, n n0, F0 f01) [...]

    private final V F(F0 f00, n n0) {
        f00.Y3((F0 f00) -> {
            L.p(n0, "$fcmMsg");
            n0.W5(n0.Q5() + 1);
            n0.b6(System.currentTimeMillis());
        });
        return r0.a(n0.S5(), n0.Q5());
    }

    // 检测为 Lambda 实现
    private static final void G(n n0, F0 f00) [...]

    private final c H(String s) {
        if(s != null && v.T2(s, "키워드 :", true)) {
            return c.i;
        }
        if(s != null && v.T2(s, "개념글 :", true)) {
            return c.h;
        }
        return s == null || !v.T2(s, "관심글 :", true) ? c.e : c.g;
    }

    private final String I(String s) {
        if(s == null) {
            return "";
        }
        Matcher matcher0 = Pattern.compile("^(\\[.*?])").matcher(s);
        if(matcher0.find()) {
            try {
                String s1 = matcher0.group(1);
                if(s1 != null) {
                    return s1;
                }
            }
            catch(Exception unused_ex) {
            }
        }
        return "";
    }

    private final String J(int v, String s) {
        String s2;
        String s1 = this.getString(0x7F15079A, new Object[]{v});  // string:poll_item_count_text "%d개"
        L.o(s1, "getString(...)");
        if(L.g(s, "R")) {
            s2 = v <= 1 ? "새 댓글이 있습니다." : this.getString(0x7F150A52, new Object[]{s1});  // string:title_push_new_reply_more "새 댓글이 %s 있습니다."
            L.m(s2);
            return s2;
        }
        if(L.g(s, "RR")) {
            s2 = v <= 1 ? "새 답글이 있습니다." : this.getString(0x7F150A4F, new Object[]{s1});  // string:title_push_new_re_reply_more "새 답글이 %s 있습니다."
            L.m(s2);
            return s2;
        }
        s2 = v <= 1 ? "새 댓글이 있습니다." : this.getString(0x7F150A52, new Object[]{s1});  // string:title_push_new_reply_more "새 댓글이 %s 있습니다."
        L.m(s2);
        return s2;
    }

    private final void K(long v, String s, int v1, Integer integer0, String s1, String s2, c c0, int v2) {
        V v5;
        String s4;
        String s3;
        int v4;
        Intent intent1;
        Context context0 = this.getApplicationContext();
        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.h(this);
        taskStackBuilder0.b(new Intent(context0, HomeActivity.class));
        dl dl0 = dl.a;
        int v3 = dl0.x1();
        Class class0 = NotificationDeleteReceiver.class;
        boolean z = true;
        if(v3 == 0) {
            Intent intent0 = new Intent(context0, PostContainerFullActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.POST_NUMBER", v1);
            intent0.putExtra("com.dcinside.app.extra.PUSH_ALERT_TOUCHED", true);
            if(v1 <= 0) {
                z = false;
            }
            intent0.putExtra("com.dcinside.app.extra.RIGHT_OPEN", z);
            intent0.putExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_LIKE_POST", c0 == c.f);
            intent0.putExtra("com.dcinside.app.extra.COMMENT_NUMBER", integer0);
            intent0.putExtra("com.dcinside.app.extra.EXTRA_IS_REPLY_ONLY", false);
            intent0.putExtra("com.dcinside.app.extra.EXTRA_SHOW_TITLE", false);
            taskStackBuilder0.a(intent0);
            intent1 = new Intent(context0, class0).putExtra("com.dcinside.app.extra.GALLERY_ID", s).putExtra("com.dcinside.app.extra.POST_NUMBER", v1).putExtra("com.dcinside.app.extra.PUSH_ALERT_TOUCHED", true).setAction("com.dcinside.app.action.POST_REPLIED");
            L.o(intent1, "setAction(...)");
            v4 = ((int)(v % 10L)) + 1100;
        }
        else {
            Intent intent2 = new Intent(context0, PushNoticeListActivity.class);
            c c1 = c.e;
            intent2.putExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_MY_ACTIVE", c0 == c1);
            intent2.putExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_LIKE_POST", c0 == c.f);
            switch(c0) {
                case 1: 
                case 2: {
                    s3 = "actionPushMyActiveTab";
                    break;
                }
                default: {
                    s3 = "actionPushNewPostTab";
                }
            }
            intent2.setAction(s3);
            taskStackBuilder0.a(intent2);
            intent1 = new Intent(context0, class0).putExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_MY_ACTIVE", c0 == c1).setAction("com.dcinside.app.action.GROUP_REPLIED");
            L.o(intent1, "setAction(...)");
            v4 = c0 == c1 ? 10002 : 10001;
        }
        PendingIntent pendingIntent0 = taskStackBuilder0.n(v4, Zk.d.c());
        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(this, 0, intent1, Zk.c.c());
        switch(c0) {
            case 1: {
                s4 = "com.dcinside.app_channel_0";
                break;
            }
            case 2: {
                s4 = "com.dcinside.app_channel_0.1";
                break;
            }
            case 3: {
                s4 = "com.dcinside.app_channel_5";
                break;
            }
            case 4: {
                s4 = "com.dcinside.app_channel_3";
                break;
            }
            case 5: {
                s4 = "com.dcinside.app_channel_1";
                break;
            }
            case 6: {
                s4 = "com.dcinside.app_channel_4";
                break;
            }
            case 7: {
                s4 = "com.dcinside.app_channel_2";
                break;
            }
            case 8: {
                s4 = "com.dcinside.app_channel_7";
                break;
            }
            default: {
                throw new J();
            }
        }
        if(!this.B(s4)) {
            return;
        }
        switch(ll.W()) {
            case 1: {
                v5 = r0.a(1, s4);
                break;
            }
            case 2: {
                v5 = r0.a(2, s4);
                break;
            }
            case 3: {
                v5 = r0.a(3, s4);
                break;
            }
            default: {
                v5 = r0.a(0, s4);
            }
        }
        Builder notificationCompat$Builder0 = new Builder(this, ((String)v5.f())).I(ContextCompat.getColor(this, 0x7F0603FE)).t0(0x7F0802F1).C(true).S(((Number)v5.e()).intValue()).T(pendingIntent1).M(pendingIntent0);  // color:primary0
        L.m(notificationCompat$Builder0);
        this.O(s1, s2, c0, notificationCompat$Builder0, v2);
        Object object0 = this.getSystemService("notification");
        NotificationManager notificationManager0 = object0 instanceof NotificationManager ? ((NotificationManager)object0) : null;
        if(notificationManager0 != null) {
            notificationManager0.notify(v4, notificationCompat$Builder0.h());
        }
        dl0.m5(dl0.w1() + 1);
        int v6 = Math.min(dl0.w1(), 99);
        MessagingService.o.b(this, v6);
    }

    private final void L(Map map0) {
        V v3;
        n n0;
        Class class0;
        String s15;
        F0 f04;
        c c0;
        F0 f01;
        Integer integer2;
        com.dcinside.app.realm.e.a e$a1;
        int v1;
        com.dcinside.app.realm.e.a e$a0;
        F0 f00;
        String s = (String)map0.get("id");
        if(s != null) {
            String s1 = v.G5(s).toString();
            if(s1 != null) {
                String s2 = s1.length() <= 0 ? null : s1;
                if(s2 != null) {
                    String s3 = (String)map0.get("no");
                    if(s3 != null) {
                        String s4 = v.G5(s3).toString();
                        if(s4 != null) {
                            Integer integer0 = v.b1(s4);
                            if(integer0 != null) {
                                int v = (int)integer0;
                                String s5 = (String)map0.get("message");
                                if(s5 == null) {
                                    s5 = "";
                                }
                                String s6 = Dl.C(s5);
                                String s7 = (String)map0.get("name");
                                if(s7 == null) {
                                    s7 = "";
                                }
                                String s8 = (String)map0.get("ip");
                                if(s8 == null) {
                                    s8 = "";
                                }
                                String s9 = (String)map0.get("user_id");
                                if(s9 == null) {
                                    s9 = "";
                                }
                                String s10 = (String)map0.get("comment_type");
                                String s11 = s10 == null ? "" : s10;
                                String s12 = (String)map0.get("alarm_type");
                                if(s12 == null) {
                                    s12 = "";
                                }
                                String s13 = (String)map0.get("comment_no");
                                Integer integer1 = s13 == null ? null : v.b1(s13);
                                String s14 = (String)map0.get("memo");
                                try {
                                    try {
                                        f00 = null;
                                        f00 = F0.g4();
                                        e$a0 = e.k;
                                        e e0 = e$a0.c(f00, s2);
                                        if(e$a0.a(e0)) {
                                            if(m0.a.a.k(s8)) {
                                                goto label_40;
                                            }
                                            goto label_41;
                                        }
                                        else {
                                            goto label_51;
                                        }
                                        goto label_58;
                                    }
                                    catch(Exception exception0) {
                                        goto label_112;
                                    }
                                label_40:
                                    s8 = s8 + ".";
                                }
                                catch(Throwable throwable0) {
                                    goto label_123;
                                }
                                try {
                                label_41:
                                    v1 = v;
                                    e$a1 = e$a0;
                                    integer2 = integer0;
                                    f01 = f00;
                                    if(e$a0.b(e0, s14, s7, s9, s8)) {
                                        goto label_46;
                                    }
                                    goto label_58;
                                }
                                catch(Exception exception0) {
                                    f00 = f01;
                                    goto label_112;
                                }
                                catch(Throwable throwable0) {
                                    f00 = f01;
                                    goto label_123;
                                }
                            label_46:
                                if(f01 != null) {
                                    try {
                                        F0 f02 = f01.isClosed() ? null : f01;
                                        if(f02 != null) {
                                            f02.close();
                                        }
                                        return;
                                    }
                                    catch(Exception unused_ex) {
                                    }
                                }
                                return;
                                try {
                                label_51:
                                    integer2 = integer0;
                                    v1 = v;
                                    e$a1 = e$a0;
                                    f01 = f00;
                                    goto label_58;
                                }
                                catch(Exception exception0) {
                                    goto label_112;
                                    try {
                                    label_58:
                                        e e1 = e$a1.c(f01, "");
                                        if(e$a1.a(e1)) {
                                            goto label_60;
                                        }
                                        c0 = c.d.a(s12);
                                        goto label_71;
                                    }
                                    catch(Exception exception0) {
                                        f04 = f01;
                                        goto label_111;
                                    }
                                    catch(Throwable throwable0) {
                                        f04 = f01;
                                        f00 = f04;
                                        goto label_123;
                                    }
                                    try {
                                    label_60:
                                        if(e$a1.b(e1, s14, s7, s9, (m0.a.a.k(s8) ? s8 + "." : s8))) {
                                            goto label_61;
                                        }
                                        c0 = c.d.a(s12);
                                        goto label_71;
                                    }
                                    catch(Exception exception0) {
                                        f00 = f01;
                                        goto label_112;
                                    }
                                    catch(Throwable throwable0) {
                                        f00 = f01;
                                        goto label_123;
                                    }
                                label_61:
                                    if(f01 != null) {
                                        try {
                                            F0 f03 = f01.isClosed() ? null : f01;
                                            if(f03 != null) {
                                                f03.close();
                                            }
                                            return;
                                        }
                                        catch(Exception unused_ex) {
                                        }
                                    }
                                    return;
                                    try {
                                        c0 = c.d.a(s12);
                                        goto label_71;
                                    }
                                    catch(Exception exception0) {
                                        f04 = f01;
                                        goto label_111;
                                    label_71:
                                        if(c0 == c.l) {
                                            try {
                                                c0 = this.H(s6);
                                                goto label_77;
                                            }
                                            catch(Exception exception0) {
                                            }
                                            catch(Throwable throwable0) {
                                                f00 = f01;
                                                goto label_123;
                                            }
                                            f00 = f01;
                                            goto label_112;
                                        }
                                    label_77:
                                        if(c0 == c.e) {
                                            try {
                                                s15 = c0.e() + "_" + s11;
                                            }
                                            catch(Exception unused_ex) {
                                                f04 = f01;
                                                v3 = r0.a(0L, 1);
                                                goto label_102;
                                            }
                                            catch(Throwable throwable0) {
                                                f00 = f01;
                                                goto label_123;
                                            }
                                        }
                                        else {
                                            try {
                                                s15 = c0.e();
                                            label_81:
                                                int v2 = dl.a.x1();
                                                class0 = n.class;
                                                if(v2 == 0) {
                                                    goto label_89;
                                                }
                                                else {
                                                    n0 = (n)f01.C4(class0).i0("pushType", String.valueOf(c0.c())).r0();
                                                }
                                                goto label_96;
                                            }
                                            catch(Exception unused_ex) {
                                                f04 = f01;
                                                v3 = r0.a(0L, 1);
                                                goto label_102;
                                            }
                                            catch(Throwable throwable0) {
                                                f04 = f01;
                                                f00 = f04;
                                                goto label_123;
                                            }
                                        }
                                        goto label_81;
                                    }
                                    catch(Throwable throwable0) {
                                        f04 = f01;
                                        f00 = f04;
                                        goto label_123;
                                    }
                                    try {
                                    label_89:
                                        n0 = (n)f01.C4(class0).i0("galleryId", s2).f0("postNumber", integer2).i0("pushType", s15).r0();
                                    }
                                    catch(Exception unused_ex) {
                                        f04 = f01;
                                        v3 = r0.a(0L, 1);
                                        goto label_102;
                                    }
                                    catch(Throwable throwable0) {
                                        f00 = f01;
                                        goto label_123;
                                    }
                                    try {
                                        try {
                                        label_96:
                                            if(n0 == null) {
                                                f04 = f01;
                                                v3 = this.C(f04, s2, v1, c0, s15);
                                            }
                                            else {
                                                f04 = f01;
                                                v3 = this.F(f04, n0);
                                            }
                                        }
                                        catch(Exception unused_ex) {
                                            v3 = r0.a(0L, 1);
                                        }
                                        while(true) {
                                            try {
                                            label_102:
                                                L.m(s6);
                                                this.K(((Number)v3.a()).longValue(), s2, v1, integer1, s6, s11, c0, ((Number)v3.b()).intValue());
                                                goto label_128;
                                            }
                                            catch(Exception exception0) {
                                                break;
                                            }
                                            try {
                                                f00 = f04;
                                                goto label_123;
                                            }
                                            catch(Exception unused_ex) {
                                                try {
                                                    v3 = r0.a(0L, 1);
                                                    goto label_102;
                                                }
                                                catch(Exception exception0) {
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    catch(Throwable throwable0) {
                                        f00 = f04;
                                        goto label_123;
                                    }
                                label_111:
                                    f00 = f04;
                                    try {
                                    label_112:
                                        exception0.printStackTrace();
                                        goto label_116;
                                    }
                                    catch(Throwable throwable0) {
                                    }
                                    goto label_123;
                                }
                                catch(Throwable throwable0) {
                                    goto label_123;
                                }
                            label_116:
                                if(f00 != null) {
                                    try {
                                        if(f00.isClosed()) {
                                            goto label_120;
                                        }
                                        else {
                                            f04 = f00;
                                        }
                                        goto label_121;
                                    }
                                    catch(Exception unused_ex) {
                                        return;
                                    }
                                    f04 = f00;
                                    goto label_121;
                                label_120:
                                    f04 = null;
                                label_121:
                                    if(f04 != null) {
                                        goto label_132;
                                    }
                                    return;
                                label_123:
                                    if(f00 != null) {
                                        try {
                                            F0 f05 = f00.isClosed() ? null : f00;
                                            if(f05 != null) {
                                                f05.close();
                                            }
                                        }
                                        catch(Exception unused_ex) {
                                        }
                                    }
                                    throw throwable0;
                                label_128:
                                    if(f04 != null) {
                                        try {
                                            if(f04.isClosed()) {
                                                f04 = null;
                                            }
                                            if(f04 != null) {
                                            label_132:
                                                f04.close();
                                            }
                                        }
                                        catch(Exception unused_ex) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void M(Map map0) {
        Integer integer0;
        List list0;
        String s6;
        String s = (String)map0.get("title");
        if(s != null) {
            String s1 = null;
            String s2 = v.G5(s).toString();
            if(s2 != null) {
                if(s2.length() <= 0) {
                    s2 = null;
                }
                if(s2 != null) {
                    String s3 = (String)map0.get("content");
                    if(s3 != null) {
                        String s4 = v.G5(s3).toString();
                        if(s4 != null) {
                            if(s4.length() <= 0) {
                                s4 = null;
                            }
                            if(s4 != null) {
                                String s5 = (String)map0.get("link");
                                int v = 0;
                                if(s5 == null) {
                                    s6 = null;
                                }
                                else {
                                    s6 = v.G5(s5).toString();
                                    if(s6 == null || s6.length() <= 0 || !v.v2(s6, "http", false, 2, null)) {
                                        s6 = null;
                                    }
                                }
                                try {
                                    String s7 = (String)map0.get("lang");
                                    if(s7 == null) {
                                    label_31:
                                        list0 = null;
                                    }
                                    else {
                                        String s8 = v.G5(s7).toString();
                                        if(s8 != null) {
                                            String s9 = s8.length() <= 0 ? null : s8;
                                            if(s9 != null) {
                                                list0 = v.V4(s9, new String[]{","}, false, 0, 6, null);
                                                goto label_32;
                                            }
                                        }
                                        goto label_31;
                                    }
                                }
                                catch(Exception unused_ex) {
                                    goto label_31;
                                }
                            label_32:
                                String s10 = (String)map0.get("verCode");
                                if(s10 == null) {
                                    integer0 = null;
                                }
                                else {
                                    String s11 = v.G5(s10).toString();
                                    if(s11 == null) {
                                        integer0 = null;
                                    }
                                    else {
                                        if(s11.length() <= 0) {
                                            s11 = null;
                                        }
                                        integer0 = s11 == null ? null : v.b1(s11);
                                    }
                                }
                                String s12 = (String)map0.get("verType");
                                if(s12 != null) {
                                    String s13 = v.G5(s12).toString();
                                    if(s13 != null) {
                                        if(s13.length() > 0) {
                                            s1 = s13;
                                        }
                                        if(s1 != null) {
                                            Integer integer1 = v.b1(s1);
                                            if(integer1 != null) {
                                                v = (int)integer1;
                                            }
                                        }
                                    }
                                }
                                switch(v) {
                                    case 1: {
                                        if(integer0 != null && ((int)integer0) >= 100124) {
                                            goto label_62;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        if(integer0 == null || ((int)integer0) > 100124) {
                                            return;
                                        }
                                    label_62:
                                        if(list0 != null) {
                                            String s14 = Locale.getDefault().getLanguage();
                                            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                                                for(Object object0: list0) {
                                                    if(!v.O1(s14, ((String)object0), true)) {
                                                        continue;
                                                    }
                                                    goto label_71;
                                                }
                                            }
                                            return;
                                        }
                                    label_71:
                                        if(s6 == null) {
                                            this.Q(s2, s4);
                                            return;
                                        }
                                        this.P(s2, s4, s6);
                                        break;
                                    }
                                    default: {
                                        goto label_62;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void N() {
        dl.a.W3(true);
    }

    private final void O(String s, String s1, c c0, Builder notificationCompat$Builder0, int v) {
        String s4;
        dl dl0 = dl.a;
        if(dl0.x1() == 0) {
            if(dl0.u1() != 0) {
                String s2 = this.I(s);
                if(s == null) {
                    s = "";
                }
                else {
                    s = v.l2(s, s2 + " ", "", false, 4, null);
                    if(s == null) {
                        s = "";
                    }
                }
            }
            switch(com.dcinside.app.msg.MessagingService.b.a[c0.ordinal()]) {
                case 1: {
                    if(s1 == null) {
                        s1 = "";
                    }
                    notificationCompat$Builder0.O(this.J(v, s1)).N(s);
                    return;
                }
                case 2: {
                    notificationCompat$Builder0.O("새 추천이 있습니다.").N(s);
                    return;
                }
                case 3: {
                    notificationCompat$Builder0.O("관심글에 새 댓글이 있습니다.").N(s);
                    return;
                }
                case 4: {
                    notificationCompat$Builder0.O("개념글이 있습니다.").N(s);
                    return;
                }
                case 5: {
                    notificationCompat$Builder0.O("키워드 글이 있습니다.").N(s);
                    return;
                }
                case 6: {
                    notificationCompat$Builder0.O("공지 글이 있습니다.").N(s);
                    return;
                }
                case 7: {
                    notificationCompat$Builder0.O("이용자 새 글이 있습니다.").N(s);
                    return;
                }
                default: {
                    notificationCompat$Builder0.N(s);
                    return;
                }
            }
        }
        String s3 = this.getString(0x7F15079A, new Object[]{v});  // string:poll_item_count_text "%d개"
        L.o(s3, "getString(...)");
        switch(com.dcinside.app.msg.MessagingService.b.a[c0.ordinal()]) {
            case 1: {
                s4 = v <= 1 ? "내 활동 알림이 있습니다." : this.getString(0x7F1506EF, new Object[]{s3});  // string:new_active_push_more "내 활동 알림이 %s 있습니다."
                break;
            }
            case 2: {
                s4 = "내 활동 알림이 있습니다.";
                break;
            }
            default: {
                s4 = v > 1 ? this.getString(0x7F1506F5, new Object[]{s3}) : "새 글 알림이 있습니다.";  // string:new_post_push_more "새 글 알림이 %s 있습니다."
            }
        }
        L.m(s4);
        notificationCompat$Builder0.O(s4);
    }

    private final void P(String s, String s1, String s2) {
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this, 0x404, new Intent("android.intent.action.VIEW", Uri.parse(s2)), Zk.d.c());
        Builder notificationCompat$Builder0 = new Builder(this, "com.dcinside.app_channel_7").O(s).N(s1).B0(s1).z0(new BigTextStyle().A(s1)).I(vk.b(this, 0x7F040158)).t0(0x7F0802F1).C(true).M(pendingIntent0);  // attr:colorPrimary
        NotificationManager notificationManager0 = (NotificationManager)ContextCompat.getSystemService(this, NotificationManager.class);
        if(notificationManager0 != null) {
            notificationManager0.notify(0x404, notificationCompat$Builder0.h());
        }
    }

    private final void Q(String s, String s1) {
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this, 0x404, new Intent(this, HomeActivity.class), Zk.d.c());
        Builder notificationCompat$Builder0 = new Builder(this, "com.dcinside.app_channel_7").O(s).N(s1).B0(s1).z0(new BigTextStyle().A(s1)).I(vk.b(this, 0x7F040158)).t0(0x7F0802F1).C(true).M(pendingIntent0);  // attr:colorPrimary
        NotificationManager notificationManager0 = (NotificationManager)ContextCompat.getSystemService(this, NotificationManager.class);
        if(notificationManager0 != null) {
            notificationManager0.notify(0x404, notificationCompat$Builder0.h());
        }
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public void r(@l RemoteMessage remoteMessage0) {
        L.p(remoteMessage0, "remoteMessage");
        Map map0 = remoteMessage0.getData();
        L.o(map0, "getData(...)");
        String s = (String)map0.get("type");
        if(s != null) {
            switch(s) {
                case "DcRefreshRemoteConfig": {
                    this.N();
                    return;
                }
                case "DcShowNoticeMessage": {
                    this.M(map0);
                    return;
                }
                case "custom_message": 
                case "post_replied": {
                    this.L(map0);
                    break;
                }
            }
        }
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public void t(@l String s) {
        L.p(s, "token");
        super.t(s);
        MessagingService.o.c(s);
    }
}

