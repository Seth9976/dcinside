package com.igaworks.ssp;

import android.content.Context;
import java.util.Locale;

public class r {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    private static r k;

    private r(Context context0) {
        this.a();
    }

    public static r a(Context context0) {
        if(r.k == null) {
            r.k = new r(context0);
        }
        return r.k;
    }

    public void a() {
        Locale locale0 = Locale.getDefault();
        String s = locale0.getLanguage();
        if(s.contains("ko")) {
            this.a = "본 동영상 시청 완료시 리워드를 바로 지급해 드립니다.";
            this.b = "*여러번 동영상을 시청하더라도 리워드는 한번만 적립됩니다.";
            this.c = "*3G/4G 환경에서는 데이터 통화료가 발생할 수 있습니다.";
            this.d = "동영상 시청 완료 후 이동 가능합니다.";
            this.e = "다시보기";
            this.f = "다운로드";
            this.g = "바로가기";
            this.h = "%s가(이) 지급되었습니다.";
            this.i = "%d초 뒤에 종료 할 수 있습니다";
            this.j = "뒤로가기를 한 번 더 누르시면 종료 됩니다 ";
            return;
        }
        if(s.contains("ja")) {
            this.a = "この動画を視聴完了すると報酬を付与します。";
            this.b = "＊２回以上同じ動画を視聴した場合でも、報酬は最初１回のみ付与されます。";
            this.c = "＊3G/4G環境の場合、通信料金が発生する場合があります。";
            this.d = "動画視聴を完了してください。";
            this.e = "もう一度見る";
            this.f = "ダウンロード";
            this.g = "アプリの詳細";
            this.h = "％ｓが支給されました。";
            this.i = "%d秒後に終了できます。";
            this.j = "バックボタンをもう一度押すと終了します。";
            return;
        }
        if(s.contains("zh")) {
            String s1 = locale0.getCountry().toLowerCase();
            if(s1.equals("cn")) {
                this.a = "この動画を視聴完了すると報酬を付与します。";
                this.b = "＊２回以上同じ動画を視聴した場合でも、報酬は最初１回のみ付与されます。";
                this.c = "＊3G/4G環境の場合、通信料金が発生する場合があります。";
                this.d = "视频播放完后，可以跳转。";
                this.e = "重播";
                this.f = "下载";
                this.g = "了解更多";
                this.h = "已支付%s";
                this.i = "广告会在%d秒后关闭。";
                this.j = "再次按返回键结束应用";
                return;
            }
            if(s1.equals("tw")) {
                this.a = "收看完视频时，立即支付奖励。";
                this.b = "*多次收看视频也只能支付一次奖励。";
                this.c = "*在3G/4G网络环境上会发生移动数据费用。";
                this.d = "視頻播放完後，可以跳轉。";
                this.e = "重播";
                this.f = "下載";
                this.g = "了解更多";
                this.h = "已支付%s";
                this.i = "廣告會在 %d 秒後關閉。";
                this.j = "再次按返回鍵結束應用";
            }
        }
        else {
            this.a = "Reward will be given right after watching this video.";
            this.b = "*Reward will be given only for initial play. Multiple play will not be counted. ";
            this.c = "*In 3G/4G network connection, additional data fee will be charged according to your data plan. ";
            this.d = "You can move to next page after watching the video.";
            this.e = "Replay";
            this.f = "Download";
            this.g = "Learn More";
            this.h = "%s is given.";
            this.i = "You can skip the video after %d seconds";
            this.j = "Press back button to quit the app.";
        }
    }
}

