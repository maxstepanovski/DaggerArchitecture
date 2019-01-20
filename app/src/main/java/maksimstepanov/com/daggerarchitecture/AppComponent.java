package maksimstepanov.com.daggerarchitecture;

import javax.inject.Singleton;

import dagger.Component;
import maksimstepanov.com.auth.di.AuthScreenModule;
import maksimstepanov.com.auth.di.AuthScreenSubComponent;
import maksimstepanov.com.cache.CacheModule;
import maksimstepanov.com.network.di.NetworkModule;

/**
 * Root application component
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, CacheModule.class})
public interface AppComponent {
    AuthScreenSubComponent getAuthScreenSubComponent(AuthScreenModule module);
}
