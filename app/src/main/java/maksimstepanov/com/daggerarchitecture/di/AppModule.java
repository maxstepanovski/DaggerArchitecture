package maksimstepanov.com.daggerarchitecture.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import maksimstepanov.com.core.router.Router;
import maksimstepanov.com.daggerarchitecture.router.RouterImpl;

/**
 * Root application module
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return context;
    }

    @Singleton
    @Provides
    Router provideRouter() {
        return new RouterImpl();
    }
}
