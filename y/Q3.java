package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.wv.VideoEnabledWebView;

public final class q3 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final VideoEnabledWebView c;

    private q3(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull VideoEnabledWebView videoEnabledWebView0) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = videoEnabledWebView0;
    }

    @NonNull
    public static q3 a(@NonNull View view0) {
        int v = 0x7F0B0153;  // id:archive_voice_view_title
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0153);  // id:archive_voice_view_title
        if(textView0 != null) {
            v = 0x7F0B0154;  // id:archive_voice_view_web
            VideoEnabledWebView videoEnabledWebView0 = (VideoEnabledWebView)ViewBindings.a(view0, 0x7F0B0154);  // id:archive_voice_view_web
            if(videoEnabledWebView0 != null) {
                return new q3(((LinearLayout)view0), textView0, videoEnabledWebView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static q3 c(@NonNull LayoutInflater layoutInflater0) {
        return q3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0198, viewGroup0, false);  // layout:view_archive_play_voice
        if(z) {
            viewGroup0.addView(view0);
        }
        return q3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

