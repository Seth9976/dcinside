package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.LinkTextView;

public final class v7 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final LinkTextView b;

    private v7(@NonNull FrameLayout frameLayout0, @NonNull LinkTextView linkTextView0) {
        this.a = frameLayout0;
        this.b = linkTextView0;
    }

    @NonNull
    public static v7 a(@NonNull View view0) {
        LinkTextView linkTextView0 = (LinkTextView)ViewBindings.a(view0, 0x7F0B0D5D);  // id:reply_more_text
        if(linkTextView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0D5D));  // id:reply_more_text
        }
        return new v7(((FrameLayout)view0), linkTextView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static v7 c(@NonNull LayoutInflater layoutInflater0) {
        return v7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026D, viewGroup0, false);  // layout:view_reply_more_reply_text
        if(z) {
            viewGroup0.addView(view0);
        }
        return v7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

