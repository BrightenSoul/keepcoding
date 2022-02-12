package com.mnn.keepcoding.domain;

import com.mnn.keepcoding.enums.SexEnum;
import org.apache.ibatis.type.Alias;

/**
 * 用户实体类
 *
 * @author MaNing on 2022/2/9
 */
@Alias(value = "user")// MyBatis指定别名
public class User {

    private Long id = null;

    private String userName = null;

    private String note = null;

    // 枚举，此处采用 typeHandler 进行转换
    private SexEnum sex = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
