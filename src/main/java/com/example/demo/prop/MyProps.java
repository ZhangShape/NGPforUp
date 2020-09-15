package com.example.demo.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

@ConfigurationProperties(prefix = "server")
@Component
public class MyProps {
    private String port;
    private String[] arrayProps;
    private List<Map<String,String>> listProps1=new ArrayList<>();
    private List<String> listProps2=new ArrayList<>();
    private Map<String,String> mapProps=new HashMap<>();



    //String类型的一定需要setter来接收属性值；maps, collections, 和 arrays 不需要
    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public List<Map<String, String>> getListProps1() {
        return listProps1;
    }
    public List<String> getListProps2() {
        return listProps2;
    }

    public String[] getArrayProps() {
        return arrayProps;
    }

    public void setArrayProps(String[] arrayProps) {
        this.arrayProps = arrayProps;
    }

    public Map<String, String> getMapProps() {
        return mapProps;
    }

    public void setMapProps(Map<String, String> mapProps) {
        this.mapProps = mapProps;
    }


    @Override
    public String toString() {
        return "MyProps{" +
                "port='" + port + '\'' +
                ", arrayProps=" + Arrays.toString(arrayProps) +
                ", listProps1=" + listProps1 +
                ", listProps2=" + listProps2 +
                ", mapProps=" + mapProps +
                '}';
    }
}
