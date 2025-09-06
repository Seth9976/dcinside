package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class WebSettingsAdapter {
    private final WebSettingsBoundaryInterface a;

    public WebSettingsAdapter(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface0) {
        this.a = webSettingsBoundaryInterface0;
    }

    public int a() {
        return this.a.getAttributionBehavior();
    }

    public int b() {
        return this.a.getDisabledActionModeMenuItems();
    }

    public boolean c() {
        return this.a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int d() {
        return this.a.getForceDark();
    }

    public int e() {
        return this.a.getForceDarkBehavior();
    }

    public boolean f() {
        return this.a.getOffscreenPreRaster();
    }

    @NonNull
    public Set g() {
        return this.a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean h() {
        return this.a.getSafeBrowsingEnabled();
    }

    @NonNull
    public UserAgentMetadata i() {
        return UserAgentMetadataInternal.c(this.a.getUserAgentMetadataMap());
    }

    @NonNull
    public WebViewMediaIntegrityApiStatusConfig j() {
        return new Builder(this.a.getWebViewMediaIntegrityApiDefaultStatus()).e(this.a.getWebViewMediaIntegrityApiOverrideRules()).d();
    }

    public boolean k() {
        return this.a.isAlgorithmicDarkeningAllowed();
    }

    public void l(boolean z) {
        this.a.setAlgorithmicDarkeningAllowed(z);
    }

    public void m(int v) {
        this.a.setAttributionBehavior(v);
    }

    public void n(int v) {
        this.a.setDisabledActionModeMenuItems(v);
    }

    public void o(boolean z) {
        this.a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void p(int v) {
        this.a.setForceDark(v);
    }

    public void q(int v) {
        this.a.setForceDarkBehavior(v);
    }

    public void r(boolean z) {
        this.a.setOffscreenPreRaster(z);
    }

    public void s(@NonNull Set set0) {
        this.a.setRequestedWithHeaderOriginAllowList(set0);
    }

    public void t(boolean z) {
        this.a.setSafeBrowsingEnabled(z);
    }

    public void u(@NonNull UserAgentMetadata userAgentMetadata0) {
        Map map0 = UserAgentMetadataInternal.a(userAgentMetadata0);
        this.a.setUserAgentMetadataFromMap(map0);
    }

    public void v(@NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig0) {
        this.a.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig0.a(), webViewMediaIntegrityApiStatusConfig0.b());
    }
}

