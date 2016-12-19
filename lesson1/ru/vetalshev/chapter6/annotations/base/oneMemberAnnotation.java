package ru.vetalshev.chapter6.annotations.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OneMemberAnnotation {

    int value();

}
