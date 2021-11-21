package org.cts.spring;

import lombok.*;

import java.util.List;
import java.util.Map;

/*@Getter
@Setter*/
public class Employee {
    private int id;
    private String name;
    private List<Integer> deptId;
    private Map<Integer,String> map;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getDeptId() {
        return deptId;
    }

    public void setDeptId(List<Integer> deptId) {
        this.deptId = deptId;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", map=" + map +
                '}';
    }
}
