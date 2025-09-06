package androidx.browser.browseractions;

import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R.id;
import androidx.browser.R.layout;
import androidx.browser.R.string;
import androidx.core.widget.TextViewCompat;
import java.util.ArrayList;
import java.util.List;

@Deprecated
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {
    @RestrictTo({Scope.c})
    @VisibleForTesting
    interface BrowserActionsFallMenuUiListener {
        void a(View arg1);
    }

    final Context a;
    final Uri b;
    private final List c;
    @Nullable
    BrowserActionsFallMenuUiListener d;
    @Nullable
    private BrowserActionsFallbackMenuDialog e;
    private static final String f = "BrowserActionskMenuUi";

    BrowserActionsFallbackMenuUi(@NonNull Context context0, @NonNull Uri uri0, @NonNull List list0) {
        this.a = context0;
        this.b = uri0;
        this.c = this.b(list0);
    }

    private Runnable a() {
        return new Runnable() {
            final BrowserActionsFallbackMenuUi a;

            @Override
            public void run() {
                ((ClipboardManager)BrowserActionsFallbackMenuUi.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", BrowserActionsFallbackMenuUi.this.b.toString()));
                String s = BrowserActionsFallbackMenuUi.this.a.getString(string.copy_toast_msg);
                Toast.makeText(BrowserActionsFallbackMenuUi.this.a, s, 0).show();
            }
        };
    }

    @NonNull
    private List b(List list0) {
        List list1 = new ArrayList();
        list1.add(new BrowserActionItem(this.a.getString(string.fallback_menu_item_open_in_browser), this.c()));
        list1.add(new BrowserActionItem(this.a.getString(string.fallback_menu_item_copy_link), this.a()));
        list1.add(new BrowserActionItem(this.a.getString(string.fallback_menu_item_share_link), this.d()));
        list1.addAll(list0);
        return list1;
    }

    private PendingIntent c() {
        Intent intent0 = new Intent("android.intent.action.VIEW", this.b);
        return PendingIntent.getActivity(this.a, 0, intent0, 0x4000000);
    }

    private PendingIntent d() {
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.putExtra("android.intent.extra.TEXT", this.b.toString());
        intent0.setType("text/plain");
        return PendingIntent.getActivity(this.a, 0, intent0, 0x4000000);
    }

    public void e() {
        View view0 = LayoutInflater.from(this.a).inflate(layout.browser_actions_context_menu_page, null);
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView0 = this.f(view0);
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog0 = new BrowserActionsFallbackMenuDialog(this.a, browserActionsFallbackMenuView0);
        this.e = browserActionsFallbackMenuDialog0;
        browserActionsFallbackMenuDialog0.setContentView(view0);
        if(this.d != null) {
            this.e.setOnShowListener(new DialogInterface.OnShowListener() {
                final BrowserActionsFallbackMenuUi b;

                @Override  // android.content.DialogInterface$OnShowListener
                public void onShow(DialogInterface dialogInterface0) {
                    BrowserActionsFallMenuUiListener browserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener0 = BrowserActionsFallbackMenuUi.this.d;
                    if(browserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener0 == null) {
                        Log.e("BrowserActionskMenuUi", "Cannot trigger menu item listener, it is null");
                        return;
                    }
                    browserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener0.a(view0);
                }
            });
        }
        this.e.show();
    }

    private BrowserActionsFallbackMenuView f(View view0) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView0 = (BrowserActionsFallbackMenuView)view0.findViewById(id.browser_actions_menu_view);
        TextView textView0 = (TextView)view0.findViewById(id.browser_actions_header_text);
        textView0.setText(this.b.toString());
        textView0.setOnClickListener(new View.OnClickListener() {
            final BrowserActionsFallbackMenuUi b;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(TextViewCompat.k(textView0) == 0x7FFFFFFF) {
                    textView0.setMaxLines(1);
                    textView0.setEllipsize(TextUtils.TruncateAt.END);
                    return;
                }
                textView0.setMaxLines(0x7FFFFFFF);
                textView0.setEllipsize(null);
            }
        });
        ListView listView0 = (ListView)view0.findViewById(id.browser_actions_menu_items);
        listView0.setAdapter(new BrowserActionsFallbackMenuAdapter(this.c, this.a));
        listView0.setOnItemClickListener(this);
        return browserActionsFallbackMenuView0;
    }

    @RestrictTo({Scope.c})
    @VisibleForTesting
    void g(@Nullable BrowserActionsFallMenuUiListener browserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener0) {
        this.d = browserActionsFallbackMenuUi$BrowserActionsFallMenuUiListener0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        BrowserActionItem browserActionItem0 = (BrowserActionItem)this.c.get(v);
        if(browserActionItem0.a() != null) {
            try {
                browserActionItem0.a().send();
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.e("BrowserActionskMenuUi", "Failed to send custom item action", pendingIntent$CanceledException0);
            }
        }
        else if(browserActionItem0.d() != null) {
            browserActionItem0.d().run();
        }
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog0 = this.e;
        if(browserActionsFallbackMenuDialog0 == null) {
            Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
            return;
        }
        browserActionsFallbackMenuDialog0.dismiss();
    }
}

