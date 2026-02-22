package com.github.regyl.gfi.service;

import com.github.regyl.gfi.annotation.ArchUnitTest;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@ArchUnitTest
class ServiceArchTest {

    @ArchTest
    static final ArchRule servicesShouldNotDependOnControllers =
            noClasses()
                    .that().resideInAPackage("..service..")
                    .should().dependOnClassesThat()
                    .resideInAPackage("..controller..");
}
