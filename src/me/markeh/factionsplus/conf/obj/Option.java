package me.markeh.factionsplus.conf.obj;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Option {
	String section();

	String name();

	String comment() default "";

	boolean pingOnUpdate() default false;
	
}
