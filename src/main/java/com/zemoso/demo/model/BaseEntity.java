package com.zemoso.demo.model;

import com.zemoso.demo.utils.LocalDateTimeConverter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

@Data
@MappedSuperclass
public class BaseEntity {
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "created_tstamp", updatable = false)
    private LocalDateTime created;

    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "last_updated_tstamp")
    private LocalDateTime lastUpdated;


    public BaseEntity() {
        onCreate();
    }

    public BaseEntity(BaseEntity fromBaseEntity) {
        this.setCreated(fromBaseEntity.getCreated());
        this.setLastUpdated(fromBaseEntity.getLastUpdated());
    }

    @PrePersist
    public void onCreate() {
        created = now();
        lastUpdated = now();
    }

    @PreUpdate
    public void onUpdate() {
        lastUpdated = now();
    }

}
