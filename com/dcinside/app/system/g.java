package com.dcinside.app.system;

import androidx.annotation.NonNull;
import com.dcinside.app.realm.d0;
import com.dcinside.app.realm.d;
import com.dcinside.app.realm.u0;
import com.dcinside.app.type.m;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import io.realm.E;
import io.realm.G;
import io.realm.L;
import io.realm.T0;
import io.realm.W0;
import io.realm.f1;
import io.realm.g1;
import io.realm.h1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class g implements W0 {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            a.a = arr_v;
            try {
                arr_v[m.g.ordinal()] = 1;
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

    public static final long a = 97L;

    @Override  // io.realm.W0
    public void a(@NonNull E e0, long v, long v1) {
        Iterator iterator3;
        h1 h10 = e0.e0();
        Class class0 = String.class;
        if(Long.compare(v, 1L) < 0) {
            h10.h("Gallery").c("manager", class0, new L[0]).c("submanager", class0, new L[0]);
            h10.e("MinorCategory").c("categoryNumber", Integer.TYPE, new L[]{L.b}).c("name", class0, new L[]{L.a}).h("galleries", h10.h("Gallery"));
        }
        if(v < 2L) {
            h10.e("FavoriteLine").c("galleryId", class0, new L[]{L.b}).c("galleryName", class0, new L[0]);
            h10.e("LikeLog").c("time", Long.TYPE, new L[0]).c("log", class0, new L[0]);
            h10.h("Block").M("galleryId", true);
            h10.h("PostArchive").M("key", true);
            h10.h("Recent").M("galleryId", true);
            h10.h("RecentSearch").M("text", true);
        }
        if(v < 3L) {
            h10.h("Category").F("galleries");
            h10.h("MinorCategory").F("galleries");
        }
        if(v < 4L) {
            h10.h("ImageDownloadInfo").F("progress").F("complete").c("state", Integer.TYPE, new L[0]);
        }
        if(v < 5L) {
            f1 f10 = h10.e("FcmMsg");
            Class class1 = Long.TYPE;
            f1 f11 = f10.c("idx", class1, new L[]{L.b}).c("galleryId", class0, new L[0]);
            Class class2 = Integer.TYPE;
            f11.c("postNumber", class2, new L[0]).c("count", class2, new L[0]).c("time", class1, new L[]{L.a});
        }
        if(v < 6L) {
            h10.e("DefaultImage").c("galleryId", class0, new L[]{L.b}).c("path", class0, new L[0]);
            String s = ll.o();
            if(m0.a.k(s)) {
                ll.j0(null);
                e0.N1("DefaultImage", "__DC_GLOBAL_DEF_IMAGE_ID").U6("path", s);
            }
        }
        if(v < 7L) {
            h10.h("PostWrite").c("imageTag", class0, new L[0]).c("detailIdx", Integer.TYPE, new L[0]);
        }
        if(v < 8L) {
            f1 f12 = h10.e("Captcha").c("galleryId", class0, new L[]{L.b});
            Class class3 = Integer.TYPE;
            f12.c("writeCodeCount", class3, new L[0]).c("replyCodeCount", class3, new L[0]);
        }
        if(v < 9L) {
            h10.u("Captcha");
            f1 f13 = h10.e("Advice").c("galleryId", class0, new L[]{L.b}).c("galleryName", class0, new L[0]).c("categoryName", class0, new L[0]);
            Class class4 = Integer.TYPE;
            f1 f14 = f13.c("maxUploadCount", class4, new L[0]).c("maxUploadSize", Long.TYPE, new L[0]);
            Class class5 = Boolean.TYPE;
            f14.c("blockingWrite", class5, new L[0]).c("adult", class5, new L[0]).c("lady", class4, new L[0]).c("captcha", class5, new L[0]).c("codeCount", class4, new L[0]).c("commentCaptcha", class5, new L[0]).c("commentCodeCount", class4, new L[0]);
        }
        if(v < 10L) {
            h10.h("PostWrite").c("youtubeId", class0, new L[0]).c("type", Integer.TYPE, new L[0]);
        }
        if(v < 11L) {
            h10.e("StringKeyStringValue").c("key", class0, new L[]{L.a}).c("value", class0, new L[0]);
            h10.h("Advice").c("uniqueHash", Integer.TYPE, new L[0]).h("relations", h10.h("StringKeyStringValue"));
        }
        if(v < 12L) {
            f1 f15 = h10.e("SendBirdMyChannel");
            Class class6 = Long.TYPE;
            f15.c("id", class6, new L[]{L.b}).c("channelName", class0, new L[0]).c("channelUrl", class0, new L[0]);
            h10.e("SendBirdMessage").c("messageId", class6, new L[]{L.b}).c("channelId", class6, new L[0]).c("userId", class0, new L[0]).c("data", class0, new L[0]).c("msg", class0, new L[0]).c("name", class0, new L[0]).c("type", class0, new L[0]).c("timeStamp", class6, new L[0]);
        }
        if(v < 13L) {
            h10.h("SendBirdMyChannel").c("blockUsers", class0, new L[0]).c("lastEntered", Long.TYPE, new L[0]).c("operator", class0, new L[0]).c("data", class0, new L[0]);
        }
        if(v < 14L) {
            h10.h("SendBirdMyChannel").c("guestNickname", class0, new L[0]);
        }
        if(v < 15L) {
            h10.h("SendBirdMyChannel").F("blockUsers").h("blockUsers", h10.h("BlockItem"));
        }
        if(v < 16L) {
            h10.u("SendBirdMessage");
        }
        if(v < 17L) {
            h10.h("Advice").c("recommendCaptcha", Boolean.TYPE, new L[0]).c("recommendCodeCount", Integer.TYPE, new L[0]);
        }
        if(v < 18L) {
            h10.e("GalleryNoticePost").c("key", class0, new L[]{L.b}).c("galleryId", class0, new L[0]).c("postNumber", Integer.TYPE, new L[0]);
        }
        if(v < 19L) {
            e0.L2("GalleryNoticePost").p0().L0();
            h10.h("GalleryNoticePost").d("galleryId").c("postJson", class0, new L[0]);
        }
        if(v < 20L) {
            if(h10.h("Category").B("categoryNumber")) {
                h10.h("Category").M("categoryNumber", false);
            }
            if(h10.h("Gallery").B("galleryNumber")) {
                h10.h("Gallery").M("galleryNumber", false);
            }
            if(h10.h("Login").B("userNumber")) {
                h10.h("Login").M("userNumber", false);
            }
            if(h10.h("MinorCategory").B("categoryNumber")) {
                h10.h("MinorCategory").M("categoryNumber", false);
            }
            h10.h("PostTemp").H().c("time2", Long.TYPE, new L[0]).O((G g0) -> g0.z6("time2", g0.i6("time"))).F("time").I("time2", "time").e("time");
        }
        if(v < 21L) {
            h10.h("RecentSearch").c("type", Integer.TYPE, new L[]{L.a});
        }
        if(v < 22L) {
            h10.h("RecentSearch").H().c("key", class0, new L[0]).O((G g0) -> g0.z6("key", u0.X5(g0.f6("type"), g0.r6("text")))).e("key");
        }
        if(v < 23L) {
            h10.e("FavoriteGallery").c("key", class0, new L[]{L.b}).c("id", class0, new L[0]).c("name", class0, new L[0]).c("type", Integer.TYPE, new L[0]);
            for(Object object0: e0.L2("FavoriteLine").p0()) {
                String s1 = ((G)object0).r6("galleryId");
                String s2 = ((G)object0).r6("galleryName");
                G g0 = e0.N1("FavoriteGallery", 0 + s1);
                g0.U6("id", s1);
                g0.U6("name", s2);
                g0.I6("type", 0);
            }
            h10.u("FavoriteLine");
        }
        if(v < 24L) {
            g1 g10 = e0.L2("Gallery").p0();
            if(g10.size() > 0) {
                g10.L0();
            }
            g1 g11 = e0.L2("Category").p0();
            if(g11.size() > 0) {
                g11.L0();
            }
            g1 g12 = e0.L2("MinorCategory").p0();
            if(g12.size() > 0) {
                g12.L0();
            }
        }
        if(v < 25L) {
            h10.h("GalleryNoticePost").c("postDate", Long.TYPE, new L[0]);
        }
        if(v < 26L) {
            f1 f16 = h10.e("ArchiveFolderChild");
            Class class7 = Long.TYPE;
            f16.c("key", class7, new L[]{L.b}).c("name", class0, new L[]{L.a});
            f1 f17 = h10.e("ArchiveFolderParent");
            Class class8 = Integer.TYPE;
            f17.c("type", class8, new L[]{L.b}).h("childs", h10.h("ArchiveFolderChild"));
            h10.h("PostArchive").H().F("key").j("folder", h10.h("ArchiveFolderChild"));
            h10.e("VoiceArchive").c("galleryId", class0, new L[0]).c("galleryName", class0, new L[0]).c("postNumber", class8, new L[0]).c("subject", class0, new L[0]).c("date", class0, new L[0]).c("writeUserName", class0, new L[0]).c("source", class0, new L[0]).c("memo", class0, new L[0]).c("time", class7, new L[]{L.a}).j("folder", h10.h("ArchiveFolderChild"));
            G g1 = e0.N1("ArchiveFolderChild", d.X5());
            g1.z6("name", "기본");
            e0.N1("ArchiveFolderParent", 0).J6("childs", new T0(new G[]{g1}));
            G g2 = e0.N1("ArchiveFolderChild", d.X5());
            g2.z6("name", "기본");
            e0.N1("ArchiveFolderParent", 1).J6("childs", new T0(new G[]{g2}));
            for(Object object1: e0.L2("PostArchive").p0()) {
                ((G)object1).z6("folder", g2);
            }
        }
        if(v < 27L) {
            h10.u("SendBirdMyChannel");
        }
        if(v < 28L) {
            h10.h("DefaultImage").c("galleryName", class0, new L[0]);
            for(Iterator iterator2 = e0.L2("DefaultImage").p0().iterator(); iterator2.hasNext(); iterator2 = iterator3) {
                Object object2 = iterator2.next();
                G g3 = (G)object2;
                String s3 = g3.r6("galleryId");
                if("__DC_GLOBAL_DEF_IMAGE_ID".equals(s3)) {
                    g3.U6("galleryName", "기본");
                    iterator3 = iterator2;
                }
                else {
                    iterator3 = iterator2;
                    G g4 = (G)e0.L2("Gallery").i0("id", s3).r0();
                    String s4 = g4 == null ? null : g4.r6("name");
                    if(s4 != null) {
                        s3 = s4;
                    }
                    g3.U6("galleryName", s3);
                }
            }
            h10.h("Advice").F("categoryName").F("adult").F("lady").F("blockingWrite").F("maxUploadCount").F("maxUploadSize").F("captcha").F("codeCount").F("commentCaptcha").F("commentCodeCount").F("recommendCaptcha").F("recommendCodeCount");
            h10.u("MinorCategory");
            h10.u("Category");
            h10.u("Gallery");
            f1 f18 = h10.e("SearchGalleryItem").c("id", class0, new L[]{L.b}).c("name", class0, new L[0]);
            Class class9 = Boolean.TYPE;
            f18.c("isMinor", class9, new L[0]).c("isUnder", class9, new L[0]);
            h10.e("SearchGalleryCategory").c("id", Long.TYPE, new L[]{L.b}).c("name", class0, new L[]{L.a}).h("galleries", h10.h("SearchGalleryItem"));
            h10.u("GalleryNoticePost");
        }
        if(v < 29L) {
            h10.u("Advice");
            h10.u("StringKeyStringValue");
        }
        if(v < 30L) {
            h10.h("Login").c("tUserNumber", class0, new L[0]).O((G g0) -> g0.U6("tUserNumber", Integer.toString(g0.f6("userNumber")))).F("userNumber").e("tUserNumber").I("tUserNumber", "userNumber");
        }
        if(v < 0x1FL) {
            h10.e("UserMemoItem").c("userValue", class0, new L[]{L.a}).c("memo", class0, new L[0]);
            h10.e("UserMemo").c("galleryId", class0, new L[]{L.b}).h("memoList", h10.h("UserMemoItem"));
        }
        if(v < 0x20L) {
            h10.h("UserMemoItem").c("userType", Integer.TYPE, new L[0]);
        }
        if(v < 33L) {
            h10.h("Login").c("isBot", Boolean.TYPE, new L[0]);
        }
        if(v < 34L) {
            g1 g13 = e0.L2("Login").p0();
            HashMap hashMap0 = new HashMap();
            ArrayList arrayList0 = new ArrayList();
            for(Object object3: g13) {
                G g5 = (G)object3;
                if(hashMap0.containsKey(g5.r6("realId"))) {
                    arrayList0.add(g5);
                }
                else {
                    hashMap0.put(g5.r6("realId"), g5);
                }
            }
            for(Object object4: arrayList0) {
                ((G)object4).z5();
            }
            h10.h("Login").F("result").F("cause").H().e("realId");
        }
        if(v < 35L) {
            h10.h("UserMemoItem").F("userType");
        }
        if(v < 36L) {
            f1 f19 = h10.e("LastManagerSituation").c("galleryId", class0, new L[]{L.b}).c("situation", class0, new L[0]);
            Class class10 = Long.TYPE;
            f19.c("time", class10, new L[0]).c("show", class10, new L[0]);
        }
        if(v < 37L) {
            h10.h("SearchGalleryCategory").c("idx", Long.TYPE, new L[0]).G("name");
            h10.h("SearchGalleryItem").c("linkTo", class0, new L[0]);
            h10.h("Login").F("dormancy").c("isDormancy", class0, new L[0]);
        }
        if(v < 38L) {
            h10.e("ReadLog").c("key", class0, new L[]{L.b}).c("galleryId", class0, new L[0]).c("postNumber", Long.TYPE, new L[0]);
        }
        if(v < 39L) {
            f1 f110 = h10.h("DefaultImage").H();
            Class class11 = Boolean.TYPE;
            f110.c("pick", class11, new L[0]).c("random", class11, new L[0]);
        }
        if(v < 40L) {
            h10.h("ImageDownloadInfo").c("groupId", Long.TYPE, new L[0]);
        }
        if(v < 41L) {
            h10.h("ImageDownloadInfo").F("groupId").c("group", Long.TYPE, new L[0]);
        }
        if(v < 42L) {
            f1 f111 = h10.e("GalleryTextOption");
            Class class12 = Boolean.TYPE;
            f111.c("writeEnable", class12, new L[0]).c("replyEnable", class12, new L[0]).c("writePrefix", class0, new L[0]).c("writeSuffix", class0, new L[0]).c("replySuffix", class0, new L[0]).c("writePrefixColor", class0, new L[0]).c("writeSuffixColor", class0, new L[0]);
            h10.e("GalleryOptions").c("galleryId", class0, new L[]{L.b}).c("galleryName", class0, new L[0]).c("time", Long.TYPE, new L[]{L.a}).j("textOption", h10.h("GalleryTextOption"));
            G g6 = e0.J1("GalleryTextOption");
            g6.B6("writeEnable", ll.N());
            g6.U6("writePrefix", ll.u());
            g6.U6("writeSuffix", ll.t());
            g6.B6("replyEnable", ll.O());
            g6.U6("replySuffix", ll.w());
            g6.U6("writePrefixColor", "#ABABAB");
            g6.U6("writeSuffixColor", "#ABABAB");
            G g7 = e0.N1("GalleryOptions", "__DC_GLOBAL_DEF_IMAGE_ID");
            g7.U6("galleryName", "기본");
            g7.P6("textOption", g6);
        }
        if(v < 43L) {
            f1 f112 = h10.e("YoutubeSearchCache");
            Class class13 = Long.TYPE;
            f112.c("id", class13, new L[]{L.b}).c("keyword", class0, new L[]{L.a}).c("token", class0, new L[]{L.a}).c("value", byte[].class, new L[0]).c("time", class13, new L[]{L.a});
        }
        if(v < 44L) {
            h10.h("ArchiveFolderChild").G("name").c("recentTime", Long.TYPE, new L[]{L.a});
            long v2 = dl.a.B();
            long v3 = dl.a.D();
            if(v2 >= 0L) {
                G g8 = (G)e0.L2("ArchiveFolderChild").g0("key", v2).r0();
                if(g8 != null) {
                    g8.K6("recentTime", System.currentTimeMillis());
                }
            }
            if(v3 >= 0L) {
                G g9 = (G)e0.L2("ArchiveFolderChild").g0("key", v3).r0();
                if(g9 != null) {
                    g9.K6("recentTime", System.currentTimeMillis());
                }
            }
        }
        if(v < 45L) {
            h10.e("GalleryZipInfo").c("galleryId", class0, new L[]{L.b}).c("postHeads", byte[].class, new L[0]).c("postHeadStoreTimeMs", Long.TYPE, new L[0]);
        }
        if(v < 46L) {
            h10.u("ReadLog");
            h10.u("LikeLog");
            f1 f113 = h10.e("PostHistory").c("key", class0, new L[]{L.b}).c("galleryId", class0, new L[]{L.a}).c("galleryName", class0, new L[0]);
            Class class14 = Long.TYPE;
            f1 f114 = f113.c("postNumber", class14, new L[0]);
            Class class15 = Boolean.TYPE;
            f114.c("read", class15, new L[]{L.a}).c("write", class15, new L[]{L.a}).c("reply", class15, new L[]{L.a}).c("like", class15, new L[]{L.a}).c("dislike", class15, new L[]{L.a}).c("hitTo", class15, new L[]{L.a}).c("subject", class0, new L[0]).c("date", class0, new L[0]).c("name", class0, new L[0]).c("time", class14, new L[]{L.a});
        }
        if(v < 0x2FL) {
            HashSet hashSet0 = new HashSet();
            h10.h("PostArchive").c("key", class0, new L[0]).O((G g0) -> {
                String s = d0.b6(g0.r6("galleryId"), g0.f6("postNumber"));
                if(hashSet0.contains(s)) {
                    g0.z5();
                    return;
                }
                hashSet0.add(s);
                g0.U6("key", s);
            }).e("key");
            hashSet0.clear();
            h10.h("VoiceArchive").O((G g0) -> {
                String s = g0.r6("source");
                if(hashSet0.contains(s)) {
                    g0.z5();
                    return;
                }
                hashSet0.add(s);
            }).e("source");
            hashSet0.clear();
        }
        if(v < 0x30L) {
            h10.h("PostHistory").c("hide", Boolean.TYPE, new L[]{L.a});
        }
        if(v < 49L) {
            h10.h("PostHistory").G("read").G("hide").G("write").G("reply").G("like").G("dislike").G("hitTo");
        }
        if(v < 50L) {
            h10.h("PostWrite").c("match", Integer.TYPE, new L[0]);
        }
        if(v < 51L) {
            h10.h("Login").c("otpToken", class0, new L[0]).c("isOtp", class0, new L[0]);
        }
        if(v < 52L) {
            h10.e("MatchOtp").c("id", class0, new L[]{L.b}).c("token", class0, new L[0]);
        }
        if(v < 53L) {
            h10.h("FavoriteGallery").c("order", Integer.TYPE, new L[0]);
            g1 g14 = e0.L2("FavoriteGallery").p0();
            for(int v4 = 0; v4 < g14.size(); ++v4) {
                for(Object object5: g14) {
                    ((G)object5).I6("order", v4);
                }
            }
        }
        if(v < 54L) {
            h10.e("GalleryParams").c("galleryId", class0, new L[]{L.b}).c("minorReason", class0, new L[0]).c("managerAlarm", class0, new L[0]);
        }
        if(v < 55L) {
            h10.h("Login").c("pwCampaign", Integer.TYPE, new L[0]);
        }
        if(v < 56L) {
            h10.h("Login").c("mailSend", class0, new L[0]);
            h10.e("Policy").c("id", class0, new L[]{L.b}).c("campaignTime", Long.TYPE, new L[0]).c("notificationLogin", Boolean.TYPE, new L[0]);
        }
        if(v < 57L) {
            h10.h("Login").c("authMode", class0, new L[0]);
            h10.h("MatchOtp").c("authMode", class0, new L[0]);
        }
        if(v < 58L) {
            h10.e("RecentAddUserMemo").c("name", class0, new L[]{L.a}).c("addTime", Long.TYPE, new L[0]);
        }
        if(v < 59L) {
            h10.e("UserFavorite").c("userId", class0, new L[]{L.b}).c("updateTime", Long.TYPE, new L[0]).h("favoriteList", h10.h("FavoriteGallery"));
            g1 g15 = e0.L2("FavoriteGallery").f0("type", 0).p0();
            T0 t00 = new T0();
            t00.addAll(g15);
            e0.N1("UserFavorite", "").J6("favoriteList", t00);
            h10.h("FavoriteGallery").H().F("key").F("type");
        }
        if(v < 60L) {
            h10.h("GalleryParams").c("miniCoverImage", class0, new L[0]);
        }
        if(v < 61L) {
            f1 f115 = h10.h("FavoriteGallery");
            Class class16 = Integer.TYPE;
            f115.c("galleryType", class16, new L[0]);
            h10.h("Recent").c("galleryType", class16, new L[0]);
            for(Object object6: e0.L2("FavoriteGallery").p0()) {
                G g10_1 = (G)object6;
                String s5 = g10_1.r6("id");
                switch(m.d.b(s5)) {
                    case 1: 
                    case 2: {
                        g10_1.I6("galleryType", m.g.c());
                        break;
                    }
                    case 3: {
                        g10_1.I6("galleryType", m.i.c());
                        break;
                    }
                    case 4: {
                        g10_1.I6("galleryType", m.j.c());
                    }
                }
            }
            for(Object object7: e0.L2("Recent").p0()) {
                G g11_1 = (G)object7;
                String s6 = g11_1.r6("galleryId");
                switch(m.d.b(s6)) {
                    case 1: 
                    case 2: {
                        g11_1.I6("galleryType", m.g.c());
                        break;
                    }
                    case 3: {
                        g11_1.I6("galleryType", m.i.c());
                        break;
                    }
                    case 4: {
                        g11_1.I6("galleryType", m.j.c());
                    }
                }
            }
        }
        if(v < 62L) {
            f1 f116 = h10.e("BlockDCConItem").c("imageUrl", class0, new L[]{L.b});
            Class class17 = Long.TYPE;
            f116.c("blockDate", class17, new L[]{L.a});
            h10.e("BlockDCCon").c("groupIndex", class17, new L[]{L.b}).c("groupName", class0, new L[0]).c("groupImageUrl", class0, new L[0]).h("dcConList", h10.h("BlockDCConItem"));
        }
        if(v < 0x3FL) {
            f1 f117 = h10.e("PostArticle").c("key", class0, new L[]{L.b});
            Class class18 = Integer.TYPE;
            f117.c("articleType", class18, new L[0]).c("index", class18, new L[]{L.a}).c("galleryId", class0, new L[0]).c("postNumber", class0, new L[0]);
        }
        if(v < 0x40L) {
            h10.h("FcmMsg").c("pushType", class0, new L[0]);
        }
        if(v < 65L) {
            h10.h("Login").c("goNickState", Integer.TYPE, new L[0]).c("hitGallerStatus", class0, new L[0]).c("hitGallerDate", class0, new L[0]);
        }
        if(v < 66L) {
            h10.h("Policy").c("hitGallogCheckDate", class0, new L[0]);
        }
        if(v < 67L) {
            h10.e("UserNoticeInfo").c("key", class0, new L[]{L.b}).c("index", Integer.TYPE, new L[]{L.a}).c("galleryId", class0, new L[0]).c("userId", class0, new L[0]).c("nickname", class0, new L[0]);
        }
        if(v < 68L) {
            f1 f118 = h10.e("ReplyHistory").c("key", class0, new L[]{L.b}).c("galleryId", class0, new L[0]);
            Class class19 = Long.TYPE;
            f118.c("postNumber", class19, new L[0]).c("commentNumber", class19, new L[0]);
        }
        if(v < 69L) {
            h10.e("BlockPostImage").c("imageUrl", class0, new L[0]).c("fileName", class0, new L[0]).c("fileSize", class0, new L[0]).c("blockDate", Long.TYPE, new L[0]);
        }
        if(v < 70L) {
            h10.h("RecentSearch").c("searchCount", Integer.TYPE, new L[0]);
        }
        if(v < 71L) {
            f1 f119 = h10.e("PostSeriesItem").c("galleryId", class0, new L[0]).c("galleryName", class0, new L[0]).c("postNumber", class0, new L[0]).c("subject", class0, new L[0]).c("name", class0, new L[0]);
            Class class20 = Long.TYPE;
            f119.c("writeDate", class20, new L[0]).c("saveDate", class20, new L[0]);
            h10.e("PostSeries").c("subject", class0, new L[0]).h("seriesPostList", h10.h("PostSeriesItem")).c("saveDate", class20, new L[0]);
        }
        if(v < 72L) {
            h10.h("PostTemp").c("tempType", Long.TYPE, new L[0]);
        }
        if(v < 73L) {
            h10.e("BlockReportedPost").c("reportTime", Long.TYPE, new L[]{L.b}).c("galleryId", class0, new L[]{L.a}).c("galleryName", class0, new L[0]).c("postNumber", Integer.TYPE, new L[0]).c("subject", class0, new L[0]).c("date", class0, new L[0]).c("name", class0, new L[0]);
        }
        if(v < 74L) {
            h10.h("GalleryParams").c("autoRefreshInterval", Long.TYPE, new L[0]).c("autoRefreshEnable", Boolean.TYPE, new L[0]);
        }
        if(v < 75L) {
            h10.e("HateWord").c("galleryId", class0, new L[]{L.b}).c("use", Boolean.TYPE, new L[0]).c("warnType", Integer.TYPE, new L[0]).i("words", class0);
        }
        if(v < 76L) {
            f1 f120 = h10.h("Block");
            f120.i("words2", class0).i("ids2", class0).i("nicks2", class0).i("ips2", class0);
            f120.O((G g0) -> {
                T0 t00 = g0.g6("words");
                Class class0 = String.class;
                T0 t01 = g0.h6("words2", class0);
                for(Object object0: t00) {
                    String s = ((G)object0).r6("value");
                    if(s != null) {
                        t01.add(s);
                    }
                }
                T0 t02 = g0.g6("ids");
                T0 t03 = g0.h6("ids2", class0);
                for(Object object1: t02) {
                    String s1 = ((G)object1).r6("value");
                    if(s1 != null) {
                        t03.add(s1);
                    }
                }
                T0 t04 = g0.g6("nicks");
                T0 t05 = g0.h6("nicks2", class0);
                for(Object object2: t04) {
                    String s2 = ((G)object2).r6("value");
                    if(s2 != null) {
                        t05.add(s2);
                    }
                }
                T0 t06 = g0.g6("ips");
                T0 t07 = g0.h6("ips2", class0);
                for(Object object3: t06) {
                    String s3 = ((G)object3).r6("value");
                    if(s3 != null) {
                        t07.add(s3);
                    }
                }
            });
            f120.F("words").F("ids").F("nicks").F("ips").I("words2", "words").I("ids2", "ids").I("nicks2", "nicks").I("ips2", "ips");
            h10.u("BlockItem");
        }
        if(v < 77L) {
            h10.h("PostHistory").c("dcBestTo", Boolean.TYPE, new L[0]);
        }
        if(v < 78L) {
            h10.h("Login").c("lastLoginTime", Long.TYPE, new L[0]);
        }
        if(v < 0x4FL) {
            h10.h("Login").c("profileFileName", class0, new L[0]);
        }
        if(v < 80L) {
            h10.h("Login").c("profileIndex", Integer.TYPE, new L[0]);
        }
        if(v < 81L) {
            int v5 = 0;
            for(Object object8: e0.L2("Login").p0()) {
                ((G)object8).I6("profileIndex", v5);
                ++v5;
            }
        }
        if(v < 82L) {
            f1 f121 = h10.h("Recent");
            Class class21 = Integer.TYPE;
            f121.c("pin", class21, new L[0]).c("visits", class21, new L[0]);
        }
        if(v < 83L) {
            f1 f122 = h10.h("GalleryParams");
            Class class22 = Long.TYPE;
            f122.c("warningGalleryViewTime", class22, new L[0]).c("warningOpenWriteTime", class22, new L[0]);
        }
        if(v < 84L) {
            h10.e("AiPromptHistory").c("time", Long.TYPE, new L[]{L.b}).c("positive", class0, new L[0]).i("loraPositiveList", class0).c("negative", class0, new L[0]).i("loraNegativeList", class0).c("sampling", class0, new L[0]).c("style", class0, new L[0]).c("upscale", Boolean.TYPE, new L[0]);
        }
        if(v < 85L) {
            h10.h("AiPromptHistory").c("model", class0, new L[]{L.c});
        }
        if(Long.compare(v, 86L) < 0) {
            h10.h("DefaultImage").c("promptData", class0, new L[0]);
            h10.h("GalleryParams").c("canMakeAiImage", Boolean.TYPE, new L[0]);
        }
        if(v < 87L) {
            h10.h("GalleryParams").i("ignorePostHeadList", Integer.class);
        }
        if(v < 88L) {
            h10.h("Login").F("hitGallerStatus").F("hitGallerDate").c("bestGallerStatus", class0, new L[0]).c("bestGallerDate", class0, new L[0]);
        }
        if(v < 89L) {
            h10.e("ManagerBlockImage").c("isCancel", Boolean.TYPE, new L[0]).c("key", class0, new L[]{L.c}).c("blockDate", Long.TYPE, new L[0]);
        }
        if(v < 90L) {
            h10.h("GalleryParams").c("managerNotifyTime", Long.TYPE, new L[0]);
        }
        if(v < 91L) {
            h10.h("GalleryParams").c("mustReadKey", Integer.TYPE, new L[0]);
        }
        if(v < 92L) {
            h10.h("GalleryParams").F("mustReadKey");
        }
        if(v < 93L) {
            f1 f123 = h10.e("DcconTagItem");
            Class class23 = Integer.TYPE;
            f123.c("packageIdx", class23, new L[]{L.c}).c("detailIdx", class23, new L[]{L.a}).c("customTag", class0, new L[]{L.a, L.c}).c("date", Date.class, new L[]{L.a, L.c});
            h10.e("DcconTagGroup").c("packageIdx", class23, new L[]{L.b}).h("dcconTagItems", h10.h("DcconTagItem"));
            h10.h("PostWrite").c("doubleconIdx", class23, new L[0]);
            h10.e("DcconGuestHistory").c("packageIdx", class23, new L[]{L.c}).c("detailIdx", class23, new L[]{L.b}).c("date", Date.class, new L[]{L.a, L.c});
        }
        if(v < 94L) {
            h10.h("UserMemoItem").c("color", class0, new L[0]);
        }
        if(v < 0x5FL) {
            h10.h("BlockDCCon").c("totalCount", Integer.TYPE, new L[0]);
        }
        if(v < 0x60L && ((G)e0.L2("DefaultImage").r0()) == null) {
            dl.a.q3(true);
        }
        if(v < 97L) {
            h10.h("PostWrite").c("imgNoteComment", Boolean.class, new L[0]);
        }
    }

    // 检测为 Lambda 实现
    private static void h(G g0) [...]

    // 检测为 Lambda 实现
    private static void i(G g0) [...]

    // 检测为 Lambda 实现
    private static void j(G g0) [...]

    // 检测为 Lambda 实现
    private static void k(HashSet hashSet0, G g0) [...]

    // 检测为 Lambda 实现
    private static void l(HashSet hashSet0, G g0) [...]

    // 检测为 Lambda 实现
    private static void m(G g0) [...]
}

