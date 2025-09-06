package com.dcinside.app.youtube;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.util.Dl;
import kotlin.jvm.internal.L;
import y4.l;

public final class a {
    @l
    public static final a a;

    static {
        a.a = new a();
    }

    public final void a(@l AppCompatActivity appCompatActivity0, @l String s) {
        L.p(appCompatActivity0, "activity");
        L.p(s, "youtubeVideoId");
        try {
            Intent intent0 = new Intent(appCompatActivity0, YoutubePlayerActivity.class);
            intent0.putExtra("YoutubePlayerActivity_EXTRA_VIDEO_ID", s);
            appCompatActivity0.startActivity(intent0);
        }
        catch(Exception unused_ex) {
            try {
                appCompatActivity0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(("https://www.youtube.com/watch?v=" + s))));
            }
            catch(Exception unused_ex) {
                Dl.D(appCompatActivity0, 0x7F150BCF);  // string:youtube_play_error "유튜브 플레이어를 실행할 수 없습니다."
            }
        }
    }
}

