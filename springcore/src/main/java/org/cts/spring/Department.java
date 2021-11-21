package org.cts.spring;

import java.util.List;

public class Department {
    private List<Employee> list;

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Department{" +
                "list=" + list +
                '}';
    }
}
