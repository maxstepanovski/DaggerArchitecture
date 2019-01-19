package maksimstepanov.com.daggerarchitecture;

import android.app.Application;

import maksimstepanov.com.core.di.AppComponent;
import maksimstepanov.com.core.di.AppModule;
import maksimstepanov.com.core.di.DaggerAppComponent;


/**
 * Custom application class
 */
public class ArchApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent.set(
                DaggerAppComponent
                        .builder()
                        .appModule(new AppModule(getApplicationContext()))
                        .build()
        );
    }
}
