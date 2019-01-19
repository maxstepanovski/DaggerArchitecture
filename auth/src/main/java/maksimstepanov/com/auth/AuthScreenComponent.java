package maksimstepanov.com.auth;

import dagger.Component;
import maksimstepanov.com.core.di.AppComponent;
import maksimstepanov.com.core.di.Screen;

/**
 * Component with Screen Scope
 * Injects inside AuthActivity
 */
@Screen
@Component(modules = {AuthScreenModule.class}, dependencies = {AppComponent.class})
public abstract class AuthScreenComponent {
    private AuthScreenComponent instance;

    public AuthScreenComponent initAndGet() {
        if (instance == null) {
            synchronized (AuthScreenComponent.class) {
                instance = DaggerAuthScreenComponent
                        .builder()
                        .authScreenModule(new AuthScreenModule())
                        .build();
            }
        }
        return instance;
    }

    public abstract void inject(AuthActivity activity);

    public void resetComponent() {
        instance = null;
    }
}
