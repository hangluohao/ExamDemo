package com.migu.schedule.info;

import java.util.ArrayList;
import java.util.List;

public class TaskContainer {
	private int theId;
	private Integer allX = 0;
	private int taskNum = 0;
	private Integer allNOSum = 0;
	private List<Tasktest> taskList = new ArrayList<Tasktest>();

	public TaskContainer(int theId) {
		this.theId = theId;
	}

	public int getNodeId() {
		return theId;
	}

	public void setNodeId(int theId) {
		this.theId = theId;
	}

	public Integer getTotalConsumption() {
		return allX;
	}

	public void setTotalConsumption(Integer allX) {
		this.allX = allX;
	}

	public int getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(int taskNum) {
		this.taskNum = taskNum;
	}

	public void addToContainer(Tasktest t) {
		taskList.add(t);
		taskNum++;
		allNOSum += t.getTaskId();
		allX += t.getConsumption();
	}

	public Integer getTaskNOSum() {
		return allNOSum;
	}

	public void setTaskNOSum(Integer allNOSum) {
		this.allNOSum = allNOSum;
	}

	public List<Tasktest> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Tasktest> taskList) {
		this.taskList = taskList;
	}
}