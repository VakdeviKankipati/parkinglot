package org.example.models;

import java.util.Date;


public class BaseModel {
    private long id;
    private Date created_At;
    private Date Updated_At;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getUpdated_At() {
        return Updated_At;
    }

    public void setUpdated_At(Date updated_At) {
        Updated_At = updated_At;
    }
}
