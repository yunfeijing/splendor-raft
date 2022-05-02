
package com.da.entity;
import com.da.log.Entry;
import com.da.log.LogEntry;
import com.da.node.NodeId;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AppendEntriesRpc {

    /** 当前的任期号 **/
    private int term;

    /** 领导人ID */
    private NodeId leaderId;

    /** 紧邻新日志前的那个日志条目的索引 */
    private int prevLogIndex;

    /** 紧邻新日志前的那个日志条目的任期号 */
    private int prevLogTerm;

    /** 准备存储的日志条目（表示心跳时为空；可以一次性发送多个） */
    private List<Entry> entries;

    /** 领导人已经提交的日志的索引值  */
    private int leaderCommit;


    public void setTerm(int term) {
        this.term = term;
    }

    public void setLeaderId(NodeId leaderId) {
        this.leaderId = leaderId;
    }

    public void setPrevLogIndex(int prevLogIndex) {
        this.prevLogIndex = prevLogIndex;
    }

    public void setPrevLogTerm(int prevLogTerm) {
        this.prevLogTerm = prevLogTerm;
    }

    public void setLeaderCommit(int leaderCommit) {
        this.leaderCommit = leaderCommit;
    }
    
}
