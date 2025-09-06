package com.bytedance.sdk.openadsdk;

public interface InitConfig {
    String getAdxId();

    int getAppIconId();

    String getAppId();

    String getData();

    int getGdpr();

    int getPA();

    String getPackageName();

    int getTitleBarTheme();

    boolean isSupportMultiProcess();

    boolean isUseTextureView();
}

