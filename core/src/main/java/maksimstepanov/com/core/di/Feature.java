package maksimstepanov.com.core.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Feature scope
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Feature {
}
