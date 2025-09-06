package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.core.content.res.ResourcesCompat;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
class BrowserActionsFallbackMenuAdapter extends BaseAdapter {
    static class ViewHolderItem {
        final ImageView a;
        final TextView b;

        ViewHolderItem(ImageView imageView0, TextView textView0) {
            this.a = imageView0;
            this.b = textView0;
        }
    }

    private final List a;
    private final Context b;

    BrowserActionsFallbackMenuAdapter(List list0, Context context0) {
        this.a = list0;
        this.b = context0;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.a.get(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        ViewHolderItem browserActionsFallbackMenuAdapter$ViewHolderItem0;
        BrowserActionItem browserActionItem0 = (BrowserActionItem)this.a.get(v);
        if(view0 == null) {
            view0 = LayoutInflater.from(this.b).inflate(layout.browser_actions_context_menu_row, null);
            ImageView imageView0 = (ImageView)view0.findViewById(id.browser_actions_menu_item_icon);
            TextView textView0 = (TextView)view0.findViewById(id.browser_actions_menu_item_text);
            if(imageView0 == null || textView0 == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            browserActionsFallbackMenuAdapter$ViewHolderItem0 = new ViewHolderItem(imageView0, textView0);
            view0.setTag(browserActionsFallbackMenuAdapter$ViewHolderItem0);
        }
        else {
            browserActionsFallbackMenuAdapter$ViewHolderItem0 = (ViewHolderItem)view0.getTag();
        }
        String s = browserActionItem0.e();
        browserActionsFallbackMenuAdapter$ViewHolderItem0.b.setText(s);
        if(browserActionItem0.b() != 0) {
            Drawable drawable0 = ResourcesCompat.g(this.b.getResources(), browserActionItem0.b(), null);
            browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setImageDrawable(drawable0);
            return view0;
        }
        if(browserActionItem0.c() != null) {
            t0 t00 = BrowserServiceFileProvider.o(this.b.getContentResolver(), browserActionItem0.c());
            t00.addListener(new Runnable() {
                final BrowserActionsFallbackMenuAdapter d;

                @Override
                public void run() {
                    Bitmap bitmap0;
                    CharSequence charSequence0 = browserActionsFallbackMenuAdapter$ViewHolderItem0.b.getText();
                    if(!TextUtils.equals(s, charSequence0)) {
                        return;
                    }
                    try {
                        bitmap0 = (Bitmap)t00.get();
                    }
                    catch(ExecutionException | InterruptedException unused_ex) {
                        bitmap0 = null;
                    }
                    if(bitmap0 != null) {
                        browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setVisibility(0);
                        browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setImageBitmap(bitmap0);
                        return;
                    }
                    browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setVisibility(4);
                    browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setImageBitmap(null);
                }
            }, new Executor() {
                final BrowserActionsFallbackMenuAdapter a;

                @Override
                public void execute(@NonNull Runnable runnable0) {
                    runnable0.run();
                }
            });
            return view0;
        }
        browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setImageBitmap(null);
        browserActionsFallbackMenuAdapter$ViewHolderItem0.a.setVisibility(4);
        return view0;
    }
}

