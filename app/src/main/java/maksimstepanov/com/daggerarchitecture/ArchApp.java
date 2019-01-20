package maksimstepanov.com.daggerarchitecture;

import android.app.Application;

import maksimstepanov.com.auth.di.AuthScreenModule;
import maksimstepanov.com.cache.CacheModule;
import maksimstepanov.com.core.di.ScreenSubComponent;
import maksimstepanov.com.core.di.ScreenSubComponentProvider;
import maksimstepanov.com.daggerarchitecture.di.AppComponent;
import maksimstepanov.com.daggerarchitecture.di.AppModule;
import maksimstepanov.com.daggerarchitecture.di.DaggerAppComponent;
import maksimstepanov.com.main.di.MainScreenModule;
import maksimstepanov.com.network.di.NetworkModule;


/**
 * Custom application class
 */
public class ArchApp extends Application implements ScreenSubComponentProvider {
    private AppComponent instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = DaggerAppComponent
                .builder()
                .appModule(new AppModule(getApplicationContext()))
                .networkModule(new NetworkModule())
                .cacheModule(new CacheModule())
                .build();
    }

    @Override
    public ScreenSubComponent getAuthScreenSubComponent() {
        return instance.getAuthScreenSubComponent(new AuthScreenModule());
    }

    @Override
    public ScreenSubComponent getMainScreenSubComponent() {
        return instance.getMainScreenSubComponent(new MainScreenModule());
    }
}
