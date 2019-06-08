package com.dev.web.core.utils;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

public class FormUtils {
    public static <T> T formToDTO(Class<T> tClass, HttpServletRequest httpServletRequest){
        T object = null;

        try {
            object = tClass.newInstance();
            BeanUtils.populate(object,httpServletRequest.getParameterMap());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return object;
    }
}
