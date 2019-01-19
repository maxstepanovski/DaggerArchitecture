package maksimstepanov.com.daggerarchitecture;

import android.app.Application;

import maksimstepanov.com.daggerarchitecture.di.AppComponent;

/**
 *
 */
public class ArchApp extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
