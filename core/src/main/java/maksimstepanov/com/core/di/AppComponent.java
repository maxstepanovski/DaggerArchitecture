package maksimstepanov.com.core.di;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import maksimstepanov.com.cache.CacheModule;
import maksimstepanov.com.network.di.NetworkModule;

/**
 * Root application component
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, CacheModule.class})
public abstract class AppComponent {
    public abstract Context context();

    private static AppComponent instance;

    @NonNull
    public static AppComponent get() {
        if (instance == null) {
            throw new IllegalArgumentException("You need to set AppComponent First!");
        }
        return instance;
    }

    public static void set(@NonNull AppComponent component) {
        instance = component;
    }
}
