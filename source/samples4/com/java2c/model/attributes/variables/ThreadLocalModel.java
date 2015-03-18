package com.java2c.model.attributes.variables;

import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(FIELD)
public @interface ThreadLocalModel
{
	// Null implies the use of the default tls_model
	@Nullable TlsModel value();
}