package com.kgisl.springcrudsample.Model;

import java.sql.Timestamp;
// import java.util.Date;

public interface Auditable {
    Timestamp getCreatedAt();
    void setCreatedAt(Timestamp createdAt);
    Timestamp getUpdatedAt();
    void setUpdatedAt(Timestamp updatedAt);
}
