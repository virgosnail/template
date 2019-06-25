package com.skd.servicecore.business.common.utils;

import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.Arrays;

/**
 * 对象复制类增强工具类
 *
 * @author 黄金宏
 * @since  jdk1.8
 */
public interface CopyUtils {

    /**
     * 获取空值字段
     *
     * @param source 对象
     * @return 空值字段数组
     */
    static String[] getNullPropertyNames(Object source) {
        BeanWrapperImpl src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        return Arrays.stream(pds)
                .filter(property -> null == src.getPropertyValue(property.getName()))
                .map(PropertyDescriptor::getName)
                .distinct()
                .toArray(String[]::new);
    }
}
