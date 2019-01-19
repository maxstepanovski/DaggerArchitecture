package maksimstepanov.com.core.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Activity/Fragment scope
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Screen {
}
