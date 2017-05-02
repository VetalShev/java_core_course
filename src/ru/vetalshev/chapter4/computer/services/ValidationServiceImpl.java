package ru.vetalshev.chapter4.computer.services;

import ru.vetalshev.chapter4.computer.annotations.Constraint;
import ru.vetalshev.chapter4.computer.validators.ConstraintValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class ValidationServiceImpl extends ValidationService {

    public boolean validate(Object obj) {
        String componentName = obj.getClass().getName();
        String componentValidatorName = null;

        try {
            Class cl = Class.forName(componentName);

            if (cl.isAnnotationPresent(Constraint.class)) {
                Annotation annot = cl.getAnnotation(Constraint.class);

                componentValidatorName = ((Constraint) annot).validatedBy().getName();
            } else {
                System.err.println("No annotation");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ConstraintValidator validator = null;
        try {
            Class<?> clazz = Class.forName(componentValidatorName);
            Constructor<?> ctor = clazz.getConstructor();
            Object object = ctor.newInstance();

            validator = (ConstraintValidator) object;
//        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validator.isValid(obj);
    }

}
