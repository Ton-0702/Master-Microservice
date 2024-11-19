package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

//@MappedSuperclass hữu ích khi bạn muốn định nghĩa các thuộc tính chung (như id, createdAt, updatedAt)
// hoặc logic chung cho nhiều thực thể mà không cần lặp lại chúng ở mỗi lớp thực thể.
// được sử dụng để chỉ định rằng một lớp Java không phải là một thực thể
// nhưng có thể đóng vai trò như một lớp cơ sở (superclass) cho các thực thể khác.

@MappedSuperclass // mark class as a super class
@Getter
@Setter
@ToString // convert entity object to String format
public class BaseEntity {
    @Column(updatable = false) // mark column as not updatable
    private LocalDateTime createdAt;
    @Column(updatable = false)
    private String createdBy;
    @Column(insertable = false) // mark column as not insertable
    private LocalDateTime updatedAt;
    @Column(insertable = false)
    private String updatedBy;
}
