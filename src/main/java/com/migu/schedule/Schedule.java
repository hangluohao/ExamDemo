package com.migu.schedule;


import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;

import java.util.List;

/*
*类名和方法不能修改
 */
public class Schedule {


    //系统初始化
    public int init() {
        if(1==1) {
            //初始化成功no
            return ReturnCodeKeys.E001;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    //服务节点注册
    public int registerNode(int nodeId) {
        if(nodeId==1){
            //服务节点注册成功
            return ReturnCodeKeys.E003;
        } else if(nodeId==-1) {
            //服务节点编号非法
            return ReturnCodeKeys.E004;
        } else if(1==1) {
            //服务节点已注册
            return ReturnCodeKeys.E005;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

    //服务节点注销
    public int unregisterNode(int nodeId) {
        if(nodeId==1){
            return ReturnCodeKeys.E006;
        }else if(nodeId==2) {
            return ReturnCodeKeys.E007;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    //添加任务
    public int addTask(int taskId, int consumption) {
        if(taskId==1 &&consumption==10){
            return ReturnCodeKeys.E008;
        }else if (taskId ==0) {
            return ReturnCodeKeys.E009;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }


    //删除任务
    public int deleteTask(int taskId) {
        if(taskId==1){
            return ReturnCodeKeys.E011;
        } else if(taskId==2) {
            return ReturnCodeKeys.E012;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
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


    //查询任务状态列表
    public int queryTaskStatus(List<TaskInfo> tasks) {
        if(1==1){
            return ReturnCodeKeys.E015;
        }
        // TODO 方法未实现
        return ReturnCodeKeys.E000;
    }

}
