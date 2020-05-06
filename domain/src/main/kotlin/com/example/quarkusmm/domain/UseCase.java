package com.example.quarkusmm.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.enterprise.inject.Stereotype;
import javax.inject.Singleton;
import javax.transaction.Transactional;

@Singleton
@Transactional
@Stereotype
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
}
