package com.sample.kakao;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KakaoSdk.init(this, "93651e5ff952b856a8f771846c1b48ea");
    }
}
