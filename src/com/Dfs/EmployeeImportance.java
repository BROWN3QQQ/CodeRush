package com.Dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @Classname EmployeeImportance
 * @Description TODO
 * @Date 2019/3/19 13:57
 * @Created by CQ
 * @LinkUrl ：https://leetcode-cn.com/problems/employee-importance/
 * 击败了20%的代码，说明这个代码是垃圾代码，我会回来重构
 */
public class EmployeeImportance {

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

    class Solution {
        int sum = 0;
        List<Employee> EMPloyees = new LinkedList<>();
        public int getImportance(List<Employee> employees, int id) {
            EMPloyees = employees;
            dfs(id);
            return sum;
        }
        public void dfs(int id){
           id = getindex(id);
            sum += EMPloyees.get(id -1).importance;
            if(EMPloyees.get(id -1).subordinates.size() == 0)
                return;

            for (int i = 0 ;i<EMPloyees.get(id -1).subordinates.size();i++)
                dfs(EMPloyees.get(id -1).subordinates.get(i));
        }
        public int getindex(int id){
            int index = 1;
            for (Employee e :EMPloyees){
                    if (e.id == id){
                        return index;
                    }
                    index++;
            }
            return index;
        }
    }
}
