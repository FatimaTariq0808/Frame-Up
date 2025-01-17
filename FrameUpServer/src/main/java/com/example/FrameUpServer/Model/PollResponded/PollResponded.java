package com.example.FrameUpServer.Model.PollResponded;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PollResponded {
    @Id
    int pollId;
    String rollNo;

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "PollResponded{" +
                "pollId=" + pollId +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
