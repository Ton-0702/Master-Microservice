package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

//@MappedSuperclass hữu ích khi bạn muốn định nghĩa các thuộc tính chung (như id, createdAt, updatedAt)
// hoặc logic chung cho nhiều thực thể mà không cần lặp lại chúng ở mỗi lớp thực thể.
// được sử dụng để chỉ định rằng một lớp Java không phải là một thực thể
// nhưng có thể đóng vai trò như một lớp cơ sở (superclass) cho các thực thể khác.

@MappedSuperclass // mark class as a super class
@EntityListeners(AuditingEntityListener.class) // used to automatically record the date and time of creation
@Getter
@Setter
@ToString // convert entity object to String format
public class BaseEntity {

    @CreatedDate // used to automatically record the date and time of creation
    @Column(updatable = false) // mark column as not updatable
    private LocalDateTime createdAt;

    @CreatedBy // Used to automatically record the user who created the entity but we don't know who created so we need write logic in package audit
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate // Used to automatically record the date and time of the last update
    @Column(insertable = false) // mark column as not insertable
    private LocalDateTime updatedAt;

    @LastModifiedBy // Used to automatically record the user who last updated the entity but we don't know who updated so we need write logic in package audit
    @Column(insertable = false)
    private String updatedBy;
}
