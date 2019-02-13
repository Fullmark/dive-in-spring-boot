package com.fullmark.diveinspringboot.annotation.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author fanghuanbiao
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWroldConfiguration.class.getName()};
    }
}
