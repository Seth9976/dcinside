package com.unity3d.services.core.api;

import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Intent {
    public static enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL;

        private static IntentError[] $values() [...] // Inlined contents
    }

    static class IntentException extends Exception {
        private IntentError error;
        private Object field;

        public IntentException(IntentError intent$IntentError0, Object object0) {
            this.error = intent$IntentError0;
            this.field = object0;
        }

        public IntentError getError() {
            return this.error;
        }

        public Object getField() {
            return this.field;
        }
    }

    private static WeakReference _activeActivity;

    @WebViewExposed
    public static void canOpenIntent(JSONObject jSONObject0, WebViewCallback webViewCallback0) {
        try {
            webViewCallback0.invoke(new Object[]{Boolean.valueOf(Intent.checkIntentResolvable(Intent.intentFromMetadata(jSONObject0)))});
        }
        catch(IntentException intent$IntentException0) {
            DeviceLog.exception("Couldn\'t resolve intent", intent$IntentException0);
            webViewCallback0.error(intent$IntentException0.getError(), new Object[]{intent$IntentException0.getField()});
        }
    }

    @WebViewExposed
    public static void canOpenIntents(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        JSONObject jSONObject0 = new JSONObject();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
            String s = jSONObject1.optString("id");
            try {
                jSONObject0.put(s, Intent.checkIntentResolvable(Intent.intentFromMetadata(jSONObject1)));
            }
            catch(IntentException intent$IntentException0) {
                DeviceLog.exception("Exception parsing intent", intent$IntentException0);
                webViewCallback0.error(intent$IntentException0.getError(), new Object[]{intent$IntentException0.getField()});
                return;
            }
            catch(JSONException jSONException0) {
                webViewCallback0.error(IntentError.JSON_EXCEPTION, new Object[]{jSONException0.getMessage()});
                return;
            }
        }
        webViewCallback0.invoke(new Object[]{jSONObject0});
    }

    private static boolean checkIntentResolvable(android.content.Intent intent0) {
        return ClientProperties.getApplicationContext().getPackageManager().resolveActivity(intent0, 0) != null;
    }

    @WebViewExposed
    public static void checkProviders(String s, WebViewCallback webViewCallback0) {
        ArrayList arrayList0 = new ArrayList();
        android.content.Intent intent0 = new android.content.Intent(s);
        List list0 = ClientProperties.getApplicationContext().getPackageManager().queryIntentContentProviders(intent0, 0);
        if(list0 != null && list0.size() == 0) {
            webViewCallback0.invoke(new Object[]{arrayList0});
            return;
        }
        for(Object object0: list0) {
            arrayList0.add(((ResolveInfo)object0).providerInfo.authority);
        }
        webViewCallback0.invoke(new Object[]{arrayList0});
    }

    private static Activity getStartingActivity() {
        if(Intent._activeActivity != null && Intent._activeActivity.get() != null) {
            return (Activity)Intent._activeActivity.get();
        }
        return ClientProperties.getActivity() == null ? null : ClientProperties.getActivity();
    }

    private static android.content.Intent intentFromMetadata(JSONObject jSONObject0) throws IntentException {
        String s = (String)jSONObject0.opt("className");
        String s1 = (String)jSONObject0.opt("packageName");
        String s2 = (String)jSONObject0.opt("action");
        String s3 = (String)jSONObject0.opt("uri");
        String s4 = (String)jSONObject0.opt("mimeType");
        JSONArray jSONArray0 = (JSONArray)jSONObject0.opt("categories");
        Integer integer0 = (Integer)jSONObject0.opt("flags");
        JSONArray jSONArray1 = (JSONArray)jSONObject0.opt("extras");
        if(s1 != null && s == null && s2 == null && s4 == null) {
            android.content.Intent intent0 = ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(s1);
            if(intent0 != null && ((int)integer0) > -1) {
                intent0.addFlags(((int)integer0));
                return intent0;
            }
            return intent0;
        }
        android.content.Intent intent1 = new android.content.Intent();
        if(s != null && s1 != null) {
            intent1.setClassName(s1, s);
        }
        if(s2 != null) {
            intent1.setAction(s2);
        }
        if(s3 != null) {
            intent1.setData(Uri.parse(s3));
        }
        if(s4 != null) {
            intent1.setType(s4);
        }
        if(integer0 != null && ((int)integer0) > -1) {
            intent1.setFlags(((int)integer0));
        }
        if(!Intent.setCategories(intent1, jSONArray0)) {
            throw new IntentException(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray0);
        }
        if(!Intent.setExtras(intent1, jSONArray1)) {
            throw new IntentException(IntentError.COULDNT_PARSE_EXTRAS, jSONArray1);
        }
        return intent1;
    }

    @WebViewExposed
    public static void launch(JSONObject jSONObject0, WebViewCallback webViewCallback0) {
        android.content.Intent intent0;
        String s = (String)jSONObject0.opt("className");
        String s1 = (String)jSONObject0.opt("packageName");
        String s2 = (String)jSONObject0.opt("action");
        String s3 = (String)jSONObject0.opt("uri");
        String s4 = (String)jSONObject0.opt("mimeType");
        JSONArray jSONArray0 = (JSONArray)jSONObject0.opt("categories");
        Integer integer0 = (Integer)jSONObject0.opt("flags");
        JSONArray jSONArray1 = (JSONArray)jSONObject0.opt("extras");
        if(s1 == null || s != null || s2 != null || s4 != null) {
            android.content.Intent intent1 = new android.content.Intent();
            if(s != null && s1 != null) {
                intent1.setClassName(s1, s);
            }
            else if(s1 != null) {
                intent1.setPackage(s1);
            }
            if(s2 != null) {
                intent1.setAction(s2);
            }
            if(s3 != null && s4 != null) {
                intent1.setDataAndType(Uri.parse(s3), s4);
            }
            else if(s3 != null) {
                intent1.setData(Uri.parse(s3));
            }
            else if(s4 != null) {
                intent1.setType(s4);
            }
            if(integer0 != null && ((int)integer0) > -1) {
                intent1.setFlags(((int)integer0));
            }
            if(!Intent.setCategories(intent1, jSONArray0)) {
                webViewCallback0.error(IntentError.COULDNT_PARSE_CATEGORIES, new Object[]{jSONArray0});
            }
            if(!Intent.setExtras(intent1, jSONArray1)) {
                webViewCallback0.error(IntentError.COULDNT_PARSE_EXTRAS, new Object[]{jSONArray1});
            }
            intent0 = intent1;
        }
        else {
            intent0 = ClientProperties.getApplicationContext().getPackageManager().getLaunchIntentForPackage(s1);
            if(intent0 != null && ((int)integer0) > -1) {
                intent0.addFlags(((int)integer0));
            }
        }
        if(intent0 != null) {
            if(Intent.getStartingActivity() != null) {
                Intent.getStartingActivity().startActivity(intent0);
                webViewCallback0.invoke(new Object[0]);
                return;
            }
            webViewCallback0.error(IntentError.ACTIVITY_WAS_NULL, new Object[0]);
            return;
        }
        webViewCallback0.error(IntentError.INTENT_WAS_NULL, new Object[0]);
    }

    public static void removeActiveActivity(Activity activity0) {
        if(Intent._activeActivity != null && Intent._activeActivity.get() != null && activity0 != null && activity0.equals(Intent._activeActivity.get())) {
            Intent._activeActivity = null;
        }
    }

    public static void setActiveActivity(Activity activity0) {
        if(activity0 == null) {
            Intent._activeActivity = null;
            return;
        }
        Intent._activeActivity = new WeakReference(activity0);
    }

    private static boolean setCategories(android.content.Intent intent0, JSONArray jSONArray0) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    intent0.addCategory(jSONArray0.getString(v));
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Couldn\'t parse categories for intent", exception0);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean setExtra(android.content.Intent intent0, String s, Object object0) {
        if(object0 instanceof String) {
            intent0.putExtra(s, ((String)object0));
            return true;
        }
        if(object0 instanceof Integer) {
            intent0.putExtra(s, ((int)(((Integer)object0))));
            return true;
        }
        if(object0 instanceof Double) {
            intent0.putExtra(s, ((double)(((Double)object0))));
            return true;
        }
        if(object0 instanceof Boolean) {
            intent0.putExtra(s, ((Boolean)object0).booleanValue());
            return true;
        }
        DeviceLog.error(("Unable to parse launch intent extra " + s));
        return false;
    }

    private static boolean setExtras(android.content.Intent intent0, JSONArray jSONArray0) {
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    String s = jSONObject0.getString("key");
                    Object object0 = jSONObject0.get("value");
                }
                catch(Exception exception0) {
                    DeviceLog.exception("Couldn\'t parse extras", exception0);
                    return false;
                }
                if(!Intent.setExtra(intent0, s, object0)) {
                    return false;
                }
            }
        }
        return true;
    }
}

