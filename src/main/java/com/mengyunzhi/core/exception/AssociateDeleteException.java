package com.mengyunzhi.core.exception;

/**
 * @author panjie
 * 关联删除异常
 */
public class AssociateDeleteException extends RuntimeException {
    public AssociateDeleteException(String message) {
        super(message);
    }
}