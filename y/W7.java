package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class w7 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;

    private w7(@NonNull LinearLayout linearLayout0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = linearLayout0;
        this.b = frameLayout0;
        this.c = textView0;
        this.d = textView1;
    }

    @NonNull
    public static w7 a(@NonNull View view0) {
        int v = 0x7F0B0D62;  // id:reply_more_voice
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0D62);  // id:reply_more_voice
        if(frameLayout0 != null) {
            v = 0x7F0B0D63;  // id:reply_more_voice_memo
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0D63);  // id:reply_more_voice_memo
            if(textView0 != null) {
                v = 0x7F0B0D64;  // id:reply_more_voice_mention
                TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B0D64);  // id:reply_more_voice_mention
                if(textView1 != null) {
                    return new w7(((LinearLayout)view0), frameLayout0, textView0, textView1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static w7 c(@NonNull LayoutInflater layoutInflater0) {
        return w7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026E, viewGroup0, false);  // layout:view_reply_more_reply_voice
        if(z) {
            viewGroup0.addView(view0);
        }
        return w7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

