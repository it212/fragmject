package com.example.miaow.plugin.bury

import org.objectweb.asm.AnnotationVisitor

class BuryPointAnnotationVisitor extends AnnotationVisitor {

    BuryPointAnnotationVisitor(int api, AnnotationVisitor annotationVisitor) {
        super(api, annotationVisitor)
    }

}