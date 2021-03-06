package com.da.node;

import com.da.log.Log;
import com.da.executor.TaskExecutor;
import com.da.node.nodestatic.NodeGroup;
import com.da.rpc.RPCAdapter;
import com.da.scheduler.Scheduler;

/**
 * Node与各种service的关联类，例如在node中通过使用context.rpcAdapter来使用
 * 间接层类
 */
public class NodeContext {

    private NodeId selfId; // 当前节点ID
    private NodeGroup group; // 当前组的成员列表
    private Log log;

    private RPCAdapter rpcAdapter; // RPC组件
    private Scheduler scheduler; // 定时器组件
    private TaskExecutor taskExecutor; // 主线程存储器

    public NodeId selfId() {
        return selfId;
    }

    public void setSelfId(NodeId selfId) {
        this.selfId = selfId;
    }

    public TaskExecutor taskExecutor() {
        return taskExecutor;
    }

    public NodeGroup group() {
        return group;
    }

    public Scheduler scheduler() {
        return scheduler;
    }

    public RPCAdapter rpcAdapter() {
        return rpcAdapter;
    }

    public void setGroup(NodeGroup group) {
        this.group = group;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void setRPCAdapter(RPCAdapter rpcAdapter) {
        this.rpcAdapter = rpcAdapter;
    }

    public void setTaskExecutor(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public Log log() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

}
