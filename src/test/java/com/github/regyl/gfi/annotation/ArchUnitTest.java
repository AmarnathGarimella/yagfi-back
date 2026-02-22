package com.github.regyl.gfi.annotation;

import com.github.regyl.gfi.model.Tags;
import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Tag(Tags.UNIT)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@AnalyzeClasses(packages = "com.github.regyl.gfi")
public @interface ArchUnitTest {
}
