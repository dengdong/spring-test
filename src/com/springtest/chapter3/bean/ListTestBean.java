package com.springtest.chapter3.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by dengdd on 2016/8/22.
 */
public class ListTestBean {

    private List<String> values;

    private Set<String> setValues;

    private String[] array;

    private String [][] array1;

    private Map<String ,String> maps;

    private Properties properties;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Set<String> getSetValues() {
        return setValues;
    }

    public void setSetValues(Set<String> setValues) {
        this.setValues = setValues;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[][] getArray1() {
        return array1;
    }

    public void setArray1(String[][] array1) {
        this.array1 = array1;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
