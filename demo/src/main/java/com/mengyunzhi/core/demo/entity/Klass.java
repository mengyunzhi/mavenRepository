package com.mengyunzhi.core.demo.entity;

import com.mengyunzhi.core.annotation.query.EqualTo;
import com.mengyunzhi.core.annotation.query.Ignore;
import com.mengyunzhi.core.entity.YunzhiEntity;

import javax.persistence.*;

/**
 * @author panjie
 */
@Entity
public class Klass implements YunzhiEntity<Long> {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean deleted = false;

    private String name;        // 班级名称

    private Short totalStudentCount;    // 学生总数

    private Integer integerTest;        // 整形测试

    private Long longTest;              // 长整形测试

    @EqualTo
    private String address;

    @EqualTo("address")
    private String queryAddress;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    @Ignore           // 忽略查询条件
    private Teacher ignoreTeacher;

    @Override
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Short getTotalStudentCount() {
        return totalStudentCount;
    }

    public void setTotalStudentCount(Short totalStudentCount) {
        this.totalStudentCount = totalStudentCount;
    }

    public Integer getIntegerTest() {
        return integerTest;
    }

    public void setIntegerTest(Integer integerTest) {
        this.integerTest = integerTest;
    }

    public Long getLongTest() {
        return longTest;
    }

    public void setLongTest(Long longTest) {
        this.longTest = longTest;
    }

    public Teacher getIgnoreTeacher() {
        return ignoreTeacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQueryAddress() {
        return queryAddress;
    }

    public void setQueryAddress(String queryAddress) {
        this.queryAddress = queryAddress;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIgnoreTeacher(Teacher ignoreTeacher) {
        this.ignoreTeacher = ignoreTeacher;
    }
}
