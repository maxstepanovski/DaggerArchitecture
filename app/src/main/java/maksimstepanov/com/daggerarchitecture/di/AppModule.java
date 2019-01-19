package maksimstepanov.com.daggerarchitecture.di;

import android.content.Context;

import dagger.Module;

/**
 * Root application module
 */
@Module()
public class AppModule {
    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    Context provideApplicationContext() {
        return context;
    }
}
