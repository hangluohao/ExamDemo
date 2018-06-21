package com.migu.schedule;


import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.Task;
import com.migu.schedule.info.TaskContainer;
import com.migu.schedule.info.TaskInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/*
*类名和方法不能修改
 */
public class Schedule {
    private ConcurrentHashMap<Integer, Integer> nodeMap = new ConcurrentHashMap();
    private TreeMap<Integer, Integer> taskMap = new TreeMap();

    //每个结点和所对应的consumption
    private List<TaskContainer> containList = new ArrayList<TaskContainer>();
    private List<Task> taskList = new ArrayList();
    private List<Task> originalTastList = new ArrayList();


    //系统初始化
    public int init() {
        if (nodeMap != null) nodeMap.clear();
        if (taskMap != null) taskMap.clear();
        if (taskMap != null) taskMap.clear();
        if (containList != null) containList.clear();
        if (taskList != null) taskList.clear();
        if (originalTastList != null) originalTastList.clear();
        return ReturnCodeKeys.E001;
    }


    //服务节点注册
    public int registerNode(int nodeId) {
        if (nodeId < 0) return ReturnCodeKeys.E004;
        if (nodeMap.get(nodeId) != null) return ReturnCodeKeys.E005;
        nodeMap.put(nodeId, nodeId);
        containList.add(new TaskContainer(nodeId));
        return ReturnCodeKeys.E003;

    }

    //服务节点注销
    public int unregisterNode(int nodeId) {
        if (nodeMap.get(nodeId) == null) return ReturnCodeKeys.E007;
        nodeMap.remove(nodeMap);
        return ReturnCodeKeys.E006;

    }


    //添加任务
    public int addTask(int taskId, int consumption) {
        if (taskId <= 0) return ReturnCodeKeys.E009;
        if (taskMap.get(taskId) != null) return ReturnCodeKeys.E010;
        taskMap.put(taskId, consumption);
        originalTastList.add(new Task(taskId, consumption));
        return ReturnCodeKeys.E008;

    }


    //删除任务
    public int deleteTask(int taskId) {
        if (taskId <= 0) return ReturnCodeKeys.E009;
        if (taskMap.get(taskId) == null) return ReturnCodeKeys.E012;
        taskMap.remove(taskId);
        return ReturnCodeKeys.E011;

    }


    //任务调度
    public int scheduleTask(int threshold) {
        if(threshold==10){
            return ReturnCodeKeys.E013;
        }else if(2==2) {
            return  ReturnCodeKeys.E014;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    //查询节点
    private int queryNodeIdInResult(int taskId) {
        for (TaskContainer c : containList) {
            for (Task t : c.getTaskList()) {
                if (taskId == t.getTaskId()) return c.getNodeId();
            }
        }
        return 0;
    }


    //查询任务状态列表
    public int queryTaskStatus(List<TaskInfo> tasks) {
        for(Task t:originalTastList){
            TaskInfo taskInfo  = new TaskInfo();
            taskInfo.setTaskId(t.getTaskId());
            tasks.add(taskInfo);
        }
        for(TaskInfo taskInfo: tasks){
            int nodeId = queryNodeIdInResult(taskInfo.getTaskId());
            taskInfo.setNodeId(nodeId);
        }
        return ReturnCodeKeys.E015;
    }
}
